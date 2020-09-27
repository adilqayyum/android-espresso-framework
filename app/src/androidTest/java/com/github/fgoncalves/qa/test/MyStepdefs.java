package com.github.fgoncalves.qa.test;

import android.app.Activity;
import android.content.Intent;

import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.rule.ActivityTestRule;

import com.github.fgoncalves.qa.MainActivity;
import com.github.fgoncalves.qa.R;

import org.junit.Rule;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

public class MyStepdefs {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    private Activity activity;

    @Before
    public void setup() {
        activityTestRule.launchActivity(new Intent());
        activity = activityTestRule.getActivity();
    }

    @After
    public void tearDown() {
        activityTestRule.finishActivity();
    }

    @When("^I input email (\\S+)$")
    public void I_input_email(final String email) {
        onView(ViewMatchers.withId(com.github.fgoncalves.qa.R.id.email)).perform(typeText(email));
    }

    @When("^I input password \"(.*?)\"$")
    public void I_input_password(final String password) {
        onView(withId(R.id.password)).perform(typeText(password), closeSoftKeyboard());
    }

    @When("^I press sign in button$")
    public void I_press_submit_button() {
        onView(withId(R.id.email_sign_in_button)).perform(click());
    }

    @And("^Wait for \"(.*?)\" seconds$")
    public void Wait_for_seconds(final int seconds) throws InterruptedException {
        Thread.sleep(seconds*1000);
    }

    @Then("^Click me button is present$")
    public void Click_me_button_is_present() {
        onView(ViewMatchers.withId(R.id.OutOfHomeBtn))
                .check(ViewAssertions.matches(ViewMatchers.withText("Click Me!")));
    }

    @Then("^I press click me button$")
    public void I_press_click_me_button() {
        onView(ViewMatchers.withId(R.id.OutOfHomeBtn))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
                .perform(ViewActions.click());
    }

    @Then("^\"(.*?)\" Text is present$")
    public void Text_is_present(final String text) {
        onView(ViewMatchers.withId(R.id.randomTextView))
                .check(ViewAssertions.matches(ViewMatchers.withText(text)));
    }

}
