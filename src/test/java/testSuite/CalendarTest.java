package testSuite;

import activities.calculator.MainCalendar;
import control.Label;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.openqa.selenium.By;
import session.Session;

public class CalendarTest {
    MainCalendar mainCalendar = new MainCalendar();
    String EVENT_NAME = "Evento1";
    @Test
    public void verifyAddCalculator() throws InterruptedException{
        mainCalendar.freeTrialButton.click();
        mainCalendar.plusButton.click();
        mainCalendar.newEvent.click();
        mainCalendar.eventTitle.setText(EVENT_NAME);

        mainCalendar.saveEvent.click();
        Thread.sleep(5000);
        mainCalendar.okButton.click();
        Thread.sleep(5000);
        String expectedResult = EVENT_NAME;
        mainCalendar.searchButton.click();
        mainCalendar.searchBox.setText(EVENT_NAME);
        Label result = new Label(By.xpath("//android.widget.TextView[@text=\""+EVENT_NAME+"\"]"));
        Assertions.assertTrue(result.isControlDisplayed(),  "ERROR No se pudo crear el evento");



    }
    @AfterEach
    public void closeApp(){
        Session.getSession().closeApp();
    }



}
