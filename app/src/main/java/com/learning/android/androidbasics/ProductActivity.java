package com.learning.android.androidbasics;

import android.app.ListActivity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ProductActivity extends ListActivity {

    private String listData[] = {"Product 1", "Product 2", "Product 3",
            "Product 4", "Product 5", "Product 6"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListView lstView = getListView();
        lstView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        lstView.setTextFilterEnabled(true);
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listData));
    }

    public void onListItemClick(ListView parent, View v, int position, long id) {
        Toast.makeText(this, "You have selected " + listData[position], Toast.LENGTH_SHORT).show();

        ProgressDialog progressBar = new ProgressDialog(v.getContext());
        progressBar.setCancelable(true);
        progressBar.setMessage("Processing ...");
        progressBar.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        progressBar.setProgress(0);
        progressBar.setMax(100);
        progressBar.show();

        try {
            Thread.sleep(900);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        Intent intent = new Intent(this, ProductDetailsActivity.class);
        intent.putExtra("productName", listData[position]);
        startActivity(intent);
    }

}
