package ConceptionReseauxNeuroneArtificiel;

public final class LinearNeuron extends Neurone {
	
	@Override
	public void displayInfo() {
		System.out.print("Lin(" + inputValue +") => ");
		super.displayInfo();
	}
	@Override
	public void compute() {
		setOutputValue(inputValue);
	}	

}
