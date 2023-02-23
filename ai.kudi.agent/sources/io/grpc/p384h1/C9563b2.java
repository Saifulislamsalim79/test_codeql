package io.grpc.p384h1;

import com.google.common.base.C5051n;
import io.grpc.AbstractC10069u0;
import io.grpc.C9497c1;
import java.util.Map;
/* compiled from: ScParser.java */
/* renamed from: io.grpc.h1.b2 */
/* loaded from: classes2.dex */
public final class C9563b2 extends AbstractC10069u0.AbstractC10079h {

    /* renamed from: a */
    private final boolean f22384a;

    /* renamed from: b */
    private final int f22385b;

    /* renamed from: c */
    private final int f22386c;

    /* renamed from: d */
    private final C9677j f22387d;

    public C9563b2(boolean z, int i, int i2, C9677j c9677j) {
        this.f22384a = z;
        this.f22385b = i;
        this.f22386c = i2;
        C5051n.m25779o(c9677j, "autoLoadBalancerFactory");
        this.f22387d = c9677j;
    }

    @Override // io.grpc.AbstractC10069u0.AbstractC10079h
    /* renamed from: a */
    public AbstractC10069u0.C10073c mo13107a(Map<String, ?> map) {
        Object m13120c;
        try {
            AbstractC10069u0.C10073c m14201f = this.f22387d.m14201f(map);
            if (m14201f == null) {
                m13120c = null;
            } else if (m14201f.m13119d() != null) {
                return AbstractC10069u0.C10073c.m13121b(m14201f.m13119d());
            } else {
                m13120c = m14201f.m13120c();
            }
            return AbstractC10069u0.C10073c.m13122a(C9685j1.m14188b(map, this.f22384a, this.f22385b, this.f22386c, m13120c));
        } catch (RuntimeException e) {
            return AbstractC10069u0.C10073c.m13121b(C9497c1.f22189h.m14578r("failed to parse service config").m14579q(e));
        }
    }
}
