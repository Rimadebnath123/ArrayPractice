package Collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> q=new PriorityQueue<>();
					
				q.add("Amit");
				q.add("vijoy");
				q.add("sankor");
				q.add("Raj");
				
				System.out.println("head:"+q.element());
				System.out.println("head:"+q.peek());
				System.out.println(q);
							
				q.remove();
				q.poll();
				System.out.println("after removing two elements:");
				for(String x:q) {
					System.out.println(x);
				}
			
				System.out.println("\n");
				Queue<Integer> q1=new PriorityQueue<>();
				
				q1.add(40);
				q1.add(30);
				q1.add(20);
				q1.add(50);
				
				System.out.println("head:"+q1.element());
				System.out.println("head:"+q1.peek());
				System.out.println(q1);
							
				q1.remove();
				q1.poll();
				System.out.println("after removing two elements:");
				for(Integer x:q1) {
					System.out.println(x);
				}
				System.out.println("\n");
				Deque<String> q2=new ArrayDeque<>();
				
				q2.add("Gautam");
				q2.add("Karan");
				q2.add("Ajay");
				q2.add("Karan");
				
				
				System.out.println(q2);
							
				q2.remove("Gautam");
				
				for(String x:q2) {
				System.out.println(x);
				}
			}

		}

