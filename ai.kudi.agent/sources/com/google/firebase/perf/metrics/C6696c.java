package com.google.firebase.perf.metrics;

import com.google.firebase.perf.p179k.C6675k;
import com.google.firebase.perf.p179k.C6681m;
import com.google.firebase.perf.session.C6710a;
import java.util.Arrays;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TraceMetricBuilder.java */
/* renamed from: com.google.firebase.perf.metrics.c */
/* loaded from: classes2.dex */
public class C6696c {

    /* renamed from: a */
    private final Trace f16104a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6696c(Trace trace) {
        this.f16104a = trace;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C6681m m21090a() {
        C6681m.C6683b m21152x0 = C6681m.m21152x0();
        m21152x0.m21140P(this.f16104a.m21127e());
        m21152x0.m21142N(this.f16104a.m21125g().m21399d());
        m21152x0.m21141O(this.f16104a.m21125g().m21400c(this.f16104a.m21128d()));
        for (C6693a c6693a : this.f16104a.m21129c().values()) {
            m21152x0.m21143M(c6693a.m21115b(), c6693a.m21116a());
        }
        List<Trace> m21124h = this.f16104a.m21124h();
        if (!m21124h.isEmpty()) {
            for (Trace trace : m21124h) {
                m21152x0.m21146I(new C6696c(trace).m21090a());
            }
        }
        m21152x0.m21144L(this.f16104a.getAttributes());
        C6675k[] m20988b = C6710a.m20988b(this.f16104a.m21126f());
        if (m20988b != null) {
            m21152x0.m21149F(Arrays.asList(m20988b));
        }
        return m21152x0.build();
    }
}
