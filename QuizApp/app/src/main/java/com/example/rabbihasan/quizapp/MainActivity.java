package com.example.rabbihasan.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import static android.graphics.Color.GREEN;
import static android.graphics.Color.RED;


public class MainActivity extends AppCompatActivity {
    //create object for question1 checkbox with chackbox id
    CheckBox answer1ForQuestion1;
    CheckBox answer2ForQuestion1;
    CheckBox answer3ForQuestion1;
    CheckBox answer4ForQuestion1;
    //create object for answer1 TextView with TextView id
    TextView showTextForQuestion1;
    //create object for question2 checkbox with chackbox id
    CheckBox question2CorrectAnswer2;
    CheckBox question2Answer1;
    CheckBox question2Answer2;
    //create object for answer2 TextView with TextView id
    TextView showTextForQuestion2;
    //create object for question3 RadioButton with RadionButton id
    RadioButton question3CorrectAnswer;
    RadioButton question3Answer;
    //create object for answer3 TextView with TextView id
    TextView showTextForQuestion3;

    //create object for question4 RadioButton with RadionButton id
    RadioButton question4correctAnswer;
    RadioButton question4Answer;
    //create object for answer4 TextView with TextView id
    TextView showTextForQuestion4;

    //create EditText object for question5 with EditText id
    EditText question5correctAnswer;
    //create object for answer5 TextView with TextView id
    TextView showTextForQuestion5;

    //create EditText object for question6 with EditText id
    EditText  question6correctAnswer;
    //create object for answer6 TextView with TextView id
    TextView showTextForQuestion6;

    //create object for grade TextView with TextView id
    TextView point;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//create mthod for firstQuestion
    public int  firstQuestion(int corectAnswer){
        corectAnswer=0;
         answer1ForQuestion1=(CheckBox)findViewById(R.id.action_bar_activity_checkbox);
         answer2ForQuestion1=(CheckBox)findViewById(R.id.launcher_activity_checkbox);
         answer3ForQuestion1=(CheckBox)findViewById(R.id.preference_activity_checkbox);
         answer4ForQuestion1=(CheckBox)findViewById(R.id.tab_activity_checkbox);
        //create object for answer1 TextView with TextView id
        showTextForQuestion1=(TextView)findViewById(R.id.answer1);

        //use If-else logic for checking correct answer
        if(answer1ForQuestion1.isChecked()&&answer2ForQuestion1.isChecked()&&answer3ForQuestion1.isChecked()&&answer4ForQuestion1.isChecked()){
            //INVISIBLE TextView VISIBLE
            showTextForQuestion1.setVisibility(View.VISIBLE);
            //use SetText() for set some text
            showTextForQuestion1.setText("Correct!");
            //setTextColor() for use color
            showTextForQuestion1.setTextColor(GREEN);
            //increment number for correct answer
            corectAnswer+=1;

        }
        else{
            //INVISIBLE TextView VISIBLE
            showTextForQuestion1.setVisibility(View.VISIBLE);
            //use SetText() for set some text
            showTextForQuestion1.setText("Wrong answer! Correct answer is all correct.");
            //setTextColor() for use color
            showTextForQuestion1.setTextColor(RED);
        }
        return  corectAnswer;
    }
    //create mthod for secondQuestion
    public int secondQuestion(int corectAnswer){
        corectAnswer=0;
        //create object for question2 checkbox with chackbox id
        question2CorrectAnswer2=(CheckBox)findViewById(R.id.onlyOne_checkbox);
         question2Answer1=(CheckBox)findViewById(R.id.two_checkbox);
         question2Answer2=(CheckBox)findViewById(R.id.doesnt_have_threads_checkbox);
        //create object for answer2 TextView with TextView id
        showTextForQuestion2=(TextView)findViewById(R.id.answer2);

        //use If-else logic for checking correct answer
        if(question2CorrectAnswer2.isChecked()){
            //INVISIBLE TextView VISIBLE
            showTextForQuestion2.setVisibility(View.VISIBLE);
            //use SetText() for set some text
            showTextForQuestion2.setText("Correct!");
            //setTextColor() for use color
            showTextForQuestion2.setTextColor(GREEN);
            //increment number for correct answer
            corectAnswer+=1;
        }
        else{
            //INVISIBLE TextView VISIBLE
            showTextForQuestion2.setVisibility(View.VISIBLE);
            //use SetText() for set some text
            showTextForQuestion2.setText("Wrong answer! Correct answer is Only one.");
            //setTextColor() for use color
            showTextForQuestion2.setTextColor(RED);
        }

        return corectAnswer;
    }
    //create mthod for thirdQuestion
    public int thirdQuestion(int corectAnswer){
        corectAnswer=0;
        //create object for question3 RadioButton with RadionButton id
        question3CorrectAnswer=(RadioButton)findViewById(R.id.java_native_interface_radio_button);
        question3Answer=(RadioButton)findViewById(R.id.java_network_interface_radio_button);
        //create object for answer3 TextView with TextView id
        showTextForQuestion3=(TextView)findViewById(R.id.answer3);


        //use If-else logic for checking correct answer
        if(question3CorrectAnswer.isChecked()){
            //INVISIBLE TextView VISIBLE
            showTextForQuestion3.setVisibility(View.VISIBLE);
            //use SetText() for set some text
            showTextForQuestion3.setText("Correct!");
            //setTextColor() for use color
            showTextForQuestion3.setTextColor(GREEN);
            //increment number for correct answer
            corectAnswer+=1;
        }
        else{
            //INVISIBLE TextView VISIBLE
            showTextForQuestion3.setVisibility(View.VISIBLE);
            //use SetText() for set some text
            showTextForQuestion3.setText("Wrong answer! Correct answer is Java native interface.");
            //setTextColor() for use color
            showTextForQuestion3.setTextColor(RED);

        }
        return corectAnswer;
    }
    //create mthod for fourthQuestion
    public int fourthQuestion(int corectAnswer){
        corectAnswer=0;
        //create object for question4 RadioButton with RadionButton id
        question4correctAnswer=(RadioButton)findViewById(R.id.http_response_radio_button);
         question4Answer=(RadioButton)findViewById(R.id.http_entity_radio_button);
        //create object for answer4 TextView with TextView id
        showTextForQuestion4=(TextView)findViewById(R.id.answer4);

        //use If-else logic for checking correct answer
        if(question4correctAnswer.isChecked()){
            //INVISIBLE TextView VISIBLE
            showTextForQuestion4.setVisibility(View.VISIBLE);
            //use SetText() for set some text
            showTextForQuestion4.setText("Correct!");
            //setTextColor() for use color
            showTextForQuestion4.setTextColor(GREEN);
            //increment number for correct answer
            corectAnswer+=1;
        }
        else {
            //INVISIBLE TextView VISIBLE
            showTextForQuestion4.setVisibility(View.VISIBLE);
            //use SetText() for set some text
            showTextForQuestion4.setText("Wrong answer! Correct answer is HTTP response.");
            //setTextColor() for use color
            showTextForQuestion4.setTextColor(RED);
        }
        return corectAnswer;
    }
    //create mthod for fifthQuestion
    public int fifthQuestion(int corectAnswer){
        corectAnswer=0;
        //create EditText object for question5 with EditText id
        question5correctAnswer=(EditText)findViewById(R.id.ans_field);
        //create object for answer5 TextView with TextView id
        showTextForQuestion5=(TextView)findViewById(R.id.answer5);

        //use If-else logic for checking correct answer
        if( question5correctAnswer.getText().toString().equalsIgnoreCase("json exception")){
            //INVISIBLE TextView VISIBLE
            showTextForQuestion5.setVisibility(View.VISIBLE);
            //use SetText() for set some text
            showTextForQuestion5.setText("Correct!");
            //setTextColor() for use color
            showTextForQuestion5.setTextColor(GREEN);
            //increment number for correct answer
            corectAnswer+=1;
        }
        else {
            //INVISIBLE TextView VISIBLE
            showTextForQuestion5.setVisibility(View.VISIBLE);
            //use SetText() for set some text
            showTextForQuestion5.setText("Wrong answer! Correct answer is JSON Exception.");
            //setTextColor() for use color
            showTextForQuestion5.setTextColor(RED);
        }
        return corectAnswer;
    }
    //create mthod for sixthQuestion
    public  int sixthQuestion(int corectAnswer){
        corectAnswer=0;
        //create EditText object for question6 with EditText id
        question6correctAnswer=(EditText)findViewById(R.id.ans2_field);
        //create object for answer6 TextView with TextView id
        showTextForQuestion6=(TextView)findViewById(R.id.answer6);

        //use If-else logic for checking correct answer
        if( question6correctAnswer.getText().toString().equalsIgnoreCase("logical data")){
            //INVISIBLE TextView VISIBLE
            showTextForQuestion6.setVisibility(View.VISIBLE);
            //use SetText() for set some text
            showTextForQuestion6.setText("Correct!");
            //setTextColor() for use color
            showTextForQuestion6.setTextColor(GREEN);
            //increment number for correct answer
            corectAnswer+=1;
        }
        else{
            //INVISIBLE TextView VISIBLE
            showTextForQuestion6.setVisibility(View.VISIBLE);
            //use SetText() for set some text
            showTextForQuestion6.setText("Wrong answer! Correct answer is Logical Data.");
            //setTextColor() for use color
            showTextForQuestion6.setTextColor(RED);
        }
        return corectAnswer;
    }
//create method for submit button and show  answer
    public void submitAnswer(View view){
        //calling all method in submitAnswer method
        int corectAnswer=0;
         corectAnswer+=firstQuestion(corectAnswer);
        corectAnswer+=secondQuestion(corectAnswer);
        corectAnswer+=thirdQuestion(corectAnswer);
        corectAnswer+=fourthQuestion(corectAnswer);
        corectAnswer+=fifthQuestion(corectAnswer);
        corectAnswer+=sixthQuestion(corectAnswer);
        //Toast for show Grade on Screen
       /* Context context = getApplicationContext();
        CharSequence text = "Your Point: "+(corectAnswer*5);
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();*/

       //show grade point
        //create object for grade TextView with TextView id
         point=(TextView)findViewById(R.id.grade);
        point.setVisibility(view.VISIBLE);
        point.setText("Your point is:"+(corectAnswer*5));
        point.setTextColor(GREEN);

    }

    //create reset button method

    public void resetButton(View view){
        //uncheckd 1st question all checkbox
          answer1ForQuestion1.setChecked(false);
          answer2ForQuestion1.setChecked(false);
          answer3ForQuestion1.setChecked(false);
          answer4ForQuestion1.setChecked(false);
        //uncheck 2nd question all checkbox
        question2CorrectAnswer2.setChecked(false);
        question2Answer1.setChecked(false);
        question2Answer2.setChecked(false);
        //uncheckd question 3 all radio button
        question3CorrectAnswer.setChecked(false);
        question3Answer.setChecked(false);
        //uncheckd question 4 all radio button
        question4correctAnswer.setChecked(false);
        question4Answer.setChecked(false);
        //clear text in edittex field for question 5
        question5correctAnswer.setText("");
        //clear text in edittex field for question 6
        question6correctAnswer.setText("");

        //answer TextView disable
        showTextForQuestion1.setVisibility(view.INVISIBLE);
        showTextForQuestion2.setVisibility(view.INVISIBLE);
        showTextForQuestion3.setVisibility(view.INVISIBLE);
        showTextForQuestion4.setVisibility(view.INVISIBLE);
        showTextForQuestion5.setVisibility(view.INVISIBLE);
        showTextForQuestion6.setVisibility(view.INVISIBLE);
        //point saw TextView
        point.setVisibility(view.INVISIBLE);
    }
}
