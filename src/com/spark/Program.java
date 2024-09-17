package com.spark;

import java.util.Scanner;

class Program {

	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		//task_0
		System.out.println("Hello, World.");
        System.out.println("Hello, Java.");
        
        //task_1
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        //task_2
        int N = scan.nextInt();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(N % 2 != 0 || N >= 6 && N <= 20){
            System.out.println("Weird");
        }
        else{
            System.out.println("Not Weird");
        }
        scan.close();
	}
}

