package com.google.firebase.database.p139u;

import com.google.firebase.database.p131s.p134i0.C5795m;
import com.google.firebase.database.p139u.AbstractC5940k;
import com.google.firebase.database.p139u.InterfaceC5945n;
/* compiled from: StringNode.java */
/* renamed from: com.google.firebase.database.u.t */
/* loaded from: classes2.dex */
public class C5953t extends AbstractC5940k<C5953t> {

    /* renamed from: e */
    private final String f14599e;

    /* compiled from: StringNode.java */
    /* renamed from: com.google.firebase.database.u.t$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class C5954a {

        /* renamed from: a */
        static final /* synthetic */ int[] f14600a;

        static {
            int[] iArr = new int[InterfaceC5945n.EnumC5947b.values().length];
            f14600a = iArr;
            try {
                iArr[InterfaceC5945n.EnumC5947b.V1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14600a[InterfaceC5945n.EnumC5947b.V2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C5953t(String str, InterfaceC5945n interfaceC5945n) {
        super(interfaceC5945n);
        this.f14599e = str;
    }

    @Override // com.google.firebase.database.p139u.AbstractC5940k
    /* renamed from: F */
    protected AbstractC5940k.EnumC5942b mo23194F() {
        return AbstractC5940k.EnumC5942b.String;
    }

    @Override // com.google.firebase.database.p139u.InterfaceC5945n
    /* renamed from: K */
    public String mo23193K(InterfaceC5945n.EnumC5947b enumC5947b) {
        int i = C5954a.f14600a[enumC5947b.ordinal()];
        if (i == 1) {
            return m23230I(enumC5947b) + "string:" + this.f14599e;
        } else if (i == 2) {
            return m23230I(enumC5947b) + "string:" + C5795m.m23741j(this.f14599e);
        } else {
            throw new IllegalArgumentException("Invalid hash version for string node: " + enumC5947b);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.firebase.database.p139u.AbstractC5940k
    /* renamed from: O */
    public int mo23190e(C5953t c5953t) {
        return this.f14599e.compareTo(c5953t.f14599e);
    }

    @Override // com.google.firebase.database.p139u.InterfaceC5945n
    /* renamed from: P */
    public C5953t mo23195D(InterfaceC5945n interfaceC5945n) {
        return new C5953t(this.f14599e, interfaceC5945n);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C5953t) {
            C5953t c5953t = (C5953t) obj;
            return this.f14599e.equals(c5953t.f14599e) && this.f14577c.equals(c5953t.f14577c);
        }
        return false;
    }

    @Override // com.google.firebase.database.p139u.InterfaceC5945n
    public Object getValue() {
        return this.f14599e;
    }

    public int hashCode() {
        return this.f14599e.hashCode() + this.f14577c.hashCode();
    }
}
