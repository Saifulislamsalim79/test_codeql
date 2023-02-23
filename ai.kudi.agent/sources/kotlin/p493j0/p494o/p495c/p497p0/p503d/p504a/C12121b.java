package kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C13664u;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p512g0.C12311i;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p512g0.EnumC12310h;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p557z.C13724q;
import kotlin.p557z.C13725q0;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13727r0;
import kotlin.p557z.C13741y0;
/* compiled from: AnnotationQualifiersFqNames.kt */
/* renamed from: kotlin.j0.o.c.p0.d.a.b */
/* loaded from: classes3.dex */
public final class C12121b {

    /* renamed from: a */
    private static final C12609c f27042a = new C12609c("javax.annotation.meta.TypeQualifierNickname");

    /* renamed from: b */
    private static final C12609c f27043b = new C12609c("javax.annotation.meta.TypeQualifier");

    /* renamed from: c */
    private static final C12609c f27044c = new C12609c("javax.annotation.meta.TypeQualifierDefault");

    /* renamed from: d */
    private static final C12609c f27045d = new C12609c("kotlin.annotations.jvm.UnderMigration");

    /* renamed from: e */
    private static final List<EnumC12119a> f27046e;

    /* renamed from: f */
    private static final Map<C12609c, C12377q> f27047f;

    /* renamed from: g */
    private static final Map<C12609c, C12377q> f27048g;

    /* renamed from: h */
    private static final Set<C12609c> f27049h;

    static {
        List<EnumC12119a> m3888h;
        Map<C12609c, C12377q> m3897g;
        List m3901b;
        List m3901b2;
        Map m3878n;
        Map<C12609c, C12377q> m3875q;
        Set<C12609c> m3827f;
        m3888h = C13726r.m3888h(EnumC12119a.FIELD, EnumC12119a.METHOD_RETURN_TYPE, EnumC12119a.VALUE_PARAMETER, EnumC12119a.TYPE_PARAMETER_BOUNDS, EnumC12119a.TYPE_USE);
        f27046e = m3888h;
        m3897g = C13725q0.m3897g(C13664u.m4227a(C12387w.m9069g(), new C12377q(new C12311i(EnumC12310h.NOT_NULL, false, 2, null), f27046e, false)));
        f27047f = m3897g;
        C12609c c12609c = new C12609c("javax.annotation.ParametersAreNullableByDefault");
        C12311i c12311i = new C12311i(EnumC12310h.NULLABLE, false, 2, null);
        m3901b = C13724q.m3901b(EnumC12119a.VALUE_PARAMETER);
        C12609c c12609c2 = new C12609c("javax.annotation.ParametersAreNonnullByDefault");
        C12311i c12311i2 = new C12311i(EnumC12310h.NOT_NULL, false, 2, null);
        m3901b2 = C13724q.m3901b(EnumC12119a.VALUE_PARAMETER);
        m3878n = C13727r0.m3878n(C13664u.m4227a(c12609c, new C12377q(c12311i, m3901b, false, 4, null)), C13664u.m4227a(c12609c2, new C12377q(c12311i2, m3901b2, false, 4, null)));
        m3875q = C13727r0.m3875q(m3878n, f27047f);
        f27048g = m3875q;
        m3827f = C13741y0.m3827f(C12387w.m9070f(), C12387w.m9071e());
        f27049h = m3827f;
    }

    /* renamed from: a */
    public static final Map<C12609c, C12377q> m9674a() {
        return f27048g;
    }

    /* renamed from: b */
    public static final Set<C12609c> m9673b() {
        return f27049h;
    }

    /* renamed from: c */
    public static final Map<C12609c, C12377q> m9672c() {
        return f27047f;
    }

    /* renamed from: d */
    public static final C12609c m9671d() {
        return f27045d;
    }

    /* renamed from: e */
    public static final C12609c m9670e() {
        return f27044c;
    }

    /* renamed from: f */
    public static final C12609c m9669f() {
        return f27043b;
    }

    /* renamed from: g */
    public static final C12609c m9668g() {
        return f27042a;
    }
}
