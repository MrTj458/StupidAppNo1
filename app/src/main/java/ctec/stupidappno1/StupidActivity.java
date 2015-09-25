package ctec.stupidappno1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.RelativeLayout;
import android.view.View;
import android.graphics.Color;

public class StupidActivity extends ActionBarActivity
{
    private Button colorChangeButton;
    private RelativeLayout background;
    private TextView sillyWords;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stupid);

        colorChangeButton = (Button) findViewById(R.id.sillyButton);
        background = (RelativeLayout) findViewById(R.id.appBackground);
        sillyWords = (TextView) findViewById(R.id.sillyWords);

        setupListeners();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_stupid, menu);
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
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void changeColors()
    {
        int redColor;
        int blueColor;
        int greenColor;

        redColor = (int) (Math.random() * 256);
        blueColor = (int) (Math.random() * 256);
        greenColor = (int) (Math.random() * 256);

        background.setBackgroundColor(Color.rgb(redColor, blueColor, greenColor));

        redColor = (int) (Math.random() * 256);
        blueColor = (int) (Math.random() * 256);
        greenColor = (int) (Math.random() * 56);

        colorChangeButton.setBackgroundColor(Color.rgb(redColor, blueColor, greenColor));

        redColor = (int) (Math.random() * 256);
        blueColor = (int) (Math.random() * 256);
        greenColor = (int) (Math.random() * 256);

        colorChangeButton.setTextColor(Color.rgb(redColor, blueColor, greenColor));
    }

    private void setupListeners()
    {
        colorChangeButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View buttonView)
            {
                //This is where you put the code that executes when the button is pressed.
                changeColors();
            }
        });
    }
}
