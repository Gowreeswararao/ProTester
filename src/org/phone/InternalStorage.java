package org.phone;

public class InternalStorage {
	private void processerName() {
		System.out.println("processerName is Apple A15");
	}
	private void ramSize() {
		System.out.println("ramSize is 8gb");
	}
public static void main(String[] args) {
	InternalStorage p=new InternalStorage();
	ExternalStorage v=new ExternalStorage();
	p.processerName();
	p.ramSize();
	v.size();
	
}
}
