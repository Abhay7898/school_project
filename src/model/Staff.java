package model;

import java.sql.Date;

public class Staff {
	
	private int sfId;
	private String sfFName;
	private String sfLastName;
	private int sfAge;
	private String sfGender;
	private String sfAddress;
	private int sfMobile;
	private String sfEmailId;
	private Date sfDoj;
	private String sfDepartment;
	private String sfWork;
	private String sfSalary;
	
	
	public int getSfId() {
		return sfId;
	}
	public void setSfId(int sfId) {
		this.sfId = sfId;
	}
	public String getSfFName() {
		return sfFName;
	}
	public void setSfFName(String sfFName) {
		this.sfFName = sfFName;
	}
	public String getSfLastName() {
		return sfLastName;
	}
	public void setSfLastName(String sfLastName) {
		this.sfLastName = sfLastName;
	}
	public int getSfAge() {
		return sfAge;
	}
	public void setSfAge(int sfAge) {
		this.sfAge = sfAge;
	}
	public String getSfGender() {
		return sfGender;
	}
	public void setSfGender(String sfGender) {
		this.sfGender = sfGender;
	}
	public String getSfAddress() {
		return sfAddress;
	}
	public void setSfAddress(String sfAddress) {
		this.sfAddress = sfAddress;
	}
	public int getSfMobile() {
		return sfMobile;
	}
	public void setSfMobile(int sfMobile) {
		this.sfMobile = sfMobile;
	}
	public String getSfEmailId() {
		return sfEmailId;
	}
	public void setSfEmailId(String sfEmailId) {
		this.sfEmailId = sfEmailId;
	}
	public Date getSfDoj() {
		return sfDoj;
	}
	public void setSfDoj(Date sfDoj) {
		this.sfDoj = sfDoj;
	}
	public String getSfDepartment() {
		return sfDepartment;
	}
	public void setSfDepartment(String sfDepartment) {
		this.sfDepartment = sfDepartment;
	}
	public String getSfWork() {
		return sfWork;
	}
	public void setSfWork(String sfWork) {
		this.sfWork = sfWork;
	}
	public String getSfSalary() {
		return sfSalary;
	}
	public void setSfSalary(String sfSalary) {
		this.sfSalary = sfSalary;
	}
	
	@Override
	public String toString() {
		return "Staff [sfId=" + sfId + ", sfFName=" + sfFName + ", sfLastName=" + sfLastName + ", sfAge=" + sfAge
				+ ", sfGender=" + sfGender + ", sfAddress=" + sfAddress + ", sfMobile=" + sfMobile + ", sfEmailId="
				+ sfEmailId + ", sfDoj=" + sfDoj + ", sfDepartment=" + sfDepartment + ", sfWork=" + sfWork
				+ ", sfSalary=" + sfSalary + "]";
	}
	
}
