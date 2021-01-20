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

	public static void searchFile(String filePath, File directoryPath) {
		File searchFile = new File(directoryPath + "\\" + filePath);
		if(searchFile.exists() && !searchFile.isDirectory()) {
			System.out.println("File is found at the root directory");							
		} else {
			System.out.println("No file found at the root directory, please check the filename");							
		}
	}

}
