package ex05;

/*
 定義Obj類別，這個類別包含a,b兩個資料成員，Obj建構式
 當new Obj物件實體時，會執行該建構式來初始化物件。
 */
class Obj//定義Obj類別
{
	int a , b;
	/*
	[修飾子][static]<傳回值型別><method名稱>(引數串列)[throws<例外名稱>]
	{
		程式區段
		return運算式
	}
	*/
	Obj()//定義Obj建構式
	{
		a = 10;
		b = 15;
	}
}

public class CallByRef {
	public static void main(String[] args)	
	{
		/*
		使用Obj類別建立obj物件時，會先執行第17~21行的Obj建構式，
		將obj物件的a初始化為10，b初始化為15。執行此程式後，
		Stack會配置一個空間來放置obj物件實體的參考位址
		Heap會配置一個空間來放置obj物件實體	 
		*/
		Obj obj = new Obj();
		//印出傳值呼叫前的結果∶obj.a=10  obj.b=15
		System.out.println("參考呼叫前\t a=" + obj.a + "\t b=" + obj.b);
		byRef(obj);//呼叫byRef參考呼叫的方法
		System.out.println("參考呼叫後\t a=" + obj.a + "\t b=" + obj.b);
	}
	

	/*
	[修飾子][static]<傳回值型別><method名稱>(引數串列)[throws<例外名稱>]
	{
		程式區段
		return運算式
	}
	*/
  //[static]<傳回值型別><method名稱>(引數串列)
	static void byRef(Obj p)//a=10,b=15
	{
		p.a = 30;
		p.b = 40;
//		int t;
//		t = p.a;
//		p.a = p.b;
//		p.b = t;
	}

}
