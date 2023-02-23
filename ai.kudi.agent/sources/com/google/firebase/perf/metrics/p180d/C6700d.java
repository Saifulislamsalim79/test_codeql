package com.google.firebase.perf.metrics.p180d;

import com.google.firebase.perf.p176h.C6609a;
import com.google.firebase.perf.p178j.EnumC6625b;
import com.google.firebase.perf.p179k.C6681m;
import java.util.Map;
/* compiled from: FirebasePerfTraceValidator.java */
/* renamed from: com.google.firebase.perf.metrics.d.d */
/* loaded from: classes2.dex */
final class C6700d extends AbstractC6701e {

    /* renamed from: b */
    private static final C6609a f16111b = C6609a.m21475e();

    /* renamed from: a */
    private final C6681m f16112a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6700d(C6681m c6681m) {
        this.f16112a = c6681m;
    }

    /* renamed from: g */
    private boolean m21076g(C6681m c6681m) {
        return m21075h(c6681m, 0);
    }

    /* renamed from: h */
    private boolean m21075h(C6681m c6681m, int i) {
        if (c6681m == null) {
            return false;
        }
        if (i > 1) {
            f16111b.m21471i("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        for (Map.Entry<String, Long> entry : c6681m.m21166i0().entrySet()) {
            if (!m21071l(entry.getKey())) {
                C6609a c6609a = f16111b;
                c6609a.m21471i("invalid CounterId:" + entry.getKey());
                return false;
            } else if (!m21070m(entry.getValue())) {
                C6609a c6609a2 = f16111b;
                c6609a2.m21471i("invalid CounterValue:" + entry.getValue());
                return false;
            }
        }
        for (C6681m c6681m2 : c6681m.m21158q0()) {
            if (!m21075h(c6681m2, i + 1)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: i */
    private boolean m21074i(C6681m c6681m) {
        boolean z;
        if (c6681m.m21167h0() > 0) {
            return true;
        }
        for (C6681m c6681m2 : c6681m.m21158q0()) {
            if (c6681m2.m21167h0() > 0) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    private boolean m21073j(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String m21062d = AbstractC6701e.m21062d(entry);
            if (m21062d != null) {
                f16111b.m21471i(m21062d);
                return false;
            }
        }
        return true;
    }

    /* renamed from: k */
    private boolean m21072k(C6681m c6681m) {
        return c6681m.m21160o0().startsWith("_st_");
    }

    /* renamed from: l */
    private boolean m21071l(String str) {
        if (str == null) {
            return false;
        }
        String trim = str.trim();
        if (trim.isEmpty()) {
            f16111b.m21471i("counterId is empty");
            return false;
        } else if (trim.length() > 100) {
            f16111b.m21471i("counterId exceeded max length 100");
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: m */
    private boolean m21070m(Long l) {
        return l != null;
    }

    /* renamed from: n */
    private boolean m21069n(C6681m c6681m) {
        Long l = c6681m.m21166i0().get(EnumC6625b.FRAMES_TOTAL.toString());
        return l != null && l.compareTo((Long) 0L) > 0;
    }

    /* renamed from: o */
    private boolean m21068o(C6681m c6681m, int i) {
        if (c6681m == null) {
            f16111b.m21471i("TraceMetric is null");
            return false;
        } else if (i > 1) {
            f16111b.m21471i("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        } else if (!m21066q(c6681m.m21160o0())) {
            C6609a c6609a = f16111b;
            c6609a.m21471i("invalid TraceId:" + c6681m.m21160o0());
            return false;
        } else if (!m21067p(c6681m)) {
            C6609a c6609a2 = f16111b;
            c6609a2.m21471i("invalid TraceDuration:" + c6681m.m21163l0());
            return false;
        } else if (!c6681m.m21157r0()) {
            f16111b.m21471i("clientStartTimeUs is null.");
            return false;
        } else if (m21072k(c6681m) && !m21069n(c6681m)) {
            C6609a c6609a3 = f16111b;
            c6609a3.m21471i("non-positive totalFrames in screen trace " + c6681m.m21160o0());
            return false;
        } else {
            for (C6681m c6681m2 : c6681m.m21158q0()) {
                if (!m21068o(c6681m2, i + 1)) {
                    return false;
                }
            }
            return m21073j(c6681m.m21165j0());
        }
    }

    /* renamed from: p */
    private boolean m21067p(C6681m c6681m) {
        return c6681m != null && c6681m.m21163l0() > 0;
    }

    /* renamed from: q */
    private boolean m21066q(String str) {
        if (str == null) {
            return false;
        }
        String trim = str.trim();
        return !trim.isEmpty() && trim.length() <= 100;
    }

    @Override // com.google.firebase.perf.metrics.p180d.AbstractC6701e
    /* renamed from: c */
    public boolean mo21063c() {
        if (!m21068o(this.f16112a, 0)) {
            C6609a c6609a = f16111b;
            c6609a.m21471i("Invalid Trace:" + this.f16112a.m21160o0());
            return false;
        } else if (!m21074i(this.f16112a) || m21076g(this.f16112a)) {
            return true;
        } else {
            C6609a c6609a2 = f16111b;
            c6609a2.m21471i("Invalid Counters for Trace:" + this.f16112a.m21160o0());
            return false;
        }
    }
}
