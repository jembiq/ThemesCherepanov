package com.example.localizedappcherepanov;

import android.app.Activity;

public class Utils {
    private static int sTheme;

    public final static int THEME_DEFAULT = 0;
    public final static int THEME_GREEN= 1;
    public final static int THEME_BLACK = 2;
    public final static int THEME_BLUE = 3;

    public static void changeToTheme(int theme) {
        sTheme = theme;
    }

    public static void onActivityCreateSetTheme(Activity activity) {
        switch (sTheme) {
            case THEME_DEFAULT :
                activity.setTheme(R.style.AppTheme);
                break;
            case THEME_GREEN :
                activity.setTheme(R.style.ThemeGreen);
                break;
            case THEME_BLACK :
                activity.setTheme((R.style.ThemeBlack));
                break;
            case THEME_BLUE :
                activity.setTheme(R.style.ThemeBlue);
                break;
            default:
        }
    }
}
