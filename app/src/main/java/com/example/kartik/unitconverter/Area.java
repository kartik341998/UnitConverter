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

import org.w3c.dom.Text;

import java.lang.reflect.Array;


/**
 * A simple {@link Fragment} subclass.
 */
public class Area extends android.support.v4.app.Fragment  {

    String[] From= new String[]{"Sq Metre","Sq Kilometre","Sq Foot","Sq Inch","Acre","Hectare","Guzz"};
    String[] To=new String[]{"Sq Metre","Sq Centimetre","Sq Kilometre","Sq Foot","Sq Inch","Acre","Hectare","Guzz"};
    Spinner fromareaspinner,toareaspinner;
    ArrayAdapter<String> arrayAdapter;
    EditText fromtext;
    TextView resulttext;
    Double num;
    int fromtypepos,totypepos;
    Button calculate,reset;






    public Area() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_area,container,false);

        fromtext=view.findViewById(R.id.fromareaedittext);
        resulttext=view.findViewById(R.id.toareatext);

        calculate=view.findViewById(R.id.areacalcbutton);
        reset=view.findViewById(R.id.arearesetbutton);



        fromareaspinner=view.findViewById(R.id.fromareaspinner);
        arrayAdapter=new ArrayAdapter<String>(getContext(),android.R.layout.simple_spinner_dropdown_item,From);
        fromareaspinner.setAdapter(arrayAdapter);

        toareaspinner=view.findViewById(R.id.toareaspinner);
        arrayAdapter=new ArrayAdapter<String >(getContext(),android.R.layout.simple_spinner_dropdown_item,To);
        toareaspinner.setAdapter(arrayAdapter);


        fromareaspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> fromparent, View view, int fromposition, long fromid) {

                fromtypepos=fromposition;



            }

            @Override
            public void onNothingSelected(AdapterView<?> fromparent) {

            }
        });

        toareaspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
                    Toast.makeText(getActivity(),"You have not entered Area",Toast.LENGTH_SHORT).show();
                }

                else


                    //position 0
                    if (fromtypepos == 0 && totypepos == 0) {
                        num = Double.parseDouble(fromtext.getText().toString());  //sq metre to sq metre
                        resulttext.setText(num.toString());
                    }  else if (fromtypepos == 0 && totypepos == 1) {

                        num = Double.parseDouble(fromtext.getText().toString());
                        num = num / 1000000;    //sq metre to  sq km
                        resulttext.setText(num.toString());

                    } else if (fromtypepos == 0 && totypepos == 2) {

                        num = Double.parseDouble(fromtext.getText().toString());
                        num = num * 10.7639;   //sq metre to sq foot
                        resulttext.setText(num.toString());

                    } else if (fromtypepos == 0 && totypepos == 3) {

                        num = Double.parseDouble(fromtext.getText().toString());
                        num = num * 1550;   //sq metre to sq inch
                        resulttext.setText(num.toString());

                    }
                    else if (fromtypepos == 0 && totypepos == 4) {

                        num = Double.parseDouble(fromtext.getText().toString());
                        num = num * 0.000247105;   //sq metre to  acre
                        resulttext.setText(num.toString());

                    } else if (fromtypepos == 0 && totypepos == 5) {

                        num = Double.parseDouble(fromtext.getText().toString());
                        num = num * 0.0001;  //sq metre to  hectare
                        resulttext.setText(num.toString());

                    } else if (fromtypepos == 0 && totypepos == 6) {

                        num = Double.parseDouble(fromtext.getText().toString());
                        num = num * 1.20758 ;   //sq metre to guzz
                        resulttext.setText(num.toString());

                    }

                //position 1
                if (fromtypepos == 1 && totypepos == 0) {
                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 1000000; //sq km to sq metre
                    resulttext.setText(num.toString());
                }  else if (fromtypepos == 1 && totypepos == 1) {

                    num = Double.parseDouble(fromtext.getText().toString());
                       //sq km to  sq km
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 1 && totypepos == 2) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 10763910.4;   //sq km to sq foot
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 1 && totypepos == 3) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 1550003100.0062;   //sq km to sq inch
                    resulttext.setText(num.toString());

                }
                else if (fromtypepos == 1 && totypepos == 4) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 247.105;   //sq km to  acre
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 1 && totypepos == 5) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 100;  //sq km to  hectare
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 1 && totypepos == 6) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 1208000 ;   //sq km to guzz
                    resulttext.setText(num.toString());

                }


                //position 2
                if (fromtypepos == 2 && totypepos == 0) {
                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 0.092903 ;  //sq foot to sq metre
                    resulttext.setText(num.toString());
                }  else if (fromtypepos == 0 && totypepos == 1) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * .000000092903;    //sq foot to  sq km
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 2 && totypepos == 2) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    //sq foot to sq foot
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 2 && totypepos == 3) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 144  ;   //sq foot to sq inch
                    resulttext.setText(num.toString());

                }
                else if (fromtypepos == 2 && totypepos == 4) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * .000022956;   //sq foot to  acre
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 2 && totypepos == 5) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 9290300;  //sq foot to  hectare
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 2 && totypepos == 6) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 0.112188 ;   //sq foot to guzz
                    resulttext.setText(num.toString());

                }

                //position 3
                if (fromtypepos == 3 && totypepos == 0) {
                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 0.00064516 ;  //sq inch to sq metre
                    resulttext.setText(num.toString());
                }  else if (fromtypepos == 3 && totypepos == 1) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * .0000000006451;    //sq inch to  sq km
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 3 && totypepos == 2) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 0.00694444  ; //sq inch to sq foot
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 3 && totypepos == 3) {

                    num = Double.parseDouble(fromtext.getText().toString());
                     //sq inch to sq inch
                    resulttext.setText(num.toString());

                }
                else if (fromtypepos == 3 && totypepos == 4) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * .0000001294;   //sq inch to  acre
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 3 && totypepos == 5) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * .00000006451;  //sq inch to  hectare
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 3 && totypepos == 6) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 0.000779085 ;   //sq inch to guzz
                    resulttext.setText(num.toString());

                }

                //position 4
                if (fromtypepos == 4 && totypepos == 0) {
                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 4046.86 ;  // acre to sq metre
                    resulttext.setText(num.toString());
                }  else if (fromtypepos == 4 && totypepos == 1) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 0.00404686;    //acre to  sq km
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 4 && totypepos == 2) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 43560  ; //acre to sq foot
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 4 && totypepos == 3) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 6273000;//acre to sq inch
                    resulttext.setText(num.toString());

                }
                else if (fromtypepos == 4 && totypepos == 4) {

                    num = Double.parseDouble(fromtext.getText().toString());
                       //acre to  acre
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 4 && totypepos == 5) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 0.404686;  //acre to  hectare
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 4 && totypepos == 6) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 4886.92 ;   //acre to guzz
                    resulttext.setText(num.toString());

                }

                //position 5
                if (fromtypepos == 5 && totypepos == 0) {
                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 10000 ;  // hectare to sq metre
                    resulttext.setText(num.toString());
                }  else if (fromtypepos == 5 && totypepos == 1) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 0.01;    //hectare to  sq km
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 5 && totypepos == 2) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 107639  ; //hectare to sq foot
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 5 && totypepos == 3) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 15500000;//hectare to sq inch
                    resulttext.setText(num.toString());

                }
                else if (fromtypepos == 5 && totypepos == 4) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 2.47105; //hectare to  acre
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 5 && totypepos == 5) {

                    num = Double.parseDouble(fromtext.getText().toString());
                      //hectare to  hectare
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 5 && totypepos == 6) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 12075.8 ;   //hectare to guzz
                    resulttext.setText(num.toString());

                }

                //position 6
                if (fromtypepos == 6 && totypepos == 0) {
                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 0.8281 ;  // guzz to sq metre
                    resulttext.setText(num.toString());
                }  else if (fromtypepos == 6 && totypepos == 1) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * .0000008281;    //guzz to  sq km
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 6 && totypepos == 2) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 8.91359  ; //guzz to sq foot
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 6 && totypepos == 3) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 1283.56;//guzz to sq inch
                    resulttext.setText(num.toString());

                }
                else if (fromtypepos == 6 && totypepos == 4) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * 0.000204628; //guzz to  acre
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 6 && totypepos == 5) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    num = num * .00008281 ; //guzz to  hectare
                    resulttext.setText(num.toString());

                } else if (fromtypepos == 6 && totypepos == 6) {

                    num = Double.parseDouble(fromtext.getText().toString());
                    //guzz to guzz
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
