package org.dalol.scientificcalculator.application;

import android.app.Application;
import android.content.res.Configuration;

/**
 * @author Filippo
 * @version 1.0.0
 * @since 8/25/2015
 */
public class ScientificCalculatorApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }
}
