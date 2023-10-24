package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Student_result extends AppCompatActivity {
    char [] subject_credit = {'3','3','3','2','2','2','2','3','3','3','2'};
    int Totatal_creadit=0;
    double[] result_credit = {4.0,3.7,3.3,3.0,2.7,2.3,2.0,1.7,1.3,1.0,0};

    Activity_1 act1 = new Activity_1();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_result);
        int id = getIntent().getIntExtra("ID1",0);
        setRslt(id);
    }
    void calculateGPA(){
        double CGPA;

    }
    void setRslt(int id){
        TextView DatabaseReslut= (TextView) findViewById(R.id.DatabaseTxt);
        DatabaseReslut.setText(act1.getDataBaseRlt(id));

        TextView Javaprogramming= (TextView) findViewById(R.id.DatabaseTxt);
        Javaprogramming.setText(act1.getJavaRlt(id));

        TextView Accounting= (TextView) findViewById(R.id.DatabaseTxt);
        Accounting.setText(act1.getAccountingRlt(id));

        TextView optimization= (TextView) findViewById(R.id.DatabaseTxt);
        optimization.setText(act1.getOptimization(id));
// fill this

    }
}