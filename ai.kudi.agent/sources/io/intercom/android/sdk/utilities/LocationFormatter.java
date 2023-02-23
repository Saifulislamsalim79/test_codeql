package io.intercom.android.sdk.utilities;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import android.content.Context;
import android.view.View;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.commons.utilities.TimeProvider;
import io.intercom.android.sdk.models.Location;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
/* loaded from: classes3.dex */
public class LocationFormatter {
    private static final String[] UPPER_CASE_EN_US_AM_PM = {"AM", "PM"};
    private static final String[] UPPER_CASE_EN_GB_AM_PM = {"a.m.", "p.m."};
    private static final String[] LOWER_CASE_ENGLISH_AM_PM = {"am", "pm"};
    private static final long ONE_MINUTE_IN_MILLIS = TimeUnit.MINUTES.toMillis(1);

    public static CharSequence getLocationString(Context context, Location location, Date date) {
        if (location.getTimezoneOffset() == null) {
            return "";
        }
        Locale locale = context.getResources().getConfiguration().locale;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("h:mma", locale);
        TimeZone timeZone = TimeZone.getDefault();
        timeZone.setRawOffset((int) TimeUnit.SECONDS.toMillis(location.getTimezoneOffset().intValue()));
        simpleDateFormat.setTimeZone(timeZone);
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols(locale);
        if (Arrays.equals(dateFormatSymbols.getAmPmStrings(), UPPER_CASE_EN_GB_AM_PM) || Arrays.equals(dateFormatSymbols.getAmPmStrings(), UPPER_CASE_EN_US_AM_PM)) {
            dateFormatSymbols.setAmPmStrings(LOWER_CASE_ENGLISH_AM_PM);
        }
        simpleDateFormat.setDateFormatSymbols(dateFormatSymbols);
        Phrase put = Phrase.from(context, C10110R.string.intercom_profile_location).put(TransactionField.TIME, simpleDateFormat.format(date));
        return put.put("location", location.getCityName() + ", " + location.getCountryName()).format();
    }

    public static void postOnNextMinute(View view, Runnable runnable, TimeProvider timeProvider) {
        long currentTimeMillis = timeProvider.currentTimeMillis();
        long j = ONE_MINUTE_IN_MILLIS;
        view.postDelayed(runnable, j - (currentTimeMillis % j));
    }
}
