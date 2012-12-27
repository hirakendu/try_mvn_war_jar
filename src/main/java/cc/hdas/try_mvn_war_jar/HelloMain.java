package cc.hdas.try_mvn_war_jar;

public class HelloMain {
	
	public static void main(String[] args) {
		String name = null;
		if (args.length > 0) {
			name = args[0];
		}
		Hello hello = new Hello();
		System.out.println(hello.hello(name));
		return;
	}

}
