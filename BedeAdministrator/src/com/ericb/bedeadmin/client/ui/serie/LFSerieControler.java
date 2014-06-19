package com.ericb.bedeadmin.client.ui.serie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import com.ericb.bedeadmin.model.Album;
import com.ericb.bedeadmin.model.Serie;
import com.ericb.bedeadmin.server.BedeAdministrator;

public class LFSerieControler implements ActionListener, ListSelectionListener {

	static final public String EXIT_APPLICATION = "exit";
	static final public String SAVE_TO_DATABASE = "commit";
	static final public String ADD_SERIE = "add_serie";
	static final public String DELETE_SERIE = "delete_serie";
	static final public String UPDATE_SERIE = "edit_serie";
	static final public String PREVIOUS_SERIE = "previous_serie";
	static final public String NEXT_SERIE = "next_serie";

	private LFSerie view;
	private DefaultListModel modelList;		//model for the list of series
	private DefaultListModel modelSubList;	//model for the list of albums in detail of serie.
	private List<Serie> series;
	private int tauxSerieComplete; 
	private static LFSerieControler instance ;

	public LFSerieControler() {
		modelList = new DefaultListModel<Serie>();
		modelSubList = new DefaultListModel<Album>();
		series = BedeAdministrator.getInstance().getListeSerie();

		int possedes=0;
		for (Serie serie : series) {
			modelList.addElement(serie);
			possedes += (serie.estSerieComplete()?1:0);
		}
		
		tauxSerieComplete = (int)(((double) possedes / (double) series.size()) * 100);

	}
	
	public static LFSerieControler getInstance() {
		if (instance == null) {
			instance = new LFSerieControler();
		}
		return instance;	
	}	
	
	public void show() {
		view = new LFSerie(this, modelList, null, modelSubList);
		view.getProgressBar().setValue(tauxSerieComplete);
		view.setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().getClass().equals(JButton.class)) {
			switch (((JButton) e.getSource()).getActionCommand()) {
			case EXIT_APPLICATION:
				BedeAdministrator.getInstance().closeDatabaseConnection();
				System.exit(1);
				break;

			default:
				break;
			}
		}		
	}
	
	@Override
	public void valueChanged(ListSelectionEvent e) {
		if (e.getSource().equals(view.getListeSerie())) {
			refreshSerieView(view.getListeSerie().getSelectedValue());
		} else if (e.getSource().equals(view.getListeAlbum())) {
			refreshAlbumView(view.getListeAlbum().getSelectedValue());
		}			
	}
	
	private void refreshAlbumView(Album selectedValue) {
		Album album = selectedValue;
		view.getViewAlbum().setAlbum(album);
	}

	private void refreshSerieView(Serie selectedValue) {
		Serie serie = selectedValue;
		view.getViewSerie().setSerie(serie);
		
		modelSubList.clear();
		for (Album a: serie.getAlbums()) {		
			modelSubList.addElement(a);
		}

		int visibleRowCount = (serie.getAlbums().size() / 5) +1;
		view.getListeAlbum().setVisibleRowCount(visibleRowCount);
		view.getListeAlbum().updateUI();
		
	}
	
	
	
	
	
	

}
