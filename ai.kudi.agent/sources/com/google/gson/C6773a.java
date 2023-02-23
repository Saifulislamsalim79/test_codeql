package com.google.gson;

import com.google.gson.internal.C6873d;
import com.google.gson.internal.C6885i;
import com.google.gson.internal.bind.p182d.C6857a;
import com.google.gson.stream.C6911a;
import com.google.gson.stream.C6914c;
import com.google.gson.stream.EnumC6913b;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
/* compiled from: DefaultDateTypeAdapter.java */
/* renamed from: com.google.gson.a */
/* loaded from: classes2.dex */
final class C6773a extends AbstractC6909s<Date> {

    /* renamed from: a */
    private final Class<? extends Date> f16308a;

    /* renamed from: b */
    private final List<DateFormat> f16309b = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6773a(Class<? extends Date> cls, String str) {
        m20780g(cls);
        this.f16308a = cls;
        this.f16309b.add(new SimpleDateFormat(str, Locale.US));
        if (Locale.getDefault().equals(Locale.US)) {
            return;
        }
        this.f16309b.add(new SimpleDateFormat(str));
    }

    /* renamed from: e */
    private Date m20782e(String str) {
        synchronized (this.f16309b) {
            for (DateFormat dateFormat : this.f16309b) {
                try {
                    return dateFormat.parse(str);
                } catch (ParseException unused) {
                }
            }
            try {
                return C6857a.m20595c(str, new ParsePosition(0));
            } catch (ParseException e) {
                throw new JsonSyntaxException(str, e);
            }
        }
    }

    /* renamed from: g */
    private static Class<? extends Date> m20780g(Class<? extends Date> cls) {
        if (cls == Date.class || cls == java.sql.Date.class || cls == Timestamp.class) {
            return cls;
        }
        throw new IllegalArgumentException("Date type must be one of " + Date.class + ", " + Timestamp.class + ", or " + java.sql.Date.class + " but was " + cls);
    }

    @Override // com.google.gson.AbstractC6909s
    /* renamed from: f */
    public Date mo20528b(C6911a c6911a) throws IOException {
        if (c6911a.mo20525C0() == EnumC6913b.NULL) {
            c6911a.mo20495w0();
            return null;
        }
        Date m20782e = m20782e(c6911a.mo20493z0());
        Class<? extends Date> cls = this.f16308a;
        if (cls == Date.class) {
            return m20782e;
        }
        if (cls == Timestamp.class) {
            return new Timestamp(m20782e.getTime());
        }
        if (cls == java.sql.Date.class) {
            return new java.sql.Date(m20782e.getTime());
        }
        throw new AssertionError();
    }

    @Override // com.google.gson.AbstractC6909s
    /* renamed from: h */
    public void mo20527d(C6914c c6914c, Date date) throws IOException {
        if (date == null) {
            c6914c.mo20474f0();
            return;
        }
        synchronized (this.f16309b) {
            c6914c.mo20486F0(this.f16309b.get(0).format(date));
        }
    }

    public String toString() {
        DateFormat dateFormat = this.f16309b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    public C6773a(Class<? extends Date> cls, int i, int i2) {
        m20780g(cls);
        this.f16308a = cls;
        this.f16309b.add(DateFormat.getDateTimeInstance(i, i2, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            this.f16309b.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (C6873d.m20585e()) {
            this.f16309b.add(C6885i.m20565c(i, i2));
        }
    }
}
