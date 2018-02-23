package com.br.extractor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Extractor {

	public static void main(String[] args) throws IOException {
		
		/*URL url;
		InputStream is = null;
		BufferedReader br;
		String line;
		
		//URL url2 = new URL("http://www.puzzlers.org/pub/wordlists/pocket.txt");
		URL url2 = new URL("https://swgoh.gg/u/ishbarion/mods/?page=1");
		Scanner s = new Scanner(url2.openStream());
		
		

		try {
			url = new URL("https://swgoh.gg/u/ishbarion/mods/?page=1");
			is = url.openStream(); // throws an IOException
			br = new BufferedReader(new InputStreamReader(is));

			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (MalformedURLException mue) {
			mue.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				if (is != null)
					is.close();
			} catch (IOException ioe) {
				// nothing to see here
			}
		}*/
		
		URL oracle = new URL("http://yoursite.com/yourfile.txt");
	    BufferedReader in = new BufferedReader(
	    new InputStreamReader(oracle.openStream()));

	    String inputLine;
	    while ((inputLine = in.readLine()) != null)
	        System.out.println(inputLine);
	    in.close();

	}

}
