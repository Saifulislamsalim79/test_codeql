package io.intercom.com.bumptech.glide.load.engine;

import android.util.Log;
import io.intercom.com.bumptech.glide.load.EnumC10507a;
import io.intercom.com.bumptech.glide.load.InterfaceC10510d;
import io.intercom.com.bumptech.glide.load.InterfaceC10622g;
import io.intercom.com.bumptech.glide.load.engine.InterfaceC10530e;
import io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b;
import io.intercom.com.bumptech.glide.load.p400n.InterfaceC10697n;
import io.intercom.com.bumptech.glide.p416r.C10888d;
import java.util.Collections;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SourceGenerator.java */
/* renamed from: io.intercom.com.bumptech.glide.load.engine.x */
/* loaded from: classes3.dex */
public class C10574x implements InterfaceC10530e, InterfaceC10631b.InterfaceC10632a<Object>, InterfaceC10530e.InterfaceC10531a {

    /* renamed from: c */
    private final C10532f<?> f24335c;

    /* renamed from: d */
    private final InterfaceC10530e.InterfaceC10531a f24336d;

    /* renamed from: e */
    private int f24337e;

    /* renamed from: f */
    private C10526b f24338f;

    /* renamed from: w */
    private Object f24339w;

    /* renamed from: x */
    private volatile InterfaceC10697n.C10698a<?> f24340x;

    /* renamed from: y */
    private C10528c f24341y;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10574x(C10532f<?> c10532f, InterfaceC10530e.InterfaceC10531a interfaceC10531a) {
        this.f24335c = c10532f;
        this.f24336d = interfaceC10531a;
    }

    /* renamed from: f */
    private void m12716f(Object obj) {
        long m12031b = C10888d.m12031b();
        try {
            InterfaceC10510d<X> m12822o = this.f24335c.m12822o(obj);
            C10529d c10529d = new C10529d(m12822o, obj, this.f24335c.m12827j());
            this.f24341y = new C10528c(this.f24340x.f24505a, this.f24335c.m12823n());
            this.f24335c.m12833d().mo12636b(this.f24341y, c10529d);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + this.f24341y + ", data: " + obj + ", encoder: " + m12822o + ", duration: " + C10888d.m12032a(m12031b));
            }
            this.f24340x.f24507c.mo12473b();
            this.f24338f = new C10526b(Collections.singletonList(this.f24340x.f24505a), this.f24335c, this);
        } catch (Throwable th) {
            this.f24340x.f24507c.mo12473b();
            throw th;
        }
    }

    /* renamed from: g */
    private boolean m12715g() {
        return this.f24337e < this.f24335c.m12830g().size();
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.InterfaceC10530e
    /* renamed from: a */
    public boolean mo12719a() {
        Object obj = this.f24339w;
        if (obj != null) {
            this.f24339w = null;
            m12716f(obj);
        }
        C10526b c10526b = this.f24338f;
        if (c10526b == null || !c10526b.mo12719a()) {
            this.f24338f = null;
            this.f24340x = null;
            boolean z = false;
            while (!z && m12715g()) {
                List<InterfaceC10697n.C10698a<?>> m12830g = this.f24335c.m12830g();
                int i = this.f24337e;
                this.f24337e = i + 1;
                this.f24340x = m12830g.get(i);
                if (this.f24340x != null && (this.f24335c.m12832e().mo12773c(this.f24340x.f24507c.getDataSource()) || this.f24335c.m12819r(this.f24340x.f24507c.mo12474a()))) {
                    this.f24340x.f24507c.mo12472e(this.f24335c.m12826k(), this);
                    z = true;
                }
            }
            return z;
        }
        return true;
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.InterfaceC10530e.InterfaceC10531a
    /* renamed from: b */
    public void mo12718b() {
        throw new UnsupportedOperationException();
    }

    @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b.InterfaceC10632a
    /* renamed from: c */
    public void mo12497c(Exception exc) {
        this.f24336d.mo12717e(this.f24341y, exc, this.f24340x.f24507c, this.f24340x.f24507c.getDataSource());
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.InterfaceC10530e
    public void cancel() {
        InterfaceC10697n.C10698a<?> c10698a = this.f24340x;
        if (c10698a != null) {
            c10698a.f24507c.cancel();
        }
    }

    @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b.InterfaceC10632a
    /* renamed from: d */
    public void mo12496d(Object obj) {
        AbstractC10544i m12832e = this.f24335c.m12832e();
        if (obj != null && m12832e.mo12773c(this.f24340x.f24507c.getDataSource())) {
            this.f24339w = obj;
            this.f24336d.mo12718b();
            return;
        }
        this.f24336d.mo12714h(this.f24340x.f24505a, obj, this.f24340x.f24507c, this.f24340x.f24507c.getDataSource(), this.f24341y);
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.InterfaceC10530e.InterfaceC10531a
    /* renamed from: e */
    public void mo12717e(InterfaceC10622g interfaceC10622g, Exception exc, InterfaceC10631b<?> interfaceC10631b, EnumC10507a enumC10507a) {
        this.f24336d.mo12717e(interfaceC10622g, exc, interfaceC10631b, this.f24340x.f24507c.getDataSource());
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.InterfaceC10530e.InterfaceC10531a
    /* renamed from: h */
    public void mo12714h(InterfaceC10622g interfaceC10622g, Object obj, InterfaceC10631b<?> interfaceC10631b, EnumC10507a enumC10507a, InterfaceC10622g interfaceC10622g2) {
        this.f24336d.mo12714h(interfaceC10622g, obj, interfaceC10631b, this.f24340x.f24507c.getDataSource(), interfaceC10622g);
    }
}
