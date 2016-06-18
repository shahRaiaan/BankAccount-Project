
public class Address {
	private String houseNo;
	private int roadNo;
	// data members
	private int zipcode;

	// constructor
	public Address() {

	}

	// returns HouseNo
	public String getHouseNo() {
		return houseNo;
	}

	// returns value for Road No
	public int getRoadNo() {
		return roadNo;
	}

	// returns zipcode
	public int getZipcode() {
		return zipcode;
	}

	// set value for house No
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	// set value for Road No
	public void setRoadNo(int roadNo) {
		this.roadNo = roadNo;
	}

	// set value for zipcode
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public String toString() {
		return " zipcode :" + this.zipcode + ", HouseNo :" + this.houseNo + ", roadNo :" + this.houseNo;

	}

}
