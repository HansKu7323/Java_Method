package ex05;

public class Recursive {
	
	//建立名稱f()靜態方法
	static int f(int n) 
	{
		if ( n == 1)//當傳入值=1時，結束遞迴呼叫
		{
			return n;
		}
		else
		{
			return n + f(n-1);//
		}
	}

	public static void main(String[] args) {
		int sum1 = f(10);  //呼叫方法f()
		int sum2 = f(100); //呼叫方法f()
		
		System.out.println("10+9+...+2+1=" + sum1);
		System.out.println("100+90+...+2+1=" + sum2);
	}

}
