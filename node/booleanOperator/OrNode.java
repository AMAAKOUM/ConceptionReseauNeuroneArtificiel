package node.booleanOperator;

public final class OrNode extends TwoInputsNode {
	
	@Override
	public void displayInfo() {
		System.out.println("OR");
		super.displayInfo();
	}
	
	@Override
	public final void compute() {
		setOutputValue (inputValue1 | inputValue2);
	}

	@Override
	public Object getClassOfReference() {
		// TODO Auto-generated method stub
		return null;
	}

}
