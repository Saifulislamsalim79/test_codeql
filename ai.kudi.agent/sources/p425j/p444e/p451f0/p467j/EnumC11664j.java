package p425j.p444e.p451f0.p467j;

import j.e.c0.c;
import java.io.Serializable;
import p425j.p444e.InterfaceC11695u;
import p425j.p444e.p451f0.p453b.C11312b;
/* compiled from: NotificationLite.java */
/* renamed from: j.e.f0.j.j */
/* loaded from: classes3.dex */
public enum EnumC11664j {
    COMPLETE;

    /* compiled from: NotificationLite.java */
    /* renamed from: j.e.f0.j.j$a */
    /* loaded from: classes3.dex */
    static final class C11665a implements Serializable {

        /* renamed from: c */
        final c f26355c;

        C11665a(c cVar) {
            this.f26355c = cVar;
        }

        public String toString() {
            return "NotificationLite.Disposable[" + this.f26355c + "]";
        }
    }

    /* compiled from: NotificationLite.java */
    /* renamed from: j.e.f0.j.j$b */
    /* loaded from: classes3.dex */
    static final class C11666b implements Serializable {

        /* renamed from: c */
        final Throwable f26356c;

        C11666b(Throwable th) {
            this.f26356c = th;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C11666b) {
                return C11312b.m11114c(this.f26356c, ((C11666b) obj).f26356c);
            }
            return false;
        }

        public int hashCode() {
            return this.f26356c.hashCode();
        }

        public String toString() {
            return "NotificationLite.Error[" + this.f26356c + "]";
        }
    }

    /* renamed from: a */
    public static <T> boolean m10639a(Object obj, InterfaceC11695u<? super T> interfaceC11695u) {
        if (obj == COMPLETE) {
            interfaceC11695u.mo335a();
            return true;
        } else if (obj instanceof C11666b) {
            interfaceC11695u.mo334b(((C11666b) obj).f26356c);
            return true;
        } else {
            interfaceC11695u.mo331f(obj);
            return false;
        }
    }

    /* renamed from: b */
    public static <T> boolean m10638b(Object obj, InterfaceC11695u<? super T> interfaceC11695u) {
        if (obj == COMPLETE) {
            interfaceC11695u.mo335a();
            return true;
        } else if (obj instanceof C11666b) {
            interfaceC11695u.mo334b(((C11666b) obj).f26356c);
            return true;
        } else if (obj instanceof C11665a) {
            interfaceC11695u.mo332d(((C11665a) obj).f26355c);
            return false;
        } else {
            interfaceC11695u.mo331f(obj);
            return false;
        }
    }

    /* renamed from: e */
    public static Object m10637e() {
        return COMPLETE;
    }

    /* renamed from: g */
    public static Object m10636g(c cVar) {
        return new C11665a(cVar);
    }

    /* renamed from: h */
    public static Object m10635h(Throwable th) {
        return new C11666b(th);
    }

    /* renamed from: i */
    public static Throwable m10634i(Object obj) {
        return ((C11666b) obj).f26356c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: j */
    public static <T> T m10633j(Object obj) {
        return obj;
    }

    /* renamed from: m */
    public static boolean m10632m(Object obj) {
        return obj == COMPLETE;
    }

    /* renamed from: n */
    public static boolean m10631n(Object obj) {
        return obj instanceof C11666b;
    }

    /* renamed from: p */
    public static <T> Object m10630p(T t) {
        return t;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "NotificationLite.Complete";
    }
}
