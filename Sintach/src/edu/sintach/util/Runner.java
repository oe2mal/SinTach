package edu.sintach.util;

public class Runner {
	
	public static void main(String[] args) {
			
		String ICAO = "LOWS";
			
		String file = ICAO + ".txt";
			
		String link = "ftp://tgftp.nws.noaa.gov/data/observations/metar/stations/";
			
		String urlLink = link + ICAO + ".TXT";
			
		Downloader dl = new Downloader();
		TextFileReader tfr = new TextFileReader();
			
		dl.loader(urlLink, file);
		tfr.textreader(file);
						

	}

}
