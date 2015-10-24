package com.learning.android.androidbasics;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


// http://developer.android.com/guide/topics/ui/controls/spinner.html
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Spinner spinner = (Spinner) findViewById(R.id.email_spinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.email_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);



//        Button logInButton = (Button) findViewById(R.id.login_button);
//        logInButton.setEnabled(true);
//        logInButton.setOnClickListener(logInButtonListener);
    }

    //---create an anonymous class to act as a button click listener---
    private View.OnClickListener logInButtonListener = new View.OnClickListener() {
        public void onClick(View v) {
//            EditText username = (EditText) findViewById(R.id.username_edittext);
//            String userNameTxt = username.getText().toString().trim();

//            EditText password = (EditText) findViewById(R.id.password_editpass);
//            String passwordTxt = password.getText().toString();
//            System.out.println("------ userNameTxt --------" + userNameTxt +
//                    "--- passwordTxt ---" + passwordTxt);
//
///            String message = "";
//            if( ("john".equalsIgnoreCase(userNameTxt)) &&
//                    ("admin123".equalsIgnoreCase(passwordTxt)) ) {
//                message = "Valid";
//            } else {
//                message = "Invalid";
//            }

//            TextView messageView = (TextView) findViewById(R.id.show_message);
//            messageView.setText(message);
        }
    };


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

        CreateMenu(menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return menuChoice(item);
    }

    private void CreateMenu(Menu menu_new) {
        menu_new.add(0, 0, 0, "Item 1");
        menu_new.add(0, 1, 1, "Item 2");
        menu_new.add(0, 2, 2, "Item 3");
        menu_new.add(0, 3, 3, "Item 4");
        menu_new.add(0, 4, 4, "Item 5");
        menu_new.add(0, 5, 5, "Item 6");
        menu_new.add(0, 6, 6, "Item 7");
    }

    private boolean menuChoice(MenuItem item) {
        switch (item.getItemId()) {
            case 0:
                Toast.makeText(this, "You clicked on Item 1", Toast.LENGTH_LONG).show();
                return true;
            case 1:
                Toast.makeText(this, "You clicked on Item 2", Toast.LENGTH_LONG).show();
                return true;
            case 2:
                Toast.makeText(this, "You clicked on Item 3", Toast.LENGTH_LONG).show();
                return true;
            case 3:
                Toast.makeText(this, "You clicked on Item 4", Toast.LENGTH_LONG).show();
                return true;
            case 4:
                Toast.makeText(this, "You clicked on Item 5", Toast.LENGTH_LONG).show();
                return true;
            case 5:
                Toast.makeText(this, "You clicked on Item 6", Toast.LENGTH_LONG).show();
                return true;
            case 6:
                Toast.makeText(this, "You clicked on Item 7", Toast.LENGTH_LONG).show();
                return true;
        }
        return false;
    }

    public void CallProducts(View view) {
        Intent intent = new Intent(this, ProductActivity.class);
        startActivity(intent);
    }

}
