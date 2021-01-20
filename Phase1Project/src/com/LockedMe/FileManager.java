package com.LockedMe;

import java.util.Scanner;
import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.io.File;

public class FileManager {

	public static void main(String[] args) {
		String menuSelection;
		String fileSelection;
		Scanner s = new Scanner(System.in);       			
		String rootDirectory = "C:\\Users\\joyce\\Documents\\Project1\\";
        File directoryPath = new File(rootDirectory);

        Menus.welcomeScreen();

		do  {
			Menus.mainmenuScreen();			
			menuSelection = s.nextLine();
			
			switch(menuSelection) {
			case "1":
			      //List of all files and directories
			      String contents[] = directoryPath.list();
			      for(int i=0; i<contents.length; i++) {
			         System.out.println(contents[i]);
			      }
				break;
			case "2":
				do  {
					Menus.submenuScreen();
					menuSelection = s.nextLine();
					
					switch(menuSelection) {
					case "1":
						System.out.println("Please specify your file you would like to add by specifying the full path and file name:");
						fileSelection = s.nextLine();
						FilesWork.copyFile(fileSelection, directoryPath);
						break;		
					case "2":
						System.out.println("Please specify the file you would like to delete:");
						fileSelection = s.nextLine();
						FilesWork.deleteFile(fileSelection, directoryPath);
						break;		
					case "3":
						//search for a file, user needs to specify a file and you will search the folder for the file using case sensitive
						System.out.println("Please specify the file you would like to search for:");
						fileSelection = s.nextLine();
						FilesWork.searchFile(fileSelection, directoryPath);
						break;		
					case "4": {
						break;
					}
					default:
						System.out.println("A valid operation was not specified");
						break;		
				   	} //end switch
				} while(menuSelection.equals("4")==false);
				
				System.out.println("You are exiting the submenu and returning to the main system menu");
				break;		
			case "3":
				System.out.println("The system has exited.");
				System.exit(0);
				break;		
			default:
				System.out.println("A valid operation was not specified");
				break;		
		   	} //end switch
		} while(menuSelection.equals("3")==false);
		
		s.close();
	}
	
}

