package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.C2826b;
import com.google.android.gms.common.C2832e;
import p201g.p218e.C7523b;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.v */
/* loaded from: classes2.dex */
public final class C2813v extends AbstractDialogInterface$OnCancelListenerC2786l1 {

    /* renamed from: x */
    private final C7523b<C2754b<?>> f7876x;

    /* renamed from: y */
    private final InterfaceC2769g f7877y;

    C2813v(InterfaceC2775i interfaceC2775i, InterfaceC2769g interfaceC2769g, C2832e c2832e) {
        super(interfaceC2775i, c2832e);
        this.f7876x = new C7523b<>();
        this.f7877y = interfaceC2769g;
        this.f7734c.mo31920a("ConnectionlessLifecycleHelper", this);
    }

    /* renamed from: u */
    public static void m31900u(Activity activity, InterfaceC2769g interfaceC2769g, C2754b<?> c2754b) {
        InterfaceC2775i m32056c = LifecycleCallback.m32056c(activity);
        C2813v c2813v = (C2813v) m32056c.mo31919b("ConnectionlessLifecycleHelper", C2813v.class);
        if (c2813v == null) {
            c2813v = new C2813v(m32056c, interfaceC2769g, C2832e.m31864o());
        }
        com.google.android.gms.common.internal.s.k(c2754b, "ApiKey cannot be null");
        c2813v.f7876x.add(c2754b);
        interfaceC2769g.c(c2813v);
    }

    /* renamed from: v */
    private final void m31899v() {
        if (this.f7876x.isEmpty()) {
            return;
        }
        this.f7877y.c(this);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: h */
    public final void mo31906h() {
        super.mo31906h();
        m31899v();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractDialogInterface$OnCancelListenerC2786l1, com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: j */
    public final void mo31905j() {
        super.mo31905j();
        m31899v();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractDialogInterface$OnCancelListenerC2786l1, com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: k */
    public final void mo31904k() {
        super.mo31904k();
        this.f7877y.d(this);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractDialogInterface$OnCancelListenerC2786l1
    /* renamed from: m */
    protected final void mo31903m(C2826b c2826b, int i) {
        this.f7877y.G(c2826b, i);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractDialogInterface$OnCancelListenerC2786l1
    /* renamed from: n */
    protected final void mo31902n() {
        this.f7877y.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public final C7523b<C2754b<?>> m31901t() {
        return this.f7876x;
    }
}
