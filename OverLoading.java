package ex05;

/*
  overload=>同一個類別中，允許方法使用相同名稱，但是後面所接的引數串列必須是
  1∶資料型別不同
  2：個數不同
  3：順序不同
  3個其中一項符合即可 
 */
//撰寫2個max的靜態方法(overload)
public class OverLoading {
	static int max(int x, int y)
	{
		if (x > y)
		{
			return x;
		}
		else
		{
			return y;
		}
	}
	
	
	//陣列元素{2.1, 5.3, 7.2, 9.8}
	static double max(double[] vArray)
	{
		double n = vArray[0];
		for (int i=1; i<=vArray.length-1; i++)
		{
			if (vArray[i] > n)
			{
				n = vArray[i];
			}
		}
		return n;
	}
	
	static int max(int[] vArray)
	{
		int n = vArray[0];
		for (int i=1; i<vArray.length; i++)
		{
			if (vArray[i] > n)
			{
				n = vArray[i];
			}
		}
		return n;
	}
	
	
	

	public static void main(String[] args) {
		int a = 26, b = 37;
		int c = max(a,b);
		System.out.println(a + "和" + b + "最大的數值為" + c );
		
	//	宣告並同時建立陣列物件實體
	//	double f[] = new double[] {2.1, 5.3, 7.2, 9.8};
		double f[] = {2.1, 5.3, 7.2, 8.88};
	//	int i[] = new int[]{1, 2, 3, 5};
		int i[] = {1, 2, 3, 6};
		System.out.println("陣列元素{2.1, 5.3, 7.2, 8	.88}中最大的值為" + max(f));
		System.out.println("陣列元素{1,2,3,6}中最大的值為" + max(i));
	}
}
