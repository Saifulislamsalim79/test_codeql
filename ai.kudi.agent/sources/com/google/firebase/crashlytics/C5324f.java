package com.google.firebase.crashlytics;

import android.os.Bundle;
import com.google.firebase.analytics.p111a.InterfaceC5174a;
import com.google.firebase.crashlytics.p112h.C5335f;
import com.google.firebase.crashlytics.p112h.p113h.InterfaceC5338b;
import java.util.Locale;
/* compiled from: CrashlyticsAnalyticsListener.java */
/* renamed from: com.google.firebase.crashlytics.f */
/* loaded from: classes2.dex */
class C5324f implements InterfaceC5174a.InterfaceC5176b {

    /* renamed from: a */
    private InterfaceC5338b f13171a;

    /* renamed from: b */
    private InterfaceC5338b f13172b;

    /* renamed from: b */
    private static void m25127b(InterfaceC5338b interfaceC5338b, String str, Bundle bundle) {
        if (interfaceC5338b == null) {
            return;
        }
        interfaceC5338b.onEvent(str, bundle);
    }

    /* renamed from: c */
    private void m25126c(String str, Bundle bundle) {
        InterfaceC5338b interfaceC5338b;
        if ("clx".equals(bundle.getString("_o"))) {
            interfaceC5338b = this.f13171a;
        } else {
            interfaceC5338b = this.f13172b;
        }
        m25127b(interfaceC5338b, str, bundle);
    }

    @Override // com.google.firebase.analytics.p111a.InterfaceC5174a.InterfaceC5176b
    /* renamed from: a */
    public void mo22282a(int i, Bundle bundle) {
        String string;
        C5335f.m25102f().m25099i(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", Integer.valueOf(i), bundle));
        if (bundle == null || (string = bundle.getString("name")) == null) {
            return;
        }
        Bundle bundle2 = bundle.getBundle("params");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        m25126c(string, bundle2);
    }

    /* renamed from: d */
    public void m25125d(InterfaceC5338b interfaceC5338b) {
        this.f13172b = interfaceC5338b;
    }

    /* renamed from: e */
    public void m25124e(InterfaceC5338b interfaceC5338b) {
        this.f13171a = interfaceC5338b;
    }
}
