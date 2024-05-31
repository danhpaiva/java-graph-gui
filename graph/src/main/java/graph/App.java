package graph;

import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;



public class App {

	public static void main(String[] args) {
		System.setProperty("org.graphstream.ui", "swing");

		 Graph graph = new SingleGraph("Grafo");
		 graph.setAttribute("ui.stylesheet", "node{\n" +
	                "    size: 60px, 60px;\n" +
	                "    fill-color: #f7f7f0;\n" +
	                "    text-mode: normal; \n" +
	                "}");
		
		 graph.addNode("0");  
		 graph.addNode("1");  
		 graph.addNode("2");  
		 graph.addNode("3");   
		 graph.addNode("4");
		 
		 graph.addEdge("01", "0", "1"); 
		 graph.addEdge("04", "0", "4"); 
		 graph.addEdge("12", "1", "2"); 
		 graph.addEdge("13", "1", "3"); 
		 graph.addEdge("14", "1", "4"); 
		 graph.addEdge("23", "2", "3"); 
		 graph.addEdge("34", "3", "4"); 

		 for (Node node : graph) {
		        node.setAttribute("ui.label", node.getId());
		    }

		 graph.display();   
 
	}

}
