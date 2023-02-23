package com.google.firebase.perf;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.C5988g;
import com.google.firebase.installations.InterfaceC6432h;
import com.google.firebase.p170o.InterfaceC6560b;
import com.google.firebase.perf.config.C6569d;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.p176h.C6609a;
import com.google.firebase.perf.p176h.C6610b;
import com.google.firebase.perf.p177i.C6623k;
import com.google.firebase.perf.p178j.C6627d;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.remoteconfig.C6772o;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p272h.p286c.p287a.p288a.InterfaceC8241g;
/* compiled from: FirebasePerformance.java */
/* renamed from: com.google.firebase.perf.c */
/* loaded from: classes2.dex */
public class C6565c {

    /* renamed from: e */
    private static final C6609a f15841e = C6609a.m21475e();

    /* renamed from: a */
    private final Map<String, String> f15842a = new ConcurrentHashMap();

    /* renamed from: b */
    private final C6569d f15843b;

    /* renamed from: c */
    private final C6627d f15844c;

    /* renamed from: d */
    private Boolean f15845d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6565c(C5988g c5988g, InterfaceC6560b<C6772o> interfaceC6560b, InterfaceC6432h interfaceC6432h, InterfaceC6560b<InterfaceC8241g> interfaceC6560b2, RemoteConfigManager remoteConfigManager, C6569d c6569d, GaugeManager gaugeManager) {
        this.f15845d = null;
        if (c5988g == null) {
            this.f15845d = Boolean.FALSE;
            this.f15843b = c6569d;
            this.f15844c = new C6627d(new Bundle());
            return;
        }
        C6623k.m21437e().m21430l(c5988g, interfaceC6432h, interfaceC6560b2);
        Context m23093i = c5988g.m23093i();
        this.f15844c = m21631a(m23093i);
        remoteConfigManager.setFirebaseRemoteConfigProvider(interfaceC6560b);
        this.f15843b = c6569d;
        c6569d.m21611O(this.f15844c);
        this.f15843b.m21613M(m23093i);
        gaugeManager.setApplicationContext(m23093i);
        this.f15845d = c6569d.m21603h();
        if (m21628d()) {
            f15841e.m21474f(String.format("Firebase Performance Monitoring is successfully initialized! In a minute, visit the Firebase console to view your data: %s", C6610b.m21468b(c5988g.m23089m().m23065f(), m23093i.getPackageName())));
        }
    }

    /* renamed from: a */
    private static C6627d m21631a(Context context) {
        Bundle bundle;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            Log.d("isEnabled", "No perf enable meta data found " + e.getMessage());
            bundle = null;
        }
        return bundle != null ? new C6627d(bundle) : new C6627d();
    }

    /* renamed from: c */
    public static C6565c m21629c() {
        return (C6565c) C5988g.m23092j().m23095g(C6565c.class);
    }

    /* renamed from: b */
    public Map<String, String> m21630b() {
        return new HashMap(this.f15842a);
    }

    /* renamed from: d */
    public boolean m21628d() {
        Boolean bool = this.f15845d;
        if (bool != null) {
            return bool.booleanValue();
        }
        return C5988g.m23092j().m23083s();
    }
}
