package ex;

import java.util.Scanner;
/*
 * Topic: 有一圓形，直徑為200，且中心座標為(0,0)。
 * 	請寫一支程式可以輸入「點」的座標，並判斷「點」是否在圓形的範圍內。
 * 	如果「點」的位置剛好在邊界的話也算是在圓形範圍內(例：x=100，y=0)。
 * Date: 2016/09/26
 * Author: 105791120 楊鈺瑩
 */

public class ex02_1050210XX {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		double x=sca.nextDouble();
		double y=sca.nextDouble();
		if(x*x+y*y<=200*200)
			System.out.println("在園內");
		else
		{
			System.out.println("不是");
		}
	}

}
