package MybatisTest;

import com.ngh.mapper.OrdersMapper;
import com.ngh.mapper.UserMapper;
import com.ngh.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;

public class OrderTest {
    private SqlSessionFactory sqlSessionFactory;
    @Before
    public void setUp() throws IOException {
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("SqlMapConfig.xml"));
    }

    @Test
    public void testFinUserById(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User userById = mapper.findUserById(1);
        System.out.println(userById);
        sqlSession.close();
    }

    @Test
    public void testfindUserOrder(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrdersMapper mapper = sqlSession.getMapper(OrdersMapper.class);
        List<User> userOrder = mapper.findUserOrder();
        System.out.println(userOrder);
        sqlSession.close();
    }

    @Test
    public void NiuKe(){


    }


}
