package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;

import java.util.concurrent.ExecutionException;

/**
 * Created by llin on 2016-09-28.
 */
public class ValidReturnTestTest extends AndroidTestCase{

    public void testEndPointsAysncTask(){
        String joke = null;
        try {
            joke = new EndpointsAsyncTask().execute(getContext()).get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        assertNotNull(joke);
    }
}