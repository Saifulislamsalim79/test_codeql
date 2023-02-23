package kotlinx.coroutines.p562t2;

import j.e.i0.a;
import java.util.concurrent.CancellationException;
import kotlin.C11709c;
import kotlin.p476c0.InterfaceC11719g;
import kotlinx.coroutines.C13917j0;
/* compiled from: RxCancellable.kt */
/* renamed from: kotlinx.coroutines.t2.d */
/* loaded from: classes3.dex */
public final class C14063d {
    /* renamed from: a */
    public static final void m3149a(Throwable th, InterfaceC11719g interfaceC11719g) {
        if (th instanceof CancellationException) {
            return;
        }
        try {
            a.r(th);
        } catch (Throwable th2) {
            C11709c.m10411a(th, th2);
            C13917j0.m3410a(interfaceC11719g, th);
        }
    }
}
