package p201g.p202a.p209o;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import p201g.p227h.p238l.C7687c0;
import p201g.p227h.p238l.C7694e0;
import p201g.p227h.p238l.InterfaceC7692d0;
/* compiled from: ViewPropertyAnimatorCompatSet.java */
/* renamed from: g.a.o.h */
/* loaded from: classes2.dex */
public class C7495h {

    /* renamed from: c */
    private Interpolator f17822c;

    /* renamed from: d */
    InterfaceC7692d0 f17823d;

    /* renamed from: e */
    private boolean f17824e;

    /* renamed from: b */
    private long f17821b = -1;

    /* renamed from: f */
    private final C7694e0 f17825f = new C7496a();

    /* renamed from: a */
    final ArrayList<C7687c0> f17820a = new ArrayList<>();

    /* compiled from: ViewPropertyAnimatorCompatSet.java */
    /* renamed from: g.a.o.h$a */
    /* loaded from: classes2.dex */
    class C7496a extends C7694e0 {

        /* renamed from: a */
        private boolean f17826a = false;

        /* renamed from: b */
        private int f17827b = 0;

        C7496a() {
        }

        @Override // p201g.p227h.p238l.InterfaceC7692d0
        /* renamed from: b */
        public void mo17807b(View view) {
            int i = this.f17827b + 1;
            this.f17827b = i;
            if (i == C7495h.this.f17820a.size()) {
                InterfaceC7692d0 interfaceC7692d0 = C7495h.this.f17823d;
                if (interfaceC7692d0 != null) {
                    interfaceC7692d0.mo17807b(null);
                }
                m18550d();
            }
        }

        @Override // p201g.p227h.p238l.C7694e0, p201g.p227h.p238l.InterfaceC7692d0
        /* renamed from: c */
        public void mo17803c(View view) {
            if (this.f17826a) {
                return;
            }
            this.f17826a = true;
            InterfaceC7692d0 interfaceC7692d0 = C7495h.this.f17823d;
            if (interfaceC7692d0 != null) {
                interfaceC7692d0.mo17803c(null);
            }
        }

        /* renamed from: d */
        void m18550d() {
            this.f17827b = 0;
            this.f17826a = false;
            C7495h.this.m18557b();
        }
    }

    /* renamed from: a */
    public void m18558a() {
        if (this.f17824e) {
            Iterator<C7687c0> it = this.f17820a.iterator();
            while (it.hasNext()) {
                it.next().m17822b();
            }
            this.f17824e = false;
        }
    }

    /* renamed from: b */
    void m18557b() {
        this.f17824e = false;
    }

    /* renamed from: c */
    public C7495h m18556c(C7687c0 c7687c0) {
        if (!this.f17824e) {
            this.f17820a.add(c7687c0);
        }
        return this;
    }

    /* renamed from: d */
    public C7495h m18555d(C7687c0 c7687c0, C7687c0 c7687c02) {
        this.f17820a.add(c7687c0);
        c7687c02.m17816h(c7687c0.m17821c());
        this.f17820a.add(c7687c02);
        return this;
    }

    /* renamed from: e */
    public C7495h m18554e(long j) {
        if (!this.f17824e) {
            this.f17821b = j;
        }
        return this;
    }

    /* renamed from: f */
    public C7495h m18553f(Interpolator interpolator) {
        if (!this.f17824e) {
            this.f17822c = interpolator;
        }
        return this;
    }

    /* renamed from: g */
    public C7495h m18552g(InterfaceC7692d0 interfaceC7692d0) {
        if (!this.f17824e) {
            this.f17823d = interfaceC7692d0;
        }
        return this;
    }

    /* renamed from: h */
    public void m18551h() {
        if (this.f17824e) {
            return;
        }
        Iterator<C7687c0> it = this.f17820a.iterator();
        while (it.hasNext()) {
            C7687c0 next = it.next();
            long j = this.f17821b;
            if (j >= 0) {
                next.m17820d(j);
            }
            Interpolator interpolator = this.f17822c;
            if (interpolator != null) {
                next.m17819e(interpolator);
            }
            if (this.f17823d != null) {
                next.m17818f(this.f17825f);
            }
            next.m17814j();
        }
        this.f17824e = true;
    }
}
