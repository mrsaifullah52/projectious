package com.softtechglobal.vupapers;

import androidx.appcompat.app.AppCompatActivity;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ListView;

public class finalTerm extends AppCompatActivity {
    ListView lv2;
    String[] code2;
    String type="finalterm.xml";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_term);

        lv2 = (ListView) findViewById(R.id.finaltermList);

        Resources res = getResources();
        code2 = res.getStringArray(R.array.backCodes);

        myAdapter adapter = new myAdapter(this, code2,type);
        lv2.setAdapter(adapter);

    }
}