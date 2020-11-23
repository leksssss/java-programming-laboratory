package jdbc;

import java.io.Serializable;

public class Data implements Serializable{
	
	private String roll_no;
	private String name;
	private int age;
	private String gender;
	private String address;
	private int mark1 = 0;;
	private int mark2 = 0;
	private int mark3 = 0;
	private int mark4 = 0;
	private int mark5 = 0;
	
	public Data(String rno, String n, int a, String g, String addr) {
		this.roll_no = rno;
		this.name = n;
		this.age = a;
		this.gender = g;
		this.address = addr;
	}
	
	public Data(String rno, String n, int a, String g, String addr, int m1, int m2, int m3, int m4, int m5) {
		this(rno, n, a, g, addr);
		this.mark1 = m1;
		this.mark2 = m2;
		this.mark3 = m3;
		this.mark4 = m4;
		this.mark5 = m5;
	}
	
	public Data(String r, int m1, int m2, int m3, int m4, int m5) {
		// TODO Auto-generated constructor stub
		this.roll_no = r;
		this.mark1 = m1;
		this.mark2 = m2;
		this.mark3 = m3;
		this.mark4 = m4;
		this.mark5 = m5;
	}

	public String getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(String roll_no) {
		this.roll_no = roll_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getMark1() {
		return mark1;
	}

	public void setMark1(int mark1) {
		this.mark1 = mark1;
	}

	public int getMark2() {
		return mark2;
	}

	public void setMark2(int mark2) {
		this.mark2 = mark2;
	}

	public int getMark3() {
		return mark3;
	}

	public void setMark3(int mark3) {
		this.mark3 = mark3;
	}

	public int getMark4() {
		return mark4;
	}

	public void setMark4(int mark4) {
		this.mark4 = mark4;
	}

	public int getMark5() {
		return mark5;
	}

	public void setMark5(int mark5) {
		this.mark5 = mark5;
	}
	
	
	
}
