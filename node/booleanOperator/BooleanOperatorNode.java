package node.booleanOperator;

import node.Node;

public abstract class BooleanOperatorNode extends Node {
	private boolean outputValue;
	
	public void displayInfo() {
		System.out.println("(" + outputValue + ")");
	}
	
	protected final void setOutputValue(boolean outValue) {
		outputValue = outValue;
	}
	
	public final boolean getOutputValue() {
		return outputValue;
	}
	
	public final Object getClassReference() {
		return BooleanOperatorNode.class;
	}

}
