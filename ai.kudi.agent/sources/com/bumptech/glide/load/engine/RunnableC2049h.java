package com.bumptech.glide.load.engine;

import android.os.Build;
import android.util.Log;
import com.bumptech.glide.C1947d;
import com.bumptech.glide.EnumC1949f;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.C2122h;
import com.bumptech.glide.load.EnumC1993a;
import com.bumptech.glide.load.EnumC1995c;
import com.bumptech.glide.load.InterfaceC2118f;
import com.bumptech.glide.load.InterfaceC2125k;
import com.bumptech.glide.load.InterfaceC2126l;
import com.bumptech.glide.load.engine.C2058i;
import com.bumptech.glide.load.engine.InterfaceC2046f;
import com.bumptech.glide.load.engine.p067a0.InterfaceC2012a;
import com.bumptech.glide.load.p070m.InterfaceC2130d;
import com.bumptech.glide.load.p070m.InterfaceC2132e;
import com.bumptech.glide.load.resource.bitmap.C2301i;
import com.bumptech.glide.p086q.C2376f;
import com.bumptech.glide.p086q.p087l.AbstractC2392c;
import com.bumptech.glide.p086q.p087l.C2383a;
import com.bumptech.glide.p086q.p087l.C2391b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p201g.p227h.p237k.InterfaceC7672e;
/* compiled from: DecodeJob.java */
/* renamed from: com.bumptech.glide.load.engine.h */
/* loaded from: classes2.dex */
class RunnableC2049h<R> implements InterfaceC2046f.InterfaceC2047a, Runnable, Comparable<RunnableC2049h<?>>, C2383a.InterfaceC2389f {

    /* renamed from: A */
    private InterfaceC2118f f6194A;

    /* renamed from: B */
    private EnumC1949f f6195B;

    /* renamed from: C */
    private C2078n f6196C;

    /* renamed from: D */
    private int f6197D;

    /* renamed from: E */
    private int f6198E;

    /* renamed from: F */
    private AbstractC2060j f6199F;

    /* renamed from: G */
    private C2122h f6200G;

    /* renamed from: H */
    private InterfaceC2051b<R> f6201H;

    /* renamed from: I */
    private int f6202I;

    /* renamed from: J */
    private EnumC2057h f6203J;

    /* renamed from: K */
    private EnumC2056g f6204K;

    /* renamed from: L */
    private long f6205L;

    /* renamed from: M */
    private boolean f6206M;

    /* renamed from: N */
    private Object f6207N;

    /* renamed from: O */
    private Thread f6208O;

    /* renamed from: P */
    private InterfaceC2118f f6209P;

    /* renamed from: Q */
    private InterfaceC2118f f6210Q;

    /* renamed from: R */
    private Object f6211R;

    /* renamed from: S */
    private EnumC1993a f6212S;

    /* renamed from: T */
    private InterfaceC2130d<?> f6213T;

    /* renamed from: U */
    private volatile InterfaceC2046f f6214U;

    /* renamed from: V */
    private volatile boolean f6215V;

    /* renamed from: W */
    private volatile boolean f6216W;

    /* renamed from: f */
    private final InterfaceC2054e f6220f;

    /* renamed from: w */
    private final InterfaceC7672e<RunnableC2049h<?>> f6221w;

    /* renamed from: z */
    private C1947d f6224z;

    /* renamed from: c */
    private final C2048g<R> f6217c = new C2048g<>();

    /* renamed from: d */
    private final List<Throwable> f6218d = new ArrayList();

    /* renamed from: e */
    private final AbstractC2392c f6219e = AbstractC2392c.m33094a();

    /* renamed from: x */
    private final C2053d<?> f6222x = new C2053d<>();

    /* renamed from: y */
    private final C2055f f6223y = new C2055f();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DecodeJob.java */
    /* renamed from: com.bumptech.glide.load.engine.h$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C2050a {

        /* renamed from: a */
        static final /* synthetic */ int[] f6225a;

        /* renamed from: b */
        static final /* synthetic */ int[] f6226b;

        /* renamed from: c */
        static final /* synthetic */ int[] f6227c;

        static {
            int[] iArr = new int[EnumC1995c.values().length];
            f6227c = iArr;
            try {
                iArr[EnumC1995c.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6227c[EnumC1995c.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC2057h.values().length];
            f6226b = iArr2;
            try {
                iArr2[EnumC2057h.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6226b[EnumC2057h.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6226b[EnumC2057h.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6226b[EnumC2057h.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6226b[EnumC2057h.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[EnumC2056g.values().length];
            f6225a = iArr3;
            try {
                iArr3[EnumC2056g.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f6225a[EnumC2056g.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f6225a[EnumC2056g.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DecodeJob.java */
    /* renamed from: com.bumptech.glide.load.engine.h$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC2051b<R> {
        /* renamed from: b */
        void mo33796b(GlideException glideException);

        /* renamed from: c */
        void mo33795c(InterfaceC2087u<R> interfaceC2087u, EnumC1993a enumC1993a);

        /* renamed from: d */
        void mo33794d(RunnableC2049h<?> runnableC2049h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DecodeJob.java */
    /* renamed from: com.bumptech.glide.load.engine.h$c */
    /* loaded from: classes2.dex */
    public final class C2052c<Z> implements C2058i.InterfaceC2059a<Z> {

        /* renamed from: a */
        private final EnumC1993a f6228a;

        C2052c(EnumC1993a enumC1993a) {
            this.f6228a = enumC1993a;
        }

        @Override // com.bumptech.glide.load.engine.C2058i.InterfaceC2059a
        /* renamed from: a */
        public InterfaceC2087u<Z> mo33817a(InterfaceC2087u<Z> interfaceC2087u) {
            return RunnableC2049h.this.m33849M(this.f6228a, interfaceC2087u);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DecodeJob.java */
    /* renamed from: com.bumptech.glide.load.engine.h$d */
    /* loaded from: classes2.dex */
    public static class C2053d<Z> {

        /* renamed from: a */
        private InterfaceC2118f f6230a;

        /* renamed from: b */
        private InterfaceC2125k<Z> f6231b;

        /* renamed from: c */
        private C2085t<Z> f6232c;

        C2053d() {
        }

        /* renamed from: a */
        void m33829a() {
            this.f6230a = null;
            this.f6231b = null;
            this.f6232c = null;
        }

        /* renamed from: b */
        void m33828b(InterfaceC2054e interfaceC2054e, C2122h c2122h) {
            C2391b.m33098a("DecodeJob.encode");
            try {
                interfaceC2054e.mo33799a().mo33918a(this.f6230a, new C2045e(this.f6231b, this.f6232c, c2122h));
            } finally {
                this.f6232c.m33756f();
                C2391b.m33095d();
            }
        }

        /* renamed from: c */
        boolean m33827c() {
            return this.f6232c != null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: d */
        <X> void m33826d(InterfaceC2118f interfaceC2118f, InterfaceC2125k<X> interfaceC2125k, C2085t<X> c2085t) {
            this.f6230a = interfaceC2118f;
            this.f6231b = interfaceC2125k;
            this.f6232c = c2085t;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DecodeJob.java */
    /* renamed from: com.bumptech.glide.load.engine.h$e */
    /* loaded from: classes2.dex */
    public interface InterfaceC2054e {
        /* renamed from: a */
        InterfaceC2012a mo33799a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DecodeJob.java */
    /* renamed from: com.bumptech.glide.load.engine.h$f */
    /* loaded from: classes2.dex */
    public static class C2055f {

        /* renamed from: a */
        private boolean f6233a;

        /* renamed from: b */
        private boolean f6234b;

        /* renamed from: c */
        private boolean f6235c;

        C2055f() {
        }

        /* renamed from: a */
        private boolean m33825a(boolean z) {
            return (this.f6235c || z || this.f6234b) && this.f6233a;
        }

        /* renamed from: b */
        synchronized boolean m33824b() {
            this.f6234b = true;
            return m33825a(false);
        }

        /* renamed from: c */
        synchronized boolean m33823c() {
            this.f6235c = true;
            return m33825a(false);
        }

        /* renamed from: d */
        synchronized boolean m33822d(boolean z) {
            this.f6233a = true;
            return m33825a(z);
        }

        /* renamed from: e */
        synchronized void m33821e() {
            this.f6234b = false;
            this.f6233a = false;
            this.f6235c = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DecodeJob.java */
    /* renamed from: com.bumptech.glide.load.engine.h$g */
    /* loaded from: classes2.dex */
    public enum EnumC2056g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DecodeJob.java */
    /* renamed from: com.bumptech.glide.load.engine.h$h */
    /* loaded from: classes2.dex */
    public enum EnumC2057h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2049h(InterfaceC2054e interfaceC2054e, InterfaceC7672e<RunnableC2049h<?>> interfaceC7672e) {
        this.f6220f = interfaceC2054e;
        this.f6221w = interfaceC7672e;
    }

    /* renamed from: A */
    private void m33854A(InterfaceC2087u<R> interfaceC2087u, EnumC1993a enumC1993a) {
        m33843V();
        this.f6201H.mo33795c(interfaceC2087u, enumC1993a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: C */
    private void m33853C(InterfaceC2087u<R> interfaceC2087u, EnumC1993a enumC1993a) {
        if (interfaceC2087u instanceof InterfaceC2082q) {
            ((InterfaceC2082q) interfaceC2087u).mo33329a();
        }
        C2085t c2085t = 0;
        if (this.f6222x.m33827c()) {
            interfaceC2087u = C2085t.m33758d(interfaceC2087u);
            c2085t = interfaceC2087u;
        }
        m33854A(interfaceC2087u, enumC1993a);
        this.f6203J = EnumC2057h.ENCODE;
        try {
            if (this.f6222x.m33827c()) {
                this.f6222x.m33828b(this.f6220f, this.f6200G);
            }
            m33851I();
        } finally {
            if (c2085t != 0) {
                c2085t.m33756f();
            }
        }
    }

    /* renamed from: F */
    private void m33852F() {
        m33843V();
        this.f6201H.mo33796b(new GlideException("Failed to load resource", new ArrayList(this.f6218d)));
        m33850J();
    }

    /* renamed from: I */
    private void m33851I() {
        if (this.f6223y.m33824b()) {
            m33847P();
        }
    }

    /* renamed from: J */
    private void m33850J() {
        if (this.f6223y.m33823c()) {
            m33847P();
        }
    }

    /* renamed from: P */
    private void m33847P() {
        this.f6223y.m33821e();
        this.f6222x.m33829a();
        this.f6217c.m33878a();
        this.f6215V = false;
        this.f6224z = null;
        this.f6194A = null;
        this.f6200G = null;
        this.f6195B = null;
        this.f6196C = null;
        this.f6201H = null;
        this.f6203J = null;
        this.f6214U = null;
        this.f6208O = null;
        this.f6209P = null;
        this.f6211R = null;
        this.f6212S = null;
        this.f6213T = null;
        this.f6205L = 0L;
        this.f6216W = false;
        this.f6207N = null;
        this.f6218d.clear();
        this.f6221w.mo11983a(this);
    }

    /* renamed from: Q */
    private void m33846Q() {
        this.f6208O = Thread.currentThread();
        this.f6205L = C2376f.m33145b();
        boolean z = false;
        while (!this.f6216W && this.f6214U != null && !(z = this.f6214U.mo33751a())) {
            this.f6203J = m33835q(this.f6203J);
            this.f6214U = m33836p();
            if (this.f6203J == EnumC2057h.SOURCE) {
                mo33750b();
                return;
            }
        }
        if ((this.f6203J == EnumC2057h.FINISHED || this.f6216W) && !z) {
            m33852F();
        }
    }

    /* renamed from: S */
    private <Data, ResourceType> InterfaceC2087u<R> m33845S(Data data, EnumC1993a enumC1993a, C2084s<Data, ResourceType, R> c2084s) throws GlideException {
        C2122h m33834r = m33834r(enumC1993a);
        InterfaceC2132e<Data> m34178l = this.f6224z.m34143g().m34178l(data);
        try {
            return c2084s.m33761a(m34178l, m33834r, this.f6197D, this.f6198E, new C2052c(enumC1993a));
        } finally {
            m34178l.mo33491b();
        }
    }

    /* renamed from: U */
    private void m33844U() {
        int i = C2050a.f6225a[this.f6204K.ordinal()];
        if (i == 1) {
            this.f6203J = m33835q(EnumC2057h.INITIALIZE);
            this.f6214U = m33836p();
            m33846Q();
        } else if (i == 2) {
            m33846Q();
        } else if (i == 3) {
            m33837n();
        } else {
            throw new IllegalStateException("Unrecognized run reason: " + this.f6204K);
        }
    }

    /* renamed from: V */
    private void m33843V() {
        Throwable th;
        this.f6219e.mo33092c();
        if (this.f6215V) {
            if (this.f6218d.isEmpty()) {
                th = null;
            } else {
                List<Throwable> list = this.f6218d;
                th = list.get(list.size() - 1);
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.f6215V = true;
    }

    /* renamed from: j */
    private <Data> InterfaceC2087u<R> m33839j(InterfaceC2130d<?> interfaceC2130d, Data data, EnumC1993a enumC1993a) throws GlideException {
        if (data == null) {
            return null;
        }
        try {
            long m33145b = C2376f.m33145b();
            InterfaceC2087u<R> m33838m = m33838m(data, enumC1993a);
            if (Log.isLoggable("DecodeJob", 2)) {
                m33831y("Decoded result " + m33838m, m33145b);
            }
            return m33838m;
        } finally {
            interfaceC2130d.mo33506b();
        }
    }

    /* renamed from: m */
    private <Data> InterfaceC2087u<R> m33838m(Data data, EnumC1993a enumC1993a) throws GlideException {
        return m33845S(data, enumC1993a, (C2084s<Data, ?, R>) this.f6217c.m33871h(data.getClass()));
    }

    /* renamed from: n */
    private void m33837n() {
        if (Log.isLoggable("DecodeJob", 2)) {
            long j = this.f6205L;
            m33830z("Retrieved data", j, "data: " + this.f6211R + ", cache key: " + this.f6209P + ", fetcher: " + this.f6213T);
        }
        InterfaceC2087u<R> interfaceC2087u = null;
        try {
            interfaceC2087u = m33839j(this.f6213T, this.f6211R, this.f6212S);
        } catch (GlideException e) {
            e.m33934i(this.f6210Q, this.f6212S);
            this.f6218d.add(e);
        }
        if (interfaceC2087u != null) {
            m33853C(interfaceC2087u, this.f6212S);
        } else {
            m33846Q();
        }
    }

    /* renamed from: p */
    private InterfaceC2046f m33836p() {
        int i = C2050a.f6226b[this.f6203J.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return null;
                    }
                    throw new IllegalStateException("Unrecognized stage: " + this.f6203J);
                }
                return new C2092y(this.f6217c, this);
            }
            return new C2043c(this.f6217c, this);
        }
        return new C2088v(this.f6217c, this);
    }

    /* renamed from: q */
    private EnumC2057h m33835q(EnumC2057h enumC2057h) {
        int i = C2050a.f6226b[enumC2057h.ordinal()];
        if (i == 1) {
            if (this.f6199F.mo33816a()) {
                return EnumC2057h.DATA_CACHE;
            }
            return m33835q(EnumC2057h.DATA_CACHE);
        } else if (i == 2) {
            return this.f6206M ? EnumC2057h.FINISHED : EnumC2057h.SOURCE;
        } else if (i == 3 || i == 4) {
            return EnumC2057h.FINISHED;
        } else {
            if (i == 5) {
                if (this.f6199F.mo33815b()) {
                    return EnumC2057h.RESOURCE_CACHE;
                }
                return m33835q(EnumC2057h.RESOURCE_CACHE);
            }
            throw new IllegalArgumentException("Unrecognized stage: " + enumC2057h);
        }
    }

    /* renamed from: r */
    private C2122h m33834r(EnumC1993a enumC1993a) {
        C2122h c2122h = this.f6200G;
        if (Build.VERSION.SDK_INT < 26) {
            return c2122h;
        }
        boolean z = enumC1993a == EnumC1993a.RESOURCE_DISK_CACHE || this.f6217c.m33856w();
        Boolean bool = (Boolean) c2122h.m33661b(C2301i.f6688i);
        if (bool == null || (bool.booleanValue() && !z)) {
            C2122h c2122h2 = new C2122h();
            c2122h2.m33660c(this.f6200G);
            c2122h2.m33659d(C2301i.f6688i, Boolean.valueOf(z));
            return c2122h2;
        }
        return c2122h;
    }

    /* renamed from: v */
    private int m33833v() {
        return this.f6195B.ordinal();
    }

    /* renamed from: y */
    private void m33831y(String str, long j) {
        m33830z(str, j, null);
    }

    /* renamed from: z */
    private void m33830z(String str, long j, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(C2376f.m33146a(j));
        sb.append(", load key: ");
        sb.append(this.f6196C);
        if (str2 != null) {
            str3 = ", " + str2;
        } else {
            str3 = "";
        }
        sb.append(str3);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sb.toString());
    }

    /* renamed from: M */
    <Z> InterfaceC2087u<Z> m33849M(EnumC1993a enumC1993a, InterfaceC2087u<Z> interfaceC2087u) {
        InterfaceC2087u<Z> interfaceC2087u2;
        InterfaceC2126l<Z> interfaceC2126l;
        EnumC1995c enumC1995c;
        InterfaceC2118f c2044d;
        Class<?> cls = interfaceC2087u.get().getClass();
        InterfaceC2125k<Z> interfaceC2125k = null;
        if (enumC1993a != EnumC1993a.RESOURCE_DISK_CACHE) {
            InterfaceC2126l<Z> m33861r = this.f6217c.m33861r(cls);
            interfaceC2126l = m33861r;
            interfaceC2087u2 = m33861r.mo33346a(this.f6224z, interfaceC2087u, this.f6197D, this.f6198E);
        } else {
            interfaceC2087u2 = interfaceC2087u;
            interfaceC2126l = null;
        }
        if (!interfaceC2087u.equals(interfaceC2087u2)) {
            interfaceC2087u.mo33303b();
        }
        if (this.f6217c.m33857v(interfaceC2087u2)) {
            interfaceC2125k = this.f6217c.m33865n(interfaceC2087u2);
            enumC1995c = interfaceC2125k.mo33387b(this.f6200G);
        } else {
            enumC1995c = EnumC1995c.NONE;
        }
        InterfaceC2125k interfaceC2125k2 = interfaceC2125k;
        if (this.f6199F.mo33813d(!this.f6217c.m33855x(this.f6209P), enumC1993a, enumC1995c)) {
            if (interfaceC2125k2 != null) {
                int i = C2050a.f6227c[enumC1995c.ordinal()];
                if (i == 1) {
                    c2044d = new C2044d(this.f6209P, this.f6194A);
                } else if (i == 2) {
                    c2044d = new C2089w(this.f6217c.m33877b(), this.f6209P, this.f6194A, this.f6197D, this.f6198E, interfaceC2126l, cls, this.f6200G);
                } else {
                    throw new IllegalArgumentException("Unknown strategy: " + enumC1995c);
                }
                C2085t m33758d = C2085t.m33758d(interfaceC2087u2);
                this.f6222x.m33826d(c2044d, interfaceC2125k2, m33758d);
                return m33758d;
            }
            throw new Registry.NoResultEncoderAvailableException(interfaceC2087u2.get().getClass());
        }
        return interfaceC2087u2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O */
    public void m33848O(boolean z) {
        if (this.f6223y.m33822d(z)) {
            m33847P();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X */
    public boolean m33842X() {
        EnumC2057h m33835q = m33835q(EnumC2057h.INITIALIZE);
        return m33835q == EnumC2057h.RESOURCE_CACHE || m33835q == EnumC2057h.DATA_CACHE;
    }

    /* renamed from: a */
    public void m33841a() {
        this.f6216W = true;
        InterfaceC2046f interfaceC2046f = this.f6214U;
        if (interfaceC2046f != null) {
            interfaceC2046f.cancel();
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2046f.InterfaceC2047a
    /* renamed from: b */
    public void mo33750b() {
        this.f6204K = EnumC2056g.SWITCH_TO_SOURCE_SERVICE;
        this.f6201H.mo33794d(this);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2046f.InterfaceC2047a
    /* renamed from: e */
    public void mo33747e(InterfaceC2118f interfaceC2118f, Exception exc, InterfaceC2130d<?> interfaceC2130d, EnumC1993a enumC1993a) {
        interfaceC2130d.mo33506b();
        GlideException glideException = new GlideException("Fetching data failed", exc);
        glideException.m33933j(interfaceC2118f, enumC1993a, interfaceC2130d.mo33507a());
        this.f6218d.add(glideException);
        if (Thread.currentThread() != this.f6208O) {
            this.f6204K = EnumC2056g.SWITCH_TO_SOURCE_SERVICE;
            this.f6201H.mo33794d(this);
            return;
        }
        m33846Q();
    }

    @Override // com.bumptech.glide.p086q.p087l.C2383a.InterfaceC2389f
    /* renamed from: g */
    public AbstractC2392c mo33100g() {
        return this.f6219e;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC2046f.InterfaceC2047a
    /* renamed from: h */
    public void mo33744h(InterfaceC2118f interfaceC2118f, Object obj, InterfaceC2130d<?> interfaceC2130d, EnumC1993a enumC1993a, InterfaceC2118f interfaceC2118f2) {
        this.f6209P = interfaceC2118f;
        this.f6211R = obj;
        this.f6213T = interfaceC2130d;
        this.f6212S = enumC1993a;
        this.f6210Q = interfaceC2118f2;
        if (Thread.currentThread() != this.f6208O) {
            this.f6204K = EnumC2056g.DECODE_DATA;
            this.f6201H.mo33794d(this);
            return;
        }
        C2391b.m33098a("DecodeJob.decodeFromRetrievedData");
        try {
            m33837n();
        } finally {
            C2391b.m33095d();
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: i */
    public int compareTo(RunnableC2049h<?> runnableC2049h) {
        int m33833v = m33833v() - runnableC2049h.m33833v();
        return m33833v == 0 ? this.f6202I - runnableC2049h.f6202I : m33833v;
    }

    @Override // java.lang.Runnable
    public void run() {
        C2391b.m33097b("DecodeJob#run(model=%s)", this.f6207N);
        InterfaceC2130d<?> interfaceC2130d = this.f6213T;
        try {
            try {
                if (this.f6216W) {
                    m33852F();
                    if (interfaceC2130d != null) {
                        interfaceC2130d.mo33506b();
                    }
                    C2391b.m33095d();
                    return;
                }
                m33844U();
                if (interfaceC2130d != null) {
                    interfaceC2130d.mo33506b();
                }
                C2391b.m33095d();
            } catch (C2034b e) {
                throw e;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public RunnableC2049h<R> m33832w(C1947d c1947d, Object obj, C2078n c2078n, InterfaceC2118f interfaceC2118f, int i, int i2, Class<?> cls, Class<R> cls2, EnumC1949f enumC1949f, AbstractC2060j abstractC2060j, Map<Class<?>, InterfaceC2126l<?>> map, boolean z, boolean z2, boolean z3, C2122h c2122h, InterfaceC2051b<R> interfaceC2051b, int i3) {
        this.f6217c.m33858u(c1947d, obj, interfaceC2118f, i, i2, abstractC2060j, cls, cls2, enumC1949f, c2122h, map, z, z2, this.f6220f);
        this.f6224z = c1947d;
        this.f6194A = interfaceC2118f;
        this.f6195B = enumC1949f;
        this.f6196C = c2078n;
        this.f6197D = i;
        this.f6198E = i2;
        this.f6199F = abstractC2060j;
        this.f6206M = z3;
        this.f6200G = c2122h;
        this.f6201H = interfaceC2051b;
        this.f6202I = i3;
        this.f6204K = EnumC2056g.INITIALIZE;
        this.f6207N = obj;
        return this;
    }
}
