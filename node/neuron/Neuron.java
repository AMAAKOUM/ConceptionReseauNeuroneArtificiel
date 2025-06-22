package node.neuron;
import node.Node;

public abstract class Neuron extends Node {
	
	private double outputValue;
	protected double inputValue;
	
	//public abstract void compute();
	
	public void displayInfo() {
		System.out.println("( " + outputValue + " )");
	}
	
	public final double getOutputValue() {
		return outputValue;
	}
	protected final void setOutputValue(double outValue) {
		outputValue = outValue;
	}
	
	public final void setInputValue(double inValue) {
		inputValue = inValue;
	}
	
	public final Object getClassOfReference() {
		return Neuron.class;
	}
	
	

}
