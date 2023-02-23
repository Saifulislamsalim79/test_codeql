package com.google.firebase.database.p139u;

import com.google.firebase.database.p131s.p134i0.C5795m;
import com.google.firebase.database.p139u.AbstractC5940k;
import com.google.firebase.database.p139u.InterfaceC5945n;
/* compiled from: DoubleNode.java */
/* renamed from: com.google.firebase.database.u.f */
/* loaded from: classes2.dex */
public class C5935f extends AbstractC5940k<C5935f> {

    /* renamed from: e */
    private final Double f14570e;

    public C5935f(Double d, InterfaceC5945n interfaceC5945n) {
        super(interfaceC5945n);
        this.f14570e = d;
    }

    @Override // com.google.firebase.database.p139u.AbstractC5940k
    /* renamed from: F */
    protected AbstractC5940k.EnumC5942b mo23194F() {
        return AbstractC5940k.EnumC5942b.Number;
    }

    @Override // com.google.firebase.database.p139u.InterfaceC5945n
    /* renamed from: K */
    public String mo23193K(InterfaceC5945n.EnumC5947b enumC5947b) {
        return (m23230I(enumC5947b) + "number:") + C5795m.m23748c(this.f14570e.doubleValue());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.database.p139u.AbstractC5940k
    /* renamed from: O */
    public int mo23190e(C5935f c5935f) {
        return this.f14570e.compareTo(c5935f.f14570e);
    }

    @Override // com.google.firebase.database.p139u.InterfaceC5945n
    /* renamed from: P */
    public C5935f mo23195D(InterfaceC5945n interfaceC5945n) {
        C5795m.m23745f(C5951r.m23200b(interfaceC5945n));
        return new C5935f(this.f14570e, interfaceC5945n);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C5935f) {
            C5935f c5935f = (C5935f) obj;
            return this.f14570e.equals(c5935f.f14570e) && this.f14577c.equals(c5935f.f14577c);
        }
        return false;
    }

    @Override // com.google.firebase.database.p139u.InterfaceC5945n
    public Object getValue() {
        return this.f14570e;
    }

    public int hashCode() {
        return this.f14570e.hashCode() + this.f14577c.hashCode();
    }
}
