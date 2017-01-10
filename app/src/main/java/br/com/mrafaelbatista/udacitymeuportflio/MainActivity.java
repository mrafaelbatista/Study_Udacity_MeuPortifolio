package br.com.mrafaelbatista.udacitymeuportflio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String str, nameButton;
    private String txt_apps = "Este é um botão para lançar o app ";
    private Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void clickProjects(View v) {

        switch (v.getId()) {

            case R.id.bt_filmesPopulares:
                bt = (Button) findViewById(R.id.bt_filmesPopulares);
                nameButton = bt.getText().toString();
                break;

            case R.id.bt_stockHawk:
                bt = (Button) findViewById(R.id.bt_stockHawk);
                nameButton = bt.getText().toString();
                break;

            case R.id.bt_facaMaior:
                bt = (Button) findViewById(R.id.bt_facaMaior);
                nameButton = bt.getText().toString();
                break;

            case R.id.bt_appMaterial:
                bt = (Button) findViewById(R.id.bt_appMaterial);
                nameButton = bt.getText().toString();
                break;

            case R.id.bt_sejaOnipresente:
                bt = (Button) findViewById(R.id.bt_sejaOnipresente);
                nameButton = bt.getText().toString();
                break;

            case R.id.bt_capstone:
                bt = (Button) findViewById(R.id.bt_capstone);
                nameButton = bt.getText().toString();
                break;
        }

        str = txt_apps + nameButton;
        Toast t = Toast.makeText(this, str, Toast.LENGTH_LONG);
        t.show();
    }

}
