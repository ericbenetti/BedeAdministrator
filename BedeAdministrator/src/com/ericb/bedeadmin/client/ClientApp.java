package com.ericb.bedeadmin.client;

import java.awt.EventQueue;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.ericb.bedeadmin.client.ui.album.LFAlbums;
import com.ericb.bedeadmin.client.ui.album.LFAlbumsControler;
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

		//SubstanceLookAndFeel.setSkin(new GraphiteSkin());
		//SubstanceLookAndFeel.setSkin(new BusinessSkin());
		//SubstanceLookAndFeel.setSkin(new GeminiSkin());
		try {
            // select Look and Feel
            Properties props = com.jtattoo.plaf.fast.FastLookAndFeel.getThemeProperties("Blue-Large-Font");
            props.put("centerWindowTitle", "on");
            props.put("textAntiAliasing", "on");
            com.jtattoo.plaf.fast.FastLookAndFeel.setCurrentTheme(props);
            
            UIManager.setLookAndFeel("com.jtattoo.plaf.fast.FastLookAndFeel");
			//UIManager.setLookAndFveel(new SubstanceGraphiteGlassLookAndFeel());
			//UIManager.setLookAndFeel(new SubstanceBusinessLookAndFeel());
			//UIManager.setLookAndFeel(new SubstanceGeminiLookAndFeel());
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//LFSerieControler.getInstance().show();
					LFAlbumsControler.getInstance().show();
//					(new LFAlbums(null)).setVisible(true);
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
