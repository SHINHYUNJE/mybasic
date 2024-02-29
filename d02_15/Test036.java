package com.company.d02_15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Test036 {
//	[SELFTEST036]  file reader + writer
//	 * 1. C:\\file\\에 금일 파일만들기   금일날짜이름으로자동.txt
//	 * 2. 금일날짜이름으로자동.txt  APPLE, BANANA, COCONUT 입력하기
//	 * 3. 금일날짜이름으로자동.txt 읽어와서 콘솔창에 띄우기		
	public static void main(String[] args) throws IOException {
		String folder_path = "src\\com\\company\\d02_15\\";
		String file_path = "test036.txt";

		File folder = new File(folder_path);
		File file = new File(folder_path + file_path);

		// #1. 폴더 / 파일 준비
		try {
			if (!folder.exists()) {
				folder.mkdir();
				System.out.println("폴더생성");
			}
			if (!file.exists()) {
				file.createNewFile();
				System.out.println("파일생성");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		String[] datas = { "APPLE", "BANANA", "COCONUT" };

		for (int i = 0; i < datas.length; i++) {
			OutputStream outputStream = new FileOutputStream(file, true);
			byte[] byteArr = datas[i].getBytes();
			outputStream.write(byteArr);
			outputStream.write('\n');
			outputStream.flush();
			outputStream.close();
		}
		
		InputStream is = new FileInputStream(file);
		byte[] arr = is.readAllBytes();
		String str = new String(arr, 0, arr.length);
		is.close();
		System.out.println(str);
	}
}
