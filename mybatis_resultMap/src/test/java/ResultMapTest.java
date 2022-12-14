import com.nsxy.mybatis.mapper.DeptMapper;
import com.nsxy.mybatis.mapper.EmpMapper;
import com.nsxy.mybatis.pojo.Dept;
import com.nsxy.mybatis.pojo.Emp;
import com.nsxy.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class ResultMapTest {
    @Test
    public void testGetEmpByEmpId() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp empByEmpId = mapper.getEmpByEmpId(1);
        System.out.println(empByEmpId);
        sqlSession.close();
    }

    @Test
    public void testGetEmpAndDeptByEmpId() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp empByEmpId = mapper.getEmpAndDeptByEmpId(1);
        System.out.println(empByEmpId);
        sqlSession.close();
    }

    @Test
    public void testGetEmpAndDeptByStep() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp empByEmpId = mapper.getEmpAndDeptByStepOne(2);
        System.out.println(empByEmpId.getEmpName());
        sqlSession.close();
    }

    @Test
    public void testGetDeptAndEmpByDeptId() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept deptAndEmpByDeptId = mapper.getDeptAndEmpByDeptId(1);
        System.out.println(deptAndEmpByDeptId);
        sqlSession.close();
    }

    @Test
    public void testGetDeptAndEmpByStep() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept deptAndEmpByDeptId = mapper.getDeptAndEmpByStepOne(1);
        System.out.println(deptAndEmpByDeptId);
        sqlSession.close();
    }
}
