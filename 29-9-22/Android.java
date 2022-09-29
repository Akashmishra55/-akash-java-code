package lab;

public class Android {
	double display;
	int ram;
	String color;
	
	public Android(double display, int ram, String color) {
		this.display = display;
		this.ram = ram;
		this.color = color;
		
	}

    @Override
	public String toString() {
		return "Android [ram" +ram + ", color=" + color + "]";
	}
}

