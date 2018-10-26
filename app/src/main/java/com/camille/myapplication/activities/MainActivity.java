package com.camille.myapplication.activities;

import android.opengl.GLSurfaceView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.camille.myapplication.model.MyGL.MyGLSurfaceView;

public class MainActivity extends AppCompatActivity {

    private GLSurfaceView mGlSurfaceView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Create a GLSurfaceView instance and set it
        // as the ContentView for this Activity
        mGlSurfaceView = new MyGLSurfaceView(this);
        setContentView(mGlSurfaceView);
    }
}
