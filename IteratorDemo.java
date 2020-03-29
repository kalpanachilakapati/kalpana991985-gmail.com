import java.util.Iterator;
import java.util.Vector;

public class IteratorDemo {

	public static void main(String[] args) {
		 Vector<String> v=new Vector<String>();

	       v.add("aster"); 
	       v.add("beli"); 
	       v.add("camelia"); 
	       v.add("english blue bell"); 
	       v.add("flax flower"); 
	       v.add("gardenia"); 
	       v.add("hypericum"); 
	       v.add("iris");
	       v.add("jasmine"); 
	       v.add("kalmia"); 
	       v.add("lily"); 
	       v.add("marigold"); 
	       v.add("narcissus");
	       v.add("orchid"); 
	       v.add("petunia"); 
	       v.add("quince"); 
	       v.add("rose "); 
	       v.add("sunflower");
	       v.add("tulips"); 
	       v.add("ursinia"); 
	       v.add("violet"); 
	       v.add("water lily");
	       v.add("xylosma"); 
	       v.add("yellow bell"); 
	       v.add("zinnia");
	     //Iterator
	       Iterator<String > itr=v.iterator();
	      while(itr.hasNext())
	      System.out.println(itr.next());
	      
	}
}
