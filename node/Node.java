package node;
import Interfaces.LogInterface;

public abstract class Node implements LogInterface {
	
	public abstract void compute();
	public abstract Object getClassOfReference();

}
