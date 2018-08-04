package it.studentinfo.model;



/**
 * Goods entity. @author MyEclipse Persistence Tools
 */

public class Student implements java.io.Serializable {

	// Fields

	private Integer stuid;
	private Classes classes;
	private Integer stunumber;
	private String stuname;
	private String stusex;
	private Integer stuage;
	private Integer stuintime;

	// Constructors

	/** default constructor */
	public Student() {
	}

	/** minimal constructor */
	public Student(Integer stunumber,String stuname, String stusex,Integer stuage,Integer stuintime) {
		this.stunumber=stunumber;
		this.stuname = stuname;
		this.stusex = stusex;
		this.stuage = stuage;
		this.stuintime = stuintime;
		
	}

	/** full constructor */
	public Student(Classes classes, Integer stunumber,String stuname, String stusex,Integer stuage,Integer stuintime) {
		this.classes = classes;
		this.stunumber=stunumber;
		this.stuname = stuname;
		this.stusex = stusex;
		this.stuage = stuage;
		this.stuintime = stuintime;
	}

	// Property accessors

	public Integer getStuid() {
		return this.stuid;
	}

	public void setStuid(Integer stuid) {
		this.stuid = stuid;
	}

	public Classes getClasses() {
		return this.classes;
	}

	public void setClasses(Classes classes) {
		this.classes = classes;
	}
	
	public Integer getStunumber() {
		return this.stunumber;
	}

	public void setStunumber(Integer stunumber) {
		this.stunumber = stunumber;
	}

	public String getStuname() {
		return this.stuname;
	}

	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	
	
	public String getStusex() {
		return this.stusex;
	}

	public void setStusex(String stusex) {
		this.stusex = stusex;
	}
	
	public Integer getStuage() {
		return this.stuage;
	}

	public void setStuage(Integer stuage) {
		this.stuage = stuage;
	}
	
	public Integer getStuintime() {
		return this.stuintime;
	}

	public void setStuintime(Integer stuintime) {
		this.stuintime = stuintime;
	}

	

	

}