package com.google.firebase.database.p131s.p132g0;

import com.google.firebase.database.p131s.C5830l;
import com.google.firebase.database.p131s.p132g0.AbstractC5748d;
import com.google.firebase.database.p131s.p134i0.C5779d;
import com.google.firebase.database.p131s.p134i0.C5795m;
import com.google.firebase.database.p139u.C5921b;
/* compiled from: AckUserWrite.java */
/* renamed from: com.google.firebase.database.s.g0.a */
/* loaded from: classes2.dex */
public class C5745a extends AbstractC5748d {

    /* renamed from: d */
    private final boolean f14152d;

    /* renamed from: e */
    private final C5779d<Boolean> f14153e;

    public C5745a(C5830l c5830l, C5779d<Boolean> c5779d, boolean z) {
        super(AbstractC5748d.EnumC5749a.AckUserWrite, C5750e.f14163d, c5830l);
        this.f14153e = c5779d;
        this.f14152d = z;
    }

    @Override // com.google.firebase.database.p131s.p132g0.AbstractC5748d
    /* renamed from: d */
    public AbstractC5748d mo23900d(C5921b c5921b) {
        if (!this.f14157c.isEmpty()) {
            C5795m.m23744g(this.f14157c.m23587Z().equals(c5921b), "operationForChild called for unrelated child.");
            return new C5745a(this.f14157c.m23583e0(), this.f14153e, this.f14152d);
        } else if (this.f14153e.getValue() != null) {
            C5795m.m23744g(this.f14153e.m23795E().isEmpty(), "affectedTree should not have overlapping affected paths.");
            return this;
        } else {
            return new C5745a(C5830l.m23588X(), this.f14153e.m23788X(new C5830l(c5921b)), this.f14152d);
        }
    }

    /* renamed from: e */
    public C5779d<Boolean> m23911e() {
        return this.f14153e;
    }

    /* renamed from: f */
    public boolean m23910f() {
        return this.f14152d;
    }

    public String toString() {
        return String.format("AckUserWrite { path=%s, revert=%s, affectedTree=%s }", m23908a(), Boolean.valueOf(this.f14152d), this.f14153e);
    }
}
