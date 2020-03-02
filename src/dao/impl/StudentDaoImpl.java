package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dao.StudentDao;
import entity.Student;
import utils.DBUtils;

public class StudentDaoImpl implements StudentDao {
	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;
	/**
	 * 从数据库中查询所有的学习然后返回一个list
	 */
	@Override
	public List<Student> stus(){
		List<Student> stus=new ArrayList<Student>();
		try {
			conn=DBUtils.getConnection();
			PreparedStatement pst = conn.prepareStatement("select * from studentinfo");
			rs = pst.executeQuery();
			while(rs.next()) {
				Student stu=new Student();
				stu.setSid(rs.getString("sid"));
				stu.setSname(rs.getString("sname"));
				stu.setAge(rs.getInt("age"));
				stu.setSex(rs.getInt("sex"));
				stus.add(stu);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stus;
	}

}
