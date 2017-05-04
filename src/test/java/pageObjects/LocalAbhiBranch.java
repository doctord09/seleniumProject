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
		System.out.println("cherry-pick #2");
		
		System.out.println("local: Rebase changes #1");
		System.out.println("local: Rebase changes #2");
		System.out.println("local: Rebase changes #3");
		System.out.println("create a conflict");


		System.out.println("Create second conflict");



		System.out.println("create a change in master");
		System.out.println("Create 2 change in master");
		System.out.println("Create 3 change in master");
		
		System.out.println("change 4");
		System.out.println("change 5");
		System.out.println("change 6");
		
		System.out.println("change 7");
		System.out.println("change 8");
		System.out.println("change 9");
		
		System.out.println("change 10");
		System.out.println("change 11");
		System.out.println("change 12");

		}

}
