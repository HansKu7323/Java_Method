package ex05;

public class BubbleSort {

	public static void main(String[] args) {
		int i;
		int[] myArray = new int[] {69,91,12,56,23,78};
		System.out.print("排序前->");//印出排序前->
		//用Enhance取出陣列myArray的值，array中(排序前的值)
		for(int array:myArray)
			System.out.print(" " + array);
		
		//用for取出myArray裡的所有值
//		for (i=0; i<myArray.length; i++)
//		{
//			System.out.print(" " + myArray[i]);
//		}
		System.out.println();
		bSort(myArray);//呼叫bSort靜態方法，並將myArray陣列傳入
		System.out.print("排序後->");
		//用Enhance取出陣列myArray的值，arraya中(排序後的值)
		for(int array:myArray)
			System.out.print(" " + array);
		
		//用for取出myArray裡的所有值
//		for (i=0; i<myArray.length; i++)
//		{
//			System.out.print(" " + myArray[i]);
//		}
	}
		
	/*
	[修飾子][static]<傳回值型別><method名稱>(引數串列)[throws<例外名稱>]
	{
		程式區段
		return運算式
	}
	*/
	  //[static]<傳回值型別><method名稱>(引數串列)
		static void bSort(int[] vArray)
		{
//			Array.sort(vArray);
			
			int tmp, i, j;
			for (i=vArray.length-2; i>=0; i--)
			{
				for(j=0; j<=i; j++)
				{
					if(vArray[j] > vArray[j+1])
					{
						tmp = vArray[j];
						vArray[j] = vArray[j+1];
						vArray[j+1] = tmp;
						
					}			
				}	
			}
		}
}
