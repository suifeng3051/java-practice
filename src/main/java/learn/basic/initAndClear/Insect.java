package learn.basic.initAndClear;

public class Insect extends Animation{
	int i=9;
	int j;
	Insect(){
		prt("i="+i+"j="+j);
		j=39;
	}
	static int x1=prt("static Insect.x1 initialized");
	static int prt(String s){
		System.out.println(s);
		return 47;
	}
}
