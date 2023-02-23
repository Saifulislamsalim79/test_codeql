package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.common.internal.s;
import com.google.android.gms.measurement.p105a.C4140a;
import com.google.firebase.analytics.p111a.InterfaceC5174a;
import java.util.HashSet;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-measurement-api@@20.0.0 */
/* renamed from: com.google.firebase.analytics.connector.internal.e */
/* loaded from: classes2.dex */
public final class C5187e implements InterfaceC5183a {

    /* renamed from: a */
    final Set<String> f12925a;

    /* renamed from: b */
    private final InterfaceC5174a.InterfaceC5176b f12926b;

    /* renamed from: c */
    private final C4140a f12927c;

    /* renamed from: d */
    private final C5186d f12928d;

    public C5187e(C4140a c4140a, InterfaceC5174a.InterfaceC5176b interfaceC5176b) {
        this.f12926b = interfaceC5176b;
        this.f12927c = c4140a;
        C5186d c5186d = new C5186d(this);
        this.f12928d = c5186d;
        this.f12927c.m28480f(c5186d);
        this.f12925a = new HashSet();
    }

    @Override // com.google.firebase.analytics.connector.internal.InterfaceC5183a
    /* renamed from: a */
    public final void mo25416a(Set<String> set) {
        this.f12925a.clear();
        Set<String> set2 = this.f12925a;
        HashSet hashSet = new HashSet();
        for (String str : set) {
            if (hashSet.size() >= 50) {
                break;
            } else if (C5185c.m25426f(str) && C5185c.m25425g(str)) {
                String m25428d = C5185c.m25428d(str);
                s.j(m25428d);
                hashSet.add(m25428d);
            }
        }
        set2.addAll(hashSet);
    }
}
