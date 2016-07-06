package cn.com.common;





import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



//@RunWith(SpringJUnit4ClassRunner.class)
public class PropertyHelperTest {


	 
	
	@Test
	public void testGetProperty() {
		
		try {
			PropertyHelper propertyHelper=new PropertyHelper("/test.properties");
		    String o=	propertyHelper.getProperty("test");
			System.out.println(o);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("获取异常");
		}
	}

	@Test
	public void testSetProperty() {
		try {
			PropertyHelper propertyHelper=new PropertyHelper("/test.properties");
		   	propertyHelper.setProperty("test", "858585");
			System.out.println("ok");
		} catch (Exception e) {
		
			e.printStackTrace();
			System.out.println("设置异常");
		}
		
	}

}
