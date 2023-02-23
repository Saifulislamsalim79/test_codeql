package kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a;

import java.util.Iterator;
import java.util.List;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p506c0.C12153e;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p507d0.p509n.C12253e;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p504a.p507d0.p509n.C12256f;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.C12681j;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.InterfaceC12674e;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p548k0.C13242n;
import kotlin.p548k0.InterfaceC13230h;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13742z;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13293a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13307c1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13312e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13524r0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13543t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13554x;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13562z0;
/* compiled from: ErasedOverridabilityCondition.kt */
/* renamed from: kotlin.j0.o.c.p0.d.a.l */
/* loaded from: classes3.dex */
public final class C12368l implements InterfaceC12674e {

    /* compiled from: ErasedOverridabilityCondition.kt */
    /* renamed from: kotlin.j0.o.c.p0.d.a.l$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C12369a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f27449a;

        static {
            int[] iArr = new int[C12681j.C12690i.EnumC12691a.values().length];
            iArr[C12681j.C12690i.EnumC12691a.OVERRIDABLE.ordinal()] = 1;
            f27449a = iArr;
        }
    }

    /* compiled from: ErasedOverridabilityCondition.kt */
    /* renamed from: kotlin.j0.o.c.p0.d.a.l$b */
    /* loaded from: classes3.dex */
    static final class C12370b extends AbstractC11802m implements InterfaceC11767l<InterfaceC13307c1, AbstractC12965b0> {

        /* renamed from: c */
        public static final C12370b f27450c = new C12370b();

        C12370b() {
            super(1);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: a */
        public final AbstractC12965b0 invoke(InterfaceC13307c1 interfaceC13307c1) {
            return interfaceC13307c1.mo5121c();
        }
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.InterfaceC12674e
    /* renamed from: a */
    public InterfaceC12674e.EnumC12675a mo7008a() {
        return InterfaceC12674e.EnumC12675a.SUCCESS_ONLY;
    }

    @Override // kotlin.p493j0.p494o.p495c.p497p0.p523i.InterfaceC12674e
    /* renamed from: b */
    public InterfaceC12674e.EnumC12676b mo7007b(InterfaceC13293a interfaceC13293a, InterfaceC13293a interfaceC13293a2, InterfaceC13312e interfaceC13312e) {
        InterfaceC13230h m3818H;
        InterfaceC13230h m5569r;
        InterfaceC13230h m5566u;
        List m3887i;
        InterfaceC13230h m5567t;
        boolean z;
        InterfaceC13543t0 mo4686e;
        List<InterfaceC13562z0> m3891e;
        boolean z2;
        l.f(interfaceC13293a, "superDescriptor");
        l.f(interfaceC13293a2, "subDescriptor");
        if (interfaceC13293a2 instanceof C12153e) {
            C12153e c12153e = (C12153e) interfaceC13293a2;
            List<InterfaceC13562z0> mo4942l = c12153e.mo4942l();
            l.e(mo4942l, "subDescriptor.typeParameters");
            if (!(!mo4942l.isEmpty())) {
                C12681j.C12690i m6957x = C12681j.m6957x(interfaceC13293a, interfaceC13293a2);
                if ((m6957x == null ? null : m6957x.m6945c()) != null) {
                    return InterfaceC12674e.EnumC12676b.UNKNOWN;
                }
                List<InterfaceC13307c1> mo5072k = c12153e.mo5072k();
                l.e(mo5072k, "subDescriptor.valueParameters");
                m3818H = C13742z.m3818H(mo5072k);
                m5569r = C13242n.m5569r(m3818H, C12370b.f27450c);
                AbstractC12965b0 mo4943j = c12153e.mo4943j();
                l.d(mo4943j);
                m5566u = C13242n.m5566u(m5569r, mo4943j);
                InterfaceC13524r0 mo5056w0 = c12153e.mo5056w0();
                m3887i = C13726r.m3887i(mo5056w0 != null ? mo5056w0.mo5121c() : null);
                m5567t = C13242n.m5567t(m5566u, m3887i);
                Iterator it = m5567t.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    AbstractC12965b0 abstractC12965b0 = (AbstractC12965b0) it.next();
                    if (!(!abstractC12965b0.mo5780V0().isEmpty()) || (abstractC12965b0.mo6202Z0() instanceof C12256f)) {
                        z2 = false;
                        continue;
                    } else {
                        z2 = true;
                        continue;
                    }
                    if (z2) {
                        z = true;
                        break;
                    }
                }
                if (!z && (mo4686e = interfaceC13293a.mo4686e(C12253e.f27319b.m5750c())) != null) {
                    if (mo4686e instanceof InterfaceC13543t0) {
                        InterfaceC13543t0 interfaceC13543t0 = (InterfaceC13543t0) mo4686e;
                        List<InterfaceC13562z0> mo4942l2 = interfaceC13543t0.mo4942l();
                        l.e(mo4942l2, "erasedSuper.typeParameters");
                        if (!mo4942l2.isEmpty()) {
                            InterfaceC13554x.InterfaceC13555a<? extends InterfaceC13543t0> mo4694A = interfaceC13543t0.mo4694A();
                            m3891e = C13726r.m3891e();
                            mo4686e = mo4694A.mo4671l(m3891e).build();
                            l.d(mo4686e);
                        }
                    }
                    C12681j.C12690i.EnumC12691a m6945c = C12681j.f28539d.m6987G(mo4686e, interfaceC13293a2, false).m6945c();
                    l.e(m6945c, "DEFAULT.isOverridableByWithoutExternalConditions(erasedSuper, subDescriptor, false).result");
                    if (C12369a.f27449a[m6945c.ordinal()] == 1) {
                        return InterfaceC12674e.EnumC12676b.OVERRIDABLE;
                    }
                    return InterfaceC12674e.EnumC12676b.UNKNOWN;
                }
                return InterfaceC12674e.EnumC12676b.UNKNOWN;
            }
        }
        return InterfaceC12674e.EnumC12676b.UNKNOWN;
    }
}
