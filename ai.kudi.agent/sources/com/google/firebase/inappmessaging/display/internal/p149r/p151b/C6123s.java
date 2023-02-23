package com.google.firebase.inappmessaging.display.internal.p149r.p151b;

import com.google.firebase.inappmessaging.display.p145i.p146a.C6033d;
import com.google.firebase.inappmessaging.model.AbstractC6386i;
/* compiled from: InflaterModule_ProvidesBannerMessageFactory.java */
/* renamed from: com.google.firebase.inappmessaging.display.internal.r.b.s */
/* loaded from: classes2.dex */
public final class C6123s implements Object<AbstractC6386i> {

    /* renamed from: a */
    private final C6121q f14965a;

    public C6123s(C6121q c6121q) {
        this.f14965a = c6121q;
    }

    /* renamed from: a */
    public static C6123s m22676a(C6121q c6121q) {
        return new C6123s(c6121q);
    }

    /* renamed from: c */
    public static AbstractC6386i m22674c(C6121q c6121q) {
        AbstractC6386i m22681b = c6121q.m22681b();
        C6033d.m22945c(m22681b, "Cannot return null from a non-@Nullable @Provides method");
        return m22681b;
    }

    /* renamed from: b */
    public AbstractC6386i get() {
        return m22674c(this.f14965a);
    }
}
