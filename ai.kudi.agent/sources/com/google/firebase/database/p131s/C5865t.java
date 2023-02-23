package com.google.firebase.database.p131s;

import com.google.firebase.database.p139u.C5921b;
import com.google.firebase.database.p139u.InterfaceC5945n;
import java.util.Map;
/* compiled from: SparseSnapshotTree.java */
/* renamed from: com.google.firebase.database.s.t */
/* loaded from: classes2.dex */
class C5865t {

    /* renamed from: a */
    private InterfaceC5945n f14408a = null;

    /* renamed from: b */
    private Map<C5921b, C5865t> f14409b = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SparseSnapshotTree.java */
    /* renamed from: com.google.firebase.database.s.t$a */
    /* loaded from: classes2.dex */
    public class C5866a implements InterfaceC5867b {

        /* renamed from: a */
        final /* synthetic */ C5830l f14410a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC5868c f14411b;

        C5866a(C5865t c5865t, C5830l c5830l, InterfaceC5868c interfaceC5868c) {
            this.f14410a = c5830l;
            this.f14411b = interfaceC5868c;
        }

        @Override // com.google.firebase.database.p131s.C5865t.InterfaceC5867b
        /* renamed from: a */
        public void mo23475a(C5921b c5921b, C5865t c5865t) {
            c5865t.m23476b(this.f14410a.m23592J(c5921b), this.f14411b);
        }
    }

    /* compiled from: SparseSnapshotTree.java */
    /* renamed from: com.google.firebase.database.s.t$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC5867b {
        /* renamed from: a */
        void mo23475a(C5921b c5921b, C5865t c5865t);
    }

    /* compiled from: SparseSnapshotTree.java */
    /* renamed from: com.google.firebase.database.s.t$c */
    /* loaded from: classes2.dex */
    public interface InterfaceC5868c {
        /* renamed from: a */
        void mo23474a(C5830l c5830l, InterfaceC5945n interfaceC5945n);
    }

    /* renamed from: a */
    public void m23477a(InterfaceC5867b interfaceC5867b) {
        Map<C5921b, C5865t> map = this.f14409b;
        if (map != null) {
            for (Map.Entry<C5921b, C5865t> entry : map.entrySet()) {
                interfaceC5867b.mo23475a(entry.getKey(), entry.getValue());
            }
        }
    }

    /* renamed from: b */
    public void m23476b(C5830l c5830l, InterfaceC5868c interfaceC5868c) {
        InterfaceC5945n interfaceC5945n = this.f14408a;
        if (interfaceC5945n != null) {
            interfaceC5868c.mo23474a(c5830l, interfaceC5945n);
        } else {
            m23477a(new C5866a(this, c5830l, interfaceC5868c));
        }
    }
}
