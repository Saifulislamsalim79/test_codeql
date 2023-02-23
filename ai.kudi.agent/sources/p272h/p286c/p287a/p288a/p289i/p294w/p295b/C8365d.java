package p272h.p286c.p287a.p288a.p289i.p294w.p295b;
/* compiled from: Preconditions.java */
/* renamed from: h.c.a.a.i.w.b.d */
/* loaded from: classes2.dex */
public final class C8365d {
    /* renamed from: a */
    public static <T> void m16210a(T t, Class<T> cls) {
        if (t != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    /* renamed from: b */
    public static <T> T m16209b(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    /* renamed from: c */
    public static <T> T m16208c(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }
}
