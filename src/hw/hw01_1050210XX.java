package hw;

import java.io.InputStream;
import java.util.Scanner;

public class hw01_1050210XX {

	public static void main(String[] args) {
		Scanner sca= new Scanner(System.in);
		int[] a=new int[4];
		int[] ans=new int[4];
		for(int i=0;i<4;i++)
		{
			a[i]=sca.nextInt();
		}
		int leave = a[0]-(a[1]*15+a[2]*20+a[3]*30);
		
		if(leave<0)
		{
			System.out.println(0);
		}
		else
		{
			ans[0]=leave/50;
			ans[1]=(leave%50)/5;
			ans[2]=(leave%50)%5;
			for (int i=0;i<3;i++)
			{
				System.out.println(ans[i]);
			}
		}
	}

	}
