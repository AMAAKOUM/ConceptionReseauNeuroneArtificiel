package ConceptionReseauxNeuroneArtificiel;

public abstract class Neurone {
	protected double inputValue;
	private double outputValue;
	
	public abstract void compute();
	
	public void displayInfo() {
		System.out.println("(" + outputValue + ")");
	}
	
	public final double getOutputValue() {return outputValue;}
	public final void setOutputValue(double sortie) {
		outputValue = sortie;
	}
	
	public final void   setInputValue(double entree) {
		inputValue = entree;
	}

}
