import java.util.Iterator;
import java.lang.Iterable;
public class LinkedList implements Iterable{
class MyIterator implements Iterator<Integer>{//iterator has generalised functions
Node curr=head;
public boolean hasNext(){
	return (curr!=null);

}
public Integer next(){

	Node temp=curr;
	curr=curr.next;
	return temp.d;
}
}
public Iterator<Integer> iterator(){//iterator is an interface and my iterastor derived class
//downcasting=base me derived dalna
	return new MyIterator();//downcasting h
}

class Node{
	public int d;
	Node next;
}
Node head;
LinkedList(){
	head=null;
}
void addatbeg(int data){
	Node nn=new Node();
	nn.d=data;
	nn.next=head;
	head=nn;

}
void print(Node curr){
	if(curr!=null){
System.out.println(curr.d);
print(curr.next);
}
}
public static void main(String []args){
LinkedList ob=new LinkedList();
ob.addatbeg(10);
ob.addatbeg(20);

ob.addatbeg(30);

ob.addatbeg(40);
ob.print(ob.head);

for( LinkedList x:ob){
	System.out.println(x);
}










/*
Iterator<Integer>i=ob.iterator();//how did we use this iterator what is it 
//its working without iterable class

//MyIterator a=new MyIterator();//how are we using this iterator 
//Iterator<Integer>i=a;
LinkedList b=new LinkedList();
b.addatbeg(10);
b.addatbeg(20);
// implements Iterable<Integer>
b.addatbeg(30);
b.addatbeg(40);
b.print(b.head);// not use iterator son map
Iterator<Integer>n=ob.iterator();//thsi is not an objext but work lijeobjex

	System.out.println("hello");
while(n.hasNext()){
	System.out.println(n.next());
}
*/

}
}