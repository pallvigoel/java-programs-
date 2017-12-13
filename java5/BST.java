import java.util.Scanner;
import java.util.*;
class Student implements Comparable<Student>{
    int rno;
    int cgpa;
Student(int rno,int cgpa){
    this.rno=rno;
    this.cgpa=cgpa;
} public int compareTo(Student s)
        {
                if(this.cgpa>s.cgpa){
                    return -1;
                }
                else if(this.cgpa<s.cgpa)
                return 1;
                else
                    return 0;
        }
}


public class BST<T extends Comparable<T>>//t is a generic class
{
  
public  Node root;
        
           class Node{//inner class
                        T key;
                        int val;
                        Node left,right;
                        Node(T key, int v)
                        {
                                this.key=key;
                                val=v;
                                left=null;
                                right=null;
                        }
                }
                public Node insert(T key,Node root){
             if(root==null)
                {
                    return new Node(key,0);
                }

                int cmp = key.compareTo(root.key);
                if(cmp == 0)
                    root.val = root.val + 1;
                else if (cmp>0)
                    root.left = insert(key,root.left);
                else
                    root.right = insert(key,root.right);
                return root;

            }

public void  create()
{
         
        Scanner ob=new Scanner(System.in);
        int t=ob.nextInt();


        for(int i=0;i<t;i++)
        {
          // T obj = new Student(10,10);
           root= insert(new Student(10,10) ,root);
        }
        
        
    
}



            public static void main(String []args){
                BST<Student>o=new BST<>();
                
               
            o.create();
            }

}





