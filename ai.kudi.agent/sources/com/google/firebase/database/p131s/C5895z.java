package com.google.firebase.database.p131s;

import com.google.firebase.database.p139u.InterfaceC5945n;
/* compiled from: UserWriteRecord.java */
/* renamed from: com.google.firebase.database.s.z */
/* loaded from: classes2.dex */
public final class C5895z {

    /* renamed from: a */
    private final long f14479a;

    /* renamed from: b */
    private final C5830l f14480b;

    /* renamed from: c */
    private final InterfaceC5945n f14481c;

    /* renamed from: d */
    private final C5737e f14482d;

    /* renamed from: e */
    private final boolean f14483e;

    public C5895z(long j, C5830l c5830l, InterfaceC5945n interfaceC5945n, boolean z) {
        this.f14479a = j;
        this.f14480b = c5830l;
        this.f14481c = interfaceC5945n;
        this.f14482d = null;
        this.f14483e = z;
    }

    /* renamed from: a */
    public C5737e m23379a() {
        C5737e c5737e = this.f14482d;
        if (c5737e != null) {
            return c5737e;
        }
        throw new IllegalArgumentException("Can't access merge when write is an overwrite!");
    }

    /* renamed from: b */
    public InterfaceC5945n m23378b() {
        InterfaceC5945n interfaceC5945n = this.f14481c;
        if (interfaceC5945n != null) {
            return interfaceC5945n;
        }
        throw new IllegalArgumentException("Can't access overwrite when write is a merge!");
    }

    /* renamed from: c */
    public C5830l m23377c() {
        return this.f14480b;
    }

    /* renamed from: d */
    public long m23376d() {
        return this.f14479a;
    }

    /* renamed from: e */
    public boolean m23375e() {
        return this.f14481c != null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5895z.class != obj.getClass()) {
            return false;
        }
        C5895z c5895z = (C5895z) obj;
        if (this.f14479a == c5895z.f14479a && this.f14480b.equals(c5895z.f14480b) && this.f14483e == c5895z.f14483e) {
            InterfaceC5945n interfaceC5945n = this.f14481c;
            if (interfaceC5945n == null ? c5895z.f14481c == null : interfaceC5945n.equals(c5895z.f14481c)) {
                C5737e c5737e = this.f14482d;
                C5737e c5737e2 = c5895z.f14482d;
                return c5737e == null ? c5737e2 == null : c5737e.equals(c5737e2);
            }
            return false;
        }
        return false;
    }

    /* renamed from: f */
    public boolean m23374f() {
        return this.f14483e;
    }

    public int hashCode() {
        int hashCode = ((((Long.valueOf(this.f14479a).hashCode() * 31) + Boolean.valueOf(this.f14483e).hashCode()) * 31) + this.f14480b.hashCode()) * 31;
        InterfaceC5945n interfaceC5945n = this.f14481c;
        int hashCode2 = (hashCode + (interfaceC5945n != null ? interfaceC5945n.hashCode() : 0)) * 31;
        C5737e c5737e = this.f14482d;
        return hashCode2 + (c5737e != null ? c5737e.hashCode() : 0);
    }

    public String toString() {
        return "UserWriteRecord{id=" + this.f14479a + " path=" + this.f14480b + " visible=" + this.f14483e + " overwrite=" + this.f14481c + " merge=" + this.f14482d + "}";
    }

    public C5895z(long j, C5830l c5830l, C5737e c5737e) {
        this.f14479a = j;
        this.f14480b = c5830l;
        this.f14481c = null;
        this.f14482d = c5737e;
        this.f14483e = true;
    }
}
