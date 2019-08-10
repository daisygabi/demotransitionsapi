package com.gra.funwithtransitions;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.gra.funwithtransitions.utils.DateUtils;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.mainImage)
    ImageView mainImage;

    @BindView(R.id.currentDateTxt)
    TextView currentDateTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mainImage.setOnClickListener(this);
        currentDateTxt.setText(DateUtils.getCurrentDate());
    }

    @Override
    public void onClick(View view) {
        Intent openDetailsViewIntent = new Intent(this, DetailsActivity.class);
        startActivity(openDetailsViewIntent, ActivityOptions.makeSceneTransitionAnimation(this, mainImage, "target").toBundle());
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                supportFinishAfterTransition();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
