import java.text.DecimalFormat;

public class Q9_1 {
	public static void main(String[] args) {
		final double TAX = 0.08;
		DecimalFormat form = new DecimalFormat();
		
		int price = Integer.parseInt(args[0]);
		int taxPrice = (int)(price * TAX);
		int totalPrice = price + taxPrice;
		
		form.applyPattern("##.0%");
		System.out.println("税率は" + form.format(TAX) + "です");
		
		form.applyPattern("\\###,###");
		String buf;
		buf = "       " + form.format(price);
		buf = buf.substring(buf.length() - 8);
		System.out.println("金額　　　 : " + buf);
		buf = "       " + form.format(taxPrice);
		buf = buf.substring(buf.length() - 8);
		System.out.println("税額　　　 : " + buf);
		buf = "       " + form.format(totalPrice);
		buf = buf.substring(buf.length() - 8);
		System.out.println("税込み金額 : " + buf);
	}
}