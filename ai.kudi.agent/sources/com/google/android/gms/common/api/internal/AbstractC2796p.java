package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.C2830d;
import com.google.android.gms.common.api.C2730a;
import com.google.android.gms.common.api.C2730a.InterfaceC2732b;
import com.google.android.gms.tasks.C4465k;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.p */
/* loaded from: classes2.dex */
public abstract class AbstractC2796p<A extends C2730a.InterfaceC2732b, ResultT> {

    /* renamed from: a */
    private final C2830d[] f7837a;

    /* renamed from: b */
    private final boolean f7838b;

    /* renamed from: c */
    private final int f7839c;

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    /* renamed from: com.google.android.gms.common.api.internal.p$a */
    /* loaded from: classes2.dex */
    public static class C2797a<A extends C2730a.InterfaceC2732b, ResultT> {

        /* renamed from: a */
        private InterfaceC2790n<A, C4465k<ResultT>> f7840a;

        /* renamed from: c */
        private C2830d[] f7842c;

        /* renamed from: b */
        private boolean f7841b = true;

        /* renamed from: d */
        private int f7843d = 0;

        /* synthetic */ C2797a(C2819y0 c2819y0) {
        }

        /* renamed from: a */
        public AbstractC2796p<A, ResultT> m31931a() {
            com.google.android.gms.common.internal.s.b(this.f7840a != null, "execute parameter required");
            return new C2817x0(this, this.f7842c, this.f7841b, this.f7843d);
        }

        /* renamed from: b */
        public C2797a<A, ResultT> m31930b(InterfaceC2790n<A, C4465k<ResultT>> interfaceC2790n) {
            this.f7840a = interfaceC2790n;
            return this;
        }

        /* renamed from: c */
        public C2797a<A, ResultT> m31929c(boolean z) {
            this.f7841b = z;
            return this;
        }

        /* renamed from: d */
        public C2797a<A, ResultT> m31928d(C2830d... c2830dArr) {
            this.f7842c = c2830dArr;
            return this;
        }
    }

    @Deprecated
    public AbstractC2796p() {
        this.f7837a = null;
        this.f7838b = false;
        this.f7839c = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC2796p(C2830d[] c2830dArr, boolean z, int i) {
        this.f7837a = c2830dArr;
        boolean z2 = false;
        if (c2830dArr != null && z) {
            z2 = true;
        }
        this.f7838b = z2;
        this.f7839c = i;
    }

    /* renamed from: a */
    public static <A extends C2730a.InterfaceC2732b, ResultT> C2797a<A, ResultT> m31935a() {
        return new C2797a<>(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo28489b(A a, C4465k<ResultT> c4465k) throws RemoteException;

    /* renamed from: c */
    public boolean m31934c() {
        return this.f7838b;
    }

    /* renamed from: d */
    public final int m31933d() {
        return this.f7839c;
    }

    /* renamed from: e */
    public final C2830d[] m31932e() {
        return this.f7837a;
    }
}
