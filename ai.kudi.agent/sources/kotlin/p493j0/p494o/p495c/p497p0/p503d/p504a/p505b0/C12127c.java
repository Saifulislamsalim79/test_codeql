package kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p505b0;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.Map;
import kotlin.C13664u;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.C12059k;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.C12386v;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p507d0.C12174h;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p507d0.p508m.C12188e;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12265a;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p511f0.InterfaceC12272d;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12608b;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p557z.C13727r0;
import kotlin.reflect.jvm.internal.impl.descriptors.p550h1.InterfaceC13340c;
/* compiled from: JavaAnnotationMapper.kt */
/* renamed from: kotlin.j0.o.c.p0.d.a.b0.c */
/* loaded from: classes3.dex */
public final class C12127c {

    /* renamed from: a */
    public static final C12127c f27062a = new C12127c();

    /* renamed from: b */
    private static final C12614f f27063b;

    /* renamed from: c */
    private static final C12614f f27064c;

    /* renamed from: d */
    private static final C12614f f27065d;

    /* renamed from: e */
    private static final Map<C12609c, C12609c> f27066e;

    static {
        Map<C12609c, C12609c> m3878n;
        C12614f m7349i = C12614f.m7349i(MetricTracker.Object.MESSAGE);
        l.e(m7349i, "identifier(\"message\")");
        f27063b = m7349i;
        C12614f m7349i2 = C12614f.m7349i("allowedTargets");
        l.e(m7349i2, "identifier(\"allowedTargets\")");
        f27064c = m7349i2;
        C12614f m7349i3 = C12614f.m7349i("value");
        l.e(m7349i3, "identifier(\"value\")");
        f27065d = m7349i3;
        m3878n = C13727r0.m3878n(C13664u.m4227a(C12059k.C12060a.f26867t, C12386v.f27470c), C13664u.m4227a(C12059k.C12060a.f26870w, C12386v.f27471d), C13664u.m4227a(C12059k.C12060a.f26871x, C12386v.f27474g), C13664u.m4227a(C12059k.C12060a.f26872y, C12386v.f27473f));
        f27066e = m3878n;
        C13727r0.m3878n(C13664u.m4227a(C12386v.f27470c, C12059k.C12060a.f26867t), C13664u.m4227a(C12386v.f27471d, C12059k.C12060a.f26870w), C13664u.m4227a(C12386v.f27472e, C12059k.C12060a.f26861n), C13664u.m4227a(C12386v.f27474g, C12059k.C12060a.f26871x), C13664u.m4227a(C12386v.f27473f, C12059k.C12060a.f26872y));
    }

    private C12127c() {
    }

    /* renamed from: f */
    public static /* synthetic */ InterfaceC13340c m9651f(C12127c c12127c, InterfaceC12265a interfaceC12265a, C12174h c12174h, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return c12127c.m9652e(interfaceC12265a, c12174h, z);
    }

    /* renamed from: a */
    public final InterfaceC13340c m9656a(C12609c c12609c, InterfaceC12272d interfaceC12272d, C12174h c12174h) {
        InterfaceC12265a mo4777r;
        l.f(c12609c, "kotlinName");
        l.f(interfaceC12272d, "annotationOwner");
        l.f(c12174h, "c");
        if (l.b(c12609c, C12059k.C12060a.f26861n)) {
            C12609c c12609c2 = C12386v.f27472e;
            l.e(c12609c2, "DEPRECATED_ANNOTATION");
            InterfaceC12265a mo4777r2 = interfaceC12272d.mo4777r(c12609c2);
            if (mo4777r2 != null || interfaceC12272d.mo4771q()) {
                return new C12130e(mo4777r2, c12174h);
            }
        }
        C12609c c12609c3 = f27066e.get(c12609c);
        if (c12609c3 == null || (mo4777r = interfaceC12272d.mo4777r(c12609c3)) == null) {
            return null;
        }
        return m9651f(f27062a, mo4777r, c12174h, false, 4, null);
    }

    /* renamed from: b */
    public final C12614f m9655b() {
        return f27063b;
    }

    /* renamed from: c */
    public final C12614f m9654c() {
        return f27065d;
    }

    /* renamed from: d */
    public final C12614f m9653d() {
        return f27064c;
    }

    /* renamed from: e */
    public final InterfaceC13340c m9652e(InterfaceC12265a interfaceC12265a, C12174h c12174h, boolean z) {
        l.f(interfaceC12265a, "annotation");
        l.f(c12174h, "c");
        C12608b mo4879h = interfaceC12265a.mo4879h();
        if (l.b(mo4879h, C12608b.m7384m(C12386v.f27470c))) {
            return new C12138i(interfaceC12265a, c12174h);
        }
        if (l.b(mo4879h, C12608b.m7384m(C12386v.f27471d))) {
            return new C12136h(interfaceC12265a, c12174h);
        }
        if (l.b(mo4879h, C12608b.m7384m(C12386v.f27474g))) {
            return new C12125b(c12174h, interfaceC12265a, C12059k.C12060a.f26871x);
        }
        if (l.b(mo4879h, C12608b.m7384m(C12386v.f27473f))) {
            return new C12125b(c12174h, interfaceC12265a, C12059k.C12060a.f26872y);
        }
        if (l.b(mo4879h, C12608b.m7384m(C12386v.f27472e))) {
            return null;
        }
        return new C12188e(c12174h, interfaceC12265a, z);
    }
}
