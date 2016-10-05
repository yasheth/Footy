package yasheth.footy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Quiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
    }
    public void onClick(View v){
        if(v.getId()==R.id.quiz){
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
        }
    }
}
