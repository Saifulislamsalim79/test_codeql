package com.google.firebase.perf.config;

import android.content.Context;
import com.google.firebase.perf.C6564b;
import com.google.firebase.perf.p176h.C6609a;
import com.google.firebase.perf.p178j.C6627d;
import com.google.firebase.perf.p178j.C6628e;
import com.google.firebase.perf.p178j.C6641k;
/* compiled from: ConfigResolver.java */
/* renamed from: com.google.firebase.perf.config.d */
/* loaded from: classes2.dex */
public class C6569d {

    /* renamed from: d */
    private static final C6609a f15850d = C6609a.m21475e();

    /* renamed from: e */
    private static volatile C6569d f15851e;

    /* renamed from: a */
    private final RemoteConfigManager f15852a;

    /* renamed from: b */
    private C6627d f15853b;

    /* renamed from: c */
    private C6590x f15854c;

    public C6569d(RemoteConfigManager remoteConfigManager, C6627d c6627d, C6590x c6590x) {
        this.f15852a = remoteConfigManager == null ? RemoteConfigManager.getInstance() : remoteConfigManager;
        this.f15853b = c6627d == null ? new C6627d() : c6627d;
        this.f15854c = c6590x == null ? C6590x.m21541d() : c6590x;
    }

    /* renamed from: F */
    private boolean m21620F(long j) {
        return j >= 0;
    }

    /* renamed from: G */
    private boolean m21619G(String str) {
        if (str.trim().isEmpty()) {
            return false;
        }
        for (String str2 : str.split(";")) {
            if (str2.trim().equals(C6564b.f15839b)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: H */
    private boolean m21618H(long j) {
        return j >= 0;
    }

    /* renamed from: J */
    private boolean m21616J(float f) {
        return 0.0f <= f && f <= 1.0f;
    }

    /* renamed from: K */
    private boolean m21615K(long j) {
        return j > 0;
    }

    /* renamed from: L */
    private boolean m21614L(long j) {
        return j > 0;
    }

    /* renamed from: b */
    private C6628e<Boolean> m21609b(AbstractC6589w<Boolean> abstractC6589w) {
        return this.f15854c.m21544a(abstractC6589w.mo21547a());
    }

    /* renamed from: c */
    private C6628e<Float> m21608c(AbstractC6589w<Float> abstractC6589w) {
        return this.f15854c.m21542c(abstractC6589w.mo21547a());
    }

    /* renamed from: d */
    private C6628e<Long> m21607d(AbstractC6589w<Long> abstractC6589w) {
        return this.f15854c.m21540e(abstractC6589w.mo21547a());
    }

    /* renamed from: e */
    private C6628e<String> m21606e(AbstractC6589w<String> abstractC6589w) {
        return this.f15854c.m21539f(abstractC6589w.mo21547a());
    }

    /* renamed from: f */
    public static synchronized C6569d m21605f() {
        C6569d c6569d;
        synchronized (C6569d.class) {
            if (f15851e == null) {
                f15851e = new C6569d(null, null, null);
            }
            c6569d = f15851e;
        }
        return c6569d;
    }

    /* renamed from: i */
    private boolean m21602i() {
        C6579m m21566e = C6579m.m21566e();
        C6628e<Boolean> m21592s = m21592s(m21566e);
        if (m21592s.m21406d()) {
            if (this.f15852a.isLastFetchFailed()) {
                return false;
            }
            this.f15854c.m21533l(m21566e.mo21547a(), m21592s.m21407c().booleanValue());
            return m21592s.m21407c().booleanValue();
        }
        C6628e<Boolean> m21609b = m21609b(m21566e);
        if (m21609b.m21406d()) {
            return m21609b.m21407c().booleanValue();
        }
        return m21566e.m21567d().booleanValue();
    }

    /* renamed from: j */
    private boolean m21601j() {
        C6578l m21568e = C6578l.m21568e();
        C6628e<String> m21589v = m21589v(m21568e);
        if (m21589v.m21406d()) {
            this.f15854c.m21534k(m21568e.mo21547a(), m21589v.m21407c());
            return m21619G(m21589v.m21407c());
        }
        C6628e<String> m21606e = m21606e(m21568e);
        if (m21606e.m21406d()) {
            return m21619G(m21606e.m21407c());
        }
        return m21619G(m21568e.m21569d());
    }

    /* renamed from: l */
    private C6628e<Boolean> m21599l(AbstractC6589w<Boolean> abstractC6589w) {
        return this.f15853b.m21413b(abstractC6589w.mo21546b());
    }

    /* renamed from: m */
    private C6628e<Float> m21598m(AbstractC6589w<Float> abstractC6589w) {
        return this.f15853b.m21412c(abstractC6589w.mo21546b());
    }

    /* renamed from: n */
    private C6628e<Long> m21597n(AbstractC6589w<Long> abstractC6589w) {
        return this.f15853b.m21410e(abstractC6589w.mo21546b());
    }

    /* renamed from: s */
    private C6628e<Boolean> m21592s(AbstractC6589w<Boolean> abstractC6589w) {
        return this.f15852a.getBoolean(abstractC6589w.mo21545c());
    }

    /* renamed from: t */
    private C6628e<Float> m21591t(AbstractC6589w<Float> abstractC6589w) {
        return this.f15852a.getFloat(abstractC6589w.mo21545c());
    }

    /* renamed from: u */
    private C6628e<Long> m21590u(AbstractC6589w<Long> abstractC6589w) {
        return this.f15852a.getLong(abstractC6589w.mo21545c());
    }

    /* renamed from: v */
    private C6628e<String> m21589v(AbstractC6589w<String> abstractC6589w) {
        return this.f15852a.getString(abstractC6589w.mo21545c());
    }

    /* renamed from: A */
    public long m21625A() {
        C6584r m21556e = C6584r.m21556e();
        C6628e<Long> m21597n = m21597n(m21556e);
        if (m21597n.m21406d() && m21618H(m21597n.m21407c().longValue())) {
            return m21597n.m21407c().longValue();
        }
        C6628e<Long> m21590u = m21590u(m21556e);
        if (m21590u.m21406d() && m21618H(m21590u.m21407c().longValue())) {
            this.f15854c.m21535j(m21556e.mo21547a(), m21590u.m21407c().longValue());
            return m21590u.m21407c().longValue();
        }
        C6628e<Long> m21607d = m21607d(m21556e);
        if (m21607d.m21406d() && m21618H(m21607d.m21407c().longValue())) {
            return m21607d.m21407c().longValue();
        }
        return m21556e.m21557d().longValue();
    }

    /* renamed from: B */
    public float m21624B() {
        C6585s m21554e = C6585s.m21554e();
        C6628e<Float> m21598m = m21598m(m21554e);
        if (m21598m.m21406d()) {
            float floatValue = m21598m.m21407c().floatValue() / 100.0f;
            if (m21616J(floatValue)) {
                return floatValue;
            }
        }
        C6628e<Float> m21591t = m21591t(m21554e);
        if (m21591t.m21406d() && m21616J(m21591t.m21407c().floatValue())) {
            this.f15854c.m21536i(m21554e.mo21547a(), m21591t.m21407c().floatValue());
            return m21591t.m21407c().floatValue();
        }
        C6628e<Float> m21608c = m21608c(m21554e);
        if (m21608c.m21406d() && m21616J(m21608c.m21407c().floatValue())) {
            return m21608c.m21407c().floatValue();
        }
        return m21554e.m21555d().floatValue();
    }

    /* renamed from: C */
    public long m21623C() {
        C6586t m21552e = C6586t.m21552e();
        C6628e<Long> m21590u = m21590u(m21552e);
        if (m21590u.m21406d() && m21620F(m21590u.m21407c().longValue())) {
            this.f15854c.m21535j(m21552e.mo21547a(), m21590u.m21407c().longValue());
            return m21590u.m21407c().longValue();
        }
        C6628e<Long> m21607d = m21607d(m21552e);
        if (m21607d.m21406d() && m21620F(m21607d.m21407c().longValue())) {
            return m21607d.m21407c().longValue();
        }
        return m21552e.m21553d().longValue();
    }

    /* renamed from: D */
    public long m21622D() {
        C6587u m21550e = C6587u.m21550e();
        C6628e<Long> m21590u = m21590u(m21550e);
        if (m21590u.m21406d() && m21620F(m21590u.m21407c().longValue())) {
            this.f15854c.m21535j(m21550e.mo21547a(), m21590u.m21407c().longValue());
            return m21590u.m21407c().longValue();
        }
        C6628e<Long> m21607d = m21607d(m21550e);
        if (m21607d.m21406d() && m21620F(m21607d.m21407c().longValue())) {
            return m21607d.m21407c().longValue();
        }
        return m21550e.m21551d().longValue();
    }

    /* renamed from: E */
    public float m21621E() {
        C6588v m21548e = C6588v.m21548e();
        C6628e<Float> m21591t = m21591t(m21548e);
        if (m21591t.m21406d() && m21616J(m21591t.m21407c().floatValue())) {
            this.f15854c.m21536i(m21548e.mo21547a(), m21591t.m21407c().floatValue());
            return m21591t.m21407c().floatValue();
        }
        C6628e<Float> m21608c = m21608c(m21548e);
        if (m21608c.m21406d() && m21616J(m21608c.m21407c().floatValue())) {
            return m21608c.m21407c().floatValue();
        }
        return m21548e.m21549d().floatValue();
    }

    /* renamed from: I */
    public boolean m21617I() {
        Boolean m21603h = m21603h();
        return (m21603h == null || m21603h.booleanValue()) && m21600k();
    }

    /* renamed from: M */
    public void m21613M(Context context) {
        f15850d.m21472h(C6641k.m21392b(context));
        this.f15854c.m21537h(context);
    }

    /* renamed from: N */
    public void m21612N(Context context) {
        m21613M(context.getApplicationContext());
    }

    /* renamed from: O */
    public void m21611O(C6627d c6627d) {
        this.f15853b = c6627d;
    }

    /* renamed from: a */
    public String m21610a() {
        String m21579f;
        C6572g m21580e = C6572g.m21580e();
        if (C6564b.f15838a.booleanValue()) {
            return m21580e.m21581d();
        }
        String mo21545c = m21580e.mo21545c();
        long longValue = mo21545c != null ? ((Long) this.f15852a.getRemoteConfigValueOrDefault(mo21545c, -1L)).longValue() : -1L;
        String mo21547a = m21580e.mo21547a();
        if (C6572g.m21578g(longValue) && (m21579f = C6572g.m21579f(longValue)) != null) {
            this.f15854c.m21534k(mo21547a, m21579f);
            return m21579f;
        }
        C6628e<String> m21606e = m21606e(m21580e);
        if (m21606e.m21406d()) {
            return m21606e.m21407c();
        }
        return m21580e.m21581d();
    }

    /* renamed from: g */
    public Boolean m21604g() {
        C6570e m21583e = C6570e.m21583e();
        C6628e<Boolean> m21599l = m21599l(m21583e);
        if (m21599l.m21406d()) {
            return m21599l.m21407c();
        }
        return m21583e.m21584d();
    }

    /* renamed from: h */
    public Boolean m21603h() {
        if (m21604g().booleanValue()) {
            return Boolean.FALSE;
        }
        C6571f m21582d = C6571f.m21582d();
        C6628e<Boolean> m21609b = m21609b(m21582d);
        if (m21609b.m21406d()) {
            return m21609b.m21407c();
        }
        C6628e<Boolean> m21599l = m21599l(m21582d);
        if (m21599l.m21406d()) {
            return m21599l.m21407c();
        }
        return null;
    }

    /* renamed from: k */
    public boolean m21600k() {
        return m21602i() && !m21601j();
    }

    /* renamed from: o */
    public long m21596o() {
        C6574h m21576e = C6574h.m21576e();
        C6628e<Long> m21590u = m21590u(m21576e);
        if (m21590u.m21406d() && m21620F(m21590u.m21407c().longValue())) {
            this.f15854c.m21535j(m21576e.mo21547a(), m21590u.m21407c().longValue());
            return m21590u.m21407c().longValue();
        }
        C6628e<Long> m21607d = m21607d(m21576e);
        if (m21607d.m21406d() && m21620F(m21607d.m21407c().longValue())) {
            return m21607d.m21407c().longValue();
        }
        return m21576e.m21577d().longValue();
    }

    /* renamed from: p */
    public long m21595p() {
        C6575i m21574e = C6575i.m21574e();
        C6628e<Long> m21590u = m21590u(m21574e);
        if (m21590u.m21406d() && m21620F(m21590u.m21407c().longValue())) {
            this.f15854c.m21535j(m21574e.mo21547a(), m21590u.m21407c().longValue());
            return m21590u.m21407c().longValue();
        }
        C6628e<Long> m21607d = m21607d(m21574e);
        if (m21607d.m21406d() && m21620F(m21607d.m21407c().longValue())) {
            return m21607d.m21407c().longValue();
        }
        return m21574e.m21575d().longValue();
    }

    /* renamed from: q */
    public float m21594q() {
        C6576j m21572e = C6576j.m21572e();
        C6628e<Float> m21591t = m21591t(m21572e);
        if (m21591t.m21406d() && m21616J(m21591t.m21407c().floatValue())) {
            this.f15854c.m21536i(m21572e.mo21547a(), m21591t.m21407c().floatValue());
            return m21591t.m21407c().floatValue();
        }
        C6628e<Float> m21608c = m21608c(m21572e);
        if (m21608c.m21406d() && m21616J(m21608c.m21407c().floatValue())) {
            return m21608c.m21407c().floatValue();
        }
        return m21572e.m21573d().floatValue();
    }

    /* renamed from: r */
    public long m21593r() {
        C6577k m21570e = C6577k.m21570e();
        C6628e<Long> m21590u = m21590u(m21570e);
        if (m21590u.m21406d() && m21614L(m21590u.m21407c().longValue())) {
            this.f15854c.m21535j(m21570e.mo21547a(), m21590u.m21407c().longValue());
            return m21590u.m21407c().longValue();
        }
        C6628e<Long> m21607d = m21607d(m21570e);
        if (m21607d.m21406d() && m21614L(m21607d.m21407c().longValue())) {
            return m21607d.m21407c().longValue();
        }
        return m21570e.m21571d().longValue();
    }

    /* renamed from: w */
    public long m21588w() {
        C6580n m21564e = C6580n.m21564e();
        C6628e<Long> m21597n = m21597n(m21564e);
        if (m21597n.m21406d() && m21618H(m21597n.m21407c().longValue())) {
            return m21597n.m21407c().longValue();
        }
        C6628e<Long> m21590u = m21590u(m21564e);
        if (m21590u.m21406d() && m21618H(m21590u.m21407c().longValue())) {
            this.f15854c.m21535j(m21564e.mo21547a(), m21590u.m21407c().longValue());
            return m21590u.m21407c().longValue();
        }
        C6628e<Long> m21607d = m21607d(m21564e);
        if (m21607d.m21406d() && m21618H(m21607d.m21407c().longValue())) {
            return m21607d.m21407c().longValue();
        }
        return m21564e.m21565d().longValue();
    }

    /* renamed from: x */
    public long m21587x() {
        C6581o m21562e = C6581o.m21562e();
        C6628e<Long> m21597n = m21597n(m21562e);
        if (m21597n.m21406d() && m21618H(m21597n.m21407c().longValue())) {
            return m21597n.m21407c().longValue();
        }
        C6628e<Long> m21590u = m21590u(m21562e);
        if (m21590u.m21406d() && m21618H(m21590u.m21407c().longValue())) {
            this.f15854c.m21535j(m21562e.mo21547a(), m21590u.m21407c().longValue());
            return m21590u.m21407c().longValue();
        }
        C6628e<Long> m21607d = m21607d(m21562e);
        if (m21607d.m21406d() && m21618H(m21607d.m21407c().longValue())) {
            return m21607d.m21407c().longValue();
        }
        return m21562e.m21563d().longValue();
    }

    /* renamed from: y */
    public long m21586y() {
        C6582p m21560e = C6582p.m21560e();
        C6628e<Long> m21597n = m21597n(m21560e);
        if (m21597n.m21406d() && m21615K(m21597n.m21407c().longValue())) {
            return m21597n.m21407c().longValue();
        }
        C6628e<Long> m21590u = m21590u(m21560e);
        if (m21590u.m21406d() && m21615K(m21590u.m21407c().longValue())) {
            this.f15854c.m21535j(m21560e.mo21547a(), m21590u.m21407c().longValue());
            return m21590u.m21407c().longValue();
        }
        C6628e<Long> m21607d = m21607d(m21560e);
        if (m21607d.m21406d() && m21615K(m21607d.m21407c().longValue())) {
            return m21607d.m21407c().longValue();
        }
        return m21560e.m21561d().longValue();
    }

    /* renamed from: z */
    public long m21585z() {
        C6583q m21558e = C6583q.m21558e();
        C6628e<Long> m21597n = m21597n(m21558e);
        if (m21597n.m21406d() && m21618H(m21597n.m21407c().longValue())) {
            return m21597n.m21407c().longValue();
        }
        C6628e<Long> m21590u = m21590u(m21558e);
        if (m21590u.m21406d() && m21618H(m21590u.m21407c().longValue())) {
            this.f15854c.m21535j(m21558e.mo21547a(), m21590u.m21407c().longValue());
            return m21590u.m21407c().longValue();
        }
        C6628e<Long> m21607d = m21607d(m21558e);
        if (m21607d.m21406d() && m21618H(m21607d.m21407c().longValue())) {
            return m21607d.m21407c().longValue();
        }
        return m21558e.m21559d().longValue();
    }
}
