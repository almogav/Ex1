# Ex1
Ex1 is a project that focus on an algorithmic library that represent graphs,
and calculating shortest pathes between verticles in the graph.
all of the algorithems and other outclasses were taken either from google or from http://algs4.cs.princeton.edu/44sp/

# Overview
## We used the following Classes and Algos:

**Graph.java**

**Main_Ex1.java**

Algorithems: 

* **DijkstraAllPairsSP.java**

* **DijkstraUndirectedSP.java** 

* **DijkstraSP.java**

* **DirectedEdge.java**

* **EdgeWeightedGraph.java**

* **EdgeWeightedDigraph.java**

* **IndexMinPQ.java**

OutClasses:

* **In.java**

* **Bag.java**

* **StdIn.java**

* **StdOut.java**

* **StdRandom.java**

### Graph
Graph class allows you to load graphs from a file (with a .txt ending) ,
and represent them on the console.
the class allow you through the algroithem package to do basic methods such as:
* number of verticles/edges in graph.
* adding an edge to graph.
* toString method that printing the graph.

### Graph_algo 
Graph algorithem class.
some of the algorithems are:
* shortest path - distance between two verticles.
* shortest path - edges of the path between two verticles.
* shortest path - distance between two verticles without going through "black list" of verticles or edges in graph.

### Test Classes
Test classes that allow checking on correctness and efficiency of the project.
also test reading from a file of two verticles and checking the SP between them and a black list that cant go through.
