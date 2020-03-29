
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
public static void main(String[] args) {
	Queue<String> q=new LinkedList<String>();

	q.add("airplane");
	q.add("bike");q.add("car");q.add("diesel truck");q.add("electric car");q.add("fire engine");
	q.add("garbage truck");q.add("helicrafter");q.add("ice boat");q.add("jet");q.add("lorry");
	q.add("mini bus");q.add("narrow boat");q.add("ox cart");q.add("plane");q.add("rocket");
	q.add("ship");q.add("train");q.add("unicycle");q.add("van");
	
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
	
	
}
}
