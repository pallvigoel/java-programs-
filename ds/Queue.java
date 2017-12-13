import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class Node{
	int data;
	Node left;
	Node right;
}
public class Printpath{
int a[];
public void ppath(){
a=new int[10];
int c=0;
while (root!=null){
a[c]=root.data;
c++;

    
}

}

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
e}lse{
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

public void print(Node r){
if(r!=null){
	System.out.println(r.data);

print(r.left);
print(r.right);
}
}
public static void main(String []args){
Printpath ob=new Printpath();
Node s=null; 
int a;
Scanner o=new Scanner(System.in);
int n=o.nextInt();
for(int i=0;i<n;i++){
a=o.nextInt();
 s=ob.Create(a);
}
ob.print(s);
boolean k=ob.checkBST(s);
	System.out.println(k);
}
}

