package edu.sintach.util;

public class Runner {
	
	private String icao;
	private String localFile;
	private String link;
	private String urlLink;
	private String localPath;
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
	
	public Runner(String icao, String localPath, String localFile, String link){
		
		localFile = icao + ".txt";
		urlLink = link + icao + ".TXT";
		
		Downloader dl = new Downloader();
		TextFileReader tfr = new TextFileReader();
			
		dl.loader(urlLink, localPath, localFile);
		
		tfr.textreader(localPath + localFile);
					
	}

}
