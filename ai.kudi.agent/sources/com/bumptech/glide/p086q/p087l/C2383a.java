package com.bumptech.glide.p086q.p087l;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import p201g.p227h.p237k.C7674g;
import p201g.p227h.p237k.InterfaceC7672e;
/* compiled from: FactoryPools.java */
/* renamed from: com.bumptech.glide.q.l.a */
/* loaded from: classes2.dex */
public final class C2383a {

    /* renamed from: a */
    private static final InterfaceC2390g<Object> f6878a = new C2384a();

    /* compiled from: FactoryPools.java */
    /* renamed from: com.bumptech.glide.q.l.a$a */
    /* loaded from: classes2.dex */
    class C2384a implements InterfaceC2390g<Object> {
        C2384a() {
        }

        @Override // com.bumptech.glide.p086q.p087l.C2383a.InterfaceC2390g
        /* renamed from: a */
        public void mo33099a(Object obj) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FactoryPools.java */
    /* renamed from: com.bumptech.glide.q.l.a$b */
    /* loaded from: classes2.dex */
    public class C2385b implements InterfaceC2387d<List<T>> {
        C2385b() {
        }

        @Override // com.bumptech.glide.p086q.p087l.C2383a.InterfaceC2387d
        /* renamed from: a */
        public List<T> create() {
            return new ArrayList();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FactoryPools.java */
    /* renamed from: com.bumptech.glide.q.l.a$c */
    /* loaded from: classes2.dex */
    public class C2386c implements InterfaceC2390g<List<T>> {
        C2386c() {
        }

        @Override // com.bumptech.glide.p086q.p087l.C2383a.InterfaceC2390g
        /* renamed from: b */
        public void mo33099a(List<T> list) {
            list.clear();
        }
    }

    /* compiled from: FactoryPools.java */
    /* renamed from: com.bumptech.glide.q.l.a$d */
    /* loaded from: classes2.dex */
    public interface InterfaceC2387d<T> {
        T create();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FactoryPools.java */
    /* renamed from: com.bumptech.glide.q.l.a$e */
    /* loaded from: classes2.dex */
    public static final class C2388e<T> implements InterfaceC7672e<T> {

        /* renamed from: a */
        private final InterfaceC2387d<T> f6879a;

        /* renamed from: b */
        private final InterfaceC2390g<T> f6880b;

        /* renamed from: c */
        private final InterfaceC7672e<T> f6881c;

        C2388e(InterfaceC7672e<T> interfaceC7672e, InterfaceC2387d<T> interfaceC2387d, InterfaceC2390g<T> interfaceC2390g) {
            this.f6881c = interfaceC7672e;
            this.f6879a = interfaceC2387d;
            this.f6880b = interfaceC2390g;
        }

        @Override // p201g.p227h.p237k.InterfaceC7672e
        /* renamed from: a */
        public boolean mo11983a(T t) {
            if (t instanceof InterfaceC2389f) {
                ((InterfaceC2389f) t).mo33100g().mo33093b(true);
            }
            this.f6880b.mo33099a(t);
            return this.f6881c.mo11983a(t);
        }

        @Override // p201g.p227h.p237k.InterfaceC7672e
        /* renamed from: b */
        public T mo11982b() {
            T mo11982b = this.f6881c.mo11982b();
            if (mo11982b == null) {
                mo11982b = this.f6879a.create();
                if (Log.isLoggable("FactoryPools", 2)) {
                    Log.v("FactoryPools", "Created new " + mo11982b.getClass());
                }
            }
            if (mo11982b instanceof InterfaceC2389f) {
                ((InterfaceC2389f) mo11982b).mo33100g().mo33093b(false);
            }
            return mo11982b;
        }
    }

    /* compiled from: FactoryPools.java */
    /* renamed from: com.bumptech.glide.q.l.a$f */
    /* loaded from: classes2.dex */
    public interface InterfaceC2389f {
        /* renamed from: g */
        AbstractC2392c mo33100g();
    }

    /* compiled from: FactoryPools.java */
    /* renamed from: com.bumptech.glide.q.l.a$g */
    /* loaded from: classes2.dex */
    public interface InterfaceC2390g<T> {
        /* renamed from: a */
        void mo33099a(T t);
    }

    /* renamed from: a */
    private static <T extends InterfaceC2389f> InterfaceC7672e<T> m33108a(InterfaceC7672e<T> interfaceC7672e, InterfaceC2387d<T> interfaceC2387d) {
        return m33107b(interfaceC7672e, interfaceC2387d, m33106c());
    }

    /* renamed from: b */
    private static <T> InterfaceC7672e<T> m33107b(InterfaceC7672e<T> interfaceC7672e, InterfaceC2387d<T> interfaceC2387d, InterfaceC2390g<T> interfaceC2390g) {
        return new C2388e(interfaceC7672e, interfaceC2387d, interfaceC2390g);
    }

    /* renamed from: c */
    private static <T> InterfaceC2390g<T> m33106c() {
        return (InterfaceC2390g<T>) f6878a;
    }

    /* renamed from: d */
    public static <T extends InterfaceC2389f> InterfaceC7672e<T> m33105d(int i, InterfaceC2387d<T> interfaceC2387d) {
        return m33108a(new C7674g(i), interfaceC2387d);
    }

    /* renamed from: e */
    public static <T> InterfaceC7672e<List<T>> m33104e() {
        return m33103f(20);
    }

    /* renamed from: f */
    public static <T> InterfaceC7672e<List<T>> m33103f(int i) {
        return m33107b(new C7674g(i), new C2385b(), new C2386c());
    }
}
