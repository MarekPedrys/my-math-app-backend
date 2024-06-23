package pl.pedrys.mymathapp.data.enums;

public enum MathProblemLevel {
	BASIC("podstawowy"), ADVANCED("rozszerzony");

	private String label;

	private MathProblemLevel(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
}