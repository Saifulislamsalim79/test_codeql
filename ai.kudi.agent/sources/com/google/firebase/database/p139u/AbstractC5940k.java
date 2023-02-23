package com.google.firebase.database.p139u;

import com.google.firebase.database.p131s.C5830l;
import com.google.firebase.database.p131s.p134i0.C5795m;
import com.google.firebase.database.p139u.AbstractC5940k;
import com.google.firebase.database.p139u.InterfaceC5945n;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
/* compiled from: LeafNode.java */
/* renamed from: com.google.firebase.database.u.k */
/* loaded from: classes2.dex */
public abstract class AbstractC5940k<T extends AbstractC5940k> implements InterfaceC5945n {

    /* renamed from: c */
    protected final InterfaceC5945n f14577c;

    /* renamed from: d */
    private String f14578d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LeafNode.java */
    /* renamed from: com.google.firebase.database.u.k$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C5941a {

        /* renamed from: a */
        static final /* synthetic */ int[] f14579a;

        static {
            int[] iArr = new int[InterfaceC5945n.EnumC5947b.values().length];
            f14579a = iArr;
            try {
                iArr[InterfaceC5945n.EnumC5947b.V1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14579a[InterfaceC5945n.EnumC5947b.V2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: LeafNode.java */
    /* renamed from: com.google.firebase.database.u.k$b */
    /* loaded from: classes2.dex */
    public enum EnumC5942b {
        DeferredValue,
        Boolean,
        Number,
        String
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC5940k(InterfaceC5945n interfaceC5945n) {
        this.f14577c = interfaceC5945n;
    }

    /* renamed from: h */
    private static int m23228h(C5943l c5943l, C5935f c5935f) {
        return Double.valueOf(((Long) c5943l.getValue()).longValue()).compareTo((Double) c5935f.getValue());
    }

    @Override // com.google.firebase.database.p139u.InterfaceC5945n
    /* renamed from: B */
    public InterfaceC5945n mo23220B(C5830l c5830l) {
        if (c5830l.isEmpty()) {
            return this;
        }
        if (c5830l.m23587Z().m23292p()) {
            return this.f14577c;
        }
        return C5936g.m23249P();
    }

    /* renamed from: F */
    protected abstract EnumC5942b mo23194F();

    @Override // com.google.firebase.database.p139u.InterfaceC5945n
    /* renamed from: G */
    public C5921b mo23219G(C5921b c5921b) {
        return null;
    }

    @Override // com.google.firebase.database.p139u.InterfaceC5945n
    /* renamed from: H */
    public InterfaceC5945n mo23218H(C5830l c5830l, InterfaceC5945n interfaceC5945n) {
        C5921b m23587Z = c5830l.m23587Z();
        if (m23587Z == null) {
            return interfaceC5945n;
        }
        if (!interfaceC5945n.isEmpty() || m23587Z.m23292p()) {
            boolean z = true;
            if (c5830l.m23587Z().m23292p() && c5830l.size() != 1) {
                z = false;
            }
            C5795m.m23745f(z);
            return mo23216T(m23587Z, C5936g.m23249P().mo23218H(c5830l.m23583e0(), interfaceC5945n));
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: I */
    public String m23230I(InterfaceC5945n.EnumC5947b enumC5947b) {
        int i = C5941a.f14579a[enumC5947b.ordinal()];
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException("Unknown hash version: " + enumC5947b);
        } else if (this.f14577c.isEmpty()) {
            return "";
        } else {
            return "priority:" + this.f14577c.mo23193K(enumC5947b) + ":";
        }
    }

    /* renamed from: J */
    protected int m23229J(AbstractC5940k<?> abstractC5940k) {
        EnumC5942b mo23194F = mo23194F();
        EnumC5942b mo23194F2 = abstractC5940k.mo23194F();
        if (mo23194F.equals(mo23194F2)) {
            return mo23190e(abstractC5940k);
        }
        return mo23194F.compareTo(mo23194F2);
    }

    @Override // com.google.firebase.database.p139u.InterfaceC5945n
    /* renamed from: L */
    public InterfaceC5945n mo23211L(C5921b c5921b) {
        if (c5921b.m23292p()) {
            return this.f14577c;
        }
        return C5936g.m23249P();
    }

    @Override // com.google.firebase.database.p139u.InterfaceC5945n
    /* renamed from: N */
    public boolean mo23217N() {
        return true;
    }

    @Override // com.google.firebase.database.p139u.InterfaceC5945n
    /* renamed from: R */
    public boolean mo23210R(C5921b c5921b) {
        return false;
    }

    @Override // com.google.firebase.database.p139u.InterfaceC5945n
    /* renamed from: T */
    public InterfaceC5945n mo23216T(C5921b c5921b, InterfaceC5945n interfaceC5945n) {
        if (c5921b.m23292p()) {
            return mo23195D(interfaceC5945n);
        }
        return interfaceC5945n.isEmpty() ? this : C5936g.m23249P().mo23216T(c5921b, interfaceC5945n).mo23195D(this.f14577c);
    }

    @Override // com.google.firebase.database.p139u.InterfaceC5945n
    /* renamed from: W */
    public Object mo23215W(boolean z) {
        if (z && !this.f14577c.isEmpty()) {
            HashMap hashMap = new HashMap();
            hashMap.put(".value", getValue());
            hashMap.put(".priority", this.f14577c.getValue());
            return hashMap;
        }
        return getValue();
    }

    @Override // com.google.firebase.database.p139u.InterfaceC5945n
    /* renamed from: a0 */
    public Iterator<C5944m> mo23214a0() {
        return Collections.emptyList().iterator();
    }

    /* renamed from: e */
    protected abstract int mo23190e(T t);

    @Override // com.google.firebase.database.p139u.InterfaceC5945n
    public boolean isEmpty() {
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator<C5944m> iterator() {
        return Collections.emptyList().iterator();
    }

    @Override // java.lang.Comparable
    /* renamed from: m */
    public int compareTo(InterfaceC5945n interfaceC5945n) {
        if (interfaceC5945n.isEmpty()) {
            return 1;
        }
        if (interfaceC5945n instanceof C5924c) {
            return -1;
        }
        C5795m.m23744g(interfaceC5945n.mo23217N(), "Node is not leaf node!");
        if ((this instanceof C5943l) && (interfaceC5945n instanceof C5935f)) {
            return m23228h((C5943l) this, (C5935f) interfaceC5945n);
        }
        if ((this instanceof C5935f) && (interfaceC5945n instanceof C5943l)) {
            return m23228h((C5943l) interfaceC5945n, (C5935f) this) * (-1);
        }
        return m23229J((AbstractC5940k) interfaceC5945n);
    }

    @Override // com.google.firebase.database.p139u.InterfaceC5945n
    /* renamed from: o */
    public int mo23213o() {
        return 0;
    }

    @Override // com.google.firebase.database.p139u.InterfaceC5945n
    /* renamed from: t */
    public String mo23212t() {
        if (this.f14578d == null) {
            this.f14578d = C5795m.m23742i(mo23193K(InterfaceC5945n.EnumC5947b.V1));
        }
        return this.f14578d;
    }

    public String toString() {
        String obj = mo23215W(true).toString();
        if (obj.length() <= 100) {
            return obj;
        }
        return obj.substring(0, 100) + "...";
    }

    @Override // com.google.firebase.database.p139u.InterfaceC5945n
    /* renamed from: x */
    public InterfaceC5945n mo23208x() {
        return this.f14577c;
    }
}
