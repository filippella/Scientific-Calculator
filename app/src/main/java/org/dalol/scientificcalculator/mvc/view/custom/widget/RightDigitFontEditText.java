package org.dalol.scientificcalculator.mvc.view.custom.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.EditText;

/**
 * @author Filippo
 * @version 1.0.0
 * @since 8/25/2015
 */
public class RightDigitFontEditText extends EditText {

    public RightDigitFontEditText(Context context) {
        super(context);
        init();
    }

    public RightDigitFontEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public RightDigitFontEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        Typeface typeface = Typeface.createFromAsset(getResources().getAssets(), "digital-7.ttf");
        setTypeface(typeface);
        setCursorVisible(false);
        setFocusable(false);
        setFocusableInTouchMode(false);
        setGravity(Gravity.RIGHT | Gravity.CENTER_VERTICAL);
    }
}
