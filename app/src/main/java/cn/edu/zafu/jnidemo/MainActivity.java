package cn.edu.zafu.jnidemo;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Test t=new Test();
        Toast.makeText(this,t.getName(),Toast.LENGTH_LONG).show();
    }


}
