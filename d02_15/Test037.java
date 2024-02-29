package com.company.d02_15;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class Test037 {
//	[SELFTEST037]  file reader + writer
//	 * 1. 네트워크통신을이용하여 다음값을 읽어들이시오.  
//    https://developers.naver.com/docs/serviceapi/search/book/book.md#%EC%B1%85
//    
//    
//	  "https://openapi.naver.com/v1/search/book.xml?query=%EC%A3%BC%EC%8B%9D&amp;display=10&amp;start=1" \
//	    -H "X-Naver-Client-Id: {애플리케이션 등록 시 발급받은 클라이언트 아이디 값}" \
//	    -H "X-Naver-Client-Secret: {애플리케이션 등록 시 발급받은 클라이언트 시크릿 값}" -v
//	 		 
//	 String clientId = "EOFuDeaNsdShnXlGBtSp";
//	 String clientSecret = "egWxUJFcCC";
	public static void main(String[] args) {
		String ClientId = "73tQkkNwrPZeVpGJbkbL";
		String ClientSecret = "_vVUwII8jz";
		String urlPath = "https://openapi.naver.com/v1/search/book.xml";
		String result = "";
		try {
			urlPath += "?query=" + URLEncoder.encode("주식", "UTF-8");
			URL url = new URL(urlPath);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();

			conn.setRequestMethod("GET");
			conn.addRequestProperty("X-Naver-Client-Id", ClientId);
			conn.addRequestProperty("X-Naver-Client-Secret", ClientSecret);

			if (conn.getResponseCode() == 200) {
				BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
				StringBuffer sb = new StringBuffer();
				String line;
				while ((line = br.readLine()) != null) {
					sb.append(line + "\n");
				}
				br.close();
				result = sb.toString();
			}
			conn.disconnect();
			System.out.println(result);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
