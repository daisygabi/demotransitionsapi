package com.gra.funwithtransitions;

import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> activityRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testHeader_Date_IsVisible() {
        EspressoUtils.isViewByIdIsShown(R.id.currentDateTxt);
    }

    @Test
    public void testHeader_Layout_IsVisible() {
        EspressoUtils.isViewByIdIsShown(R.id.headerLayout);
    }

    @Test
    public void testClickableImage_IsVisible() {
        EspressoUtils.isViewByIdIsShown(R.id.mainImage);
    }
}