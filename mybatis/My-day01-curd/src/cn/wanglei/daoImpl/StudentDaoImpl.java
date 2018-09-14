package cn.wanglei.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import cn.wanglei.beans.Student;
import cn.wanglei.dao.IStudentDao;
import cn.wanglei.utils.MybatisUtils;

public class StudentDaoImpl implements IStudentDao {

	private SqlSession session;

	@Override
	public void insertStudent(Student student) {
		try {
			SqlSession session = MybatisUtils.getSqlSession();
			session.insert("insertStudent", student);
			session.commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}

	}

	@Override
	public void insertStudentCatcheId(Student student) {
		try {
			SqlSession session = MybatisUtils.getSqlSession();
			session.insert("insertStudentCatcheId", student);
			session.commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}

	}

	@Override
	public void insertStudentCatcheId2(Student student) {
		try {
			SqlSession session = MybatisUtils.getSqlSession();
			session.insert("insertStudentCatcheId2", student);
			session.commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}

	}

	@Override
	public void deleteStudent(int id) {
		try {
			SqlSession session = MybatisUtils.getSqlSession();
			session.delete("deleteStudent", id);
			session.commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	@Override
	public void updataStudent(Student student) {
		try {
			SqlSession session = MybatisUtils.getSqlSession();
			session.update("updataStudent", student);
			session.commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	@Override
	public List<Student> selectAllStudent() {
		List<Student> list = new ArrayList<Student>();
		try {
			SqlSession session = MybatisUtils.getSqlSession();
			list = session.selectList("selectAllStudent");
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return list;

	}

	@Override
	public Student selectStudent(int id) {
		Student student = null;
		try {
			SqlSession session = MybatisUtils.getSqlSession();
			student = session.selectOne("selectStudent", id);

		} finally {
			if (session != null) {
				session.close();
			}
		}
		return student;
	}

	@Override
	public List<Student> selectStudentByName(String name) {
		List<Student> list = null;
		try {
			SqlSession session = MybatisUtils.getSqlSession();
			list = session.selectList("selectStudentByName", name);

		} finally {
			if (session != null) {
				session.close();
			}
		}
		return list;
	}

}
