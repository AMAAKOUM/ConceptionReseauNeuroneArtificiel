package ConceptionReseauxNeuroneArtificiel;

public final class SigmoidNeuron extends Neurone {	
	
	@Override
	public void displayInfo() {
		System.out.print("Sig(" + inputValue +") => " );
		super.displayInfo();
	}
	@Override
	public void compute() {
		setOutputValue(Math.tanh(inputValue));
	}

}
