/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

import java.util.*;
/**
 *
 * @author Puneet J
 */
class graph
{
    ArrayList<ArrayList<Integer>>  arr=new ArrayList<ArrayList<Integer>>();
    ArrayList<LinkedList<Integer>> adj_list=new ArrayList<LinkedList<Integer>>();
    public void add_edge(int s,int des)
    {
        arr.get(s).set(des,1);
        arr.get(des).set(s,1);
        adj_list.get(s).add(des);
        adj_list.get(des).add(s);//it creates the node by itself
    }
    public void display()
    {
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size(); j++) {
                System.out.print(arr.get(i).get(j));
            }
            System.out.println("");
        }
        System.out.println("List:");
        for (int i = 0; i < adj_list.size(); i++) {
            
                System.out.println(adj_list.get(i));
         //om namah shivaya om namah shivaya
        }
    }
    public void dfs(int s,boolean visited[])
    {
        visited[s]=true;
        for (int i = 0; i < adj_list.get(s).size(); i++) {
            int index=adj_list.get(s).get(i);
            if(visited[index]!=true)
                dfs(index,visited);
        }
    }
}
public class Graphslinks {
    /**+
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,s,d;
        graphlinks ob=new graphlinks();
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number of vertices");
        n=obj.nextInt();
        for (int i = 0; i < n; i++) {
            ob.arr.add(new ArrayList<Integer>(Collections.nCopies(n,0)));
            ob.adj_list.add(new LinkedList<Integer>());
        }
        //System.out.println(ob.arr.get(0).size());
        for (int i = 0; i < 7; i++) {
            System.out.println("Enter source and destination");
        
                s=obj.nextInt();
            d=obj.nextInt();
            ob.add_edge(s, d);
        }
        System.out.println("Graph:");
        ob.display();
        boolean visited[]=new boolean[6];
        for(int i=0;i<6;i++)
            visited[i]=false;
        System.out.println("DFS:");
        ob.dfs(0,visited);
        for (int i = 0; i < 6; i++) {
            System.out.println(visited[i]);
        }
    } 
}