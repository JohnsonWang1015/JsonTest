package com.sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Iterator;

import com.entity.Mask;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class MainClass {

	public static void main(String[] args) {
		
		// vaccineHospital.json
		try(InputStream is = new FileInputStream("./mask.json");
				Reader reader = new InputStreamReader(is, "UTF-8")) {
			
			StringBuilder builder = new StringBuilder();
			
			char[] step = new char[Short.MAX_VALUE];
			int length = -1;
			
			while((length = reader.read(step)) > 0) {
				builder.append(step, 0, length);
			}
			
			String content = builder.toString();
			
			GsonBuilder build = new GsonBuilder();
			build.setPrettyPrinting();
			Gson gson = build.create();
			
			JsonParser parser = new JsonParser();
			JsonElement element = parser.parse(content);
			
			JsonArray jsonArr = null;
			if(element.isJsonArray()) {
				jsonArr = element.getAsJsonArray();
			}
			
			Iterator it = jsonArr.iterator();
			
			//Vaccine name = null;
			Mask name = null;
			
			while(it.hasNext()) {
				element = (JsonElement)it.next();
				//name = gson.fromJson(element, Vaccine.class);
				name = gson.fromJson(element, Mask.class);
				System.out.println(name);					// 全部資料
				//System.out.println(name.getId());			// 十碼章
				//System.out.println(name.getName());		// 醫院名稱
				//System.out.println(name.getArea());		// 行政區
				//System.out.println(name.getAddress());	// 地址
				//System.out.println(name.getPhone());		// 連絡電話
				//System.out.println(name.getLatitude());	// 座標緯度
				//System.out.println(name.getLongtitude());	// 座標經度
			}
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace(); 
		} 
	}
}