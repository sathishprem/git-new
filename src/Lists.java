

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import java.util.Set;


public class Lists {

public static void main(String[] args) {
	ArrayList<Integer> li=new ArrayList<Integer>();
	li.add(10);
	li.add(100);
	li.add(101);
	li.add(102);
	li.add(103);
	System.out.println(li);
	int a=li.size();
	System.out.println(a);
	int sew=li.get(1);
	System.out.println(sew);
	boolean contains = li.contains(10);
	System.out.println(contains);
	int indexof = li.indexOf(102);
	System.out.println(indexof);
	 boolean equals = li.equals(li);
	System.out.println(equals);
	int lastindexof = li.lastIndexOf(103);
	System.out.println(lastindexof);
	int set = li.set(2, 4);
	System.out.println(set);
	int remove = li.remove(2);
	System.out.println(remove);
	for(Integer integer2:li) {
		System.out.println(integer2);
}
	System.out.println(li);
	
	Set<Integer> li1 = (Set<Integer>) new ArrayList<Integer>();
	li1.addAll(li);
	System.out.println(li1);
	li1.add(500);
	li1.add(1500);
	li1.add(2500);
	li1.add(500);
	System.out.println(li1);
	li1.removeAll(li);
	System.out.println(li1);
	li1.retainAll(li);
	System.out.println(li1);
	
}
}