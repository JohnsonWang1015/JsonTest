package com.entity;

import java.util.HashMap;
import java.util.Map;

public class Vaccine {

	private String id;
	private String name;
	private String area;
	private String address;
	private String phone;
	private String latitude;
	private String longtitude;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongtitude() {
		return longtitude;
	}

	public void setLongtitude(String longtitude) {
		this.longtitude = longtitude;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	@Override
	public String toString() {
		return "高雄市疫苗接種醫院 [十碼章=" + id + ", 醫院名稱=" + name + ", 行政區=" + area + ", 地址=" + address + ", 連絡電話=" + phone
				+ ", 座標緯度=" + latitude + ", 座標經度=" + longtitude + "]";
	}
}