

import static org.junit.Assert.*;

import org.junit.Test;

import algorithem.DijkstraSP;
import algorithem.EdgeWeightedDigraph;
import outclasses.In;

public class MyTest {

	@Test
	public void test() {
		
		/*In in = new In ("tinyEWD.txt");
		EdgeWeightedDigraph G = new EdgeWeightedDigraph(in);
		assertEquals(G.E(), 15);
		DijkstraSP sp = new DijkstraSP(G, 5);
		double dist = sp.distTo(7);
		assertEquals(0.28, dist,0.01);*/
		
		Main_Ex1 m = new Main_Ex1();
		try {
			m.main1(new String[]{ "tinyEWD.txt","test1noPath.txt"});
			m.main1(new String[]{ "tinyEWD.txt","test1.txt"});
			m.main1(new String[]{ "tinyEWD.txt","test4EWD.txt"});
			m.main1(new String[]{ "tinyEWD.txt","test5EWD.txt"});
			
			m.main1(new String[]{ "mediumEWD.txt","test1noPath.txt"});
			m.main1(new String[]{ "mediumEWD.txt","test1.txt"});
			m.main1(new String[]{ "mediumEWD.txt","test2.txt"});
			m.main1(new String[]{ "mediumEWD.txt","test3.txt"});
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
