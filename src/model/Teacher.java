package model;

import java.util.Date;

public class Teacher {
	private int tid;
	private String tname;
	private String tlastname;
	private int tage;
	private String tgender;
	private String taddress;
	private int tmono;
	private String temailid;
	private Date tdoj;

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getTlastname() {
		return tlastname;
	}

	public void setTlastname(String tlastname) {
		this.tlastname = tlastname;
	}

	public int getTage() {
		return tage;
	}

	public void setTage(int tage) {
		this.tage = tage;
	}

	public String getTgender() {
		return tgender;
	}

	public void setTgender(String tgender) {
		this.tgender = tgender;
	}

	public String getTaddress() {
		return taddress;
	}

	public void setTaddress(String taddress) {
		this.taddress = taddress;
	}

	public int getTmono() {
		return tmono;
	}

	public void setTmono(int tmono) {
		this.tmono = tmono;
	}

	public String getTemailid() {
		return temailid;
	}

	public void setTemailid(String temailid) {
		this.temailid = temailid;
	}

	public Date getTdoj() {
		return tdoj;
	}

	public void setTdoj(Date tdoj) {
		this.tdoj = tdoj;
	}

}
