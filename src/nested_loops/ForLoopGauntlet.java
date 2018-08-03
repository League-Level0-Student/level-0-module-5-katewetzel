package nested_loops;

import javax.swing.JOptionPane;

public class ForLoopGauntlet {
	public static void main(String[] args) {
		
//Single For-Loops
//#1
for(int i = 0;i<101;i++) {
	System.out.println(i);
}
//#2
for(int i = 100;i>(-1);i--) {
	System.out.println(i);
}
//#3
for(int i=2;i<101;i++) {
	if(i%2==0) {
		System.out.println(i);
	}
}
//#4
	for(int i = 1;i<100;i++) {
		if(i%2==0) {
			
		} else {
			System.out.println(i);
		}
	}
//#5
	for(int i =1;i<501;i++) {
		if(i%2==0) {
			System.out.println(i + " even");	
		} else {
			System.out.println(i+" odd");
		}
	}
//#6
	for(int i =0;i<778;i++) {
		if(i%7==0) {
			System.out.println(i);
		}
	}
//#7
	String age = JOptionPane.showInputDialog("How old are you?");
	int a = Integer.parseInt(age);
	for(int i=a; i>=0;i--) {
		System.out.println("In " + (2018-i) + " I was " + (a-i) + " years old.");
	}
//Nested For-Loops
//#1
for(int i=0;i<3;i++) {
	for(a=0;a<3;a++) {
	System.out.println(i + " " + a);
}
}
//#2
for(int i = 1;i<=7;i+=3) {
	for(a=i;a<=i+2;a++) {
		System.out.print(a+" ");
	}
	System.out.print(" ");
	System.out.println("");
}
//#3
for(int i=01;i<101;i+=10) {
	for(a=i;a<=i+9;a++) {
		System.out.print(a +" ");
	}
	System.out.print(" ");
	System.out.println("");
}
	
	}	
}

