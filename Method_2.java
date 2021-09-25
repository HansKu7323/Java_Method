package ex05;

public class Method_2 {

	public static void main(String[] args) 
	{
		int n1 = 7, n2 = 8;
		int fac1, fac2;
		fac1 = factorial(n1);
		fac2 = factorial(n2);
		System.out.println(n1 + "!=" + fac1);
		System.out.println(n2 + "!=" + fac2);
	}


	/*
	[修飾子][static]<傳回值型別><method名稱>(引數串列)[throws<例外名稱>]
	{
		程式區段
		return運算式
	}
	*/
//  static 傳回值型別 method名稱(引數串列)
	static int factorial(int x)//建立可傳入引數有回傳值的factorial的靜態方法
	{
		int i = x, j = 1;
		while(i > 0)
		{
			j *= i--;
		}
		return j;	
	}
	
}
