package org.dalol.scientificcalculator.mvc.view.custom;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

import org.dalol.scientificcalculator.R;
import org.dalol.scientificcalculator.mvc.model.Constants;

/**
 * @author Filippo
 * @version 1.0.0
 * @since 8/25/2015
 */
public class CalculatorLayout extends RelativeLayout implements View.OnClickListener {

    private static final String TAG = CalculatorLayout.class.getSimpleName();
    private float mSeparatorWidth;
    private EventListener mListener;
    private boolean mIsBoardCreated;

    public CalculatorLayout(Context context) {
        super(context);
        init(null);
    }

    public CalculatorLayout(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypedArray array = getContext().obtainStyledAttributes(attrs, R.styleable.CalculatorLayout, 0, 0);
        mSeparatorWidth = array.getDimension(R.styleable.CalculatorLayout_separatorSpace, 0);
        array.recycle();

        init(attrs);
    }

    public CalculatorLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    private void init(AttributeSet attrs) {
        Log.d(TAG, "Separator Width :: " + getSeparatorWidth());
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.d(TAG, "onAttachedToWindow");
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.d(TAG, "onDetachedFromWindow");
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Log.d(TAG, "onMeasure");
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);

        if (!mIsBoardCreated) {

            addPreGrid();
            addPostGrid();

            Log.d(TAG, "onLayout");


            mIsBoardCreated = true;
        }


    }

    private void addPreGrid() {

        int tileSize = getWidth() / 5;
        int marginCounter = 0;

        int tf = (tileSize * 1) / 4;

        Log.d(TAG, "Size :: " + tf);


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {

                Button button = new Button(getContext());
                button.setText(Constants.SYMBOL_SET_ONE[i][j]);
                button.setTextColor(getResources().getColor(Constants.COLOR_SET_ONE[i][j]));
                button.setBackgroundResource(Constants.BUTTON_BACKGROUND_SET_ONE[i][j]);
                button.setOnClickListener(CalculatorLayout.this);

                //button.setText(Integer.toString((i*j)));
                int topMargin = (tileSize - tf) * i;

                    topMargin = topMargin + marginCounter;

                LayoutParams params = new LayoutParams(tileSize - 5, tileSize - tf);
                params.topMargin = topMargin;
                params.leftMargin = (j * tileSize) + 3;

                addView(button, params);
            }
            marginCounter += 5;
        }
    }

    private void addPostGrid() {

        Drawable bg = getResources().getDrawable(R.drawable.otherbtn);
        //Bitmap original = ((BitmapDrawable) bg).getBitmap();

        int tileSize = getWidth() / 5;
        int tf = (tileSize * 1) / 4;

        int top = (tileSize - tf) * 4;
        top += 30;

        int margin = 10;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {

                if ((i != 0) && (j == 0)) {
                    margin -= 40;
                }

                Button button = new Button(getContext());
                button.setText(Constants.SYMBOL_SET_TWO[i][j]);
                button.setTextColor(getResources().getColor(Constants.COLOR_SET_TWO[i][j]));
                button.setBackgroundResource(Constants.BUTTON_BACKGROUND_SET_TWO[i][j]);
                button.setOnClickListener(CalculatorLayout.this);

                //button.setText(Integer.toString((i*j)));

                LayoutParams params = new LayoutParams(tileSize - 5, tileSize - 5);
                params.topMargin = top + (i * tileSize);
                params.leftMargin = (j * tileSize) + 3;

                addView(button, params);
            }
        }
    }

    private void addGrid() {

        Log.d(TAG, "Calculating Grid");

        float cellSize = getWidth() / 5;

        Log.d(TAG, "Each cell would be :: " + cellSize);

        Button btn = new Button(getContext());
        btn.setText("FILIPPO");
        btn.setBackgroundColor(Color.RED);

        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        params.topMargin = 100;
        params.leftMargin = 0;

        addView(btn, params);
    }

//    private void addMode() {
//
//        mModeGroup = new RadioGroup(getContext());
//        mModeGroup.setOrientation(LinearLayout.HORIZONTAL);
//        mModeGroup.setBackgroundColor(Color.WHITE);
//
//        RadioButton deg = new RadioButton(getContext());
//        deg.setText("DEG");
//        RadioButton rad = new RadioButton(getContext());
//        rad.setText("RAD");
//        RadioButton gra = new RadioButton(getContext());
//        gra.setText("GRA");
//
//        mModeGroup.addView(deg);
//        mModeGroup.addView(rad);
//        mModeGroup.addView(gra);
//
//        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
//                ViewGroup.LayoutParams.WRAP_CONTENT);
//        params.topMargin = 0;
//        params.leftMargin = 0;
//
//        addView(mModeGroup, params);
//    }

    public float getSeparatorWidth() {
        return mSeparatorWidth;
    }

    public void addTapListener(EventListener listener) {
        mListener = listener;
    }

    @Override
    public void onClick(View view) {
        Button button = (Button) view;
        if(mListener != null) {
            mListener.onClickListener(button.getText().toString());
        }
    }

    public interface EventListener {

        /**
         * This method is invoked when the user clicks any button
         * It gets the clicked button text and pass it to the controller through view
         *
         * @param text
         */
        void onClickListener(String text);
    }
}
