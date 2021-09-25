package ex05;

public class AddNums {
	/*語法中使用...就代表不定個數引數(可變動引數)，
	可變動引數個數的方法，就是將引數組合成一個陣列*/
	static int add (int... a)
	{
		int sum = 0;
		//用enhanced迴圈來讀取陣列a的元素值，傳到i，並加到sum中
		for(int i : a)
		{
			sum += i;
		}
		return sum;//傳回陣列a元素相加的結果
	}



	public static void main(String[] args) {
		System.out.printf("%d%n", add());//沒有傳入引數
		System.out.printf("%d%n", add(2,4));//傳入2個整數引數
		System.out.printf("%d%n", add(1,3,5));//傳入3個整數引數
		System.out.printf("%d%n", add(2,4,6,8));//傳入4個整數引數
	}
	
}
