package io.intercom.com.bumptech.glide.load.engine;

import android.util.Log;
import io.intercom.com.bumptech.glide.C10480e;
import io.intercom.com.bumptech.glide.EnumC10482g;
import io.intercom.com.bumptech.glide.load.C10626i;
import io.intercom.com.bumptech.glide.load.EnumC10507a;
import io.intercom.com.bumptech.glide.load.InterfaceC10622g;
import io.intercom.com.bumptech.glide.load.InterfaceC10629l;
import io.intercom.com.bumptech.glide.load.engine.C10562o;
import io.intercom.com.bumptech.glide.load.engine.RunnableC10533g;
import io.intercom.com.bumptech.glide.load.engine.p394a0.ExecutorServiceC10519a;
import io.intercom.com.bumptech.glide.load.engine.p397z.C10602b;
import io.intercom.com.bumptech.glide.load.engine.p397z.InterfaceC10599a;
import io.intercom.com.bumptech.glide.load.engine.p397z.InterfaceC10612h;
import io.intercom.com.bumptech.glide.p412p.InterfaceC10857h;
import io.intercom.com.bumptech.glide.p416r.C10888d;
import io.intercom.com.bumptech.glide.p416r.C10892h;
import io.intercom.com.bumptech.glide.p416r.C10893i;
import io.intercom.com.bumptech.glide.p416r.p417j.C10895a;
import java.util.Map;
import p201g.p227h.p237k.InterfaceC7672e;
/* compiled from: Engine.java */
/* renamed from: io.intercom.com.bumptech.glide.load.engine.j */
/* loaded from: classes3.dex */
public class C10549j implements InterfaceC10559l, InterfaceC10612h.InterfaceC10613a, C10562o.InterfaceC10563a {

    /* renamed from: a */
    private final C10565q f24240a;

    /* renamed from: b */
    private final C10561n f24241b;

    /* renamed from: c */
    private final InterfaceC10612h f24242c;

    /* renamed from: d */
    private final C10552b f24243d;

    /* renamed from: e */
    private final C10572w f24244e;

    /* renamed from: f */
    private final C10554c f24245f;

    /* renamed from: g */
    private final C10550a f24246g;

    /* renamed from: h */
    private final C10514a f24247h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Engine.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.engine.j$a */
    /* loaded from: classes3.dex */
    public static class C10550a {

        /* renamed from: a */
        final RunnableC10533g.InterfaceC10538e f24248a;

        /* renamed from: b */
        final InterfaceC7672e<RunnableC10533g<?>> f24249b = C10895a.m11989d(150, new C10551a());

        /* renamed from: c */
        private int f24250c;

        /* compiled from: Engine.java */
        /* renamed from: io.intercom.com.bumptech.glide.load.engine.j$a$a */
        /* loaded from: classes3.dex */
        class C10551a implements C10895a.InterfaceC10899d<RunnableC10533g<?>> {
            C10551a() {
            }

            @Override // io.intercom.com.bumptech.glide.p416r.p417j.C10895a.InterfaceC10899d
            /* renamed from: a */
            public RunnableC10533g<?> create() {
                C10550a c10550a = C10550a.this;
                return new RunnableC10533g<>(c10550a.f24248a, c10550a.f24249b);
            }
        }

        C10550a(RunnableC10533g.InterfaceC10538e interfaceC10538e) {
            this.f24248a = interfaceC10538e;
        }

        /* renamed from: a */
        <R> RunnableC10533g<R> m12765a(C10480e c10480e, Object obj, C10560m c10560m, InterfaceC10622g interfaceC10622g, int i, int i2, Class<?> cls, Class<R> cls2, EnumC10482g enumC10482g, AbstractC10544i abstractC10544i, Map<Class<?>, InterfaceC10629l<?>> map, boolean z, boolean z2, boolean z3, C10626i c10626i, RunnableC10533g.InterfaceC10535b<R> interfaceC10535b) {
            RunnableC10533g<?> mo11982b = this.f24249b.mo11982b();
            C10892h.m12014d(mo11982b);
            RunnableC10533g<R> runnableC10533g = (RunnableC10533g<R>) mo11982b;
            int i3 = this.f24250c;
            this.f24250c = i3 + 1;
            runnableC10533g.m12791y(c10480e, obj, c10560m, interfaceC10622g, i, i2, cls, cls2, enumC10482g, abstractC10544i, map, z, z2, z3, c10626i, interfaceC10535b, i3);
            return runnableC10533g;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Engine.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.engine.j$b */
    /* loaded from: classes3.dex */
    public static class C10552b {

        /* renamed from: a */
        final ExecutorServiceC10519a f24252a;

        /* renamed from: b */
        final ExecutorServiceC10519a f24253b;

        /* renamed from: c */
        final ExecutorServiceC10519a f24254c;

        /* renamed from: d */
        final ExecutorServiceC10519a f24255d;

        /* renamed from: e */
        final InterfaceC10559l f24256e;

        /* renamed from: f */
        final InterfaceC7672e<C10556k<?>> f24257f = C10895a.m11989d(150, new C10553a());

        /* compiled from: Engine.java */
        /* renamed from: io.intercom.com.bumptech.glide.load.engine.j$b$a */
        /* loaded from: classes3.dex */
        class C10553a implements C10895a.InterfaceC10899d<C10556k<?>> {
            C10553a() {
            }

            @Override // io.intercom.com.bumptech.glide.p416r.p417j.C10895a.InterfaceC10899d
            /* renamed from: a */
            public C10556k<?> create() {
                C10552b c10552b = C10552b.this;
                return new C10556k<>(c10552b.f24252a, c10552b.f24253b, c10552b.f24254c, c10552b.f24255d, c10552b.f24256e, c10552b.f24257f);
            }
        }

        C10552b(ExecutorServiceC10519a executorServiceC10519a, ExecutorServiceC10519a executorServiceC10519a2, ExecutorServiceC10519a executorServiceC10519a3, ExecutorServiceC10519a executorServiceC10519a4, InterfaceC10559l interfaceC10559l) {
            this.f24252a = executorServiceC10519a;
            this.f24253b = executorServiceC10519a2;
            this.f24254c = executorServiceC10519a3;
            this.f24255d = executorServiceC10519a4;
            this.f24256e = interfaceC10559l;
        }

        /* renamed from: a */
        <R> C10556k<R> m12763a(InterfaceC10622g interfaceC10622g, boolean z, boolean z2, boolean z3, boolean z4) {
            C10556k<?> mo11982b = this.f24257f.mo11982b();
            C10892h.m12014d(mo11982b);
            C10556k<R> c10556k = (C10556k<R>) mo11982b;
            c10556k.m12749l(interfaceC10622g, z, z2, z3, z4);
            return c10556k;
        }
    }

    /* compiled from: Engine.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.engine.j$c */
    /* loaded from: classes3.dex */
    private static class C10554c implements RunnableC10533g.InterfaceC10538e {

        /* renamed from: a */
        private final InterfaceC10599a.InterfaceC10600a f24259a;

        /* renamed from: b */
        private volatile InterfaceC10599a f24260b;

        C10554c(InterfaceC10599a.InterfaceC10600a interfaceC10600a) {
            this.f24259a = interfaceC10600a;
        }

        @Override // io.intercom.com.bumptech.glide.load.engine.RunnableC10533g.InterfaceC10538e
        /* renamed from: a */
        public InterfaceC10599a mo12761a() {
            if (this.f24260b == null) {
                synchronized (this) {
                    if (this.f24260b == null) {
                        this.f24260b = this.f24259a.build();
                    }
                    if (this.f24260b == null) {
                        this.f24260b = new C10602b();
                    }
                }
            }
            return this.f24260b;
        }
    }

    /* compiled from: Engine.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.engine.j$d */
    /* loaded from: classes3.dex */
    public static class C10555d {

        /* renamed from: a */
        private final C10556k<?> f24261a;

        /* renamed from: b */
        private final InterfaceC10857h f24262b;

        C10555d(InterfaceC10857h interfaceC10857h, C10556k<?> c10556k) {
            this.f24262b = interfaceC10857h;
            this.f24261a = c10556k;
        }

        /* renamed from: a */
        public void m12760a() {
            this.f24261a.m12745p(this.f24262b);
        }
    }

    public C10549j(InterfaceC10612h interfaceC10612h, InterfaceC10599a.InterfaceC10600a interfaceC10600a, ExecutorServiceC10519a executorServiceC10519a, ExecutorServiceC10519a executorServiceC10519a2, ExecutorServiceC10519a executorServiceC10519a3, ExecutorServiceC10519a executorServiceC10519a4, boolean z) {
        this(interfaceC10612h, interfaceC10600a, executorServiceC10519a, executorServiceC10519a2, executorServiceC10519a3, executorServiceC10519a4, null, null, null, null, null, null, z);
    }

    /* renamed from: e */
    private C10562o<?> m12771e(InterfaceC10622g interfaceC10622g) {
        InterfaceC10569t<?> mo12628c = this.f24242c.mo12628c(interfaceC10622g);
        if (mo12628c == null) {
            return null;
        }
        if (mo12628c instanceof C10562o) {
            return (C10562o) mo12628c;
        }
        return new C10562o<>(mo12628c, true, true);
    }

    /* renamed from: g */
    private C10562o<?> m12769g(InterfaceC10622g interfaceC10622g, boolean z) {
        if (z) {
            C10562o<?> m12853i = this.f24247h.m12853i(interfaceC10622g);
            if (m12853i != null) {
                m12853i.m12739a();
            }
            return m12853i;
        }
        return null;
    }

    /* renamed from: h */
    private C10562o<?> m12768h(InterfaceC10622g interfaceC10622g, boolean z) {
        if (z) {
            C10562o<?> m12771e = m12771e(interfaceC10622g);
            if (m12771e != null) {
                m12771e.m12739a();
                this.f24247h.m12856f(interfaceC10622g, m12771e);
            }
            return m12771e;
        }
        return null;
    }

    /* renamed from: i */
    private static void m12767i(String str, long j, InterfaceC10622g interfaceC10622g) {
        Log.v("Engine", str + " in " + C10888d.m12032a(j) + "ms, key: " + interfaceC10622g);
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.C10562o.InterfaceC10563a
    /* renamed from: a */
    public void mo12734a(InterfaceC10622g interfaceC10622g, C10562o<?> c10562o) {
        C10893i.m12011b();
        this.f24247h.m12854h(interfaceC10622g);
        if (c10562o.m12737e()) {
            this.f24242c.mo12627d(interfaceC10622g, c10562o);
        } else {
            this.f24244e.m12720a(c10562o);
        }
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.p397z.InterfaceC10612h.InterfaceC10613a
    /* renamed from: b */
    public void mo12625b(InterfaceC10569t<?> interfaceC10569t) {
        C10893i.m12011b();
        this.f24244e.m12720a(interfaceC10569t);
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.InterfaceC10559l
    /* renamed from: c */
    public void mo12742c(C10556k<?> c10556k, InterfaceC10622g interfaceC10622g, C10562o<?> c10562o) {
        C10893i.m12011b();
        if (c10562o != null) {
            c10562o.m12735g(interfaceC10622g, this);
            if (c10562o.m12737e()) {
                this.f24247h.m12856f(interfaceC10622g, c10562o);
            }
        }
        this.f24240a.m12730d(interfaceC10622g, c10556k);
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.InterfaceC10559l
    /* renamed from: d */
    public void mo12741d(C10556k<?> c10556k, InterfaceC10622g interfaceC10622g) {
        C10893i.m12011b();
        this.f24240a.m12730d(interfaceC10622g, c10556k);
    }

    /* renamed from: f */
    public <R> C10555d m12770f(C10480e c10480e, Object obj, InterfaceC10622g interfaceC10622g, int i, int i2, Class<?> cls, Class<R> cls2, EnumC10482g enumC10482g, AbstractC10544i abstractC10544i, Map<Class<?>, InterfaceC10629l<?>> map, boolean z, boolean z2, C10626i c10626i, boolean z3, boolean z4, boolean z5, boolean z6, InterfaceC10857h interfaceC10857h) {
        C10893i.m12011b();
        long m12031b = C10888d.m12031b();
        C10560m m12740a = this.f24241b.m12740a(obj, interfaceC10622g, i, i2, map, cls, cls2, c10626i);
        C10562o<?> m12769g = m12769g(m12740a, z3);
        if (m12769g != null) {
            interfaceC10857h.mo12111a(m12769g, EnumC10507a.MEMORY_CACHE);
            if (Log.isLoggable("Engine", 2)) {
                m12767i("Loaded resource from active resources", m12031b, m12740a);
            }
            return null;
        }
        C10562o<?> m12768h = m12768h(m12740a, z3);
        if (m12768h != null) {
            interfaceC10857h.mo12111a(m12768h, EnumC10507a.MEMORY_CACHE);
            if (Log.isLoggable("Engine", 2)) {
                m12767i("Loaded resource from cache", m12031b, m12740a);
            }
            return null;
        }
        C10556k<?> m12733a = this.f24240a.m12733a(m12740a, z6);
        if (m12733a != null) {
            m12733a.m12758b(interfaceC10857h);
            if (Log.isLoggable("Engine", 2)) {
                m12767i("Added to existing load", m12031b, m12740a);
            }
            return new C10555d(interfaceC10857h, m12733a);
        }
        C10556k<R> m12763a = this.f24243d.m12763a(m12740a, z3, z4, z5, z6);
        RunnableC10533g<R> m12765a = this.f24246g.m12765a(c10480e, obj, m12740a, interfaceC10622g, i, i2, cls, cls2, enumC10482g, abstractC10544i, map, z, z2, z6, c10626i, m12763a);
        this.f24240a.m12731c(m12740a, m12763a);
        m12763a.m12758b(interfaceC10857h);
        m12763a.m12744q(m12765a);
        if (Log.isLoggable("Engine", 2)) {
            m12767i("Started new load", m12031b, m12740a);
        }
        return new C10555d(interfaceC10857h, m12763a);
    }

    /* renamed from: j */
    public void m12766j(InterfaceC10569t<?> interfaceC10569t) {
        C10893i.m12011b();
        if (interfaceC10569t instanceof C10562o) {
            ((C10562o) interfaceC10569t).m12736f();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    C10549j(InterfaceC10612h interfaceC10612h, InterfaceC10599a.InterfaceC10600a interfaceC10600a, ExecutorServiceC10519a executorServiceC10519a, ExecutorServiceC10519a executorServiceC10519a2, ExecutorServiceC10519a executorServiceC10519a3, ExecutorServiceC10519a executorServiceC10519a4, C10565q c10565q, C10561n c10561n, C10514a c10514a, C10552b c10552b, C10550a c10550a, C10572w c10572w, boolean z) {
        this.f24242c = interfaceC10612h;
        this.f24245f = new C10554c(interfaceC10600a);
        C10514a c10514a2 = c10514a == null ? new C10514a(z) : c10514a;
        this.f24247h = c10514a2;
        c10514a2.m12851k(this);
        this.f24241b = c10561n == null ? new C10561n() : c10561n;
        this.f24240a = c10565q == null ? new C10565q() : c10565q;
        this.f24243d = c10552b == null ? new C10552b(executorServiceC10519a, executorServiceC10519a2, executorServiceC10519a3, executorServiceC10519a4, this) : c10552b;
        this.f24246g = c10550a == null ? new C10550a(this.f24245f) : c10550a;
        this.f24244e = c10572w == null ? new C10572w() : c10572w;
        interfaceC10612h.mo12626e(this);
    }
}
