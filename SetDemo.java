import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Stream;

public class SetDemo {
public static void main(String[] args) {
	Set<String> s=new HashSet<String>();
	
	s.add("adobe photoshop");
	s.add("corel draw");s.add("Excel");
	s.add("Front page");s.add("Hyper Terminal");s.add("ICQ");
	s.add("Microsoft Word");s.add("Outlook");s.add("Plus!");s.add("Qmodem Pro");
	s.add("Real Player ");s.add("skype");s.add("Terminal");
	
	boolean c = s.contains(s);
	System.out.println("contains:"+c);
	
	boolean cl=s.containsAll(s);
	System.out.println("containsAll:"+cl);
	
	boolean e=s.equals(s);
	System.out.println("equals:"+e);
	
	int h=s.hashCode();
	System.out.println("hashcode:"+h);
	
	boolean ie=s.isEmpty();
	System.out.println("isEmpty:"+ie);
	
	boolean al=s.addAll(s);
	System.out.println("addAll:"+al);
	
	boolean r=s.remove(s);
	System.out.println("remove:"+r);
	
	boolean rl=s.removeAll(s);
	System.out.println("removeAll:"+rl);
	
	int size=s.size();
	System.out.println("size:"+size);
	
	
	
	Iterator<String> itr = s.iterator();
	while(itr.hasNext())
		System.out.println("Iterator:"+itr);
	
}
}
