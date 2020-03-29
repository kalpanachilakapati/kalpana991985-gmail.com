import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class QueueTest {
public static void main(String[] args) {
	Queue<String> q=new PriorityQueue<String>();
	
	q.offer("Avocado");
	q.offer("beans");
	q.offer("carrot");
	q.offer("dandelion");
	q.offer("eggplant");q.offer("fiddleheads");q.offer("ginger");
	q.offer("horseraddish");q.offer("jicama");q.offer("kale");
	q.offer("leeks");q.offer("mushrooms");q.offer("nuts");q.offer("onion");q.offer("pumpkin");
	q.offer("radish");q.offer("shallots");q.offer("tomato");q.offer("zucchini");
	
	int s=q.size();
	System.out.println("size:"+s);
	
	boolean e = q.isEmpty();
	System.out.println("empty:"+e);
	
	String po = q.poll();
	System.out.println("poll:"+po);
	
	String pe=q.peek();
	System.out.println("peek:"+pe);
	
	int h=q.hashCode();
	System.out.println("hash code:"+h);
	
	boolean c=q.contains(q);
	System.out.println("boolean:"+c);
	
	boolean cl=q.containsAll(q);
	System.out.println("containAll:"+cl);
	
	String r = q.remove();
	System.out.println("remove:"+r);
	
	boolean rl = q.removeAll(q);
	System.out.println("removeAll:"+rl);
	
	boolean eq = q.equals(q);
	System.out.println("equals:"+eq);
	
	boolean a=q.add("carrot");
	System.out.println("add:"+a);
	
	
	boolean al=q.addAll(q);
	System.out.println("addAll:"+al);
	
	boolean rtl=q.retainAll(q);
	System.out.println("retainAll:"+rtl);
	
	
	
	
	
	
}
}
