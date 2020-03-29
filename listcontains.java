import java.util.ArrayList;
import java.util.List;

public class listcontains {
public static void main(String[] args) {
	List<String>l=new  ArrayList<String>();
	l.add("one");
	l.add("two");
	l.add("three");
	l.add("four");
	l.add("six");
	l.add("seven");
	l.add(4, "five");
	
	boolean contain=l.contains(2);
	boolean contain1=l.containsAll(l);
	System.out.println(contain);
	System.out.println(contain1);
}
}
