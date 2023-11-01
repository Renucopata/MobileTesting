package testSuite;


import activities.clock.AlarmFragment;
import activities.clock.MainActivity;
import activities.clock.SetHourModal;
import control.Label;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import session.Session;

import java.util.Date;

public class ClockTest {

    MainActivity mainActivity = new MainActivity();
    AlarmFragment alarmFragment = new AlarmFragment();
    SetHourModal setHourModal = new SetHourModal();


    @Test
    public void verifySetAlarm()throws InterruptedException{
        String hour= "06";
        String minutes= "30";
        mainActivity.alarmButton.click();
        alarmFragment.plusButton.click();
        setHourModal.keyBoardButton.click();
        setHourModal.setHourBox.setText(hour);
        setHourModal.setMinutesBox.setText(minutes);
        setHourModal.slectorAmPm.click();
        setHourModal.amButton.click();
        setHourModal.okButton.click();
        Thread.sleep(5000);
        Label nameAlarmLabel = new Label(By.id("com.google.android.deskclock:id/edit_label"));
        Assertions.assertTrue(nameAlarmLabel.isControlDisplayed(),"Error al crear la alarma");

    }

    @AfterEach
    public void closeApp(){
        Session.getSession().closeApp();
    }



}
