package com.google.firebase.database.p131s.p136j0;

import com.google.firebase.database.p131s.C5830l;
import com.google.firebase.database.p139u.AbstractC5937h;
import java.util.Map;
/* compiled from: QuerySpec.java */
/* renamed from: com.google.firebase.database.s.j0.i */
/* loaded from: classes2.dex */
public final class C5814i {

    /* renamed from: a */
    private final C5830l f14282a;

    /* renamed from: b */
    private final C5811h f14283b;

    public C5814i(C5830l c5830l, C5811h c5811h) {
        this.f14282a = c5830l;
        this.f14283b = c5811h;
    }

    /* renamed from: a */
    public static C5814i m23647a(C5830l c5830l) {
        return new C5814i(c5830l, C5811h.f14269i);
    }

    /* renamed from: b */
    public static C5814i m23646b(C5830l c5830l, Map<String, Object> map) {
        return new C5814i(c5830l, C5811h.m23664a(map));
    }

    /* renamed from: c */
    public AbstractC5937h m23645c() {
        return this.f14283b.m23663b();
    }

    /* renamed from: d */
    public C5811h m23644d() {
        return this.f14283b;
    }

    /* renamed from: e */
    public C5830l m23643e() {
        return this.f14282a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5814i.class != obj.getClass()) {
            return false;
        }
        C5814i c5814i = (C5814i) obj;
        return this.f14282a.equals(c5814i.f14282a) && this.f14283b.equals(c5814i.f14283b);
    }

    /* renamed from: f */
    public boolean m23642f() {
        return this.f14283b.m23652m();
    }

    /* renamed from: g */
    public boolean m23641g() {
        return this.f14283b.m23650o();
    }

    public int hashCode() {
        return (this.f14282a.hashCode() * 31) + this.f14283b.hashCode();
    }

    public String toString() {
        return this.f14282a + ":" + this.f14283b;
    }
}
