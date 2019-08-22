package java8.cap5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * @Description java8 cap5付诸实践
 * @Author zouzujiang
 * @Date 2019-08-22 14:51
 **/
public class Basic {

	public static void main(String[] args) {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario","Milan");
		Trader alan = new Trader("Alan","Cambridge");
		Trader brian = new Trader("Brian","Cambridge");

		List<Transaction> transactions = Arrays.asList(new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000),
				new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710),
				new Transaction(mario, 2012, 700),
				new Transaction(alan, 2012, 950));

//		Predicate
//		Comparator
		/**
		 * 	找出2011发生的所有交易，并按交易额排序--从低到高
		 */
		one(transactions);

		/**
		 * 交易员都在哪些不同的城市工作过
		 */
		tow(transactions);
		/**
		 * 查找所有来自剑桥的交易员，并按名字排序
		 */
		three(transactions);
		/**
		 * 返回所有交易员的姓名字符串，按字母顺序排序
		 */
		four(transactions);
		/**
		 * 有没有交易员是在米兰工作的
		 */
		five(transactions);
		/**
		 * 打印生活在剑桥的交易员的所有交易额
		 */
		six(transactions);
		/**
		 * 所有交易中，最高的交易额是多少
		 */
		seven(transactions);
		/**
		 * 找到交易额最小的交易
		 */
		eight(transactions);
	}
	/**
	 * 找到交易额最小的交易
	 */
	private static void eight(List<Transaction> transactions) {
		Integer integer = transactions.stream().map(Transaction::getValue)
				.reduce(Integer::min)
				.get();
		System.out.println("eight:");
		System.out.println(integer);
	}
	/**
	 * 所有交易中，最高的交易额是多少
	 */
	private static void seven(List<Transaction> transactions) {
		Integer integer = transactions.stream().map(Transaction::getValue)
				.reduce(Integer::max)
				.get();
		System.out.println("seven:");
		System.out.println(integer);

	}
	/**
	 * 打印生活在剑桥的交易员的所有交易额
	 */
	private static void six(List<Transaction> transactions) {
		List<Integer> cambridge = transactions.stream()
				.filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
				.map(Transaction::getValue)
				.collect(toList());
		System.out.println("six:");
		System.out.println(cambridge);

	}
	/**
	 * 有没有交易员是在米兰工作的
	 */
	private static void five(List<Transaction> transactions) {
		boolean milan = transactions.stream()
				.map(Transaction::getTrader)
				.anyMatch(trader -> trader.getName().equals("Milan"));
		System.out.println("five:");
		System.out.println(milan);

	}
	/**
	 * 返回所有交易员的姓名字符串，按字母顺序排序
	 */
	private static void four(List<Transaction> transactions) {
		List<String> strings = transactions.stream()
				.map(transaction->transaction.getTrader().getName())
				.distinct().sorted()
				.collect(toList());
		System.out.println("four:");
		System.out.println(strings);
	}
	/**
	 * 查找所有来自剑桥的交易员，并按名字排序
	 */
	private static void three(List<Transaction> transactions) {
		List<Trader> cambridge = transactions.stream().map(Transaction::getTrader).
				filter(s -> s.getCity().equals("Cambridge")).
				distinct().
				sorted(Comparator.comparing(Trader::getName)).
				collect(toList());
		System.out.println("three:");
		System.out.println(cambridge);
	}
	/**
	 * 交易员都在哪些不同的城市工作过
	 */
	private static void tow(List<Transaction> transactions) {
		List<String> cityList = transactions.stream()
				.map(transaction->transaction.getTrader().getCity())
				.distinct()
				.collect(toList());
		System.out.println("tow:");
		System.out.println(cityList);
	}

	/**
	 * 	找出2011发生的所有交易，并按交易额排序--从低到高
	 */
	private static void one(List<Transaction> transactions) {
		List<Transaction> transactions1 = transactions.stream().filter(transaction -> transaction.getYear() == 2011)
				.sorted(Comparator.comparing(Transaction::getValue))
				.collect(toList());
		System.out.println("one:");
		System.out.println(transactions1);
	}


}
