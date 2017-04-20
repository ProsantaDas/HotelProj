package frameworkConfig;

public class ObjectStorage {
	// Website of Application.
	public static String testSite="https://www.hotels.com/";
	//Element Home Page.
	public static final String hotelSearch="//input[@id='qf-0q-destination']";
	public static final String checkIn="//input[@id='qf-0q-localised-check-in']";
	public static final String checkOut="//input[@id='qf-0q-localised-check-out']";
	public static final String popupWindow="//*[@id='managed-overlay']/button";
	public static final String rooms="//*[@id='qf-0q-compact-occupancy']";
	public static final String children="//select[@id='qf-0q-room-0-children']";
	public static final String child1="//select[@id='qf-0q-room-0-child-0-age']";
	public static final String child2="//select[@id='qf-0q-room-0-child-1-age']";
	public static final String search="//button[@type='submit']";
	// Element popupLanding page.
	public static final String locationList="//div[@role='listbox']//tbody//tr";
	public static final String checkInDates="//div[@class='widget-datepicker'][1]//tbody//td";
	public static final String checkOutDates="//div[@class='widget-datepicker'][1]//tbody//td";
	public static final String clickMoreOption="//*[@id='qf-0q-compact-occupancy']";
	public static final String pickChildren="//select[@id='qf-0q-room-0-children']";
	public static final String listChild1Age="//select[@id='qf-0q-room-0-child-0-age']/option";
	public static final String listChild2Age="//select[@id='qf-0q-room-0-child-1-age']/option";

}
