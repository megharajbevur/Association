package com.main;

import com.association.Minister;
import com.association.run.Constituency;
import com.association.runner.IndiraCanteen;

public class Runner {

	public static void main(String[] args) {
		Minister minister = new Minister();
		System.out.println(minister.name);
		System.out.println(minister.exp);
		System.out.println("----------------------------");
		IndiraCanteen ref=minister.a;
		System.out.println(ref.breakFastPrice);
		System.out.println(ref.lunchPrice);
		System.out.println(ref.location);
		System.out.println("------------------------------");
		Constituency ref1 = ref.b;
		System.out.println(ref1.no);
		System.out.println(ref1.population);
		
		
		



	}

}
