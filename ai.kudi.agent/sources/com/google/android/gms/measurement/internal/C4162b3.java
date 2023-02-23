package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.b3 */
/* loaded from: classes2.dex */
public final class C4162b3<V> {

    /* renamed from: h */
    private static final Object f10021h = new Object();

    /* renamed from: a */
    private final String f10022a;

    /* renamed from: b */
    private final InterfaceC4427y2<V> f10023b;

    /* renamed from: c */
    private final V f10024c;

    /* renamed from: d */
    private final V f10025d;

    /* renamed from: e */
    private final Object f10026e = new Object();

    /* renamed from: f */
    private volatile V f10027f = null;

    /* renamed from: g */
    private volatile V f10028g = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C4162b3(String str, Object obj, Object obj2, InterfaceC4427y2 interfaceC4427y2, C4150a3 c4150a3) {
        this.f10022a = str;
        this.f10024c = obj;
        this.f10025d = obj2;
        this.f10023b = interfaceC4427y2;
    }

    /* renamed from: a */
    public final V m28406a(V v) {
        synchronized (this.f10026e) {
        }
        if (v != null) {
            return v;
        }
        if (C4438z2.f10847a != null) {
            synchronized (f10021h) {
                if (C4158b.m28407a()) {
                    return this.f10028g == null ? this.f10024c : this.f10028g;
                }
                try {
                    for (C4162b3 c4162b3 : C4173c3.m28336b()) {
                        if (!C4158b.m28407a()) {
                            V v2 = null;
                            try {
                                InterfaceC4427y2<V> interfaceC4427y2 = c4162b3.f10023b;
                                if (interfaceC4427y2 != null) {
                                    v2 = interfaceC4427y2.zza();
                                }
                            } catch (IllegalStateException unused) {
                            }
                            synchronized (f10021h) {
                                c4162b3.f10028g = v2;
                            }
                        } else {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                    }
                } catch (SecurityException unused2) {
                }
                InterfaceC4427y2<V> interfaceC4427y22 = this.f10023b;
                if (interfaceC4427y22 == null) {
                    return this.f10024c;
                }
                try {
                    return interfaceC4427y22.zza();
                } catch (IllegalStateException unused3) {
                    return this.f10024c;
                } catch (SecurityException unused4) {
                    return this.f10024c;
                }
            }
        }
        return this.f10024c;
    }

    /* renamed from: b */
    public final String m28405b() {
        return this.f10022a;
    }
}
