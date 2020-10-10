package com.appofkirtan.sgplayout;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.ArrayList;

public class SeatBookingActivity extends AppCompatActivity {

    ArrayList seatnumber = new ArrayList();

    ToggleButton seat1,seat2,seat3,seat4,seat5;
    ToggleButton seat6,seat7,seat8,seat9,seat10;
    ToggleButton seat11,seat12,seat13,seat14,seat15;
    ToggleButton seat16,seat17,seat18,seat19,seat20;
    ToggleButton seat21,seat22,seat23,seat24,seat25;
    Button button;
    ArrayList<Integer> demo = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seat_booking);

        seat1 = findViewById(R.id.seat1);
        seat2 = findViewById(R.id.seat2);
        seat3 = findViewById(R.id.seat3);
        seat4 = findViewById(R.id.seat4);
        seat5 = findViewById(R.id.seat5);
        seat6 = findViewById(R.id.seat6);
        seat7 = findViewById(R.id.seat7);
        seat8 = findViewById(R.id.seat8);
        seat9 = findViewById(R.id.seat9);
        seat10 = findViewById(R.id.seat10);
        seat11 = findViewById(R.id.seat11);
        seat12 = findViewById(R.id.seat12);
        seat13 = findViewById(R.id.seat13);
        seat14 = findViewById(R.id.seat14);
        seat15 = findViewById(R.id.seat15);
        seat16 = findViewById(R.id.seat16);
        seat17 = findViewById(R.id.seat17);
        seat18 = findViewById(R.id.seat18);
        seat19 = findViewById(R.id.seat19);
        seat20 = findViewById(R.id.seat20);
        seat21 = findViewById(R.id.seat21);
        seat22 = findViewById(R.id.seat22);
        seat23 = findViewById(R.id.seat23);
        seat24 = findViewById(R.id.seat24);
        seat25 = findViewById(R.id.seat25);

        button = findViewById(R.id.button);
        demo.add(1);
        if (demo.contains(1)){
            seat1.setBackground(getResources().getDrawable(R.drawable.ic_seats_booked));
           // seat1.isClickable();
        }else {
            seat1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @SuppressLint("UseCompatLoadingForDrawables")
                @Override
                public void onCheckedChanged(CompoundButton buttonview, boolean ischecked) {
                    if (ischecked) {
                        buttonview.setBackground(getResources().getDrawable(R.drawable.ic_seats_selected));
                        seatnumber.add(buttonview.getText());
                    } else {
                        buttonview.setBackground(getResources().getDrawable(R.drawable.ic_seat));
                        seatnumber.remove(buttonview.getText());
                    }
                }
            });

        }


        seat2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onCheckedChanged(CompoundButton buttonview, boolean ischecked) {
                if (ischecked){
                    buttonview.setBackground(getResources().getDrawable(R.drawable.ic_seats_selected));
                    seatnumber.add(buttonview.getText());
                }else{
                    buttonview.setBackground(getResources().getDrawable(R.drawable.ic_seat));
                    seatnumber.remove(buttonview.getText());
                }
            }
        });
        seat3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onCheckedChanged(CompoundButton buttonview, boolean ischecked) {
                if (ischecked){
                    buttonview.setBackground(getResources().getDrawable(R.drawable.ic_seats_selected));
                    seatnumber.add(buttonview.getText());
                }else{
                    buttonview.setBackground(getResources().getDrawable(R.drawable.ic_seat));
                    seatnumber.remove(buttonview.getText());
                }
            }
        });
        seat4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onCheckedChanged(CompoundButton buttonview, boolean ischecked) {
                if (ischecked){
                    buttonview.setBackground(getResources().getDrawable(R.drawable.ic_seats_selected));
                    seatnumber.add(buttonview.getText());
                }else{
                    buttonview.setBackground(getResources().getDrawable(R.drawable.ic_seat));
                    seatnumber.remove(buttonview.getText());
                }
            }
        });
        seat5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onCheckedChanged(CompoundButton buttonview, boolean ischecked) {
                if (ischecked){
                    buttonview.setBackground(getResources().getDrawable(R.drawable.ic_seats_selected));
                    seatnumber.add(buttonview.getText());
                }else{
                    buttonview.setBackground(getResources().getDrawable(R.drawable.ic_seat));
                    seatnumber.remove(buttonview.getText());
                }
            }
        });
        seat6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onCheckedChanged(CompoundButton buttonview, boolean ischecked) {
                if (ischecked){
                    buttonview.setBackground(getResources().getDrawable(R.drawable.ic_seats_selected));
                    seatnumber.add(buttonview.getText());
                }else{
                    buttonview.setBackground(getResources().getDrawable(R.drawable.ic_seat));
                    seatnumber.remove(buttonview.getText());
                }
            }
        });
        seat7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onCheckedChanged(CompoundButton buttonview, boolean ischecked) {
                if (ischecked){
                    buttonview.setBackground(getResources().getDrawable(R.drawable.ic_seats_selected));
                    seatnumber.add(buttonview.getText());
                }else{
                    buttonview.setBackground(getResources().getDrawable(R.drawable.ic_seat));
                    seatnumber.remove(buttonview.getText());
                }
            }
        });
        seat8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onCheckedChanged(CompoundButton buttonview, boolean ischecked) {
                if (ischecked){
                    buttonview.setBackground(getResources().getDrawable(R.drawable.ic_seats_selected));
                    seatnumber.add(buttonview.getText());
                }else{
                    buttonview.setBackground(getResources().getDrawable(R.drawable.ic_seat));
                    seatnumber.remove(buttonview.getText());
                }
            }
        });
        seat9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onCheckedChanged(CompoundButton buttonview, boolean ischecked) {
                if (ischecked){
                    buttonview.setBackground(getResources().getDrawable(R.drawable.ic_seats_selected));
                    seatnumber.add(buttonview.getText());
                }else{
                    buttonview.setBackground(getResources().getDrawable(R.drawable.ic_seat));
                    seatnumber.remove(buttonview.getText());
                }
            }
        });
        seat10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onCheckedChanged(CompoundButton buttonview, boolean ischecked) {
                if (ischecked){
                    buttonview.setBackground(getResources().getDrawable(R.drawable.ic_seats_selected));
                    seatnumber.add(buttonview.getText());
                }else{
                    buttonview.setBackground(getResources().getDrawable(R.drawable.ic_seat));
                    seatnumber.remove(buttonview.getText());
                }
            }
        });
        seat11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onCheckedChanged(CompoundButton buttonview, boolean ischecked) {
                if (ischecked){
                    buttonview.setBackground(getResources().getDrawable(R.drawable.ic_seats_selected));
                    seatnumber.add(buttonview.getText());
                }else{
                    buttonview.setBackground(getResources().getDrawable(R.drawable.ic_seat));
                    seatnumber.remove(buttonview.getText());
                }
            }
        });
        seat12.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onCheckedChanged(CompoundButton buttonview, boolean ischecked) {
                if (ischecked){
                    buttonview.setBackground(getResources().getDrawable(R.drawable.ic_seats_selected));
                    seatnumber.add(buttonview.getText());
                }else{
                    buttonview.setBackground(getResources().getDrawable(R.drawable.ic_seat));
                    seatnumber.remove(buttonview.getText());
                }
            }
        });
        seat13.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onCheckedChanged(CompoundButton buttonview, boolean ischecked) {
                if (ischecked){
                    buttonview.setBackground(getResources().getDrawable(R.drawable.ic_seats_selected));
                    seatnumber.add(buttonview.getText());
                }else{
                    buttonview.setBackground(getResources().getDrawable(R.drawable.ic_seat));
                    seatnumber.remove(buttonview.getText());
                }
            }
        });
        seat14.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onCheckedChanged(CompoundButton buttonview, boolean ischecked) {
                if (ischecked){
                    buttonview.setBackground(getResources().getDrawable(R.drawable.ic_seats_selected));
                    seatnumber.add(buttonview.getText());
                }else{
                    buttonview.setBackground(getResources().getDrawable(R.drawable.ic_seat));
                    seatnumber.remove(buttonview.getText());
                }
            }
        });
        seat15.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onCheckedChanged(CompoundButton buttonview, boolean ischecked) {
                if (ischecked){
                    buttonview.setBackground(getResources().getDrawable(R.drawable.ic_seats_selected));
                    seatnumber.add(buttonview.getText());
                }else{
                    buttonview.setBackground(getResources().getDrawable(R.drawable.ic_seat));
                    seatnumber.remove(buttonview.getText());
                }
            }
        });
        seat16.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onCheckedChanged(CompoundButton buttonview, boolean ischecked) {
                if (ischecked){
                    buttonview.setBackground(getResources().getDrawable(R.drawable.ic_seats_selected));
                    seatnumber.add(buttonview.getText());
                }else{
                    buttonview.setBackground(getResources().getDrawable(R.drawable.ic_seat));
                    seatnumber.remove(buttonview.getText());
                }
            }
        });
        seat17.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onCheckedChanged(CompoundButton buttonview, boolean ischecked) {
                if (ischecked){
                    buttonview.setBackground(getResources().getDrawable(R.drawable.ic_seats_selected));
                    seatnumber.add(buttonview.getText());
                }else{
                    buttonview.setBackground(getResources().getDrawable(R.drawable.ic_seat));
                    seatnumber.remove(buttonview.getText());
                }
            }
        });
        seat18.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onCheckedChanged(CompoundButton buttonview, boolean ischecked) {
                if (ischecked){
                    buttonview.setBackground(getResources().getDrawable(R.drawable.ic_seats_selected));
                    seatnumber.add(buttonview.getText());
                }else{
                    buttonview.setBackground(getResources().getDrawable(R.drawable.ic_seat));
                    seatnumber.remove(buttonview.getText());
                }
            }
        });
        seat19.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onCheckedChanged(CompoundButton buttonview, boolean ischecked) {
                if (ischecked){
                    buttonview.setBackground(getResources().getDrawable(R.drawable.ic_seats_selected));
                    seatnumber.add(buttonview.getText());
                }else{
                    buttonview.setBackground(getResources().getDrawable(R.drawable.ic_seat));
                    seatnumber.remove(buttonview.getText());
                }
            }
        });
        seat20.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onCheckedChanged(CompoundButton buttonview, boolean ischecked) {
                if (ischecked){
                    buttonview.setBackground(getResources().getDrawable(R.drawable.ic_seats_selected));
                    seatnumber.add(buttonview.getText());
                }else{
                    buttonview.setBackground(getResources().getDrawable(R.drawable.ic_seat));
                    seatnumber.remove(buttonview.getText());
                }
            }
        });
        seat21.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onCheckedChanged(CompoundButton buttonview, boolean ischecked) {
                if (ischecked){
                    buttonview.setBackground(getResources().getDrawable(R.drawable.ic_seats_selected));
                    seatnumber.add(buttonview.getText());
                }else{
                    buttonview.setBackground(getResources().getDrawable(R.drawable.ic_seat));
                    seatnumber.remove(buttonview.getText());
                }
            }
        });
        seat22.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onCheckedChanged(CompoundButton buttonview, boolean ischecked) {
                if (ischecked){
                    buttonview.setBackground(getResources().getDrawable(R.drawable.ic_seats_selected));
                    seatnumber.add(buttonview.getText());
                }else{
                    buttonview.setBackground(getResources().getDrawable(R.drawable.ic_seat));
                    seatnumber.remove(buttonview.getText());
                }
            }
        });
        seat23.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onCheckedChanged(CompoundButton buttonview, boolean ischecked) {
                if (ischecked){
                    buttonview.setBackground(getResources().getDrawable(R.drawable.ic_seats_selected));
                    seatnumber.add(buttonview.getText());
                }else{
                    buttonview.setBackground(getResources().getDrawable(R.drawable.ic_seat));
                    seatnumber.remove(buttonview.getText());
                }
            }
        });
        seat24.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onCheckedChanged(CompoundButton buttonview, boolean ischecked) {
                if (ischecked){
                    buttonview.setBackground(getResources().getDrawable(R.drawable.ic_seats_selected));
                    seatnumber.add(buttonview.getText());
                }else{
                    buttonview.setBackground(getResources().getDrawable(R.drawable.ic_seat));
                    seatnumber.remove(buttonview.getText());
                }
            }
        });
        seat25.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onCheckedChanged(CompoundButton buttonview, boolean ischecked) {
                if (ischecked){
                    buttonview.setBackground(getResources().getDrawable(R.drawable.ic_seats_selected));
                    seatnumber.add(buttonview.getText());
                }else{
                    buttonview.setBackground(getResources().getDrawable(R.drawable.ic_seat));
                    seatnumber.remove(buttonview.getText());
                }
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SeatBookingActivity.this,"Done",Toast.LENGTH_SHORT).show();
            }
        });

    }
}