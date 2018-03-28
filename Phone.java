package com.gmail.gak.artem;

public class Phone {
	private String number;
	private Network network;

	public Phone(Network network, String number) {
		this.network = network;
		this.number = number;
	}

	public void register() {
		this.network.registerPhone(this);
	}

	public boolean call(String number) {
		return this.network.call(number);
	}

	public void incomingCall() {
		// do something
	}

	public String getNumber() {
		return number;
	}

}
