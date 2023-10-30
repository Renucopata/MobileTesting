package activities.calculator;

import control.Button;
import control.Label;
import control.TextBox;
import org.openqa.selenium.By;

public class MainCalendar {
    public Button freeTrialButton = new Button(By.id("com.simplemobiletools.calendar:id/dialog_trial_start_free_trial"));
    public Button plusButton = new Button(By.id("com.simplemobiletools.calendar:id/calendar_fab"));
    public Button newEvent = new Button(By.xpath("//android.widget.ImageButton[@content-desc=\"New Event\"]"));
    public TextBox eventTitle = new TextBox(By.id("com.simplemobiletools.calendar:id/event_title"));
    public Button saveEvent = new Button(By.id("com.simplemobiletools.calendar:id/save"));
    public Button okButton = new Button(By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]\n"));
    public Button searchButton = new Button(By.id("com.simplemobiletools.calendar:id/search"));

    public TextBox searchBox = new TextBox(By.id("com.simplemobiletools.calendar:id/search_src_text"));

    public Label result = new Label(By.xpath("//android.widget.TextView[@text=\"Even\"]"));


    public Label resultLabel = new Label(By.xpath("//android.widget.TextView[@resource-id=\"com.simplemobiletools.calendar:id/event_item_title\"]"));

}
