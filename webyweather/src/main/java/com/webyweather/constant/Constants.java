package com.webyweather.constant;

/**
 * Project android
 *
 * @autor tair_mustafaiev
 * Date: 5/17/13
 * Time: 4:29 PM
 */
public class Constants {

    public static final String WEBYWEATHER_SERVICE_URL = "http://service.webyweather.com";

    public static final String WEBYWEATHER_SERVICE_URL_TEMPLATE = "http://service.webyweather.com/propositions/fetch/%s/%s/%s.json";

    public static final String LONGITUDE = "longitude";

    public static final String LATITUDE = "latitude";

    public static final String LONGLAT = "longlat";

    public static final String LOCALITY = "locality";

    /**
     * Default lifespan (7 days) of a reservation until it is considered expired.
     */
    public static final long REGISTRATION_EXPIRY_TIME_MS = 1000 * 3600 * 24 * 7;

    public static final String EXTRA_MESSAGE = "message";

    public static final String PROPERTY_REG_ID = "registration_id";

    /**
     * Substitute you own sender ID here.
     */
    public static final String SENDER_ID = "1016214118881";

    public static final String PROPERTY_APP_VERSION = "appVersion";

    public static final String PROPERTY_ON_SERVER_EXPIRATION_TIME = "onServerExpirationTimeMs";


}
