package com.gmail.gak.artem;

public class Network {
	private static Network instance = null;
	private Phone[] numbers;

	public Network() {
		this.numbers = new Phone[0];
	}
	
	public static Network getInstance() {
		if (instance == null)
			instance = new Network();

		return instance;
	}

	public void registerPhone(Phone phone) {
		this.resizeNumberArray();
		this.numbers[this.numbers.length - 1] = phone;
	}

	private void resizeNumberArray() {
		int total = this.numbers.length;
		Phone[] buffer = new Phone[total + 1];
		System.arraycopy(this.numbers, 0, buffer, 0, total);
		this.numbers = buffer;
	}

	public boolean call(String number) {
		int index = this.getPhoneIndexByNumber(number);

		if (index == -1) {
			return false;
		}

		this.numbers[index].incomingCall();

		return true;
	}

	private int getPhoneIndexByNumber(String number) {
		int index = -1;

		for (int i = 0; i < numbers.length; ++i) {
			if (this.numbers[i].getNumber().equals(number)) {
				index = i;
				break;
			}
		}

		return index;
	}
}
