package simon.frendo.mytodolist;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by frendos on 15/01/2018.
 */
public class TodoActivity extends Activity implements AdapterView.OnClickListener {

    private Button btnValider;
    private Button btnVider;
    private EditText txtField;
    private TextView txtView;
    private ListView liste1;
    private String[] listItems = {"item 1", "item 2 ", "list", "android", "item 3", "foobar", "bar", };


    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task_layout);
        btnValider =(Button) findViewById(R.id.buttonValider);
        btnValider.setOnClickListener(this);
        btnVider =(Button) findViewById(R.id.buttonVider);
        btnVider.setOnClickListener(this);
        txtField = (EditText)findViewById(R.id.editText);
        //txtView = (TextView)findViewById(R.id.textView);
        liste1 = (ListView)findViewById(R.id.listView1);
        liste1.setAdapter(new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, listItems));
        liste1.setOnItemClickListener(this);


    }
    @Override
    public void onClick(AdapterView<?> parent, View v, int position, long id){
            if (v.getId() == R.id.buttonValider)
                Toast.makeText(getApplicationContext(), txtField.getText() + " validé", Toast.LENGTH_SHORT).show();
            //txtView.setText(txtField.getText());
            if(v.getId()==R.id.buttonVider) {
                Toast.makeText(getApplicationContext(), txtField.getText() + " vidé ", Toast.LENGTH_SHORT).show();
                //txtView.setText("");
            }

    }
}
