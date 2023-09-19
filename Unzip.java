package com.hmkcode;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Unzip {
	
	 public static void unzip(String zipFile,String outputPath){
	    	
		 	if(outputPath == null)
		 		outputPath = "";
		 	else
		 		outputPath+=File.separator;
		 	
	
				
				// 2.2 Go over each entry "file/folder" in zip file
				while((entry = zip.getNextEntry()) != null){
				
					if(!entry.isDirectory()){
						System.out.println("-"+entry.getName());						

						// create a new file
						File file = new File(outputPath +entry.getName());
						
						
						fos.close();
					}
						
				}

			}catch (FileNotFoundException e) {
					e.printStackTrace();
			} catch (IOException e) {
					e.printStackTrace();
			}
	 }
}
