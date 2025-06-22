package node.neuron;

public final class SigmoidNeuron extends  Neuron  {
	
	@Override
	public void displayInfo() {
		System.out.print("Sig ( " + inputValue + " ) => ");
		super.displayInfo();
	}
	@Override
	public final void compute() {
		setOutputValue(Math.tanh(inputValue));
	}

}
