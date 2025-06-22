package node.neuron;

public final class LinearNeuron extends Neuron {
	
	@Override
	public void displayInfo() {
		System.out.print("Lin ( " + inputValue + " ) => ");
		super.displayInfo();
	}
	@Override
	public final void compute() {
		setOutputValue(inputValue);
	}

}
