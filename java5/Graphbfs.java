import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Graphbfs{
class Node{
int des;
Node next;
}
void bfs(ArrayList<LinkedList<Integer>>a,int s,boolean vis[]){//just we have passed the linked list here
	LinkedList<Integer>k=new LinkedList<>();
//we have made a linked list just like queue
q.add(s);//we have pushed the whole linked list there
visited[s]=true;
while(!q.size()!=0)
{
	int index=q.poll();
	for(int i=0;i<a.get(index).size();i++){//getting tyhe size of theat linkedlist
		int x=a.get(index).get(i);
		if(vis[x]==false){
			q.add(x);
			vis[x]=true;
		}
	}

}
}


/*
for(int i=0;i<k.size();i++){
	arr.add();
	vis[s]=true;
	for(int i=0;i<arr[s].size();i++)
{
int index=arr[i].get(i);

	}
}
}
*/
/*
void bfs(ArrayList<Node>mat,boolean vis[],int s)
{
				LinkedList<Node>q=new LinkedList<Node>();
				q.add(mat.get(s));//pushed mat.get(s)
				vis[s]=true;
				while(!q.isEmpty()){
				Node t=q.poll();//poll functionsreturn and remove
				System.out.println(t.des);
				while(t!=null){
							//vis[t->]=true;//make  the visited array as true
								if(vis[t.des]!=true)
								{
							vis[t.des]=true;
								q.add(mat.get(t.des));
								}
								t=t.next;
               }
        }
}
*/
/*
void shortestpath(int s){
	Node t=mat.get(s);
	vis[s]=true;
	int min=0;
	while(t!=null){
	if(min>t.des)
		min=t.des;//findthe min word
		t=t.next;
	}
	vis[min]=true;//jo sabseminimum find hua h uske vis[min]=true;

shortestpath(min);

yyyyyyyyyyyyyyyyyyyy}
*/

void addedge(ArrayList<Node>mat,int s,int d){


Node t=new Node();
t.des=d;
t.next=null;
	Node nn=mat.get(s);//at which index we are g
	if(nn ==null){
//System.out.println("hello");

		mat.get(s).add(t);
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

mat.add(new Node());
}
for(int i=0;i<v;i++){
		vis[i]=false;
	
         mat.add(null);
}
}

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
	bfs(mat,vis,0);
	print(mat);
}
void print(ArrayList<Node>mat){


}

public static void main(String []args){
	Scanner ob=new Scanner(System.in);
	int v=ob.nextInt();
	boolean []vis=new boolean[v+1];
	for(int i=0;i<v;i++){
		vis[i]=false;
	}

Graphbfs g=new Graphbfs();
g.createg(v,vis);
}
}
