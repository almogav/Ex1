import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Date;
import algorithem.Graph;
import algorithem.Graph_algo;
import outclasses.In;

public class Main_Ex1
{
  public static void main(String[] args)
  {
    try
    {
      main1(args);
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }
  
 
  public static void main1(String[] cmds)
    throws Exception
  {
    long start = new Date().getTime();
    System.out.println("SE1 Ex1: partual solution - for student testing");
    System.out.println("Loading graph file: " + cmds[0] + " runing a test " + cmds[1]);
    String ans = "tests/Solution_" + cmds[1] + "_" + cmds[0]  + ".txt";
    
    FileWriter fw = new FileWriter(ans);
    PrintWriter os = new PrintWriter(fw);
    In in = new In(cmds[0]);
    Graph G = new Graph(in);
    long s1 = new Date().getTime();
    System.out.println("Done loading Graph: " + cmds[0] + "  in " + (s1 - start) + "  ms");
    FileReader fr = new FileReader(cmds[1]);
    @SuppressWarnings("resource")
	BufferedReader is = new BufferedReader(fr);
    String num_of_lines = is.readLine();
    String s = is.readLine();
    int ll = 0;
    os.println(num_of_lines + " regenerated by a simple SE1_EX1 solution");
    while ((s != null) && (ll < 20))
    {
      String[] sa = s.split(" ");
      int source = Integer.parseInt(sa[0]);
      int target = Integer.parseInt(sa[1]);
      int size_of_BL = Integer.parseInt(sa[2]);
      int[] BL = new int[size_of_BL];
      for (int i = 0; i < size_of_BL; i++) {
        BL[i] = Integer.parseInt(sa[(i + 3)]);
      }
      
      double dist = sp(G, source, target, BL);
      os.println(s + " " + dist);
      ll++;
      s = is.readLine();
    }
    long s2 = new Date().getTime();
    System.out.println("Done computing shortest paths on Graph: " + cmds[0] + "  in " + (s2 - s1) + "  ms");
    System.out.println("Total time: " + (s2 - start) + "  ms");
    os.close();
  }
  
  public static double sp(Graph G, int source, int target, int[] BL)
  {
    double ans = -1.0D;
    for (int i = 0; i < BL.length; i++) {
		if(target == BL[i] || source == BL[i]) return Double.POSITIVE_INFINITY;
	}
    G.setValidateVertex (BL, false);
    Graph_algo sp = new Graph_algo (G, source);
    ans = sp.distTo (target);
    G.setValidateVertex (BL, true);
    return ans;
  }
}
