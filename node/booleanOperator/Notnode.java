package node.booleanOperator;

public final class Notnode extends OneInputNode {
	
	@Override
	public void displayInfo() {
		System.out.println("NOT");
		super.displayInfo();
	}
	@Override
	public void compute() {
		setOutputValue(!inputValue);
	}
	@Override
	public Object getClassOfReference() {
		// TODO Auto-generated method stub
		return null;
	}

}
