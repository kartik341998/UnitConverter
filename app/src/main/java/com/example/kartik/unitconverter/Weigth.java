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
public class Weigth extends android.support.v4.app.Fragment {

    String[] From= new String[]{"Kilogram","Gram","Pound","Ton","Ounce","Carrat"};
    String[] To=new String[]{"Kilogram","Gram","Pound","Ton","Ounce","Carrat"};
    Spinner fromweightspinner,toweightspinner;
    ArrayAdapter<String> arrayAdapter;
    EditText fromtext;
    TextView resulttext;
    Double num;
    int fromtypepos,totypepos;
    Button calculate,reset;


    public Weigth() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_weigth,container,false);


        fromtext=view.findViewById(R.id.fromweightedittext);
        resulttext=view.findViewById(R.id.toweighttext);

        calculate=view.findViewById(R.id.weightcalcbutton);
        reset=view.findViewById(R.id.weightresetbutton);

        fromweightspinner=view.findViewById(R.id.fromweightspinner);
        arrayAdapter=new ArrayAdapter<String>(getContext(),android.R.layout.simple_spinner_dropdown_item,From);
        fromweightspinner.setAdapter(arrayAdapter);

        toweightspinner=view.findViewById(R.id.toweightspinner);
        arrayAdapter=new ArrayAdapter<String >(getContext(),android.R.layout.simple_spinner_dropdown_item,To);
        toweightspinner.setAdapter(arrayAdapter);


        fromweightspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> fromparent, View view, int fromposition, long fromid) {

                fromtypepos=fromposition;



            }

            @Override
            public void onNothingSelected(AdapterView<?> fromparent) {

            }
        });

        toweightspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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

                if(string.isEmpty()  || string.equals("."))
                {
                    Toast.makeText(getActivity(),"You have not entered Weight",Toast.LENGTH_SHORT).show();
                }

                else


                // for position 0
                if (fromtypepos == 0 && totypepos == 0) {
                    num = Double.parseDouble(fromtext.getText().toString());
                    resulttext.setText(num.toString());    // kg to kg
                } else if (fromtypepos == 0 && totypepos == 1) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 1000;  // kg to gram
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 0 && totypepos == 2) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 2.204;    //kg to pound
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 0 && totypepos == 3) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num / 1000;       //kg to ton
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 0 && totypepos == 4) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 35.2739;     //kg to ounce
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 0 && totypepos == 5) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num / 5000;         //kg to carrot
                    resulttext.setText(num.toString());

                }


                  //for position 1
               else if (fromtypepos == 1 && totypepos == 0) {
                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num / 1000;   //gram to kg
                    resulttext.setText(num.toString());
                } else if (fromtypepos == 1 && totypepos == 1) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    resulttext.setText(num.toString());    //gram to gram

                } else if (fromtypepos == 1 && totypepos == 2) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * .002204;   //gram to pound
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 1 && totypepos == 3) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num / 1000000;   //gram to ton
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 1 && totypepos == 4) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * .0352739;     //gram to ounce
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 1 && totypepos == 5) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num / 5000000;         //gram to carat
                    resulttext.setText(num.toString());

                }


                //for position 2
                else if (fromtypepos == 2 && totypepos == 0) {
                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num / 2.204;   // pound to kg
                    resulttext.setText(num.toString());
                } else if (fromtypepos == 2 && totypepos == 1) {

                    num = num / .002204; // pound to gram
                    num = Double.parseDouble(fromtext.getText().toString());
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 2 && totypepos == 2) {

                    num = Double.parseDouble(fromtext.getText().toString()); // pound to pound
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 2 && totypepos == 3) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 0.0004535; // pound to ton
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 2 && totypepos == 4) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 16 ;   // pound to ounce
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 2 && totypepos == 5) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 2267.961 ;   // pound to carrot
                    resulttext.setText(num.toString());

                }

                //for position 3
                else if (fromtypepos == 3 && totypepos == 0) {
                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num / 1000;   // ton to kg
                    resulttext.setText(num.toString());
                } else if (fromtypepos == 3 && totypepos == 1) {

                    num = num / 1000000; // ton to gram
                    num = Double.parseDouble(fromtext.getText().toString());
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 3 && totypepos == 2) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num / 0.0004535;   // ton to pound
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 3 && totypepos == 3) {

                    num = Double.parseDouble(fromtext.getText().toString()); // ton to ton
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 3 && totypepos == 4) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 32000 ;   // ton to ounce
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 3 && totypepos == 5) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 4535923.7 ;   // ton to carrot
                    resulttext.setText(num.toString());

                }

                //for position 4
                else if (fromtypepos == 4 && totypepos == 0) {
                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num / 35.2739;  // ounce to kg
                    resulttext.setText(num.toString());
                } else if (fromtypepos == 4 && totypepos == 1) {

                    num = num / .0352739;  // ounce to gram
                    num = Double.parseDouble(fromtext.getText().toString());
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 4 && totypepos == 2) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num / 16 ;  // ounce to pound
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 4 && totypepos == 3) {

                    num = Double.parseDouble(fromtext.getText().toString()); // ounce to ton
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 4 && totypepos == 4) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num / 32000 ; // ounce to ounce
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 4 && totypepos == 5) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * .2 ;   // ounce to carrot
                    resulttext.setText(num.toString());

                }

                //for position 5
                else if (fromtypepos == 5 && totypepos == 0) {
                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 5000;  // carrat to kg
                    resulttext.setText(num.toString());
                } else if (fromtypepos == 5 && totypepos == 1) {

                    num = num * 5000000;  // carrat to gram
                    num = Double.parseDouble(fromtext.getText().toString());
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 5 && totypepos == 2) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num / 2267.961 ;  // carrat to pound
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 5 && totypepos == 3) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num / 4535923.7 ;  // carrat to ton
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 5 && totypepos == 4) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num / .2 ; // carrat to ounce
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 5 && totypepos == 5) {

                    num = Double.parseDouble(fromtext.getText().toString());  // carrat to carrot
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
