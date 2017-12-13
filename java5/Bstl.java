enum COLOR{RED,BLACK};
class Node{
	COLOR c;
	int data;
	Node left;
	Node right;

}
public class Bstl{
	Node root=null;
public Node insert(Node root,int d){
if(root==null){
	Node nn=new Node();
	nn.data=d;
	nn.left=null;
	nn.right=null;
	return nn;
}
else if(d<root.data){
root.left=insert(root.left,d);

}
else if(d>root.data){
root.right=insert(root.right,d);
}
if(root.left.color==RED&&root.left.left.color==RED){
	root= rightrotate(root);
}
if(root.right.color==RED){
	root= leftrotate(root);
}

if(root.right.color==RED&&root.left.color==RED){
	root.right.color=BLACK;
		root.left.color=BLACK;
		root.color=RED;
	
}


}

Node leftrotate(Node x){
Node temp=x.right;
temp.left=x;
x.left=temp->right;
temp.color=x.color;
x.color=r;

return temp;	
}


Node rightrotate(Node x){
 x.right=temp->left;
temp.color=x.color;
x.color=r;
return temp;
}


public static void main(String []args){
	Bstl ob=new Bstl();


	Node k=null;
 k=	ob.insert(k,10);
 k=ob.insert(k,2);
 k=ob.insert(k,80);
k=ob.insert(k,60);
k=ob.insert(k,100);
k=ob.insert(k,1);
k=ob.insert(k,3);
k=ob.insert(k,90);
k=ob.insert(k,105);
ob.print(k);

//ob.print(k);
}
}
