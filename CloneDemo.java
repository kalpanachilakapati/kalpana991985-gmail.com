import java.util.ArrayList;

public class CloneDemo {
public static void main(String[] args) {
	
ArrayList<String> al=new ArrayList<String>();
	
	al.add("ant");al.add("bear");al.add("cat");al.add("dog");al.add("elephant");al.add("fox");
	al.add("giraffe");al.add("hen");al.add("insect");al.add("jaguar");al.add("kangaroo");al.add("lion");
	al.add("monkey");al.add("newt");al.add("oyster");al.add("penguin");al.add("quail");al.add("rabbit");
	al.add("snake");al.add("tiger");al.add("uakari");al.add("vulture");al.add("wolf");
	al.add("x-ray tetra");al.add("yak");al.add("zebra");
	
	 Object col = al.clone();
	 System.out.println(col);
}
}
