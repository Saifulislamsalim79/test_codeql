package com.google.firebase.database.p139u;

import com.google.firebase.database.p131s.C5830l;
import com.google.firebase.database.p139u.InterfaceC5945n;
import java.util.Collections;
import java.util.Iterator;
/* compiled from: EmptyNode.java */
/* renamed from: com.google.firebase.database.u.g */
/* loaded from: classes2.dex */
public class C5936g extends C5924c implements InterfaceC5945n {

    /* renamed from: w */
    private static final C5936g f14571w = new C5936g();

    private C5936g() {
    }

    /* renamed from: P */
    public static C5936g m23249P() {
        return f14571w;
    }

    @Override // com.google.firebase.database.p139u.C5924c, com.google.firebase.database.p139u.InterfaceC5945n
    /* renamed from: B */
    public InterfaceC5945n mo23220B(C5830l c5830l) {
        return this;
    }

    @Override // com.google.firebase.database.p139u.C5924c, com.google.firebase.database.p139u.InterfaceC5945n
    /* renamed from: D */
    public /* bridge */ /* synthetic */ InterfaceC5945n mo23195D(InterfaceC5945n interfaceC5945n) {
        m23248V(interfaceC5945n);
        return this;
    }

    @Override // com.google.firebase.database.p139u.C5924c, com.google.firebase.database.p139u.InterfaceC5945n
    /* renamed from: G */
    public C5921b mo23219G(C5921b c5921b) {
        return null;
    }

    @Override // com.google.firebase.database.p139u.C5924c, com.google.firebase.database.p139u.InterfaceC5945n
    /* renamed from: H */
    public InterfaceC5945n mo23218H(C5830l c5830l, InterfaceC5945n interfaceC5945n) {
        if (c5830l.isEmpty()) {
            return interfaceC5945n;
        }
        C5921b m23587Z = c5830l.m23587Z();
        mo23211L(m23587Z);
        return mo23216T(m23587Z, mo23218H(c5830l.m23583e0(), interfaceC5945n));
    }

    @Override // com.google.firebase.database.p139u.C5924c, com.google.firebase.database.p139u.InterfaceC5945n
    /* renamed from: K */
    public String mo23193K(InterfaceC5945n.EnumC5947b enumC5947b) {
        return "";
    }

    @Override // com.google.firebase.database.p139u.C5924c, com.google.firebase.database.p139u.InterfaceC5945n
    /* renamed from: L */
    public InterfaceC5945n mo23211L(C5921b c5921b) {
        return this;
    }

    @Override // com.google.firebase.database.p139u.C5924c, com.google.firebase.database.p139u.InterfaceC5945n
    /* renamed from: N */
    public boolean mo23217N() {
        return false;
    }

    @Override // com.google.firebase.database.p139u.C5924c, com.google.firebase.database.p139u.InterfaceC5945n
    /* renamed from: R */
    public boolean mo23210R(C5921b c5921b) {
        return false;
    }

    @Override // com.google.firebase.database.p139u.C5924c, com.google.firebase.database.p139u.InterfaceC5945n
    /* renamed from: T */
    public InterfaceC5945n mo23216T(C5921b c5921b, InterfaceC5945n interfaceC5945n) {
        return (interfaceC5945n.isEmpty() || c5921b.m23292p()) ? this : new C5924c().mo23216T(c5921b, interfaceC5945n);
    }

    /* renamed from: V */
    public C5936g m23248V(InterfaceC5945n interfaceC5945n) {
        return this;
    }

    @Override // com.google.firebase.database.p139u.C5924c, com.google.firebase.database.p139u.InterfaceC5945n
    /* renamed from: W */
    public Object mo23215W(boolean z) {
        return null;
    }

    @Override // com.google.firebase.database.p139u.C5924c, com.google.firebase.database.p139u.InterfaceC5945n
    /* renamed from: a0 */
    public Iterator<C5944m> mo23214a0() {
        return Collections.emptyList().iterator();
    }

    @Override // com.google.firebase.database.p139u.C5924c
    public boolean equals(Object obj) {
        if (obj instanceof C5936g) {
            return true;
        }
        if (obj instanceof InterfaceC5945n) {
            InterfaceC5945n interfaceC5945n = (InterfaceC5945n) obj;
            if (interfaceC5945n.isEmpty()) {
                mo23208x();
                if (equals(interfaceC5945n.mo23208x())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.database.p139u.C5924c, com.google.firebase.database.p139u.InterfaceC5945n
    public Object getValue() {
        return null;
    }

    @Override // com.google.firebase.database.p139u.C5924c, java.lang.Comparable
    /* renamed from: h */
    public int compareTo(InterfaceC5945n interfaceC5945n) {
        return interfaceC5945n.isEmpty() ? 0 : -1;
    }

    @Override // com.google.firebase.database.p139u.C5924c
    public int hashCode() {
        return 0;
    }

    @Override // com.google.firebase.database.p139u.C5924c, com.google.firebase.database.p139u.InterfaceC5945n
    public boolean isEmpty() {
        return true;
    }

    @Override // com.google.firebase.database.p139u.C5924c, java.lang.Iterable
    public Iterator<C5944m> iterator() {
        return Collections.emptyList().iterator();
    }

    @Override // com.google.firebase.database.p139u.C5924c, com.google.firebase.database.p139u.InterfaceC5945n
    /* renamed from: o */
    public int mo23213o() {
        return 0;
    }

    @Override // com.google.firebase.database.p139u.C5924c, com.google.firebase.database.p139u.InterfaceC5945n
    /* renamed from: t */
    public String mo23212t() {
        return "";
    }

    @Override // com.google.firebase.database.p139u.C5924c
    public String toString() {
        return "<Empty Node>";
    }

    @Override // com.google.firebase.database.p139u.C5924c, com.google.firebase.database.p139u.InterfaceC5945n
    /* renamed from: x */
    public InterfaceC5945n mo23208x() {
        return this;
    }
}
