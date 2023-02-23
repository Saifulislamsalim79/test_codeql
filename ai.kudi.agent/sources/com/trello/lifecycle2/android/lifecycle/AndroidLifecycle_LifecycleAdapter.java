package com.trello.lifecycle2.android.lifecycle;

import androidx.lifecycle.AbstractC1565i;
import androidx.lifecycle.C1582t;
import androidx.lifecycle.InterfaceC1555g;
import androidx.lifecycle.o;
/* loaded from: classes2.dex */
public class AndroidLifecycle_LifecycleAdapter implements InterfaceC1555g {

    /* renamed from: a */
    final AndroidLifecycle f17535a;

    AndroidLifecycle_LifecycleAdapter(AndroidLifecycle androidLifecycle) {
        this.f17535a = androidLifecycle;
    }

    @Override // androidx.lifecycle.InterfaceC1555g
    public void callMethods(o oVar, AbstractC1565i.b bVar, boolean z, C1582t c1582t) {
        boolean z2 = c1582t != null;
        if (z) {
            if (!z2 || c1582t.m35482a("onEvent", 4)) {
                this.f17535a.onEvent(oVar, bVar);
            }
        }
    }
}
