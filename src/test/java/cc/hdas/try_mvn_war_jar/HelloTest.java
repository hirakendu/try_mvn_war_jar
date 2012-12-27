package cc.hdas.try_mvn_war_jar;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloTest {
	
	@Test
	public void testHello() {
		Hello hello = new Hello();
		assertEquals("Hello World!", hello.hello());
	}
	

}
