package yjjang.chap05;

class ArrayEx8
{
	public static void main(String[] args) 
	{
		String src = "ABCDE";

		for(int i=0; i < src.length(); i++) 
			System.out.println("src.charAt("+i+"):"+ src.charAt(i));
	}
}