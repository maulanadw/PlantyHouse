package com.maulanadw.plantyhouse;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailPlantActivity extends AppCompatActivity {

    private ImageButton btnKembali;
    private ImageView iv_image_photo;
    private TextView tv_plant_name, tv_plant_alias, tv_plant_description;

    @SuppressLint("WrongConstant")
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_plant);

        btnKembali = findViewById(R.id.btnKembali);
        iv_image_photo = findViewById(R.id.iv_image_photo);
        tv_plant_name = findViewById(R.id.tv_plant_name);
        tv_plant_alias = findViewById(R.id.tv_plant_alias);
        tv_plant_description = findViewById(R.id.tv_plant_description);

        btnKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        int photoImage = getIntent().getIntExtra("image_photo", 0);
        String plantName = getIntent().getStringExtra("plant_name");
        String plantAlias = getIntent().getStringExtra("plant_alias");
        String plantDetail = getIntent().getStringExtra("plant_detail");

        Glide.with(this).asBitmap().load(photoImage).into(iv_image_photo);

        tv_plant_name.setText(plantName);
        tv_plant_description.setJustificationMode(Layout.JUSTIFICATION_MODE_INTER_WORD);
        tv_plant_description.setText(plantDetail);
        tv_plant_alias.setText(plantAlias);
    }
}