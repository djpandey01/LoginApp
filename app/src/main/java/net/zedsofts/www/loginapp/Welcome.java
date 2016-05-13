package net.zedsofts.www.loginapp;

/**
 * Created by Dabz on 5/13/2016.
 */
 import android.app.Activity;
 import android.content.Intent;
 import android.os.Bundle;
 import android.support.v4.app.ShareCompat;
 import android.support.v7.app.AppCompatActivity;
 import android.widget.TextView;

 public class Welcome extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        Intent i = getIntent();
        Bundle extras = i.getExtras();
        String name = extras.getString("name");
        String msg = "Welcome " +name;
        TextView TextView_msg = (TextView) findViewById(R.id.textView_msg);
        TextView_msg.setText(msg);
    }
}
