package com.gra.funwithtransitions;


import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class DetailsActivityTest {

    @Rule
    public ActivityTestRule<DetailsActivity> activityRule =
            new ActivityTestRule<>(DetailsActivity.class);

    @Test
    public void testHeaderImage_IsVisible() {
        EspressoUtils.isViewByIdIsShown(R.id.headerImage);
    }

    @Test
    public void testHeaderImage_Subtitle_IsVisible() {
        EspressoUtils.isViewByIdIsShown(R.id.headerSubtitleTxt);
    }

    @Test
    public void testImage_Description_IsVisible() {
        EspressoUtils.isViewByIdIsShown(R.id.descriptionTxt);
    }
}