import java.util.Collection;
import java.util.Comparator;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

public class TreeDemo {
public static void main(String[] args) {
	TreeMap<Integer, String> t=new TreeMap<>();
	t.put(1, "avocet");
	t.put(2, "bittern");
	t.put(3, "crow");
	t.put(4, "dipper");
	t.put(5, "eider");
	t.put(6, "fulmar");
	t.put(7, "garganey");
	t.put(8, "hobby");
	t.put(9, "iceland gull");
	t.put(10, "jay");
	t.put(11, "kingfisher");
	t.put(12, "lapwing");
	t.put(13, "mallard");
	t.put(14, "nuthatch");
	t.put(15, "owl");
	t.put(16, "parrot");
	t.put(17, "quail");
	t.put(18, "raven");
	t.put(19, "starling");
	t.put(20, "teal");
	t.put(21, "velvet scoter");
	t.put(22, "whinchat");
	
	String g = t.get(21);
	System.out.println("get:"+g);
	
	boolean e=t.isEmpty();
	System.out.println("empty:"+e);
	
	boolean ck = t.containsKey(13);
	System.out.println("containsKey:"+ck);
	
	boolean cv = t.containsValue("owl");
	System.out.println("containsValue:"+cv);
	
	Set<Integer> ks = t.keySet();
	System.out.println("keySet:"+ks);
	
	Collection<String> v = t.values();
	System.out.println("values:"+v);
	
	int ck1=t.ceilingKey(12);
	System.out.println("ceilingkey:"+ck1);
	
	Entry<Integer, String> ce = t.ceilingEntry(16);
	System.out.println("ceilingEntry"+ce);
	
	
	Object cl = t.clone();
	System.out.println("clone:"+cl);
	
	boolean eq=t.equals(t);
	System.out.println("equals:"+eq);
	
	int s=t.size();
	System.out.println("size:"+s);
	
	Entry<Integer, String> pf = t.pollFirstEntry();
	System.out.println("pollFirstEntry:"+pf);
	
	Entry<Integer, String> pl = t.pollLastEntry();
	System.out.println("pollLastEntry:"+pl);
	
	Set<Entry<Integer, String>> es = t.entrySet();
	System.out.println("entrySet:"+es);
	
	NavigableSet<Integer> dk = t.descendingKeySet();
	System.out.println("descendingKeySet:"+dk);
	
NavigableMap<Integer, String> dm = t.descendingMap();
System.out.println("descendingMap:"+dm);
	
Comparator<? super Integer> comp = t.comparator();
System.out.println("comparator:"+comp);
	
Integer fk = t.firstKey();
	System.out.println("firstkey:"+fk);
	
	Integer lk=t.lastKey();
	System.out.println("lastkey:"+lk);
	
	String ts = t.toString();
	System.out.println("toString:"+ts);
	
	
}
}
