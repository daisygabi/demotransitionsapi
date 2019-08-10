package com.gra.funwithtransitions;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.anyOf;

/**
 * Helper methods for testing UI interactions
 */
public class EspressoUtils {

    public static void isViewByIdIsShown(int id) {
        onView(anyOf(
                withId(id)))
                .check(matches(isDisplayed()));
    }

    public static void clickViewByIdIfShown(int id) {
        onView(anyOf(
                withId(id)))
                .check(matches(isDisplayed()))
                .perform(click());
    }

    public static void matchStringFromShownViewById(int id, String value) {
        onView(anyOf(
                withId(id)))
                .check(matches(isDisplayed()))
                .check(matches(withText(value)));
    }
}