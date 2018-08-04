package it.studentinfo.dao;

import it.studentinfo.model.Classes;

import java.util.List;

public interface IClasses {

	public Classes getClasses(int stid);
	
	public List<Classes> getClasses(String stclass);

}
