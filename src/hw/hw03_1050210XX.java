package hw;

import java.util.Scanner;

public class hw03_1050210XX {

	public static void main(String[] args) {
	Scanner sca = new Scanner(System.in);
     int n=sca.nextInt();
     if((n%400==0)|| (n%4==0&&n%100!=0))
     {
    	 System.out.println("閏年");
     }
     else 
     {
    	 System.out.println("不是閏年");
     }
	}

}
