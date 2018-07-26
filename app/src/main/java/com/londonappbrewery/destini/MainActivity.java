package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView story;
    private Button b1;
    private Button b2;
    private int mstoryindex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        story=(TextView)findViewById(R.id.storyTextView);
        b1=(Button)findViewById(R.id.buttonTop);
        b2=(Button)findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mstoryindex==0 || mstoryindex==2) {
                    story.setText(R.string.T3_Story);
                    b1.setText(R.string.T3_Ans1);
                    b2.setText(R.string.T3_Ans2);
                    mstoryindex++;
                } else{
                    story.setText(R.string.T6_End);
                    b1.setVisibility(View.GONE);
                    b2.setText("Close Application");
                    b2.setWidth(1000);
                    mstoryindex+=4;
                }
            }
        });
        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mstoryindex==0){
                    story.setText(R.string.T2_Story);
                    b1.setText(R.string.T2_Ans1);
                    b2.setText(R.string.T2_Ans2);
                    mstoryindex+=2;
                }else if (mstoryindex==2){
                    story.setText(R.string.T4_End);
                    b1.setVisibility(View.GONE);
                    b2.setText("Close Application");
                    b2.setWidth(1000);
                    mstoryindex+=4;
                }
                else if(mstoryindex==1||mstoryindex==3){
                    story.setText(R.string.T5_End);
                    b1.setVisibility(View.GONE);
                    b2.setText("Close Application");
                    b2.setWidth(1000);
                    mstoryindex+=4;
                }

                else{
                    finish();
                }
            }
        });


    }
}
