package org.test;

public class Test2 implements Test1,Test3,Test4,Test5{

	@Override
	public void saving() {
System.out.println("jaya");		
	}

	@Override
	public void fixed() {
System.out.println("jaya");		
	}

	@Override
	public void deposit() {
System.out.println("karunanidi");		
	}

	@Override
	public void guna() {
System.out.println("thirumurugan");		
	}

	@Override
	public void rahul() {
System.out.println("seeman");		
	}

	@Override
	public void ganesh() {
System.out.println("carlmarx");		
	}

	@Override
	public void mani() {
System.out.println("carlmarx");		
	}

	@Override
	public void tamil() {
System.out.println("ambedkar");		
	}

	@Override
	public void ansari() {
System.out.println("ambedkar");		
	}
public static void main(String[] args) {
	Test2 i=new Test2();
	i.ansari();
	i.tamil();
	i.mani();
}


}
