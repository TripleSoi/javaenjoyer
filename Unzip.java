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
		 	
	    	// 1.0 Create output directory
	    	File outputDirectory = new File(outputPath);
	    	
	    	if(outputDirectory.exists())
	    		outputDirectory.delete();
	    		
	    	outputDirectory.mkdir();
ergompprepokjggroigejweiourghniopuwhenr
	\wR
	gHEth
	reTH
ryjtryjtyj
	    	

	    	// 2.0 Unzip (create folders & copy files)
	    	try {

	    		// 2.1 Get zip input stream
	    		ZipInputStream zip = new ZipInputStream(new FileInputStream(zipFile));
				
				ZipEntry entry = null;
				int len;
				byte[] buffer = new byte[1024];
				
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
