package node;
import node.booleanOperator.*;
import netWork.NetWork;
import node.neuron.*;

public final class MyNetWork {

	public static <OneInputsNode> void main(String[] args) {
        System.out.println("\nArtificial neurons.");
		
        NetWork myNeuralNetwork = new NetWork();
		
		Neuron node1 = new SigmoidNeuron();
		Neuron node2 = new SigmoidNeuron();
		Neuron node3 = new LinearNeuron();
		
		try {
			myNeuralNetwork.addNode(node1);
			myNeuralNetwork.addNode(node2);
			myNeuralNetwork.addNode(node3);
		} catch (Exception e) {
			System.out.println("[Error] ... adding nodes to circuit" );
		}
		
		node1.setInputValue(4);
		node1.compute();
		node2.setInputValue(-3);
		node2.compute();
		node3.setInputValue(node1.getOutputValue()+node2.getOutputValue());
		node3.compute();
		
		myNeuralNetwork.displayInfo();
		
		System.out.println("\n********* Boolean Operateurs *******");
		NetWork myCircuit = new NetWork();
		
		TwoInputsNode node4 = new AndNode();
		TwoInputsNode node5 = new OrNode();
		TwoInputsNode node6 = new OrNode();
		OneInputNode node7 = new Notnode();
		
		try {
			myCircuit.addNode(node4);
			myCircuit.addNode(node5);
			myCircuit.addNode(node6);
			myCircuit.addNode(node7);
		} catch (Exception e){
			System.out.println("[Error] adding nodes to Circuit");
		}
		
		boolean in1 = true;
		boolean in2 = false;
		
		node4.setInputValues(in1, in2);
		node4.compute();
		
		node5.setInputValues(in1, in2);
		node5.compute();
		
		node6.setInputValues(node4.getOutputValue(), node5.getOutputValue());
		node6.compute();
		
		node7.setInputValue(node6.getOutputValue());
		node7.compute();
		
		myCircuit.displayInfo();
		
		System.out.println("\nTerminate.");

	}

}
