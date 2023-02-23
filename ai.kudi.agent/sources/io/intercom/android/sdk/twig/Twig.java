package io.intercom.android.sdk.twig;

import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* loaded from: classes3.dex */
public class Twig {
    public static final int DISABLED = 8;
    private static final int MAX_LOG_LENGTH = 4000;
    private final boolean internalLoggingEnabled;
    private int logLevel;
    private final String tag;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface LogLevel {
    }

    public Twig(int i, String str, boolean z) {
        this.logLevel = i;
        this.tag = str == null ? "Twig" : str;
        this.internalLoggingEnabled = z;
    }

    private String getStackTraceString(Throwable th) {
        StringWriter stringWriter = new StringWriter(256);
        PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
        th.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }

    private void prepareLog(int i, Throwable th, String str, Object... objArr) {
        String str2;
        if (i < this.logLevel) {
            return;
        }
        String tag = getTag();
        if (str != null && str.length() == 0) {
            str = null;
        }
        if (str != null) {
            if (objArr.length > 0) {
                str = String.format(str, objArr);
            }
            if (th != null) {
                str2 = str + "\n" + getStackTraceString(th);
            } else {
                str2 = str;
            }
        } else if (th == null) {
            return;
        } else {
            str2 = getStackTraceString(th);
        }
        log(i, tag, str2);
    }

    private void printLog(int i, String str, String str2) {
        if (i == 7) {
            Log.wtf(str, str2);
        } else {
            Log.println(i, str, str2);
        }
    }

    /* renamed from: d */
    public void m13071d(String str, Object... objArr) {
        prepareLog(3, null, str, objArr);
    }

    /* renamed from: e */
    public void m13068e(String str, Object... objArr) {
        prepareLog(6, null, str, objArr);
    }

    int getLogLevel() {
        return this.logLevel;
    }

    public String getTag() {
        return this.tag;
    }

    /* renamed from: i */
    public void m13065i(String str, Object... objArr) {
        prepareLog(4, null, str, objArr);
    }

    public void internal(String str) {
        internal(this.tag, str);
    }

    void log(int i, String str, Object... objArr) {
        prepareLog(i, null, str, objArr);
    }

    public void setLogLevel(int i) {
        this.logLevel = i;
    }

    /* renamed from: v */
    public void m13062v(String str, Object... objArr) {
        prepareLog(2, null, str, objArr);
    }

    /* renamed from: w */
    public void m13059w(String str, Object... objArr) {
        prepareLog(5, null, str, objArr);
    }

    public void wtf(String str, Object... objArr) {
        prepareLog(7, null, str, objArr);
    }

    private void log(int i, String str, String str2) {
        int min;
        if (str2.length() < MAX_LOG_LENGTH) {
            printLog(i, str, str2);
            return;
        }
        int i2 = 0;
        int length = str2.length();
        while (i2 < length) {
            int indexOf = str2.indexOf(10, i2);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i2 + MAX_LOG_LENGTH);
                printLog(i, str, str2.substring(i2, min));
                if (min >= indexOf) {
                    break;
                }
                i2 = min;
            }
            i2 = min + 1;
        }
    }

    /* renamed from: d */
    public void m13069d(Throwable th, String str, Object... objArr) {
        prepareLog(3, th, str, objArr);
    }

    /* renamed from: e */
    public void m13066e(Throwable th, String str, Object... objArr) {
        prepareLog(6, th, str, objArr);
    }

    /* renamed from: i */
    public void m13063i(Throwable th, String str, Object... objArr) {
        prepareLog(4, th, str, objArr);
    }

    public void internal(String str, String str2) {
        if (this.internalLoggingEnabled) {
            Log.d(str, "INTERNAL: " + str2);
        }
    }

    /* renamed from: v */
    public void m13060v(Throwable th, String str, Object... objArr) {
        prepareLog(2, th, str, objArr);
    }

    /* renamed from: w */
    public void m13057w(Throwable th, String str, Object... objArr) {
        prepareLog(5, th, str, objArr);
    }

    public void wtf(Throwable th, String str, Object... objArr) {
        prepareLog(7, th, str, objArr);
    }

    /* renamed from: d */
    public void m13070d(Throwable th) {
        prepareLog(3, th, null, new Object[0]);
    }

    /* renamed from: e */
    public void m13067e(Throwable th) {
        prepareLog(6, th, null, new Object[0]);
    }

    /* renamed from: i */
    public void m13064i(Throwable th) {
        prepareLog(4, th, null, new Object[0]);
    }

    /* renamed from: v */
    public void m13061v(Throwable th) {
        prepareLog(2, th, null, new Object[0]);
    }

    /* renamed from: w */
    public void m13058w(Throwable th) {
        prepareLog(5, th, null, new Object[0]);
    }

    public void wtf(Throwable th) {
        prepareLog(7, th, null, new Object[0]);
    }
}
