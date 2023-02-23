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
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/* compiled from: TimeTypeAdapter.java */
/* renamed from: io.intercom.com.google.gson.t.n.k */
/* loaded from: classes3.dex */
public final class C11009k extends AbstractC10936q<Time> {

    /* renamed from: b */
    public static final InterfaceC10938r f25049b = new C11010a();

    /* renamed from: a */
    private final DateFormat f25050a = new SimpleDateFormat("hh:mm:ss a");

    /* compiled from: TimeTypeAdapter.java */
    /* renamed from: io.intercom.com.google.gson.t.n.k$a */
    /* loaded from: classes3.dex */
    static class C11010a implements InterfaceC10938r {
        C11010a() {
        }

        @Override // io.intercom.com.google.gson.InterfaceC10938r
        /* renamed from: a */
        public <T> AbstractC10936q<T> mo11671a(C10916e c10916e, C11058a<T> c11058a) {
            if (c11058a.m11659c() == Time.class) {
                return new C11009k();
            }
            return null;
        }
    }

    @Override // io.intercom.com.google.gson.AbstractC10936q
    /* renamed from: e */
    public synchronized Time mo11675b(C10939a c10939a) throws IOException {
        if (c10939a.mo11789C0() == EnumC10941b.NULL) {
            c10939a.mo11771w0();
            return null;
        }
        try {
            return new Time(this.f25050a.parse(c10939a.mo11770z0()).getTime());
        } catch (ParseException e) {
            throw new JsonSyntaxException(e);
        }
    }

    @Override // io.intercom.com.google.gson.AbstractC10936q
    /* renamed from: f */
    public synchronized void mo11674d(C10942c c10942c, Time time) throws IOException {
        c10942c.mo11765F0(time == null ? null : this.f25050a.format((Date) time));
    }
}
