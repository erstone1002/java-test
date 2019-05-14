
public class problem2 {
	
	private int totalMileage;
	private int milesForward;
	private int milesBackward;
	
	public problem2(int totalMileage, int milesForward, int milesBackward) {
		this.totalMileage = totalMileage;
		this.milesForward = milesForward;
		this.milesBackward = milesBackward;	
		}
	
	private void setTotalMileage(int miles) {
		this.totalMileage += miles;
	}
	
	public int getTotalMileage() {
		return totalMileage;
	}



	public int getMilesForward() {
		return milesForward;
	}



	public int getMilesBackward() {
		return milesBackward;
	}



	public void setMilesForward(int milesForward) {
		this.milesForward = milesForward;
		
	}
	
	public void setMilesBackward (int milesBackward) {
		this.milesBackward = milesBackward;
	}
	
	public void Drive(int miles) {
		System.out.println("This car has driven " + miles + " miles forward");
		setMilesForward(miles);
		setTotalMileage(miles);
	}

	public void Reverse(int miles) {
		System.out.println("This car has driven " + miles + " miles backward");
		setMilesBackward(miles);
		setTotalMileage(miles);
	}

	public static void main(
			String[] args) {
		// TODO Auto-generated method stub
		problem2 oscar = new problem2(13000, 0, 0);
		oscar.Drive(20);

	}

}
