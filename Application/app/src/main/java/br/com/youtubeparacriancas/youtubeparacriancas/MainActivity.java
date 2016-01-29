package br.com.youtubeparacriancas.youtubeparacriancas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static Button button_activity2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OnClickButton();
    }

    public void  OnClickButton() {
        button_activity2 = (Button)findViewById(R.id.button2);
        button_activity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent("br.com.youtubeparacriancas.youtubeparacriancas.CartoonsView");
                startActivity(intent);
            }
        });
    }
}
