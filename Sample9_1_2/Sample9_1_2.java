import java.text.DecimalFormat;

public class Sample9_1_2 {
	public static void main(String[] args) {
		int i1 = 2360;
		int i2 = 365;
		double d1 = 381.5396;
		double d2 = -23.6;
		DecimalFormat form = new DecimalFormat();
		
		form.applyPattern("#,###");
		System.out.println("指定した書式 : " + form.toPattern());
		System.out.println("整数値 : " + form.format(i1));
		System.out.println("整数値 : " + form.format(i2));
		
		form.applyPattern("#,###.00");
		System.out.println("指定した書式 : " + form.toPattern());
		System.out.println("実数値 : " + form.format(d1));
		System.out.println("実数値 : " + form.format(d2));
	}
}