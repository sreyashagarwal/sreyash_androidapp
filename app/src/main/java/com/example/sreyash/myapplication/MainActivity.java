package com.example.sreyash.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText base1;

    private Button ans;
    private Button indans;
    private Button malans;
    private Button bahans;
    private Button rusans;
    private Button hunans;
    private Button japans;
    private Button swissans;

    private EditText indian1;
    private EditText malaysian;
    private EditText bahraini;
    private EditText russian;
    private EditText hungarian;
    private EditText japanese;
    private EditText swiss;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.head, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.clear:
                base1.setText("");
                indian1.setText("");
                malaysian.setText("");
                bahraini.setText("");
                russian.setText("");
                hungarian.setText("");
                japanese.setText("");
                swiss.setText("");
                return true;

            default:
                return super.onOptionsItemSelected(item);

        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        defineActions();

        ans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double basevalue = Double.parseDouble(base1.getText().toString());

                    double indianvalue = basevalue * 64.2903;
                    double malaysianvalue = basevalue * 3.9126;
                    double bahrainivalue = basevalue * 0.376;
                    double russianvalue = basevalue * 57.4481;
                    double hungarianvalue = basevalue * 250.8708;
                    double japanesevalue = basevalue * 108.9071;
                    double swissvalue = basevalue * 0.9339;

                    indian1.setText(String.valueOf(indianvalue));
                    malaysian.setText(String.valueOf(malaysianvalue));
                    bahraini.setText(String.valueOf(bahrainivalue));
                    russian.setText(String.valueOf(russianvalue));
                    hungarian.setText(String.valueOf(hungarianvalue));
                    japanese.setText(String.valueOf(japanesevalue));
                    swiss.setText(String.valueOf(swissvalue));
                }catch(Exception e)
                {
                    Toast.makeText(getApplicationContext(), "Only Numbers Are Acceptable !! Retry with a new value", Toast.LENGTH_LONG).show();
                }
            }
        });

       indans.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               try {
                   double basevalue = Double.parseDouble(indian1.getText().toString());

                   double usvalue = basevalue * 0.0155;
                   double malaysianvalue = basevalue * 0.0608;
                   double bahrainivalue = basevalue * 0.0058;
                   double russianvalue = basevalue * 0.8941;
                   double hungarianvalue = basevalue * 3.9019;
                   double japanesevalue = basevalue * 1.6932;
                   double swissvalue = basevalue * 0.0145;

                   base1.setText(String.valueOf(usvalue));
                   malaysian.setText(String.valueOf(malaysianvalue));
                   bahraini.setText(String.valueOf(bahrainivalue));
                   russian.setText(String.valueOf(russianvalue));
                   hungarian.setText(String.valueOf(hungarianvalue));
                   japanese.setText(String.valueOf(japanesevalue));
                   swiss.setText(String.valueOf(swissvalue));
               }catch(Exception e)
               {
                   Toast.makeText(getApplicationContext(), "Only Numbers Are Acceptable !! Retry with a new value", Toast.LENGTH_LONG).show();
               }
           }
       });


        malans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double basevalue = Double.parseDouble(malaysian.getText().toString());

                    double usvalue = basevalue * 0.2555;
                    double indvalue = basevalue * 16.4344;
                    double bahrainivalue = basevalue * 0.0961;
                    double russianvalue = basevalue * 14.6633;
                    double hungarianvalue = basevalue * 64.1226;
                    double japanesevalue = basevalue * 27.8328;
                    double swissvalue = basevalue * 0.2388;

                    base1.setText(String.valueOf(usvalue));
                    indian1.setText(String.valueOf(indvalue));
                    bahraini.setText(String.valueOf(bahrainivalue));
                    russian.setText(String.valueOf(russianvalue));
                    hungarian.setText(String.valueOf(hungarianvalue));
                    japanese.setText(String.valueOf(japanesevalue));
                    swiss.setText(String.valueOf(swissvalue));
                }catch(Exception e)
                {
                    Toast.makeText(getApplicationContext(), "Only Numbers Are Acceptable !! Retry with a new value", Toast.LENGTH_LONG).show();
                }
            }
        });

        bahans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double basevalue = Double.parseDouble(bahraini.getText().toString());

                    double usvalue = basevalue * 2.6595;
                    double indvalue = basevalue * 170.895;
                    double malaysianvalue = basevalue * 10.4095;
                    double russianvalue = basevalue * 152.6186;
                    double hungarianvalue = basevalue * 666.9613;
                    double japanesevalue = basevalue * 289.5963;
                    double swissvalue = basevalue * 2.4839;

                    base1.setText(String.valueOf(usvalue));
                    indian1.setText(String.valueOf(indvalue));
                    malaysian.setText(String.valueOf(malaysianvalue));
                    russian.setText(String.valueOf(russianvalue));
                    hungarian.setText(String.valueOf(hungarianvalue));
                    japanese.setText(String.valueOf(japanesevalue));
                    swiss.setText(String.valueOf(swissvalue));
                }catch(Exception e)
                {
                    Toast.makeText(getApplicationContext(), "Only Numbers Are Acceptable !! Retry with a new value", Toast.LENGTH_LONG).show();
                }
            }
        });

        rusans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double basevalue = Double.parseDouble(russian.getText().toString());


                    double indvalue = basevalue * 1.1197;
                    double usvalue = basevalue * 0.01742;
                    double malaysianvalue = basevalue * 0.0682;
                    double bahrainivalue = basevalue * 0.0065;
                    double hungarianvalue = basevalue * 4.3702;
                    double japanesevalue = basevalue * 1.8977;
                    double swissvalue = basevalue * 0.0163;

                    base1.setText(String.valueOf(usvalue));
                    indian1.setText(String.valueOf(indvalue));
                    malaysian.setText(String.valueOf(malaysianvalue));
                    bahraini.setText(String.valueOf(bahrainivalue));
                    hungarian.setText(String.valueOf(hungarianvalue));
                    japanese.setText(String.valueOf(japanesevalue));
                    swiss.setText(String.valueOf(swissvalue));
                }catch(Exception e)
                {
                    Toast.makeText(getApplicationContext(), "Only Numbers Are Acceptable !! Retry with a new value", Toast.LENGTH_LONG).show();
                }
            }
        });

        hunans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double basevalue = Double.parseDouble(hungarian.getText().toString());


                    double indvalue = basevalue * 0.2561;
                    double usvalue = basevalue * 0.0032;
                    double malaysianvalue = basevalue * 0.0156;
                    double bahrainivalue = basevalue * 0.0014;
                    double russianvalue = basevalue * 0.2288;
                    double japanesevalue = basevalue * 0.4344;
                    double swissvalue = basevalue * 0.0037;

                    base1.setText(String.valueOf(usvalue));
                    indian1.setText(String.valueOf(indvalue));
                    malaysian.setText(String.valueOf(malaysianvalue));
                    bahraini.setText(String.valueOf(bahrainivalue));
                    russian.setText(String.valueOf(russianvalue));
                    japanese.setText(String.valueOf(japanesevalue));
                    swiss.setText(String.valueOf(swissvalue));
                }catch(Exception e)
                {
                    Toast.makeText(getApplicationContext(), "Only Numbers Are Acceptable !! Retry with a new value", Toast.LENGTH_LONG).show();
                }
            }
        });

        japans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double basevalue = Double.parseDouble(japanese.getText().toString());


                    double indvalue = basevalue * 0.587;
                    double usvalue = basevalue * 0.0091;
                    double malaysianvalue = basevalue * 0.0358;
                    double bahrainivalue = basevalue * 0.0034;
                    double russianvalue = basevalue * 0.5221;
                    double hungarainvalue = basevalue * 2.2851;
                    double swissvalue = basevalue * 0.0085;

                    base1.setText(String.valueOf(usvalue));
                    indian1.setText(String.valueOf(indvalue));
                    malaysian.setText(String.valueOf(malaysianvalue));
                    bahraini.setText(String.valueOf(bahrainivalue));
                    russian.setText(String.valueOf(russianvalue));
                    hungarian.setText(String.valueOf(hungarainvalue));
                    swiss.setText(String.valueOf(swissvalue));
                }catch(Exception e)
                {
                    Toast.makeText(getApplicationContext(), "Only Numbers Are Acceptable !! Retry with a new value", Toast.LENGTH_LONG).show();
                }
            }
        });

        swissans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    double basevalue = Double.parseDouble(swiss.getText().toString());


                    double indvalue = basevalue * 68.7123;
                    double usvalue = basevalue * 1.0706;
                    double malaysianvalue = basevalue * 4.1875;
                    double bahrainivalue = basevalue * 0.4025;
                    double russianvalue = basevalue * 61.2213;
                    double hungarainvalue = basevalue * 267.7758;
                    double japanesevalue = basevalue * 116.6162;

                    base1.setText(String.valueOf(usvalue));
                    indian1.setText(String.valueOf(indvalue));
                    malaysian.setText(String.valueOf(malaysianvalue));
                    bahraini.setText(String.valueOf(bahrainivalue));
                    russian.setText(String.valueOf(russianvalue));
                    hungarian.setText(String.valueOf(hungarainvalue));
                    japanese.setText(String.valueOf(japanesevalue));
                }catch(Exception e)
                {
                    Toast.makeText(getApplicationContext(), "Only Numbers Are Acceptable !! Retry with a new value", Toast.LENGTH_LONG).show();
                }
            }
        });


           }



    public void defineActions(){
        base1 = (EditText)findViewById(R.id.base);

        ans = (Button)findViewById(R.id.submit);
        indans = (Button)findViewById(R.id.indsubmit);
        malans = (Button)findViewById(R.id.malsubmit);
        bahans = (Button)findViewById(R.id.bahsubmit);
        rusans = (Button)findViewById(R.id.russubmit);
        hunans = (Button)findViewById(R.id.hunsubmit);
        japans = (Button)findViewById(R.id.japsubmit);
        swissans = (Button)findViewById(R.id.swisssubmit);

        indian1 = (EditText) findViewById(R.id.indian);
        malaysian = (EditText) findViewById(R.id.malaysian);
        bahraini = (EditText) findViewById(R.id.bahraini);
        russian = (EditText) findViewById(R.id.Russian);
        hungarian = (EditText) findViewById(R.id.Hungarian);
        japanese = (EditText) findViewById(R.id.Japanese);
        swiss = (EditText) findViewById(R.id.Swiss);
    }
}
