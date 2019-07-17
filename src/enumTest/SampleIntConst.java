package enumTest;
/**
 * 枚举和int常量
 */
public class SampleIntConst {
	/**
	 * 延时订单状态  0：未支付 1：已支付 2：支付超时
	 */
	public static final int ORDER_DEPOT_UNPAY = 0;
	public static final int ORDER_DEPOT_PAID = 1;
	public static final int ORDER_DEPOT_TIMOUT = 2;

	public static final String ORDER_DEPOT_PAID_DES = "已支付";
	/**
	 * 物流订单状态 0：准备发货 1：物流中 2：已经收货
	 */
	public static final int ORDER_LOGISTICS_READY = 0;
	public static final int ORDER_LOGISTICS_TRANSPORT = 1;
	public static final int ORDER_LOGISTICS_ARRIVED = 2;

	public enum Depot{UNPAY,PAID,TIMOUT}
	public enum Logistics{READY,TRANSPORT,ARRIVED}

	public static void main(String[] args) {
		//System.out.println(ORDER_DEPOT_PAID);
		// 返回一个中文的状态
		System.out.println(Depot.UNPAY.ordinal());
		System.out.println(Depot.UNPAY);
	}

}
