package pageObjects;
import static java.lang.System.out;
public class LocalAbhiBranch {
	// new file that got created.
	/**
	 * this may cause ambiguity - as class may be in both the static import
	 */
	public void myFunc (){
		out.println("I am in Master");
	}

}
