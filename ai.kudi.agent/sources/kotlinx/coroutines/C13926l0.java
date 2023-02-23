package kotlinx.coroutines;

import kotlin.p476c0.AbstractC11710a;
import kotlin.p476c0.InterfaceC11719g;
/* compiled from: CoroutineName.kt */
/* renamed from: kotlinx.coroutines.l0 */
/* loaded from: classes3.dex */
public final class C13926l0 extends AbstractC11710a {

    /* renamed from: d */
    public static final C13927a f30410d = new C13927a(null);

    /* renamed from: c */
    private final String f30411c;

    /* compiled from: CoroutineName.kt */
    /* renamed from: kotlinx.coroutines.l0$a */
    /* loaded from: classes3.dex */
    public static final class C13927a implements InterfaceC11719g.InterfaceC11724c<C13926l0> {
        private C13927a() {
        }

        public /* synthetic */ C13927a(kotlin.e0.d.g gVar) {
            this();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C13926l0) && kotlin.e0.d.l.b(this.f30411c, ((C13926l0) obj).f30411c);
    }

    public int hashCode() {
        return this.f30411c.hashCode();
    }

    /* renamed from: o0 */
    public final String m3400o0() {
        return this.f30411c;
    }

    public String toString() {
        return "CoroutineName(" + this.f30411c + ')';
    }
}
