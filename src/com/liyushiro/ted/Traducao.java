package com.liyushiro.ted;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Traducao {

	
	//private final String SPACE = " ";
	
	public  void readFile(String fileName, String fileName2) throws IOException  {

		BufferedReader eng = new BufferedReader(new FileReader( new File(fileName)));
		BufferedReader br = new BufferedReader(new FileReader( new File(fileName2)));
		FileWriter arquivo = new FileWriter(new File("../Ted/file/textoduplo.txt")); 
		//String text = br.readLine();
		
		String linha,linha2; 
		while(((linha = eng.readLine()) != null)&&((linha2 = br.readLine()) != null)) { 
			
			if(linha.equals(linha2)){
				arquivo.write(linha); 
				arquivo.write("\n");	
				
			}else
			{
				arquivo.write(linha); 
				arquivo.write("\n");
				arquivo.write(linha2); 
				arquivo.write("\n");
				
			}
			
            
		} 
		arquivo.close(); 
		
	    
       
         
             
            
		
	}
/*
	public int contaNumeroLinhasFalado(String fileName) throws IOException {

		String[] words = readFile(fileName);

		int total = 0;

		for (String word : words) {

			System.out.println(word);
			total++;
		}

		return total;
	}
	
	*/

	
}
