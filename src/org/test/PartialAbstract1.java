package org.test;

public class PartialAbstract1 extends PartialAbstract {

	

	@Override
	public void saving() {
		System.out.println("4");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deposit() {
		System.out.println("00");
		// TODO Auto-generated method stub
		
	}

public static void main(String[] args) {
	PartialAbstract1 e=new PartialAbstract1();
	e.saving();
	e.fixed();
	e.deposit();
}
	
	
	
	
	
}
