package com.example.asus.travelwithme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.webkit.WebView;


public class MainActivity extends AppCompatActivity {

    String locationFrom="";
    String locationTo = "";
    String numOfDays = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Button PlanButton = (Button)findViewById(R.id.button5);
       Button GotoPlacesButton = (Button)findViewById(R.id.button6);

        final EditText LocationEdit = (EditText)findViewById(R.id.editText5);






        PlanButton.setOnClickListener(

                new Button.OnClickListener(){

                    public void onClick(View v){

                        setContentView(R.layout.plan_trip);



                       final EditText FromEdit = (EditText)findViewById(R.id.editText2);
                       final EditText ToEdit = (EditText)findViewById(R.id.editText3);

                    locationFrom =   FromEdit.getText().toString();
                    locationTo =   ToEdit.getText().toString();




                            Button NextButton = (Button)findViewById(R.id.button9);


                       NextButton.setOnClickListener(

                                new Button.OnClickListener(){

                                    public void onClick(View v){

                                        setContentView(R.layout.plan_trip_days);


                                        final EditText DaysEdit = (EditText)findViewById(R.id.editText4);
                                        numOfDays =   DaysEdit.getText().toString();


                                        Button NextButton2 = (Button)findViewById(R.id.button11);


                                        NextButton2.setOnClickListener(

                                                new Button.OnClickListener(){

                                                    public void onClick(View v){

                                                        setContentView(R.layout.plan_trip_hotels);


                                                        Button YesButton = (Button)findViewById(R.id.button8);
                                                        Button BookButton = (Button)findViewById(R.id.button10);

                                                        BookButton.setOnClickListener(

                                                                new Button.OnClickListener(){

                                                                    public void onClick(View v){

                                                                        setContentView(R.layout.webview);

                                                                        String url = "http://www.booking.com/country/lk.html?aid=318615;label=Low_CPA_English_EN_ALL-GBIECAUS_12118496905-OIFp4kqx4Ii*VmtxyZzdswS73336437385:pl:ta:p1:p2:ac:ap1t1:neg;ws=&gclid=COWfwsvrg8gCFVcVjgod3NwGWw";
                                                                        WebView view=(WebView)findViewById(R.id.webView);
                                                                        view.getSettings().setJavaScriptEnabled(true);
                                                                        view.loadUrl(url);





                                                                    }
                                                                }
                                                        );

                                                        YesButton.setOnClickListener(

                                                                new Button.OnClickListener(){

                                                                    public void onClick(View v){

                                                                        setContentView(R.layout.budgetview);

                                                                        TextView mText;
                                                                        TextView BText;

                                                                        mText = (TextView)findViewById(R.id.textView9);
                                                                        BText = (TextView)findViewById(R.id.textView10);



                                                                        mText.setText("Your journey is  from "+FromEdit.getText().toString()+" to "+ToEdit.getText().toString()+" in "+DaysEdit.getText().toString()+"days!");
                                                                        if (FromEdit.getText().toString().equals("colombo")&& ToEdit.getText().toString().equals("kandy")&&DaysEdit.getText().toString().equals("7")){

                                                                            BText.setText("Your Buddget is "+"100$"+"!");

                                                                        }

                                                                        if (FromEdit.getText().toString().equals("colombo")&& ToEdit.getText().toString().equals("kandy")&&DaysEdit.getText().toString().equals("14")){

                                                                            BText.setText("Your Buddget is "+"250$"+"!");

                                                                        }
                                                                        if (FromEdit.getText().toString().equals("kandy")&& ToEdit.getText().toString().equals("colombo")&&DaysEdit.getText().toString().equals("7")){

                                                                            BText.setText("Your Buddget is "+"100$"+"!");

                                                                        }

                                                                        if (FromEdit.getText().toString().equals("colombo")&& ToEdit.getText().toString().equals("nuwara eliya")&&DaysEdit.getText().toString().equals("7")){

                                                                            BText.setText("Your Buddget is "+"300$"+"!");

                                                                        }

                                                                        if (FromEdit.getText().toString().equals("colombo")&& ToEdit.getText().toString().equals("nuwara eliya")&&DaysEdit.getText().toString().equals("14")){

                                                                            BText.setText("Your Buddget is "+"700$"+"!");

                                                                        }




                                                                    }
                                                                }
                                                        );






                                                    }
                                                }
                                        );





                                    }
                                }
                        );












                    }



                }


        );



        GotoPlacesButton.setOnClickListener(

                new Button.OnClickListener(){

                    public void onClick(View v){

                        setContentView(R.layout.welcome);
                        ImageButton HotelButton = (ImageButton)findViewById(R.id.button2);
                        ImageButton PlacesButton = (ImageButton)findViewById(R.id.button3);
                        ImageButton HospitalButton = (ImageButton)findViewById(R.id.button);
                        ImageButton BankButton = (ImageButton)findViewById(R.id.button4);
                        //go to hotels list
                        HotelButton.setOnClickListener(

                                new Button.OnClickListener(){

                                    public void onClick(View v){

                                        setContentView(R.layout.webview);


                                        String Kandyurl = "http://www.srilanka.com/travel/travellisting/TC00008";
                                        String Colombourl = "http://www.srilanka.com/travel/travellisting/tc00007";
                                        String otherurl = "https://www.google.lk/search?q=hotel+near+";

                                        WebView view=(WebView)findViewById(R.id.webView);
                                        view.getSettings().setJavaScriptEnabled(true);
                                        if (LocationEdit.getText().toString().equals("kandy")){
                                        view.loadUrl(Kandyurl);}
                                        if (LocationEdit.getText().toString().equals("colombo")){
                                            view.loadUrl(Colombourl);}
                                        else
                                            view.loadUrl(otherurl+LocationEdit.getText().toString());



                                    }



                                }


                        );
                        //go to Hospitals list
                        HospitalButton.setOnClickListener(

                                new Button.OnClickListener(){

                                    public void onClick(View v){

                                        setContentView(R.layout.webview);

                                        String url = "https://www.google.lk/search?q=hospital+near+";

                                        WebView view=(WebView)findViewById(R.id.webView);
                                        view.getSettings().setJavaScriptEnabled(true);
                                        view.loadUrl(url+LocationEdit.getText().toString());

                                    }



                                }


                        );
                        //go to Places list
                        PlacesButton.setOnClickListener(

                                new Button.OnClickListener(){

                                    public void onClick(View v){

                                        setContentView(R.layout.webview);

                                        String url = "https://www.google.lk/search?q=places+near+";
                                        WebView view=(WebView)findViewById(R.id.webView);
                                        view.getSettings().setJavaScriptEnabled(true);
                                        view.loadUrl(url+LocationEdit.getText().toString());

                                    }



                                }


                        );

                        //go to Banks list
                        BankButton.setOnClickListener(

                                new Button.OnClickListener(){

                                    public void onClick(View v){

                                        setContentView(R.layout.webview);

                                        String url = "https://www.google.lk/search?q=bank+near+";
                                        WebView view=(WebView)findViewById(R.id.webView);
                                        view.getSettings().setJavaScriptEnabled(true);
                                        view.loadUrl(url+LocationEdit.getText().toString());

                                    }



                                }


                        );



                    }



                }


        );





    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
