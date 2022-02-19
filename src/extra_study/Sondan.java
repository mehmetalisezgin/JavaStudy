package extra_study;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sondan {

	public static void main(String[] args) {
		
		
		
		
		


	}

	public static void sondanyazdir(Class<Text> class1) {
       
		Scanner scan = new Scanner(System.in);
		System.out.println("Please write inputs...");
		Text text = new Text();
		
		text.name = scan.next(); 
		text.Surname = scan.next();
		text.age = scan.next();
		text.city = scan.next();
		
		List<String> list= new ArrayList<>();
		
		list.add(text.name);
		list.add(text.Surname);
		list.add(text.age);
		list.add(text.city);
		
		System.out.println();
		
		
	}

}
