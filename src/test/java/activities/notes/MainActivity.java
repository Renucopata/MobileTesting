package activities.notes;

import control.Button;
import org.openqa.selenium.By;

public class MainActivity {

    public Button proceedButton = new Button(By.id("android:id/button1"));
    public Button addButton = new Button(By.id("com.gs.stickit:id/add_note"));

    public Button menuButton = new Button(By.xpath("//android.widget.ImageButton[@content-desc=\"Open\"]"));
    public Button workLabel = new Button(By.xpath("//android.widget.TextView[@resource-id=\"com.gs.stickit:id/label_name\" and @text=\"Work\"]"));




}



