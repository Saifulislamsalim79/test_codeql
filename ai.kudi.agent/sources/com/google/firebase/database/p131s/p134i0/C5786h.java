package com.google.firebase.database.p131s.p134i0;

import com.google.firebase.database.p131s.C5830l;
import com.google.firebase.database.p131s.C5859o;
/* compiled from: ParsedUrl.java */
/* renamed from: com.google.firebase.database.s.i0.h */
/* loaded from: classes2.dex */
public final class C5786h {

    /* renamed from: a */
    public C5859o f14217a;

    /* renamed from: b */
    public C5830l f14218b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5786h.class != obj.getClass()) {
            return false;
        }
        C5786h c5786h = (C5786h) obj;
        if (this.f14217a.equals(c5786h.f14217a)) {
            return this.f14218b.equals(c5786h.f14218b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f14217a.hashCode() * 31) + this.f14218b.hashCode();
    }
}
