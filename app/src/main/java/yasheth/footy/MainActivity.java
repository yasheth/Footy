package yasheth.footy;

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
        categories.add("Select a Team");
        categories.add("Manchester United");
        categories.add("Arsenal");
        categories.add("Real Madrid");
        categories.add("Barceloona");
        categories.add("Chelsea");
        categories.add("Bayern Munich");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter <String>(this, android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);
    }

    @Override
    public void onItemSelected(AdapterView parent, View view, int position, long id) {
        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();

        TextView name =(TextView)findViewById(R.id.resulttext);
        name.setText(item);
        ImageView flag = (ImageView) findViewById(R.id.resultflag);
        ImageView flag1 = (ImageView) findViewById(R.id.resultlineup);
        if (flag != null) {

            if (position == 1){
                flag.setBackgroundResource(R.drawable.t1);
                flag1.setBackgroundResource(R.drawable.l1);}
            else if (position == 2){
                flag.setBackgroundResource(R.drawable.t2);
            flag1.setBackgroundResource(R.drawable.l2);}
            else if (position == 3){
                flag.setBackgroundResource(R.drawable.t3);
            flag1.setBackgroundResource(R.drawable.l3);}
            else if (position == 4){
                flag.setBackgroundResource(R.drawable.t4);
            flag1.setBackgroundResource(R.drawable.l4);}
            else if (position == 5){
                flag.setBackgroundResource(R.drawable.t6);
            flag1.setBackgroundResource(R.drawable.l6);}
            else if (position == 6){
                flag.setBackgroundResource(R.drawable.t5);
            flag1.setBackgroundResource(R.drawable.l5);}
        }
    }
    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
