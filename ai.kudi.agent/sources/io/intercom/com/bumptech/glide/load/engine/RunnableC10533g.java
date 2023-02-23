package io.intercom.com.bumptech.glide.load.engine;

import android.os.Build;
import android.util.Log;
import androidx.core.p058os.C1382j;
import io.intercom.com.bumptech.glide.C10480e;
import io.intercom.com.bumptech.glide.EnumC10482g;
import io.intercom.com.bumptech.glide.Registry;
import io.intercom.com.bumptech.glide.load.C10626i;
import io.intercom.com.bumptech.glide.load.EnumC10507a;
import io.intercom.com.bumptech.glide.load.EnumC10509c;
import io.intercom.com.bumptech.glide.load.InterfaceC10622g;
import io.intercom.com.bumptech.glide.load.InterfaceC10628k;
import io.intercom.com.bumptech.glide.load.InterfaceC10629l;
import io.intercom.com.bumptech.glide.load.engine.C10542h;
import io.intercom.com.bumptech.glide.load.engine.InterfaceC10530e;
import io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10576b;
import io.intercom.com.bumptech.glide.load.engine.p397z.InterfaceC10599a;
import io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b;
import io.intercom.com.bumptech.glide.load.p398m.InterfaceC10633c;
import io.intercom.com.bumptech.glide.load.p402o.p403c.C10756k;
import io.intercom.com.bumptech.glide.p416r.C10888d;
import io.intercom.com.bumptech.glide.p416r.p417j.AbstractC10903b;
import io.intercom.com.bumptech.glide.p416r.p417j.C10895a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p201g.p227h.p237k.InterfaceC7672e;
/* compiled from: DecodeJob.java */
/* renamed from: io.intercom.com.bumptech.glide.load.engine.g */
/* loaded from: classes3.dex */
class RunnableC10533g<R> implements InterfaceC10530e.InterfaceC10531a, Runnable, Comparable<RunnableC10533g<?>>, C10895a.InterfaceC10901f {

    /* renamed from: A */
    InterfaceC10622g f24180A;

    /* renamed from: B */
    private EnumC10482g f24181B;

    /* renamed from: C */
    private C10560m f24182C;

    /* renamed from: D */
    int f24183D;

    /* renamed from: E */
    int f24184E;

    /* renamed from: F */
    AbstractC10544i f24185F;

    /* renamed from: G */
    C10626i f24186G;

    /* renamed from: H */
    private InterfaceC10535b<R> f24187H;

    /* renamed from: I */
    private int f24188I;

    /* renamed from: J */
    private EnumC10541h f24189J;

    /* renamed from: K */
    private EnumC10540g f24190K;

    /* renamed from: L */
    private long f24191L;

    /* renamed from: M */
    private boolean f24192M;

    /* renamed from: N */
    private Thread f24193N;

    /* renamed from: O */
    InterfaceC10622g f24194O;

    /* renamed from: P */
    private InterfaceC10622g f24195P;

    /* renamed from: Q */
    private Object f24196Q;

    /* renamed from: R */
    private EnumC10507a f24197R;

    /* renamed from: S */
    private InterfaceC10631b<?> f24198S;

    /* renamed from: T */
    private volatile InterfaceC10530e f24199T;

    /* renamed from: U */
    private volatile boolean f24200U;

    /* renamed from: V */
    private volatile boolean f24201V;

    /* renamed from: f */
    private final InterfaceC10538e f24205f;

    /* renamed from: w */
    private final InterfaceC7672e<RunnableC10533g<?>> f24206w;

    /* renamed from: z */
    private C10480e f24209z;

    /* renamed from: c */
    final C10532f<R> f24202c = new C10532f<>();

    /* renamed from: d */
    private final List<Throwable> f24203d = new ArrayList();

    /* renamed from: e */
    private final AbstractC10903b f24204e = AbstractC10903b.m11979a();

    /* renamed from: x */
    final C10537d<?> f24207x = new C10537d<>();

    /* renamed from: y */
    private final C10539f f24208y = new C10539f();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DecodeJob.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.engine.g$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C10534a {

        /* renamed from: a */
        static final /* synthetic */ int[] f24210a;

        /* renamed from: b */
        static final /* synthetic */ int[] f24211b;

        static {
            int[] iArr = new int[EnumC10541h.values().length];
            f24211b = iArr;
            try {
                iArr[EnumC10541h.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24211b[EnumC10541h.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24211b[EnumC10541h.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24211b[EnumC10541h.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24211b[EnumC10541h.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[EnumC10540g.values().length];
            f24210a = iArr2;
            try {
                iArr2[EnumC10540g.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24210a[EnumC10540g.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f24210a[EnumC10540g.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DecodeJob.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.engine.g$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC10535b<R> {
        /* renamed from: a */
        void mo12759a(InterfaceC10569t<R> interfaceC10569t, EnumC10507a enumC10507a);

        /* renamed from: c */
        void mo12757c(GlideException glideException);

        /* renamed from: d */
        void mo12756d(RunnableC10533g<?> runnableC10533g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DecodeJob.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.engine.g$c */
    /* loaded from: classes3.dex */
    public final class C10536c<Z> implements C10542h.InterfaceC10543a<Z> {

        /* renamed from: a */
        private final EnumC10507a f24212a;

        C10536c(EnumC10507a enumC10507a) {
            this.f24212a = enumC10507a;
        }

        /* renamed from: b */
        private Class<Z> m12789b(InterfaceC10569t<Z> interfaceC10569t) {
            return (Class<Z>) interfaceC10569t.get().getClass();
        }

        @Override // io.intercom.com.bumptech.glide.load.engine.C10542h.InterfaceC10543a
        /* renamed from: a */
        public InterfaceC10569t<Z> mo12776a(InterfaceC10569t<Z> interfaceC10569t) {
            InterfaceC10569t<Z> interfaceC10569t2;
            InterfaceC10629l<Z> interfaceC10629l;
            EnumC10509c enumC10509c;
            InterfaceC10622g c10571v;
            Class<Z> m12789b = m12789b(interfaceC10569t);
            InterfaceC10628k<Z> interfaceC10628k = null;
            if (this.f24212a != EnumC10507a.RESOURCE_DISK_CACHE) {
                InterfaceC10629l<Z> m12821p = RunnableC10533g.this.f24202c.m12821p(m12789b);
                C10480e c10480e = RunnableC10533g.this.f24209z;
                RunnableC10533g runnableC10533g = RunnableC10533g.this;
                interfaceC10629l = m12821p;
                interfaceC10569t2 = m12821p.transform(c10480e, interfaceC10569t, runnableC10533g.f24183D, runnableC10533g.f24184E);
            } else {
                interfaceC10569t2 = interfaceC10569t;
                interfaceC10629l = null;
            }
            if (!interfaceC10569t.equals(interfaceC10569t2)) {
                interfaceC10569t.mo12303b();
            }
            if (RunnableC10533g.this.f24202c.m12817t(interfaceC10569t2)) {
                interfaceC10628k = RunnableC10533g.this.f24202c.m12824m(interfaceC10569t2);
                enumC10509c = interfaceC10628k.mo12307a(RunnableC10533g.this.f24186G);
            } else {
                enumC10509c = EnumC10509c.NONE;
            }
            InterfaceC10628k interfaceC10628k2 = interfaceC10628k;
            RunnableC10533g runnableC10533g2 = RunnableC10533g.this;
            if (RunnableC10533g.this.f24185F.mo12772d(!runnableC10533g2.f24202c.m12815v(runnableC10533g2.f24194O), this.f24212a, enumC10509c)) {
                if (interfaceC10628k2 != null) {
                    if (enumC10509c == EnumC10509c.SOURCE) {
                        RunnableC10533g runnableC10533g3 = RunnableC10533g.this;
                        c10571v = new C10528c(runnableC10533g3.f24194O, runnableC10533g3.f24180A);
                    } else if (enumC10509c == EnumC10509c.TRANSFORMED) {
                        InterfaceC10576b m12835b = RunnableC10533g.this.f24202c.m12835b();
                        RunnableC10533g runnableC10533g4 = RunnableC10533g.this;
                        c10571v = new C10571v(m12835b, runnableC10533g4.f24194O, runnableC10533g4.f24180A, runnableC10533g4.f24183D, runnableC10533g4.f24184E, interfaceC10629l, m12789b, runnableC10533g4.f24186G);
                    } else {
                        throw new IllegalArgumentException("Unknown strategy: " + enumC10509c);
                    }
                    C10567s m12726d = C10567s.m12726d(interfaceC10569t2);
                    RunnableC10533g.this.f24207x.m12785d(c10571v, interfaceC10628k2, m12726d);
                    return m12726d;
                }
                throw new Registry.NoResultEncoderAvailableException(interfaceC10569t2.get().getClass());
            }
            return interfaceC10569t2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DecodeJob.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.engine.g$d */
    /* loaded from: classes3.dex */
    public static class C10537d<Z> {

        /* renamed from: a */
        private InterfaceC10622g f24214a;

        /* renamed from: b */
        private InterfaceC10628k<Z> f24215b;

        /* renamed from: c */
        private C10567s<Z> f24216c;

        C10537d() {
        }

        /* renamed from: a */
        void m12788a() {
            this.f24214a = null;
            this.f24215b = null;
            this.f24216c = null;
        }

        /* renamed from: b */
        void m12787b(InterfaceC10538e interfaceC10538e, C10626i c10626i) {
            C1382j.m36160a("DecodeJob.encode");
            try {
                interfaceC10538e.mo12761a().mo12636b(this.f24214a, new C10529d(this.f24215b, this.f24216c, c10626i));
            } finally {
                this.f24216c.m12724f();
                C1382j.m36159b();
            }
        }

        /* renamed from: c */
        boolean m12786c() {
            return this.f24216c != null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: d */
        <X> void m12785d(InterfaceC10622g interfaceC10622g, InterfaceC10628k<X> interfaceC10628k, C10567s<X> c10567s) {
            this.f24214a = interfaceC10622g;
            this.f24215b = interfaceC10628k;
            this.f24216c = c10567s;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DecodeJob.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.engine.g$e */
    /* loaded from: classes3.dex */
    public interface InterfaceC10538e {
        /* renamed from: a */
        InterfaceC10599a mo12761a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DecodeJob.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.engine.g$f */
    /* loaded from: classes3.dex */
    public static class C10539f {

        /* renamed from: a */
        private boolean f24217a;

        /* renamed from: b */
        private boolean f24218b;

        /* renamed from: c */
        private boolean f24219c;

        C10539f() {
        }

        /* renamed from: a */
        private boolean m12784a(boolean z) {
            return (this.f24219c || z || this.f24218b) && this.f24217a;
        }

        /* renamed from: b */
        synchronized boolean m12783b() {
            this.f24218b = true;
            return m12784a(false);
        }

        /* renamed from: c */
        synchronized boolean m12782c() {
            this.f24219c = true;
            return m12784a(false);
        }

        /* renamed from: d */
        synchronized boolean m12781d(boolean z) {
            this.f24217a = true;
            return m12784a(z);
        }

        /* renamed from: e */
        synchronized void m12780e() {
            this.f24218b = false;
            this.f24217a = false;
            this.f24219c = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DecodeJob.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.engine.g$g */
    /* loaded from: classes3.dex */
    public enum EnumC10540g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DecodeJob.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.engine.g$h */
    /* loaded from: classes3.dex */
    public enum EnumC10541h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC10533g(InterfaceC10538e interfaceC10538e, InterfaceC7672e<RunnableC10533g<?>> interfaceC7672e) {
        this.f24205f = interfaceC10538e;
        this.f24206w = interfaceC7672e;
    }

    /* renamed from: A */
    private void m12814A(String str, long j, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(C10888d.m12032a(j));
        sb.append(", load key: ");
        sb.append(this.f24182C);
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

    /* renamed from: C */
    private void m12813C(InterfaceC10569t<R> interfaceC10569t, EnumC10507a enumC10507a) {
        m12803V();
        this.f24187H.mo12759a(interfaceC10569t, enumC10507a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: F */
    private void m12812F(InterfaceC10569t<R> interfaceC10569t, EnumC10507a enumC10507a) {
        if (interfaceC10569t instanceof InterfaceC10564p) {
            ((InterfaceC10564p) interfaceC10569t).mo12304a();
        }
        C10567s c10567s = 0;
        if (this.f24207x.m12786c()) {
            interfaceC10569t = C10567s.m12726d(interfaceC10569t);
            c10567s = interfaceC10569t;
        }
        m12813C(interfaceC10569t, enumC10507a);
        this.f24189J = EnumC10541h.ENCODE;
        try {
            if (this.f24207x.m12786c()) {
                this.f24207x.m12787b(this.f24205f, this.f24186G);
            }
        } finally {
            if (c10567s != 0) {
                c10567s.m12724f();
            }
            m12810J();
        }
    }

    /* renamed from: I */
    private void m12811I() {
        m12803V();
        this.f24187H.mo12757c(new GlideException("Failed to load resource", new ArrayList(this.f24203d)));
        m12809M();
    }

    /* renamed from: J */
    private void m12810J() {
        if (this.f24208y.m12783b()) {
            m12807P();
        }
    }

    /* renamed from: M */
    private void m12809M() {
        if (this.f24208y.m12782c()) {
            m12807P();
        }
    }

    /* renamed from: P */
    private void m12807P() {
        this.f24208y.m12780e();
        this.f24207x.m12788a();
        this.f24202c.m12836a();
        this.f24200U = false;
        this.f24209z = null;
        this.f24180A = null;
        this.f24186G = null;
        this.f24181B = null;
        this.f24182C = null;
        this.f24187H = null;
        this.f24189J = null;
        this.f24199T = null;
        this.f24193N = null;
        this.f24194O = null;
        this.f24196Q = null;
        this.f24197R = null;
        this.f24198S = null;
        this.f24191L = 0L;
        this.f24201V = false;
        this.f24203d.clear();
        this.f24206w.mo11983a(this);
    }

    /* renamed from: Q */
    private void m12806Q() {
        this.f24193N = Thread.currentThread();
        this.f24191L = C10888d.m12031b();
        boolean z = false;
        while (!this.f24201V && this.f24199T != null && !(z = this.f24199T.mo12719a())) {
            this.f24189J = m12794r(this.f24189J);
            this.f24199T = m12795q();
            if (this.f24189J == EnumC10541h.SOURCE) {
                mo12718b();
                return;
            }
        }
        if ((this.f24189J == EnumC10541h.FINISHED || this.f24201V) && !z) {
            m12811I();
        }
    }

    /* renamed from: S */
    private <Data, ResourceType> InterfaceC10569t<R> m12805S(Data data, EnumC10507a enumC10507a, C10566r<Data, ResourceType, R> c10566r) throws GlideException {
        C10626i m12793v = m12793v(enumC10507a);
        InterfaceC10633c<Data> m13045l = this.f24209z.m13006h().m13045l(data);
        try {
            return c10566r.m12729a(m13045l, m12793v, this.f24183D, this.f24184E, new C10536c(enumC10507a));
        } finally {
            m13045l.mo12357b();
        }
    }

    /* renamed from: U */
    private void m12804U() {
        int i = C10534a.f24210a[this.f24190K.ordinal()];
        if (i == 1) {
            this.f24189J = m12794r(EnumC10541h.INITIALIZE);
            this.f24199T = m12795q();
            m12806Q();
        } else if (i == 2) {
            m12806Q();
        } else if (i == 3) {
            m12796p();
        } else {
            throw new IllegalStateException("Unrecognized run reason: " + this.f24190K);
        }
    }

    /* renamed from: V */
    private void m12803V() {
        this.f24204e.mo11977c();
        if (!this.f24200U) {
            this.f24200U = true;
            return;
        }
        throw new IllegalStateException("Already notified");
    }

    /* renamed from: m */
    private <Data> InterfaceC10569t<R> m12798m(InterfaceC10631b<?> interfaceC10631b, Data data, EnumC10507a enumC10507a) throws GlideException {
        if (data == null) {
            return null;
        }
        try {
            long m12031b = C10888d.m12031b();
            InterfaceC10569t<R> m12797n = m12797n(data, enumC10507a);
            if (Log.isLoggable("DecodeJob", 2)) {
                m12790z("Decoded result " + m12797n, m12031b);
            }
            return m12797n;
        } finally {
            interfaceC10631b.mo12473b();
        }
    }

    /* renamed from: n */
    private <Data> InterfaceC10569t<R> m12797n(Data data, EnumC10507a enumC10507a) throws GlideException {
        return m12805S(data, enumC10507a, (C10566r<Data, ?, R>) this.f24202c.m12829h(data.getClass()));
    }

    /* renamed from: p */
    private void m12796p() {
        if (Log.isLoggable("DecodeJob", 2)) {
            long j = this.f24191L;
            m12814A("Retrieved data", j, "data: " + this.f24196Q + ", cache key: " + this.f24194O + ", fetcher: " + this.f24198S);
        }
        InterfaceC10569t<R> interfaceC10569t = null;
        try {
            interfaceC10569t = m12798m(this.f24198S, this.f24196Q, this.f24197R);
        } catch (GlideException e) {
            e.m12864i(this.f24195P, this.f24197R);
            this.f24203d.add(e);
        }
        if (interfaceC10569t != null) {
            m12812F(interfaceC10569t, this.f24197R);
        } else {
            m12806Q();
        }
    }

    /* renamed from: q */
    private InterfaceC10530e m12795q() {
        int i = C10534a.f24211b[this.f24189J.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return null;
                    }
                    throw new IllegalStateException("Unrecognized stage: " + this.f24189J);
                }
                return new C10574x(this.f24202c, this);
            }
            return new C10526b(this.f24202c, this);
        }
        return new C10570u(this.f24202c, this);
    }

    /* renamed from: r */
    private EnumC10541h m12794r(EnumC10541h enumC10541h) {
        int i = C10534a.f24211b[enumC10541h.ordinal()];
        if (i == 1) {
            return this.f24185F.mo12775a() ? EnumC10541h.DATA_CACHE : m12794r(EnumC10541h.DATA_CACHE);
        } else if (i == 2) {
            return this.f24192M ? EnumC10541h.FINISHED : EnumC10541h.SOURCE;
        } else if (i == 3 || i == 4) {
            return EnumC10541h.FINISHED;
        } else {
            if (i == 5) {
                return this.f24185F.mo12774b() ? EnumC10541h.RESOURCE_CACHE : m12794r(EnumC10541h.RESOURCE_CACHE);
            }
            throw new IllegalArgumentException("Unrecognized stage: " + enumC10541h);
        }
    }

    /* renamed from: v */
    private C10626i m12793v(EnumC10507a enumC10507a) {
        C10626i c10626i = this.f24186G;
        if (Build.VERSION.SDK_INT >= 26 && c10626i.m12593a(C10756k.f24583i) == null) {
            if (enumC10507a == EnumC10507a.RESOURCE_DISK_CACHE || this.f24202c.m12816u()) {
                C10626i c10626i2 = new C10626i();
                c10626i2.m12592b(this.f24186G);
                c10626i2.m12591c(C10756k.f24583i, Boolean.TRUE);
                return c10626i2;
            }
            return c10626i;
        }
        return c10626i;
    }

    /* renamed from: w */
    private int m12792w() {
        return this.f24181B.ordinal();
    }

    /* renamed from: z */
    private void m12790z(String str, long j) {
        m12814A(str, j, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O */
    public void m12808O(boolean z) {
        if (this.f24208y.m12781d(z)) {
            m12807P();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X */
    public boolean m12802X() {
        EnumC10541h m12794r = m12794r(EnumC10541h.INITIALIZE);
        return m12794r == EnumC10541h.RESOURCE_CACHE || m12794r == EnumC10541h.DATA_CACHE;
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.InterfaceC10530e.InterfaceC10531a
    /* renamed from: b */
    public void mo12718b() {
        this.f24190K = EnumC10540g.SWITCH_TO_SOURCE_SERVICE;
        this.f24187H.mo12756d(this);
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.InterfaceC10530e.InterfaceC10531a
    /* renamed from: e */
    public void mo12717e(InterfaceC10622g interfaceC10622g, Exception exc, InterfaceC10631b<?> interfaceC10631b, EnumC10507a enumC10507a) {
        interfaceC10631b.mo12473b();
        GlideException glideException = new GlideException("Fetching data failed", exc);
        glideException.m12863j(interfaceC10622g, enumC10507a, interfaceC10631b.mo12474a());
        this.f24203d.add(glideException);
        if (Thread.currentThread() != this.f24193N) {
            this.f24190K = EnumC10540g.SWITCH_TO_SOURCE_SERVICE;
            this.f24187H.mo12756d(this);
            return;
        }
        m12806Q();
    }

    @Override // io.intercom.com.bumptech.glide.p416r.p417j.C10895a.InterfaceC10901f
    /* renamed from: g */
    public AbstractC10903b mo11981g() {
        return this.f24204e;
    }

    @Override // io.intercom.com.bumptech.glide.load.engine.InterfaceC10530e.InterfaceC10531a
    /* renamed from: h */
    public void mo12714h(InterfaceC10622g interfaceC10622g, Object obj, InterfaceC10631b<?> interfaceC10631b, EnumC10507a enumC10507a, InterfaceC10622g interfaceC10622g2) {
        this.f24194O = interfaceC10622g;
        this.f24196Q = obj;
        this.f24198S = interfaceC10631b;
        this.f24197R = enumC10507a;
        this.f24195P = interfaceC10622g2;
        if (Thread.currentThread() != this.f24193N) {
            this.f24190K = EnumC10540g.DECODE_DATA;
            this.f24187H.mo12756d(this);
            return;
        }
        C1382j.m36160a("DecodeJob.decodeFromRetrievedData");
        try {
            m12796p();
        } finally {
            C1382j.m36159b();
        }
    }

    /* renamed from: i */
    public void m12800i() {
        this.f24201V = true;
        InterfaceC10530e interfaceC10530e = this.f24199T;
        if (interfaceC10530e != null) {
            interfaceC10530e.cancel();
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: j */
    public int compareTo(RunnableC10533g<?> runnableC10533g) {
        int m12792w = m12792w() - runnableC10533g.m12792w();
        return m12792w == 0 ? this.f24188I - runnableC10533g.f24188I : m12792w;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r1 != null) goto L13;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r5 = this;
            java.lang.String r0 = "DecodeJob"
            java.lang.String r1 = "DecodeJob#run"
            androidx.core.p058os.C1382j.m36160a(r1)
            io.intercom.com.bumptech.glide.load.m.b<?> r1 = r5.f24198S
            boolean r2 = r5.f24201V     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L19
            r5.m12811I()     // Catch: java.lang.Throwable -> L25
            if (r1 == 0) goto L15
            r1.mo12473b()
        L15:
            androidx.core.p058os.C1382j.m36159b()
            return
        L19:
            r5.m12804U()     // Catch: java.lang.Throwable -> L25
            if (r1 == 0) goto L21
        L1e:
            r1.mo12473b()
        L21:
            androidx.core.p058os.C1382j.m36159b()
            goto L62
        L25:
            r2 = move-exception
            r3 = 3
            boolean r3 = android.util.Log.isLoggable(r0, r3)     // Catch: java.lang.Throwable -> L64
            if (r3 == 0) goto L4d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L64
            r3.<init>()     // Catch: java.lang.Throwable -> L64
            java.lang.String r4 = "DecodeJob threw unexpectedly, isCancelled: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L64
            boolean r4 = r5.f24201V     // Catch: java.lang.Throwable -> L64
            r3.append(r4)     // Catch: java.lang.Throwable -> L64
            java.lang.String r4 = ", stage: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L64
            io.intercom.com.bumptech.glide.load.engine.g$h r4 = r5.f24189J     // Catch: java.lang.Throwable -> L64
            r3.append(r4)     // Catch: java.lang.Throwable -> L64
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L64
            android.util.Log.d(r0, r3, r2)     // Catch: java.lang.Throwable -> L64
        L4d:
            io.intercom.com.bumptech.glide.load.engine.g$h r0 = r5.f24189J     // Catch: java.lang.Throwable -> L64
            io.intercom.com.bumptech.glide.load.engine.g$h r3 = io.intercom.com.bumptech.glide.load.engine.RunnableC10533g.EnumC10541h.ENCODE     // Catch: java.lang.Throwable -> L64
            if (r0 == r3) goto L5b
            java.util.List<java.lang.Throwable> r0 = r5.f24203d     // Catch: java.lang.Throwable -> L64
            r0.add(r2)     // Catch: java.lang.Throwable -> L64
            r5.m12811I()     // Catch: java.lang.Throwable -> L64
        L5b:
            boolean r0 = r5.f24201V     // Catch: java.lang.Throwable -> L64
            if (r0 == 0) goto L63
            if (r1 == 0) goto L21
            goto L1e
        L62:
            return
        L63:
            throw r2     // Catch: java.lang.Throwable -> L64
        L64:
            r0 = move-exception
            if (r1 == 0) goto L6a
            r1.mo12473b()
        L6a:
            androidx.core.p058os.C1382j.m36159b()
            goto L6f
        L6e:
            throw r0
        L6f:
            goto L6e
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.com.bumptech.glide.load.engine.RunnableC10533g.run():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public RunnableC10533g<R> m12791y(C10480e c10480e, Object obj, C10560m c10560m, InterfaceC10622g interfaceC10622g, int i, int i2, Class<?> cls, Class<R> cls2, EnumC10482g enumC10482g, AbstractC10544i abstractC10544i, Map<Class<?>, InterfaceC10629l<?>> map, boolean z, boolean z2, boolean z3, C10626i c10626i, InterfaceC10535b<R> interfaceC10535b, int i3) {
        this.f24202c.m12818s(c10480e, obj, interfaceC10622g, i, i2, abstractC10544i, cls, cls2, enumC10482g, c10626i, map, z, z2, this.f24205f);
        this.f24209z = c10480e;
        this.f24180A = interfaceC10622g;
        this.f24181B = enumC10482g;
        this.f24182C = c10560m;
        this.f24183D = i;
        this.f24184E = i2;
        this.f24185F = abstractC10544i;
        this.f24192M = z3;
        this.f24186G = c10626i;
        this.f24187H = interfaceC10535b;
        this.f24188I = i3;
        this.f24190K = EnumC10540g.INITIALIZE;
        return this;
    }
}
