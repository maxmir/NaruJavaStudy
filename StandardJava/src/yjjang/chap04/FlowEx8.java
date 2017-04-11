package yjjang.chap04;
class FlowEx8
{
	public static void main(String[] args) 
	{
		int score = 1;

		switch(score*100) {
			case 100 :
				System.out.println("점수 : 100, 상품 : 자전");
			case 200 :
				System.out.println("점수 : 200, 상품 : TV");	
			case 300 :
				System.out.println("점수 : 300, 상품 : 노트북");
			case 400 :
				System.out.println("점수 : 400, 상품 : 자동차");
			default :
				System.out.println("해당상품 없음");
		}
	}
}