/**
 * @author jhkim
 * CodeToChar.java
 * 2017. 5. 18.
 */
package jhKim.ch02;

public class CodeToChar_2_2 {
    public static void main(String... args) {
        int code1 = 65;
        int code2 = 0x005a;
        char ch1 = (char)code1;
        char ch2 = (char)code2;
        char ch3 = (char)94;
        
        System.out.println("code1 -> "+code1);
        System.out.println("code2 -> "+code2);
        System.out.println("ch1   -> "+ch1  );
        System.out.println("ch2   -> "+ch2  );
        System.out.println("ch3   -> "+ch3  );
        
//        for(int i = 0; i < 65536; i++) {
//            System.out.print((char)i);
//            if (i % 60 == 0) System.out.println();
//        }
    }
}
