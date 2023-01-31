package enums;

public enum Priority {

	VERYHIGH(1),
	HIGH(2),
	MEDIUM(3),
	LOW(3),
	VERYLOW(5);
	
	public Integer numerical;
	
	Priority(Integer numerical){
		this.numerical = numerical;
	}
}
