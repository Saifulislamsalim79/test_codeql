package p272h.p286c.p287a.p288a.p289i;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p272h.p286c.p287a.p288a.p289i.C8326c;
/* compiled from: EventInternal.java */
/* renamed from: h.c.a.a.i.j */
/* loaded from: classes2.dex */
public abstract class AbstractC8342j {

    /* compiled from: EventInternal.java */
    /* renamed from: h.c.a.a.i.j$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC8343a {
        /* renamed from: a */
        public final AbstractC8343a m16273a(String str, int i) {
            mo16269e().put(str, String.valueOf(i));
            return this;
        }

        /* renamed from: b */
        public final AbstractC8343a m16272b(String str, long j) {
            mo16269e().put(str, String.valueOf(j));
            return this;
        }

        /* renamed from: c */
        public final AbstractC8343a m16271c(String str, String str2) {
            mo16269e().put(str, str2);
            return this;
        }

        /* renamed from: d */
        public abstract AbstractC8342j mo16270d();

        /* renamed from: e */
        protected abstract Map<String, String> mo16269e();

        /* renamed from: f */
        protected abstract AbstractC8343a mo16268f(Map<String, String> map);

        /* renamed from: g */
        public abstract AbstractC8343a mo16267g(Integer num);

        /* renamed from: h */
        public abstract AbstractC8343a mo16266h(C8341i c8341i);

        /* renamed from: i */
        public abstract AbstractC8343a mo16265i(long j);

        /* renamed from: j */
        public abstract AbstractC8343a mo16264j(String str);

        /* renamed from: k */
        public abstract AbstractC8343a mo16263k(long j);
    }

    /* renamed from: a */
    public static AbstractC8343a m16285a() {
        C8326c.C8328b c8328b = new C8326c.C8328b();
        c8328b.mo16268f(new HashMap());
        return c8328b;
    }

    /* renamed from: b */
    public final String m16284b(String str) {
        String str2 = mo16283c().get(str);
        return str2 == null ? "" : str2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Map<String, String> mo16283c();

    /* renamed from: d */
    public abstract Integer mo16282d();

    /* renamed from: e */
    public abstract C8341i mo16281e();

    /* renamed from: f */
    public abstract long mo16280f();

    /* renamed from: g */
    public final int m16279g(String str) {
        String str2 = mo16283c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* renamed from: h */
    public final long m16278h(String str) {
        String str2 = mo16283c().get(str);
        if (str2 == null) {
            return 0L;
        }
        return Long.valueOf(str2).longValue();
    }

    /* renamed from: i */
    public final Map<String, String> m16277i() {
        return Collections.unmodifiableMap(mo16283c());
    }

    /* renamed from: j */
    public abstract String mo16276j();

    /* renamed from: k */
    public abstract long mo16275k();

    /* renamed from: l */
    public AbstractC8343a m16274l() {
        C8326c.C8328b c8328b = new C8326c.C8328b();
        c8328b.mo16264j(mo16276j());
        c8328b.mo16267g(mo16282d());
        c8328b.mo16266h(mo16281e());
        c8328b.mo16265i(mo16280f());
        c8328b.mo16263k(mo16275k());
        c8328b.mo16268f(new HashMap(mo16283c()));
        return c8328b;
    }
}
