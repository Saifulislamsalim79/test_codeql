package io.intercom.android.sdk.utilities;

import android.content.Context;
import android.os.Build;
import android.text.format.DateFormat;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.commons.utilities.TimeProvider;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.models.LastParticipatingAdmin;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
/* loaded from: classes3.dex */
public class TimeFormatter {
    private SimpleDateFormat absoluteDateFormatter;
    private SimpleDateFormat absoluteTimeFormatter;
    private final Context context;
    private final TimeProvider timeProvider;

    public TimeFormatter(Context context, TimeProvider timeProvider) {
        this.context = context;
        this.timeProvider = timeProvider;
    }

    private static SimpleDateFormat createDateFormatter(Locale locale, String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new SimpleDateFormat(DateFormat.getBestDateTimePattern(locale, str), locale);
        }
        return new SimpleDateFormat(str, locale);
    }

    public static String formatTimeInMillisAsDate(long j) {
        return new SimpleDateFormat("MMM dd, yyyy", Locale.getDefault()).format(new Date(j));
    }

    private Date getDateFromTimeStamp(long j) {
        return new Date(j * 1000);
    }

    private long getDifferenceInDays(Date date) {
        return TimeUnit.MILLISECONDS.toDays(this.timeProvider.currentTimeMillis() - date.getTime());
    }

    private long getDifferenceInHours(Date date) {
        return TimeUnit.MILLISECONDS.toHours(this.timeProvider.currentTimeMillis() - date.getTime());
    }

    private long getDifferenceInMinutes(Date date) {
        return TimeUnit.MILLISECONDS.toMinutes(this.timeProvider.currentTimeMillis() - date.getTime());
    }

    public String getAbsoluteDate(long j) {
        return getAbsoluteDate(j * 1000, this.context.getResources().getConfiguration().locale);
    }

    public String getAbsoluteTime(long j) {
        return getAbsoluteTime(j * 1000, this.context.getResources().getConfiguration().locale);
    }

    public CharSequence getAdminActiveStatus(LastParticipatingAdmin lastParticipatingAdmin, Provider<AppConfig> provider) {
        if (!shouldShowActiveOrAwayState(provider.get().getLocale())) {
            return lastParticipatingAdmin.getLastActiveAt() <= 0 ? "" : getAdminActiveStatus(getDateFromTimeStamp(lastParticipatingAdmin.getLastActiveAt()));
        } else if (lastParticipatingAdmin.isActive()) {
            return this.context.getString(C10110R.string.intercom_active_state);
        } else {
            return this.context.getString(C10110R.string.intercom_away_state);
        }
    }

    public CharSequence getFormattedTime(long j) {
        return j <= 0 ? "" : getFormattedTime(new Date(j * 1000));
    }

    public String getLastActiveMinutes(long j) {
        Date date = new Date(j * 1000);
        return getDifferenceInMinutes(date) + " minutes";
    }

    public CharSequence getUpdated(long j) {
        Date dateFromTimeStamp = getDateFromTimeStamp(j);
        long differenceInMinutes = getDifferenceInMinutes(dateFromTimeStamp);
        long differenceInHours = getDifferenceInHours(dateFromTimeStamp);
        long differenceInDays = getDifferenceInDays(dateFromTimeStamp);
        long j2 = differenceInDays / 7;
        if (j2 > 0) {
            return "Updated " + j2 + " weeks ago";
        } else if (differenceInDays > 0) {
            return "Updated " + differenceInDays + " days ago";
        } else if (differenceInHours > 0) {
            return "Updated " + differenceInHours + " hours ago";
        } else if (differenceInMinutes >= 1) {
            return "Updated " + differenceInMinutes + " minutes ago";
        } else {
            return this.context.getText(C10110R.string.intercom_time_just_now);
        }
    }

    boolean shouldShowActiveOrAwayState(String str) {
        return str.equals("en");
    }

    String getAbsoluteDate(long j, Locale locale) {
        if (this.absoluteDateFormatter == null) {
            this.absoluteDateFormatter = createDateFormatter(locale, "MMMM d");
        }
        return this.absoluteDateFormatter.format(new Date(j));
    }

    String getAbsoluteTime(long j, Locale locale) {
        if (this.absoluteTimeFormatter == null) {
            this.absoluteTimeFormatter = createDateFormatter(locale, "hh:mm");
        }
        return this.absoluteTimeFormatter.format(new Date(j));
    }

    private CharSequence getFormattedTime(Date date) {
        Phrase put;
        long differenceInMinutes = getDifferenceInMinutes(date);
        long differenceInHours = getDifferenceInHours(date);
        long differenceInDays = getDifferenceInDays(date);
        long j = differenceInDays / 7;
        if (j > 0) {
            put = Phrase.from(this.context, C10110R.string.intercom_time_week_ago).put("delta", Long.toString(j));
        } else if (differenceInDays > 0) {
            put = Phrase.from(this.context, C10110R.string.intercom_time_day_ago).put("delta", Long.toString(differenceInDays));
        } else if (differenceInHours > 0) {
            put = Phrase.from(this.context, C10110R.string.intercom_time_hour_ago).put("delta", Long.toString(differenceInHours));
        } else if (differenceInMinutes >= 1) {
            put = Phrase.from(this.context, C10110R.string.intercom_time_minute_ago).put("delta", Long.toString(differenceInMinutes));
        } else {
            return this.context.getText(C10110R.string.intercom_time_just_now);
        }
        return put.format();
    }

    private CharSequence getAdminActiveStatus(Date date) {
        Phrase put;
        long differenceInMinutes = getDifferenceInMinutes(date);
        if (differenceInMinutes > TimeUnit.DAYS.toMinutes(6L)) {
            return this.context.getText(C10110R.string.intercom_active_week_ago);
        }
        if (differenceInMinutes >= TimeUnit.HOURS.toMinutes(23L) + 31) {
            put = Phrase.from(this.context, C10110R.string.intercom_active_day_ago).put("days", Long.toString((((differenceInMinutes / 60) - 13) / 24) + 1));
        } else if (differenceInMinutes >= 53) {
            put = Phrase.from(this.context, C10110R.string.intercom_active_hour_ago).put("hours", Long.toString(((differenceInMinutes - 31) / 60) + 1));
        } else if (differenceInMinutes >= 38) {
            put = Phrase.from(this.context, C10110R.string.intercom_active_minute_ago).put("minutes", Long.toString(45L));
        } else if (differenceInMinutes >= 16) {
            put = Phrase.from(this.context, C10110R.string.intercom_active_minute_ago).put("minutes", Long.toString(30L));
        } else {
            put = Phrase.from(this.context, C10110R.string.intercom_active_15m_ago).put("minutes", Long.toString(15L));
        }
        return put.format();
    }
}
