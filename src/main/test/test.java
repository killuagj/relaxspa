
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class test {
//    @Autowired
//    private PersonDao personDao;
//
//    @Test
//    public void testFindPersonById() {
//        int id = 1;
//        Person person = personDao.findPersonById(id);
//        System.out.println(person.getId() + ":" + person.getUsername());
//    }



}
