package pageObjects;
import static java.lang.System.out;
public class LocalAbhiBranch {
	// new file that got created.
	/**
	 * this may cause ambiguity - as class may be in both the static import
	 */
	public void myFunc (){
		out.println("I am in Master");
		System.out.println("want to squash - change for EGIT practice");
		out.println("commit-1");
		out.println("commit-2");
		out.println("commit-3");
		out.println("commit-4");
		out.println("commit-5");
		
		System.out.println("cherry-pick #1");
	}

}
