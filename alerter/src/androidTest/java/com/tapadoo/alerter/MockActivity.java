package com.tapadoo.alerter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * Mock Activity for Testing
 *
 * @author Kevin Murphy
 * @since 5/10/2016
 */
public class MockActivity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mock);
    }
}
