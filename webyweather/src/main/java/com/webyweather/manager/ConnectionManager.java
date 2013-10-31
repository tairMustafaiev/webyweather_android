package com.webyweather.manager;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;

public class ConnectionManager {

    /**
     * Checks network connection state
     *
     * @param context - {@link android.content.Context}
     * @return boolean is network connected
     */
    public boolean isNetworkConnected (final Context context) {
        final ConnectivityManager conMgr = (ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        final NetworkInfo mNetworkInfo = conMgr.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
        State mobileState = null;
        if (mNetworkInfo != null) {
            mobileState = mNetworkInfo.getState();
        }
        final State wifiState = conMgr.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState();
        if ((State.CONNECTED.equals(wifiState))
                || (State.CONNECTED.equals(mobileState))) {
            return true;

        } else if ((State.DISCONNECTED.equals(wifiState))
                || (State.DISCONNECTED.equals(mobileState))) {
            return false;
        }
        return false;
    }

}
