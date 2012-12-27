package cc.hdas.try_mvn_war_jar;

public class Hello {
	
	public String hello(String name) {
		if (name == null) {
			return "Hello World!";
		} else {
			return "Hello " + name + "!";
		}
	}

}
