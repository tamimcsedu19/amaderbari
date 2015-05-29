package sdp.ratajo.amaderbari.dto.flatpack;


public class ExtraFlatData {
	private Integer extraFlatDataId;
	private String flatNum;
	private String type;
	private int numOfBed;
	private int numOfBath;
	private int numOfBalcony;
	private int numOfDining;
	private int numOfDrawing;
	private int numOfKitchen;
	
	public ExtraFlatData(){}

	public ExtraFlatData(Integer extraFlatDataId, String flatNum, String type,
			int numOfBed, int numOfBath, int numOfBalcony, int numOfDining,
			int numOfDrawing, int numOfKitchen) {
		super();
		this.extraFlatDataId = extraFlatDataId;
		this.flatNum = flatNum;
		this.type = type;
		this.numOfBed = numOfBed;
		this.numOfBath = numOfBath;
		this.numOfBalcony = numOfBalcony;
		this.numOfDining = numOfDining;
		this.numOfDrawing = numOfDrawing;
		this.numOfKitchen = numOfKitchen;
	}



	public Integer getExtraFlatDataId() {
		return extraFlatDataId;
	}

	public void setExtraFlatDataId(Integer extraFlatDataId) {
		this.extraFlatDataId = extraFlatDataId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNumOfBed() {
		return numOfBed;
	}

	public void setNumOfBed(int numOfBed) {
		this.numOfBed = numOfBed;
	}

	public int getNumOfBath() {
		return numOfBath;
	}

	public void setNumOfBath(int numOfBath) {
		this.numOfBath = numOfBath;
	}

	public int getNumOfBalcony() {
		return numOfBalcony;
	}

	public void setNumOfBalcony(int numOfBalcony) {
		this.numOfBalcony = numOfBalcony;
	}

	public int getNumOfDining() {
		return numOfDining;
	}

	public void setNumOfDining(int numOfDining) {
		this.numOfDining = numOfDining;
	}

	public int getNumOfDrawing() {
		return numOfDrawing;
	}

	public void setNumOfDrawing(int numOfDrawing) {
		this.numOfDrawing = numOfDrawing;
	}

	public int getNumOfKitchen() {
		return numOfKitchen;
	}

	public void setNumOfKitchen(int numOfKitchen) {
		this.numOfKitchen = numOfKitchen;
	}

	public String getFlatNum() {
		return flatNum;
	}

	public void setFlatNum(String flatNum) {
		this.flatNum = flatNum;
	}

	@Override
	public String toString() {
		return "ExtraFlatData [extraFlatDataId=" + extraFlatDataId
				+ ", flatNum=" + flatNum + ", type=" + type + ", numOfBed="
				+ numOfBed + ", numOfBath=" + numOfBath + ", numOfBalcony="
				+ numOfBalcony + ", numOfDining=" + numOfDining
				+ ", numOfDrawing=" + numOfDrawing + ", numOfKitchen="
				+ numOfKitchen + "]";
	}
	
}
