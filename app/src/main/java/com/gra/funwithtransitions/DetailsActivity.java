package com.gra.funwithtransitions;

import android.os.Bundle;
import android.transition.Slide;
import android.view.Gravity;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailsActivity extends AppCompatActivity {

    @BindView(R.id.detailsToolbar)
    Toolbar toolbar;

    @BindView(R.id.headerSubtitleTxt)
    TextView headerSubtitleTxt;

    @BindView(R.id.descriptionTxt)
    TextView descriptionTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);

        // Show back icon
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Slide slide = new Slide(Gravity.BOTTOM);
        slide.setInterpolator(AnimationUtils.loadInterpolator(this, android.R.interpolator.linear_out_slow_in));
        getWindow().setEnterTransition(slide);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}