import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.BiFunction;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<Integer, String> m=new HashMap<Integer, String>();
		
		m.put(1,"Agra");
		m.put(2, "bombay");
		m.put(3, "chennai");
		m.put(4, "Delhi");
		m.put(5,"erode");
		m.put(6, "faizabad");
		m.put(7, "gao");
		m.put(8, "hyderabad");
		m.put(9, "indore");
		m.put(10, "jaipur");
		m.put(11, "kakinada");
		m.put(12, "lucknow");
		m.put(13, "madurai");
		m.put(14, "noida");
		m.put(15, "osmanabad");
		m.put(16, "quepem");
		m.put(17, "raipur");
		m.put(18, "salem");
		m.put(19, "theni");
		m.put(20, "udupi");
		m.put(21, "varnasi");
		m.put(22, "washim");
		
int s=	m.size();
System.out.println("size"+s);

String g=m.get(12);
String g1=m.get(18);
System.out.println("get:"+g);
System.out.println("get:"+g1);

Collection<String> v=m.values();
System.out.println("values:"+v);

boolean e=m.isEmpty();
System.out.println("Empty:"+e);

Set<Integer> set=m.keySet();
System.out.println("keySet:"+set);

 String r=m.remove(4);
 System.out.println("remove:"+r);
 
 boolean rkv = m.remove(1, "agra");
 System.out.println("remove(key,value):"+rkv);
 
 String to = m.toString();
 System.out.println("tostring:"+to);
 
 boolean ck = m.containsKey(3);
 System.out.println("contains(key):"+ck);
 
 boolean cv = m.containsValue(21);
 System.out.println("contains(value):"+cv);
 
 boolean eq = m.equals(m);
 System.out.println("equals:"+eq);
 
 Set<Entry<Integer, String>> en = m.entrySet();
 System.out.println("entrySet:"+en);

 int h = m.hashCode();
 System.out.println("hashcode:"+h);

 String re = m.replace(1, "ahmedabad");
 System.out.println("replace:"+re);
	
 boolean reon = m.replace(2, "bombay", "mumbai");
 System.out.println("replace(index,old,new):"+reon);
 
 


	
	
}
}