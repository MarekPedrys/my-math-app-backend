package pl.pedrys.mymathapp.data.enums;

public enum MathProblemDepartment {
	LICZBY_RZECZYWISTE("Liczby rzeczywiste"), FUNKCJE("Funkcje"), PLANIMETRIA("Planimetria"), GEOMETRIA_ANALITYCZNA("Geometria analityczna"), CIAGI("Ciągi"), PRAWDOPODOBIENSTWO("Prawdopodobieńśtwo");

	private String labelString;
	
	private MathProblemDepartment(String labelString) {
		this.labelString = labelString;
	}

	public String getLabelString() {
		return labelString;
	}
}