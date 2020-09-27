package com.github.fgoncalves.qa;

import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import com.github.fgoncalves.qa.helpers.BaseClass;

import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

import java.io.IOException;

@LargeTest
@RunWith(AndroidJUnit4.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule =
            new ActivityTestRule<>(MainActivity.class, true, true);

    @Test
    public void androidLoginTest() throws IOException, InterruptedException {

        BaseClass homePage = new BaseClass();

        // Login to App
        homePage.enterEmail("percival@gmail.com");
        homePage.enterPassword("123456");
        homePage.clickSignIn();

        Thread.sleep(5000);
        // Verify Click Me Button
        homePage.verifyHomeButton();
        homePage.clickHomeButton();
        }
    }
