package com.example.a20240729androidapplicationpractice;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    //Function to direct to Fcu Page
    public void FcuIndexPage(View view)
    {
        Intent i =new Intent();
        i.setAction(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://www.fcu.edu.tw"));
        startActivity(i);
    }
    //Function to direct to FCU Google Map
    public void GotoFCU(View view)
    {
        Intent i =new Intent(Intent.ACTION_VIEW);
        Intent iq=new Intent(Intent.ACTION_VIEW);
        Intent iqe=new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("geo:0,0?q=FCU"));
        iq.setData(Uri.parse("geo:24.178970533916186, 120.64653643203295?q=7-11"));
        iqe.setData(Uri.parse("geo:25.0,121.5?q=tesla supercharger"));
        startActivity(iqe);
    }
    //Function to direct to Dial
    public void clickDIAL(View view)
    {
    Intent i =new Intent();
    i.setAction(Intent.ACTION_DIAL);
    i.setData(Uri.parse("tel:+12345"));
    startActivity(i);

    }

}