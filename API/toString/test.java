package API.toString;

import java.util.Random;
import java.util.Scanner;

import API.equals.Person;

public class test {
	public static void main(String[] args) {
		Person p=new Person("dqda",12);
		String s=p.toString();
		System.out.println(p);
		System.out.println(s);
		
		Random r=new Random();
		System.out.println(r.toString());
		
		Scanner sc=new Scanner(System.in);
		System.out.println(sc.toString());
	}

}
