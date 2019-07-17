package ReflectTest;

import annotation.MetaAnnotation;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		
		ReflectPoint pt1 = new ReflectPoint(3,5);
		Field fieldY = pt1.getClass().getField("y");
		//fieldY的值是多少？是5,错！fieldY不是对象身上的变量，而是类上，要用它去取某个对象上对应的值
		System.out.println(fieldY.get(pt1));
		Field fieldX = pt1.getClass().getDeclaredField("x");
		fieldX.setAccessible(true);
		System.out.println(fieldX.get(pt1));
		Method method = pt1.getClass().getDeclaredMethod("jj");
		MetaAnnotation annotation = method.getAnnotation(MetaAnnotation.class);
		System.out.println(annotation.value());
	}

	private static void printObject(Object obj) {
		Class clazz = obj.getClass();
		if(clazz.isArray()){
			int len = Array.getLength(obj);
			for(int i=0;i<len;i++){
				System.out.println(Array.get(obj, i));
			}
		}else{
			System.out.println(obj);
		}
		
	}

	private static void changeStringValue(Object obj) throws Exception {
		Field[] fields = obj.getClass().getFields();
		for(Field field : fields){
			//if(field.getType().equals(String.class)){
			if(field.getType() == String.class){
				String oldValue = (String)field.get(obj);
				String newValue = oldValue.replace('b', 'a');
				field.set(obj, newValue);
			}
		}
		
	}

}



