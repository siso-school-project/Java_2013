import java.util.Scanner;
/*
爱因斯坦出了一道这样的数学题：
有一条长阶梯，若每步跨2阶，则最最后剩一阶，
若每步跨3 阶，则最后剩2阶，
若每步跨5阶，则最后剩4阶，
若每步跨6阶则最后剩5阶。
只有每次跨7阶，最后才正好一阶不剩。
请问这条阶梯共有多少阶？
*/
public class  BT037
{
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		for (int i=1; ;i++ )
		{
			if (i%2==1 && i%3==2 && i%5== 4 &&
				i%6==5 && i%7==0)
			{
				System.out.println("这条阶梯共有："+i);
				break;
			}
		}
	}
}