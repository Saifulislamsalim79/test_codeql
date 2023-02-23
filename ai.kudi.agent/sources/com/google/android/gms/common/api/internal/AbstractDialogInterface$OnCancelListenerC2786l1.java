package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.C2826b;
import com.google.android.gms.common.C2832e;
import java.util.concurrent.atomic.AtomicReference;
import p272h.p286c.p287a.p300b.p307d.p310c.HandlerC8416f;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.l1 */
/* loaded from: classes2.dex */
public abstract class AbstractDialogInterface$OnCancelListenerC2786l1 extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    protected volatile boolean f7823d;

    /* renamed from: e */
    protected final AtomicReference<C2777i1> f7824e;

    /* renamed from: f */
    private final Handler f7825f;

    /* renamed from: w */
    protected final C2832e f7826w;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractDialogInterface$OnCancelListenerC2786l1(InterfaceC2775i interfaceC2775i, C2832e c2832e) {
        super(interfaceC2775i);
        this.f7824e = new AtomicReference<>(null);
        this.f7825f = new HandlerC8416f(Looper.getMainLooper());
        this.f7826w = c2832e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public final void m31949l(C2826b c2826b, int i) {
        this.f7824e.set(null);
        mo31903m(c2826b, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public final void m31948o() {
        this.f7824e.set(null);
        mo31902n();
    }

    /* renamed from: p */
    private static final int m31947p(C2777i1 c2777i1) {
        if (c2777i1 == null) {
            return -1;
        }
        return c2777i1.m31971a();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: e */
    public final void mo31952e(int i, int i2, Intent intent) {
        C2777i1 c2777i1 = this.f7824e.get();
        if (i != 1) {
            if (i == 2) {
                int mo31846g = this.f7826w.mo31846g(m32057b());
                if (mo31846g == 0) {
                    m31948o();
                    return;
                } else if (c2777i1 == null) {
                    return;
                } else {
                    if (c2777i1.m31970b().m31883f() == 18 && mo31846g == 18) {
                        return;
                    }
                }
            }
        } else if (i2 == -1) {
            m31948o();
            return;
        } else if (i2 == 0) {
            if (c2777i1 == null) {
                return;
            }
            m31949l(new C2826b(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, c2777i1.m31970b().toString()), m31947p(c2777i1));
            return;
        }
        if (c2777i1 != null) {
            m31949l(c2777i1.m31970b(), c2777i1.m31971a());
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: f */
    public final void mo31951f(Bundle bundle) {
        super.mo31951f(bundle);
        if (bundle != null) {
            this.f7824e.set(bundle.getBoolean("resolving_error", false) ? new C2777i1(new C2826b(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: i */
    public final void mo31950i(Bundle bundle) {
        super.mo31950i(bundle);
        C2777i1 c2777i1 = this.f7824e.get();
        if (c2777i1 == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", c2777i1.m31971a());
        bundle.putInt("failed_status", c2777i1.m31970b().m31883f());
        bundle.putParcelable("failed_resolution", c2777i1.m31970b().m31881k());
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: j */
    public void mo31905j() {
        super.mo31905j();
        this.f7823d = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: k */
    public void mo31904k() {
        super.mo31904k();
        this.f7823d = false;
    }

    /* renamed from: m */
    protected abstract void mo31903m(C2826b c2826b, int i);

    /* renamed from: n */
    protected abstract void mo31902n();

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        m31949l(new C2826b(13, null), m31947p(this.f7824e.get()));
    }

    /* renamed from: s */
    public final void m31944s(C2826b c2826b, int i) {
        C2777i1 c2777i1 = new C2777i1(c2826b, i);
        if (this.f7824e.compareAndSet(null, c2777i1)) {
            this.f7825f.post(new RunnableC2784k1(this, c2777i1));
        }
    }
}
