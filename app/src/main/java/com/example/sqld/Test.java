package com.example.sqld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Test extends AppCompatActivity {

    TextView result, pass, text1, text2, text3;
    Button btn1, btn2, btn3, rbtn;
    RadioGroup rg1, rg2, rg3;
    RadioButton rb11, rb22, rb33;

    Integer total;

    int[] user1 = new int[3];
    int[] ans1 = {1, 2, 2};

    String[] yn = new String[3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        rbtn = (Button) findViewById(R.id.rbtn);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);

        //pass = (TextView) findViewById(R.id.pass);
        result = (TextView) findViewById(R.id.result);
        text1 = (TextView) findViewById(R.id.text1);
        text2 = (TextView) findViewById(R.id.text2);
        text3 = (TextView) findViewById(R.id.text3);

        rg1 = (RadioGroup) findViewById(R.id.rg1);
        rg2 = (RadioGroup) findViewById(R.id.rg2);
        rg3 = (RadioGroup) findViewById(R.id.rg3);

        total = 0;

        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb11 = (RadioButton) group.findViewById(checkedId);
                if (null == rb11) {
                    Toast.makeText(getApplicationContext(), "답을 선택하세요.", Toast.LENGTH_SHORT).show();
                } else {
                    user1[0] = Integer.parseInt(rb11.getText().toString());
                    if (user1[0] == ans1[0]) {
                        total = total + 2;
                        yn[0] = "Y";
                    } else {
                        yn[0] = "N";
                    }
                }
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (user1[0] == ans1[0]) {
                    text1.setText(Html.fromHtml("결과 : 정답" + "<br />" + "해설 : "));
                } else {
                    text1.setText(Html.fromHtml("결과 : 오답 ( 답 : " + ans1[0] + " )" + "<br />" + "해설 : "));
                }

            }
        });


        //2번문제
        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb22 = (RadioButton) group.findViewById(checkedId);
                if (null == rb22) {
                    Toast.makeText(getApplicationContext(), "답을 선택하세요.", Toast.LENGTH_SHORT).show();
                } else {
                    user1[1] = Integer.parseInt(rb22.getText().toString());
                    if (user1[1] == ans1[1]) {
                        total = total + 2;
                        yn[1] = "Y";
                    } else {
                        yn[1] = "N";
                    }
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (user1[1] == ans1[1]) {
                    text2.setText(Html.fromHtml("결과 : 정답" + "<br />" + "해설 : "));
                } else {
                    text2.setText(Html.fromHtml("결과 : 오답 ( 답 : " + ans1[1] + " )" + "<br />" + "해설 : "));
                }

            }
        });


        //3번문제
        rg3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb33 = (RadioButton) group.findViewById(checkedId);
                if (null == rb33) {
                    Toast.makeText(getApplicationContext(), "답을 선택하세요.", Toast.LENGTH_SHORT).show();
                } else {
                    user1[2] = Integer.parseInt(rb33.getText().toString());
                    if (user1[2] == ans1[2]) {
                        total = total + 2;
                        yn[2] = "Y";
                    } else {
                        yn[2] = "N";
                    }
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (user1[2] == ans1[2]) {
                    text3.setText(Html.fromHtml("결과 : 정답" + "<br />" + "해설 : "));
                } else {
                    text3.setText(Html.fromHtml("결과 : 오답 ( 답 : " + ans1[2] + " )" + "<br />" + "해설 : "));
                }

            }
        });


        //결과버튼
        rbtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(Test.this, Result.class);
                startActivity(intent);
            }
        });
    }
}
