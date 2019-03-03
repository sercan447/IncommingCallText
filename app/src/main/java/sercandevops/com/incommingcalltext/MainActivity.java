package sercandevops.com.incommingcalltext;

import android.Manifest;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(getApplicationContext(),"MAINACTIVITY GELIYO.. ",Toast.LENGTH_SHORT).show();

        ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.READ_PHONE_STATE);

        ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.READ_PHONE_STATE},11);



    }
}
