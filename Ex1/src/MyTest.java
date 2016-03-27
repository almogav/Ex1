

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileReader;

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
			
		//here are the tests for the tiny EWD:
			m.main1(new String[]{ "tinyEWD.txt","test1noPath.txt"});
			m.main1(new String[]{ "tinyEWD.txt","test1.txt"});
			m.main1(new String[]{ "tinyEWD.txt","test4EWD.txt"});
			m.main1(new String[]{ "tinyEWD.txt","test5EWD.txt"});

		//here are the tests for the medium EWD:	
			m.main1(new String[]{ "mediumEWD.txt","test1noPath.txt"});
			m.main1(new String[]{ "mediumEWD.txt","test1.txt"});
			m.main1(new String[]{ "mediumEWD.txt","test2.txt"});
			m.main1(new String[]{ "mediumEWD.txt","test3.txt"});

			
		} catch (Exception e) {
			e.printStackTrace();
		}

		assertTrue(FILES_ARE_SAME("tests/Solution_test1noPath.txt_tinyEWD.txt.txt", "checkTest/Solution_test1noPath.txt_tinyEWD.txt"));
		assertTrue(FILES_ARE_SAME("tests/Solution_test1.txt_tinyEWD.txt.txt", "checkTest/Solution_test1.txt_tinyEWD.txt"));
		assertTrue(FILES_ARE_SAME("tests/Solution_test4EWD.txt_tinyEWD.txt.txt", "checkTest/Solution_test4EWD.txt_tinyEWD.txt"));
		assertTrue(FILES_ARE_SAME("tests/Solution_test5EWD.txt_tinyEWD.txt.txt", "checkTest/Solution_test5EWD.txt_tinyEWD.txt"));
		assertTrue(FILES_ARE_SAME("tests/Solution_test1noPath.txt_mediumEWD.txt.txt", "checkTest/Solution_test1noPath.txt_mediumEWD.txt"));
		assertTrue(FILES_ARE_SAME("tests/Solution_test1.txt_mediumEWD.txt.txt", "checkTest/Solution_test1.txt_mediumEWD.txt"));
		assertTrue(FILES_ARE_SAME("tests/Solution_test2.txt_mediumEWD.txt.txt", "checkTest/Solution_test2.txt_mediumEWD.txt"));
		assertTrue(FILES_ARE_SAME("tests/Solution_test3.txt_mediumEWD.txt.txt", "checkTest/Solution_test3.txt_mediumEWD.txt"));
	}

	public static boolean FILES_ARE_SAME(String OutPut,String Comp) 
	{
		try
		{
			FileReader fr_Output = new FileReader(OutPut);
			BufferedReader br_Output = new BufferedReader(fr_Output);

			FileReader fr_Comp = new FileReader(Comp);
			BufferedReader br_Comp = new BufferedReader(fr_Comp);

			String Outputer = br_Output.readLine();
			String Comper = br_Comp.readLine();

			while(Outputer!=null && Comper!=null)
			{
				if(Outputer.compareTo(Comper)!=0)
				{
					fr_Output.close();
					br_Output.close();
					fr_Comp.close();
					br_Comp.close();
					return false;
				}
				Outputer = br_Output.readLine();
				Comper = br_Comp.readLine();
			}
			fr_Output.close();
			br_Output.close();
			fr_Comp.close();
			br_Comp.close();
			if(Outputer==null && Comper==null)
			{
				return true;
			}

		}
		catch (Exception E)
		{
			E.printStackTrace();
		}
		return false;


	}

}
