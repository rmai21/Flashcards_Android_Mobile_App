package com.example.flashcards;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView flashcardQ = findViewById(R.id.flashcardQues);
        TextView flashcardA = findViewById(R.id.flashcardAns);
        flashcardQ.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                flashcardQ.setVisibility(View.INVISIBLE);
                flashcardA.setVisibility(View.VISIBLE);
            }
        });

    }
}