package vn.edu.ntu.nguyenngoctien.nguyenngoctien_59132611_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.CompoundButton;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    EditText edt1, edt2, edt3;
    RadioGroup rdg;
    RadioButton rbnam, rbnu;
    CheckBox cb1, cb2, cb3, cb4, cb5;
    Button btn;
    private String LOGTAG = "AndroidRadioDemo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addViews();
        addEvents();
    }

    private void addViews(){
        edt1=findViewById(R.id.edt1);
        edt2=findViewById(R.id.edt2);
        edt3=findViewById(R.id.edt3);
        rdg=findViewById(R.id.rdg);
        rbnam=findViewById(R.id.rbnam);
        rbnu=findViewById(R.id.rbnu);
        cb1=findViewById(R.id.cb1);
        cb2=findViewById(R.id.cb2);
        cb3=findViewById(R.id.cb3);
        cb4=findViewById(R.id.cb4);
        cb5=findViewById(R.id.cb5);
        btn=findViewById(R.id.btn);
    }
    private void addEvents(){
        rbnu.setOnCheckedChangeListener(new RadioButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                doOnCharacterChanged(buttonView,isChecked);
            }
        });

        // When radio button "Male" checked change.
        rbnam.setOnCheckedChangeListener(new RadioButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                doOnCharacterChanged(buttonView,isChecked);
            }
        });
        btn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                doXacNhan();
            }
        });
    }
    private void doOnCharacterChanged(CompoundButton buttonView, boolean isChecked)  {
        RadioButton radio =(RadioButton) buttonView;

        Log.i(LOGTAG, "RadioButton "+ radio.getText()+" : "+ isChecked);
    }

    private void doXacNhan()  {
        float ten = Float.parseFloat(edt1.getText().toString());
        float ngaysinh = Float.parseFloat(edt2.getText().toString());
        int GioiTinh = rdg.getCheckedRadioButtonId();
        RadioButton rdg = findViewById(GioiTinh);
        String message = "Gioi Tinh: " + rdg.getText() ;
        Toast.makeText(getApplication(), "Tên: " + ten + "\n" +
                "Ngày sinh: " + ngaysinh + "\n" +
                message, Toast.LENGTH_LONG).show();
    }
}
