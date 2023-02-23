package com.google.firebase.database.p131s;

import com.google.firebase.database.p131s.p136j0.C5801a;
import com.google.firebase.database.p139u.AbstractC5937h;
import com.google.firebase.database.p139u.C5921b;
import com.google.firebase.database.p139u.C5944m;
import com.google.firebase.database.p139u.InterfaceC5945n;
import java.util.Collections;
import java.util.List;
/* compiled from: WriteTreeRef.java */
/* renamed from: com.google.firebase.database.s.e0 */
/* loaded from: classes2.dex */
public class C5740e0 {

    /* renamed from: a */
    private final C5830l f14126a;

    /* renamed from: b */
    private final C5734d0 f14127b;

    public C5740e0(C5830l c5830l, C5734d0 c5734d0) {
        this.f14126a = c5830l;
        this.f14127b = c5734d0;
    }

    /* renamed from: a */
    public InterfaceC5945n m23959a(C5921b c5921b, C5801a c5801a) {
        return this.f14127b.m23991c(this.f14126a, c5921b, c5801a);
    }

    /* renamed from: b */
    public InterfaceC5945n m23958b(InterfaceC5945n interfaceC5945n) {
        return m23957c(interfaceC5945n, Collections.emptyList());
    }

    /* renamed from: c */
    public InterfaceC5945n m23957c(InterfaceC5945n interfaceC5945n, List<Long> list) {
        return m23956d(interfaceC5945n, list, false);
    }

    /* renamed from: d */
    public InterfaceC5945n m23956d(InterfaceC5945n interfaceC5945n, List<Long> list, boolean z) {
        return this.f14127b.m23990d(this.f14126a, interfaceC5945n, list, z);
    }

    /* renamed from: e */
    public InterfaceC5945n m23955e(InterfaceC5945n interfaceC5945n) {
        return this.f14127b.m23989e(this.f14126a, interfaceC5945n);
    }

    /* renamed from: f */
    public InterfaceC5945n m23954f(C5830l c5830l, InterfaceC5945n interfaceC5945n, InterfaceC5945n interfaceC5945n2) {
        return this.f14127b.m23988f(this.f14126a, c5830l, interfaceC5945n, interfaceC5945n2);
    }

    /* renamed from: g */
    public C5944m m23953g(InterfaceC5945n interfaceC5945n, C5944m c5944m, boolean z, AbstractC5937h abstractC5937h) {
        return this.f14127b.m23987g(this.f14126a, interfaceC5945n, c5944m, z, abstractC5937h);
    }

    /* renamed from: h */
    public C5740e0 m23952h(C5921b c5921b) {
        return new C5740e0(this.f14126a.m23592J(c5921b), this.f14127b);
    }

    /* renamed from: i */
    public InterfaceC5945n m23951i(C5830l c5830l) {
        return this.f14127b.m23980n(this.f14126a.m23593I(c5830l));
    }
}
