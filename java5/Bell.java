import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;
class edge{
	int s;
	int d;
	int w;
}
class Bell{
	int v;
	int e;
	edge ed[];
	Bell(int n,int k){
		ed=new edge[k+1];
		for(int i=0;i<k;i++){
			ed[i]=new edge();
		}
		v=n;
		e=k;
        
		}
			static int c=0;
void addedge(int s,int d,int w){
	ed[c].s=s;
    ed[c].d=d;
    ed[c].w=w;
  //  System.out.println(c);
 c++;
 }
void findconn(int s,int dis[]){
   for(int j=0;j<v-1;j++){
	for(int i=0;i<e;i++){
    int u=ed[i].s;
    int v=ed[i].d;
    int wt=ed[i].w;
		
			if(dis[u]!=Integer.MAX_VALUE&&dis[v]>dis[u]+wt){
				dis[v]=dis[u]+wt;//basically took one source and take distance
              } 

			}
			
		}

    	}

public static void main(String []args){
	Scanner ob=new Scanner(System.in);
	int v=ob.nextInt();
	int []dis=new int[v];
Bell g=new Bell(v,8);
g.addedge(0,1,-1);
g.addedge(0,2,4);
g.addedge(1,2,3);
g.addedge(1,3,2);
g.addedge(1,4,2);
g.addedge(3,2,5);
g.addedge(3,1,1);
g.addedge(4,3,-3);
for(int i=0;i<v;i++){
	dis[i]=Integer.MAX_VALUE;
	}
dis[0]=0;

   g.findconn(0,dis);	
for(int i=0;i<v;i++){

	System.out.println(dis[i]);
}
}
}