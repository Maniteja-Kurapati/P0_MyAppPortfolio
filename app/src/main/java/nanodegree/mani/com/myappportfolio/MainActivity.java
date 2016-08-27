package nanodegree.mani.com.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showApplicationLabel(View view)
    {
        Button button = (Button) view;
        String toastText = String.format(getString(R.string.toast_message),button.getText().toString().toLowerCase());
        Toast.makeText(getApplicationContext(),toastText,Toast.LENGTH_SHORT).show();

    }
}
