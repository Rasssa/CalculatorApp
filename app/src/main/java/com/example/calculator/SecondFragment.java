package com.example.calculator;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondFragment extends Fragment {

    View view;
    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonSin, buttonCos,buttonAdd, buttonSub, buttonDivision,
            buttonMul, buttonTan, buttonLog, button10, buttonC, buttonEqual;

    EditText editText;
    double mValueOne;
    double mValueTwo;

    boolean Addition;
    boolean mSubtract;
    boolean Multiplication;
    boolean Division;
    boolean Equal;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_second, container, false);

        button0 = (Button) view.findViewById(R.id.button0);
        button1 = (Button) view.findViewById(R.id.button1);
        button2 = (Button) view.findViewById(R.id.button2);
        button3 = (Button) view.findViewById(R.id.button3);
        button4 = (Button) view.findViewById(R.id.button4);
        button5 = (Button) view.findViewById(R.id.button5);
        button6 = (Button) view.findViewById(R.id.button6);
        button7 = (Button) view.findViewById(R.id.button7);
        button8 = (Button) view.findViewById(R.id.button8);
        button9 = (Button) view.findViewById(R.id.button9);
        button10 = (Button) view.findViewById(R.id.button10);
        buttonSin = (Button) view.findViewById(R.id.buttonsin);
        buttonCos = (Button) view.findViewById(R.id.buttoncos);
        buttonLog = (Button) view.findViewById(R.id.buttonlog);
        buttonTan = (Button) view.findViewById(R.id.buttontan);
        buttonAdd = (Button) view.findViewById(R.id.buttonadd);
        buttonSub = (Button) view.findViewById(R.id.buttonsub);
        buttonMul = (Button) view.findViewById(R.id.buttonmul);
        buttonDivision = (Button) view.findViewById(R.id.buttondiv);
        buttonC = (Button) view.findViewById(R.id.buttonC);
        buttonEqual = (Button) view.findViewById(R.id.buttoneql);
        editText = (EditText) view.findViewById(R.id.edt1);

            // Cyfry od 1 do 9 + "0" dodawane tak samo
            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (Equal == true) {
                        editText.setText("");
                        Equal = false;
                        editText.setText("1");
                    } else {
                        editText.setText(editText.getText() + "1");
                    }
                }
            });

            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (Equal == true) {
                        editText.setText("");
                        Equal = false;
                        editText.setText("2");
                    } else {
                        editText.setText(editText.getText() + "2");
                    }
                }
            });

            button3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (Equal == true) {
                        editText.setText("");
                        Equal = false;
                        editText.setText("3");
                    } else {
                        editText.setText(editText.getText() + "3");
                    }
                }
            });

            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (Equal == true) {
                        editText.setText("");
                        Equal = false;
                        editText.setText("4");
                    } else {
                        editText.setText(editText.getText() + "4");
                    }
                }
            });

            button5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (Equal == true) {
                        editText.setText("");
                        Equal = false;
                        editText.setText("5");
                    } else {
                        editText.setText(editText.getText() + "5");
                    }
                }
            });

            button6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (Equal == true) {
                        editText.setText("");
                        Equal = false;
                        editText.setText("6");
                    } else {
                        editText.setText(editText.getText() + "6");
                    }
                }
            });

            button7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (Equal == true) {
                        editText.setText("");
                        Equal = false;
                        editText.setText("7");
                    } else {
                        editText.setText(editText.getText() + "7");
                    }
                }
            });

            button8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (Equal == true) {
                        editText.setText("");
                        Equal = false;
                        editText.setText("8");
                    } else {
                        editText.setText(editText.getText() + "8");
                    }
                }
            });

            button9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (Equal == true) {
                        editText.setText("");
                        Equal = false;
                        editText.setText("9");
                    } else {
                        editText.setText(editText.getText() + "9");
                    }
                }
            });

            button0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (Equal == true) {
                        editText.setText("");
                        Equal = false;
                        editText.setText("0");
                    } else {
                        editText.setText(editText.getText() + "0");
                    }
                }
            });
            // realizacja dodawania
            buttonAdd.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    String ed = editText.getText().toString().trim();
                    if (ed.length() == 0) {
                        editText.setText("");
                    } else {
                        mValueOne = Double.parseDouble(editText.getText() + "");
                        Addition = true;
                        editText.setText(null);
                    }
                }
            });
            // realizacja odejmowania
            buttonSub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String ed = editText.getText().toString().trim();
                    if (ed.length() == 0) {
                        editText.setText("");
                    } else {
                        mValueOne = Double.parseDouble(editText.getText() + "");
                        mSubtract = true;
                        editText.setText(null);
                    }
                }
            });
            // realizacja mnożenia
            buttonMul.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String ed = editText.getText().toString().trim();
                    if (ed.length() == 0) {
                        editText.setText("");
                    } else {
                        mValueOne = Double.parseDouble(editText.getText() + "");
                        Multiplication = true;
                        editText.setText(null);
                    }
                }
            });
            // realizacja dzielenia
            buttonDivision.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String ed = editText.getText().toString().trim();
                    if (ed.length() == 0) {
                        editText.setText("");
                    } else {
                        mValueOne = Double.parseDouble(editText.getText() + "");
                        Division = true;
                        editText.setText(null);
                    }
                }
            });
            // realizacja sinusa
            buttonSin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String ed = editText.getText().toString().trim();
                    if (ed.length() == 0) {
                        editText.setText("");
                    } else {
                        String textField = editText.getText().toString();
                        double sins = Math.sin(Double.parseDouble(textField));
                        editText.setText("" + sins);
                    }
                }
            });
        // realizacja cos
            buttonCos.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String ed = editText.getText().toString().trim();
                    if (ed.length() == 0) {
                        editText.setText("");
                    } else {
                        String textField = editText.getText().toString();
                        double coss = Math.cos(Double.parseDouble(textField));
                        editText.setText("" + coss);
                    }
                }
            });
        // realizacja log
            buttonLog.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String ed = editText.getText().toString().trim();
                    if (ed.length() == 0) {
                        editText.setText("");
                    } else {
                        String textField = editText.getText().toString();
                        double logs = Math.log10(Double.parseDouble(textField));
                        editText.setText("" + logs);
                    }
                }
            });
        // realizacja tang
            buttonTan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String ed = editText.getText().toString().trim();
                    if (ed.length() == 0) {
                        editText.setText("");
                    } else {
                        String textField = editText.getText().toString();
                        double tans = Math.tan(Double.parseDouble(textField));
                        editText.setText("" + tans);

                    }
                }
            });
        // realizacja poszczególnych działań
            buttonEqual.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String ed = editText.getText().toString().trim();
                    if (ed.length() == 0) {
                        editText.setText("");
                    } else {
                        mValueTwo = Double.parseDouble(editText.getText() + "");

                        if (Addition == true) {
                            editText.setText(mValueOne + mValueTwo + "");
                            Addition = false;
                        }

                        if (mSubtract == true) {
                            editText.setText(mValueOne - mValueTwo + "");
                            mSubtract = false;
                        }

                        if (Multiplication == true) {
                            editText.setText(mValueOne * mValueTwo + "");
                            Multiplication = false;
                        }

                        if (Division == true) {
                            editText.setText(mValueOne / mValueTwo + "");
                            Division = false;
                        }
                        Equal = true;
                    }
                }
            });
            // realizacja czyszczenia liczydła
            buttonC.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    editText.setText("");
                }
            });
            button10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String ed = editText.getText().toString().trim();
                    if (ed.length() == 0) {
                        editText.setText("");
                    } else {
                        editText.setText(editText.getText() + ".");
                    }
                }
            });

        return view;
    }
}