package kotlin;

import java.io.Serializable;
/* compiled from: Result.kt */
/* renamed from: kotlin.p */
/* loaded from: classes3.dex */
public final class C13288p<T> implements Serializable {

    /* renamed from: c */
    public static final C13289a f29444c = new C13289a(null);

    /* compiled from: Result.kt */
    /* renamed from: kotlin.p$a */
    /* loaded from: classes3.dex */
    public static final class C13289a {
        private C13289a() {
        }

        public /* synthetic */ C13289a(kotlin.e0.d.g gVar) {
            this();
        }
    }

    /* compiled from: Result.kt */
    /* renamed from: kotlin.p$b */
    /* loaded from: classes3.dex */
    public static final class C13290b implements Serializable {

        /* renamed from: c */
        public final Throwable f29445c;

        public C13290b(Throwable th) {
            kotlin.e0.d.l.f(th, "exception");
            this.f29445c = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C13290b) && kotlin.e0.d.l.b(this.f29445c, ((C13290b) obj).f29445c);
        }

        public int hashCode() {
            return this.f29445c.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f29445c + ')';
        }
    }

    /* renamed from: a */
    public static Object m5362a(Object obj) {
        return obj;
    }

    /* renamed from: b */
    public static final Throwable m5361b(Object obj) {
        if (obj instanceof C13290b) {
            return ((C13290b) obj).f29445c;
        }
        return null;
    }

    /* renamed from: c */
    public static final boolean m5360c(Object obj) {
        return obj instanceof C13290b;
    }

    /* renamed from: d */
    public static final boolean m5359d(Object obj) {
        return !(obj instanceof C13290b);
    }
}
