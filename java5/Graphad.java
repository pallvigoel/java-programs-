import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Graphad{
class Node{
int des;
Node next;
}
Graphad(){	
}
void dfs(ArrayList<Node>mat,boolean vis[],int s)
{
Node nn=mat.get(s);
System.out.println("hello");

vis[s]=true;
while(nn!=null){
	int i=nn.des;
	System.out.println(nn.des);
	if(vis[i]!=true)
		dfs(mat,vis,i);
			nn=nn.next;
}
}
void addedge(ArrayList<Node>mat,int s,int d){
	
	Node t=new Node();
t.des=d;
t.next=null;
	Node nn=mat.get(s);//at which index we are g
	if(nn ==null){
//System.out.println("hello");

		mat.set(s,t);
}
	
	else
	{
				while(nn.next!=null)
				{
					//System.out.println("bello");
					nn=nn.next;
				}
					nn.next=t;
    }
}
void create(int v,ArrayList<Node>mat,boolean vis[]){

//Node nn=new Node();

for(int i=0;i<v;i++){
		vis[i]=false;
	/*nn.des=i;
	nn.next=null;

	mat.add(null);*///if  notspecify the size
mat.add(null);
}

 }//initialse it to null
void createg(int v,boolean vis[]){
	Scanner ob=new Scanner(System.in);
ArrayList<Node>mat=new ArrayList<Node>(v);//created a 
create(v,mat,vis);
for(int i=0;i<8;i++){
int s=ob.nextInt();
int d=ob.nextInt();
addedge(mat,s,d);
	System.out.println("next edge");
	}	
	dfs(mat,vis,0);
	print(mat);
}
void print(ArrayList<Node>mat){


}

public static void main(String []args){
	Scanner ob=new Scanner(System.in);
	int v=ob.nextInt();
	boolean []vis=new boolean[v+1];

Graphad g=new Graphad();
g.createg(v,vis);

}
}

