package enumTest;
/**
 * 枚举和行为绑定
 */
public class ActiveEnum {
	/**
	 * 枚举的加、减、乘、除
	 */
	public enum NormalActive{
		PLUS,MINUS,MULTI,DIVIDS,DIFFER;
		/**
		 *枚举中的方法
		 */
		double oper(double x,double y) {
			switch(this) {
			case PLUS:return x+y;
			case MINUS:return x-y;
			case MULTI:return x*y;
			case DIVIDS:return x/y;
			//case DIFFER: return (x+1)*y;
			}
			throw new UnsupportedOperationException();
		}
	}
	public static void main(String[] args) {
		System.out.println(NormalActive.PLUS.oper(0.1, 0.2));
		//NormalActive.DIFFER.oper(0.1, 0.2);
		//BetterActive.DIFFER.oper()
	}

	/**
	 * 更好的实现枚举的加、减、乘、除
	 */
	public enum BetterActive{
		PLUS{
			@Override
			double oper(double x, double y) {
				return x+y;
			}
			},
		MINUS{@Override
				double oper(double x, double y) {
			return x-y;
		}
		},
		MULTI{@Override
			double oper(double x, double y) {
			return x*y;
		}
		},
		DIVIDS{@Override
			double oper(double x, double y) {
			return x/y;
		}
		};

		abstract double oper(double x,double y) ;
	}



}
