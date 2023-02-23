package com.google.firebase.database.p139u;

import com.google.firebase.database.p139u.AbstractC5940k;
import com.google.firebase.database.p139u.InterfaceC5945n;
/* compiled from: BooleanNode.java */
/* renamed from: com.google.firebase.database.u.a */
/* loaded from: classes2.dex */
public class C5920a extends AbstractC5940k<C5920a> {

    /* renamed from: e */
    private final boolean f14543e;

    public C5920a(Boolean bool, InterfaceC5945n interfaceC5945n) {
        super(interfaceC5945n);
        this.f14543e = bool.booleanValue();
    }

    @Override // com.google.firebase.database.p139u.AbstractC5940k
    /* renamed from: F */
    protected AbstractC5940k.EnumC5942b mo23194F() {
        return AbstractC5940k.EnumC5942b.Boolean;
    }

    @Override // com.google.firebase.database.p139u.InterfaceC5945n
    /* renamed from: K */
    public String mo23193K(InterfaceC5945n.EnumC5947b enumC5947b) {
        return m23230I(enumC5947b) + "boolean:" + this.f14543e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.database.p139u.AbstractC5940k
    /* renamed from: O */
    public int mo23190e(C5920a c5920a) {
        boolean z = this.f14543e;
        if (z == c5920a.f14543e) {
            return 0;
        }
        return z ? 1 : -1;
    }

    @Override // com.google.firebase.database.p139u.InterfaceC5945n
    /* renamed from: P */
    public C5920a mo23195D(InterfaceC5945n interfaceC5945n) {
        return new C5920a(Boolean.valueOf(this.f14543e), interfaceC5945n);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C5920a) {
            C5920a c5920a = (C5920a) obj;
            return this.f14543e == c5920a.f14543e && this.f14577c.equals(c5920a.f14577c);
        }
        return false;
    }

    @Override // com.google.firebase.database.p139u.InterfaceC5945n
    public Object getValue() {
        return Boolean.valueOf(this.f14543e);
    }

    public int hashCode() {
        boolean z = this.f14543e;
        return (z ? 1 : 0) + this.f14577c.hashCode();
    }
}
