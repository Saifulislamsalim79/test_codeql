package io.grpc.p384h1;

import com.google.common.base.C5042j;
import com.google.common.base.C5046k;
import com.google.common.base.C5051n;
import com.google.common.base.C5062u;
import com.google.common.base.VerifyException;
import io.grpc.AbstractC10034o0;
import io.grpc.AbstractC10069u0;
import io.grpc.C10037p0;
import io.grpc.C9497c1;
import io.grpc.p384h1.AbstractC9857z1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: ServiceConfigUtil.java */
/* renamed from: io.grpc.h1.e2 */
/* loaded from: classes2.dex */
public final class C9596e2 {

    /* compiled from: ServiceConfigUtil.java */
    /* renamed from: io.grpc.h1.e2$a */
    /* loaded from: classes2.dex */
    public static final class C9597a {

        /* renamed from: a */
        private final String f22475a;

        /* renamed from: b */
        private final Map<String, ?> f22476b;

        public C9597a(String str, Map<String, ?> map) {
            C5051n.m25779o(str, "policyName");
            this.f22475a = str;
            C5051n.m25779o(map, "rawConfigValue");
            this.f22476b = map;
        }

        /* renamed from: a */
        public String m14345a() {
            return this.f22475a;
        }

        /* renamed from: b */
        public Map<String, ?> m14344b() {
            return this.f22476b;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C9597a) {
                C9597a c9597a = (C9597a) obj;
                return this.f22475a.equals(c9597a.f22475a) && this.f22476b.equals(c9597a.f22476b);
            }
            return false;
        }

        public int hashCode() {
            return C5046k.m25799b(this.f22475a, this.f22476b);
        }

        public String toString() {
            C5042j.C5044b m25812c = C5042j.m25812c(this);
            m25812c.m25808d("policyName", this.f22475a);
            m25812c.m25808d("rawConfigValue", this.f22476b);
            return m25812c.toString();
        }
    }

    /* compiled from: ServiceConfigUtil.java */
    /* renamed from: io.grpc.h1.e2$b */
    /* loaded from: classes2.dex */
    public static final class C9598b {

        /* renamed from: a */
        final AbstractC10034o0 f22477a;

        /* renamed from: b */
        final Object f22478b;

        public C9598b(AbstractC10034o0 abstractC10034o0, Object obj) {
            C5051n.m25779o(abstractC10034o0, "provider");
            this.f22477a = abstractC10034o0;
            this.f22478b = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C9598b.class != obj.getClass()) {
                return false;
            }
            C9598b c9598b = (C9598b) obj;
            return C5046k.m25800a(this.f22477a, c9598b.f22477a) && C5046k.m25800a(this.f22478b, c9598b.f22478b);
        }

        public int hashCode() {
            return C5046k.m25799b(this.f22477a, this.f22478b);
        }

        public String toString() {
            C5042j.C5044b m25812c = C5042j.m25812c(this);
            m25812c.m25808d("provider", this.f22477a);
            m25812c.m25808d("config", this.f22478b);
            return m25812c.toString();
        }
    }

    private C9596e2() {
    }

    /* renamed from: A */
    public static List<C9597a> m14372A(List<Map<String, ?>> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map<String, ?> map : list) {
            arrayList.add(m14346z(map));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Double m14371a(Map<String, ?> map) {
        return C9562b1.m14463h(map, "backoffMultiplier");
    }

    /* renamed from: b */
    public static Map<String, ?> m14370b(Map<String, ?> map) {
        if (map == null) {
            return null;
        }
        return C9562b1.m14461j(map, "healthCheckConfig");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static Long m14369c(Map<String, ?> map) {
        return C9562b1.m14459l(map, "hedgingDelay");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static Map<String, ?> m14368d(Map<String, ?> map) {
        return C9562b1.m14461j(map, "hedgingPolicy");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static Long m14367e(Map<String, ?> map) {
        return C9562b1.m14459l(map, "initialBackoff");
    }

    /* renamed from: f */
    private static Set<C9497c1.EnumC9499b> m14366f(Map<String, ?> map, String str) {
        List<?> m14466e = C9562b1.m14466e(map, str);
        if (m14466e == null) {
            return null;
        }
        return m14351u(m14466e);
    }

    /* renamed from: g */
    public static List<Map<String, ?>> m14365g(Map<String, ?> map) {
        String m14460k;
        ArrayList arrayList = new ArrayList();
        if (map.containsKey("loadBalancingConfig")) {
            arrayList.addAll(C9562b1.m14465f(map, "loadBalancingConfig"));
        }
        if (arrayList.isEmpty() && (m14460k = C9562b1.m14460k(map, "loadBalancingPolicy")) != null) {
            arrayList.add(Collections.singletonMap(m14460k.toLowerCase(Locale.ROOT), Collections.emptyMap()));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static Integer m14364h(Map<String, ?> map) {
        return C9562b1.m14462i(map, "maxAttempts");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static Integer m14363i(Map<String, ?> map) {
        return C9562b1.m14462i(map, "maxAttempts");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static Long m14362j(Map<String, ?> map) {
        return C9562b1.m14459l(map, "maxBackoff");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static Integer m14361k(Map<String, ?> map) {
        return C9562b1.m14462i(map, "maxRequestMessageBytes");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static Integer m14360l(Map<String, ?> map) {
        return C9562b1.m14462i(map, "maxResponseMessageBytes");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static List<Map<String, ?>> m14359m(Map<String, ?> map) {
        return C9562b1.m14465f(map, "methodConfig");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public static String m14358n(Map<String, ?> map) {
        return C9562b1.m14460k(map, "method");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public static List<Map<String, ?>> m14357o(Map<String, ?> map) {
        return C9562b1.m14465f(map, "name");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public static Set<C9497c1.EnumC9499b> m14356p(Map<String, ?> map) {
        Set<C9497c1.EnumC9499b> m14366f = m14366f(map, "nonFatalStatusCodes");
        if (m14366f == null) {
            return Collections.unmodifiableSet(EnumSet.noneOf(C9497c1.EnumC9499b.class));
        }
        C5062u.m25747a(!m14366f.contains(C9497c1.EnumC9499b.OK), "%s must not contain OK", "nonFatalStatusCodes");
        return m14366f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public static Long m14355q(Map<String, ?> map) {
        return C9562b1.m14459l(map, "perAttemptRecvTimeout");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public static Map<String, ?> m14354r(Map<String, ?> map) {
        return C9562b1.m14461j(map, "retryPolicy");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public static Set<C9497c1.EnumC9499b> m14353s(Map<String, ?> map) {
        Set<C9497c1.EnumC9499b> m14366f = m14366f(map, "retryableStatusCodes");
        C5062u.m25747a(m14366f != null, "%s is required in retry policy", "retryableStatusCodes");
        C5062u.m25747a(true ^ m14366f.contains(C9497c1.EnumC9499b.OK), "%s must not contain OK", "retryableStatusCodes");
        return m14366f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public static String m14352t(Map<String, ?> map) {
        return C9562b1.m14460k(map, "service");
    }

    /* renamed from: u */
    private static Set<C9497c1.EnumC9499b> m14351u(List<?> list) {
        C9497c1.EnumC9499b valueOf;
        EnumSet noneOf = EnumSet.noneOf(C9497c1.EnumC9499b.class);
        for (Object obj : list) {
            if (obj instanceof Double) {
                Double d = (Double) obj;
                int intValue = d.intValue();
                C5062u.m25747a(((double) intValue) == d.doubleValue(), "Status code %s is not integral", obj);
                valueOf = C9497c1.m14587i(intValue).m14582n();
                C5062u.m25747a(valueOf.m14575e() == d.intValue(), "Status code %s is not valid", obj);
            } else if (obj instanceof String) {
                try {
                    valueOf = C9497c1.EnumC9499b.valueOf((String) obj);
                } catch (IllegalArgumentException e) {
                    throw new VerifyException("Status code " + obj + " is not valid", e);
                }
            } else {
                throw new VerifyException("Can not convert status code " + obj + " to Status.Code, because its type is " + obj.getClass());
            }
            noneOf.add(valueOf);
        }
        return Collections.unmodifiableSet(noneOf);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public static AbstractC9857z1.C9871c0 m14350v(Map<String, ?> map) {
        Map<String, ?> m14461j;
        if (map == null || (m14461j = C9562b1.m14461j(map, "retryThrottling")) == null) {
            return null;
        }
        float floatValue = C9562b1.m14463h(m14461j, "maxTokens").floatValue();
        float floatValue2 = C9562b1.m14463h(m14461j, "tokenRatio").floatValue();
        C5051n.m25773u(floatValue > 0.0f, "maxToken should be greater than zero");
        C5051n.m25773u(floatValue2 > 0.0f, "tokenRatio should be greater than zero");
        return new AbstractC9857z1.C9871c0(floatValue, floatValue2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public static Long m14349w(Map<String, ?> map) {
        return C9562b1.m14459l(map, "timeout");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public static Boolean m14348x(Map<String, ?> map) {
        return C9562b1.m14467d(map, "waitForReady");
    }

    /* renamed from: y */
    public static AbstractC10069u0.C10073c m14347y(List<C9597a> list, C10037p0 c10037p0) {
        ArrayList arrayList = new ArrayList();
        for (C9597a c9597a : list) {
            String m14345a = c9597a.m14345a();
            AbstractC10034o0 m13248d = c10037p0.m13248d(m14345a);
            if (m13248d == null) {
                arrayList.add(m14345a);
            } else {
                if (!arrayList.isEmpty()) {
                    Logger.getLogger(C9596e2.class.getName()).log(Level.FINEST, "{0} specified by Service Config are not available", arrayList);
                }
                AbstractC10069u0.C10073c mo13254e = m13248d.mo13254e(c9597a.m14344b());
                return mo13254e.m13119d() != null ? mo13254e : AbstractC10069u0.C10073c.m13122a(new C9598b(m13248d, mo13254e.m13120c()));
            }
        }
        C9497c1 c9497c1 = C9497c1.f22189h;
        return AbstractC10069u0.C10073c.m13121b(c9497c1.m14578r("None of " + arrayList + " specified by Service Config are available."));
    }

    /* renamed from: z */
    public static C9597a m14346z(Map<String, ?> map) {
        if (map.size() == 1) {
            String key = map.entrySet().iterator().next().getKey();
            return new C9597a(key, C9562b1.m14461j(map, key));
        }
        throw new RuntimeException("There are " + map.size() + " fields in a LoadBalancingConfig object. Exactly one is expected. Config=" + map);
    }
}
