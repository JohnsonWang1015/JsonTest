package com.entity;

import java.util.HashMap;
import java.util.Map;

public class Mask {

	private String id;
	private String name;
	private String address;
	private String phone;
	private String adultMask;
	private String childMask;
	private String time;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public Mask() {
	}

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

	public String getAdultMask() {
		return adultMask;
	}

	public void setAdultMask(String adultMask) {
		this.adultMask = adultMask;
	}

	public String getChildMask() {
		return childMask;
	}

	public void setChildMask(String childMask) {
		this.childMask = childMask;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	@Override
	public String toString() {
		return "全臺販賣口罩藥局 [醫事機構代碼=" + id + ", 醫事機構名稱=" + name + ", 醫事機構地址=" + address + ", 醫事機構電話=" + phone + ", 成人口罩剩餘數="
				+ adultMask + ", 兒童口罩剩餘數=" + childMask + ", 來源資料時間=" + time + "]";
	}

}