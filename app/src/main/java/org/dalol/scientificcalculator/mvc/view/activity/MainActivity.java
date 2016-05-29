package org.dalol.scientificcalculator.mvc.view.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Toast;

import org.dalol.scientificcalculator.R;
import org.dalol.scientificcalculator.mvc.view.custom.CalculatorLayout;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private CalculatorLayout mCalculatorLayout;
    private ScrollView mScrollView;
    private RadioGroup mModeGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCalculatorLayout = (CalculatorLayout) findViewById(R.id.calculator);
        mCalculatorLayout.addTapListener(new CalculatorLayout.EventListener() {
            @Override
            public void onClickListener(String text) {
                Toast.makeText(MainActivity.this, "Clicked " + text, Toast.LENGTH_SHORT).show();
            }
        });


        mModeGroup = (RadioGroup) findViewById(R.id.mode);

        mScrollView = (ScrollView) findViewById(R.id.calcScrollView);
//        mScrollView.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() {
//
//            int old = 0;
//
//            @Override
//            public void onScrollChanged() {
//
//
//                int scrollX = mScrollView.getScrollX(); //for horizontalScrollView
//                int scrollY = mScrollView.getScrollY(); //for verticalScrollView
//
//                if(old == scrollY) {
//                    old = scrollY;
//                    return;
//                }
//
//                String dir = "";
//
//                if(old > scrollY) {
//                    dir = "UP";
//                    mModeGroup.animate().translationY(-35).setDuration(300L).setInterpolator(new AccelerateInterpolator());
//                } else {
//                    dir = "down";
//                    mModeGroup.animate().translationY(25).setDuration(300L).setInterpolator(new AccelerateInterpolator());
//                }
//
//                old = scrollY;
//
//
//                //DO SOMETHING WITH THE SCROLL COORDINATES
//
//                Log.d(TAG, "Scrolling Direction " + scrollX+" :: " + scrollY + " Direction :: " + dir);
//
//            }
//        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
