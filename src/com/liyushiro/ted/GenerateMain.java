package com.liyushiro.ted;

import java.io.IOException;



public class GenerateMain {
	
	public static void main(String[] args) {

		Traducao traducao = new Traducao();
		
		final String fileName = "../Ted/file/1208-eng.srt";
		final String fileName2 = "../Ted/file/1208-por_br.srt";
		

			try {
					traducao.readFile(fileName,fileName2);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
	

	}	

}
