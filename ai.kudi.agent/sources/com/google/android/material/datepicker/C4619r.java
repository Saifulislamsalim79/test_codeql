package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;
/* compiled from: TimeSource.java */
/* renamed from: com.google.android.material.datepicker.r */
/* loaded from: classes2.dex */
class C4619r {

    /* renamed from: c */
    private static final C4619r f11498c = new C4619r(null, null);

    /* renamed from: a */
    private final Long f11499a;

    /* renamed from: b */
    private final TimeZone f11500b;

    private C4619r(Long l, TimeZone timeZone) {
        this.f11499a = l;
        this.f11500b = timeZone;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static C4619r m27024c() {
        return f11498c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public Calendar m27026a() {
        return m27025b(this.f11500b);
    }

    /* renamed from: b */
    Calendar m27025b(TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l = this.f11499a;
        if (l != null) {
            calendar.setTimeInMillis(l.longValue());
        }
        return calendar;
    }
}
