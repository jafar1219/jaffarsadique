package org.test;

public class Sbi extends Icici {
	public void fixed(){
		System.out.println("66");
	}
	public void saving(int ds){
		System.out.println("99");
	}
	public static void main(String[] args) {
		Sbi i=new Sbi();
		i.fixed();
		i.saving(6);
		i.deposit();
		
	}

}
