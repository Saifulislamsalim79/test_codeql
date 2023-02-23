package com.google.firebase.database.p139u;

import com.google.firebase.database.p131s.p134i0.C5795m;
import com.google.firebase.database.p139u.AbstractC5940k;
import com.google.firebase.database.p139u.InterfaceC5945n;
/* compiled from: LongNode.java */
/* renamed from: com.google.firebase.database.u.l */
/* loaded from: classes2.dex */
public class C5943l extends AbstractC5940k<C5943l> {

    /* renamed from: e */
    private final long f14585e;

    public C5943l(Long l, InterfaceC5945n interfaceC5945n) {
        super(interfaceC5945n);
        this.f14585e = l.longValue();
    }

    @Override // com.google.firebase.database.p139u.AbstractC5940k
    /* renamed from: F */
    protected AbstractC5940k.EnumC5942b mo23194F() {
        return AbstractC5940k.EnumC5942b.Number;
    }

    @Override // com.google.firebase.database.p139u.InterfaceC5945n
    /* renamed from: K */
    public String mo23193K(InterfaceC5945n.EnumC5947b enumC5947b) {
        return (m23230I(enumC5947b) + "number:") + C5795m.m23748c(this.f14585e);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.database.p139u.AbstractC5940k
    /* renamed from: O */
    public int mo23190e(C5943l c5943l) {
        return C5795m.m23749b(this.f14585e, c5943l.f14585e);
    }

    @Override // com.google.firebase.database.p139u.InterfaceC5945n
    /* renamed from: P */
    public C5943l mo23195D(InterfaceC5945n interfaceC5945n) {
        return new C5943l(Long.valueOf(this.f14585e), interfaceC5945n);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C5943l) {
            C5943l c5943l = (C5943l) obj;
            return this.f14585e == c5943l.f14585e && this.f14577c.equals(c5943l.f14577c);
        }
        return false;
    }

    @Override // com.google.firebase.database.p139u.InterfaceC5945n
    public Object getValue() {
        return Long.valueOf(this.f14585e);
    }

    public int hashCode() {
        long j = this.f14585e;
        return ((int) (j ^ (j >>> 32))) + this.f14577c.hashCode();
    }
}
