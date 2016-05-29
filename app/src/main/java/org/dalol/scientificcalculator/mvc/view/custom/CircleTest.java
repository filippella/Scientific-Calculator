package org.dalol.scientificcalculator.mvc.view.custom;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

import org.dalol.scientificcalculator.R;

/**
 * @author Filippo
 * @version 1.0.0
 * @since 8/25/2015
 */
public class CircleTest extends View {

    private Paint mPaint;
    private int mCircleColor;
    private RectF mArc;

    public CircleTest(Context context) {
        super(context);
        init(null);
    }

    public CircleTest(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypedArray a = context.getTheme().obtainStyledAttributes(attrs,R.styleable.CircleTest,0, 0);
        mCircleColor = a.getColor(R.styleable.CircleTest_circleColor, Color.YELLOW);

        a.recycle();

        init(attrs);
    }

    public CircleTest(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    private void init(AttributeSet attrs) {
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        mPaint.setColor(mCircleColor);

        mArc = new RectF();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(getWidth()/2, getHeight()/2, 200, mPaint);

        mPaint.setColor(Color.GREEN);
        mPaint.setAlpha(80);
        mArc.set((getWidth()/2) - 200, (getHeight()/2) - 200, (getWidth()/2) + 200, (getHeight()/2) + 200);
        canvas.drawArc(mArc, -90, 270, true, mPaint);


        mPaint.setColor(Color.WHITE);
        canvas.drawCircle(getWidth()/2, getHeight()/2, 50, mPaint);

        mPaint.setColor(Color.BLUE);
        mPaint.setTextAlign(Paint.Align.CENTER);
        mPaint.setTextSize(50);

        canvas.drawText("0%", getWidth()/2, getHeight()/2, mPaint);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);

        int width = getWidth();
    }
}
