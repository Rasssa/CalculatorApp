package com.example.calculator;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class FirstFragment<view> extends Fragment {

    View view;
    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
            buttonMul, button10, buttonC, buttonEqual;

    EditText EditText;

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
       view = inflater.inflate(R.layout.fragment_first, container, false);



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
            buttonAdd = (Button) view.findViewById(R.id.buttonadd);
            buttonSub = (Button) view.findViewById(R.id.buttonsub);
            buttonMul = (Button) view.findViewById(R.id.buttonmul);
            buttonDivision = (Button) view.findViewById(R.id.buttondiv);
            buttonC = (Button) view.findViewById(R.id.buttonC);
            buttonEqual = (Button) view.findViewById(R.id.buttoneql);
            EditText = (EditText) view.findViewById(R.id.edt1);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Equal == true) {
                    EditText.setText("");
                    Equal = false;
                    EditText.setText("1");
                } else {
                    EditText.setText(EditText.getText() + "1");
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Equal == true) {
                    EditText.setText("");
                    Equal = false;
                    EditText.setText("2");
                } else {
                    EditText.setText(EditText.getText() + "2");
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Equal == true) {
                    EditText.setText("");
                    Equal = false;
                    EditText.setText("3");
                } else {
                    EditText.setText(EditText.getText() + "3");
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Equal == true) {
                    EditText.setText("");
                    Equal = false;
                    EditText.setText("4");
                } else {
                    EditText.setText(EditText.getText() + "4");
                }
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Equal == true) {
                    EditText.setText("");
                    Equal = false;
                    EditText.setText("5");
                } else {
                    EditText.setText(EditText.getText() + "5");
                }
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Equal == true) {
                    EditText.setText("");
                    Equal = false;
                    EditText.setText("6");
                } else {
                    EditText.setText(EditText.getText() + "6");
                }
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Equal == true) {
                    EditText.setText("");
                    Equal = false;
                    EditText.setText("7");
                } else {
                    EditText.setText(EditText.getText() + "7");
                }
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Equal == true) {
                    EditText.setText("");
                    Equal = false;
                    EditText.setText("8");
                } else {
                    EditText.setText(EditText.getText() + "8");
                }
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Equal == true) {
                    EditText.setText("");
                    Equal = false;
                    EditText.setText("9");
                } else {
                    EditText.setText(EditText.getText() + "9");
                }
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Equal == true) {
                    EditText.setText("");
                    Equal = false;
                    EditText.setText("0");
                } else {
                    EditText.setText(EditText.getText() + "0");
                }
            }
        });

            buttonAdd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String ed = EditText.getText().toString().trim();
                    if (ed.length() == 0) {
                        EditText.setText("");
                    } else {
                        mValueOne = Double.parseDouble(EditText.getText() + "");
                        Addition = true;
                        EditText.setText(null);
                    }
                }
            });

            buttonSub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String ed = EditText.getText().toString().trim();
                    if (ed.length() == 0) {
                        EditText.setText("");
                    } else {
                        mValueOne = Double.parseDouble(EditText.getText() + "");
                        mSubtract = true;
                        EditText.setText(null);
                    }
                }
            });

            buttonMul.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String ed = EditText.getText().toString().trim();
                    if (ed.length() == 0) {
                        EditText.setText("");
                    } else {
                        mValueOne = Double.parseDouble(EditText.getText() + "");
                        Multiplication = true;
                        EditText.setText(null);
                    }
                }
            });

            buttonDivision.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String ed = EditText.getText().toString().trim();
                    if (ed.length() == 0) {
                        EditText.setText("");
                    } else {
                        mValueOne = Double.parseDouble(EditText.getText() + "");
                        Division = true;
                        EditText.setText(null);
                    }
                }
            });

            buttonEqual.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String ed = EditText.getText().toString().trim();
                    if (ed.length() == 0) {
                        EditText.setText("");
                    } else {
                        mValueTwo = Double.parseDouble(EditText.getText() + "");

                        if (Addition == true) {
                            EditText.setText(mValueOne + mValueTwo + "");
                            Addition = false;
                        }

                        if (mSubtract == true) {
                            EditText.setText(mValueOne - mValueTwo + "");
                            mSubtract = false;
                        }

                        if (Multiplication == true) {
                            EditText.setText(mValueOne * mValueTwo + "");
                            Multiplication = false;
                        }

                        if (Division == true) {
                            EditText.setText(mValueOne / mValueTwo + "");
                            Division = false;
                        }
                        Equal = true;
                    }
                }
            });

            buttonC.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    EditText.setText("");
                }
            });

            button10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String ed = EditText.getText().toString().trim();
                    if (ed.length() == 0) {
                        EditText.setText("");
                    } else {
                        EditText.setText(EditText.getText() + ".");
                    }
                }
            });

        return view;
        }
    }
