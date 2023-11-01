package activities.notes;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class AddNoteScreen {

    public TextBox noteContent = new TextBox(By.id("com.gs.stickit:id/note_content"));

    public Button saveButton = new Button(By.id("com.gs.stickit:id/save"));



}
