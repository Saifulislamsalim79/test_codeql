package io.intercom.com.google.gson.p418t;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
/* compiled from: PreJava9DateFormatProvider.java */
/* renamed from: io.intercom.com.google.gson.t.j */
/* loaded from: classes3.dex */
public class C10977j {
    /* renamed from: a */
    private static String m11807a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return "M/d/yy";
                    }
                    throw new IllegalArgumentException("Unknown DateFormat style: " + i);
                }
                return "MMM d, yyyy";
            }
            return "MMMM d, yyyy";
        }
        return "EEEE, MMMM d, yyyy";
    }

    /* renamed from: b */
    private static String m11806b(int i) {
        if (i == 0 || i == 1) {
            return "h:mm:ss a z";
        }
        if (i != 2) {
            if (i == 3) {
                return "h:mm a";
            }
            throw new IllegalArgumentException("Unknown DateFormat style: " + i);
        }
        return "h:mm:ss a";
    }

    /* renamed from: c */
    public static DateFormat m11805c(int i, int i2) {
        return new SimpleDateFormat(m11807a(i) + " " + m11806b(i2), Locale.US);
    }
}
