package hw;

import java.util.Scanner;

public class hw02_1050210XX {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		double ans,hight;
		int sex;
		hight = sca.nextDouble();
		sex = sca.nextInt();
		if(sex==1)
		{
			System.out.println((hight-80.0)*0.7);
		}
		else
		{
			System.out.println((hight-70.0)*0.6);
		}
		
	}

}
