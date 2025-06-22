package node.booleanOperator;

public final class AndNode extends TwoInputsNode  {
	@Override
	public void displayInfo() {
		System.out.print("And");
		super.displayInfo();
	}
	
	public final void compute() {
		setOutputValue(inputValue1 & inputValue2);
	}

	@Override
	public Object getClassOfReference() {
		// TODO Auto-generated method stub
		return null;
	}

}
