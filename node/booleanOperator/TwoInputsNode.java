package node.booleanOperator;

public abstract class TwoInputsNode extends BooleanOperatorNode {
	protected boolean inputValue1;
	protected boolean inputValue2;
	
	@Override
	public void displayInfo() {
		System.out.println("(" + inputValue1 + "," + inputValue2 + ") =>");
		super.displayInfo();
	}
	
	public final void setInputValues(boolean value1, boolean value2) {
		inputValue1 = value1;
		inputValue2 = value2;
	}

}
