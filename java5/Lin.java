import java.util.Iterator;
import java.lang.Iterable;
class Node{
Integer d;
	Node next;
}
 public class Lin implements Iterable{
//inner class
class MyIterator implements Iterator<Integer>{//iterator has generalised functions
Node curr;
MyIterator(){
}
MyIterator(Node head){
	curr=head;
}
public boolean hasNext(){

	return (curr!=NULL);
}
public Integer next(){

	Node temp=curr;
	curr=curr.next;
	return temp.d;
}

}

public Iterator<Integer> iterator(){
	return new MyIterator();
}

Node addatbeg(Node head,int data){
	Node nn=new Node();
	nn.d=data;
	nn.next=head;
	head=nn;
	return head;
}
void print(Node curr){
	if(curr!=null){
System.out.println(curr.d);
print(curr.next);
}
}
public static void main(String []args){
Node head=new Node();
Lin ob=new Lin();

head=ob.addatbeg(head,10);
head=ob.addatbeg(head,20);
head=ob.addatbeg(head,30);
head=ob.addatbeg(head,40);
ob.print(head);
Iterator<Integer>i=ob.iterator();
while(i.hasNext()){
	System.out.println(i.next());
	
}

}
}
