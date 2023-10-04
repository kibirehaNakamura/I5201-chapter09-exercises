public class Sample9_3_3 {
	public static void main(String[] args) {
		int i = 0;
		int j;
		try {
			j = 10 / i;
		} catch(ArithmeticException e) {
			System.out.println("例外が発生しました");
			System.out.println(e);
			j = 0;
		} finally {
			System.out.println("整数値 : " + i);
		}
	}
}