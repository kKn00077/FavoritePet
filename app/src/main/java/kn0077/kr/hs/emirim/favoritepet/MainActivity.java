package kn0077.kr.hs.emirim.favoritepet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    CheckBox checkSelect; /*레이아웃 위젯을 자바(필드)로 불러오기 위해 참조변수 먼저 선언. 아직 값은 NULL값임*/
    TextView textQuest;
    RadioGroup rg;
    RadioButton radioDog,radioCat,radioRabbit;
    Button butok;
    ImageView imgvPet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkSelect=(CheckBox)findViewById(R.id.check_select);
        textQuest=(TextView)findViewById(R.id.text_quest);
        rg=(RadioGroup) findViewById(R.id.rg);
        radioDog=(RadioButton) findViewById(R.id.radio_dog);
        radioCat=(RadioButton) findViewById(R.id.radio_cat);
        radioRabbit=(RadioButton) findViewById(R.id.radio_rabbit);
        butok=(Button) findViewById(R.id.but_ok);
        imgvPet=(ImageView) findViewById(R.id.imgv_pet);


        checkSelect.setOnCheckedChangeListener(this);




    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if(checkSelect.isChecked()) {
            textQuest.setVisibility(View.VISIBLE);
            rg.setVisibility(View.VISIBLE);
            butok.setVisibility(View.VISIBLE);
            imgvPet.setVisibility(View.VISIBLE);
        }
        else{
            textQuest.setVisibility(View.INVISIBLE);
            rg.setVisibility(View.INVISIBLE);
            butok.setVisibility(View.INVISIBLE);
            imgvPet.setVisibility(View.INVISIBLE);
        }
    }
}
