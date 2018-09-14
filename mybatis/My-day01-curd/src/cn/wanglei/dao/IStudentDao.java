package cn.wanglei.dao;

import java.util.List;

import cn.wanglei.beans.Student;

public interface IStudentDao {
	//增
	public abstract  void insertStudent(Student student);
	//增的同时获得增加数据的id
	public abstract void insertStudentCatcheId(Student student);
	public abstract void insertStudentCatcheId2(Student student);
	//删
	public abstract void deleteStudent(int id);
	//改
	public abstract void updataStudent(Student student);
	//查
	public abstract List<Student> selectAllStudent();
	public abstract Student selectStudent(int id);
	public abstract List<Student> selectStudentByName(String name);
}
 