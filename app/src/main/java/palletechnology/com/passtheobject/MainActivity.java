package palletechnology.com.passtheobject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static palletechnology.com.passtheobject.R.id.editText;

public class MainActivity extends AppCompatActivity {
      EditText ed1,ed2,ed3;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = (EditText) findViewById(editText);
        ed2 = (EditText) findViewById(R.id.editText2);
        ed3 = (EditText) findViewById(R.id.editText3);
        b1 = (Button) findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this,SecondActivity.class);
                 Student s = new Student();
                s.srno = Integer.parseInt(ed1.getText().toString());
                s.sname = ed2.getText().toString();
                s.scource = ed3.getText().toString();
                Bundle b = new Bundle();
                b.putSerializable("stud",s);
                in.putExtra("myObject",b);
                startActivity(in);

            }
        });
    }
}
