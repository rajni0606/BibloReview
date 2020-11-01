package com.example.arundhati.bibloreview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SureActivity extends AppCompatActivity {

TextView ts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sure);

        final TextView Display= findViewById(R.id.vartext);
        ts=findViewById(R.id.ts);
        Bundle bn=getIntent().getExtras();
        String text= bn.getString("key");
        Display.setText(String.valueOf(text));

        Button buttonscan = findViewById(R.id.btnscan);
        buttonscan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent activity1Intent = new Intent(getApplicationContext(), ImageActivity.class);
                startActivity(activity1Intent);
            }
        });

        Button buttonsearch = findViewById(R.id.btnsearch);
        buttonsearch.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ts.setMovementMethod(new ScrollingMovementMethod());
                Display.setText("");
                Bundle bn=getIntent().getExtras();
                String text= bn.getString("key");
                String q=String.valueOf(text);
                if(q.equalsIgnoreCase("Are You Sure You Want To \nSearch For This Book?\n\n\nThe Fault In Our Stars\n")) {
                    Display.setText("Name: The Fault In Our Stars \n Author: John Green \n Rating: 3 \n ");
                    ts.setText("Review: The Fault in our stars isn't a bad book, but I wouldn't consider it perfect like many do. The terminally sick characters rather enjoy their life and their daily routine rather than being grim and depressed about it, and it taught me to look at a new day as a gift. If you were to read the book, it's an easy read, and the protagonist gets into you. It feels oddly realistic, as though you are Hazel Grace. John Green has indeed written it beautifully. The ending was heart breaking and surprising, it was a real sharp turn of events, and it filled my heart with warmth. If I were to shed some tears on the story (cuz many do), I would probably do it in the last few chapters. The last 5 were so thoughtful and hit a soft spot in me.");
                }
                else if(q.equalsIgnoreCase("Are You Sure You Want To \nSearch For This Book?\n\n\nA Tap On The Window\n")){
                    Display.setText("Name: A Tap On The Window \n Author: Linwood Barclay \n Rating: 4.5 \n ");
                    ts.setText("Sometimes, doing the right thing is not always worth doing. It’s hard to be right all the time. It’s not an easy way to live your life.”\\r\\nA Tap on the Window by Linwood Barclay is a slow start, but five hundred odd pages later, when it all ends, it bounds to keep one on the edge.\\r\\nMost of us know what one bad decision can do, sometimes it can even change one’s side in a controversy. Our protagonist, Cal Weaver made one small decision around which the entire book revolves around.\\r\\nA desperate guy with his son dead, marriage in crumbles finds a young hottie tapping on his car window outside a bar, the perfect mystery case needed to spin a yarn. Surprisingly, Cal here was an ex-cop and is a Private Investigator, which makes him look pretty dumb to have made that decision, but he makes smarter ones in the future (though only in the end). The antagonist\\'s character kind of let me down and I wish it could have been darker there (Well, I’m a sucker for anything Dark).\\r\\nThe story ends with a wonderful twist where you see the perp(s) dealt with but the twist is one that you do not see coming and finally answers the questions that he has been posing throughout the book. To know what this is, go check out the book!");
                }

                else if(q.equalsIgnoreCase("Are You Sure You Want To \nSearch For This Book?\n\n\nA Thousand Splendid Suns\n")){
                    Display.setText("Name: A Thousand Splendid Suns \n Author: Khaled Hosseini \n Rating: 4 \n ");
                    ts.setText("384 pages of emotional turmoil”\\r\\nThrough Riverbed publications, Hosseini pumps out yet another emotional rollercoaster that’s bound to move even the most cold hearted of men. The stand-alone second instalment set in the same setting of Taliban ruled state of Afghanistan, this piece of work enthralls you with its special way with words.\\r\\nFollowing the story of two women, Mariam and Laila, down trodden by the man’s cruel world, Hosseini spins a fantastic tale of courage, friendship and sacrifice set in such a place where the status of women is no better than animals. Two unrelated women develop the inextricable bond of a mother and daughter as they plough their way through the world in metaphorical shackles with their nigh inexorable spirits.\\r\\nThis story has all the emotions, happy notes of pre-Taliban era and the contrasting latter grim tone. It will move you, encourage you and solidify your respect towards women and what they go through. Definitely worth your time, as it adds something meaningful to your experience.");
                }
            }
        });
    }
}