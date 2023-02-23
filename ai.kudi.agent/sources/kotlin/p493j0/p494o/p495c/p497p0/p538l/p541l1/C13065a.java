package kotlin.p493j0.p494o.p495c.p497p0.p538l.p541l1;

import java.util.ArrayList;
/* compiled from: TypeSystemContext.kt */
/* renamed from: kotlin.j0.o.c.p0.l.l1.a */
/* loaded from: classes3.dex */
public final class C13065a extends ArrayList<InterfaceC13076l> implements InterfaceC13075k {
    public C13065a(int i) {
        super(i);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof InterfaceC13076l) {
            return m6006d((InterfaceC13076l) obj);
        }
        return false;
    }

    /* renamed from: d */
    public /* bridge */ boolean m6006d(InterfaceC13076l interfaceC13076l) {
        return super.contains(interfaceC13076l);
    }

    /* renamed from: e */
    public /* bridge */ int m6005e() {
        return super.size();
    }

    /* renamed from: f */
    public /* bridge */ int m6004f(InterfaceC13076l interfaceC13076l) {
        return super.indexOf(interfaceC13076l);
    }

    /* renamed from: h */
    public /* bridge */ int m6003h(InterfaceC13076l interfaceC13076l) {
        return super.lastIndexOf(interfaceC13076l);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof InterfaceC13076l) {
            return m6004f((InterfaceC13076l) obj);
        }
        return -1;
    }

    /* renamed from: k */
    public /* bridge */ boolean m6002k(InterfaceC13076l interfaceC13076l) {
        return super.remove(interfaceC13076l);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof InterfaceC13076l) {
            return m6003h((InterfaceC13076l) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof InterfaceC13076l) {
            return m6002k((InterfaceC13076l) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return m6005e();
    }
}
