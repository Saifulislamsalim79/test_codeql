package io.intercom.com.bumptech.glide.p416r.p417j;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import p201g.p227h.p237k.C7673f;
import p201g.p227h.p237k.C7674g;
import p201g.p227h.p237k.InterfaceC7672e;
/* compiled from: FactoryPools.java */
/* renamed from: io.intercom.com.bumptech.glide.r.j.a */
/* loaded from: classes3.dex */
public final class C10895a {

    /* renamed from: a */
    private static final InterfaceC10902g<Object> f24865a = new C10896a();

    /* compiled from: FactoryPools.java */
    /* renamed from: io.intercom.com.bumptech.glide.r.j.a$a */
    /* loaded from: classes3.dex */
    static class C10896a implements InterfaceC10902g<Object> {
        C10896a() {
        }

        @Override // io.intercom.com.bumptech.glide.p416r.p417j.C10895a.InterfaceC10902g
        /* renamed from: a */
        public void mo11980a(Object obj) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FactoryPools.java */
    /* renamed from: io.intercom.com.bumptech.glide.r.j.a$b */
    /* loaded from: classes3.dex */
    public static class C10897b implements InterfaceC10899d<List<T>> {
        C10897b() {
        }

        @Override // io.intercom.com.bumptech.glide.p416r.p417j.C10895a.InterfaceC10899d
        /* renamed from: a */
        public List<T> create() {
            return new ArrayList();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FactoryPools.java */
    /* renamed from: io.intercom.com.bumptech.glide.r.j.a$c */
    /* loaded from: classes3.dex */
    public static class C10898c implements InterfaceC10902g<List<T>> {
        C10898c() {
        }

        @Override // io.intercom.com.bumptech.glide.p416r.p417j.C10895a.InterfaceC10902g
        /* renamed from: b */
        public void mo11980a(List<T> list) {
            list.clear();
        }
    }

    /* compiled from: FactoryPools.java */
    /* renamed from: io.intercom.com.bumptech.glide.r.j.a$d */
    /* loaded from: classes3.dex */
    public interface InterfaceC10899d<T> {
        T create();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FactoryPools.java */
    /* renamed from: io.intercom.com.bumptech.glide.r.j.a$e */
    /* loaded from: classes3.dex */
    public static final class C10900e<T> implements InterfaceC7672e<T> {

        /* renamed from: a */
        private final InterfaceC10899d<T> f24866a;

        /* renamed from: b */
        private final InterfaceC10902g<T> f24867b;

        /* renamed from: c */
        private final InterfaceC7672e<T> f24868c;

        C10900e(InterfaceC7672e<T> interfaceC7672e, InterfaceC10899d<T> interfaceC10899d, InterfaceC10902g<T> interfaceC10902g) {
            this.f24868c = interfaceC7672e;
            this.f24866a = interfaceC10899d;
            this.f24867b = interfaceC10902g;
        }

        @Override // p201g.p227h.p237k.InterfaceC7672e
        /* renamed from: a */
        public boolean mo11983a(T t) {
            if (t instanceof InterfaceC10901f) {
                ((InterfaceC10901f) t).mo11981g().mo11978b(true);
            }
            this.f24867b.mo11980a(t);
            return this.f24868c.mo11983a(t);
        }

        @Override // p201g.p227h.p237k.InterfaceC7672e
        /* renamed from: b */
        public T mo11982b() {
            T mo11982b = this.f24868c.mo11982b();
            if (mo11982b == null) {
                mo11982b = this.f24866a.create();
                if (Log.isLoggable("FactoryPools", 2)) {
                    Log.v("FactoryPools", "Created new " + mo11982b.getClass());
                }
            }
            if (mo11982b instanceof InterfaceC10901f) {
                ((InterfaceC10901f) mo11982b).mo11981g().mo11978b(false);
            }
            return mo11982b;
        }
    }

    /* compiled from: FactoryPools.java */
    /* renamed from: io.intercom.com.bumptech.glide.r.j.a$f */
    /* loaded from: classes3.dex */
    public interface InterfaceC10901f {
        /* renamed from: g */
        AbstractC10903b mo11981g();
    }

    /* compiled from: FactoryPools.java */
    /* renamed from: io.intercom.com.bumptech.glide.r.j.a$g */
    /* loaded from: classes3.dex */
    public interface InterfaceC10902g<T> {
        /* renamed from: a */
        void mo11980a(T t);
    }

    /* renamed from: a */
    private static <T extends InterfaceC10901f> InterfaceC7672e<T> m11992a(InterfaceC7672e<T> interfaceC7672e, InterfaceC10899d<T> interfaceC10899d) {
        return m11991b(interfaceC7672e, interfaceC10899d, m11990c());
    }

    /* renamed from: b */
    private static <T> InterfaceC7672e<T> m11991b(InterfaceC7672e<T> interfaceC7672e, InterfaceC10899d<T> interfaceC10899d, InterfaceC10902g<T> interfaceC10902g) {
        return new C10900e(interfaceC7672e, interfaceC10899d, interfaceC10902g);
    }

    /* renamed from: c */
    private static <T> InterfaceC10902g<T> m11990c() {
        return (InterfaceC10902g<T>) f24865a;
    }

    /* renamed from: d */
    public static <T extends InterfaceC10901f> InterfaceC7672e<T> m11989d(int i, InterfaceC10899d<T> interfaceC10899d) {
        return m11992a(new C7673f(i), interfaceC10899d);
    }

    /* renamed from: e */
    public static <T extends InterfaceC10901f> InterfaceC7672e<T> m11988e(int i, InterfaceC10899d<T> interfaceC10899d) {
        return m11992a(new C7674g(i), interfaceC10899d);
    }

    /* renamed from: f */
    public static <T> InterfaceC7672e<List<T>> m11987f() {
        return m11986g(20);
    }

    /* renamed from: g */
    public static <T> InterfaceC7672e<List<T>> m11986g(int i) {
        return m11991b(new C7674g(i), new C10897b(), new C10898c());
    }
}
