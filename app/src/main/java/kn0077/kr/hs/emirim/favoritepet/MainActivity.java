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
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener, View.OnClickListener {

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
        butok.setOnClickListener(this);

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

    @Override
    public void onClick(View v) {
        switch (rg.getCheckedRadioButtonId())//라디오 그룹 안에 있는 라디오 버튼 중에서 체크된 라디오 버튼의 아이디를 반환해줌
        {
            case R.id.radio_dog : imgvPet.setImageResource(R.drawable.dog); break;
            case R.id.radio_cat : imgvPet.setImageResource(R.drawable.cat); break;
            case R.id.radio_rabbit : imgvPet.setImageResource(R.drawable.rabbit); break;
            default:
                Toast.makeText(this, "라디오 버튼이 선택이 안되었군요.",Toast.LENGTH_SHORT).show(); //show()가 없으면 토스트가 안보임
        }
    }
}
