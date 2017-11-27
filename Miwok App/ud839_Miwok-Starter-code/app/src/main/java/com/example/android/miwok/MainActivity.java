/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    //find the views that shows the number catagory...
    //we call EventListner three way..like:
    //1.create onClick attribute XML 2.call setOnClickListner method and call method  onClickListner() from View and overrride onClick() method
    //3.create EventListner object


    //NumbersClickListner clickListner=new NumbersClickListner();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);
        //second type EventListner call
        TextView numbers=(TextView)findViewById(R.id.numbers);
        //set a clickListner on the view
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //create new Intent to open the (@link NumberActivity)
                Intent numbersIntent=new Intent(MainActivity.this,NumbersActivity.class);
                //start the new Activity
                 startActivity(numbersIntent);
            }
        });
        //second type EventListner call
        TextView family=(TextView)findViewById(R.id.family);
        //set a clickListner on the view
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //create new Intent to open the (@link FamilyActivity)
                Intent familyIntent=new Intent(MainActivity.this,FamilyActivity.class);
                //start the new Activity
                startActivity(familyIntent);
            }
        });

        //second type EventListner call
        TextView colors=(TextView)findViewById(R.id.colors);
        //set a clickListner on the view
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //create new Intent to open the (@link ColorsActivity)
                Intent colorsIntent=new Intent(MainActivity.this,ColorsActivity.class);
                //start the new Activity
                startActivity(colorsIntent);
            }
        });
        //second type EventListner call
        TextView phrases=(TextView)findViewById(R.id.phrases);
        //set a clickListner on the view
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //create new Intent to open the (@link PhrasesActivity)
                Intent phrasesntent=new Intent(MainActivity.this,PhrasesActivity.class);
                //start the new Activity
                startActivity(phrasesntent);
            }
        });
    }
        //here are first EventListner Example code
    //create numberList()
    //this is explicit Intent
   /* public void openNumberList(View view){
        // Start the activity connect to the
        //specified class
        Intent i = new Intent(this, NumbersActivity.class);
        startActivity(i);
    }*/
    //this is explicit Intent
    //create familyList()
   /* public void openFamilyList(View view){
        // Start the activity connect to the
        //specified class
        Intent i=new Intent(this,FamilyActivity.class);
        startActivity(i);
    }
    //this is explicit Intent
    //create PhrasesList()
    public void openPhrasesList(){
        //Start the activity connect to the
        //specified class
        Intent i=new Intent(this,PhrasesActivity.class);
        startActivity(i);
    }
    //this is explicit Intent
    //create ColorsList()
    public void openColorsList(View view){
        //Start the activity connect to the
        //specified class
        Intent i=new Intent(this,ColorsActivity.class);
        startActivity(i);
    }
   /*
   * Intent hase two kind.Like:
   * 1.Implicit Intent 2.Explicit Intent
   *
   * Impicit Intent code Example:
   * //this Intent open any Email app
   * Intent intent=new Intent(Intent.ACTION_SENDTO);
   * sendIntent.setData(Uri.parse("mailto"));
   * sendIntent.putExtra(Intent.EXTRA_SUBJECT,"just java order for" +name);
   * sendIntent.putExtra(Intent.EXTRA_TEXT, priceMassage);
   *
   * //verfy that intent will resolce properly
   * if(sendIntent.resolveActitvity(getPackageManager())!=null){
   * startActivity(sendIntent);
   * }
   * */

    
}
