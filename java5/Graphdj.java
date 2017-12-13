import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;
class Node{
int d;
int w;
Node(int x,int y){
	x=d;
	w=d;
   }

}

class Graphdj{
	int v,e;
	LinkedList<Node>[]arr;

	 Graphdj(int a,int b){
		v=a;
		e=b;       
	 a=new LinkedList[v];

		for(int i=0;i<v;i++){
			a[i]=new LinkedList<Node>();		}
}//we cannot create generics array in java
void addedge(int s,int d,int w)
{
     arr[s].add(new Node(d,w));
}

int findmin(boolean vis[],int dis[]){
			int min=Integer.MAX_VALUE;
			int in=-1;
				for(int i=0;i<v;i++){
			         if(vis[i]==false&&dis[i]<min)
			         {
			         	min=dis[i];
						in=i;
			    }
			}
			return in;
}
void findconn(int s,boolean vis[],int dis[]){
	int min=Integer.MAX_VALUE;


	for(int i=0;i<v;i++){
		if(a[s][i]>0 &&vis[i]==false){//vis[i]=false
			if(dis[i]>dis[s]+a[s][i]){
				dis[i]=dis[s]+a[s][i];
			}
		}
			int k=findmin(vis,dis);
			if(k==-1)
				return;
			else{
					vis[k]=true;
				    findconn(k,vis,dis);	

		
      }
	}
}
public static void main(String []args){
	Scanner ob=new Scanner(System.in);
	int v=ob.nextInt();
	int []dis=new int[v+1];

Graphdjkestra g=new Graphdjkestra(v);
	boolean []vis=new boolean[v+1];

for(int i=0;i<v;i++){

for(int j=0;j<v;j++){
     g.a[i][j]=0;
}
}

g.addedge(0,1,4);
g.addedge(0,7,8);
g.addedge(1,7,11);
g.addedge(1,2,5);
g.addedge(1,0,4);
g.addedge(7,0,4);
g.addedge(7,8,7);
g.addedge(7,1,11);
g.addedge(7,6,1);
g.addedge(2,8,2);
g.addedge(2,1,5);
g.addedge(2,5,4);
g.addedge(2,3,7);
g.addedge(8,2,2);
g.addedge(8,6,6);
g.addedge(8,7,7);
g.addedge(6,7,1);
g.addedge(6,8,6);
g.addedge(6,5,2);

g.addedge(3,2,7);
g.addedge(3,5,14);
g.addedge(3,4,9);
g.addedge(5,2,4);
g.addedge(5,4,10);
g.addedge(5,3,14);
g.addedge(4,3,9);
g.addedge(4,5,10);


for(int i=0;i<v;i++){


for(int j=0;j<v;j++){


	System.out.println(g.a[i][j]);
	}
}

for(int i=0;i<v;i++){
	vis[i]=false;
	}

for(int i=0;i<v;i++){
	dis[i]=Integer.MAX_VALUE;
	}
dis[0]=0;


for(int i=0;i<v;i++){
	vis[i]=false;
	}
vis[0]=true;