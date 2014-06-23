package com.ericb.bedeadmin.client.ui.album;

import java.util.Date;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import com.ericb.bedeadmin.model.Album;
import com.ericb.bedeadmin.model.Editeur;
import com.ericb.bedeadmin.server.dao.DBAction;

public class AlbumTableModel extends AbstractTableModel {

	private List<Album> albums;

	public AlbumTableModel(List<Album> albums) {
		super();
		this.albums = albums;
	}

	@Override
	public int getRowCount() {
		return (this.albums!=null)?this.albums.size():0;
	}

	@Override
	public int getColumnCount() {
		return 6;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Album album = albums.get(rowIndex);
		switch (columnIndex) {
		case 1:
			return album.getTitreCompletHtml();
		case 2:
			return (Boolean) album.isPremiereEdition();
		case 3:
			return (Boolean) album.isPossede();
		case 4:
			return album.getDepotLegal();
		case 5:
			return album.getEditeur();
		case 0:
			return album.getDbAction();
		default:
			return null;
		}
	}

	@Override
	public String getColumnName(int columnIndex) {
		switch (columnIndex) {
		case 1:
			return this.albums.size() + " albums";
		case 2:
			return "EO";
		case 3:
			return "My";
		case 4:
			return "DL";
		case 5:
			return "Editeur";
		default:
			return null;
		}
	}

	@Override
	public Class<?> getColumnClass(int columnIndex) {
		switch (columnIndex) {
		case 1:
			return String.class;
		case 2:
			return Boolean.class;
		case 3:
			return Boolean.class;
		case 4:
			return Date.class;
		case 5:
			return Editeur.class;
		case 0:
			return DBAction.class;
		default:
			return null;
		}	
		
	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		super.setValueAt(aValue, rowIndex, columnIndex);
	}

	public boolean isEmpty() {
		return albums.isEmpty();
	}

	public boolean add(Album e) {
		return albums.add(e);
	}

	public boolean remove(Object o) {
		return albums.remove(o);
	}

	public Album remove(int index) {
		return albums.remove(index);
	}

	public int indexOf(Object o) {
		return albums.indexOf(o);
	}
	
	
	
	

}
