package com.google.firebase.database.p131s.p136j0;

import com.google.firebase.database.p131s.C5830l;
import com.google.firebase.database.p139u.C5921b;
import com.google.firebase.database.p139u.C5938i;
import com.google.firebase.database.p139u.InterfaceC5945n;
/* compiled from: CacheNode.java */
/* renamed from: com.google.firebase.database.s.j0.a */
/* loaded from: classes2.dex */
public class C5801a {

    /* renamed from: a */
    private final C5938i f14243a;

    /* renamed from: b */
    private final boolean f14244b;

    /* renamed from: c */
    private final boolean f14245c;

    public C5801a(C5938i c5938i, boolean z, boolean z2) {
        this.f14243a = c5938i;
        this.f14244b = z;
        this.f14245c = z2;
    }

    /* renamed from: a */
    public C5938i m23695a() {
        return this.f14243a;
    }

    /* renamed from: b */
    public InterfaceC5945n m23694b() {
        return this.f14243a.m23236l();
    }

    /* renamed from: c */
    public boolean m23693c(C5921b c5921b) {
        return (m23690f() && !this.f14245c) || this.f14243a.m23236l().mo23210R(c5921b);
    }

    /* renamed from: d */
    public boolean m23692d(C5830l c5830l) {
        if (c5830l.isEmpty()) {
            return m23690f() && !this.f14245c;
        }
        return m23693c(c5830l.m23587Z());
    }

    /* renamed from: e */
    public boolean m23691e() {
        return this.f14245c;
    }

    /* renamed from: f */
    public boolean m23690f() {
        return this.f14244b;
    }
}
