package enumTest;

/**
 * @author zouzujiang
 */
public class EnumTest {
	public static void main(String[] args){

		//UserInfoEnum[] values = UserInfoEnum.values();
		//for (UserInfoEnum userInfoEnum:values) {
		//	System.out.println(userInfoEnum.getCode()+"----"+userInfoEnum.getDes());
		// }
		String s = "123";
		StringBuffer buffer = new StringBuffer(s);
		System.out.println(buffer.capacity());
	}


	/**
	 * 构造方法默认的是private
	 * 使用枚举的时候会加载里面的每一个对象，所以每一个变量对应的
	 * 构造方法都会调用一次，只要使用枚举就会出现这样的加载方式   ok
	 */
	public enum UserInfoEnum {

		IN_AUDIT((byte) 0, "审核中"), SUCCESS_AUDIT((byte) 1, "审核成功"), FAIL_AUDIT((byte) 2, "审核失败");

		private Byte code;

		private String des;

		UserInfoEnum(Byte code, String des) {
			this.code = code;
			this.des = des;
		}

		public Byte getCode() {
			return code;
		}

		public void setCode(Byte code) {
			this.code = code;
		}

		public String getDes() {
			return des;
		}

		public void setDes(String des) {
			this.des = des;
		}

	}

}
