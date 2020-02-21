package lastie_wangechian_button.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button custom_button = findViewById(R.id.custom_button);
        Switch switch_enable = findViewById(R.id.switch_enable);

        custom_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "The button was clicked", Toast.LENGTH_SHORT).show();
            }
        });

        switch_enable.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    custom_button.setEnabled(true);
                }else{
                    custom_button.setEnabled(false);
                }
            }
        });
    }
}
