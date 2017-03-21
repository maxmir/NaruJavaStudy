package eypark.chap02;

public class StringTest {
	public static void main(String[] args) {
		String a = 7 + " ";//7 
		String b = " " + 7;// 7
		String c = 7 + "";//7
		String d = "" + 7;//7
		String e = "" + "";
		String f = 7 + 7 + "";//14
		String g = "" + 7 + 7;//77 - 문자열과 어떤 타입의 변수도 덧셈연산 수행 시 결과는 "문자열"
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
	}
}
