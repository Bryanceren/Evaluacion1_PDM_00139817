package com.example.corto;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.corto.R;
import com.example.utilities.keys;

import org.json.JSONException;
import org.json.JSONObject;

public class NewActivity extends AppCompatActivity {
    TextView usuario;
    TextView mail;
    TextView total;
    String txt1;
    String txt2;
    String txt3;
    String cont1;
    String cont2;
    String cont3;
    String cont4;
    String cont5;
    String cont6;
    String cont7;
    String cont8;
    String cont9;
    Button share;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        usuario=findViewById(R.id.usuarioresult);
        mail=findViewById(R.id.correoresult);
        total=findViewById(R.id.total);
        share=findViewById(R.id.share);
        btn1=findViewById(R.id.number1);
        btn2=findViewById(R.id.number2);
        btn3=findViewById(R.id.number3);
        btn4=findViewById(R.id.number4);
        btn5=findViewById(R.id.number5);
        btn6=findViewById(R.id.number6);
        btn7=findViewById(R.id.number7);
        btn8=findViewById(R.id.number8);
        btn9=findViewById(R.id.number9);
        final JSONObject jsonx=new JSONObject();
        Intent intentonuevo = getIntent();
        txt1=txt2=txt3=cont1=cont2=cont3=cont4=cont5=cont6=cont7=cont8=cont9="Texto equis";
        if(intentonuevo!=null){
            txt1=intentonuevo.getStringExtra(keys.txt1_key);
            txt2=intentonuevo.getStringExtra(keys.txt2_key);
            txt3=intentonuevo.getStringExtra(keys.txt3_key);

            cont1=intentonuevo.getStringExtra(keys.cont1_key);
            cont2=intentonuevo.getStringExtra(keys.cont2_key);
            cont3=intentonuevo.getStringExtra(keys.cont3_key);
            cont4=intentonuevo.getStringExtra(keys.cont4_key);
            cont5=intentonuevo.getStringExtra(keys.cont5_key);
            cont6=intentonuevo.getStringExtra(keys.cont6_key);
            cont7=intentonuevo.getStringExtra(keys.cont7_key);
            cont8=intentonuevo.getStringExtra(keys.cont8_key);
            cont9=intentonuevo.getStringExtra(keys.cont9_key);
        }

        usuario.setText("usuario: "+ txt1);
        mail.setText("mail: "+ txt2);
        total.setText("total: "+ txt3);

        btn1.setText("Cantidad: "+ cont1);
        btn2.setText("Cantidad: "+ cont2);
        btn3.setText("Cantidad: "+ cont3);
        btn4.setText("Cantidad: "+ cont4);
        btn5.setText("Cantidad: "+ cont5);
        btn6.setText("Cantidad: "+ cont6);
        btn7.setText("Cantidad: "+ cont7);
        btn8.setText("Cantidad: "+ cont8);
        btn9.setText("Cantidad: "+ cont9);
        try {
            jsonx.put("user",txt1);
            jsonx.put("pass",txt2);
            jsonx.put("mail",txt3);
            jsonx.put("cantidad1",cont1);
            jsonx.put("cantidad2",cont2);
            jsonx.put("cantidad3",cont3);
            jsonx.put("cantidad4",cont4);
            jsonx.put("cantidad5",cont5);
            jsonx.put("cantidad6",cont6);
            jsonx.put("cantidad7",cont7);
            jsonx.put("cantidad8",cont8);
            jsonx.put("cantidad9",cont9);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentonuevo2=new Intent();
                intentonuevo2.setAction(Intent.ACTION_SEND);
                intentonuevo2.setType("text/plain");
                intentonuevo2.putExtra(Intent.EXTRA_TEXT,jsonx.toString());
                startActivity(intentonuevo2);
            }
        });
    }
}
