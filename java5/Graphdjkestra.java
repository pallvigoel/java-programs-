import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;
class Graphdjkestra{
	int v;
	int a[][];
	 Graphdjkestra(int n){
		v=n;
        a=new int[n+1][n+1];
		for(int i=0;i<n;i++){
			a[i]=new int[n+1];
			}
}
void addedge(int s,int d,int w)
{
     a[s][d]=w;
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
	//int min=Integer.MAX_VALUE;

	//System.out.println(a[0][1]);
	for(int i=0;i<v;i++){
		//System.out.println(a[s][i]);
		if(   a[s][i] >0&&vis[i]==false ){
			//System.out.println("hello");//vis[i]=false
			if(dis[i]>dis[s]+a[s][i]){
				dis[i]=dis[s]+a[s][i];
			}
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
public static void main(String []args){
	Scanner ob=new Scanner(System.in);
	int v=ob.nextInt();
	int []dis=new int[v];

Graphdjkestra g=new Graphdjkestra(v);
	boolean []vis=new boolean[v];

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
   g.findconn(0,vis,dis);	
for(int i=0;i<v;i++){

	System.out.println(dis[i]);
}
}
}