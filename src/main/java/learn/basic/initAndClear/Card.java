package learn.basic.initAndClear;

public class Card {
	Tag tag1=new Tag(1);
	Card(){
		System.out.println("Card()");
		t3=new Tag(33);
	}
	Tag t2=new Tag(2);
	void f(){
		System.out.println("f()");
	}
	Tag t3=new Tag(3);
}
