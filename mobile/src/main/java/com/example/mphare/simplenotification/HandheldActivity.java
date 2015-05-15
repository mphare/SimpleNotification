package com.example.mphare.simplenotification;

import android.app.Notification;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class HandheldActivity extends ActionBarActivity
{

  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
    Button mButton = (Button) findViewById(R.id.button);

    mButton.setOnClickListener(new View.OnClickListener()
    {
      @Override public void onClick(View v)
      {
        Notification notification = new NotificationCompat.Builder(getApplication())
            .setSmallIcon(R.mipmap.ic_launcher)
            .setContentTitle("Hello World")
            .setContentText("My First Android Wear Notification")
            .extend(new NotificationCompat.WearableExtender().setHintShowBackgroundOnly(true))
            .build();
      }
    });
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_handheld);
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu)
  {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.menu_handheld, menu);
    return true;
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item)
  {
    // Handle action bar item clicks here. The action bar will
    // automatically handle clicks on the Home/Up button, so long
    // as you specify a parent activity in AndroidManifest.xml.
    int id = item.getItemId();

    //noinspection SimplifiableIfStatement
    if (id == R.id.action_settings)
    {
      return true;
    }

    return super.onOptionsItemSelected(item);
  }
}
