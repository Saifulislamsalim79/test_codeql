package com.bumptech.glide.load.engine;

import com.bumptech.glide.C1947d;
import com.bumptech.glide.EnumC1949f;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.C2122h;
import com.bumptech.glide.load.InterfaceC1996d;
import com.bumptech.glide.load.InterfaceC2118f;
import com.bumptech.glide.load.InterfaceC2125k;
import com.bumptech.glide.load.InterfaceC2126l;
import com.bumptech.glide.load.engine.RunnableC2049h;
import com.bumptech.glide.load.engine.p067a0.InterfaceC2012a;
import com.bumptech.glide.load.engine.p069z.InterfaceC2095b;
import com.bumptech.glide.load.p072n.InterfaceC2199n;
import com.bumptech.glide.load.p074o.C2250c;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DecodeHelper.java */
/* renamed from: com.bumptech.glide.load.engine.g */
/* loaded from: classes2.dex */
public final class C2048g<Transcode> {

    /* renamed from: a */
    private final List<InterfaceC2199n.C2200a<?>> f6176a = new ArrayList();

    /* renamed from: b */
    private final List<InterfaceC2118f> f6177b = new ArrayList();

    /* renamed from: c */
    private C1947d f6178c;

    /* renamed from: d */
    private Object f6179d;

    /* renamed from: e */
    private int f6180e;

    /* renamed from: f */
    private int f6181f;

    /* renamed from: g */
    private Class<?> f6182g;

    /* renamed from: h */
    private RunnableC2049h.InterfaceC2054e f6183h;

    /* renamed from: i */
    private C2122h f6184i;

    /* renamed from: j */
    private Map<Class<?>, InterfaceC2126l<?>> f6185j;

    /* renamed from: k */
    private Class<Transcode> f6186k;

    /* renamed from: l */
    private boolean f6187l;

    /* renamed from: m */
    private boolean f6188m;

    /* renamed from: n */
    private InterfaceC2118f f6189n;

    /* renamed from: o */
    private EnumC1949f f6190o;

    /* renamed from: p */
    private AbstractC2060j f6191p;

    /* renamed from: q */
    private boolean f6192q;

    /* renamed from: r */
    private boolean f6193r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m33878a() {
        this.f6178c = null;
        this.f6179d = null;
        this.f6189n = null;
        this.f6182g = null;
        this.f6186k = null;
        this.f6184i = null;
        this.f6190o = null;
        this.f6185j = null;
        this.f6191p = null;
        this.f6176a.clear();
        this.f6187l = false;
        this.f6177b.clear();
        this.f6188m = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public InterfaceC2095b m33877b() {
        return this.f6178c.m34149a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public List<InterfaceC2118f> m33876c() {
        if (!this.f6188m) {
            this.f6188m = true;
            this.f6177b.clear();
            List<InterfaceC2199n.C2200a<?>> m33872g = m33872g();
            int size = m33872g.size();
            for (int i = 0; i < size; i++) {
                InterfaceC2199n.C2200a<?> c2200a = m33872g.get(i);
                if (!this.f6177b.contains(c2200a.f6511a)) {
                    this.f6177b.add(c2200a.f6511a);
                }
                for (int i2 = 0; i2 < c2200a.f6512b.size(); i2++) {
                    if (!this.f6177b.contains(c2200a.f6512b.get(i2))) {
                        this.f6177b.add(c2200a.f6512b.get(i2));
                    }
                }
            }
        }
        return this.f6177b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public InterfaceC2012a m33875d() {
        return this.f6183h.mo33799a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public AbstractC2060j m33874e() {
        return this.f6191p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int m33873f() {
        return this.f6181f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public List<InterfaceC2199n.C2200a<?>> m33872g() {
        if (!this.f6187l) {
            this.f6187l = true;
            this.f6176a.clear();
            List m34181i = this.f6178c.m34143g().m34181i(this.f6179d);
            int size = m34181i.size();
            for (int i = 0; i < size; i++) {
                InterfaceC2199n.C2200a<?> mo33499b = ((InterfaceC2199n) m34181i.get(i)).mo33499b(this.f6179d, this.f6180e, this.f6181f, this.f6184i);
                if (mo33499b != null) {
                    this.f6176a.add(mo33499b);
                }
            }
        }
        return this.f6176a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public <Data> C2084s<Data, ?, Transcode> m33871h(Class<Data> cls) {
        return this.f6178c.m34143g().m34182h(cls, this.f6182g, this.f6186k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public Class<?> m33870i() {
        return this.f6179d.getClass();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public List<InterfaceC2199n<File, ?>> m33869j(File file) throws Registry.NoModelLoaderAvailableException {
        return this.f6178c.m34143g().m34181i(file);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public C2122h m33868k() {
        return this.f6184i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public EnumC1949f m33867l() {
        return this.f6190o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public List<Class<?>> m33866m() {
        return this.f6178c.m34143g().m34180j(this.f6179d.getClass(), this.f6182g, this.f6186k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public <Z> InterfaceC2125k<Z> m33865n(InterfaceC2087u<Z> interfaceC2087u) {
        return this.f6178c.m34143g().m34179k(interfaceC2087u);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public InterfaceC2118f m33864o() {
        return this.f6189n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public <X> InterfaceC1996d<X> m33863p(X x) throws Registry.NoSourceEncoderAvailableException {
        return this.f6178c.m34143g().m34177m(x);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public Class<?> m33862q() {
        return (Class<Transcode>) this.f6186k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public <Z> InterfaceC2126l<Z> m33861r(Class<Z> cls) {
        InterfaceC2126l<Z> interfaceC2126l = (InterfaceC2126l<Z>) this.f6185j.get(cls);
        if (interfaceC2126l == null) {
            Iterator<Map.Entry<Class<?>, InterfaceC2126l<?>>> it = this.f6185j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Class<?>, InterfaceC2126l<?>> next = it.next();
                if (next.getKey().isAssignableFrom(cls)) {
                    interfaceC2126l = (InterfaceC2126l<Z>) next.getValue();
                    break;
                }
            }
        }
        if (interfaceC2126l == null) {
            if (this.f6185j.isEmpty() && this.f6192q) {
                throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
            }
            return C2250c.m33493b();
        }
        return interfaceC2126l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public int m33860s() {
        return this.f6180e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: t */
    public boolean m33859t(Class<?> cls) {
        return m33871h(cls) != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: u */
    public <R> void m33858u(C1947d c1947d, Object obj, InterfaceC2118f interfaceC2118f, int i, int i2, AbstractC2060j abstractC2060j, Class<?> cls, Class<R> cls2, EnumC1949f enumC1949f, C2122h c2122h, Map<Class<?>, InterfaceC2126l<?>> map, boolean z, boolean z2, RunnableC2049h.InterfaceC2054e interfaceC2054e) {
        this.f6178c = c1947d;
        this.f6179d = obj;
        this.f6189n = interfaceC2118f;
        this.f6180e = i;
        this.f6181f = i2;
        this.f6191p = abstractC2060j;
        this.f6182g = cls;
        this.f6183h = interfaceC2054e;
        this.f6186k = cls2;
        this.f6190o = enumC1949f;
        this.f6184i = c2122h;
        this.f6185j = map;
        this.f6192q = z;
        this.f6193r = z2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public boolean m33857v(InterfaceC2087u<?> interfaceC2087u) {
        return this.f6178c.m34143g().m34176n(interfaceC2087u);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public boolean m33856w() {
        return this.f6193r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean m33855x(InterfaceC2118f interfaceC2118f) {
        List<InterfaceC2199n.C2200a<?>> m33872g = m33872g();
        int size = m33872g.size();
        for (int i = 0; i < size; i++) {
            if (m33872g.get(i).f6511a.equals(interfaceC2118f)) {
                return true;
            }
        }
        return false;
    }
}
