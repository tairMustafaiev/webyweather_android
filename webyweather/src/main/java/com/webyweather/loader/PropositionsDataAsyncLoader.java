package com.webyweather.loader;

import android.content.Context;
import android.net.Uri;
import android.support.v4.content.AsyncTaskLoader;
import android.util.Log;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.webyweather.R;
import com.webyweather.constant.Constants;
import com.webyweather.dto.PropositionsData;
import com.webyweather.manager.HttpManager;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.message.BasicHeader;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by tair_mustafaiev on 6/11/13.
 */
public class PropositionsDataAsyncLoader extends AsyncTaskLoader<PropositionsData> {

    private static final String TAG = "com.webyweather.android.loader.PropositionsDataAsyncLoader";

    private PropositionsData mPropositionsData;

    private double mLatitude;

    private double mLongitude;

    private Context mContext;

    public PropositionsDataAsyncLoader (Context context, double lat, double lng) {
        super(context);
        mContext = context;
        mLatitude = lat;
        mLongitude = lng;
    }

    @Override
    public PropositionsData loadInBackground () {
        HttpManager httpManager = new HttpManager();
        final Header header = new BasicHeader("Content-Type", "application/json");
        String url = String.format(Constants.WEBYWEATHER_SERVICE_URL_TEMPLATE, mLatitude, mLongitude, mContext.getResources().getString(R.string.service_lang)); // TODO Fix "en" value in future for multilanguage support
        try {
            HttpResponse r = httpManager.doRepeatableGet(Uri.decode(url.toString()), 3, header);
            PropositionsData p;
            if (r.getStatusLine().getStatusCode() == 200 && r.getEntity() != null) {
                final InputStream inputStream = r.getEntity().getContent();
                ObjectMapper objectMapper = new ObjectMapper();
                p = objectMapper.readValue(new InputStreamReader(inputStream), PropositionsData.class);
                return p;
            }
        } catch (IOException e) {
            Log.e(TAG, "Propositions data fetching exception", e);
        }

        return null;
    }

    @Override
    protected void onStopLoading () {
        cancelLoad();
    }

    @Override
    protected void onReset () {
        super.onReset();
        this.onStopLoading();
    }

    @Override
    public void deliverResult (final PropositionsData data) {
        this.mPropositionsData = data;
        if (isStarted()) {
            super.deliverResult(data);
        }
    }

    @Override
    protected void onStartLoading () {
        if (this.mPropositionsData != null) {
            this.deliverResult(this.mPropositionsData);
        }
        if (takeContentChanged() || (this.mPropositionsData == null)) {
            forceLoad();
        }
    }

}
