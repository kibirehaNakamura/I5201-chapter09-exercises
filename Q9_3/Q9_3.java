public class Q9_3 {
	public static void main(String[] args) {
		KeyIn ki = new KeyIn();
		
		String lname = ki.readString("名字を入力:");
		String fname = ki.readString("名前を入力:");
		
		String gender;
		while(true) {
			gender = ki.readString("性別を入力(M,F):");
			if(gender.equals("M")) {
				gender = "男性";
				break;
			} else if(gender.equals("F")) {
				gender = "女性";
				break;
			} else {
				System.out.println("性別の入力に誤りがあります");
			}
		}
		
		int age;
		while(true) {
			String buf = ki.readString("年齢を入力:");
			try {
				age = Integer.parseInt(buf);
				break;
			} catch(NumberFormatException e) {
				System.out.println("年齢の入力に誤りがあります : " + buf);
			}
		}
		System.out.println("氏名:" + lname + " " + fname + " 性別:" + gender + " 年齢:" + age + "歳");
	}
}