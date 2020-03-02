package service.impl;

import java.util.List;

import dao.StudentDao;
import dao.impl.StudentDaoImpl;
import entity.Student;
import service.StudentService;

public class StudentServiceImpl implements StudentService {
	private StudentDao sd=new StudentDaoImpl();
	@Override
	public List<Student> stus() {
		List<Student> stus = sd.stus();
		if(stus!=null) {
			return stus;
		}
		return null;
	}
	

}
