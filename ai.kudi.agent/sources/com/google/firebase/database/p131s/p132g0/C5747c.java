package com.google.firebase.database.p131s.p132g0;

import com.google.firebase.database.p131s.C5737e;
import com.google.firebase.database.p131s.C5830l;
import com.google.firebase.database.p131s.p132g0.AbstractC5748d;
import com.google.firebase.database.p139u.C5921b;
/* compiled from: Merge.java */
/* renamed from: com.google.firebase.database.s.g0.c */
/* loaded from: classes2.dex */
public class C5747c extends AbstractC5748d {

    /* renamed from: d */
    private final C5737e f14154d;

    public C5747c(C5750e c5750e, C5830l c5830l, C5737e c5737e) {
        super(AbstractC5748d.EnumC5749a.Merge, c5750e, c5830l);
        this.f14154d = c5737e;
    }

    @Override // com.google.firebase.database.p131s.p132g0.AbstractC5748d
    /* renamed from: d */
    public AbstractC5748d mo23900d(C5921b c5921b) {
        if (this.f14157c.isEmpty()) {
            C5737e m23965l = this.f14154d.m23965l(new C5830l(c5921b));
            if (m23965l.isEmpty()) {
                return null;
            }
            if (m23965l.m23971V() != null) {
                return new C5752f(this.f14156b, C5830l.m23588X(), m23965l.m23971V());
            }
            return new C5747c(this.f14156b, C5830l.m23588X(), m23965l);
        } else if (this.f14157c.m23587Z().equals(c5921b)) {
            return new C5747c(this.f14156b, this.f14157c.m23583e0(), this.f14154d);
        } else {
            return null;
        }
    }

    /* renamed from: e */
    public C5737e m23909e() {
        return this.f14154d;
    }

    public String toString() {
        return String.format("Merge { path=%s, source=%s, children=%s }", m23908a(), m23907b(), this.f14154d);
    }
}
