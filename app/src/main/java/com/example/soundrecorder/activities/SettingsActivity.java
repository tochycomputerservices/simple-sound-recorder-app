package com.example.soundrecorder.activities;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;

import com.example.soundrecorder.R;
import com.example.soundrecorder.fragments.SettingsFragment;

/**
 * Created by Tochy on 5/22/2021.
 */

public class SettingsActivity extends androidx.appcompat.app.AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferences);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setPopupTheme(R.style.ThemeOverlay_AppCompat_Light);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setTitle(R.string.action_settings);
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowHomeEnabled(true);
        }

        getFragmentManager()
                .beginTransaction()
                .replace(R.id.container, new SettingsFragment())
                .commit();
    }
}
