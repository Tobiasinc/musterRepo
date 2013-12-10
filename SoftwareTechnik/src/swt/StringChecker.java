/*
 * --------------------------------------------------------------------------
 * 
 * Copyright (c) 2008 by Projektgruppe SWT, Fachhochschule Gieﬂen-Friedberg.
 * 
 * All rights reserved.
 * 
 * --------------------------------------------------------------------------
 * 
 * Historie:
 * 
 * 2008-07-16 erste Fassung
 * 
 * --------------------------------------------------------------------------
 */
package swt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StringChecker {

	static Strategie strat;

	public static void main(String[] args) {
		// Zahl der Argumente okay?
		if (args.length != 1) {
			System.err
					.println("StringChecker sucht nach einem Suchmuster in einer Textdatei.");
			System.err.println("Aufruf durch: StringChecker dateiname");
			return;
		}
		setStrategie(new Palindrom());
		try {
			FileReader fr = new FileReader(args[0]);
			BufferedReader br = new BufferedReader(fr);
			String zeile;
			while((zeile=br.readLine()) != null) {
				System.out.println(strat.execute(zeile));
			}
			br.close();
		} catch (IOException e) {
			System.out.println("Fehler beim ÷ffnen oder Auslesen der Datei");
			e.printStackTrace();
		}
	}

	/*
	 * public static void main(String[] args) { setStrategie(new AWoerter());
	 * System.out.println(strat.execute(""));
	 * System.out.println(strat.execute("Hallo Welt"));
	 * System.out.println(strat.execute("Dieser Text ist ein Test"));
	 * System.out.println(strat.execute("Acht Ameisen arbeiten am abent"));
	 * 
	 * setStrategie(new Palindrom());
	 * System.out.println(strat.execute("Anna geht nach Hause"));
	 * System.out.println(strat.execute("Erika feuert nur untreue Fakire"));
	 * System
	 * .out.println(strat.execute("Ein Neger mit Gazelle zagt im Regen nie"));
	 * System.out.println(strat.execute("")); }
	 */

	public static void setStrategie(Strategie strate) {
		strat = strate;
	}
}
