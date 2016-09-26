package ex;

import java.util.Scanner;


/*
 * Topic: 電話公司的計費方式是 600分鐘以下每分鐘0.5元；
 * 	600~1200分鐘電話費以9折計算；1200分鐘以上電話費以79折計算，
 *  讓使用者輸入單月使用分時間(分鐘)，算出電話費(元)
 * Date: 2016/09/26
 * Author: 105791120 楊鈺瑩
 */

public class ex01_1050210XX {

	public static void main(String[] args) {
	 Scanner sca = new Scanner(System.in);
	 System.out.println("請輸入分鐘");
		int n;
		n=sca.nextInt();
		float p=(float) 0.5;
		int d=0;
		if(n<600)
		{
			d=(int) (n*p);
		}
		else
		{
			if(n<1200)
			{
				d=(int) (n*p*0.9);
			}
			else
			{
				d=(int) (n*p*0.79);
			}
			
		}
	System.out.print("請輸出話費"+d);
	}

}
