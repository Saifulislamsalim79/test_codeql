package com.uber.autodispose.android.lifecycle;

import androidx.lifecycle.AbstractC1565i;
import androidx.lifecycle.C1582t;
import androidx.lifecycle.InterfaceC1555g;
import androidx.lifecycle.o;
import com.uber.autodispose.android.lifecycle.LifecycleEventsObservable;
/* loaded from: classes2.dex */
public class LifecycleEventsObservable_ArchLifecycleObserver_LifecycleAdapter implements InterfaceC1555g {

    /* renamed from: a */
    final LifecycleEventsObservable.ArchLifecycleObserver f17549a;

    LifecycleEventsObservable_ArchLifecycleObserver_LifecycleAdapter(LifecycleEventsObservable.ArchLifecycleObserver archLifecycleObserver) {
        this.f17549a = archLifecycleObserver;
    }

    @Override // androidx.lifecycle.InterfaceC1555g
    public void callMethods(o oVar, AbstractC1565i.b bVar, boolean z, C1582t c1582t) {
        boolean z2 = c1582t != null;
        if (z) {
            if (!z2 || c1582t.m35482a("onStateChange", 4)) {
                this.f17549a.onStateChange(oVar, bVar);
            }
        }
    }
}
