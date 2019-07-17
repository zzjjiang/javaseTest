package ReflectTest;


import org.junit.Test;

public class ReflectClass {



	@Test
	public void getClassTt() throws ClassNotFoundException {
		String str1 = "abc";
		Class cls1 = str1.getClass();
		Class cls2 = String.class;
		Class cls3 = Class.forName("java.lang.String");
		System.out.println(cls1 == cls2);
		System.out.println(cls1 == cls3);

	}
}
