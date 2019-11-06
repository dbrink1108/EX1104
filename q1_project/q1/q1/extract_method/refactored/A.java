package q1.extract_method.refactored;

import java.util.List;

public class A {
   Node m1(List<Node> nodes, String p) {
	  extractedMethod(nodes,p);
      return null;
   }

   Node m2(List<Node> nodeList, String p) {
	  extractedMethod(nodeList,p);
      return null;
   }


   private void extractedMethod(List<Node> nodeList, String p) {
		for (Node node : nodeList) {
			if (node.contains(p))
				System.out.println(node);
		}
    }
}

class Node {
   String name;

   public boolean contains(String p) {
      return name.contains(p);
   }
}