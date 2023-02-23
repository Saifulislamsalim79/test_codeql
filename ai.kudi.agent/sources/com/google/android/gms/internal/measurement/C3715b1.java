package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.b1 */
/* loaded from: classes2.dex */
public final class C3715b1 extends AbstractC3808h1 {

    /* renamed from: a */
    private final AtomicReference<Bundle> f9194a = new AtomicReference<>();

    /* renamed from: b */
    private boolean f9195b;

    /* renamed from: p1 */
    public static final <T> T m29829p1(Bundle bundle, Class<T> cls) {
        Object obj;
        if (bundle == null || (obj = bundle.get("r")) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e) {
            Log.w("AM", String.format("Unexpected object type. Expected, Received: %s, %s", cls.getCanonicalName(), obj.getClass().getCanonicalName()), e);
            throw e;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3824i1
    /* renamed from: l */
    public final void mo29532l(Bundle bundle) {
        synchronized (this.f9194a) {
            this.f9194a.set(bundle);
            this.f9195b = true;
            this.f9194a.notify();
        }
    }

    /* renamed from: n */
    public final Bundle m29831n(long j) {
        Bundle bundle;
        synchronized (this.f9194a) {
            if (!this.f9195b) {
                try {
                    this.f9194a.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = this.f9194a.get();
        }
        return bundle;
    }

    /* renamed from: o */
    public final String m29830o(long j) {
        return (String) m29829p1(m29831n(j), String.class);
    }
}
