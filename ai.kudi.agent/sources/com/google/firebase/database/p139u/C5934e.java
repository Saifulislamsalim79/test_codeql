package com.google.firebase.database.p139u;

import com.google.firebase.database.p131s.p134i0.C5795m;
import com.google.firebase.database.p139u.AbstractC5940k;
import com.google.firebase.database.p139u.InterfaceC5945n;
import java.util.Map;
/* compiled from: DeferredValueNode.java */
/* renamed from: com.google.firebase.database.u.e */
/* loaded from: classes2.dex */
public class C5934e extends AbstractC5940k<C5934e> {

    /* renamed from: e */
    private Map<Object, Object> f14569e;

    public C5934e(Map<Object, Object> map, InterfaceC5945n interfaceC5945n) {
        super(interfaceC5945n);
        this.f14569e = map;
    }

    @Override // com.google.firebase.database.p139u.AbstractC5940k
    /* renamed from: F */
    protected AbstractC5940k.EnumC5942b mo23194F() {
        return AbstractC5940k.EnumC5942b.DeferredValue;
    }

    @Override // com.google.firebase.database.p139u.InterfaceC5945n
    /* renamed from: K */
    public String mo23193K(InterfaceC5945n.EnumC5947b enumC5947b) {
        return m23230I(enumC5947b) + "deferredValue:" + this.f14569e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.database.p139u.AbstractC5940k
    /* renamed from: O */
    public int mo23190e(C5934e c5934e) {
        return 0;
    }

    @Override // com.google.firebase.database.p139u.InterfaceC5945n
    /* renamed from: P */
    public C5934e mo23195D(InterfaceC5945n interfaceC5945n) {
        C5795m.m23745f(C5951r.m23200b(interfaceC5945n));
        return new C5934e(this.f14569e, interfaceC5945n);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C5934e) {
            C5934e c5934e = (C5934e) obj;
            return this.f14569e.equals(c5934e.f14569e) && this.f14577c.equals(c5934e.f14577c);
        }
        return false;
    }

    @Override // com.google.firebase.database.p139u.InterfaceC5945n
    public Object getValue() {
        return this.f14569e;
    }

    public int hashCode() {
        return this.f14569e.hashCode() + this.f14577c.hashCode();
    }
}
