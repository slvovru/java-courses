
public class Calculate {

	public static void main(String[] args) {
		System.out.println("Calculating...");
		int first = Integer.valueOf(args[0]);
		int second = Integer.valueOf(args[1]);
		int summ = first + second;
		int razn = first - second;
		int proizv = first * second;
		double div = (second == 0 ? 0 : (double) first / (double) second);
		System.out.println("sum  " + summ);
		System.out.println("razn  " + razn);
		System.out.println("proizv  " + proizv);
		System.out.println("div  " + div);
	}
}