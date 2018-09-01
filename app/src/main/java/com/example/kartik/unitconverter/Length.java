package com.example.kartik.unitconverter;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Length extends android.support.v4.app.Fragment{

    String[] From= new String[]{"Metre","Centimetre","Kilometre","Inch","Yards","Mile","Foot"};
    String[] To=new String[]{"Metre","Centimetre","Kilometre","Inch","Yards","Mile","Foot"};
    Spinner fromlengthspinner,tolengthspinner;
    ArrayAdapter<String> arrayAdapter;
    EditText fromtext;
    TextView resulttext;
    Double num;
    int fromtypepos,totypepos;
    Button calculate,reset;


    public Length() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_length,container,false);


        fromtext=view.findViewById(R.id.fromlengthedittext);
        resulttext=view.findViewById(R.id.tolengthtext);

        calculate=view.findViewById(R.id.lengthcalcbutton);
        reset=view.findViewById(R.id.lengthresetbutton);

        fromlengthspinner=view.findViewById(R.id.fromlengthspinner);
        arrayAdapter=new ArrayAdapter<String>(getContext(),android.R.layout.simple_spinner_dropdown_item,From);
        fromlengthspinner.setAdapter(arrayAdapter);

        tolengthspinner=view.findViewById(R.id.tolengthspinner);
        arrayAdapter=new ArrayAdapter<String >(getContext(),android.R.layout.simple_spinner_dropdown_item,To);
        tolengthspinner.setAdapter(arrayAdapter);



        fromlengthspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> fromparent, View view, int fromposition, long fromid) {

                fromtypepos=fromposition;



            }

            @Override
            public void onNothingSelected(AdapterView<?> fromparent) {

            }
        });

        tolengthspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> toparent, View view, int toposition, long toid) {

                totypepos=toposition;


            }

            @Override
            public void onNothingSelected(AdapterView<?> toparent) {

            }
        });



        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String string=fromtext.getText().toString();

                if(string.isEmpty() || string.equals("."))
                {
                    Toast.makeText(getActivity(),"You have not entered Length",Toast.LENGTH_SHORT).show();
                }

                else

                   //position 0
                if (fromtypepos == 0 && totypepos == 0) {
                    num = Double.parseDouble(fromtext.getText().toString());  //metre to metre
                    resulttext.setText(num.toString());
                } else if (fromtypepos == 0 && totypepos == 1) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 100;       //mtere to cm
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 0 && totypepos == 2) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * .001;    //metre to km
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 0 && totypepos == 3) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 39.3701;   //metre to inch
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 0 && totypepos == 4) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 1.09361;   //metre to yards
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 0 && totypepos == 5) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 0.000621371;  //metre to mile
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 0 && totypepos == 6) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 3.28084 ;   //metre to foot
                    resulttext.setText(num.toString());

                }

                //position 1
                if (fromtypepos == 1 && totypepos == 0) {
                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num / 100;       //cm to metre
                    resulttext.setText(num.toString());
                } else if (fromtypepos == 1 && totypepos == 1) {

                    num = Double.parseDouble(fromtext.getText().toString());//cm to cm
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 1 && totypepos == 2) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * .00001;    //cm to km
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 1 && totypepos == 3) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 0.393701;   //cm to inch
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 1 && totypepos == 4) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 0.0109361;   //cm to yards
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 1 && totypepos == 5) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num / 160934;  //cm to mile
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 1 && totypepos == 6) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 0.0328084 ;   //cm to foot
                    resulttext.setText(num.toString());

                }

                //position 2
                if (fromtypepos == 2 && totypepos == 0) {
                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 1000;       //km to metre
                    resulttext.setText(num.toString());
                } else if (fromtypepos == 2 && totypepos == 1) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 100000;    //km to cm
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 2 && totypepos == 2) {

                    num = Double.parseDouble(fromtext.getText().toString());//km to km
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 2 && totypepos == 3) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 39370.1;   //km to inch
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 2 && totypepos == 4) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 1093.61;   //km to yards
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 2 && totypepos == 5) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 0.621371;  //km to mile
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 2 && totypepos == 6) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 3280.84 ;   //km to foot
                    resulttext.setText(num.toString());

                }


                //position 3
                if (fromtypepos == 3 && totypepos == 0) {
                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 0.0254;       //inch to metre
                    resulttext.setText(num.toString());
                } else if (fromtypepos == 3 && totypepos == 1) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 2.54;    //inch to cm
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 3 && totypepos == 2) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 0.000254;//inch to km
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 3 && totypepos == 3) {

                    num = Double.parseDouble(fromtext.getText().toString());//inch to inch
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 3 && totypepos == 4) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 0.0277778;   //inch to yards
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 3 && totypepos == 5) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num / 63360;  //inch to mile
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 3 && totypepos == 6) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 0.0833333 ;   //inch to foot
                    resulttext.setText(num.toString());

                }

                //position 4
                if (fromtypepos == 4 && totypepos == 0) {
                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 0.9144;       //yards to metre
                    resulttext.setText(num.toString());
                } else if (fromtypepos == 4 && totypepos == 1) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 91.44;    //yards to cm
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 4 && totypepos == 2) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 0.0009144;//yards to km
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 4 && totypepos == 3) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 36;//yards to inch
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 4 && totypepos == 4) {

                    num = Double.parseDouble(fromtext.getText().toString());//yards to yards
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 4 && totypepos == 5) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 0.000568182;  //yards to mile
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 4 && totypepos == 6) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 3 ;   //yards to foot
                    resulttext.setText(num.toString());

                }


                //position 5
                if (fromtypepos == 5 && totypepos == 0) {
                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 1609.34;       //mile to metre
                    resulttext.setText(num.toString());
                } else if (fromtypepos == 5 && totypepos == 1) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 160934;    //mile to cm
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 5 && totypepos == 2) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 1.60934;//mile to km
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 5 && totypepos == 3) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 63360;//mile to inch
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 5 && totypepos == 4) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 1760;//mile to yards
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 5 && totypepos == 5) {

                    num = Double.parseDouble(fromtext.getText().toString());//mile to mile
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 5 && totypepos == 6) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 5280 ;   //mile to foot
                    resulttext.setText(num.toString());

                }


                //position 6
                if (fromtypepos == 6 && totypepos == 0) {
                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 0.3048;       //foot to metre
                    resulttext.setText(num.toString());
                } else if (fromtypepos == 6 && totypepos == 1) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 30.48;    //foot to cm
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 6 && totypepos == 2) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 0.0003048;//foot to km
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 6 && totypepos == 3) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 12; //foot to inch
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 6 && totypepos == 4) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 0.333333;  //foot to yards
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 6 && totypepos == 5) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 0.000189394 ; //foot to mile
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 6 && totypepos == 6) {

                    num = Double.parseDouble(fromtext.getText().toString());//foot to foot
                    resulttext.setText(num.toString());

                }
            }




        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resulttext.setText("");
                fromtext.setText("");
            }
        });



        return view;
    }

}
