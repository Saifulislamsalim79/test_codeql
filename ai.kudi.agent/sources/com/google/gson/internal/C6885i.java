package com.google.gson.internal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
/* compiled from: PreJava9DateFormatProvider.java */
/* renamed from: com.google.gson.internal.i */
/* loaded from: classes2.dex */
public class C6885i {
    /* renamed from: a */
    private static String m20567a(int i) {
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
    private static String m20566b(int i) {
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
    public static DateFormat m20565c(int i, int i2) {
        return new SimpleDateFormat(m20567a(i) + " " + m20566b(i2), Locale.US);
    }
}
