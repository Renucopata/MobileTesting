package testSuite;

import activities.notes.*;
import control.Label;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import session.Session;

import java.util.Date;

public class StickyNotesTest {

    MainActivity mainActivity = new MainActivity();
    AddNoteScreen addNoteScreen = new AddNoteScreen();
    AdScreen adScreen = new AdScreen();
    TermsConditions termsConditions = new TermsConditions();
    WorkDashboard workDashboard = new WorkDashboard();

    @Test
    public void verifyAddNote()throws InterruptedException{
        String NOTE = "Note" + new Date().getTime();
        termsConditions.acceptButton.click();
        mainActivity.proceedButton.click();
        mainActivity.addButton.click();
        addNoteScreen.noteContent.setText(NOTE);
        addNoteScreen.saveButton.click();
        Thread.sleep(8000);
       // adScreen.closeButton.click();

        Label noteLabel = new Label(By.xpath("//android.widget.TextView[@resource-id=\"com.gs.stickit:id/tiny_snippet\" and @text=\""+NOTE+"\"]"));
        Assertions.assertTrue(noteLabel.isControlDisplayed(),"Error al crear la alarma");
    }

    @Test
    public void verifyAddNoteWithLabel()throws InterruptedException{
        String NOTE = "Note" + new Date().getTime();
        termsConditions.acceptButton.click();
        mainActivity.proceedButton.click();
        mainActivity.menuButton.click();
        mainActivity.workLabel.click();
        workDashboard.addButton.click();
        addNoteScreen.noteContent.setText(NOTE);
        addNoteScreen.saveButton.click();
        Thread.sleep(8000);

        Label noteLabel = new Label(By.xpath("//android.widget.TextView[@resource-id=\"com.gs.stickit:id/tiny_snippet\" and @text=\""+NOTE+"\"]"));
        Label workLabelDash = new Label(By.xpath("//android.widget.TextView[@text=\"Work - 2\"]"));
        Assertions.assertTrue(noteLabel.isControlDisplayed() && workLabelDash.isControlDisplayed(),"Error al crear la alarma");
    }

    @AfterEach
    public void closeApp(){
        Session.getSession().closeApp();
    }

}
