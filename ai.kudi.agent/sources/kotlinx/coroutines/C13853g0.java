package kotlinx.coroutines;

import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.InterfaceC11715e;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p476c0.p478k.p479a.InterfaceC11739e;
import kotlinx.coroutines.p563u2.C14074b;
/* compiled from: CoroutineContext.kt */
/* renamed from: kotlinx.coroutines.g0 */
/* loaded from: classes3.dex */
public final class C13853g0 {

    /* renamed from: a */
    private static final boolean f30330a;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
        if (r0.equals("on") != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
        if (r0.equals("") != false) goto L21;
     */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.scheduler"
            java.lang.String r0 = kotlinx.coroutines.internal.C13915z.m3417d(r0)
            if (r0 == 0) goto L53
            int r1 = r0.hashCode()
            if (r1 == 0) goto L2a
            r2 = 3551(0xddf, float:4.976E-42)
            if (r1 == r2) goto L21
            r2 = 109935(0x1ad6f, float:1.54052E-40)
            if (r1 != r2) goto L33
            java.lang.String r1 = "off"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L33
            r0 = 0
            goto L54
        L21:
            java.lang.String r1 = "on"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L33
            goto L53
        L2a:
            java.lang.String r1 = ""
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L33
            goto L53
        L33:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "System property 'kotlinx.coroutines.scheduler' has unrecognized value '"
            r1.append(r2)
            r1.append(r0)
            r0 = 39
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L53:
            r0 = 1
        L54:
            kotlinx.coroutines.C13853g0.f30330a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C13853g0.<clinit>():void");
    }

    /* renamed from: a */
    public static final AbstractC13857h0 m3578a() {
        return f30330a ? C14074b.f30696y : C14086v.f30725d;
    }

    /* renamed from: b */
    public static final String m3577b(InterfaceC11719g interfaceC11719g) {
        C13921k0 c13921k0;
        String m3400o0;
        if (C13952q0.m3343c() && (c13921k0 = (C13921k0) interfaceC11719g.get(C13921k0.f30406d)) != null) {
            C13926l0 c13926l0 = (C13926l0) interfaceC11719g.get(C13926l0.f30410d);
            String str = "coroutine";
            if (c13926l0 != null && (m3400o0 = c13926l0.m3400o0()) != null) {
                str = m3400o0;
            }
            return str + '#' + c13921k0.m3405o0();
        }
        return null;
    }

    /* renamed from: c */
    public static final InterfaceC11719g m3576c(InterfaceC13932m0 interfaceC13932m0, InterfaceC11719g interfaceC11719g) {
        InterfaceC11719g plus = interfaceC13932m0.mo3397o0().plus(interfaceC11719g);
        InterfaceC11719g plus2 = C13952q0.m3343c() ? plus.plus(new C13921k0(C13952q0.m3344b().incrementAndGet())) : plus;
        return (plus == C14107x0.m2946a() || plus.get(InterfaceC11715e.f26443r) != null) ? plus2 : plus2.plus(C14107x0.m2946a());
    }

    /* renamed from: d */
    public static final C13934m2<?> m3575d(InterfaceC11739e interfaceC11739e) {
        while (!(interfaceC11739e instanceof C14068u0) && (interfaceC11739e = interfaceC11739e.getCallerFrame()) != null) {
            if (interfaceC11739e instanceof C13934m2) {
                return (C13934m2) interfaceC11739e;
            }
        }
        return null;
    }

    /* renamed from: e */
    public static final C13934m2<?> m3574e(InterfaceC11714d<?> interfaceC11714d, InterfaceC11719g interfaceC11719g, Object obj) {
        if (interfaceC11714d instanceof InterfaceC11739e) {
            if (interfaceC11719g.get(C13938n2.f30424c) != null) {
                C13934m2<?> m3575d = m3575d((InterfaceC11739e) interfaceC11714d);
                if (m3575d != null) {
                    m3575d.m3395Y0(interfaceC11719g, obj);
                }
                return m3575d;
            }
            return null;
        }
        return null;
    }
}
