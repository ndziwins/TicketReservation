package airTicketReservation;

public final class Airport {
	
	private final String tag;
	private final String fullName;
	private final String location;
	
	public Airport(String tag, String fullName, String location) {
		this.tag = tag;
		this.fullName = fullName;
		this.location = location;
	}

	public String getTag() {
		return tag;
	}

	public String getName() {
		return fullName;
	}

	public String getLocation() {
		return location;
	}
	
	public String getInformation() {
		return tag +", "+ fullName+", "+location;
	}
}

