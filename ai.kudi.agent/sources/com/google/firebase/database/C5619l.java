package com.google.firebase.database;

import com.google.firebase.database.p131s.AbstractC5772i;
import com.google.firebase.database.p131s.C5728b0;
import com.google.firebase.database.p131s.C5742f0;
import com.google.firebase.database.p131s.C5830l;
import com.google.firebase.database.p131s.C5833n;
import com.google.firebase.database.p131s.p136j0.C5811h;
import com.google.firebase.database.p131s.p136j0.C5814i;
/* compiled from: Query.java */
/* renamed from: com.google.firebase.database.l */
/* loaded from: classes2.dex */
public class C5619l {

    /* renamed from: a */
    protected final C5833n f13843a;

    /* renamed from: b */
    protected final C5830l f13844b;

    /* renamed from: c */
    protected final C5811h f13845c = C5811h.f14269i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Query.java */
    /* renamed from: com.google.firebase.database.l$a */
    /* loaded from: classes2.dex */
    public class C5620a implements InterfaceC5627o {

        /* renamed from: a */
        final /* synthetic */ InterfaceC5627o f13846a;

        C5620a(InterfaceC5627o interfaceC5627o) {
            this.f13846a = interfaceC5627o;
        }

        @Override // com.google.firebase.database.InterfaceC5627o
        public void onCancelled(C5611c c5611c) {
            this.f13846a.onCancelled(c5611c);
        }

        @Override // com.google.firebase.database.InterfaceC5627o
        public void onDataChange(C5608b c5608b) {
            C5619l.this.m24301h(this);
            this.f13846a.onDataChange(c5608b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Query.java */
    /* renamed from: com.google.firebase.database.l$b */
    /* loaded from: classes2.dex */
    public class RunnableC5621b implements Runnable {

        /* renamed from: c */
        final /* synthetic */ AbstractC5772i f13848c;

        RunnableC5621b(AbstractC5772i abstractC5772i) {
            this.f13848c = abstractC5772i;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5619l.this.f13843a.m23555Q(this.f13848c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Query.java */
    /* renamed from: com.google.firebase.database.l$c */
    /* loaded from: classes2.dex */
    public class RunnableC5622c implements Runnable {

        /* renamed from: c */
        final /* synthetic */ AbstractC5772i f13850c;

        RunnableC5622c(AbstractC5772i abstractC5772i) {
            this.f13850c = abstractC5772i;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5619l.this.f13843a.m23570B(this.f13850c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5619l(C5833n c5833n, C5830l c5830l) {
        this.f13843a = c5833n;
        this.f13844b = c5830l;
    }

    /* renamed from: a */
    private void m24308a(AbstractC5772i abstractC5772i) {
        C5742f0.m23950b().m23949c(abstractC5772i);
        this.f13843a.m23550V(new RunnableC5622c(abstractC5772i));
    }

    /* renamed from: i */
    private void m24300i(AbstractC5772i abstractC5772i) {
        C5742f0.m23950b().m23947e(abstractC5772i);
        this.f13843a.m23550V(new RunnableC5621b(abstractC5772i));
    }

    /* renamed from: b */
    public void m24307b(InterfaceC5627o interfaceC5627o) {
        m24308a(new C5728b0(this.f13843a, new C5620a(interfaceC5627o), m24302g()));
    }

    /* renamed from: c */
    public InterfaceC5627o m24306c(InterfaceC5627o interfaceC5627o) {
        m24308a(new C5728b0(this.f13843a, interfaceC5627o, m24302g()));
        return interfaceC5627o;
    }

    /* renamed from: d */
    public com.google.android.gms.tasks.j<C5608b> m24305d() {
        return this.f13843a.m23560L(this);
    }

    /* renamed from: e */
    public C5830l m24304e() {
        return this.f13844b;
    }

    /* renamed from: f */
    public C5612d m24303f() {
        return new C5612d(this.f13843a, m24304e());
    }

    /* renamed from: g */
    public C5814i m24302g() {
        return new C5814i(this.f13844b, this.f13845c);
    }

    /* renamed from: h */
    public void m24301h(InterfaceC5627o interfaceC5627o) {
        if (interfaceC5627o != null) {
            m24300i(new C5728b0(this.f13843a, interfaceC5627o, m24302g()));
            return;
        }
        throw new NullPointerException("listener must not be null");
    }
}
