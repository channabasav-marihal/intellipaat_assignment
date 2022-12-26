package module5;

public class Question4 {
	private int Standard;
	private int Rollno;
	private String Section;
	public Question4(int standard, int rollno, String section) {
		super();
		Standard = standard;
		Rollno = rollno;
		Section = section;
	}
	public int getStandard() {
		return Standard;
	}
	public void setStandard(int standard) {
		Standard = standard;
	}
	public int getRollno() {
		return Rollno;
	}
	public void setRollno(int rollno) {
		Rollno = rollno;
	}
	public String getSection() {
		return Section;
	}
	public void setSection(String section) {
		Section = section;
	}
	@Override
	public String toString() {
		return "Question4 [Standard=" + Standard + ", Rollno=" + Rollno + ", Section=" + Section + "]";
	}
	public static void main(String[] args) {
		Question4 question = new Question4(5, 101, "A");
		System.out.println(question);
	}

}
