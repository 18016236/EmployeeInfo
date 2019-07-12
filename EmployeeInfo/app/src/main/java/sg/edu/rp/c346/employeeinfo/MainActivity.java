package sg.edu.rp.c346.employeeinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<Employee> aEmployee;
    Customadapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.listviewemployee);
        aEmployee = new ArrayList<>();
        aEmployee.add(new Employee("John","Software Technical Leader","3400.0"));
        aEmployee.add(new Employee("May","Programmer","2200.0"));

        adapter= new Customadapter(this,R.layout.row,aEmployee);
        lv.setAdapter(adapter);
    }
}
