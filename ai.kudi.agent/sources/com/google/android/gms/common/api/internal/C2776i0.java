package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.C2826b;
import com.google.android.gms.common.api.C2730a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AbstractC2854c;
import com.google.android.gms.common.internal.InterfaceC2889l;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.i0 */
/* loaded from: classes2.dex */
public final class C2776i0 implements AbstractC2854c.InterfaceC2857c, InterfaceC2814v0 {

    /* renamed from: a */
    private final C2730a.InterfaceC2739f f7797a;

    /* renamed from: b */
    private final C2754b<?> f7798b;

    /* renamed from: c */
    private InterfaceC2889l f7799c = null;

    /* renamed from: d */
    private Set<Scope> f7800d = null;

    /* renamed from: e */
    private boolean f7801e = false;

    /* renamed from: f */
    final /* synthetic */ InterfaceC2769g f7802f;

    public C2776i0(InterfaceC2769g interfaceC2769g, C2730a.InterfaceC2739f interfaceC2739f, C2754b<?> c2754b) {
        this.f7802f = interfaceC2769g;
        this.f7797a = interfaceC2739f;
        this.f7798b = c2754b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public final void m31972h() {
        InterfaceC2889l interfaceC2889l;
        if (!this.f7801e || (interfaceC2889l = this.f7799c) == null) {
            return;
        }
        this.f7797a.mo31968b(interfaceC2889l, this.f7800d);
    }

    @Override // com.google.android.gms.common.internal.AbstractC2854c.InterfaceC2857c
    /* renamed from: a */
    public final void mo31771a(C2826b c2826b) {
        InterfaceC2769g.r(this.f7802f).post(new RunnableC2773h0(this, c2826b));
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC2814v0
    /* renamed from: b */
    public final void mo31898b(C2826b c2826b) {
        e0 e0Var = (e0) InterfaceC2769g.A(this.f7802f).get(this.f7798b);
        if (e0Var != null) {
            e0Var.I(c2826b);
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC2814v0
    /* renamed from: c */
    public final void mo31897c(InterfaceC2889l interfaceC2889l, Set<Scope> set) {
        if (interfaceC2889l != null && set != null) {
            this.f7799c = interfaceC2889l;
            this.f7800d = set;
            m31972h();
            return;
        }
        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
        mo31898b(new C2826b(4));
    }
}
