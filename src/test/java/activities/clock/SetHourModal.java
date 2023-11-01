package activities.clock;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class SetHourModal {

    public Button keyBoardButton = new Button(By.id("android:id/toggle_mode"));
    public TextBox setHourBox = new TextBox(By.id("android:id/input_hour"));
    public TextBox setMinutesBox = new TextBox(By.id("android:id/input_minute"));
    public Button slectorAmPm = new Button(By.id("android:id/am_pm_spinner"));
    public Button amButton = new Button(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"AM\"]"));
    public Button okButton = new Button(By.id("android:id/button1"));
}
