package tamukmobileapp.liquidconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import tamukmobileapp.liquidconverter.R;

public class MainActivity extends AppCompatActivity {

    EditText input, result;
    RadioGroup group1, group2;
    String radioButton1, radioButton2;
    Button btnClick;
    Float value,finalResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = (EditText)findViewById(R.id.input);
        result = (EditText)findViewById(R.id.result);

        group1 = (RadioGroup)findViewById(R.id.group1);
        group2 = (RadioGroup)findViewById(R.id.group2);

        btnClick = (Button)findViewById(R.id.btnClick);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                radioButton1 = ((RadioButton)findViewById(group1.getCheckedRadioButtonId())).getText().toString();
                radioButton2 = ((RadioButton)findViewById(group2.getCheckedRadioButtonId())).getText().toString();

                value = Float.parseFloat(input.getText().toString());

                if(radioButton1.equals("fluidounce") && radioButton2.equals("fluidounce"))
                {
                    result.setText(Float.toString(value* 1f));
                }
                if(radioButton1.equals("fluidounce") && radioButton2.equals("cup"))
                {
                    result.setText(Float.toString(value* 0.125f));
                }
                if(radioButton1.equals("fluidounce") && radioButton2.equals("pint"))
                {
                    result.setText(Float.toString(value* 0.0625f));
                }
                if(radioButton1.equals("fluidounce") && radioButton2.equals("quart"))
                {
                    result.setText(Float.toString(value* 0.03125f));
                }
                if(radioButton1.equals("fluidounce") && radioButton2.equals("Gallon"))
                {
                    result.setText(Float.toString(value* 0.0078125f));
                }
                if(radioButton1.equals("fluidounce") && radioButton2.equals("millilitre"))
                {
                    result.setText(Float.toString(value* 29.5735f));
                }
                if(radioButton1.equals("fluidounce") && radioButton2.equals("litre"))
                {
                    result.setText(Float.toString(value* 0.0295735f));
                }



                if(radioButton1.equals("cup") && radioButton2.equals("fluidounce"))
                {
                    result.setText(Float.toString(value* 8f));
                }
                if(radioButton1.equals("cup") && radioButton2.equals("cup"))
                {
                    result.setText(Float.toString(value* 1f));
                }
                if(radioButton1.equals("cup") && radioButton2.equals("pint"))
                {
                    result.setText(Float.toString(value* 0.5f));
                }
                if(radioButton1.equals("cup") && radioButton2.equals("quart"))
                {
                    result.setText(Float.toString(value* 0.25f));
                }
                if(radioButton1.equals("cup") && radioButton2.equals("Gallon"))
                {
                    result.setText(Float.toString(value* 0.0625f));
                }
                if(radioButton1.equals("cup") && radioButton2.equals("millilitre"))
                {
                    result.setText(Float.toString(value* 236.588f));
                }
                if(radioButton1.equals("cup") && radioButton2.equals("litre"))
                {
                    result.setText(Float.toString(value* 0.236588f));
                }



                if(radioButton1.equals("pint") && radioButton2.equals("fluidounce"))
                {
                    result.setText(Float.toString(value* 16f));
                }
                if(radioButton1.equals("pint") && radioButton2.equals("cup"))
                {
                    result.setText(Float.toString(value* 2f));
                }
                if(radioButton1.equals("pint") && radioButton2.equals("pint"))
                {
                    result.setText(Float.toString(value* 1f));
                }
                if(radioButton1.equals("pint") && radioButton2.equals("quart"))
                {
                    result.setText(Float.toString(value* 0.5f));
                }
                if(radioButton1.equals("pint") && radioButton2.equals("Gallon"))
                {
                    result.setText(Float.toString(value* 0.125f));
                }
                if(radioButton1.equals("pint") && radioButton2.equals("millilitre"))
                {
                    result.setText(Float.toString(value* 473.176f));
                }
                if(radioButton1.equals("pint") && radioButton2.equals("litre"))
                {
                    result.setText(Float.toString(value* 0.473176f));
                }



                if(radioButton1.equals("quart") && radioButton2.equals("fluidounce"))
                {
                    result.setText(Float.toString(value* 32f));
                }
                if(radioButton1.equals("quart") && radioButton2.equals("cup"))
                {
                    result.setText(Float.toString(value* 4f));
                }
                if(radioButton1.equals("quart") && radioButton2.equals("pint"))
                {
                    result.setText(Float.toString(value* 2f));
                }
                if(radioButton1.equals("quart") && radioButton2.equals("quart"))
                {
                    result.setText(Float.toString(value* 1f));
                }
                if(radioButton1.equals("quart") && radioButton2.equals("Gallon"))
                {
                    result.setText(Float.toString(value* 0.25f));
                }
                if(radioButton1.equals("quart") && radioButton2.equals("millilitre"))
                {
                    result.setText(Float.toString(value* 946.353f));
                }
                if(radioButton1.equals("quart") && radioButton2.equals("litre"))
                {
                    result.setText(Float.toString(value* 0.946353f));
                }





                if(radioButton1.equals("Gallon") && radioButton2.equals("fluidounce"))
                {
                    result.setText(Float.toString(value* 128f));
                }
                if(radioButton1.equals("Gallon") && radioButton2.equals("cup"))
                {
                    result.setText(Float.toString(value* 16f));
                }
                if(radioButton1.equals("Gallon") && radioButton2.equals("pint"))
                {
                    result.setText(Float.toString(value* 8f));
                }
                if(radioButton1.equals("Gallon") && radioButton2.equals("quart"))
                {
                    result.setText(Float.toString(value* 4f));
                }
                if(radioButton1.equals("Gallon") && radioButton2.equals("Gallon"))
                {
                    result.setText(Float.toString(value* 1f));
                }
                if(radioButton1.equals("Gallon") && radioButton2.equals("millilitre"))
                {
                    result.setText(Float.toString(value* 3785.41f));
                }
                if(radioButton1.equals("Gallon") && radioButton2.equals("litre"))
                {
                    result.setText(Float.toString(value* 3.78541f));
                }




                if(radioButton1.equals("millilitre") && radioButton2.equals("fluidounce"))
                {
                    result.setText(Float.toString(value* 0.033814f));
                }
                if(radioButton1.equals("millilitre") && radioButton2.equals("cup"))
                {
                    result.setText(Float.toString(value* 0.00422675f));
                }
                if(radioButton1.equals("millilitre") && radioButton2.equals("pint"))
                {
                    result.setText(Float.toString(value* 0.00211338f));
                }
                if(radioButton1.equals("millilitre") && radioButton2.equals("quart"))
                {
                    result.setText(Float.toString(value* 0.00105669f));
                }
                if(radioButton1.equals("millilitre") && radioButton2.equals("Gallon"))
                {
                    result.setText(Float.toString(value* 0.000264172f));
                }
                if(radioButton1.equals("millilitre") && radioButton2.equals("millilitre"))
                {
                    result.setText(Float.toString(value* 1f));
                }
                if(radioButton1.equals("millilitre") && radioButton2.equals("litre"))
                {
                    result.setText(Float.toString(value* 0.001f));
                }


                if(radioButton1.equals("litre") && radioButton2.equals("fluidounce"))
                {
                    result.setText(Float.toString(value* 33.814f));
                }
                if(radioButton1.equals("litre") && radioButton2.equals("cup"))
                {
                    result.setText(Float.toString(value* 4.22675f));
                }
                if(radioButton1.equals("litre") && radioButton2.equals("pint"))
                {
                    result.setText(Float.toString(value* 2.11338f));
                }
                if(radioButton1.equals("litre") && radioButton2.equals("quart"))
                {
                    result.setText(Float.toString(value* 1.05669f));
                }
                if(radioButton1.equals("litre") && radioButton2.equals("Gallon"))
                {
                    result.setText(Float.toString(value* 0.264172f));
                }
                if(radioButton1.equals("litre") && radioButton2.equals("millilitre"))
                {
                    result.setText(Float.toString(value* 1000f));
                }
                if(radioButton1.equals("litre") && radioButton2.equals("litre"))
                {
                    result.setText(Float.toString(value* 1f));
                }
            }
        });



    }
}
