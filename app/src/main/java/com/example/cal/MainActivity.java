package com.example.cal;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity { @Override
protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    TextView t1,t2;

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
    t1=findViewById(R.id.textView);
    t2=findViewById(R.id.textView2);
    b1=findViewById(R.id.button);
    b2=findViewById(R.id.button2);
    b3=findViewById(R.id.button3);
    b4=findViewById(R.id.button4);
    b5=findViewById(R.id.button5);
    b6=findViewById(R.id.button6);
    b7=findViewById(R.id.button7);
    b8=findViewById(R.id.button8);
    b9=findViewById(R.id.button9);
    b10=findViewById(R.id.button10);
    b11=findViewById(R.id.button11);
    b12=findViewById(R.id.button12);
    b13=findViewById(R.id.button13);
    b14=findViewById(R.id.button14);
    b15=findViewById(R.id.button15);
    b16=findViewById(R.id.button16);
    b1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) { t1.setText(t1.getText().toString()+"1");
        }
    });

    b2.setOnClickListener(new View.OnClickListener() { @Override
    public void onClick(View v) { t1.setText(t1.getText().toString()+"2");
    }
    });

    b3.setOnClickListener(new View.OnClickListener() { @Override
    public void onClick(View v) { t1.setText(t1.getText().toString()+"3");
    }
    });

    b4.setOnClickListener(new View.OnClickListener() { @Override
    public void onClick(View v) { t1.setText(t1.getText().toString()+"4");
    }
    });

    b5.setOnClickListener(new View.OnClickListener() { @Override
    public void onClick(View v) { t1.setText(t1.getText().toString()+"5");
    }
    });

    b6.setOnClickListener(new View.OnClickListener() { @Override
    public void onClick(View v) { t1.setText(t1.getText().toString()+"6");
    }
    });

    b7.setOnClickListener(new View.OnClickListener() { @Override
    public void onClick(View v) { t1.setText(t1.getText().toString()+"7");
    }
    });

    b8.setOnClickListener(new View.OnClickListener() { @Override
    public void onClick(View v) { t1.setText(t1.getText().toString()+"8");
    }
    });

    b9.setOnClickListener(new View.OnClickListener() { @Override
    public void onClick(View v) { t1.setText(t1.getText().toString()+"9");
    }
    });

    b10.setOnClickListener(new View.OnClickListener() { @Override
    public void onClick(View v) { t1.setText(t1.getText().toString()+"0");
    }
    });

    b11.setOnClickListener(new View.OnClickListener() { @Override
    public void onClick(View v) { t2.setText(t1.getText().toString()+"+");
        t1.setText("");

    }
    });

    b12.setOnClickListener(new View.OnClickListener() { @Override
    public void onClick(View v) { t2.setText(t1.getText().toString()+"-");
        t1.setText("");
    }
    });

    b13.setOnClickListener(new View.OnClickListener() { @Override
    public void onClick(View v) { t2.setText(t1.getText().toString()+"*");
        t1.setText("");
    }
    });

    b14.setOnClickListener(new View.OnClickListener() { @Override
    public void onClick(View v) { t2.setText(t1.getText().toString()+"/");
        t1.setText("");
    }
    });

    b15.setOnClickListener(new View.OnClickListener() { @Override
    public void onClick(View v) { t2.setText("");
        t1.setText("");
    }
    });

    b16.setOnClickListener(new View.OnClickListener() { @Override
    public void onClick(View v) { String s=t2.getText().toString();
        char ch=s.charAt(s.length()-1);
        if(ch=='+')
    {
        s=s.replace('+',' ');
        s=s.trim();
        int res=Integer.parseInt(s)+Integer.parseInt(t1.getText().toString());
        t1.setText(Integer.toString(res));
    }

        if(ch=='-')
        {
            s=s.replace('-',' ');
            s=s.trim();
            int res=Integer.parseInt(s)-Integer.parseInt(t1.getText().toString());
            t1.setText(Integer.toString(res));
        }
        if(ch=='*')
        {
            s=s.replace('*',' ');
            s=s.trim();
            int res=Integer.parseInt(s)*Integer.parseInt(t1.getText().toString());
            t1.setText(Integer.toString(res));
        }
        if(ch=='/')
        {

            s=s.replace('/',' ');
            s=s.trim();
            int res=Integer.parseInt(s)/Integer.parseInt(t1.getText().toString());
            t1.setText(Integer.toString(res));
        }

    };
    })
    ;}

}