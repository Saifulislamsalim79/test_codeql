package com.google.firebase.database.p131s;

import com.google.firebase.database.p139u.C5921b;
import com.google.firebase.database.p139u.InterfaceC5945n;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ValueProvider.java */
/* renamed from: com.google.firebase.database.s.c0 */
/* loaded from: classes2.dex */
public abstract class AbstractC5730c0 {

    /* compiled from: ValueProvider.java */
    /* renamed from: com.google.firebase.database.s.c0$a */
    /* loaded from: classes2.dex */
    public static class C5731a extends AbstractC5730c0 {

        /* renamed from: a */
        private final C5870v f14109a;

        /* renamed from: b */
        private final C5830l f14110b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C5731a(C5870v c5870v, C5830l c5830l) {
            this.f14109a = c5870v;
            this.f14110b = c5830l;
        }

        @Override // com.google.firebase.database.p131s.AbstractC5730c0
        /* renamed from: a */
        public AbstractC5730c0 mo23995a(C5921b c5921b) {
            return new C5731a(this.f14109a, this.f14110b.m23592J(c5921b));
        }

        @Override // com.google.firebase.database.p131s.AbstractC5730c0
        /* renamed from: b */
        public InterfaceC5945n mo23994b() {
            return this.f14109a.m23453I(this.f14110b, new ArrayList());
        }
    }

    /* compiled from: ValueProvider.java */
    /* renamed from: com.google.firebase.database.s.c0$b */
    /* loaded from: classes2.dex */
    public static class C5732b extends AbstractC5730c0 {

        /* renamed from: a */
        private final InterfaceC5945n f14111a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C5732b(InterfaceC5945n interfaceC5945n) {
            this.f14111a = interfaceC5945n;
        }

        @Override // com.google.firebase.database.p131s.AbstractC5730c0
        /* renamed from: a */
        public AbstractC5730c0 mo23995a(C5921b c5921b) {
            return new C5732b(this.f14111a.mo23211L(c5921b));
        }

        @Override // com.google.firebase.database.p131s.AbstractC5730c0
        /* renamed from: b */
        public InterfaceC5945n mo23994b() {
            return this.f14111a;
        }
    }

    AbstractC5730c0() {
    }

    /* renamed from: a */
    public abstract AbstractC5730c0 mo23995a(C5921b c5921b);

    /* renamed from: b */
    public abstract InterfaceC5945n mo23994b();
}
