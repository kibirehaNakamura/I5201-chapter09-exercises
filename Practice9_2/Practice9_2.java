import java.text.DecimalFormat;

public class Practice9_2 {
	public static void main(String[] args) {
		KeyIn ki = new KeyIn();
		DecimalFormat form = new DecimalFormat();
		final int MAX_NUMBER = 10;
		
		int[] age = new int[MAX_NUMBER];
		int[] sal = new int[MAX_NUMBER];
		int ageTotal = 0;
		int salTotal = 0;
		int cnt;
		for(cnt = 0; cnt < MAX_NUMBER; cnt++) {
			age[cnt] = ki.readInt((cnt + 1) + "人目の年齢");
			if (age[cnt] == 999) break;
			sal[cnt] = ki.readInt((cnt + 1) + "人目の給与");
			ageTotal += age[cnt];
			salTotal += sal[cnt];
		}
		
		String buf;
		if(cnt > 0) {
			form.applyPattern("\\###,###");
			System.out.println("番号 年齢       給与");
			for(int i = 0; i < cnt; i++) {
				buf = "   " + Integer.toString(i + 1);
				buf = buf.substring(buf.length() - 4);
				System.out.print(buf);
				buf = "    " + Integer.toString(age[i]);
				buf = buf.substring(buf.length() - 5);
				System.out.print(buf);
				buf = "          " + form.format(sal[i]);
				buf = buf.substring(buf.length() - 11);
				System.out.println(buf);
			}
			
			int ageAvg = ageTotal / cnt;
			int salAvg = salTotal / cnt;
			
			System.out.println("--------------------");
			System.out.print("平均");
			form.applyPattern("###");
			buf = "    "  + form.format(ageAvg);
			buf = buf.substring(buf.length() - 5);
			System.out.print(buf);
			form.applyPattern("\\###,###");
			buf = "          " + form.format(salAvg);
			buf = buf.substring(buf.length() - 11);
			System.out.println(buf);
		} else {
			System.out.println("---------------------");
			System.out.println("入力データがありません");
		}
	}
}