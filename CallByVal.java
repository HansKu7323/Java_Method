package ex05;

public class CallByVal {

	public static void main(String[] args) {
		int a = 10, b = 15;
		System.out.println("傳值呼叫前\ta="+ a + "\tb=" + b);
		System.out.println("傳值呼叫前\ta+b="+ a + b);
		byVal(a,b);
		System.out.println("傳值呼叫後\ta="+ a + "\tb=" + b);
		System.out.println("傳值呼叫後\ta+b="+ a + b);
	}
	static void byVal(int x, int y)
	{
//		int t;
//		t = x;
//		x = y;
//		y = t;
		System.out.println("傳值呼叫中\tx="+ x + "\ty=" + y);
	}

}
