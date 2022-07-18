import java.util.Scanner;
import java.util.ArrayList;
public class ToDoRunner {

	public static void main(String[] args) {
		ArrayList<String> itemList = new ArrayList<String>();
		Scanner scan= new Scanner(System.in);
		Scanner intVal = new Scanner(System.in);
		
		
		
		int choice;
		int removeVal;
		int updateVal;
		String updateList;
		String itemVal;
		String projectName;
		
		//program starts here:
		System.out.println("Welcome to your To Do List Manager:\n");
		System.out.println("Enter the name of the project: ");	
		projectName = scan.nextLine();
		
		
		do {
			System.out.println("Select an option from the item below: ");
			System.out.println("Select 1 to view list Items");
			System.out.println("Select 2 to add an item to the list Items");
			System.out.println("Select 3 to remove an item from the list Item");
			System.out.println("Select 4 to update a list Item");
			System.out.println("Select 5 to clear out all the items on the list");
			System.out.println("Select 6 to exit");
			System.out.print("Enter option here: "); 
			choice= intVal.nextInt();
			
			if(choice ==1) {
				//list all the items on the to do list
				System.out.println("Below are the items in your " + projectName);
				int ni = 0;
				for(String listIt:itemList) {
					ni+=1;
					System.out.println(ni +": " +listIt);
				}
				
				
			}else if(choice ==2) {
				//add an item to the to do list
				System.out.println("Add an item to your to do list");
				itemVal = scan.nextLine();
				itemList.add(itemVal);
				System.out.println("Item has been added to the list");
				
			}else if(choice == 3) {
				//remove an item from the to do list
				System.out.println("To remove an item, select the item number from the list below: ");
				int ni = 0;
				for(String listIt:itemList) {
					ni+=1;
					System.out.println(ni +": " +listIt);
				}
				removeVal= intVal.nextInt();
				
				//confirm that the item to be removed is within the item range.
				if(removeVal <= itemList.size() && removeVal>=0) {
					itemList.remove(removeVal);
					System.out.println("You successfully removed the item");
					
				}
				else {
					//display string if the value is not within range
					System.out.println("The value you entered is not within the item size");
				}
				
				
			}else if(choice == 4) {
				//update a list item
				System.out.println("Select the item number you want to update from the list below");
				int ni = 0;
				for(String listIt:itemList) {
					ni+=1;
					System.out.println(ni +": " +listIt);
				}
				updateVal = intVal.nextInt();
				System.out.println("What item would you want to add to the list: ");
				updateList=scan.nextLine();
				
				//update the arrayList
				itemList.set(updateVal, updateList);
				System.out.println("Item has been updated");
				
				
			}else if(choice ==5){
			//clear all items on the list
				itemList.clear();
				System.out.println("All items on the list have been deleted");
				}
			else if(choice ==6) {
				//this will exit the app
			}
			else {
				System.out.println("You entered a wrong option: ");
			}
			
		}while(choice!=6);
		System.out.println("Project name is " + projectName);
		

	}

}
