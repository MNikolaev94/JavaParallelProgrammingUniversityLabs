package ru.spbstu.telematics.java.lab1;
import java.io.File;
public class LS {
	void printLs(String path) throws NullPointerException{
			File[] folderEntries = new File(path).listFiles();
			for (File f : folderEntries){
				if(f.getName().getBytes()[0]!='.')
				System.out.println(f);
			}
	}

}
