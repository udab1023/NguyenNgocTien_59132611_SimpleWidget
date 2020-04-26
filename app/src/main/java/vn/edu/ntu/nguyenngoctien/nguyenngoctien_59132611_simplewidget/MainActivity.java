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

public class MainActivity extends AppCompatActivity {
    EditText edt1, edt2, edt3;
    RadioGroup rdg;
    RadioButton rb;
    CheckBox cb1, cb2, cb3, cb4, cb5;
    Button btn;

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
        cb1=findViewById(R.id.cb1);
        cb2=findViewById(R.id.cb2);
        cb3=findViewById(R.id.cb3);
        cb4=findViewById(R.id.cb4);
        cb5=findViewById(R.id.cb5);
        btn=findViewById(R.id.btn);
    }
    private void addEvents(){
        btn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                doXacNhan();
            }
        });
    }

    private void doXacNhan()  {

        String ten = (edt1.getText().toString());
        String ngaysinh = (edt2.getText().toString());
        String sothichphu = (edt3.getText().toString());
        String gioitinh = ("");
        int id = rdg.getCheckedRadioButtonId();
        rb =findViewById(id);
        gioitinh=rb.getText()+"";
        String sothich = ("");
                if(cb1.isChecked())
                    sothich+=cb1.getText().toString()+"; ";
                if(cb2.isChecked())
                    sothich+=cb2.getText().toString()+"; ";
                if(cb3.isChecked())
                    sothich+=cb3.getText().toString()+"; ";
                if(cb4.isChecked())
                    sothich+=cb4.getText().toString()+"; ";
                if(cb5.isChecked())
                    sothich+=cb5.getText().toString()+"; ";

        Toast.makeText(MainActivity.this, ten + "\n" +
                                                        "Ngày sinh: " + ngaysinh + "\n" +
                                                        "Giới tính: " + gioitinh + "\n" +
                                                        "Sở thích: " + sothich + sothichphu, Toast.LENGTH_SHORT).show();
    }
}
