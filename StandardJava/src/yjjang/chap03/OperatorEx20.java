package yjjang.chap03;
class OperatorEx20
{ 
      public static void main(String[] args) 
      { 
            // i가 1부터 10이 될 때까지, {}안의 문장을 반복수행
            for(int i=1; i <=10; i++) { 
                  if(i%3==0) {       // i가 3으로 나누어 떨어지면 3의 배수이므로 출력
                         System.out.println(i); 
                  } 
            } 
      } 
} 