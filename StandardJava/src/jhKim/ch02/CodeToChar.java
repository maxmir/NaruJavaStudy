/**
 * @author jhkim
 * CodeToChar.java
 * 2017. 5. 18.
 */
package jhKim.ch02;

public class CodeToChar {
    public static void main(String... args) {
        int code1 = 65;
        int code2 = 0x005a;
        char ch1 = (char)code1;
        char ch2 = (char)code2;
        char ch3 = (char)94;
        
        System.out.println(code1);
        System.out.println(code2);
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);
        
        for(int i = 0; i < 65536; i++) {
            System.out.print((char)i);
        }
    }
}
