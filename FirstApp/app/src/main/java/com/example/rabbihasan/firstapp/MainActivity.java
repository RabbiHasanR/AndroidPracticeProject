package com.example.rabbihasan.firstapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends ActionBarActivity {
    int quantity=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * *this method is called when the plus button is clicked
     */
    public void increment(View view){
        if(quantity==100){
            //show an error message as a toast
            Toast.makeText(this,"You can't have more then 100 coffee",Toast.LENGTH_SHORT).show();
            //exit earlier statement
            return;
        }
         quantity++;
        displayQuantity(quantity);
    }

    /**
     * *this method is called when the minus button is clicked
     */
    public void decrement(View view){
        if(quantity==1){
            //show an error message as a toast
            Toast.makeText(this,"You can't have less then 1 coffee",Toast.LENGTH_SHORT).show();
            //exit earlier statement
            return;
        }
         quantity--;
        displayQuantity(quantity);
    }

    /**
     *create summary of the order
     *
     * @param addUserName of the customer
     * @param price of the order
     * @param addWhippedCreamCheck whether or not the user want whipped cream topping
     * @param addChocolateCheck whether or not the user want chocolate topping
     * @return  text summary
     */
    private String createOrderSummary(int price,boolean addWhippedCreamCheck,boolean addChocolateCheck,String addUserName){
        //getString method use for translate english to espaniol
        String priceMessage=getString(R.string.order_summary_name,addUserName);
        priceMessage=priceMessage+"\n"+getString(R.string.order_summary_whipped_cream,addWhippedCreamCheck);
        priceMessage=priceMessage+"\n"+getString(R.string.order_summary_chocolate,addChocolateCheck);
        priceMessage=priceMessage+"\n"+getString(R.string.order_summary_quantity,quantity);
        //NumberFormat.getCurrencyInstance().format(price) use for convert price
        priceMessage=priceMessage+"\n"+getString(R.string.order_summary_price, NumberFormat.getCurrencyInstance().format(price)); ;

        //add thank you message with resource string
        priceMessage=priceMessage+"\n"+getString(R.string.thank_you);
        return  priceMessage;
    }




    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        //EditText objct create for user input and return value
        EditText userInputName=(EditText)findViewById(R.id.name_field);
        String userInputValue=userInputName.getText().toString();
        //figure out if user want whipped cream topping
        CheckBox whippedCreamCheckBox=(CheckBox)findViewById(R.id.whipped_cream_checkbox);
        boolean hasWhippedCreamChecked=whippedCreamCheckBox.isChecked();
        //figure out if user want chocolate topping
        CheckBox chocolateCheckBox=(CheckBox)findViewById(R.id.chocolate_checkbox);
       boolean hasChocolateChecked=chocolateCheckBox.isChecked();
        displayQuantity(quantity);
       int price=calculatePrice(hasWhippedCreamChecked,hasChocolateChecked);
        String priceMessage=createOrderSummary(price,hasWhippedCreamChecked,hasChocolateChecked,userInputValue);

        //send order with email intent
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this

        intent.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.order_summary_email_subject,userInputValue));
        intent.putExtra(Intent.EXTRA_TEXT, priceMessage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

        //displayMessege(priceMessage);


    }

    /**
     * Calculates the price of the order based on the current quantity.
     *
     * @param addWhippedCream  checked and increase price $1
     * @param addChocolate checked and increase price $2
     * @return the price
     */

    private int calculatePrice(boolean addWhippedCream,boolean addChocolate){

        int basePricePerCup=5;

        if(addWhippedCream){
            basePricePerCup+=1;

        }
        if(addChocolate){
            basePricePerCup+=2;

        }

     return quantity*basePricePerCup;
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    /**
     * This method displays the given price on the screen.
     */
   /* private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }*/
    /**
     * this is displayMessage method
     */
   /* public void displayMessege(String messege){
        TextView orderSummaryTextView=(TextView)findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(messege);
        orderSummaryTextView.setTextSize(18);

    }*/


}