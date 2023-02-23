package com.google.firebase.database.p131s;

import com.google.firebase.p166l.C6469a;
/* compiled from: RepoInfo.java */
/* renamed from: com.google.firebase.database.s.o */
/* loaded from: classes2.dex */
public final class C5859o {

    /* renamed from: a */
    public String f14399a;

    /* renamed from: b */
    public boolean f14400b;

    /* renamed from: c */
    public String f14401c;

    /* renamed from: a */
    public void m23495a(C6469a c6469a) {
        if (c6469a == null) {
            return;
        }
        c6469a.m21937a();
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5859o.class != obj.getClass()) {
            return false;
        }
        C5859o c5859o = (C5859o) obj;
        if (this.f14400b == c5859o.f14400b && this.f14399a.equals(c5859o.f14399a)) {
            return this.f14401c.equals(c5859o.f14401c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f14399a.hashCode() * 31) + (this.f14400b ? 1 : 0)) * 31) + this.f14401c.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("http");
        sb.append(this.f14400b ? "s" : "");
        sb.append("://");
        sb.append(this.f14399a);
        return sb.toString();
    }
}
