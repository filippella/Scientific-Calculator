package org.dalol.scientificcalculator.mvc.model;

import org.dalol.scientificcalculator.R;

/**
 * @author Filippo
 * @version 1.0.0
 * @since 8/25/2015
 */
public class Constants {

    public static final String SYMBOL_SET_ONE[][] = {
            {"MC", "MR", "MS", "1/x", "PI"},
            {"n!", "xy", "^x", "(", ")"},
            {"Sin", "Cos", "Tan", "Log", "Ex"},
            {"Sin-1", "Cos-1", "Tan-1", "C", "AC"}
    };

    public static final String SYMBOL_SET_TWO[][] = {
            {"7", "8", "9", "%", "+"},
            {"4", "5", "6", "+/-", "-"},
            {"1", "2", "3", "x3", "/"},
            {"0", ".", "=", "3^x", "*"}
    };

    public static final int COLOR_SET_ONE[][] = {
            {R.color.white, R.color.white, R.color.white, R.color.white, R.color.white},
            {R.color.white, R.color.white, R.color.white, R.color.white, R.color.white},
            {R.color.white, R.color.white, R.color.white, R.color.white, R.color.white},
            {R.color.white, R.color.white, R.color.white, R.color.white, R.color.white}
    };

    public static final int COLOR_SET_TWO[][] = {
            {R.color.black, R.color.black, R.color.black, R.color.white, R.color.white},
            {R.color.black, R.color.black, R.color.black, R.color.white, R.color.white},
            {R.color.black, R.color.black, R.color.black, R.color.white, R.color.white},
            {R.color.black, R.color.black, R.color.white, R.color.white, R.color.white}
    };


    public static final int BUTTON_BACKGROUND_SET_ONE[][] = {
            {R.drawable.button_bg_other, R.drawable.button_bg_other, R.drawable.button_bg_other, R.drawable.button_bg_other, R.drawable.button_bg_other},
            {R.drawable.button_bg_other, R.drawable.button_bg_other, R.drawable.button_bg_other, R.drawable.button_bg_other, R.drawable.button_bg_other},
            {R.drawable.button_bg_other, R.drawable.button_bg_other, R.drawable.button_bg_other, R.drawable.button_bg_other, R.drawable.button_bg_other},
            {R.drawable.button_bg_other, R.drawable.button_bg_other, R.drawable.button_bg_other, R.drawable.button_bg_clear, R.drawable.button_bg_clear}
    };

    public static final int BUTTON_BACKGROUND_SET_TWO[][] = {
            {R.drawable.button_bg_number, R.drawable.button_bg_number, R.drawable.button_bg_number, R.drawable.button_bg_other, R.drawable.button_bg_operator},
            {R.drawable.button_bg_number, R.drawable.button_bg_number, R.drawable.button_bg_number, R.drawable.button_bg_other, R.drawable.button_bg_operator},
            {R.drawable.button_bg_number, R.drawable.button_bg_number, R.drawable.button_bg_number, R.drawable.button_bg_other, R.drawable.button_bg_operator},
            {R.drawable.button_bg_number, R.drawable.button_bg_number, R.drawable.button_bg_equal, R.drawable.button_bg_other, R.drawable.button_bg_operator}
    };

}
