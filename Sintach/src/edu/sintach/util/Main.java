package edu.sintach.util;

public class Main {

	public static void main(String[] args) {
		
		String icao = "LOWS";
		String localPath = "/home/mlieb/metar_loader/";
		String localFile = icao + ".txt";
		String link = "ftp://tgftp.nws.noaa.gov/data/observations/metar/stations/";
		
		
		new Runner(icao, localPath, localFile, link);
	}

}
