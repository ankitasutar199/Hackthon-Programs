package Hackthonprograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Array_list {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Total number of array list elements: ");
		int s = sc.nextInt();
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		System.out.println("Enter the elements of first array list: ");
		for (int i = 0; i < s; i++)
		{
		list1.add(sc.nextInt());
		}
		System.out.println("Enter the elements of second array list: ");
		for (int i = 0; i < s; i++)
		{
		list2.add(sc.nextInt());
		}
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		list3 = display(list1, list2);
		System.out.println("Outpt: ");
		Iterator<Integer> iterator = list3.iterator();
		while (iterator.hasNext()) 
		{
		int n = iterator.next();
		System.out.println(n);
		}
	}
		
        public static ArrayList<Integer> display(ArrayList<Integer>list1 , ArrayList<Integer> list2)
		{
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		for (int i = 0; i < list1.size(); i++) {
		if (i % 2 == 0)
		list3.add(list2.get(i));
		else
		list3.add(list1.get(i));
		}
		return list3;
		}

}
