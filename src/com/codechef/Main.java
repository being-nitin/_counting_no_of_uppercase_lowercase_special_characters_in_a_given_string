package com.codechef;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*

	 */
    Scanner sc = new Scanner(System.in);
    String s;
    s = sc.next();
    int countc=0,counts=0,countsc=0;
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)<='z' && s.charAt(i)>='a'){
            counts++;
        }
        else if(s.charAt(i)<='Z' && s.charAt(i)>='A'){
            countc++;
        }
        else{
            countsc++;
        }
    }
        System.out.println("the no of upper case characters are:"+countc+"and lower case are"+counts+"and special characters are"+countsc);
    }
}
