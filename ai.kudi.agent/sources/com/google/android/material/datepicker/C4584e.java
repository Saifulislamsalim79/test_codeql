package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Build;
import android.text.format.DateUtils;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
/* compiled from: DateStrings.java */
/* renamed from: com.google.android.material.datepicker.e */
/* loaded from: classes2.dex */
class C4584e {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m27119a(long j) {
        return m27118b(j, Locale.getDefault());
    }

    /* renamed from: b */
    static String m27118b(long j, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C4620s.m27022b(locale).format(new Date(j));
        }
        return C4620s.m27018f(locale).format(new Date(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static String m27117c(Context context, long j) {
        return DateUtils.formatDateTime(context, j - TimeZone.getDefault().getOffset(j), 36);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static String m27116d(long j) {
        return m27115e(j, Locale.getDefault());
    }

    /* renamed from: e */
    static String m27115e(long j, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C4620s.m27011m(locale).format(new Date(j));
        }
        return C4620s.m27018f(locale).format(new Date(j));
    }
}
