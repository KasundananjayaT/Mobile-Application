package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class Activity_1 extends AppCompatActivity {

    protected String UserName,Password;
    public int id=-1;
   public String [] FirstNameWithInt={"Dhananjaya T.K","Udathenna HGU"};
   public String [] FullName={"Kasun Dhanajaya","Hasthika Udathenna"};
   private String[] UName={"IM/2020/045","IM/2020/054"};
   private String[] PASSWORD={"123","456"};
   public String[] Subject1={"A","A"};
   public String[] Subject2={"A-","A"};
   public String[] Subject3={"A","A"};
    public String[] Subject4={"A+","A"};
    public String[] Subject5={"A","A"};
    public String[] Subject6={"A","A"};
    public String[] Subject7={"A","A"};
    public String[] AcadamicYear={"2020/2021","2020/2021"};
    public String[] Email={"Kasun.dananjaya\n297@gmail.com","Ussthika.Hadathenna\n@gmail.com"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);

        setContentView(R.layout.add_result);

        // Call the custom method to set up the Spinner
        setupGradeSpinner();
        ValidPassword();
    }

    public void setPassword(){
        TextView password = (TextView) findViewById(R.id.PasswordTxt);
        this.Password=password.getText().toString();

    }
    public String getUserName(){
        return UserName;
    }
    public String getPassword(){
        return Password;
    }
    public void setUserName(){
        TextView UName=(TextView) findViewById(R.id.UserNameTxt);
        this.UserName=UName.getText().toString();
    }
    public String setRadio(){
        RadioGroup Rgroup= (RadioGroup) findViewById(R.id.RadioGrp);
        int SelectedID=Rgroup.getCheckedRadioButtonId();
        RadioButton Rbtn=findViewById(SelectedID);
        if(Rbtn!=null){
            return (Rbtn.getText().toString());
        }
        else{
            return null;
        }
    }
    public String CheckRadio(){

        if(setRadio().equals("Student")){
            return "Student";
        }
        else if(setRadio().equals("Staff")){
            return "Staff";
        }
        else{
            return null;
        }
    }
    public void ValidPassword(){
        Button btn= (Button) findViewById(R.id.LoginBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setUserName();
                setPassword();
                getPasswordId();
                if(getUserName().equals(UName[id])  && getPassword().equals(PASSWORD[id]))
                {
                    if(CheckRadio().equals("Student")){
                        Intent intent= new Intent(Activity_1.this, Activity_2.class);
                        intent.putExtra("ID",id);
                        startActivity(intent);
                    }
                    if(CheckRadio().equals("Staff")){
                        Toast.makeText(Activity_1.this,"Error!!!!!!!",Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(Activity_1.this,"Error!!!",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    public void getPasswordId(){
        for(int i=0;i<UName.length;++i){
            if(UName[i].equals(getUserName())){
                id=i;
                break;
            }
    }
    }

    public String getFnameWithInt(int ID){
        return (FirstNameWithInt[ID]);
    }
    public String getFullName(int ID){
        return (FullName[ID]);
    }
    public String getSub1(int ID){
        return (Subject1[ID]);
    }
    public String getSub2(int ID){
        return (Subject2[ID]);
    }
    public String getSub3(int ID){
        return (Subject3[ID]);
    }
    public String getSub4(int ID){
        return (Subject4[ID]);
    }
    public String getSub5(int ID){
        return (Subject5[ID]);
    }
    public String getSub6(int ID){
        return (Subject6[ID]);
    }
    public String getSub7(int ID){
        return (Subject7[ID]);
    }
    public String getUname(int ID){
        return (UName[ID]);
    }
    public String getEmail(int ID){
        return (Email[ID]);
    }
    public String  getAcademicYear(int ID){
        return (AcadamicYear[ID]);
    }


    //IM/2020/054
    private void setupGradeSpinner() {
        // Initialize the Spinner
        Spinner gradeSpinner = findViewById(R.id.grade);

        // Create an array of grade options (A, B, C)
        String[] gradeOptions = {"A+","A","A-","B+","B","B-","C+","C","C-","D","E","AB"};

        // Create an ArrayAdapter to populate the Spinner with the grade options
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, gradeOptions);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Set the adapter to the Spinner
        gradeSpinner.setAdapter(adapter);
    }
}
