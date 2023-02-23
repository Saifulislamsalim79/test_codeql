package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.perf.config.C6569d;
import com.google.firebase.perf.metrics.p180d.AbstractC6701e;
import com.google.firebase.perf.p172f.AbstractC6596b;
import com.google.firebase.perf.p172f.C6593a;
import com.google.firebase.perf.p176h.C6609a;
import com.google.firebase.perf.p177i.C6623k;
import com.google.firebase.perf.p178j.C6624a;
import com.google.firebase.perf.p178j.C6637h;
import com.google.firebase.perf.session.C6710a;
import com.google.firebase.perf.session.InterfaceC6712b;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.lang.ref.WeakReference;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes2.dex */
public class Trace extends AbstractC6596b implements Parcelable, InterfaceC6712b {
    @Keep
    public static final Parcelable.Creator<Trace> CREATOR;

    /* renamed from: E */
    private static final C6609a f16080E = C6609a.m21475e();

    /* renamed from: A */
    private final C6623k f16081A;

    /* renamed from: B */
    private final C6624a f16082B;

    /* renamed from: C */
    private C6637h f16083C;

    /* renamed from: D */
    private C6637h f16084D;

    /* renamed from: c */
    private final WeakReference<InterfaceC6712b> f16085c;

    /* renamed from: d */
    private final Trace f16086d;

    /* renamed from: e */
    private final GaugeManager f16087e;

    /* renamed from: f */
    private final String f16088f;

    /* renamed from: w */
    private final Map<String, C6693a> f16089w;

    /* renamed from: x */
    private final Map<String, String> f16090x;

    /* renamed from: y */
    private final List<C6710a> f16091y;

    /* renamed from: z */
    private final List<Trace> f16092z;

    /* renamed from: com.google.firebase.perf.metrics.Trace$a */
    /* loaded from: classes2.dex */
    class C6692a implements Parcelable.Creator<Trace> {
        C6692a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Trace createFromParcel(Parcel parcel) {
            return new Trace(parcel, false, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public Trace[] newArray(int i) {
            return new Trace[i];
        }
    }

    static {
        new ConcurrentHashMap();
        CREATOR = new C6692a();
    }

    /* synthetic */ Trace(Parcel parcel, boolean z, C6692a c6692a) {
        this(parcel, z);
    }

    /* renamed from: b */
    private void m21130b(String str, String str2) {
        if (!m21121k()) {
            if (!this.f16090x.containsKey(str) && this.f16090x.size() >= 5) {
                throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Exceeds max limit of number of attributes - %d", 5));
            }
            String m21062d = AbstractC6701e.m21062d(new AbstractMap.SimpleEntry(str, str2));
            if (m21062d != null) {
                throw new IllegalArgumentException(m21062d);
            }
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Trace '%s' has been stopped", this.f16088f));
    }

    /* renamed from: l */
    private C6693a m21120l(String str) {
        C6693a c6693a = this.f16089w.get(str);
        if (c6693a == null) {
            C6693a c6693a2 = new C6693a(str);
            this.f16089w.put(str, c6693a2);
            return c6693a2;
        }
        return c6693a;
    }

    /* renamed from: m */
    private void m21119m(C6637h c6637h) {
        if (this.f16092z.isEmpty()) {
            return;
        }
        Trace trace = this.f16092z.get(this.f16092z.size() - 1);
        if (trace.f16084D == null) {
            trace.f16084D = c6637h;
        }
    }

    @Override // com.google.firebase.perf.session.InterfaceC6712b
    /* renamed from: a */
    public void mo20977a(C6710a c6710a) {
        if (c6710a == null) {
            f16080E.m21471i("Unable to add new SessionId to the Trace. Continuing without it.");
        } else if (!m21123i() || m21121k()) {
        } else {
            this.f16091y.add(c6710a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public Map<String, C6693a> m21129c() {
        return this.f16089w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public C6637h m21128d() {
        return this.f16084D;
    }

    @Override // android.os.Parcelable
    @Keep
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public String m21127e() {
        return this.f16088f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public List<C6710a> m21126f() {
        List<C6710a> unmodifiableList;
        synchronized (this.f16091y) {
            ArrayList arrayList = new ArrayList();
            for (C6710a c6710a : this.f16091y) {
                if (c6710a != null) {
                    arrayList.add(c6710a);
                }
            }
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        return unmodifiableList;
    }

    protected void finalize() throws Throwable {
        try {
            if (m21122j()) {
                f16080E.m21470j("Trace '%s' is started but not stopped when it is destructed!", this.f16088f);
                incrementTsnsCount(1);
            }
        } finally {
            super.finalize();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public C6637h m21125g() {
        return this.f16083C;
    }

    @Keep
    public String getAttribute(String str) {
        return this.f16090x.get(str);
    }

    @Keep
    public Map<String, String> getAttributes() {
        return new HashMap(this.f16090x);
    }

    @Keep
    public long getLongMetric(String str) {
        C6693a c6693a = str != null ? this.f16089w.get(str.trim()) : null;
        if (c6693a == null) {
            return 0L;
        }
        return c6693a.m21116a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public List<Trace> m21124h() {
        return this.f16092z;
    }

    /* renamed from: i */
    boolean m21123i() {
        return this.f16083C != null;
    }

    @Keep
    public void incrementMetric(String str, long j) {
        String m21061e = AbstractC6701e.m21061e(str);
        if (m21061e != null) {
            f16080E.m21476d("Cannot increment metric '%s'. Metric name is invalid.(%s)", str, m21061e);
        } else if (!m21123i()) {
            f16080E.m21470j("Cannot increment metric '%s' for trace '%s' because it's not started", str, this.f16088f);
        } else if (m21121k()) {
            f16080E.m21470j("Cannot increment metric '%s' for trace '%s' because it's been stopped", str, this.f16088f);
        } else {
            C6693a m21120l = m21120l(str.trim());
            m21120l.m21114c(j);
            f16080E.m21478b("Incrementing metric '%s' to %d on trace '%s'", str, Long.valueOf(m21120l.m21116a()), this.f16088f);
        }
    }

    /* renamed from: j */
    boolean m21122j() {
        return m21123i() && !m21121k();
    }

    /* renamed from: k */
    boolean m21121k() {
        return this.f16084D != null;
    }

    @Keep
    public void putAttribute(String str, String str2) {
        boolean z = false;
        try {
            str = str.trim();
            str2 = str2.trim();
            m21130b(str, str2);
            f16080E.m21478b("Setting attribute '%s' to '%s' on trace '%s'", str, str2, this.f16088f);
            z = true;
        } catch (Exception e) {
            f16080E.m21476d("Can not set attribute '%s' with value '%s' (%s)", str, str2, e.getMessage());
        }
        if (z) {
            this.f16090x.put(str, str2);
        }
    }

    @Keep
    public void putMetric(String str, long j) {
        String m21061e = AbstractC6701e.m21061e(str);
        if (m21061e != null) {
            f16080E.m21476d("Cannot set value for metric '%s'. Metric name is invalid.(%s)", str, m21061e);
        } else if (!m21123i()) {
            f16080E.m21470j("Cannot set value for metric '%s' for trace '%s' because it's not started", str, this.f16088f);
        } else if (m21121k()) {
            f16080E.m21470j("Cannot set value for metric '%s' for trace '%s' because it's been stopped", str, this.f16088f);
        } else {
            m21120l(str.trim()).m21113d(j);
            f16080E.m21478b("Setting metric '%s' to '%s' on trace '%s'", str, Long.valueOf(j), this.f16088f);
        }
    }

    @Keep
    public void removeAttribute(String str) {
        if (m21121k()) {
            f16080E.m21477c("Can't remove a attribute from a Trace that's stopped.");
        } else {
            this.f16090x.remove(str);
        }
    }

    @Keep
    public void start() {
        if (!C6569d.m21605f().m21617I()) {
            f16080E.m21479a("Trace feature is disabled.");
            return;
        }
        String m21060f = AbstractC6701e.m21060f(this.f16088f);
        if (m21060f != null) {
            f16080E.m21476d("Cannot start trace '%s'. Trace name is invalid.(%s)", this.f16088f, m21060f);
        } else if (this.f16083C != null) {
            f16080E.m21476d("Trace '%s' has already started, should not start again!", this.f16088f);
        } else {
            this.f16083C = this.f16082B.m21415a();
            registerForAppState();
            C6710a perfSession = SessionManager.getInstance().perfSession();
            SessionManager.getInstance().registerForSessionUpdates(this.f16085c);
            mo20977a(perfSession);
            if (perfSession.m20984f()) {
                this.f16087e.collectGaugeMetricOnce(perfSession.m20986d());
            }
        }
    }

    @Keep
    public void stop() {
        if (!m21123i()) {
            f16080E.m21476d("Trace '%s' has not been started so unable to stop!", this.f16088f);
        } else if (m21121k()) {
            f16080E.m21476d("Trace '%s' has already stopped, should not stop again!", this.f16088f);
        } else {
            SessionManager.getInstance().unregisterForSessionUpdates(this.f16085c);
            unregisterForAppState();
            C6637h m21415a = this.f16082B.m21415a();
            this.f16084D = m21415a;
            if (this.f16086d == null) {
                m21119m(m21415a);
                if (!this.f16088f.isEmpty()) {
                    this.f16081A.m21418x(new C6696c(this).m21090a(), getAppState());
                    if (SessionManager.getInstance().perfSession().m20984f()) {
                        this.f16087e.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().m20986d());
                        return;
                    }
                    return;
                }
                f16080E.m21477c("Trace name is empty, no log is sent to server");
            }
        }
    }

    @Override // android.os.Parcelable
    @Keep
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f16086d, 0);
        parcel.writeString(this.f16088f);
        parcel.writeList(this.f16092z);
        parcel.writeMap(this.f16089w);
        parcel.writeParcelable(this.f16083C, 0);
        parcel.writeParcelable(this.f16084D, 0);
        synchronized (this.f16091y) {
            parcel.writeList(this.f16091y);
        }
    }

    public Trace(String str, C6623k c6623k, C6624a c6624a, C6593a c6593a) {
        this(str, c6623k, c6624a, c6593a, GaugeManager.getInstance());
    }

    public Trace(String str, C6623k c6623k, C6624a c6624a, C6593a c6593a, GaugeManager gaugeManager) {
        super(c6593a);
        this.f16085c = new WeakReference<>(this);
        this.f16086d = null;
        this.f16088f = str.trim();
        this.f16092z = new ArrayList();
        this.f16089w = new ConcurrentHashMap();
        this.f16090x = new ConcurrentHashMap();
        this.f16082B = c6624a;
        this.f16081A = c6623k;
        this.f16091y = Collections.synchronizedList(new ArrayList());
        this.f16087e = gaugeManager;
    }

    private Trace(Parcel parcel, boolean z) {
        super(z ? null : C6593a.m21528b());
        this.f16085c = new WeakReference<>(this);
        this.f16086d = (Trace) parcel.readParcelable(Trace.class.getClassLoader());
        this.f16088f = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.f16092z = arrayList;
        parcel.readList(arrayList, Trace.class.getClassLoader());
        this.f16089w = new ConcurrentHashMap();
        this.f16090x = new ConcurrentHashMap();
        parcel.readMap(this.f16089w, C6693a.class.getClassLoader());
        this.f16083C = (C6637h) parcel.readParcelable(C6637h.class.getClassLoader());
        this.f16084D = (C6637h) parcel.readParcelable(C6637h.class.getClassLoader());
        List<C6710a> synchronizedList = Collections.synchronizedList(new ArrayList());
        this.f16091y = synchronizedList;
        parcel.readList(synchronizedList, C6710a.class.getClassLoader());
        if (z) {
            this.f16081A = null;
            this.f16082B = null;
            this.f16087e = null;
            return;
        }
        this.f16081A = C6623k.m21437e();
        this.f16082B = new C6624a();
        this.f16087e = GaugeManager.getInstance();
    }
}
