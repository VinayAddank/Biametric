package org.rta.aadhar.api.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "DATA")
public class AadharTCSResponse {
	private String uid;
	private String name;
	private String dob;
	private String gender;
	private String phone;
	private String co;
	private String house;
	private String street;
	private String loc;
	private String vtc;
	private String subdist;
	private String dist;
	private String state;
	private String pc;
	private String po;
	private String lang;
	private String lname;
	private String lco;
	private String lhouse;
	private String lstreet;
	private String lloc;
	private String lvtc;
	private String lsubdist;
	private String ldist;
	private String lstate;
	private String lpc;
	private String lpo;
	private String photo;
	private String Msg;

	@XmlElement(name = "Msg")
	public String getMsg() {
		return Msg;
	}

	public void setMsg(String msg) {
		Msg = msg;
	}

	@XmlElement(name = "uid")
	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	@XmlElement(name = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlElement(name = "dob")
	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	@XmlElement(name = "gender")
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@XmlElement(name = "phone")
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@XmlElement(name = "co")
	public String getCo() {
		return co;
	}

	public void setCo(String co) {
		this.co = co;
	}

	@XmlElement(name = "house")
	public String getHouse() {
		return house;
	}

	public void setHouse(String house) {
		this.house = house;
	}

	@XmlElement(name = "street")
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@XmlElement(name = "loc")
	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@XmlElement(name = "vtc")
	public String getVtc() {
		return vtc;
	}

	public void setVtc(String vtc) {
		this.vtc = vtc;
	}

	@XmlElement(name = "subdist")
	public String getSubdist() {
		return subdist;
	}

	public void setSubdist(String subdist) {
		this.subdist = subdist;
	}

	@XmlElement(name = "dist")
	public String getDist() {
		return dist;
	}

	public void setDist(String dist) {
		this.dist = dist;
	}

	@XmlElement(name = "state")
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@XmlElement(name = "pc")
	public String getPc() {
		return pc;
	}

	public void setPc(String pc) {
		this.pc = pc;
	}

	@XmlElement(name = "po")
	public String getPo() {
		return po;
	}

	public void setPo(String po) {
		this.po = po;
	}

	@XmlElement(name = "lang")
	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	@XmlElement(name = "lname")
	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	@XmlElement(name = "lco")
	public String getLco() {
		return lco;
	}

	public void setLco(String lco) {
		this.lco = lco;
	}

	@XmlElement(name = "lhouse")
	public String getLhouse() {
		return lhouse;
	}

	public void setLhouse(String lhouse) {
		this.lhouse = lhouse;
	}

	@XmlElement(name = "lstreet")
	public String getLstreet() {
		return lstreet;
	}

	public void setLstreet(String lstreet) {
		this.lstreet = lstreet;
	}

	@XmlElement(name = "lloc")
	public String getLloc() {
		return lloc;
	}

	public void setLloc(String lloc) {
		this.lloc = lloc;
	}

	@XmlElement(name = "lvtc")
	public String getLvtc() {
		return lvtc;
	}

	public void setLvtc(String lvtc) {
		this.lvtc = lvtc;
	}

	@XmlElement(name = "lsubdist")
	public String getLsubdist() {
		return lsubdist;
	}

	public void setLsubdist(String lsubdist) {
		this.lsubdist = lsubdist;
	}

	@XmlElement(name = "ldist")
	public String getLdist() {
		return ldist;
	}

	public void setLdist(String ldist) {
		this.ldist = ldist;
	}

	@XmlElement(name = "lstate")
	public String getLstate() {
		return lstate;
	}

	public void setLstate(String lstate) {
		this.lstate = lstate;
	}

	@XmlElement(name = "lpc")
	public String getLpc() {
		return lpc;
	}

	public void setLpc(String lpc) {
		this.lpc = lpc;
	}

	@XmlElement(name = "lpo")
	public String getLpo() {
		return lpo;
	}

	public void setLpo(String lpo) {
		this.lpo = lpo;
	}

	@XmlElement(name = "photo")
	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

}
