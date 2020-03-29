import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
public static void main(String[] args) {
	
	LinkedList<String> ll=new LinkedList<String>();
	
	ll.addFirst("australia");
	ll.add("brazil");ll.add("china");ll.add("denmark");ll.add("egypt");ll.add("france");
	ll.add("germany");ll.add("hong kong");ll.add("india");ll.add("japan");ll.add("kenya");
	ll.add("lithuania");ll.add("mexico");ll.add("netherlands");ll.add("oman");ll.add("pakistan");
	ll.add("qatar");ll.add("russia");ll.add("switzerland");ll.add("turkey");
	ll.add("united kingdom");ll.add("vietnam");ll.add("yemen");ll.addLast("zimbabwe");
	
	ll.add(9, "itly");
	
    int s = ll.size();
	System.out.println("size:"+s);

	boolean	c=ll.contains(12);
    System.out.println("contains:"+c);
    
    boolean cl=ll.containsAll(ll);
    System.out.println("ContainsAll:"+cl);
      
    boolean e= ll.isEmpty();
       System.out.println("isEmpty:"+e);
       
    boolean al= ll.addAll(ll);
     System.out.println("addAll:"+al);
     
    String gf=ll.getFirst();
	System.out.println("getFirst:"+gf);
	
	String gi=ll.get(23);
	System.out.println("get:"+gi);
	
	String gl= ll.getLast();
	System.out.println("getLast:"+gl);
	
	String rf=ll.removeFirst();
	System.out.println("removeFirst:"+rf);
	
	 String rl= ll.removeLast();
	 System.out.println("removeLast:"+rl);
		
	Object con = ll.clone(); 
	System.out.println("clone:"+con);
	
	Iterator<String> itr = ll.iterator();
	while (itr.hasNext()) 
	System.out.println("iterator:"+itr.next());	
	
	///Iterator<String> di = ll.descendingIterator();
	///while(di.hasNext())
	///	System.out.println("descending Iterator:"+di);
	
	///ListIterator<String> li = ll.listIterator();
	//while (li.hasNext()) 
	//System.out.println("List Iterator:"+li);
	
	//ListIterator<String> li2 = ll.listIterator(12);
	//while(li2.hasNext())
	//	System.out.println("ListIterator(int Index):"+li2);
	
  }
}
