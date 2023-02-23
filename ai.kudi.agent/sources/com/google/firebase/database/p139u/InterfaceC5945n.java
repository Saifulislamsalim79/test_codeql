package com.google.firebase.database.p139u;

import com.google.firebase.database.p131s.C5830l;
import java.util.Iterator;
/* compiled from: Node.java */
/* renamed from: com.google.firebase.database.u.n */
/* loaded from: classes2.dex */
public interface InterfaceC5945n extends Comparable<InterfaceC5945n>, Iterable<C5944m> {

    /* renamed from: q */
    public static final C5924c f14590q = new C5946a();

    /* compiled from: Node.java */
    /* renamed from: com.google.firebase.database.u.n$a */
    /* loaded from: classes2.dex */
    class C5946a extends C5924c {
        C5946a() {
        }

        @Override // com.google.firebase.database.p139u.C5924c, com.google.firebase.database.p139u.InterfaceC5945n
        /* renamed from: L */
        public InterfaceC5945n mo23211L(C5921b c5921b) {
            if (c5921b.m23292p()) {
                mo23208x();
                return this;
            }
            return C5936g.m23249P();
        }

        @Override // com.google.firebase.database.p139u.C5924c, com.google.firebase.database.p139u.InterfaceC5945n
        /* renamed from: R */
        public boolean mo23210R(C5921b c5921b) {
            return false;
        }

        @Override // com.google.firebase.database.p139u.C5924c
        public boolean equals(Object obj) {
            return obj == this;
        }

        @Override // com.google.firebase.database.p139u.C5924c, java.lang.Comparable
        /* renamed from: h */
        public int compareTo(InterfaceC5945n interfaceC5945n) {
            return interfaceC5945n == this ? 0 : 1;
        }

        @Override // com.google.firebase.database.p139u.C5924c, com.google.firebase.database.p139u.InterfaceC5945n
        public boolean isEmpty() {
            return false;
        }

        @Override // com.google.firebase.database.p139u.C5924c
        public String toString() {
            return "<Max Node>";
        }

        @Override // com.google.firebase.database.p139u.C5924c, com.google.firebase.database.p139u.InterfaceC5945n
        /* renamed from: x */
        public InterfaceC5945n mo23208x() {
            return this;
        }
    }

    /* compiled from: Node.java */
    /* renamed from: com.google.firebase.database.u.n$b */
    /* loaded from: classes2.dex */
    public enum EnumC5947b {
        V1,
        V2
    }

    /* renamed from: B */
    InterfaceC5945n mo23220B(C5830l c5830l);

    /* renamed from: D */
    InterfaceC5945n mo23195D(InterfaceC5945n interfaceC5945n);

    /* renamed from: G */
    C5921b mo23219G(C5921b c5921b);

    /* renamed from: H */
    InterfaceC5945n mo23218H(C5830l c5830l, InterfaceC5945n interfaceC5945n);

    /* renamed from: K */
    String mo23193K(EnumC5947b enumC5947b);

    /* renamed from: L */
    InterfaceC5945n mo23211L(C5921b c5921b);

    /* renamed from: N */
    boolean mo23217N();

    /* renamed from: R */
    boolean mo23210R(C5921b c5921b);

    /* renamed from: T */
    InterfaceC5945n mo23216T(C5921b c5921b, InterfaceC5945n interfaceC5945n);

    /* renamed from: W */
    Object mo23215W(boolean z);

    /* renamed from: a0 */
    Iterator<C5944m> mo23214a0();

    Object getValue();

    boolean isEmpty();

    /* renamed from: o */
    int mo23213o();

    /* renamed from: t */
    String mo23212t();

    /* renamed from: x */
    InterfaceC5945n mo23208x();
}
