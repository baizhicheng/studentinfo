package it.studentinfo.model;

import it.studentinfo.model.Student;

import java.util.HashSet;
import java.util.Set;

/**
 * Classes entity. @author MyEclipse Persistence Tools
 */

public class Classes implements java.io.Serializable {

	// Fields

	private Integer stid;
	private String stclass;
	private String stdep;
	private Set<Student> students = new HashSet<Student>();

	// Constructors

	/** default constructor */
	public Classes() {
	}

	/** minimal constructor */
	public Classes(String stclass,String stdep) {
		this.stclass = stclass;
		this.stdep = stdep;
	}

	/** full constructor */
	public Classes(String stclass,String stdep,Set<Student> students) {
		this.stclass = stclass;
		this.stdep = stdep;
		this.students = students;
	}

	// Property accessors

	public Integer getStid() {
		return this.stid;
	}

	public void setStid(Integer stid) {
		this.stid = stid;
	}

	public String getStclass() {
		return this.stclass;
	}

	public void setStclass(String stclass) {
		this.stclass = stclass;
	}
	
	public String getStdep() {
		return this.stdep;
	}

	public void setStdep(String stdep) {
		this.stdep = stdep;
	}
	
	public Set<Student> getStudents() {
		return this.students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

}