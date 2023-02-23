package io.intercom.com.google.gson.p418t.p419n;

import io.intercom.com.google.gson.AbstractC10936q;
import io.intercom.com.google.gson.C10916e;
import io.intercom.com.google.gson.InterfaceC10938r;
import io.intercom.com.google.gson.JsonSyntaxException;
import io.intercom.com.google.gson.p422u.C11058a;
import io.intercom.com.google.gson.stream.C10939a;
import io.intercom.com.google.gson.stream.C10942c;
import io.intercom.com.google.gson.stream.EnumC10941b;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
/* compiled from: SqlDateTypeAdapter.java */
/* renamed from: io.intercom.com.google.gson.t.n.j */
/* loaded from: classes3.dex */
public final class C11007j extends AbstractC10936q<Date> {

    /* renamed from: b */
    public static final InterfaceC10938r f25047b = new C11008a();

    /* renamed from: a */
    private final DateFormat f25048a = new SimpleDateFormat("MMM d, yyyy");

    /* compiled from: SqlDateTypeAdapter.java */
    /* renamed from: io.intercom.com.google.gson.t.n.j$a */
    /* loaded from: classes3.dex */
    static class C11008a implements InterfaceC10938r {
        C11008a() {
        }

        @Override // io.intercom.com.google.gson.InterfaceC10938r
        /* renamed from: a */
        public <T> AbstractC10936q<T> mo11671a(C10916e c10916e, C11058a<T> c11058a) {
            if (c11058a.m11659c() == Date.class) {
                return new C11007j();
            }
            return null;
        }
    }

    @Override // io.intercom.com.google.gson.AbstractC10936q
    /* renamed from: e */
    public synchronized Date mo11675b(C10939a c10939a) throws IOException {
        if (c10939a.mo11789C0() == EnumC10941b.NULL) {
            c10939a.mo11771w0();
            return null;
        }
        try {
            return new Date(this.f25048a.parse(c10939a.mo11770z0()).getTime());
        } catch (ParseException e) {
            throw new JsonSyntaxException(e);
        }
    }

    @Override // io.intercom.com.google.gson.AbstractC10936q
    /* renamed from: f */
    public synchronized void mo11674d(C10942c c10942c, Date date) throws IOException {
        c10942c.mo11765F0(date == null ? null : this.f25048a.format((java.util.Date) date));
    }
}
