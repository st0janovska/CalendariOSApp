package tests;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import util.DriverSetup;

@Epic("Mobile automation Calendar app testing")
@Feature("Event")
public class CalendarTest extends DriverSetup {

    @Severity(SeverityLevel.CRITICAL)
    @Description("Test Description: Create new event")
    @Story("Successful creation of a new calendar event")
    @Test(testName = "Calendar test")
    public void calendarTest() {

        Assert.assertTrue(calendarHomePage.calendarHomePageLoaded(), "Calendar home page is not loaded");

        calendarHomePage.chooseTimeslot("7:00 AM");
        Assert.assertTrue(newEventPage.newEventPageLoaded(), "New event page is not loaded");

        newEventPage.chooseStartHour("10", "05");
    }
}
