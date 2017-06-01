/**
 * @author jhkim
 * StringTest_2_4.java
 * 2017. 6. 1.
 */
package jhKim.ch02;

public class StringTest_2_4 {
    public static void main(String... args) {
        String a = 7 + " ";
        String b = " " + 7;
        String c = 7 + "";
        String d = "" + 7;
        String e = "" + "";
        String f = 7 + 7 + "";
        String g = "" + 7 + 7;
        
        System.out.println("a -> [" + a + "]");
        System.out.println("b -> [" + b + "]");
        System.out.println("c -> [" + c + "]");
        System.out.println("d -> [" + d + "]");
        System.out.println("e -> [" + e + "]");
        System.out.println("f -> [" + f + "]");
        System.out.println("g -> [" + g + "]");
        
        class TestInner {
            int ti = 0;
            String ts = "test";
            
            @Override
            public String toString() {
//                return String.valueOf(ti);
//                return String.valueOf(ts);
//                return String.valueOf(this.getClass());
                return "TestInner";
            }
        }
        
        TestInner ti = new TestInner();
        System.out.println("int add obj -> " + ti + 7);
        System.out.println("int add obj -> " + 7 + ti);
    }
}
