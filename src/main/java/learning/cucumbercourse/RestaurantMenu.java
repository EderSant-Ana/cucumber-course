package learning.cucumbercourse;

import java.util.ArrayList;

public class RestaurantMenu {
	
	ArrayList<RestaurantMenuItem> menuItems = new ArrayList<RestaurantMenuItem>();

	public boolean addMenuItem(RestaurantMenuItem newMenuItem) {
		if(doesItemExist(newMenuItem)) {
			throw new IllegalArgumentException("Duplicate Item");
		}

		boolean itemAdded = menuItems.add(newMenuItem);
		
		System.out.println();
		System.out.println(menuItems);
		System.out.println();
		
		return itemAdded;
	}

	public boolean doesItemExist(RestaurantMenuItem newMenuItem) {
		boolean exists = false;
		if(menuItems.contains(newMenuItem)) {
			exists = true;
		}
		return exists;
	}

}
