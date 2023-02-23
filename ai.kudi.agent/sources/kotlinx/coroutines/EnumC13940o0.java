package kotlinx.coroutines;

import kotlin.NoWhenBranchMatchedException;
import kotlin.p476c0.C11718f;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlinx.coroutines.p560r2.C14036a;
import kotlinx.coroutines.p560r2.C14037b;
/* compiled from: CoroutineStart.kt */
/* renamed from: kotlinx.coroutines.o0 */
/* loaded from: classes3.dex */
public enum EnumC13940o0 {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    /* compiled from: CoroutineStart.kt */
    /* renamed from: kotlinx.coroutines.o0$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C13941a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f30431a;

        static {
            int[] iArr = new int[EnumC13940o0.values().length];
            iArr[EnumC13940o0.DEFAULT.ordinal()] = 1;
            iArr[EnumC13940o0.ATOMIC.ordinal()] = 2;
            iArr[EnumC13940o0.UNDISPATCHED.ordinal()] = 3;
            iArr[EnumC13940o0.LAZY.ordinal()] = 4;
            f30431a = iArr;
        }
    }

    /* renamed from: b */
    public final <R, T> void m3358b(InterfaceC11771p<? super R, ? super InterfaceC11714d<? super T>, ? extends Object> interfaceC11771p, R r, InterfaceC11714d<? super T> interfaceC11714d) {
        int i = C13941a.f30431a[ordinal()];
        if (i == 1) {
            C14036a.m3195f(interfaceC11771p, r, interfaceC11714d, null, 4, null);
        } else if (i == 2) {
            C11718f.m10402a(interfaceC11771p, r, interfaceC11714d);
        } else if (i == 3) {
            C14037b.m3194a(interfaceC11771p, r, interfaceC11714d);
        } else if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: e */
    public final boolean m3357e() {
        return this == LAZY;
    }
}
