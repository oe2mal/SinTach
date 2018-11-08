package edu.sintach.util;

public class Runner {
	
	private String icao;
	private String file;
	private String link;
	private String urlLink;
	
	/*
	public static void main(String[] args) {
			
		String icao = "LOWS";
			
		String file = icao + ".txt";
			
		String link = "ftp://tgftp.nws.noaa.gov/data/observations/metar/stations/";
			
		String urlLink = link + ICAO + ".TXT";
			
		Downloader dl = new Downloader();
		TextFileReader tfr = new TextFileReader();
			
		dl.loader(urlLink, file);
		tfr.textreader(file);
						

	}
	*/
	
	public Runner(String icao){
		
		icao = this.icao;
		file = icao + ".txt";
		link = "ftp://tgftp.nws.noaa.gov/data/observations/metar/stations/";
		urlLink = link + icao + ".TXT";
		
		Downloader dl = new Downloader();
		TextFileReader tfr = new TextFileReader();
			
		dl.loader(urlLink, file);
		tfr.textreader(file);
					
	}

}
