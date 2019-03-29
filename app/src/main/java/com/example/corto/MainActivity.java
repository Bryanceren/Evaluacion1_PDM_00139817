package com.example.corto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.utilities.keys;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btnsend;
    EditText usuario;
    EditText mail;
    Integer cont1=0;
    Integer cont2=0;
    Integer cont3=0;
    Integer cont4=0;
    Integer cont5=0;
    Integer cont6=0;
    Integer cont7=0;
    Integer cont8=0;
    Integer cont9=0;
    Integer total=0;
    private View.OnClickListener clickListener = new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            int viewId = v.getId();

            switch (viewId) {
                case R.id.number1:
                    cont1=cont1+1;
                    btn1.setText("Producto 1: \n"+cont1);
                    break;
                case R.id.number2:
                    cont2=cont2+1;
                    btn2.setText("Producto 2: \n"+cont2);
                    break;
                case R.id.number3:
                    cont3=cont3+1;
                    btn3.setText("Producto 3: \n"+cont3);
                    break;
                case R.id.number4:
                    cont4=cont4+1;
                    btn4.setText("Producto 4: \n"+cont4);
                    break;
                case R.id.number5:
                    cont5=cont5+1;
                    btn5.setText("Producto 5: \n"+cont5);
                    break;
                case R.id.number6:
                    cont6=cont6+1;
                    btn6.setText("Producto 6: \n"+cont6);
                    break;
                case R.id.number7:
                    cont7=cont7+1;
                    btn7.setText("Producto 7: \n"+cont7);
                    break;
                case R.id.number8:
                    cont8=cont8+1;
                    btn8.setText("Producto 8: \n"+cont8);
                    break;
                case R.id.number9:
                    cont9=cont9+1;
                    btn9.setText("Producto 9: \n"+cont9);
                    break;

            }

        }
    };
    private View.OnClickListener clickListener2=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            total = cont1 + cont2 + cont3 + cont4 + cont5 + cont6 + cont7 + cont8 + cont9;
            Intent intento = new Intent(MainActivity.this, NewActivity.class);
            intento.putExtra(keys.txt1_key, usuario.getText().toString());
            intento.putExtra(keys.txt2_key, mail.getText().toString());
            intento.putExtra(keys.txt3_key, total.toString());

            intento.putExtra(keys.cont1_key, cont1.toString());
            intento.putExtra(keys.cont2_key, cont2.toString());
            intento.putExtra(keys.cont3_key, cont3.toString());
            intento.putExtra(keys.cont4_key, cont4.toString());
            intento.putExtra(keys.cont5_key, cont5.toString());
            intento.putExtra(keys.cont6_key, cont6.toString());
            intento.putExtra(keys.cont7_key, cont7.toString());
            intento.putExtra(keys.cont8_key, cont8.toString());
            intento.putExtra(keys.cont9_key, cont9.toString());


            startActivity(intento);
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LoadContent();
    }
    void LoadContent(){
        btn1=findViewById(R.id.number1);
        btn2=findViewById(R.id.number2);
        btn3=findViewById(R.id.number3);
        btn4=findViewById(R.id.number4);
        btn5=findViewById(R.id.number5);
        btn6=findViewById(R.id.number6);
        btn7=findViewById(R.id.number7);
        btn8=findViewById(R.id.number8);
        btn9=findViewById(R.id.number9);
        btnsend=findViewById(R.id.submit);
        usuario=findViewById(R.id.usuario);
        mail=findViewById(R.id.correo);
        btn1.setOnClickListener(clickListener);
        btn2.setOnClickListener(clickListener);
        btn3.setOnClickListener(clickListener);
        btn4.setOnClickListener(clickListener);
        btn5.setOnClickListener(clickListener);
        btn6.setOnClickListener(clickListener);
        btn7.setOnClickListener(clickListener);
        btn8.setOnClickListener(clickListener);
        btn9.setOnClickListener(clickListener);
        btnsend.setOnClickListener(clickListener2);

    }
}
