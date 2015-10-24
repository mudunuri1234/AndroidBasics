package com.learning.android.androidbasics;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by FCWL on 10/9/2015.
 */
public class ProductDetailsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);

        String productName = getIntent().getStringExtra("productName");

        TextView productNameView = (TextView) findViewById(R.id.product_name);
        productNameView.setText(productName);

        TextView detailsView = (TextView) findViewById(R.id.product_details);
        detailsView.setText("Vector calculus  is a branch of mathematics " +
                "concerned with differentiation and integration ");
    }

}
