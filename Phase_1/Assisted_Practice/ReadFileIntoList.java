package com.mycompany.eb.FileHandlingMech;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;

public class ReadFileIntoList {
	public static List<String> readFileInList(String fileName) 
	  { 
	  
	    List<String> lines = Collections.emptyList(); 
	    try
	    { 
	      lines = 
	       Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8); 
	    } 
	  
	    catch (IOException e) 
	    { 
	      e.printStackTrace(); 
	    } 
	    return lines; 
	  } 


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    List l = readFileInList("c://temp//testFile2.txt"); 
	  
	    Iterator<String> itr = l.iterator(); 
	    while (itr.hasNext()) 
	      System.out.println(itr.next()); 

		

	}

}
