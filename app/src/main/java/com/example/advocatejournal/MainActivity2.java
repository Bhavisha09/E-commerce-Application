package com.example.advocatejournal;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    private Spinner spinner_1,spinner_2,spinner_3,spinner_4;
    EditText et_fileno,et_clientname,et_oppname,et_area,et_date,et_judge,et_charge;
    Button btn_submit;

    /*private String[] casetype = {"CRM-RIVI", "SP.EXI", "RE.EXI","Nego","SE.C","ATRO","CRMA","SPL.GEB","OTHER"};
    private String[] clientstatus = {"Applicant", "Opponent"};
    private String[] court = {"Session Court", "District Court","High Court","Supreme Court"};
    private String[] stage= {"Session Court", "District Court","High Court","Supreme Court"};*/



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

       Spinner spinner_1 = findViewById(R.id.spinner_1);
       Spinner spinner_2 = findViewById(R.id.spinner_2);
       Spinner spinner_3 = findViewById(R.id.spinner_3);
       Spinner spinner_4 = findViewById(R.id.spinner_4);
       ScrollView scrollView = findViewById(R.id.scrollView);
       EditText et_fileno = findViewById(R.id.et_fileno);
       EditText et_clientname = findViewById(R.id.et_clientname);
       EditText et_oppname = findViewById(R.id.et_oppname);
       EditText et_area = findViewById(R.id.et_area);
       EditText et_date = findViewById(R.id.et_date);
       EditText et_judge = findViewById(R.id.et_judge);
       EditText et_charge = findViewById(R.id.et_charge);




        //Spinner dropdown = findViewById(R.id.spinner_1);
        //String[] items = new String[]{"CRM-RIVI", "SP.EXI", "RE.EXI","Nego","SE.C","ATRO","CRMA","SPL.GEB","OTHER"};
       /*ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this, R.layout.activity_main2, casetype);
        adapter1.setDropDownViewResource(R.layout.activity_main2);
        spinner_1.setAdapter(adapter1);
        spinner_1.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);

        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this,R.layout.activity_main2, clientstatus);
        adapter2.setDropDownViewResource(R.layout.activity_main2);
        spinner_2.setAdapter(adapter2);
        spinner_2.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);

        ArrayAdapter<String> adapter3 = new ArrayAdapter<>(this,R.layout.activity_main2, court);
        adapter3.setDropDownViewResource(R.layout.activity_main2);
        spinner_3.setAdapter(adapter3);
        spinner_3.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);

        ArrayAdapter<String> adapter4 = new ArrayAdapter<>(this,R.layout.activity_main2, stage);
        adapter4.setDropDownViewResource(R.layout.activity_main2);
        spinner_4.setAdapter(adapter4);
        spinner_4.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);*/



    }

}





