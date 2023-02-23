package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.load.EnumC1993a;
import com.bumptech.glide.load.InterfaceC1996d;
import com.bumptech.glide.load.InterfaceC2118f;
import com.bumptech.glide.load.engine.InterfaceC2046f;
import com.bumptech.glide.load.p070m.InterfaceC2130d;
import com.bumptech.glide.load.p072n.InterfaceC2199n;
import com.bumptech.glide.p086q.C2376f;
import java.util.Collections;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SourceGenerator.java */
/* renamed from: com.bumptech.glide.load.engine.y */
/* loaded from: classes2.dex */
public class C2092y implements InterfaceC2046f, InterfaceC2046f.InterfaceC2047a {

    /* renamed from: c */
    private final C2048g<?> f6360c;

    /* renamed from: d */
    private final InterfaceC2046f.InterfaceC2047a f6361d;

    /* renamed from: e */
    private int f6362e;

    /* renamed from: f */
    private C2043c f6363f;

    /* renamed from: w */
    private Object f6364w;

    /* renamed from: x */
    private volatile InterfaceC2199n.C2200a<?> f6365x;

    /* renamed from: y */
    private C2044d f6366y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SourceGenerator.java */
    /* renamed from: com.bumptech.glide.load.engine.y$a */
    /* loaded from: classes2.dex */
    public class C2093a implements InterfaceC2130d.InterfaceC2131a<Object> {

        /* renamed from: c */
        final /* synthetic */ InterfaceC2199n.C2200a f6367c;

        C2093a(InterfaceC2199n.C2200a c2200a) {
            this.f6367c = c2200a;
        }

        @Override // com.bumptech.glide.load.p070m.InterfaceC2130d.InterfaceC2131a
        /* renamed from: c */
        public void mo33546c(Exception exc) {
            if (C2092y.this.m33746f(this.f6367c)) {
                C2092y.this.m33743i(this.f6367c, exc);
            }
        }

        @Override // com.bumptech.glide.load.p070m.InterfaceC2130d.InterfaceC2131a
        /* renamed from: d */
        public void mo33545d(Object obj) {
            if (C2092y.this.m33746f(this.f6367c)) {
                C2092y.this.m33745g(this.f6367c, obj);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2092y(C2048g<?> c2048g, InterfaceC2046f.InterfaceC2047a interfaceC2047a) {
        this.f6360c = c2048g;
        this.f6361d = interfaceC2047a;
    }

    /* renamed from: c */
    private void m33749c(Object obj) {
        long m33145b = C2376f.m33145b();
        try {
            InterfaceC1996d<X> m33863p = this.f6360c.m33863p(obj);
            C2045e c2045e = new C2045e(m33863p, obj, this.f6360c.m33868k());
            this.f6366y = new C2044d(this.f6365x.f6511a, this.f6360c.m33864o());
            this.f6360c.m33875d().mo33918a(this.f6366y, c2045e);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + this.f6366y + ", data: " + obj + ", encoder: " + m33863p + ", duration: " + C2376f.m33146a(m33145b));
            }
            this.f6365x.f6513c.mo33506b();
            this.f6363f = new C2043c(Collections.singletonList(this.f6365x.f6511a), this.f6360c, this);
        } catch (Throwable th) {
            this.f6365x.f6513c.mo33506b();
            throw th;
        }
    }

    /* renamed from: d */
    private boolean m33748d() {
        return this.f6362e < this.f6360c.m33872g().size();
    }

    /* renamed from: j */
    private void m33742j(InterfaceC2199n.C2200a<?> c2200a) {
        this.f6365x.f6513c.mo33503e(this.f6360c.m33867l(), new C2093a(c2200a));
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2046f
    /* renamed from: a */
    public boolean mo33751a() {
        Object obj = this.f6364w;
        if (obj != null) {
            this.f6364w = null;
            m33749c(obj);
        }
        C2043c c2043c = this.f6363f;
        if (c2043c == null || !c2043c.mo33751a()) {
            this.f6363f = null;
            this.f6365x = null;
            boolean z = false;
            while (!z && m33748d()) {
                List<InterfaceC2199n.C2200a<?>> m33872g = this.f6360c.m33872g();
                int i = this.f6362e;
                this.f6362e = i + 1;
                this.f6365x = m33872g.get(i);
                if (this.f6365x != null && (this.f6360c.m33874e().mo33814c(this.f6365x.f6513c.getDataSource()) || this.f6360c.m33859t(this.f6365x.f6513c.mo33507a()))) {
                    m33742j(this.f6365x);
                    z = true;
                }
            }
            return z;
        }
        return true;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2046f.InterfaceC2047a
    /* renamed from: b */
    public void mo33750b() {
        throw new UnsupportedOperationException();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2046f
    public void cancel() {
        InterfaceC2199n.C2200a<?> c2200a = this.f6365x;
        if (c2200a != null) {
            c2200a.f6513c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2046f.InterfaceC2047a
    /* renamed from: e */
    public void mo33747e(InterfaceC2118f interfaceC2118f, Exception exc, InterfaceC2130d<?> interfaceC2130d, EnumC1993a enumC1993a) {
        this.f6361d.mo33747e(interfaceC2118f, exc, interfaceC2130d, this.f6365x.f6513c.getDataSource());
    }

    /* renamed from: f */
    boolean m33746f(InterfaceC2199n.C2200a<?> c2200a) {
        InterfaceC2199n.C2200a<?> c2200a2 = this.f6365x;
        return c2200a2 != null && c2200a2 == c2200a;
    }

    /* renamed from: g */
    void m33745g(InterfaceC2199n.C2200a<?> c2200a, Object obj) {
        AbstractC2060j m33874e = this.f6360c.m33874e();
        if (obj != null && m33874e.mo33814c(c2200a.f6513c.getDataSource())) {
            this.f6364w = obj;
            this.f6361d.mo33750b();
            return;
        }
        InterfaceC2046f.InterfaceC2047a interfaceC2047a = this.f6361d;
        InterfaceC2118f interfaceC2118f = c2200a.f6511a;
        InterfaceC2130d<?> interfaceC2130d = c2200a.f6513c;
        interfaceC2047a.mo33744h(interfaceC2118f, obj, interfaceC2130d, interfaceC2130d.getDataSource(), this.f6366y);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2046f.InterfaceC2047a
    /* renamed from: h */
    public void mo33744h(InterfaceC2118f interfaceC2118f, Object obj, InterfaceC2130d<?> interfaceC2130d, EnumC1993a enumC1993a, InterfaceC2118f interfaceC2118f2) {
        this.f6361d.mo33744h(interfaceC2118f, obj, interfaceC2130d, this.f6365x.f6513c.getDataSource(), interfaceC2118f);
    }

    /* renamed from: i */
    void m33743i(InterfaceC2199n.C2200a<?> c2200a, Exception exc) {
        InterfaceC2046f.InterfaceC2047a interfaceC2047a = this.f6361d;
        C2044d c2044d = this.f6366y;
        InterfaceC2130d<?> interfaceC2130d = c2200a.f6513c;
        interfaceC2047a.mo33747e(c2044d, exc, interfaceC2130d, interfaceC2130d.getDataSource());
    }
}
