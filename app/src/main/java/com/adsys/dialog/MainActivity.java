package com.adsys.dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

/**
 * <h1>Main Activity</h1>
 * Used to start a new window and to control the App
 * logic and flow.
 * <br><br>
 <dl>
    <dt><b>Usages</b></dt>
    <dd>★ Crating a new {@link MyDialog}
          when an action is taken.
    </dd>
    <dd>★ Make some changes depending of the action taken.</dd>
 </dl>
 */
public class MainActivity extends AppCompatActivity {
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.text);

        //Setting a listener to create a new dialog
        findViewById(R.id.show_dialog).setOnClickListener(
                view -> new MyDialog(this).show()
        );
    }

    /* DTO */

    public TextView getTextView() {
        return text;
    }
}
