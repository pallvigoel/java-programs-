static int dfs(int m[][],int i,int j,boolean visited[][],int c)
    {
        visited[i][j]=true;
        c++;
        int dir[][]={{0,1},{0,-1},{1,0},{-1,0}};
        int x=i;int y=j;
        for(int p=0;p<4;p++)
        {
            x=x+dir[p][0];
            y=y+dir[p][1];
            if(x>-1 && y>-1 && x<m.length && y<m[0].length && m[x][y]==1) 
                if(visited[x][y]==false)
                c=dfs(m,x,y,visited,c);
            x=i;y=j;
        }
        return c;
    }
    static int[] countGroups(int[][] m,int[] t) 
    {
        int g=m.length;
        int l=m[0].length;
        boolean[][] visited=new boolean[g][l];
        int z;
        for(int i=0;i<g;i++)
        {
            for(int j=0;j<l;j++)
            {
                visited[i][j]=false;
            }
        }
        int p=0;int[] c=new int[1000000];
        for(int i=0;i<g;i++)
        {
            for(int j=0;j<l;j++)
            {
                if(m[i][j]==1 && visited[i][j]==false)
                {
                    //System.out.println(i+" "+j);
                     c[p]=0;
                    c[p]=dfs(m,i,j,visited,c[p]);
                    //System.out.println("count:"+c[p]);
                    p++;
                }
            }
        }
        int[] res=new int[t.length];
        for(int x=0;x<t.length;x++)
        {
            res[x]=0;
            if(c[x]!=0)
            {
                for(int y=0;y<c.length;y++)
                {
                    if(c[y]==t[x])
                    {
                        res[x]++;
                    }
                }
            }
        }
        
        return res;
    }