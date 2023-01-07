import java.util.Scanner;

import sun.applet.Main;

public class CountStrringWords {

public void get(String str, int y,int z) {
	
int a=y+z;
	int count=1;
int l=	str.length();
	for(int i=0;i<l;i++) {
		
		char c=str.charAt(i);
		if((c==' ') && (c+1!=' '))
			count++;
		
	}
	
	System.out.println(count);
System.out.println(a);
}


public static void main(String[] args) {
	
	CountStrringWords cs=new CountStrringWords();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter Your String...");
	String st=sc.nextLine();
System.out.println("Enter youer first number");
int s=sc.nextInt();
System.out.println("enter your last number");
int d=sc.nextInt();
	cs.get(st,s,d);
	
	
	
}	
}
	

