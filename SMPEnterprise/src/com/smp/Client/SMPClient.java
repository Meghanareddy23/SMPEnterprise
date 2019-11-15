package com.smp.Client;

import java.util.Scanner;

import com.smp.menu.SmpMenu;

public class SMPClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("----------------------------------------");
			System.out.println("         1.ADMIN                        ");
			System.out.println("         2.USER                        ");
			System.out.println("         3.BACK                        ");
			System.out.println("----------------------------------------");
			System.out.println("Enter your choice");
			int choice=0;
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
			SmpMenu.adminMenu();
			break;
			case 2:
				SmpMenu.userMenu();
				break;
				

	}

}
	}
}