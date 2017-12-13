import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Edge{
int d;
int w;
   
        Edge(int i,int j)
        {
            d=i;
            w=j;
        }
}
class Graph {
       int s;
       LinkedList<Edge>arr[];
        public Graph(int size) {
           s=size;
            
           arr=new LinkedList[size];
            for(int i=0;i<s;i++)
 arr[i]=new LinkedList<Edge>();
        }
     
        int findmin(int a[],boolean vis[]){
            int j=-1,max=Integer.MAX_VALUE;
            for(int i=0;i<s;i++){
                if(vis[i]==false){
                       if(max>a[i])
                       {
                           max=a[i];
                           
                       j=i;
                          
                       }
                }
            }
            
            if(j!=-1)
             vis[j]=true;
            return j;
            }
        
        public int shortestReach(int startId) { // 0 indexed 
        
            boolean vis[] =new boolean[s];
            int dis[]=new int[s];
                for(int i=0;i<s;i++){
                    vis[i]=false;
                    dis[i]=Integer.MAX_VALUE;

                }

            int t=startId;//want to form priority //first checkin=g which connections are nnedeed
            vis[t]=true;
            
            int sum=0;
            
            while(true){
               //  System.out.print(t);
           for(int i=0;i<arr[t].size();i++)
        {
            int d=arr[t].get(i).d;
            int w=arr[t].get(i).w;
               if(vis[d]==false){
            if(dis[d]==Integer.MAX_VALUE)
        {
                
               
            dis[d]=w;
                
        }
               if(w<dis[d])
            dis[d]=w;     
           }
           }
             t=findmin(dis,vis);
        
                if(t==-1)
            
                break;
              //  System.out.println(sum);
             sum=sum+dis[t];
          //  System.out.println();
    }
            return sum;
        
        }
 }
 



public class Solution {
    public static void main(String[] args) {
       Scanner  in=new Scanner(System.in);
            int n = in.nextInt();
            Graph ob=new Graph(n);
            int m = in.nextInt();
            
            for(int a1 = 0; a1 < m; a1++){
                int x = in.nextInt()-1;
                int y = in.nextInt()-1;
                int r = in.nextInt();
                 ob.arr[x].add(new Edge(y,r));
                
                
                 ob.arr[y].add(new Edge(x,r));
            }
            int s1 = in.nextInt()-1;
        int d;
            d=ob.shortestReach(s1);
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    System.out.println(d);
}
}