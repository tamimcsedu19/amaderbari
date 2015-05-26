package sdp.ratajo.amaderbari.dto.flatpack;


public class ExtraFlatData {
	private long extraFlatDataId;
	private String type;
	private int numOfBed;
	private int numOfBath;
	private int numOfBalcony;
	private int numOfDining;
	private int numOfDrawing;
	private int numOfKitchen;
	
	public ExtraFlatData(){}

	public ExtraFlatData(long extraFlatDataId, String type, int numOfBed,
			int numOfBath, int numOfBalcony, int numOfDining, int numOfDrawing,
			int numOfKitchen) {
		super();
		this.extraFlatDataId = extraFlatDataId;
		this.type = type;
		this.numOfBed = numOfBed;
		this.numOfBath = numOfBath;
		this.numOfBalcony = numOfBalcony;
		this.numOfDining = numOfDining;
		this.numOfDrawing = numOfDrawing;
		this.numOfKitchen = numOfKitchen;
	}

	public long getExtraFlatDataId() {
		return extraFlatDataId;
	}

	public void setExtraFlatDataId(long extraFlatDataId) {
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

	@Override
	public String toString() {
		return "ExtraData [extraFlatDataId=" + extraFlatDataId + ", type=" + type
				+ ", numOfBed=" + numOfBed + ", numOfBath=" + numOfBath
				+ ", numOfBalcony=" + numOfBalcony + ", numOfDining="
				+ numOfDining + ", numOfDrawing=" + numOfDrawing
				+ ", numOfKitchen=" + numOfKitchen + "]";
	}
}
