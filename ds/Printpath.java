import java.util.Queue;
import java.util.LinkedList;
class Node{
	int data;
	Node left;
	Node right;
}
public class Printpath{
	int a[],c=0;

	public void printarray(int n){
for(int i=0;i<n;i++){
	System.out.println(a[i]);
	}
}

public void print(Node root){
		a=new int[10];

if(root==null){
	return;
}
		a[c]=root.data;
c++;

	if(root.left==null&&root.right==null){

		a[c]=root.data;
		c++;
		printarray(c);
		
	}

print(root.left);
print(root.right);


}
	//print(root.left);
	
	
	

	//print(root.right)






Node root=null;
public Node Create(int d){
//integer is a wrapper class
LinkedList<Node>q=new LinkedList<Node>();
//Queue<Node> q=new LinkedList<Node>();
		Node nn=new Node();
nn.data=d;
nn.left=null;
nn.right=null;
if(root==null){
root=nn;
}
else{

q.add(root);
	while(!q.isEmpty()){
		Node r=q.remove();
if(r.left==null){
	r.left=nn;

break;
}
else{
q.add(root.left);
}
if(r.right==null)
{	r.right=nn;

break;
}
else
q.add(r.right);


}
//q.remove();
//q=null;
}
return root;
}

public void prints(Node r){
if(r!=null){
	//System.out.println(r.data);

prints(r.left);
System.out.println("hii");
System.out.println(r.data);
prints(r.right);
}
}


public static void main(String []args){
Printpath ob=new Printpath();
Node s=null;
 s=ob.Create(10);
 s=ob.Create(20);
 s=ob.Create(30);
 s=ob.Create(40);
 s=ob.Create(50);
  s=ob.Create(60);
 s=ob.Create(70);
 
 //ob.prints(s);
ob.print(s);
}
}
