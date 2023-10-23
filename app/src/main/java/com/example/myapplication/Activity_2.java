package com.example.myapplication;

import static java.lang.Integer.parseInt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.std_home);
        Activity_1 Login = new Activity_1();
        int id = getIntent().getIntExtra("ID",0);

        TextView namewithInt= (TextView) findViewById(R.id.NameWithIniTxt);
        namewithInt.setText(Login.getFnameWithInt(id));

        TextView Fullname= (TextView) findViewById(R.id.FullNameTxt);
        Fullname.setText(Login.getFullName(id));

        TextView Std_ID= (TextView) findViewById(R.id.SIDTxt);
        Std_ID.setText(Login.getUname(id));

        TextView email=(TextView) findViewById(R.id.EmailTxt);
        email.setText(Login.getEmail(id));

        TextView AcdmeicYaer= (TextView) findViewById(R.id.AcademicYearTxt);
        AcdmeicYaer.setText(Login.getAcademicYear(id));
        year01Btn(id);
    }
    public void year01Btn(int id){
        Button btn= (Button) findViewById(R.id.regYear1btn);
        btn.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){
            Intent intent = new Intent(Activity_2.this, Student_result.class);
            intent.putExtra("ID1",id);
            startActivity(intent);
        }
        }
        );
    }

}