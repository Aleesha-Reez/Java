
public class TestDrive {
	
	public static void main(String[] args) {
		PsychiatristObject p = new PsychiatristObject();
		MoodyObject happy = new HappyObject();
		MoodyObject sad = new SadObject();
		System.out.println("How are you feeling today?");
		p.examine(happy);;
		System.out.println();
		p.observe(happy);
		System.out.println("Observation :" +happy);
		System.out.println();
		System.out.println("How are you feeling today?");
		p.examine(sad);
		System.out.println();
		p.observe(sad);
		System.out.println("Observation :"+sad);
		System.out.println("\n");
		System.out.println("Press any key to continue..._");

}
}