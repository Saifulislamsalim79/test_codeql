package com.google.firebase.crashlytics;

import android.os.Bundle;
import com.google.firebase.analytics.p111a.InterfaceC5174a;
import com.google.firebase.crashlytics.p112h.C5335f;
import com.google.firebase.crashlytics.p112h.p113h.C5339c;
import com.google.firebase.crashlytics.p112h.p113h.C5340d;
import com.google.firebase.crashlytics.p112h.p113h.C5341e;
import com.google.firebase.crashlytics.p112h.p113h.C5342f;
import com.google.firebase.crashlytics.p112h.p113h.InterfaceC5337a;
import com.google.firebase.crashlytics.p112h.p114i.C5345c;
import com.google.firebase.crashlytics.p112h.p114i.InterfaceC5343a;
import com.google.firebase.crashlytics.p112h.p114i.InterfaceC5344b;
import com.google.firebase.p170o.InterfaceC6558a;
import com.google.firebase.p170o.InterfaceC6560b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: AnalyticsDeferredProxy.java */
/* renamed from: com.google.firebase.crashlytics.e */
/* loaded from: classes2.dex */
public class C5323e {

    /* renamed from: a */
    private final InterfaceC6558a<InterfaceC5174a> f13167a;

    /* renamed from: b */
    private volatile InterfaceC5337a f13168b;

    /* renamed from: c */
    private volatile InterfaceC5344b f13169c;

    /* renamed from: d */
    private final List<InterfaceC5343a> f13170d;

    public C5323e(InterfaceC6558a<InterfaceC5174a> interfaceC6558a) {
        this(interfaceC6558a, new C5345c(), new C5342f());
    }

    /* renamed from: c */
    private void m25132c() {
        this.f13167a.mo21639a(new InterfaceC6558a.InterfaceC6559a() { // from class: com.google.firebase.crashlytics.c
            @Override // com.google.firebase.p170o.InterfaceC6558a.InterfaceC6559a
            /* renamed from: a */
            public final void mo21638a(InterfaceC6560b interfaceC6560b) {
                C5323e.this.m25129f(interfaceC6560b);
            }
        });
    }

    /* renamed from: g */
    private static InterfaceC5174a.InterfaceC5175a m25128g(InterfaceC5174a interfaceC5174a, C5324f c5324f) {
        InterfaceC5174a.InterfaceC5175a mo22583g = interfaceC5174a.mo22583g("clx", c5324f);
        if (mo22583g == null) {
            C5335f.m25102f().m25106b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            mo22583g = interfaceC5174a.mo22583g("crash", c5324f);
            if (mo22583g != null) {
                C5335f.m25102f().m25097k("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        return mo22583g;
    }

    /* renamed from: a */
    public InterfaceC5337a m25134a() {
        return new InterfaceC5337a() { // from class: com.google.firebase.crashlytics.a
            @Override // com.google.firebase.crashlytics.p112h.p113h.InterfaceC5337a
            /* renamed from: a */
            public final void mo25088a(String str, Bundle bundle) {
                C5323e.this.m25131d(str, bundle);
            }
        };
    }

    /* renamed from: b */
    public InterfaceC5344b m25133b() {
        return new InterfaceC5344b() { // from class: com.google.firebase.crashlytics.b
            @Override // com.google.firebase.crashlytics.p112h.p114i.InterfaceC5344b
            /* renamed from: a */
            public final void mo25087a(InterfaceC5343a interfaceC5343a) {
                C5323e.this.m25130e(interfaceC5343a);
            }
        };
    }

    /* renamed from: d */
    public /* synthetic */ void m25131d(String str, Bundle bundle) {
        this.f13168b.mo25088a(str, bundle);
    }

    /* renamed from: e */
    public /* synthetic */ void m25130e(InterfaceC5343a interfaceC5343a) {
        synchronized (this) {
            if (this.f13169c instanceof C5345c) {
                this.f13170d.add(interfaceC5343a);
            }
            this.f13169c.mo25087a(interfaceC5343a);
        }
    }

    /* renamed from: f */
    public /* synthetic */ void m25129f(InterfaceC6560b interfaceC6560b) {
        C5335f.m25102f().m25106b("AnalyticsConnector now available.");
        InterfaceC5174a interfaceC5174a = (InterfaceC5174a) interfaceC6560b.get();
        C5341e c5341e = new C5341e(interfaceC5174a);
        C5324f c5324f = new C5324f();
        if (m25128g(interfaceC5174a, c5324f) != null) {
            C5335f.m25102f().m25106b("Registered Firebase Analytics listener.");
            C5340d c5340d = new C5340d();
            C5339c c5339c = new C5339c(c5341e, 500, TimeUnit.MILLISECONDS);
            synchronized (this) {
                for (InterfaceC5343a interfaceC5343a : this.f13170d) {
                    c5340d.mo25087a(interfaceC5343a);
                }
                c5324f.m25125d(c5340d);
                c5324f.m25124e(c5339c);
                this.f13169c = c5340d;
                this.f13168b = c5339c;
            }
            return;
        }
        C5335f.m25102f().m25097k("Could not register Firebase Analytics listener; a listener is already registered.");
    }

    public C5323e(InterfaceC6558a<InterfaceC5174a> interfaceC6558a, InterfaceC5344b interfaceC5344b, InterfaceC5337a interfaceC5337a) {
        this.f13167a = interfaceC6558a;
        this.f13169c = interfaceC5344b;
        this.f13170d = new ArrayList();
        this.f13168b = interfaceC5337a;
        m25132c();
    }
}
