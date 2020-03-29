import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reverse {

	public static void main(String[] args) {
		List<String> l=new ArrayList<String>();
		l.add("apple");
		l.add("banaba");
		l.add("cherries");
		l.add("Dragon");
		l.add("elderberry");
		l.add("fig");
		l.add("grape");
		l.add("hackberry");
		l.add("imbe");
		l.add("jackfruit");
		l.add("kiwi");
		l.add("lemon");
		l.add("melon");
		l.add("nectarine");
		l.add("orange");
		l.add("pear");
		l.add("quince");
		l.add("rambutan");
		l.add("strawberries");
		l.add("tangerine");
		l.add("ugni");
		l.add("voavanga");
		l.add("wolfberry");
		l.add("xigua");
		l.add("yangmei");
		l.add("zuchinni");
		System.out.println("Fruits Name A to Z:"+l);
		
		Collections.reverse(l);
		System.out.println("Reverse A to Z:"+l);
	}

}
