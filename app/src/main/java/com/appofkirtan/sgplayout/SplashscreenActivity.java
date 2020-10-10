package com.appofkirtan.sgplayout;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashscreenActivity extends AppCompatActivity{
    private static int SPLASH_SCREEN = 5000;
    WebView webView;

    Animation topAnim,bottomAnim;
    ImageView image;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        //Initialize connectivityManager
        ConnectivityManager connectivityManager = (ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);

        //Get active network Information
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();

        //check network status
        if (networkInfo == null || !networkInfo.isConnected() || !networkInfo.isAvailable()){
            //when internet is inactive

            //initialize dialog
            Dialog dialog = new Dialog(this);
            //set content view
            dialog.setContentView(R.layout.network_alert_dialog);
            //set outside touch
            dialog.setCanceledOnTouchOutside(false);
            //set dialog width and height
            dialog.getWindow().setLayout(WindowManager.LayoutParams.WRAP_CONTENT,WindowManager.LayoutParams.WRAP_CONTENT);
            //Set transparent background
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            //set Animation
            dialog.getWindow().getAttributes().windowAnimations = android.R.style.Animation_Dialog;

            //Initialize dialog variable
            Button btnTryAgainNetwork = dialog.findViewById(R.id.btn_tryAgain_network);
            //Perform onClick Listener
            btnTryAgainNetwork.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //Call recreate method
                    recreate();
                }
            });
            //Show dialog
            dialog.show();
        }else{
            //when internet is Active



            topAnim = AnimationUtils.loadAnimation(this,R.anim.top_animation);
            bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

            image =(ImageView)findViewById(R.id.Image_splash);
            text = (TextView)findViewById(R.id.textView_splash);

            image.setAnimation(topAnim);
            text.setAnimation(bottomAnim);

            long l = 2000;
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    startActivity(new Intent(SplashscreenActivity.this,MainActivity.class));
                    finish();
                }
            },l);

        }



    }
}