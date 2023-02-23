package kotlinx.coroutines;

import kotlin.C13666w;
import kotlin.p476c0.AbstractC11710a;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p549l0.C13265j;
/* compiled from: CoroutineContext.kt */
/* renamed from: kotlinx.coroutines.k0 */
/* loaded from: classes3.dex */
public final class C13921k0 extends AbstractC11710a implements InterfaceC13919j2<String> {

    /* renamed from: d */
    public static final C13922a f30406d = new C13922a(null);

    /* renamed from: c */
    private final long f30407c;

    /* compiled from: CoroutineContext.kt */
    /* renamed from: kotlinx.coroutines.k0$a */
    /* loaded from: classes3.dex */
    public static final class C13922a implements InterfaceC11719g.InterfaceC11724c<C13921k0> {
        private C13922a() {
        }

        public /* synthetic */ C13922a(kotlin.e0.d.g gVar) {
            this();
        }
    }

    public C13921k0(long j) {
        super(f30406d);
        this.f30407c = j;
    }

    @Override // kotlinx.coroutines.InterfaceC13919j2
    /* renamed from: F0 */
    public void mo3404w0(InterfaceC11719g interfaceC11719g, String str) {
        Thread.currentThread().setName(str);
    }

    @Override // kotlinx.coroutines.InterfaceC13919j2
    /* renamed from: H0 */
    public String mo3408D0(InterfaceC11719g interfaceC11719g) {
        String m3400o0;
        C13926l0 c13926l0 = (C13926l0) interfaceC11719g.get(C13926l0.f30410d);
        String str = "coroutine";
        if (c13926l0 != null && (m3400o0 = c13926l0.m3400o0()) != null) {
            str = m3400o0;
        }
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        int m5486b0 = C13265j.m5486b0(name, " @", 0, false, 6, null);
        if (m5486b0 < 0) {
            m5486b0 = name.length();
        }
        StringBuilder sb = new StringBuilder(str.length() + m5486b0 + 10);
        if (name != null) {
            String substring = name.substring(0, m5486b0);
            kotlin.e0.d.l.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            sb.append(substring);
            sb.append(" @");
            sb.append(str);
            sb.append('#');
            sb.append(m3405o0());
            C13666w c13666w = C13666w.f30112a;
            String sb2 = sb.toString();
            kotlin.e0.d.l.e(sb2, "StringBuilder(capacity).…builderAction).toString()");
            currentThread.setName(sb2);
            return name;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C13921k0) && this.f30407c == ((C13921k0) obj).f30407c;
    }

    public int hashCode() {
        return d.a(this.f30407c);
    }

    /* renamed from: o0 */
    public final long m3405o0() {
        return this.f30407c;
    }

    public String toString() {
        return "CoroutineId(" + this.f30407c + ')';
    }
}
