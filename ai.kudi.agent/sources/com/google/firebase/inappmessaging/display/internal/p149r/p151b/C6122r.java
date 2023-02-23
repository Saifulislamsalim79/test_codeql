package com.google.firebase.inappmessaging.display.internal.p149r.p151b;

import com.google.firebase.inappmessaging.display.internal.C6057l;
import com.google.firebase.inappmessaging.display.p145i.p146a.C6033d;
/* compiled from: InflaterModule_InAppMessageLayoutConfigFactory.java */
/* renamed from: com.google.firebase.inappmessaging.display.internal.r.b.r */
/* loaded from: classes2.dex */
public final class C6122r implements Object<C6057l> {

    /* renamed from: a */
    private final C6121q f14964a;

    public C6122r(C6121q c6121q) {
        this.f14964a = c6121q;
    }

    /* renamed from: a */
    public static C6122r m22679a(C6121q c6121q) {
        return new C6122r(c6121q);
    }

    /* renamed from: c */
    public static C6057l m22677c(C6121q c6121q) {
        C6057l m22682a = c6121q.m22682a();
        C6033d.m22945c(m22682a, "Cannot return null from a non-@Nullable @Provides method");
        return m22682a;
    }

    /* renamed from: b */
    public C6057l get() {
        return m22677c(this.f14964a);
    }
}
