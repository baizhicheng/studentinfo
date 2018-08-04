package it.studentinfo.test;

public class StudentServiceImpl implements IStudentService {
StudentDao studentDao=null;
	public void setStudentDao(StudentDao studentDao) {
	this.studentDao = studentDao;
}
	public void save() {
		studentDao.save();
		//System.out.println("GoodsServiceImpl sava()");
		
	}

}
