package com.mmsquare.android.moneta.tests;

import android.test.ActivityInstrumentationTestCase2;
import com.mmsquare.android.moneta.activities.StartupActivity;

/**
 * This is a simple framework for a test of an Application.  See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more information on
 * how to write and extend Application tests.
 * <p/>
 * To run this test, you can type:
 * adb shell am instrument -w \
 * -e class com.mmsquare.android.moneta.StartupActivityTest \
 * com.mmsquare.android.moneta.tests/android.test.InstrumentationTestRunner
 */
public class StartupActivityTest extends ActivityInstrumentationTestCase2<StartupActivity> {

    public StartupActivityTest() {
        super("com.mmsquare.android.moneta", StartupActivity.class);
    }

}
