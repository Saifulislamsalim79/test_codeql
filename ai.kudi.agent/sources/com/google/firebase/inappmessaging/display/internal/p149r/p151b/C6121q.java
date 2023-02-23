package com.google.firebase.inappmessaging.display.internal.p149r.p151b;

import android.app.Application;
import android.view.LayoutInflater;
import com.google.firebase.inappmessaging.display.internal.C6057l;
import com.google.firebase.inappmessaging.model.AbstractC6386i;
/* compiled from: InflaterModule.java */
/* renamed from: com.google.firebase.inappmessaging.display.internal.r.b.q */
/* loaded from: classes2.dex */
public class C6121q {

    /* renamed from: a */
    private final AbstractC6386i f14961a;

    /* renamed from: b */
    private final C6057l f14962b;

    /* renamed from: c */
    private final Application f14963c;

    public C6121q(AbstractC6386i abstractC6386i, C6057l c6057l, Application application) {
        this.f14961a = abstractC6386i;
        this.f14962b = c6057l;
        this.f14963c = application;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C6057l m22682a() {
        return this.f14962b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public AbstractC6386i m22681b() {
        return this.f14961a;
    }

    /* renamed from: c */
    public LayoutInflater m22680c() {
        return (LayoutInflater) this.f14963c.getSystemService("layout_inflater");
    }
}
