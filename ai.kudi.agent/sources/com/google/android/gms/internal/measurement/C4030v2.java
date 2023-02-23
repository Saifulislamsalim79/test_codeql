package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.v2 */
/* loaded from: classes2.dex */
public final class C4030v2 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: c */
    final /* synthetic */ C4046w2 f9792c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4030v2(C4046w2 c4046w2) {
        this.f9792c = c4046w2;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f9792c.m28712m(new C3904n2(this, bundle, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f9792c.m28712m(new C4014u2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f9792c.m28712m(new C3950q2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.f9792c.m28712m(new C3935p2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C3715b1 c3715b1 = new C3715b1();
        this.f9792c.m28712m(new C3998t2(this, activity, c3715b1));
        Bundle m29831n = c3715b1.m29831n(50L);
        if (m29831n != null) {
            bundle.putAll(m29831n);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.f9792c.m28712m(new C3920o2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.f9792c.m28712m(new C3982s2(this, activity));
    }
}
