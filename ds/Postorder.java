import java.util.LinkedList;
import java.util.Queue;
import java.util.*;
class Node{
	int data;
	Node left;
	Node right;
}

public class Postorder{
    public void post(Node root){
Stack<Node>s=new Stack<Node>();
Node r=new Node();

r=root;
s.push(root);
while(1)){
     System.out.println("hello");
    while(r!=NULL&&r.left!=null){
        if(r.left!=NULL)
      s.push(r.left);  

      r=r.left;

    }//push until root.left not becomes null
 //   r=s.pop();
while(!isEmpty()){

if(s.peek().left==null&&s.peek().right==null)
{
    r=s.pop();

    System.out.println(r.data);
}
else if(s.peek().right!=null&&r.data!=s.peek().right.data){//peek means right not become null
 //r=s.pop();
 //s.push(r);
    s.push(r.right);
}
else if(s.peek().right!=null&&r.data==s.peek().right.data){
    //s.push(roots.right);
    r=s.pop();

    System.out.println(r.data);
    }
    else if(s.peek().right==NULL){
    //s.push(roots.right);
    r=s.pop();

    System.out.println(r.data);
    }
    
}
}
/*
else if(r.right!=null&&r.right.data!=s.peek().data){//peek means right not become null
  s.push(r);
    s.push(r.right);
}
else if(s.peek().right!=null&&r.data==s.peek().right.data){
    //s.push(roots.right);
    r=s.pop();
    System.out.println(r.data);
}
*/
//if(s.empty())
//break;
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
/*

public boolean checkBST(Node root) {
        if(root!=null){
            
 if(root.left!=null&&root.right!=null){
                         if(root.data>root.left.data&& root.data<root.right.data){
                                            checkBST(root.left);
                                checkBST(root.right);
                         }
                else
                    return false;
               
            }
            
        if(root.left!=null)
        {
            if(root.data>root.left.data)
                checkBST(root.left);
                           
                else
                    return false;
        }
           if(root.right!=null)
        {
            if(root.data<root.right.data)
                checkBST(root.right);
                else
                    return false;
        }
         
              
        
    }
       return true;
}
*/
public void print(Node r){
if(r!=null){
	System.out.println(r.data);

print(r.left);
print(r.right);
}
}
public static void main(String []args){
Postorder ob=new Postorder();
Node s=null;
 s=ob.Create(6);
 s=ob.Create(4);
 s=ob.Create(9);
 s=ob.Create(3);
// s=ob.Create(5);
 //s=ob.Create(8);
 //s=ob.Create(7);
//print(s);
ob.post(s);

//boolean k=ob.checkBST(s);
//	System.out.println(k);
}
}

