package com.ericb.bedeadmin.client;

import java.awt.EventQueue;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import org.pushingpixels.substance.api.SubstanceLookAndFeel;
import org.pushingpixels.substance.api.skin.GraphiteSkin;
import org.pushingpixels.substance.api.skin.SubstanceGraphiteGlassLookAndFeel;

import com.ericb.bedeadmin.client.ui.serie.LFSerieControler;

public class ClientApp {

	public static Properties STATIC_PROPERTIES = null;
	private static String configFileName;

	
	public static void main(String[] args)  {
		
		parseArgs(args);

		//Chargement de la configuration
		STATIC_PROPERTIES = new Properties();
		try {
			STATIC_PROPERTIES.load(new FileInputStream(new File(configFileName)));
		} catch (Exception e) {
			e.printStackTrace();
		}

		SubstanceLookAndFeel.setSkin(new GraphiteSkin());
		//SubstanceLookAndFeel.setSkin(new BusinessSkin());
		//SubstanceLookAndFeel.setSkin(new GeminiSkin());
		try {
			UIManager.setLookAndFeel(new SubstanceGraphiteGlassLookAndFeel());
			//UIManager.setLookAndFeel(new SubstanceBusinessLookAndFeel());
			//UIManager.setLookAndFeel(new SubstanceGeminiLookAndFeel());
		} catch (UnsupportedLookAndFeelException e1) {
			e1.printStackTrace();
		}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LFSerieControler.getInstance().show();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	private static void parseArgs(String[] args) {
		for (int i = 0; i < args.length; i++) {
			if ("--config-file".equals(args[i])) {
				configFileName = args[++i];
			}			
		}
	}	
}
