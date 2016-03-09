import java.util.Scanner;

import algorithem.DirectedEdge;
import algorithem.EdgeWeightedDigraph;
import outclasses.In;
import outclasses.StdOut;

public class Graph {
	
	public static void loadFile(String s){
		In in = new In(s);
        EdgeWeightedDigraph G = new EdgeWeightedDigraph(in);
        System.out.println("numbers of edges in file: "+G.E());
        System.out.println("numbers of verticels in file: "+G.V());
        DirectedEdge e = new DirectedEdge(3, 4, 0.3);
        G.addEdge(e);
        System.out.println("numbers of edges in file AFTER ADDING E: " +G.E());
        printFile(G);
	}
	public static void printFile(EdgeWeightedDigraph G){
		 StdOut.println(G);
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sn = new Scanner(System.in);
		System.out.println("enter name of file");
		String s = sn.next();
		loadFile(s+".txt");
	}
}
