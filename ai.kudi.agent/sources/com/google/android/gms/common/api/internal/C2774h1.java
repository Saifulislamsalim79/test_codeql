package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.C2826b;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.tasks.C4465k;
import java.util.Map;
import java.util.Set;
import p201g.p218e.C7521a;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.h1 */
/* loaded from: classes2.dex */
public final class C2774h1 {

    /* renamed from: a */
    private final C7521a<C2754b<?>, C2826b> f7792a;

    /* renamed from: b */
    private final C7521a<C2754b<?>, String> f7793b;

    /* renamed from: c */
    private final C4465k<Map<C2754b<?>, String>> f7794c;

    /* renamed from: d */
    private int f7795d;

    /* renamed from: e */
    private boolean f7796e;

    /* renamed from: a */
    public final Set<C2754b<?>> m31978a() {
        return this.f7792a.keySet();
    }

    /* renamed from: b */
    public final void m31977b(C2754b<?> c2754b, C2826b c2826b, String str) {
        this.f7792a.put(c2754b, c2826b);
        this.f7793b.put(c2754b, str);
        this.f7795d--;
        if (!c2826b.m31879s()) {
            this.f7796e = true;
        }
        if (this.f7795d == 0) {
            if (this.f7796e) {
                this.f7794c.m27776b(new AvailabilityException(this.f7792a));
                return;
            }
            this.f7794c.m27775c(this.f7793b);
        }
    }
}
