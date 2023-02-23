package com.google.firebase.inappmessaging.display.internal.p149r.p151b;

import com.google.firebase.inappmessaging.C6408r;
import com.google.firebase.inappmessaging.display.p145i.p146a.C6033d;
/* compiled from: HeadlessInAppMessagingModule_ProvidesHeadlesssSingletonFactory.java */
/* renamed from: com.google.firebase.inappmessaging.display.internal.r.b.f */
/* loaded from: classes2.dex */
public final class C6109f implements Object<C6408r> {

    /* renamed from: a */
    private final C6108e f14938a;

    public C6109f(C6108e c6108e) {
        this.f14938a = c6108e;
    }

    /* renamed from: a */
    public static C6109f m22722a(C6108e c6108e) {
        return new C6109f(c6108e);
    }

    /* renamed from: c */
    public static C6408r m22720c(C6108e c6108e) {
        C6408r m22723a = c6108e.m22723a();
        C6033d.m22945c(m22723a, "Cannot return null from a non-@Nullable @Provides method");
        return m22723a;
    }

    /* renamed from: b */
    public C6408r get() {
        return m22720c(this.f14938a);
    }
}
