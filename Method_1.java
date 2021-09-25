package ex05;

public class Method_1 {

	public static void main(String[] args) 
	{
		factorial(6);//呼叫factorial的靜態方法
		factorial(9);//呼叫factorial的靜態方法
	}


	/*
	[修飾子][static]<傳回值型別><method名稱>(引數串列)[throws<例外名稱>]
	{
		程式區段
		return運算式
	}
	*/
//  static 傳回值型別 method名稱(引數串列)
	static void factorial(int x)//建立可傳入引數沒有回傳值的factorial的靜態方法
	{
		int i = x, j = 1;
		while(i > 0)
		{
			j *= i--;
		}
		System.out.println(x + "!=" + j);	
	}
}
