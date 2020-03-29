import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {
public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList<>();
	
	al.add(22);
	al.add(44);
	al.add(99);
	al.add(78);
	al.add(96);
	al.add(88);
	al.add(12);
	al.add(31);
	
	int indexFlag=0;
	
	Iterator<Integer> itr=al.iterator();
	while (itr.hasNext()) {
		indexFlag++;
		if(indexFlag == 4) {
	
			al.remove(indexFlag);
			
		}
		System.out.println(itr.next());
		}
	System.out.println("after removal element:");
	
	Iterator<Integer> it=al.iterator();
	while(it.hasNext()) {
	System.out.println(it.next());	
	}
}
}
