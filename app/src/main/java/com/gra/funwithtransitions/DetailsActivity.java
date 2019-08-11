package com.gra.funwithtransitions;

import android.os.Bundle;
import android.transition.Slide;
import android.view.Gravity;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailsActivity extends AppCompatActivity {

    @BindView(R.id.descriptionTxt)
    TextView descriptionTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        ButterKnife.bind(this);

        Slide animation = new Slide(Gravity.BOTTOM);
        animation.setInterpolator(AnimationUtils.loadInterpolator(this, android.R.interpolator.linear_out_slow_in));

        animation.excludeTarget(android.R.id.statusBarBackground, true);
        animation.excludeTarget(android.R.id.navigationBarBackground, true);

        getWindow().setEnterTransition(animation);
        getWindow().setExitTransition(animation);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}