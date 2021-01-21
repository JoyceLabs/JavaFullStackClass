package com.LockedMe;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FilesWork {

	public static void deleteFile(String filePath, File directoryPath) {
		
		Path path = Paths.get(directoryPath + "\\" + filePath);
		try {
			Files.delete(path);
			System.out.println("File deleted!");
		} catch (NoSuchFileException exce) {
			System.out.println("There is no file!!");
		} catch (DirectoryNotEmptyException directoryNotEmptyException) {
			directoryNotEmptyException.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}

	public static void copyFile(String filePath, File directoryPath) {
		File myFile = new File(filePath);

		if(myFile.exists() && !myFile.isDirectory()) {
			try {
				Files.copy(myFile.toPath(),(new File(directoryPath + "\\" + myFile.getName())).toPath(), StandardCopyOption.REPLACE_EXISTING);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("No file found at your location, please check the path and filename");							
		}
	}

	public static boolean searchFile(String filePath, File directoryPath) {
		File searchFile = new File(directoryPath + "\\" + filePath);
		String foundFileName = null;
		
		if(searchFile.exists() && !searchFile.isDirectory()) {
				try { 
					foundFileName = searchFile.getCanonicalFile().getName();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				if(foundFileName.equals(filePath)) { 
					System.out.println("The file specified is found in the root folder.");	
					return true;
				}else {
					System.out.println("The file you specified does not match the case found in the root folder");				
					return false;
				}
		} else {
			System.out.println("No file found at the root directory, please check the filename");							
			return false;
		}
		
	}

}
