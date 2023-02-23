package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.l9 */
/* loaded from: classes2.dex */
public final class C3880l9 extends C3901n {

    /* renamed from: d */
    private final C3729c f9463d;

    public C3880l9(C3729c c3729c) {
        this.f9463d = c3729c;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.measurement.C3901n
    /* renamed from: s */
    public final q mo29367s(String str, C3968r4 c3968r4, List<q> list) {
        char c;
        switch (str.hashCode()) {
            case 21624207:
                if (str.equals("getEventName")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            C3969r5.m29037h("getEventName", 0, list);
            return new C4011u(this.f9463d.m29735b().m29835d());
        } else if (c == 1) {
            C3969r5.m29037h("getParamValue", 1, list);
            return C3986s6.m28974b(this.f9463d.m29735b().m29836c(c3968r4.m29051b(list.get(0)).h()));
        } else if (c == 2) {
            C3969r5.m29037h("getParams", 0, list);
            Map<String, Object> m29834e = this.f9463d.m29735b().m29834e();
            C3901n c3901n = new C3901n();
            for (String str2 : m29834e.keySet()) {
                c3901n.m29370k(str2, C3986s6.m28974b(m29834e.get(str2)));
            }
            return c3901n;
        } else if (c == 3) {
            C3969r5.m29037h("getTimestamp", 0, list);
            return new C3822i(Double.valueOf(this.f9463d.m29735b().m29838a()));
        } else if (c != 4) {
            if (c != 5) {
                return super.mo29367s(str, c3968r4, list);
            }
            C3969r5.m29037h("setParamValue", 2, list);
            String h = c3968r4.m29051b(list.get(0)).h();
            q m29051b = c3968r4.m29051b(list.get(1));
            this.f9463d.m29735b().m29832g(h, C3969r5.m29039f(m29051b));
            return m29051b;
        } else {
            C3969r5.m29037h("setEventName", 1, list);
            q m29051b2 = c3968r4.m29051b(list.get(0));
            if (!q.i.equals(m29051b2) && !q.j.equals(m29051b2)) {
                this.f9463d.m29735b().m29833f(m29051b2.h());
                return new C4011u(m29051b2.h());
            }
            throw new IllegalArgumentException("Illegal event name");
        }
    }
}
