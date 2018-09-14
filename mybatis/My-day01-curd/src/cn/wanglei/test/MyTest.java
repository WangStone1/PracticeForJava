package cn.wanglei.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import cn.wanglei.beans.Student;
import cn.wanglei.dao.IStudentDao;
import cn.wanglei.daoImpl.StudentDaoImpl;

public class MyTest {
	private IStudentDao dao;

	@Before
	public void before() {
		dao = new StudentDaoImpl();
	}

	@Test
	public void test01() {

		Student student = new Student("王磊", 18, 99.1);
		System.out.println("插入前：" + student);
		dao.insertStudent(student);
		System.out.println("插入后：" + student);
	}

	@Test
	public void test02() {

		Student student = new Student("赵六", 30, 91);
		System.out.println("插入前：" + student);
		dao.insertStudentCatcheId(student);
		System.out.println("插入后：" + student);
	}

	@Test
	public void test03() {
		Student student = new Student("赵七", 30, 91);
		System.out.println("插入前：" + student);
		dao.insertStudentCatcheId2(student);
		System.out.println("插入后：" + student);
	}

	@Test
	public void test04() {
		dao.deleteStudent(46);
	}

	@Test
	public void test05() {
		Student student = new Student("李建国", 30, 100);
		student.setId(45);

		dao.updataStudent(student);
	}

	@Test
	public void test06() {
		List<Student> allStudent = dao.selectAllStudent();
		for (Student student : allStudent) {
			System.out.println(student);
		}
	}

	@Test
	public void test07() {
		Student student = dao.selectStudent(1);
		System.out.println(student);

	}
	
	@Test
	public void test08() {
		List<Student> allStudent = dao.selectStudentByName("赵");
		for (Student student : allStudent) {
			System.out.println(student);
		}
	}
}
