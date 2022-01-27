package com.mycompany.eb.Assignments;

import java.util.*;

public class Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> locationsQueue = new LinkedList<>();
		                locationsQueue.add("Kolkata");
		        		locationsQueue.add("Patna");
		        		locationsQueue.add("Delhi");
		        		locationsQueue.add("Gurgaon");
		        		locationsQueue.add("Noida");
		System.out.println("Queue is : " + locationsQueue);
		        		System.out.println("Head of Queue : " + locationsQueue.peek());
		        		locationsQueue.remove();
		        		System.out.println("After removing Head of Queue : " + locationsQueue);
		        		System.out.println("Size of Queue : " + locationsQueue.size());



	}

}
