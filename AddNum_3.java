package ex05;

public class AddNum_3 {
	
	//	傳回2個整數(int)相加的方法
	//  static 傳回值型別 method名稱(引數串列)
	//	同一類別內的靜態方法，只要直接撰寫該方法名稱(add)與引數串列即可
		static int add(int a, int b)//傳值方法
		{
			return a + b;//傳回2個整數(int)相加的結果
		}
		
	public static void main(String[] args) {
		int total1; 
//		int x=17, y=28;
		double total2;
//		double i=3.8, j=22.7, k=15.1;
//		total1 = add(x,y);
		
//		同一類別內的靜態方法，只要直接撰寫該方法名稱(add)與引數串列即可
		total1 = add(20,40);
//		total2 = add(i,j,k);
//		不是靜態方法，必須先用new建立該類別物件實體才可以呼叫add方法
		Num2 c2 = new Num2();
		total2 = c2.add(3.3,3.33,3.333);
		System.out.printf("%d%n", total1);
		System.out.printf("%f%n", total2);

	}
	
}

class Num2
{
	//	傳回3個倍精確度數值(double)數相加的方法
	//  傳回值型別 method名稱(引數串列)
	//	不是靜態方法，必須先用new建立該類別物件實體才可以呼叫add方法
		double add(double a, double b,double c)//傳值方法
		{
			return a + b + c;//傳回3個倍精確度數值(double)數相加的結果
		}
}
	
	


