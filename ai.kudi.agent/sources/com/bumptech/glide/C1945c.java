package com.bumptech.glide;

import android.content.Context;
import com.bumptech.glide.ComponentCallbacks2C1943b;
import com.bumptech.glide.load.engine.C2064k;
import com.bumptech.glide.load.engine.p067a0.C2022f;
import com.bumptech.glide.load.engine.p067a0.C2024g;
import com.bumptech.glide.load.engine.p067a0.C2027i;
import com.bumptech.glide.load.engine.p067a0.InterfaceC2012a;
import com.bumptech.glide.load.engine.p067a0.InterfaceC2025h;
import com.bumptech.glide.load.engine.p068b0.ExecutorServiceC2035a;
import com.bumptech.glide.load.engine.p069z.C2101f;
import com.bumptech.glide.load.engine.p069z.C2106j;
import com.bumptech.glide.load.engine.p069z.C2109k;
import com.bumptech.glide.load.engine.p069z.InterfaceC2095b;
import com.bumptech.glide.load.engine.p069z.InterfaceC2100e;
import com.bumptech.glide.p066l.C1978f;
import com.bumptech.glide.p066l.C1985l;
import com.bumptech.glide.p066l.InterfaceC1975d;
import com.bumptech.glide.p082o.C2352f;
import com.bumptech.glide.p082o.InterfaceC2351e;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p201g.p218e.C7521a;
/* compiled from: GlideBuilder.java */
/* renamed from: com.bumptech.glide.c */
/* loaded from: classes2.dex */
public final class C1945c {

    /* renamed from: b */
    private C2064k f5885b;

    /* renamed from: c */
    private InterfaceC2100e f5886c;

    /* renamed from: d */
    private InterfaceC2095b f5887d;

    /* renamed from: e */
    private InterfaceC2025h f5888e;

    /* renamed from: f */
    private ExecutorServiceC2035a f5889f;

    /* renamed from: g */
    private ExecutorServiceC2035a f5890g;

    /* renamed from: h */
    private InterfaceC2012a.InterfaceC2013a f5891h;

    /* renamed from: i */
    private C2027i f5892i;

    /* renamed from: j */
    private InterfaceC1975d f5893j;

    /* renamed from: m */
    private C1985l.InterfaceC1987b f5896m;

    /* renamed from: n */
    private ExecutorServiceC2035a f5897n;

    /* renamed from: o */
    private boolean f5898o;

    /* renamed from: p */
    private List<InterfaceC2351e<Object>> f5899p;

    /* renamed from: q */
    private boolean f5900q;

    /* renamed from: r */
    private boolean f5901r;

    /* renamed from: a */
    private final Map<Class<?>, AbstractC1955i<?, ?>> f5884a = new C7521a();

    /* renamed from: k */
    private int f5894k = 4;

    /* renamed from: l */
    private ComponentCallbacks2C1943b.InterfaceC1944a f5895l = new C1946a(this);

    /* compiled from: GlideBuilder.java */
    /* renamed from: com.bumptech.glide.c$a */
    /* loaded from: classes2.dex */
    class C1946a implements ComponentCallbacks2C1943b.InterfaceC1944a {
        C1946a(C1945c c1945c) {
        }

        @Override // com.bumptech.glide.ComponentCallbacks2C1943b.InterfaceC1944a
        public C2352f build() {
            return new C2352f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public ComponentCallbacks2C1943b m34151a(Context context) {
        if (this.f5889f == null) {
            this.f5889f = ExecutorServiceC2035a.m33888g();
        }
        if (this.f5890g == null) {
            this.f5890g = ExecutorServiceC2035a.m33890e();
        }
        if (this.f5897n == null) {
            this.f5897n = ExecutorServiceC2035a.m33892c();
        }
        if (this.f5892i == null) {
            this.f5892i = new C2027i.C2028a(context).m33900a();
        }
        if (this.f5893j == null) {
            this.f5893j = new C1978f();
        }
        if (this.f5886c == null) {
            int m33905b = this.f5892i.m33905b();
            if (m33905b > 0) {
                this.f5886c = new C2109k(m33905b);
            } else {
                this.f5886c = new C2101f();
            }
        }
        if (this.f5887d == null) {
            this.f5887d = new C2106j(this.f5892i.m33906a());
        }
        if (this.f5888e == null) {
            this.f5888e = new C2024g(this.f5892i.m33903d());
        }
        if (this.f5891h == null) {
            this.f5891h = new C2022f(context);
        }
        if (this.f5885b == null) {
            this.f5885b = new C2064k(this.f5888e, this.f5891h, this.f5890g, this.f5889f, ExecutorServiceC2035a.m33887h(), this.f5897n, this.f5898o);
        }
        List<InterfaceC2351e<Object>> list = this.f5899p;
        if (list == null) {
            this.f5899p = Collections.emptyList();
        } else {
            this.f5899p = Collections.unmodifiableList(list);
        }
        return new ComponentCallbacks2C1943b(context, this.f5885b, this.f5888e, this.f5886c, this.f5887d, new C1985l(this.f5896m), this.f5893j, this.f5894k, this.f5895l, this.f5884a, this.f5899p, this.f5900q, this.f5901r);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m34150b(C1985l.InterfaceC1987b interfaceC1987b) {
        this.f5896m = interfaceC1987b;
    }
}
