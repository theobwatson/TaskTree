package enums;

public enum Priority {

	VERYHIGH(5),
	HIGH(4),
	MEDIUM(3),
	LOW(2),
	VERYLOW(1);
	
	public Integer numerical;
	
	Priority(Integer numerical){
		this.numerical = numerical;
	}
}
