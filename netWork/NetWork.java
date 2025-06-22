package netWork;
import java.util.ArrayList;

import Interfaces.LogInterface;
import node.Node;
import node.neuron.Neuron;
import node.booleanOperator.BooleanOperatorNode;


public class NetWork implements LogInterface {
	private ArrayList<Node> nodeList;
	private Object ChgtClass;
	
	public NetWork() {
		nodeList = new ArrayList<Node>();
		ChgtClass = null;
	}
	public final void addNode(Node node) throws Exception {
		if (ChgtClass == null) {
			ChgtClass = node.getClassOfReference();
		} else {
			if (node.getClassOfReference() != ChgtClass) {
				System.out.println("[Error] ....Impossible de Stocker Plusieurs Noeuds  ");
				return;
			}
		}
		
		nodeList.add(node);
	}
	
	public void checkCoherence() {
		for(Node node:nodeList) {
			try {
				checkNodeType(node);
			} catch (Exception e) {
				System.out.println("[Error] ... un noeud inconnu");
			}
		}
	}
	
	public boolean checkNodeType(Node node) throws Exception {
		if(node instanceof Neuron) {
			System.out.println("[test] Noeud choisi est Un Neurone");
		} else {
			System.out.println("[Error] Un noeud inconnu");
			throw new Exception();
		}
		return true;
	}
	
	@Override
	public final void displayInfo() {
		for (Node node:nodeList) {
			node.displayInfo();
		}
	}
	
	

}
