package com.rays.io;

import java.io.File;
import java.util.Date;

public class FileInfo {
	public static void main(String[] args)throws Exception {
		
		File f = new File ("C:\\Users\\mksuy\\Desktop\\io\\keyboard.txt");
		
		if (f.exists()) {
			
			System.out.println("name:"+ f.getName());
			System.out.println("path:"+ f.getAbsolutePath());
			System.out.println("Access permision");
			System.out.println("writable:"+ f.canWrite());
			System.out.println("Readable:"+ f.canRead());
			System.out.println("is File:"+ f.isFile());
			System.out.println("is Dir:"+f.isDirectory());
			
			Date d = new Date(f.lastModified());
			System.out.println("Date Modified:"+ d);
			
			long length = f.length();
			System.out.println("Length:"+length + "bytes");
			
		}else {
			System.out.println("File dose not exist");
		}
		
		
	}

}
