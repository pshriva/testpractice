package LongestPathDAG;

import java.util.LinkedList;

public class Graph {
	int V;
	LinkedList<Integer> adjList[];
	public Graph(int V){
		this.V = V;
		adjList = new LinkedList[V];
		for(int i = 0; i <V; i++){
			adjList[i] = new LinkedList();
		}
	}
}
