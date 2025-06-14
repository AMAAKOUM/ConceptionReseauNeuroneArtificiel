package ConceptionReseauxNeuroneArtificiel;

public final class MyNetWork {

	public static void main(String[] args) {
		System.out.println("\n\tReseau Neurone Artificiel");
		Neurone node1 = new SigmoidNeuron();
		Neurone node2 = new SigmoidNeuron();
		Neurone node3 = new LinearNeuron();
		
		node1.setInputValue(4);
		node1.compute();
		node2.setInputValue(-3);
		node2.compute();
		node3.setInputValue(node1.getOutputValue() + node2.getOutputValue());
		node3.compute();
		
		node1.displayInfo();
		node2.displayInfo();
		node3.displayInfo();
		
		System.out.println("\n\t Termine");

	}

}
