import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ArrayListDemo {
public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<String>();
	
	al.add("ant");al.add("bear");al.add("cat");al.add("dog");al.add("elephant");al.add("fox");
	al.add("giraffe");al.add("hen");al.add("insect");al.add("jaguar");al.add("kangaroo");al.add("lion");
	al.add("monkey");al.add("newt");al.add("oyster");al.add("penguin");al.add("quail");al.add("rabbit");
	al.add("snake");al.add("tiger");al.add("uakari");al.add("vulture");al.add("wolf");
	al.add("x-ray tetra");al.add("yak");al.add("zebra");
	
	int size = al.size();
	System.out.println("size:"+size);
	
	String g=al.get(5);
	System.out.println("get:"+g);
	
	boolean e=al.isEmpty();
	System.out.println("Empty:"+e);
	
	boolean c=al.contains(al);
	System.out.println("contains:"+c);
	
	System.out.println("IndexOf:"+al.indexOf("ant"));
	System.out.println("LastIndexOf:"+al.lastIndexOf("zebra"));
	
	boolean r = al.remove("uakari");
	System.out.println("remove:"+r);
	
	boolean w = al.addAll(al);
	System.out.println("addAll:"+w);
	
	Object cl = al.clone();
	System.out.println("clone:"+cl);
	
	List<String> sub = al.subList(6, 16);
	System.out.println("sub:"+sub);
	
	String ts = al.toString();
	System.out.println("toString:"+ts);
	
	String[] ta=al.toArray(new String[al.size()] );
	System.out.println("toArray:");
	for (String str : ta) {
		System.out.println(str);
	}
	Iterator<String> itr = al.iterator();
	while(itr.hasNext())
		System.out.println("Iterator:"+itr.next());
	
	  al.add(1, "beetle");
	
	
	al.add("umberllabird");
	
	

}
}
