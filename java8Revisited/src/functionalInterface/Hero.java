package functionalInterface;

public class Hero {
	
	private String name;
	private boolean canFly;
	
	public Hero(String name, boolean canFly) {
		super();
		this.name = name;
		this.canFly = canFly;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isCanFly() {
		return canFly;
	}

	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}
	
	
	

}
