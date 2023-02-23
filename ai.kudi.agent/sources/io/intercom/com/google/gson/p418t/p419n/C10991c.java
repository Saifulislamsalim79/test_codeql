package io.intercom.com.google.gson.p418t.p419n;

import io.intercom.com.google.gson.AbstractC10936q;
import io.intercom.com.google.gson.C10916e;
import io.intercom.com.google.gson.InterfaceC10938r;
import io.intercom.com.google.gson.JsonSyntaxException;
import io.intercom.com.google.gson.p418t.C10965e;
import io.intercom.com.google.gson.p418t.C10977j;
import io.intercom.com.google.gson.p418t.p419n.p420o.C11054a;
import io.intercom.com.google.gson.p422u.C11058a;
import io.intercom.com.google.gson.stream.C10939a;
import io.intercom.com.google.gson.stream.C10942c;
import io.intercom.com.google.gson.stream.EnumC10941b;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
/* compiled from: DateTypeAdapter.java */
/* renamed from: io.intercom.com.google.gson.t.n.c */
/* loaded from: classes3.dex */
public final class C10991c extends AbstractC10936q<Date> {

    /* renamed from: b */
    public static final InterfaceC10938r f25009b = new C10992a();

    /* renamed from: a */
    private final List<DateFormat> f25010a;

    /* compiled from: DateTypeAdapter.java */
    /* renamed from: io.intercom.com.google.gson.t.n.c$a */
    /* loaded from: classes3.dex */
    static class C10992a implements InterfaceC10938r {
        C10992a() {
        }

        @Override // io.intercom.com.google.gson.InterfaceC10938r
        /* renamed from: a */
        public <T> AbstractC10936q<T> mo11671a(C10916e c10916e, C11058a<T> c11058a) {
            if (c11058a.m11659c() == Date.class) {
                return new C10991c();
            }
            return null;
        }
    }

    public C10991c() {
        ArrayList arrayList = new ArrayList();
        this.f25010a = arrayList;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            this.f25010a.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (C10965e.m11826e()) {
            this.f25010a.add(C10977j.m11805c(2, 2));
        }
    }

    /* renamed from: e */
    private synchronized Date m11793e(String str) {
        for (DateFormat dateFormat : this.f25010a) {
            try {
                return dateFormat.parse(str);
            } catch (ParseException unused) {
            }
        }
        try {
            return C11054a.m11668c(str, new ParsePosition(0));
        } catch (ParseException e) {
            throw new JsonSyntaxException(str, e);
        }
    }

    @Override // io.intercom.com.google.gson.AbstractC10936q
    /* renamed from: f */
    public Date mo11675b(C10939a c10939a) throws IOException {
        if (c10939a.mo11789C0() == EnumC10941b.NULL) {
            c10939a.mo11771w0();
            return null;
        }
        return m11793e(c10939a.mo11770z0());
    }

    @Override // io.intercom.com.google.gson.AbstractC10936q
    /* renamed from: g */
    public synchronized void mo11674d(C10942c c10942c, Date date) throws IOException {
        if (date == null) {
            c10942c.mo11757f0();
        } else {
            c10942c.mo11765F0(this.f25010a.get(0).format(date));
        }
    }
}
