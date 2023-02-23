package com.google.firebase.inappmessaging.display.internal.p149r.p150a;

import android.view.LayoutInflater;
import com.google.firebase.inappmessaging.display.internal.C6057l;
import com.google.firebase.inappmessaging.display.internal.p148q.C6077a;
import com.google.firebase.inappmessaging.display.internal.p148q.C6078b;
import com.google.firebase.inappmessaging.display.internal.p148q.C6080d;
import com.google.firebase.inappmessaging.display.internal.p148q.C6082e;
import com.google.firebase.inappmessaging.display.internal.p148q.C6083f;
import com.google.firebase.inappmessaging.display.internal.p148q.C6084g;
import com.google.firebase.inappmessaging.display.internal.p148q.C6085h;
import com.google.firebase.inappmessaging.display.internal.p148q.C6087i;
import com.google.firebase.inappmessaging.display.internal.p149r.p151b.C6121q;
import com.google.firebase.inappmessaging.display.internal.p149r.p151b.C6122r;
import com.google.firebase.inappmessaging.display.internal.p149r.p151b.C6123s;
import com.google.firebase.inappmessaging.display.internal.p149r.p151b.C6124t;
import com.google.firebase.inappmessaging.display.p145i.p146a.C6031b;
import com.google.firebase.inappmessaging.display.p145i.p146a.C6033d;
import com.google.firebase.inappmessaging.model.AbstractC6386i;
import p472k.p473a.InterfaceC11700a;
/* compiled from: DaggerInAppMessageComponent.java */
/* renamed from: com.google.firebase.inappmessaging.display.internal.r.a.c */
/* loaded from: classes2.dex */
public final class C6096c implements InterfaceC6102e {

    /* renamed from: a */
    private InterfaceC11700a<C6057l> f14910a;

    /* renamed from: b */
    private InterfaceC11700a<LayoutInflater> f14911b;

    /* renamed from: c */
    private InterfaceC11700a<AbstractC6386i> f14912c;

    /* renamed from: d */
    private InterfaceC11700a<C6083f> f14913d;

    /* renamed from: e */
    private InterfaceC11700a<C6085h> f14914e;

    /* renamed from: f */
    private InterfaceC11700a<C6077a> f14915f;

    /* renamed from: g */
    private InterfaceC11700a<C6080d> f14916g;

    /* compiled from: DaggerInAppMessageComponent.java */
    /* renamed from: com.google.firebase.inappmessaging.display.internal.r.a.c$b */
    /* loaded from: classes2.dex */
    public static final class C6098b {

        /* renamed from: a */
        private C6121q f14917a;

        /* renamed from: a */
        public InterfaceC6102e m22745a() {
            C6033d.m22947a(this.f14917a, C6121q.class);
            return new C6096c(this.f14917a);
        }

        /* renamed from: b */
        public C6098b m22744b(C6121q c6121q) {
            C6033d.m22946b(c6121q);
            this.f14917a = c6121q;
            return this;
        }

        private C6098b() {
        }
    }

    /* renamed from: e */
    public static C6098b m22747e() {
        return new C6098b();
    }

    /* renamed from: f */
    private void m22746f(C6121q c6121q) {
        this.f14910a = C6031b.m22952a(C6122r.m22679a(c6121q));
        this.f14911b = C6031b.m22952a(C6124t.m22673a(c6121q));
        C6123s m22676a = C6123s.m22676a(c6121q);
        this.f14912c = m22676a;
        this.f14913d = C6031b.m22952a(C6084g.m22773a(this.f14910a, this.f14911b, m22676a));
        this.f14914e = C6031b.m22952a(C6087i.m22760a(this.f14910a, this.f14911b, this.f14912c));
        this.f14915f = C6031b.m22952a(C6078b.m22791a(this.f14910a, this.f14911b, this.f14912c));
        this.f14916g = C6031b.m22952a(C6082e.m22776a(this.f14910a, this.f14911b, this.f14912c));
    }

    @Override // com.google.firebase.inappmessaging.display.internal.p149r.p150a.InterfaceC6102e
    /* renamed from: a */
    public C6083f mo22739a() {
        return this.f14913d.get();
    }

    @Override // com.google.firebase.inappmessaging.display.internal.p149r.p150a.InterfaceC6102e
    /* renamed from: b */
    public C6080d mo22738b() {
        return this.f14916g.get();
    }

    @Override // com.google.firebase.inappmessaging.display.internal.p149r.p150a.InterfaceC6102e
    /* renamed from: c */
    public C6077a mo22737c() {
        return this.f14915f.get();
    }

    @Override // com.google.firebase.inappmessaging.display.internal.p149r.p150a.InterfaceC6102e
    /* renamed from: d */
    public C6085h mo22736d() {
        return this.f14914e.get();
    }

    private C6096c(C6121q c6121q) {
        m22746f(c6121q);
    }
}
