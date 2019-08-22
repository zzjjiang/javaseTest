package java8.cap5;

/**
 * @Description 交易
 * @Author zouzujiang
 * @Date 2019-08-22 14:52
 **/
public class Transaction {

	private Trader trader;

	private int year;

	private int value;

	public Transaction(Trader trader, int year, int value) {
		this.trader = trader;
		this.year = year;
		this.value = value;
	}

	public Trader getTrader() {
		return trader;
	}

	public void setTrader(Trader trader) {
		this.trader = trader;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Transaction{" +
				"trader=" + trader +
				", year=" + year +
				", value=" + value +
				'}';
	}
}
