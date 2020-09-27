package com.github.fgoncalves.qa.helpers;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;

import com.github.fgoncalves.qa.R;

public class BaseClass {

    public void enterEmail(String email) {
        Espresso.onView(ViewMatchers.withId(R.id.email))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
                .perform(ViewActions.replaceText(email), ViewActions.closeSoftKeyboard());
    }

    public void enterPassword(String password) {
        Espresso.onView(ViewMatchers.withId(R.id.password))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
                .perform(ViewActions.replaceText(password), ViewActions.closeSoftKeyboard());
    }

    public void clickSignIn() {
        Espresso.onView(ViewMatchers.withId(R.id.email_sign_in_button))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
                .perform(ViewActions.click());
    }

    public void verifyHomeButton() {
        Espresso.onView(ViewMatchers.withId(R.id.OutOfHomeBtn))
                .check(ViewAssertions.matches(ViewMatchers.withText("Click Me!")));
    }

    public void clickHomeButton() {
        Espresso.onView(ViewMatchers.withId(R.id.OutOfHomeBtn))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
                .perform(ViewActions.click());
    }
}
