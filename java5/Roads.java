import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Roads {
static int countCities(LinkedList<Integer>[]arr,int s,boolean visited[])
{
    int count=1;
    visited[s]=true;
    for(int i=0;i<arr[s].size();i++)
    {
        if(!visited[arr[s].get(i)])
        {
            count+=countCities(arr,arr[s].get(i),visited);
        }
    }
    return count;
}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            int m = in.nextInt();
            long x = in.nextLong();
            long y = in.nextLong();
            LinkedList<Integer>[]arr=new LinkedList[n+1];
            boolean visited[] =new boolean[n+1];
            for(int j=1;j<=n;j++)
            {
                arr[j]=new LinkedList<Integer>();
                visited[j]=false;
            }
 /*starts from 1*/for(int a1 = 0; a1 < m; a1++){
                int city_1 = in.nextInt();
                int city_2 = in.nextInt();
                arr[city_1].add(city_2);
                arr[city_2].add(city_1);
            }
            if(y>=x||m==0)
                System.out.println(n*x);
            else
            {
                long total=0;
                for(int j=1;j<=n;j++)
                {
                    if(!visited[j])
                    {
                        int c=countCities(arr,j,visited);
                        total=total+(c-1)*y+x;
                    }
                }
                System.out.println(total);
            }
        }
    }
}