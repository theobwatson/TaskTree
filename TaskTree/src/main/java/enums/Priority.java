package enums;

public enum Priority {

	VERYHIGH(1),
	HIGH(2),
	MEDIUM(3),
	LOW(4),
	VERYLOW(5);
	
	public int numerical;
	
	Priority(int numerical){
		this.numerical = numerical;
	}
}
