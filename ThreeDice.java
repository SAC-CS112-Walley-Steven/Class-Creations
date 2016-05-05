
public class ThreeDice {
	
	private int D1 = 1 + (int)(Math.random() *6);
	private int D2 = 1 + (int)(Math.random() *6);
	private int D3 = 1 + (int)(Math.random() *6);
	
	public int Throw()
	{
		int average = (D1 + D2 + D3)/3;
		return average;
	}

}
