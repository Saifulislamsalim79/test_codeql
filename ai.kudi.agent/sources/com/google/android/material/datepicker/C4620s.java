package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: UtcDates.java */
/* renamed from: com.google.android.material.datepicker.s */
/* loaded from: classes2.dex */
class C4620s {

    /* renamed from: a */
    static AtomicReference<C4619r> f11501a = new AtomicReference<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static long m27023a(long j) {
        Calendar m27013k = m27013k();
        m27013k.setTimeInMillis(j);
        return m27020d(m27013k).getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static DateFormat m27022b(Locale locale) {
        return m27021c("MMMEd", locale);
    }

    /* renamed from: c */
    private static DateFormat m27021c(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(m27014j());
        return instanceForSkeleton;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static Calendar m27020d(Calendar calendar) {
        Calendar m27012l = m27012l(calendar);
        Calendar m27013k = m27013k();
        m27013k.set(m27012l.get(1), m27012l.get(2), m27012l.get(5));
        return m27013k;
    }

    /* renamed from: e */
    private static java.text.DateFormat m27019e(int i, Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i, locale);
        dateInstance.setTimeZone(m27016h());
        return dateInstance;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static java.text.DateFormat m27018f(Locale locale) {
        return m27019e(0, locale);
    }

    /* renamed from: g */
    static C4619r m27017g() {
        C4619r c4619r = f11501a.get();
        return c4619r == null ? C4619r.m27024c() : c4619r;
    }

    /* renamed from: h */
    private static TimeZone m27016h() {
        return TimeZone.getTimeZone("UTC");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static Calendar m27015i() {
        Calendar m27026a = m27017g().m27026a();
        m27026a.set(11, 0);
        m27026a.set(12, 0);
        m27026a.set(13, 0);
        m27026a.set(14, 0);
        m27026a.setTimeZone(m27016h());
        return m27026a;
    }

    /* renamed from: j */
    private static android.icu.util.TimeZone m27014j() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static Calendar m27013k() {
        return m27012l(null);
    }

    /* renamed from: l */
    static Calendar m27012l(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(m27016h());
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static DateFormat m27011m(Locale locale) {
        return m27021c("yMMMEd", locale);
    }
}
