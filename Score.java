package ex05;

public class Score {

	public static void main(String[] args) {
		//使用for迴圈逐一由args[]取得命令列輸入的資料，然後顯示出來
		for(int i=0; i<args.length; i++)
		{
			System.out.println("座號" + (i+1) + "同學成續" + args[i]);
		}
	}

}
