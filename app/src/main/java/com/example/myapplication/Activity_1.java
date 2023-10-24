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

public class Activity_1 extends AppCompatActivity {

    protected String UserName,Password;
    public int id=0;//add values as o
   public String [] FirstNameWithInt={"Dhananjaya T.K","Udathenna HGU"};
   public String [] FullName={"Kasun Dhanajaya","Hasthika Udathenna"};
   private String[] UName={"IM/2020/045","IM/2020/054"};
   private String[] PASSWORD={"123","456"};
   public String[] JavaProgramming={"A-","A"};
   public String[] Accounting={"A-","A"};
   public String[] optimization={"A","A"};
    public String[] ComputerNetworks={"A+","A"};
    public String[] Technology={"A","A"};
    public String[] Math={"A","A"};
    public String[] programming={"A","A"};
    public String[] BasicOfcomputing={"A","A"};
    public String[] Stat={"A","A"};
    public String[] Database={"A-","A"};


    public String[] AcadamicYear={"2020/2021","2020/2021"};
    public String[] Email={"Kasun.dananjaya\n297@gmail.com","Ussthika.Hadathenna\n@gmail.com"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);
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
                        intent.putExtra("ID1",id);
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
    public String getDataBaseRlt(int ID){
        return (Database[ID]);
    }
    public String getJavaRlt(int ID){
        return (JavaProgramming[ID]);
    }
    public String getAccountingRlt(int ID){
        return (Accounting[ID]);
    }
    public String getOptimization(int ID){
        return (optimization[ID]);
    }
    public String getComputerNetworksRlt(int ID){
        return (ComputerNetworks[ID]);
    }
    public String getIndustryRlt(int ID){
        return (Technology[ID]);
    }
    public String getMathRlt(int ID){
        return (Math[ID]);
    }
    public String getStatRlt(int ID){
        return (Stat[ID]);
    }
    public String getProgrammingRlt(int ID){
        return (programming[ID]);
    }
    public String getFundamentalOfRlt(int ID){

        return (BasicOfcomputing[ID]);
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

    public void setDatabase(int id,String Value) {
        Database[id]=Value;
    }
    public void setJavaProgramming(int id, String Value){
        JavaProgramming[id]=Value;
    }
    public void setAccounting(int id , String Value){
        Accounting[id]=Value;
    }
}

