package cn.wanglei.utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtils {
	private static SqlSessionFactory factory;

	public static SqlSession getSqlSession() {
		InputStream is;
		try {
			is = Resources.getResourceAsStream("mybatis.xml");
			if (factory == null) {
				factory = new SqlSessionFactoryBuilder().build(is);
			}
			return factory.openSession();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}
}
