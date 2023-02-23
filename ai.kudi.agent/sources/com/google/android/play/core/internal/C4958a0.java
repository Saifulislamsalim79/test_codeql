package com.google.android.play.core.internal;
/* renamed from: com.google.android.play.core.internal.a0 */
/* loaded from: classes2.dex */
public final class C4958a0<T> implements InterfaceC4961b0, InterfaceC5005y {

    /* renamed from: c */
    private static final Object f12620c = new Object();

    /* renamed from: a */
    private volatile InterfaceC4961b0<T> f12621a;

    /* renamed from: b */
    private volatile Object f12622b = f12620c;

    private C4958a0(InterfaceC4961b0<T> interfaceC4961b0) {
        this.f12621a = interfaceC4961b0;
    }

    /* renamed from: a */
    public static <P extends InterfaceC4961b0<T>, T> InterfaceC4961b0<T> m25952a(P p) {
        C4987n.m25915c(p);
        return p instanceof C4958a0 ? p : new C4958a0(p);
    }

    /* renamed from: b */
    public static <P extends InterfaceC4961b0<T>, T> InterfaceC5005y<T> m25951b(P p) {
        if (p instanceof InterfaceC5005y) {
            return (InterfaceC5005y) p;
        }
        C4987n.m25915c(p);
        return new C4958a0(p);
    }

    @Override // com.google.android.play.core.internal.InterfaceC4961b0
    /* renamed from: a */
    public final T mo15000a() {
        T t = (T) this.f12622b;
        if (t == f12620c) {
            synchronized (this) {
                t = this.f12622b;
                if (t == f12620c) {
                    t = this.f12621a.mo15000a();
                    Object obj = this.f12622b;
                    if (obj != f12620c && obj != t) {
                        String valueOf = String.valueOf(obj);
                        String valueOf2 = String.valueOf(t);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 118 + String.valueOf(valueOf2).length());
                        sb.append("Scoped provider was invoked recursively returning different results: ");
                        sb.append(valueOf);
                        sb.append(" & ");
                        sb.append(valueOf2);
                        sb.append(". This is likely due to a circular dependency.");
                        throw new IllegalStateException(sb.toString());
                    }
                    this.f12622b = t;
                    this.f12621a = null;
                }
            }
        }
        return t;
    }
}
