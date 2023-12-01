package BFS;

import java.util.*;

import DFS.Dfs;

public class Bfs {  
	    private int V;        
	    private LinkedList<Integer> adj[];       
	    private Queue<Integer> queue;           
	    @SuppressWarnings("unchecked")
		Bfs(int v)  
	    {  
	        V = v;  
	        adj = new LinkedList[V];  
	        for (int i=0; i<v; i++)  
	        {  
	            adj[i] = new LinkedList<>();  
	        }  
	        queue = new LinkedList<Integer>();  
	    }  
	    void addEdge(int v,int w)  
	    {  
	        adj[v].add(w);     
	    }  
	    void BFS(int n)  
	    {  
	        boolean nodes[] = new boolean[V];       
	        int a = 0;  
	        nodes[n]=true;                    
	        queue.add(n);        
	        while (queue.size() != 0)  
	        {  
	            n = queue.poll();         
	            System.out.print(n+" ");     
	            for (int i = 0; i < adj[n].size(); i++)  
	            {  
	                a = adj[n].get(i);  
	                if (!nodes[a])        
	                {  
	                   nodes[a]=true;
	                   queue.add(a);
	                }
	            }
	        }  
	    }

	public static void main(String[] args) {
		Bfs g=new Bfs(6);
		
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 0);
		g.addEdge(1, 3);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 4);
		g.addEdge(3, 5);
		g.addEdge(4, 3);
		g.addEdge(5, 3);
		
		System.out.println("Following is Breadh First Traversal:");
		
		g.BFS(0);

	}

}
