package net.ukr.shonen;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fileOne = new File("a.txt");
		
		try {
			fileOne.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File folderOne = new File ("AAA");
		folderOne.mkdirs();
		
		File fileTwo = new File (folderOne,"c.txt");
		try {
			fileTwo.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		fileOne.delete();
//		
//		fileTwo.delete();
//		
//		folderOne.delete();
		
		File workFolder = new File(".");
		File[] files = workFolder.listFiles();
		for(int i=0;i<files.length;i++){
			System.out.println(files[i]);
		}

	}

}
