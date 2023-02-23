package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import com.bumptech.glide.ComponentCallbacks2C1943b;
import com.bumptech.glide.load.engine.C2064k;
import com.bumptech.glide.load.engine.p069z.InterfaceC2095b;
import com.bumptech.glide.p082o.C2352f;
import com.bumptech.glide.p082o.InterfaceC2351e;
import com.bumptech.glide.p082o.p083j.C2358b;
import java.util.List;
import java.util.Map;
/* compiled from: GlideContext.java */
/* renamed from: com.bumptech.glide.d */
/* loaded from: classes2.dex */
public class C1947d extends ContextWrapper {

    /* renamed from: j */
    static final AbstractC1955i<?, ?> f5902j = new C1942a();

    /* renamed from: a */
    private final InterfaceC2095b f5903a;

    /* renamed from: b */
    private final Registry f5904b;

    /* renamed from: c */
    private final ComponentCallbacks2C1943b.InterfaceC1944a f5905c;

    /* renamed from: d */
    private final List<InterfaceC2351e<Object>> f5906d;

    /* renamed from: e */
    private final Map<Class<?>, AbstractC1955i<?, ?>> f5907e;

    /* renamed from: f */
    private final C2064k f5908f;

    /* renamed from: g */
    private final boolean f5909g;

    /* renamed from: h */
    private final int f5910h;

    /* renamed from: i */
    private C2352f f5911i;

    public C1947d(Context context, InterfaceC2095b interfaceC2095b, Registry registry, C2358b c2358b, ComponentCallbacks2C1943b.InterfaceC1944a interfaceC1944a, Map<Class<?>, AbstractC1955i<?, ?>> map, List<InterfaceC2351e<Object>> list, C2064k c2064k, boolean z, int i) {
        super(context.getApplicationContext());
        this.f5903a = interfaceC2095b;
        this.f5904b = registry;
        this.f5905c = interfaceC1944a;
        this.f5906d = list;
        this.f5907e = map;
        this.f5908f = c2064k;
        this.f5909g = z;
        this.f5910h = i;
    }

    /* renamed from: a */
    public InterfaceC2095b m34149a() {
        return this.f5903a;
    }

    /* renamed from: b */
    public List<InterfaceC2351e<Object>> m34148b() {
        return this.f5906d;
    }

    /* renamed from: c */
    public synchronized C2352f m34147c() {
        if (this.f5911i == null) {
            C2352f build = this.f5905c.build();
            build.m33250H();
            this.f5911i = build;
        }
        return this.f5911i;
    }

    /* renamed from: d */
    public <T> AbstractC1955i<?, T> m34146d(Class<T> cls) {
        AbstractC1955i<?, T> abstractC1955i = (AbstractC1955i<?, T>) this.f5907e.get(cls);
        if (abstractC1955i == null) {
            for (Map.Entry<Class<?>, AbstractC1955i<?, ?>> entry : this.f5907e.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    abstractC1955i = (AbstractC1955i<?, T>) entry.getValue();
                }
            }
        }
        return abstractC1955i == null ? (AbstractC1955i<?, T>) f5902j : abstractC1955i;
    }

    /* renamed from: e */
    public C2064k m34145e() {
        return this.f5908f;
    }

    /* renamed from: f */
    public int m34144f() {
        return this.f5910h;
    }

    /* renamed from: g */
    public Registry m34143g() {
        return this.f5904b;
    }

    /* renamed from: h */
    public boolean m34142h() {
        return this.f5909g;
    }
}
