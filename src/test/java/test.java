import com.baizhi.springboot.App;
import com.baizhi.springboot.dao.StudentDao;
import com.baizhi.springboot.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
//启动spring的工厂
@RunWith(SpringRunner.class)
//开启springboot的自动配置
@SpringBootTest(classes = App.class)
public class test {

    @Autowired
    public StudentDao studentDao;

    @Test
    public void test1(){
       /* List<Student> students = studentDao.selectAll();
        for (Student student : students) {
            System.out.println(student);
        }*/
       Student student = studentDao.selectOne(1);
        System.out.println(student);
    }
}
