package unitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import algorithem.DijkstraSP;
import algorithem.EdgeWeightedDigraph;
import outclasses.In;

public class MyTest {

	@Test
	public void test() {
		In in = new In ("tinyEWD.txt");
		EdgeWeightedDigraph G = new EdgeWeightedDigraph(in);
		assertEquals(G.E(), 15);
		DijkstraSP sp = new DijkstraSP(G, 5);
		double dist = sp.distTo(7);
		assertEquals(0.28, dist,0.01);
	}

}
