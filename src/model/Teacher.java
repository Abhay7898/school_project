package model;

import java.sql.Date;

public class Teacher {
	private int tId;
	private String tName;
	private String tLastName;
	private int tAge;
	private String tGender;
	private String tAddress;
	private int tMobile;
	private String tEmailId;
	private Date tDoj;
	private String tSubject;
	
	
		public Teacher() {
		}

	public Teacher(int tId, String tName, String tLastName, int tAge, String tGender, String tAddress, int tMobile,
			String tEmailId, Date tDoj,String tSubject) {
		this.tId = tId;
		this.tName = tName;
		this.tLastName = tLastName;
		this.tAge = tAge;
		this.tGender = tGender;
		this.tAddress = tAddress;
		this.tMobile = tMobile;
		this.tEmailId = tEmailId;
		this.tDoj = tDoj;
		this.tSubject=tSubject;
	}

	public int gettId() {
		return tId;
	}

	public void settId(int tId) {
		this.tId = tId;
	}

	public String gettName() {
		return tName;
	}

	public void settName(String tName) {
		this.tName = tName;
	}

	public String gettLastName() {
		return tLastName;
	}

	public void settLastName(String tLastName) {
		this.tLastName = tLastName;
	}

	public int gettAge() {
		return tAge;
	}

	public void settAge(int tAge) {
		this.tAge = tAge;
	}

	public String gettGender() {
		return tGender;
	}

	public void settGender(String tGender) {
		this.tGender = tGender;
	}

	public String gettAddress() {
		return tAddress;
	}

	public void settAddress(String tAddress) {
		this.tAddress = tAddress;
	}

	public int gettMobile() {
		return tMobile;
	}

	public void settMobile(int tMobile) {
		this.tMobile = tMobile;
	}

	public String gettEmailId() {
		return tEmailId;
	}

	public void settEmailId(String tEmailId) {
		this.tEmailId = tEmailId;
	}

	public Date gettDoj() {
		return tDoj;
	}

	public void settDoj(Date tDoj) {
		this.tDoj = tDoj;
	}


	public String gettSubject() {
		return tSubject;
	}

	public void settSubject(String tSubject) {
		this.tSubject = tSubject;
	}

	
}
	
	
