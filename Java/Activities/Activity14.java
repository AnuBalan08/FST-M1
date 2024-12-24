package day4;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Activity14 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File("C:\\Users\\AnuBalan\\OneDrive - IBM\\Desktop\\Javapractice\\info.text");
		boolean fStatus = file.createNewFile();
		if(!file.exists()) {
			if(fStatus) {
				System.out.println("File created");
			}else {
				System.out.println("File Not Created");
			}
		}else {
			System.out.println("File Already Exists");
		}
		
		File fileUtil = FileUtils.getFile("C:\\Users\\AnuBalan\\OneDrive - IBM\\Desktop\\Javapractice\\info.text");
		FileUtils.write(file, "Hello World!" , "UTF-8");
		System.out.println("Data in File " + FileUtils.readFileToString(fileUtil, "UTF-8"));
		
		File destDir = new File("C:\\Users\\AnuBalan\\OneDrive - IBM\\Desktop\\Maruti Proj");
		FileUtils.copyFileToDirectory(file, destDir);
		
		File newFile = FileUtils.getFile(destDir, "info.text");
		String newFileData = FileUtils.readFileToString(newFile, "UTF-8");
		System.out.println(newFileData);
		

	}

}
