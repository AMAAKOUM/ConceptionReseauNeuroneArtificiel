package node.booleanOperator;

public abstract class OneInputNode extends BooleanOperatorNode {
	
	protected boolean inputValue;
	
	@Override
	public void displayInfo() {
		System.out.println("(" + inputValue + ")");
		super.displayInfo();
	}
	public final void setInputValue(boolean value) {
		inputValue = value;
	}

}
