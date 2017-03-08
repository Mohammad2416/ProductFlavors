package ir.rightel.momir.gradletutorial;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends  Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(Constant.type == Constant.Type.FREE){
            Log.d("TAG", "FREE Version");
        }else {
            Log.d("TAG", "PAID Version");
        }

    }
}
