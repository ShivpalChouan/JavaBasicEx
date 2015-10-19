package com.core.java8.lang.methodRef;

import java.io.File;
import java.io.FileFilter;


public class FileExampleWithMethodRef {

	public static void main(String[] args) {

		// in Java 7

		File[] hiddenFile = new File("C:/shivpal/javaex")
				.listFiles(new FileFilter() {
					@Override
					public boolean accept(File file) {
						return file.isHidden();
					}
				});

		pritFile(hiddenFile);

		System.out.println("-----------------------");
		// by Method Reference

		hiddenFile = new File("C:/shivpal/javaex").listFiles(File::isHidden);
		pritFile(hiddenFile);

	}

	private static void pritFile(File[] fileList) {
		for (File f : fileList)
			System.out.println(f.getName());
	}

}
