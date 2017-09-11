package fi.jamk.launchmapexercise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.content.Intent;
import android.net.Uri;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showMap(View view) {
    // get lat and lng values
        EditText editText1 = (EditText) findViewById(R.id.editText1);
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        String numberOne = editText1.getText().toString();
        String numberTwo = editText2.getText().toString();
        double lat = Double.parseDouble(numberOne);
        double lng = Double.parseDouble(numberTwo);
    // show map
        Intent intent = new Intent(Intent.ACTION_VIEW);
        // using the new universal cross-platform syntax for MAPS URLs
        intent.setData(Uri.parse("https://www.google.com/maps/search/?api=1&query="+lat+","+lng));
        startActivity(intent);
    }
}
