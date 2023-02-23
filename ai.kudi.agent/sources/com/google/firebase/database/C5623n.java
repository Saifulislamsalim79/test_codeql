package com.google.firebase.database;

import com.google.firebase.database.p139u.InterfaceC5945n;
/* compiled from: Transaction.java */
/* renamed from: com.google.firebase.database.n */
/* loaded from: classes2.dex */
public class C5623n {

    /* compiled from: Transaction.java */
    /* renamed from: com.google.firebase.database.n$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC5625b {
        /* renamed from: a */
        void m24298a(C5611c c5611c, boolean z, C5608b c5608b);

        /* renamed from: b */
        C5626c m24297b(C5618j c5618j);
    }

    /* compiled from: Transaction.java */
    /* renamed from: com.google.firebase.database.n$c */
    /* loaded from: classes2.dex */
    public static class C5626c {

        /* renamed from: a */
        private boolean f13852a;

        /* renamed from: b */
        private InterfaceC5945n f13853b;

        /* renamed from: a */
        public InterfaceC5945n m24296a() {
            return this.f13853b;
        }

        /* renamed from: b */
        public boolean m24295b() {
            return this.f13852a;
        }

        private C5626c(boolean z, InterfaceC5945n interfaceC5945n) {
            this.f13852a = z;
            this.f13853b = interfaceC5945n;
        }
    }

    /* renamed from: a */
    public static C5626c m24299a() {
        return new C5626c(false, null);
    }
}
