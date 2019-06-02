package MybatisTest;

import com.ngh.mapper.UserMapper;
import com.ngh.po.User;
import com.ngh.po.UserComte;
import com.ngh.po.userQueryVo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserTest {
    private SqlSessionFactory sqlSessionFactory;
    @Before
    public void setUp() throws IOException{
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
    public void testfindUserList(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserComte userComte = new UserComte();
        userComte.setName("王");
        userQueryVo vo = new userQueryVo();
        vo.setUserComte(userComte);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<UserComte> userList = mapper.findUserList(vo);
        System.out.println(userList);
    }

    @Test
    public void testinsertUser(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = new User();
        user.setName("啦啦啦");
        user.setSex("男");
        user.setAddress("山东");
        user.setAge(30);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.insertUser(user);
        System.out.println(user.getId());
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testdelUserById() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.delUserById(12);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testupdateUser(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        UserComte userComte = new UserComte();
        userComte.setName("凯");
        userComte.setAddress("上市");
        userComte.setAge(2);
        userComte.setId(1);
        userComte.setSex("男");
        mapper.updateUser(userComte);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testfindUserWhere(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        userQueryVo queryVo = new userQueryVo();
        UserComte userComte = new UserComte();
        userComte.setSex("女");
        userComte.setName("三");
        userComte.setAddress("重庆");
        queryVo.setUserComte(userComte);
        List<Integer> list = new ArrayList<Integer>();

        userComte.setIdArray(list);
        List<UserComte> userWhere = mapper.findUserWhere(queryVo);
        System.out.println(userWhere);
        sqlSession.close();
    }


}
