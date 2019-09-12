package PackBirding;

import java.util.ArrayList;
import java.util.Collections;

public class MenuOptions {
	
	private ArrayList<String> options;
	
	public MenuOptions() {
		options = new ArrayList<String>();
		Collections.addAll(options, "Quit", "Add", "Observation", "Show", "Statistics");
	}
	
	public void printedOptions() {
		for (int i=0; i<options.size(); i++) {
			System.out.println(options.get(i));
		}
	}
	
	public String getOption(String option) {
		return options.get(options.indexOf(option));
	}
}
