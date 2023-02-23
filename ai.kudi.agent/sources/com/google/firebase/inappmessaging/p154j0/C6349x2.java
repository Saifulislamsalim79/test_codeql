package com.google.firebase.inappmessaging.p154j0;

import j.e.e0.e;
import java.util.HashSet;
import p272h.p286c.p355d.p356a.p357a.p358a.C9370c;
import p272h.p286c.p355d.p356a.p357a.p358a.p359e.C9376a;
import p272h.p286c.p355d.p356a.p357a.p358a.p359e.C9379b;
import p272h.p286c.p355d.p356a.p357a.p358a.p359e.C9388e;
import p425j.p444e.AbstractC11271b;
import p425j.p444e.AbstractC11677k;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11284d;
import p425j.p444e.p450e0.InterfaceC11287a;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: ImpressionStorageClient.java */
/* renamed from: com.google.firebase.inappmessaging.j0.x2 */
/* loaded from: classes2.dex */
public class C6349x2 {

    /* renamed from: c */
    private static final C9379b f15364c = C9379b.m14906W();

    /* renamed from: a */
    private final C6181f3 f15365a;

    /* renamed from: b */
    private AbstractC11677k<C9379b> f15366b = AbstractC11677k.m10596g();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6349x2(C6181f3 c6181f3) {
        this.f15365a = c6181f3;
    }

    /* renamed from: a */
    private static C9379b m22274a(C9379b c9379b, C9376a c9376a) {
        C9379b.C9381b m14904Y = C9379b.m14904Y(c9379b);
        m14904Y.m14902F(c9376a);
        return m14904Y.build();
    }

    /* renamed from: c */
    private void m22272c() {
        this.f15366b = AbstractC11677k.m10596g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m22264k(C9379b c9379b) {
        this.f15366b = AbstractC11677k.m10589n(c9379b);
    }

    /* renamed from: b */
    public AbstractC11271b m22273b(C9388e c9388e) {
        String m14942T;
        final HashSet hashSet = new HashSet();
        for (C9370c c9370c : c9388e.m14869V()) {
            if (c9370c.m14932W().equals(C9370c.EnumC9373c.VANILLA_PAYLOAD)) {
                m14942T = c9370c.m14929Z().m14924T();
            } else {
                m14942T = c9370c.m14934U().m14942T();
            }
            hashSet.add(m14942T);
        }
        C6163c3.m22621a("Potential impressions to clear: " + hashSet.toString());
        return m22271d().m10599c(f15364c).m10593j(new InterfaceC11291f() { // from class: com.google.firebase.inappmessaging.j0.y
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                return C6349x2.this.m22266i(hashSet, (C9379b) obj);
            }
        });
    }

    /* renamed from: d */
    public AbstractC11677k<C9379b> m22271d() {
        return this.f15366b.m10579x(this.f15365a.m22597c(C9379b.m14903Z()).m10597f(new e() { // from class: com.google.firebase.inappmessaging.j0.x
            public final void accept(Object obj) {
                C6349x2.this.m22264k((C9379b) obj);
            }
        })).m10598e(new e() { // from class: com.google.firebase.inappmessaging.j0.b0
            public final void accept(Object obj) {
                C6349x2.this.m22265j((Throwable) obj);
            }
        });
    }

    /* renamed from: f */
    public AbstractC11696w<Boolean> m22269f(C9370c c9370c) {
        String m14942T;
        if (c9370c.m14932W().equals(C9370c.EnumC9373c.VANILLA_PAYLOAD)) {
            m14942T = c9370c.m14929Z().m14924T();
        } else {
            m14942T = c9370c.m14934U().m14942T();
        }
        return m22271d().m10588o(C6235p1.f15134c).m10592k(C6246q1.f15153c).m10531O(C6185g2.f15046c).m10496p(m14942T);
    }

    /* renamed from: i */
    public /* synthetic */ InterfaceC11284d m22266i(HashSet hashSet, C9379b c9379b) throws Exception {
        C6163c3.m22621a("Existing impressions: " + c9379b.toString());
        C9379b.C9381b m14905X = C9379b.m14905X();
        for (C9376a c9376a : c9379b.m14907V()) {
            if (!hashSet.contains(c9376a.m14917U())) {
                m14905X.m14902F(c9376a);
            }
        }
        final C9379b build = m14905X.build();
        C6163c3.m22621a("New cleared impression list: " + build.toString());
        return this.f15365a.m22596d(build).m11244g(new InterfaceC11287a() { // from class: com.google.firebase.inappmessaging.j0.z
            @Override // p425j.p444e.p450e0.InterfaceC11287a
            public final void run() {
                C6349x2.this.m22267h(build);
            }
        });
    }

    /* renamed from: j */
    public /* synthetic */ void m22265j(Throwable th) throws Exception {
        m22272c();
    }

    /* renamed from: l */
    public /* synthetic */ InterfaceC11284d m22263l(C9376a c9376a, C9379b c9379b) throws Exception {
        final C9379b m22274a = m22274a(c9379b, c9376a);
        return this.f15365a.m22596d(m22274a).m11244g(new InterfaceC11287a() { // from class: com.google.firebase.inappmessaging.j0.a0
            @Override // p425j.p444e.p450e0.InterfaceC11287a
            public final void run() {
                C6349x2.this.m22264k(m22274a);
            }
        });
    }

    /* renamed from: m */
    public AbstractC11271b m22262m(final C9376a c9376a) {
        return m22271d().m10599c(f15364c).m10593j(new InterfaceC11291f() { // from class: com.google.firebase.inappmessaging.j0.c0
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                return C6349x2.this.m22263l(c9376a, (C9379b) obj);
            }
        });
    }
}
