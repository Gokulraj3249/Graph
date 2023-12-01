package Graph_impliement;

public class Connected_graph {

	//  inner class to keep track of edges
	public class Edge{
		public int src,dest;
	}
	//    number of vertices and edges
	int vertices,edges;
	
	//  array to store all edges
	public Edge[]edge;
	public Connected_graph(int vertices,int edges){
		this.vertices=vertices;
		this.edges=edges;
		
	//   initialize the edge array
	edge=new Edge[edges];
	for(int i=0;i<edges;i++) {
		
		// each element of the edge array is an object of edge type
		edge[i]=new Edge();
	}
	}
}
