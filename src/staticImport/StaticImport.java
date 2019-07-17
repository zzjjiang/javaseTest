package staticImport;

import static java.lang.Math.abs;
import static java.lang.Math.max;

/**
 * 静态导入
 * 使用静态导入的好处：提高编写代码的效率。
 * 静态成员的使用，使用import static 引入静态成员。
 * 很简单的东西，看一个例子：
 * 没有静态导入
 *   Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
 * 有了静态导入
 *   import static java.lang.Math.*;
 *      sqrt(pow(x, 2) + pow(y, 2));
 * 其中import static java.lang.Math.*;就是静态导入的语法，
 * 它的意思是导入Math类中的所有static方法和属性。
 *     这样我们在使用这些方法和属性时就不必写类名。
 * 需要注意的是默认包无法用静态导入，另外如果导入的类中有重复的方法和属性则需要写出类名，
 * 否则编译时无法通过。
 */
public class StaticImport {

	public static void main(String[] args){

		int x = 1;
		try {
			x++;
		} finally {
			System.out.println("template");
		}
		System.out.println(x);
		
		System.out.println(max(3, 6));
		System.out.println(abs(3 - 6));
		
	}
}
