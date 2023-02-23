package kotlin.p493j0.p494o.p495c;

import java.util.List;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12614f;
import kotlin.p493j0.p494o.p495c.p497p0.p522h.AbstractC12624c;
import kotlin.p493j0.p494o.p495c.p497p0.p538l.AbstractC12965b0;
import kotlin.p557z.C13742z;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13293a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13307c1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13518o0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13524r0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC13554x;
/* compiled from: ReflectionObjectRenderer.kt */
/* renamed from: kotlin.j0.o.c.i0 */
/* loaded from: classes3.dex */
public final class C11949i0 {

    /* renamed from: b */
    public static final C11949i0 f26645b = new C11949i0();

    /* renamed from: a */
    private static final AbstractC12624c f26644a = AbstractC12624c.f28404b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReflectionObjectRenderer.kt */
    /* renamed from: kotlin.j0.o.c.i0$a */
    /* loaded from: classes3.dex */
    public static final class C11950a extends AbstractC11802m implements InterfaceC11767l<InterfaceC13307c1, CharSequence> {

        /* renamed from: c */
        public static final C11950a f26646c = new C11950a();

        C11950a() {
            super(1);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: a */
        public final CharSequence invoke(InterfaceC13307c1 interfaceC13307c1) {
            C11949i0 c11949i0 = C11949i0.f26645b;
            l.e(interfaceC13307c1, "it");
            AbstractC12965b0 mo5121c = interfaceC13307c1.mo5121c();
            l.e(mo5121c, "it.type");
            return c11949i0.m10097h(mo5121c);
        }
    }

    /* compiled from: ReflectionObjectRenderer.kt */
    /* renamed from: kotlin.j0.o.c.i0$b */
    /* loaded from: classes3.dex */
    static final class C11951b extends AbstractC11802m implements InterfaceC11767l<InterfaceC13307c1, CharSequence> {

        /* renamed from: c */
        public static final C11951b f26647c = new C11951b();

        C11951b() {
            super(1);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: a */
        public final CharSequence invoke(InterfaceC13307c1 interfaceC13307c1) {
            C11949i0 c11949i0 = C11949i0.f26645b;
            l.e(interfaceC13307c1, "it");
            AbstractC12965b0 mo5121c = interfaceC13307c1.mo5121c();
            l.e(mo5121c, "it.type");
            return c11949i0.m10097h(mo5121c);
        }
    }

    private C11949i0() {
    }

    /* renamed from: a */
    private final void m10104a(StringBuilder sb, InterfaceC13524r0 interfaceC13524r0) {
        if (interfaceC13524r0 != null) {
            AbstractC12965b0 mo5121c = interfaceC13524r0.mo5121c();
            l.e(mo5121c, "receiver.type");
            sb.append(m10097h(mo5121c));
            sb.append(".");
        }
    }

    /* renamed from: b */
    private final void m10103b(StringBuilder sb, InterfaceC13293a interfaceC13293a) {
        InterfaceC13524r0 m10035g = C11972m0.m10035g(interfaceC13293a);
        InterfaceC13524r0 mo5056w0 = interfaceC13293a.mo5056w0();
        m10104a(sb, m10035g);
        boolean z = (m10035g == null || mo5056w0 == null) ? false : true;
        if (z) {
            sb.append("(");
        }
        m10104a(sb, mo5056w0);
        if (z) {
            sb.append(")");
        }
    }

    /* renamed from: c */
    private final String m10102c(InterfaceC13293a interfaceC13293a) {
        if (interfaceC13293a instanceof InterfaceC13518o0) {
            return m10098g((InterfaceC13518o0) interfaceC13293a);
        }
        if (interfaceC13293a instanceof InterfaceC13554x) {
            return m10101d((InterfaceC13554x) interfaceC13293a);
        }
        throw new IllegalStateException(("Illegal callable: " + interfaceC13293a).toString());
    }

    /* renamed from: d */
    public final String m10101d(InterfaceC13554x interfaceC13554x) {
        l.f(interfaceC13554x, "descriptor");
        StringBuilder sb = new StringBuilder();
        sb.append("fun ");
        f26645b.m10103b(sb, interfaceC13554x);
        AbstractC12624c abstractC12624c = f26644a;
        C12614f mo5012b = interfaceC13554x.mo5012b();
        l.e(mo5012b, "descriptor.name");
        sb.append(abstractC12624c.mo7193v(mo5012b, true));
        List<InterfaceC13307c1> mo5072k = interfaceC13554x.mo5072k();
        l.e(mo5072k, "descriptor.valueParameters");
        C13742z.m3799Y(mo5072k, sb, ", ", "(", ")", 0, null, C11950a.f26646c, 48, null);
        sb.append(": ");
        C11949i0 c11949i0 = f26645b;
        AbstractC12965b0 mo4943j = interfaceC13554x.mo4943j();
        l.d(mo4943j);
        l.e(mo4943j, "descriptor.returnType!!");
        sb.append(c11949i0.m10097h(mo4943j));
        String sb2 = sb.toString();
        l.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: e */
    public final String m10100e(InterfaceC13554x interfaceC13554x) {
        l.f(interfaceC13554x, "invoke");
        StringBuilder sb = new StringBuilder();
        f26645b.m10103b(sb, interfaceC13554x);
        List<InterfaceC13307c1> mo5072k = interfaceC13554x.mo5072k();
        l.e(mo5072k, "invoke.valueParameters");
        C13742z.m3799Y(mo5072k, sb, ", ", "(", ")", 0, null, C11951b.f26647c, 48, null);
        sb.append(" -> ");
        C11949i0 c11949i0 = f26645b;
        AbstractC12965b0 mo4943j = interfaceC13554x.mo4943j();
        l.d(mo4943j);
        l.e(mo4943j, "invoke.returnType!!");
        sb.append(c11949i0.m10097h(mo4943j));
        String sb2 = sb.toString();
        l.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: f */
    public final String m10099f(C13178q c13178q) {
        l.f(c13178q, "parameter");
        StringBuilder sb = new StringBuilder();
        int i = C11947h0.f26642a[c13178q.m5702f().ordinal()];
        if (i == 1) {
            sb.append("extension receiver parameter");
        } else if (i == 2) {
            sb.append("instance parameter");
        } else if (i == 3) {
            sb.append("parameter #" + c13178q.m5703e() + ' ' + c13178q.mo5706b());
        }
        sb.append(" of ");
        sb.append(f26645b.m10102c(c13178q.m5705c().mo5650h()));
        String sb2 = sb.toString();
        l.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: g */
    public final String m10098g(InterfaceC13518o0 interfaceC13518o0) {
        l.f(interfaceC13518o0, "descriptor");
        StringBuilder sb = new StringBuilder();
        sb.append(interfaceC13518o0.mo5093t0() ? "var " : "val ");
        f26645b.m10103b(sb, interfaceC13518o0);
        AbstractC12624c abstractC12624c = f26644a;
        C12614f mo5012b = interfaceC13518o0.mo5012b();
        l.e(mo5012b, "descriptor.name");
        sb.append(abstractC12624c.mo7193v(mo5012b, true));
        sb.append(": ");
        C11949i0 c11949i0 = f26645b;
        AbstractC12965b0 mo5121c = interfaceC13518o0.mo5121c();
        l.e(mo5121c, "descriptor.type");
        sb.append(c11949i0.m10097h(mo5121c));
        String sb2 = sb.toString();
        l.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: h */
    public final String m10097h(AbstractC12965b0 abstractC12965b0) {
        l.f(abstractC12965b0, "type");
        return f26644a.mo7190w(abstractC12965b0);
    }
}
