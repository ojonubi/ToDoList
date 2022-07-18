import java.util.ArrayList;

public class ToDoList {
	private int listOption;
	private ArrayList<String> itemList = new ArrayList<String>();
	String[] itemCategories= {"Grocery", "TravelPlans", "Reminders","Cooking","Personal"};
	
	public void setListOption(int listOpt) {
		this.listOption = listOpt;
	}

	public int getListOption() {
		return listOption;
	}
	
	

}
