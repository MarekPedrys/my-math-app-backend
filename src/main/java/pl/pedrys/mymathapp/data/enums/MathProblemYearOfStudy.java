package pl.pedrys.mymathapp.data.enums;

public enum MathProblemYearOfStudy {
	SECONDARY_SCHOOL_1("1 LO"), SECONDARY_SCHOOL_2("2 LO"), SECONDARY_SCHOOL_3("3 LO"), SECONDARY_SCHOOL_4("4 LO");

	private String labelString;

	private MathProblemYearOfStudy(String labelString) {
		this.labelString = labelString;
	}

	public String getLabelString() {
		return labelString;
	}

	public void setLabelString(String labelString) {
		this.labelString = labelString;
	}
}