package com.gra.funwithtransitions;


import androidx.test.espresso.Espresso;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * UI tests for details feature
 */
@RunWith(AndroidJUnit4.class)
public class DetailsActivityTest {

    @Before
    public void setUp() {
        // So test can see the views behind the keyboard
        Espresso.closeSoftKeyboard();
    }

    @Rule
    public ActivityTestRule<DetailsActivity> activityRule =
            new ActivityTestRule<>(DetailsActivity.class);

    @Test
    public void testHeaderImage_IsVisible() {
        EspressoUtils.isViewByIdIsShown(R.id.headerImage);
    }

    @Test
    public void testHeaderImageSubtitle_IsVisible() {
        EspressoUtils.isViewByIdIsShown(R.id.headerSubtitleTxt);
    }
}