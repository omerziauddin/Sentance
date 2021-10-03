import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

//traversing using entry set
public class Sentance {

	public static void main(String[] args) {
    PriorityQueue q=new PriorityQueue(15,new MyComparator());
    q.offer("Z");
    q.offer("L");
    q.offer("A");
    q.offer("B");
    
    System.out.println(q);
		
	}
	
}
