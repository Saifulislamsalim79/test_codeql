package com.google.firebase.database.p131s.p132g0;

import com.google.firebase.database.p131s.C5830l;
import com.google.firebase.database.p131s.p132g0.AbstractC5748d;
import com.google.firebase.database.p139u.C5921b;
import com.google.firebase.database.p139u.InterfaceC5945n;
/* compiled from: Overwrite.java */
/* renamed from: com.google.firebase.database.s.g0.f */
/* loaded from: classes2.dex */
public class C5752f extends AbstractC5748d {

    /* renamed from: d */
    private final InterfaceC5945n f14171d;

    public C5752f(C5750e c5750e, C5830l c5830l, InterfaceC5945n interfaceC5945n) {
        super(AbstractC5748d.EnumC5749a.Overwrite, c5750e, c5830l);
        this.f14171d = interfaceC5945n;
    }

    @Override // com.google.firebase.database.p131s.p132g0.AbstractC5748d
    /* renamed from: d */
    public AbstractC5748d mo23900d(C5921b c5921b) {
        if (this.f14157c.isEmpty()) {
            return new C5752f(this.f14156b, C5830l.m23588X(), this.f14171d.mo23211L(c5921b));
        }
        return new C5752f(this.f14156b, this.f14157c.m23583e0(), this.f14171d);
    }

    /* renamed from: e */
    public InterfaceC5945n m23899e() {
        return this.f14171d;
    }

    public String toString() {
        return String.format("Overwrite { path=%s, source=%s, snapshot=%s }", m23908a(), m23907b(), this.f14171d);
    }
}
