package ex05;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = new int[] {31,72,32,66,15,1,61,24,59,38,71,35,10,96,84,78,65,60,11,47};
		System.out.print("未排序陣列 =>");
		printArray(arr);
		qSort(arr, 0, arr.length -1);
		System.out.print("\n排序後陣列 =>");
		printArray(arr);
	}


	static void printArray(int[] a)
	{
		for(int i:a) {
			System.out.print(i + " ");
		}
//		for(int i=0; i<a.length; i++)
//		{
//			System.out.print(a[i] + " ");
//		}
	}
	
	//qSort()方法傳入值為陣列名稱a，起始陣列註標為m，結尾陣列註標為n
	static void qSort(int[] a, int m, int n)
	{
		if ( m>=n)//m>=n，結束遞迴
		{
			return;
		}
		
		/*
		 * 以起始註標m加上結尾註標n再除以2，取的中間值並讀取該陣列元素, 
		 * 稱為基準(pivot)，且將此陣列一分為二。
		 * 起始註標及結尾註標分別給i和j
		 * 
		 * */
		int i=m, j=n, pivot = a[ (m+n)/2 ];
		while(i <= j)
		{
			while(a[i] < pivot)
			{
				i++;
			}
			while(a[j] > pivot)
			{
				j--;
			}
			if (i < j)
			{
				int t = a[i];
				a[i] = a[j];
				a[j] = t;
				i++;
				j--;
				
			}
			else if(i == j)
			{
				i++;
			}
			
		}
		qSort(a,m,j);//遞迴呼叫qSort排序前半段
		qSort(a,i,n);//遞迴呼叫qSort排序後半段
	}
	
}
