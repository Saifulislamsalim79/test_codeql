package com.google.firebase.database.p131s.p136j0;

import com.google.firebase.database.p139u.C5938i;
import com.google.firebase.database.p139u.InterfaceC5945n;
/* compiled from: ViewCache.java */
/* renamed from: com.google.firebase.database.s.j0.k */
/* loaded from: classes2.dex */
public class C5817k {

    /* renamed from: a */
    private final C5801a f14291a;

    /* renamed from: b */
    private final C5801a f14292b;

    public C5817k(C5801a c5801a, C5801a c5801a2) {
        this.f14291a = c5801a;
        this.f14292b = c5801a2;
    }

    /* renamed from: a */
    public InterfaceC5945n m23629a() {
        if (this.f14291a.m23690f()) {
            return this.f14291a.m23694b();
        }
        return null;
    }

    /* renamed from: b */
    public InterfaceC5945n m23628b() {
        if (this.f14292b.m23690f()) {
            return this.f14292b.m23694b();
        }
        return null;
    }

    /* renamed from: c */
    public C5801a m23627c() {
        return this.f14291a;
    }

    /* renamed from: d */
    public C5801a m23626d() {
        return this.f14292b;
    }

    /* renamed from: e */
    public C5817k m23625e(C5938i c5938i, boolean z, boolean z2) {
        return new C5817k(new C5801a(c5938i, z, z2), this.f14292b);
    }

    /* renamed from: f */
    public C5817k m23624f(C5938i c5938i, boolean z, boolean z2) {
        return new C5817k(this.f14291a, new C5801a(c5938i, z, z2));
    }
}
