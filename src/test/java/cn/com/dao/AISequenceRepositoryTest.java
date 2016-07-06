package cn.com.dao;





import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value={"classpath:spring/spring-dao.xml","classpath:spring/spring-servlet.xml"})
public class AISequenceRepositoryTest {

	@Autowired
	private ApplicationContext  applicationContext;
	@Autowired
	private AISequenceRepository idsrepository;
	
	@Test
	public void testGetNextSequence() {
	    int id=	idsrepository.getNextSequence("SKU", "SKU", "SKUID");
		System.out.println(id);
	}
	@Test
    public void testGetBean()
    {
		try {
			Object o=	applicationContext.getBean(AISequenceRepositoryImpl.class);
	    	if (o==null) {
	    		System.out.println("bean name is exists");
			}
	    	else {
	    		System.out.println(o.getClass());
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
    	
    	
    }
}
