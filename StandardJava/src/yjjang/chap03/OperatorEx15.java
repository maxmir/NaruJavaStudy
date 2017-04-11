package yjjang.chap03;
class OperatorEx15
{ 
      public static void main(String[] args) 
      { 
            char c = 'a'; 
            for(int i=0; i<26; i++) {          //블럭{} 안의 문장을 26번을 반복한다.
                        System.out.print(c++); //'a'부터 26개의 문자를 출력한다.
            } 
            
            System.out.println(); // 줄바꿈

            c = 'A'; 
            for(int i=0; i<26; i++) {          // 블럭{} 안의 문장을 26번 반복 
                        System.out.print(c++); // 'A'부터 26개의 문자를 출력
            } 

            System.out.println(); 

            c='0'; 
            for(int i=0; i<10; i++) {          //
                        System.out.print(c++); //
            } 
            System.out.println(); 
      } 
} 