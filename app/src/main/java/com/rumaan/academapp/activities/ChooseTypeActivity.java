package com.rumaan.academapp.activities;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.rumaan.academapp.R;
import com.rumaan.academapp.model.MaterialIn;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnLongClick;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class ChooseTypeActivity extends AppCompatActivity {
    @BindView(R.id.root_view)
    ViewGroup rootView;

    @OnLongClick({R.id.student, R.id.lecturer})
    boolean onLongClick(ImageView imageView) {
        switch (imageView.getId()) {
            case R.id.student:
                Toast.makeText(this, "Student", Toast.LENGTH_SHORT).show();
                break;
            case R.id.lecturer:
                Toast.makeText(this, "Lecturer", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }

    @OnClick({R.id.student, R.id.lecturer})
    void onClick(ImageView imageView) {
        switch (imageView.getId()) {
            case R.id.student:
                // chosen student
                break;
            case R.id.lecturer:
                // chosen lecturer
                break;
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_type);

        ButterKnife.bind(this);
        MaterialIn.animate(rootView);

        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setFontAttrId(R.attr.fontPath)
                .setDefaultFontPath("fonts/regular.ttf")
                .build());

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.finishAffinity();
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}