package com.gmail.gak.artem;

public class Main {

	public static void main(String[] args) {
		Network network = Network.getInstance();
		
		Phone phone01 = new Phone(network, "+380661234567");
		Phone phone02 = new Phone(network, "+380501234569");
		Phone phone03 = new Phone(network, "+380501232311");
				
		phone01.register();
		phone02.register();
		phone03.register();
		
		testCall(phone01, "+380501234569");
		testCall(phone03, "+380501232311");
		
	}
	
	public static void testCall(Phone phone, String number) {
		System.out.println("");
		System.out.println("--------- test call -----------");
		System.out.println("tel: " + number);
		
		if(!phone.call(number)) {
			System.out.println("Subscriber does not exist!");
		} else {
			System.out.println("Waiting for connection...");
		}
	}

}
