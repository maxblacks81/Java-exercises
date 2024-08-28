package com.edu.java;

import java.util.ArrayList;
import java.util.Collections;

public class FolderNameSorterDemo {

	public static void main(String[] args) {

		ArrayList<String> foldersName = new ArrayList<>();
		
		foldersName.add("dir10");
		foldersName.add("dir101");
		foldersName.add("dir11");
		foldersName.add("dir12");
		foldersName.add("dir102");
		foldersName.add("dir20");
		foldersName.add("dir1");
		foldersName.add("dir301");
		foldersName.add("dir303");
		
		for(String s:foldersName) {
			System.out.println(s);			
		}
		
		System.out.println();
		
		Collections.sort(foldersName, new FolderNameComparator());
		
		for(String s:foldersName) {
			System.out.println(s);			
		}
	}

}
