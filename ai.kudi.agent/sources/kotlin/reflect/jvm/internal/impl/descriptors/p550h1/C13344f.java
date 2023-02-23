package kotlin.reflect.jvm.internal.impl.descriptors.p550h1;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.List;
import java.util.Map;
import kotlin.C13664u;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.AbstractC12046h;
import kotlin.p493j0.p494o.p495c.p497p0.p498b.C12059k;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12608b;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p526r.C12705a;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p526r.C12707b;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p526r.C12717j;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p526r.C12740v;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC13010i0;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.EnumC13008h1;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13727r0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13305c0;
/* compiled from: annotationUtil.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.h1.f */
/* loaded from: classes3.dex */
public final class C13344f {

    /* renamed from: a */
    private static final C12614f f29510a;

    /* renamed from: b */
    private static final C12614f f29511b;

    /* renamed from: c */
    private static final C12614f f29512c;

    /* renamed from: d */
    private static final C12614f f29513d;

    /* renamed from: e */
    private static final C12614f f29514e;

    /* compiled from: annotationUtil.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.h1.f$a */
    /* loaded from: classes3.dex */
    public static final class C13345a extends AbstractC11802m implements InterfaceC11767l<InterfaceC13305c0, AbstractC12965b0> {

        /* renamed from: c */
        final /* synthetic */ AbstractC12046h f29515c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13345a(AbstractC12046h abstractC12046h) {
            super(1);
            this.f29515c = abstractC12046h;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: a */
        public final AbstractC12965b0 invoke(InterfaceC13305c0 interfaceC13305c0) {
            l.f(interfaceC13305c0, "module");
            AbstractC13010i0 m9886l = interfaceC13305c0.mo4979s().m9886l(EnumC13008h1.INVARIANT, this.f29515c.m9912V());
            l.e(m9886l, "module.builtIns.getArrayType(Variance.INVARIANT, stringType)");
            return m9886l;
        }
    }

    static {
        C12614f m7349i = C12614f.m7349i(MetricTracker.Object.MESSAGE);
        l.e(m7349i, "identifier(\"message\")");
        f29510a = m7349i;
        C12614f m7349i2 = C12614f.m7349i("replaceWith");
        l.e(m7349i2, "identifier(\"replaceWith\")");
        f29511b = m7349i2;
        C12614f m7349i3 = C12614f.m7349i("level");
        l.e(m7349i3, "identifier(\"level\")");
        f29512c = m7349i3;
        C12614f m7349i4 = C12614f.m7349i("expression");
        l.e(m7349i4, "identifier(\"expression\")");
        f29513d = m7349i4;
        C12614f m7349i5 = C12614f.m7349i("imports");
        l.e(m7349i5, "identifier(\"imports\")");
        f29514e = m7349i5;
    }

    /* renamed from: a */
    public static final InterfaceC13340c m5321a(AbstractC12046h abstractC12046h, String str, String str2, String str3) {
        List m3891e;
        Map m3878n;
        Map m3878n2;
        l.f(abstractC12046h, "<this>");
        l.f(str, MetricTracker.Object.MESSAGE);
        l.f(str2, "replaceWith");
        l.f(str3, "level");
        C12609c c12609c = C12059k.C12060a.f26863p;
        C12614f c12614f = f29514e;
        m3891e = C13726r.m3891e();
        m3878n = C13727r0.m3878n(C13664u.m4227a(f29513d, new C12740v(str2)), C13664u.m4227a(c12614f, new C12707b(m3891e, new C13345a(abstractC12046h))));
        C13352j c13352j = new C13352j(abstractC12046h, c12609c, m3878n);
        C12609c c12609c2 = C12059k.C12060a.f26861n;
        C12614f c12614f2 = f29512c;
        C12608b m7384m = C12608b.m7384m(C12059k.C12060a.f26862o);
        l.e(m7384m, "topLevel(StandardNames.FqNames.deprecationLevel)");
        C12614f m7349i = C12614f.m7349i(str3);
        l.e(m7349i, "identifier(level)");
        m3878n2 = C13727r0.m3878n(C13664u.m4227a(f29510a, new C12740v(str)), C13664u.m4227a(f29511b, new C12705a(c13352j)), C13664u.m4227a(c12614f2, new C12717j(m7384m, m7349i)));
        return new C13352j(abstractC12046h, c12609c2, m3878n2);
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC13340c m5320b(AbstractC12046h abstractC12046h, String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "WARNING";
        }
        return m5321a(abstractC12046h, str, str2, str3);
    }
}
