package yjjang.chap04;
class FlowEx6
{
	public static void main(String[] args) 
	{
		
		int score = (int)(Math.random() * 10) + 1;

		switch(score*100) {
			case 100 :
				System.out.println("점수 : 100, 상품: 자전거");
				break;
			case 200 :
				System.out.println("점수 : 200, 상품 : TV");	
				break;
			case 300 :
				System.out.println("점수 : 300, 상품 : 노트북");
				break;
			case 400 :
				System.out.println("점수 : 400, 상품 : 자동차");
				break;
			default :
				System.out.println("죄송하지만 당신의 점수에 해당상품이 없습니다.");
		}
	}
}