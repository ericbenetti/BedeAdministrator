package com.ericb.bedeadmin.model;

public enum FormatAlbum {
	FORMAT_NORMAL(1),
	GRAND_FORMAT(2);
	
	private int value;

	private FormatAlbum(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		switch (this) {
		case FORMAT_NORMAL:
			return "Fromat normal";
		case GRAND_FORMAT:
			return "Grand format";
		default:
			return "";
		}
	}	

}
