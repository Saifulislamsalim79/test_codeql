package p272h.p286c.p287a.p288a.p289i;

import android.util.Base64;
import p272h.p286c.p287a.p288a.EnumC8238d;
import p272h.p286c.p287a.p288a.p289i.C8333e;
/* compiled from: TransportContext.java */
/* renamed from: h.c.a.a.i.p */
/* loaded from: classes2.dex */
public abstract class AbstractC8352p {

    /* compiled from: TransportContext.java */
    /* renamed from: h.c.a.a.i.p$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC8353a {
        /* renamed from: a */
        public abstract AbstractC8352p mo16236a();

        /* renamed from: b */
        public abstract AbstractC8353a mo16235b(String str);

        /* renamed from: c */
        public abstract AbstractC8353a mo16234c(byte[] bArr);

        /* renamed from: d */
        public abstract AbstractC8353a mo16233d(EnumC8238d enumC8238d);
    }

    /* renamed from: a */
    public static AbstractC8353a m16242a() {
        C8333e.C8335b c8335b = new C8333e.C8335b();
        c8335b.mo16233d(EnumC8238d.DEFAULT);
        return c8335b;
    }

    /* renamed from: b */
    public abstract String mo16241b();

    /* renamed from: c */
    public abstract byte[] mo16240c();

    /* renamed from: d */
    public abstract EnumC8238d mo16239d();

    /* renamed from: e */
    public boolean m16238e() {
        return mo16240c() != null;
    }

    /* renamed from: f */
    public AbstractC8352p m16237f(EnumC8238d enumC8238d) {
        AbstractC8353a m16242a = m16242a();
        m16242a.mo16235b(mo16241b());
        m16242a.mo16233d(enumC8238d);
        m16242a.mo16234c(mo16240c());
        return m16242a.mo16236a();
    }

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = mo16241b();
        objArr[1] = mo16239d();
        objArr[2] = mo16240c() == null ? "" : Base64.encodeToString(mo16240c(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
