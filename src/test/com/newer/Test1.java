package com.newer;

import com.newer.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import java.sql.SQLException;

public class Test1 {

    @Test
    public void test() {
        //获取数据库连接会话对象
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        try {
            //输出连接源数据
            System.out.println(sqlSession.getConnection().getMetaData().getDatabaseProductName());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        SqlSessionUtil.close(sqlSession);


    }

}
