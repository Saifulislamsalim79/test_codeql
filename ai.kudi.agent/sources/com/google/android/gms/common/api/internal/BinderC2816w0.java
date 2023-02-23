package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.C2826b;
import com.google.android.gms.common.api.AbstractC2743d;
import com.google.android.gms.common.api.C2730a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C2867e;
import com.google.android.gms.common.internal.C2924u0;
import java.util.Set;
import p272h.p286c.p287a.p300b.p320f.C9206a;
import p272h.p286c.p287a.p300b.p320f.C9223f;
import p272h.p286c.p287a.p300b.p320f.InterfaceC9224g;
import p272h.p286c.p287a.p300b.p320f.p321b.BinderC9210d;
import p272h.p286c.p287a.p300b.p320f.p321b.C9218l;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.w0 */
/* loaded from: classes2.dex */
public final class BinderC2816w0 extends BinderC9210d implements AbstractC2743d.a, AbstractC2743d.b {

    /* renamed from: h */
    private static final C2730a.AbstractC2731a<? extends InterfaceC9224g, C9206a> f7880h = C9223f.f21620c;

    /* renamed from: a */
    private final Context f7881a;

    /* renamed from: b */
    private final Handler f7882b;

    /* renamed from: c */
    private final C2730a.AbstractC2731a<? extends InterfaceC9224g, C9206a> f7883c;

    /* renamed from: d */
    private final Set<Scope> f7884d;

    /* renamed from: e */
    private final C2867e f7885e;

    /* renamed from: f */
    private InterfaceC9224g f7886f;

    /* renamed from: g */
    private InterfaceC2814v0 f7887g;

    public BinderC2816w0(Context context, Handler handler, C2867e c2867e) {
        C2730a.AbstractC2731a<? extends InterfaceC9224g, C9206a> abstractC2731a = f7880h;
        this.f7881a = context;
        this.f7882b = handler;
        com.google.android.gms.common.internal.s.k(c2867e, "ClientSettings must not be null");
        this.f7885e = c2867e;
        this.f7884d = c2867e.m31759e();
        this.f7883c = abstractC2731a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r1 */
    public static /* bridge */ /* synthetic */ void m31890r1(BinderC2816w0 binderC2816w0, C9218l c9218l) {
        C2826b m15461f = c9218l.m15461f();
        if (m15461f.m31879s()) {
            C2924u0 m15460h = c9218l.m15460h();
            com.google.android.gms.common.internal.s.j(m15460h);
            C2924u0 c2924u0 = m15460h;
            C2826b m31620f = c2924u0.m31620f();
            if (!m31620f.m31879s()) {
                String valueOf = String.valueOf(m31620f);
                String.valueOf(valueOf).length();
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(valueOf)), new Exception());
                binderC2816w0.f7887g.mo31898b(m31620f);
                binderC2816w0.f7886f.disconnect();
                return;
            }
            binderC2816w0.f7887g.mo31897c(c2924u0.m31619h(), binderC2816w0.f7884d);
        } else {
            binderC2816w0.f7887g.mo31898b(m15461f);
        }
        binderC2816w0.f7886f.disconnect();
    }

    @Override // p272h.p286c.p287a.p300b.p320f.p321b.InterfaceC9212f
    /* renamed from: J */
    public final void mo15463J(C9218l c9218l) {
        this.f7882b.post(new RunnableC2812u0(this, c9218l));
    }

    /* renamed from: m */
    public final void m31894m(int i) {
        this.f7886f.disconnect();
    }

    /* renamed from: n */
    public final void m31893n(C2826b c2826b) {
        this.f7887g.mo31898b(c2826b);
    }

    /* renamed from: o */
    public final void m31892o(Bundle bundle) {
        this.f7886f.mo15458j(this);
    }

    /* renamed from: s1 */
    public final void m31889s1(InterfaceC2814v0 interfaceC2814v0) {
        InterfaceC9224g interfaceC9224g = this.f7886f;
        if (interfaceC9224g != null) {
            interfaceC9224g.disconnect();
        }
        this.f7885e.m31755i(Integer.valueOf(System.identityHashCode(this)));
        C2730a.AbstractC2731a<? extends InterfaceC9224g, C9206a> abstractC2731a = this.f7883c;
        Context context = this.f7881a;
        Looper looper = this.f7882b.getLooper();
        C2867e c2867e = this.f7885e;
        this.f7886f = abstractC2731a.mo15459a(context, looper, c2867e, c2867e.m31758f(), this, this);
        this.f7887g = interfaceC2814v0;
        Set<Scope> set = this.f7884d;
        if (set != null && !set.isEmpty()) {
            this.f7886f.mo15457o();
        } else {
            this.f7882b.post(new RunnableC2810t0(this));
        }
    }

    /* renamed from: t1 */
    public final void m31888t1() {
        InterfaceC9224g interfaceC9224g = this.f7886f;
        if (interfaceC9224g != null) {
            interfaceC9224g.disconnect();
        }
    }
}
