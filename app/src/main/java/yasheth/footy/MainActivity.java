package yasheth.footy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Spinner element
        Spinner spinner = (Spinner) findViewById(R.id.spinner1);

        // Spinner click listener
        spinner.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<String>
                categories = new ArrayList <String>();
        categories.add("Manchester United");
        categories.add("Arsenal");
        categories.add("Real Madrid");
        categories.add("Barceloona");
        categories.add("Bayern Munich");
        categories.add("Chelsea");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter <String>(this, android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);
    }
public void onClick(View v){
    if(v.getId()==R.id.quiz){
        startActivity(new Intent(getApplicationContext(), Quiz.class));
    }
}
    @Override
    public void onItemSelected(AdapterView parent, View view, int position, long id) {
        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();

        TextView name =(TextView)findViewById(R.id.resulttext);
        name.setText(item);
        TextView name1 =(TextView)findViewById(R.id.teamtext1);
        TextView name2 =(TextView)findViewById(R.id.teamtext2);
        TextView name3 =(TextView)findViewById(R.id.teamtext3);
        TextView name4 =(TextView)findViewById(R.id.teamtext4);
        ImageView flag = (ImageView) findViewById(R.id.resultflag);
        ImageView flag1 = (ImageView) findViewById(R.id.resultlineup);
        if (flag != null) {

            if (position == 0){
                name1.setText(R.string.t11);
                name2.setText(R.string.t12);
                name3.setText(R.string.t13);
                name4.setText(R.string.t14);
                flag.setBackgroundResource(R.drawable.t1);
                flag1.setBackgroundResource(R.drawable.l1);}
            else if (position == 1){
                name1.setText(R.string.t21);
                name2.setText(R.string.t22);
                name3.setText(R.string.t23);
                name4.setText(R.string.t24);
                flag.setBackgroundResource(R.drawable.t2);
            flag1.setBackgroundResource(R.drawable.l2);}
            else if (position == 2){
                name1.setText(R.string.t31);
                name2.setText(R.string.t32);
                name3.setText(R.string.t33);
                name4.setText(R.string.t34);
                flag.setBackgroundResource(R.drawable.t3);
            flag1.setBackgroundResource(R.drawable.l3);}
            else if (position == 3){
                name1.setText(R.string.t41);
                name2.setText(R.string.t42);
                name3.setText(R.string.t43);
                name4.setText(R.string.t44);

                flag.setBackgroundResource(R.drawable.t4);
            flag1.setBackgroundResource(R.drawable.l4);}
            else if (position == 4){
                name1.setText(R.string.t51);
                name2.setText(R.string.t52);
                name3.setText(R.string.t53);
                name4.setText(R.string.t54);

                flag.setBackgroundResource(R.drawable.t5);
            flag1.setBackgroundResource(R.drawable.l5);}
            else if (position == 5){
                name1.setText(R.string.t61);
                name2.setText(R.string.t62);
                name3.setText(R.string.t63);
                name4.setText(R.string.t64);
                flag.setBackgroundResource(R.drawable.t6);
            flag1.setBackgroundResource(R.drawable.l6);}
        }
    }
    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
