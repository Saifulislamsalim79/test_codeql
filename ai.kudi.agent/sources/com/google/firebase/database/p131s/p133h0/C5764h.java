package com.google.firebase.database.p131s.p133h0;

import com.google.firebase.database.p131s.p136j0.C5814i;
/* compiled from: TrackedQuery.java */
/* renamed from: com.google.firebase.database.s.h0.h */
/* loaded from: classes2.dex */
public final class C5764h {

    /* renamed from: a */
    public final long f14185a;

    /* renamed from: b */
    public final C5814i f14186b;

    /* renamed from: c */
    public final long f14187c;

    /* renamed from: d */
    public final boolean f14188d;

    /* renamed from: e */
    public final boolean f14189e;

    public C5764h(long j, C5814i c5814i, long j2, boolean z, boolean z2) {
        this.f14185a = j;
        if (c5814i.m23641g() && !c5814i.m23642f()) {
            throw new IllegalArgumentException("Can't create TrackedQuery for a non-default query that loads all data");
        }
        this.f14186b = c5814i;
        this.f14187c = j2;
        this.f14188d = z;
        this.f14189e = z2;
    }

    /* renamed from: a */
    public C5764h m23845a(boolean z) {
        return new C5764h(this.f14185a, this.f14186b, this.f14187c, this.f14188d, z);
    }

    /* renamed from: b */
    public C5764h m23844b() {
        return new C5764h(this.f14185a, this.f14186b, this.f14187c, true, this.f14189e);
    }

    /* renamed from: c */
    public C5764h m23843c(long j) {
        return new C5764h(this.f14185a, this.f14186b, j, this.f14188d, this.f14189e);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != C5764h.class) {
            return false;
        }
        C5764h c5764h = (C5764h) obj;
        return this.f14185a == c5764h.f14185a && this.f14186b.equals(c5764h.f14186b) && this.f14187c == c5764h.f14187c && this.f14188d == c5764h.f14188d && this.f14189e == c5764h.f14189e;
    }

    public int hashCode() {
        return (((((((Long.valueOf(this.f14185a).hashCode() * 31) + this.f14186b.hashCode()) * 31) + Long.valueOf(this.f14187c).hashCode()) * 31) + Boolean.valueOf(this.f14188d).hashCode()) * 31) + Boolean.valueOf(this.f14189e).hashCode();
    }

    public String toString() {
        return "TrackedQuery{id=" + this.f14185a + ", querySpec=" + this.f14186b + ", lastUse=" + this.f14187c + ", complete=" + this.f14188d + ", active=" + this.f14189e + "}";
    }
}
