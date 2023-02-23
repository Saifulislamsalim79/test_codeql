package io.intercom.com.bumptech.glide.load.engine;

import io.intercom.com.bumptech.glide.C10480e;
import io.intercom.com.bumptech.glide.EnumC10482g;
import io.intercom.com.bumptech.glide.Registry;
import io.intercom.com.bumptech.glide.load.C10626i;
import io.intercom.com.bumptech.glide.load.InterfaceC10510d;
import io.intercom.com.bumptech.glide.load.InterfaceC10622g;
import io.intercom.com.bumptech.glide.load.InterfaceC10628k;
import io.intercom.com.bumptech.glide.load.InterfaceC10629l;
import io.intercom.com.bumptech.glide.load.engine.RunnableC10533g;
import io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10576b;
import io.intercom.com.bumptech.glide.load.engine.p397z.InterfaceC10599a;
import io.intercom.com.bumptech.glide.load.p400n.InterfaceC10697n;
import io.intercom.com.bumptech.glide.load.p402o.C10737b;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DecodeHelper.java */
/* renamed from: io.intercom.com.bumptech.glide.load.engine.f */
/* loaded from: classes3.dex */
public final class C10532f<Transcode> {

    /* renamed from: a */
    private final List<InterfaceC10697n.C10698a<?>> f24162a = new ArrayList();

    /* renamed from: b */
    private final List<InterfaceC10622g> f24163b = new ArrayList();

    /* renamed from: c */
    private C10480e f24164c;

    /* renamed from: d */
    private Object f24165d;

    /* renamed from: e */
    private int f24166e;

    /* renamed from: f */
    private int f24167f;

    /* renamed from: g */
    private Class<?> f24168g;

    /* renamed from: h */
    private RunnableC10533g.InterfaceC10538e f24169h;

    /* renamed from: i */
    private C10626i f24170i;

    /* renamed from: j */
    private Map<Class<?>, InterfaceC10629l<?>> f24171j;

    /* renamed from: k */
    private Class<Transcode> f24172k;

    /* renamed from: l */
    private boolean f24173l;

    /* renamed from: m */
    private boolean f24174m;

    /* renamed from: n */
    private InterfaceC10622g f24175n;

    /* renamed from: o */
    private EnumC10482g f24176o;

    /* renamed from: p */
    private AbstractC10544i f24177p;

    /* renamed from: q */
    private boolean f24178q;

    /* renamed from: r */
    private boolean f24179r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m12836a() {
        this.f24164c = null;
        this.f24165d = null;
        this.f24175n = null;
        this.f24168g = null;
        this.f24172k = null;
        this.f24170i = null;
        this.f24176o = null;
        this.f24171j = null;
        this.f24177p = null;
        this.f24162a.clear();
        this.f24173l = false;
        this.f24163b.clear();
        this.f24174m = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public InterfaceC10576b m12835b() {
        return this.f24164c.m13012b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public List<InterfaceC10622g> m12834c() {
        if (!this.f24174m) {
            this.f24174m = true;
            this.f24163b.clear();
            List<InterfaceC10697n.C10698a<?>> m12830g = m12830g();
            int size = m12830g.size();
            for (int i = 0; i < size; i++) {
                InterfaceC10697n.C10698a<?> c10698a = m12830g.get(i);
                if (!this.f24163b.contains(c10698a.f24505a)) {
                    this.f24163b.add(c10698a.f24505a);
                }
                for (int i2 = 0; i2 < c10698a.f24506b.size(); i2++) {
                    if (!this.f24163b.contains(c10698a.f24506b.get(i2))) {
                        this.f24163b.add(c10698a.f24506b.get(i2));
                    }
                }
            }
        }
        return this.f24163b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public InterfaceC10599a m12833d() {
        return this.f24169h.mo12761a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public AbstractC10544i m12832e() {
        return this.f24177p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int m12831f() {
        return this.f24167f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public List<InterfaceC10697n.C10698a<?>> m12830g() {
        if (!this.f24173l) {
            this.f24173l = true;
            this.f24162a.clear();
            List m13048i = this.f24164c.m13006h().m13048i(this.f24165d);
            int size = m13048i.size();
            for (int i = 0; i < size; i++) {
                InterfaceC10697n.C10698a<?> mo12456b = ((InterfaceC10697n) m13048i.get(i)).mo12456b(this.f24165d, this.f24166e, this.f24167f, this.f24170i);
                if (mo12456b != null) {
                    this.f24162a.add(mo12456b);
                }
            }
        }
        return this.f24162a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public <Data> C10566r<Data, ?, Transcode> m12829h(Class<Data> cls) {
        return this.f24164c.m13006h().m13049h(cls, this.f24168g, this.f24172k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public List<InterfaceC10697n<File, ?>> m12828i(File file) throws Registry.NoModelLoaderAvailableException {
        return this.f24164c.m13006h().m13048i(file);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public C10626i m12827j() {
        return this.f24170i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public EnumC10482g m12826k() {
        return this.f24176o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public List<Class<?>> m12825l() {
        return this.f24164c.m13006h().m13047j(this.f24165d.getClass(), this.f24168g, this.f24172k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public <Z> InterfaceC10628k<Z> m12824m(InterfaceC10569t<Z> interfaceC10569t) {
        return this.f24164c.m13006h().m13046k(interfaceC10569t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public InterfaceC10622g m12823n() {
        return this.f24175n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public <X> InterfaceC10510d<X> m12822o(X x) throws Registry.NoSourceEncoderAvailableException {
        return this.f24164c.m13006h().m13044m(x);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public <Z> InterfaceC10629l<Z> m12821p(Class<Z> cls) {
        InterfaceC10629l<Z> interfaceC10629l = (InterfaceC10629l<Z>) this.f24171j.get(cls);
        if (interfaceC10629l == null) {
            Iterator<Map.Entry<Class<?>, InterfaceC10629l<?>>> it = this.f24171j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Class<?>, InterfaceC10629l<?>> next = it.next();
                if (next.getKey().isAssignableFrom(cls)) {
                    interfaceC10629l = (InterfaceC10629l<Z>) next.getValue();
                    break;
                }
            }
        }
        if (interfaceC10629l == null) {
            if (this.f24171j.isEmpty() && this.f24178q) {
                throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
            }
            return C10737b.m12452a();
        }
        return interfaceC10629l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public int m12820q() {
        return this.f24166e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: r */
    public boolean m12819r(Class<?> cls) {
        return m12829h(cls) != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: s */
    public <R> void m12818s(C10480e c10480e, Object obj, InterfaceC10622g interfaceC10622g, int i, int i2, AbstractC10544i abstractC10544i, Class<?> cls, Class<R> cls2, EnumC10482g enumC10482g, C10626i c10626i, Map<Class<?>, InterfaceC10629l<?>> map, boolean z, boolean z2, RunnableC10533g.InterfaceC10538e interfaceC10538e) {
        this.f24164c = c10480e;
        this.f24165d = obj;
        this.f24175n = interfaceC10622g;
        this.f24166e = i;
        this.f24167f = i2;
        this.f24177p = abstractC10544i;
        this.f24168g = cls;
        this.f24169h = interfaceC10538e;
        this.f24172k = cls2;
        this.f24176o = enumC10482g;
        this.f24170i = c10626i;
        this.f24171j = map;
        this.f24178q = z;
        this.f24179r = z2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean m12817t(InterfaceC10569t<?> interfaceC10569t) {
        return this.f24164c.m13006h().m13043n(interfaceC10569t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public boolean m12816u() {
        return this.f24179r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public boolean m12815v(InterfaceC10622g interfaceC10622g) {
        List<InterfaceC10697n.C10698a<?>> m12830g = m12830g();
        int size = m12830g.size();
        for (int i = 0; i < size; i++) {
            if (m12830g.get(i).f24505a.equals(interfaceC10622g)) {
                return true;
            }
        }
        return false;
    }
}
