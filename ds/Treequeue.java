class Node{
	int d;
	Node left;
	Node right;//actual node of tree
}

public class Treequeue{
	Node head=null;
public boolean isempty(){

if(head==null)           
	return true;
else
	return false;

}
public Node deq(){//adding at end;

Node t=head;
head=head.right;
head.left=null;
return t;

}

public void enq(int d){//adding at end;
Node nn=new Node();
nn.d=d;
nn.left=null;
nn.right=null;
if(head==null){
head=nn;
}
else{
Node t=head;
	while(t.right!=null){
t=t.right;
}
t.right=nn;
nn.left=t;
}
}



//queue
Node root=null;
/*
public Node Create(int data){
		Node nn=new Node();
	Node r=new Node();
nn.d=data;
nn.left=null;
nn.right=null;
if(root==null)
root=nn;
else{
enq(root.d);
while(!isempty()){
r=deq();/////removing element
if(r!=null&&r.left==null){
	r.left=nn; 
	break;
}
else{

	enq(root.left.d);
	//int x=q.deque();
	//System.out.println(x);
}

if(r!=null&&r.right==null)
{	r.right=nn;

break;
}
else{
	enq(root.right.d);
	//int x=q.deque();
	//System.out.println(x);
}

}
//q.deletq();



}
return root;
}
*/

public void print(){
	Node t=head;
while(t!=null){
	System.out.println(t.d);
t=t.right;

//print(t.left);
//print(t.right);
}

}
public static void main(String []args){
Treequeue ob=new Treequeue();
Node r=null;
ob.enq(1);
ob.enq(2);
ob.enq(3);
ob.enq(4);
ob.enq(5);
ob.enq(6);
ob.enq(7);
ob.enq(2);
/*r=ob.Create(1);
r=ob.Create(2);
r=ob.Create(3);
r=ob.Create(4);
r=ob.Create(5);
r=ob.Create(6);
r=ob.Create(7);
*/
ob.print();
 }	
}