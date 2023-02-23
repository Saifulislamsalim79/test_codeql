package com.google.firebase.database.p131s.p132g0;

import com.google.firebase.database.p131s.C5830l;
import com.google.firebase.database.p131s.p132g0.AbstractC5748d;
import com.google.firebase.database.p131s.p134i0.C5795m;
import com.google.firebase.database.p139u.C5921b;
/* compiled from: ListenComplete.java */
/* renamed from: com.google.firebase.database.s.g0.b */
/* loaded from: classes2.dex */
public class C5746b extends AbstractC5748d {
    public C5746b(C5750e c5750e, C5830l c5830l) {
        super(AbstractC5748d.EnumC5749a.ListenComplete, c5750e, c5830l);
        C5795m.m23744g(!c5750e.m23902d(), "Can't have a listen complete from a user source");
    }

    @Override // com.google.firebase.database.p131s.p132g0.AbstractC5748d
    /* renamed from: d */
    public AbstractC5748d mo23900d(C5921b c5921b) {
        if (this.f14157c.isEmpty()) {
            return new C5746b(this.f14156b, C5830l.m23588X());
        }
        return new C5746b(this.f14156b, this.f14157c.m23583e0());
    }

    public String toString() {
        return String.format("ListenComplete { path=%s, source=%s }", m23908a(), m23907b());
    }
}
