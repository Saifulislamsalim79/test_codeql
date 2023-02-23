package com.google.firebase.inappmessaging.p154j0;

import android.os.Bundle;
import com.google.firebase.analytics.p111a.InterfaceC5174a;
import p425j.p444e.InterfaceC11672h;
/* compiled from: FiamAnalyticsConnectorListener.java */
/* renamed from: com.google.firebase.inappmessaging.j0.t2 */
/* loaded from: classes2.dex */
final class C6331t2 implements InterfaceC5174a.InterfaceC5176b {

    /* renamed from: a */
    private InterfaceC11672h<String> f15341a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6331t2(InterfaceC11672h<String> interfaceC11672h) {
        this.f15341a = interfaceC11672h;
    }

    @Override // com.google.firebase.analytics.p111a.InterfaceC5174a.InterfaceC5176b
    /* renamed from: a */
    public void mo22282a(int i, Bundle bundle) {
        if (i == 2) {
            this.f15341a.mo10903f(bundle.getString("events"));
        }
    }
}
