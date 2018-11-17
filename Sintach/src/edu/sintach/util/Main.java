package edu.sintach.util;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println();
		String icao = "";
		
		while(icao.isEmpty() || icao.length() < 4 || icao.length() >= 5){
			System.out.println("Please enter ICAO Code: ");
		
			icao = keyboard.next().toUpperCase();
		}
		
		keyboard.close();
				
		String localPath = "/home/mlieb/metar_loader/";
		String localFile = icao + ".txt";
		String link = "ftp://tgftp.nws.noaa.gov/data/observations/metar/stations/";
					
		new Runner(icao, localPath, localFile, link);
		
		System.out.println();
		System.out.println("Ready!");
	}

}
