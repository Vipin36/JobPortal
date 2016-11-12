package palletechnology.com.passtheobject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
        TextView tx1,tx2,tx3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tx1 = (TextView) findViewById(R.id.textView);
        tx2 = (TextView) findViewById(R.id.textView2);
        tx3 = (TextView) findViewById(R.id.textView3);
        Intent in = getIntent();
        Bundle b = in.getBundleExtra("myObject");
        Student s = (Student) b.getSerializable("stud");
        tx1.setText(""+ s.srno);
        tx2.setText(s.sname);
        tx3.setText(s.scource);
    }
}
