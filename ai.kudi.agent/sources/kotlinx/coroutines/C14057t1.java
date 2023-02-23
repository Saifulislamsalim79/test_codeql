package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.p476c0.InterfaceC11719g;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Job.kt */
/* renamed from: kotlinx.coroutines.t1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class C14057t1 {
    /* renamed from: a */
    public static final InterfaceC14112z m3161a(InterfaceC13947p1 interfaceC13947p1) {
        return new C14035r1(interfaceC13947p1);
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC14112z m3160b(InterfaceC13947p1 interfaceC13947p1, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC13947p1 = null;
        }
        return C14040s1.m3187a(interfaceC13947p1);
    }

    /* renamed from: c */
    public static final void m3159c(InterfaceC11719g interfaceC11719g, CancellationException cancellationException) {
        InterfaceC13947p1 interfaceC13947p1 = (InterfaceC13947p1) interfaceC11719g.get(InterfaceC13947p1.f30435u);
        if (interfaceC13947p1 == null) {
            return;
        }
        interfaceC13947p1.mo3015m(cancellationException);
    }

    /* renamed from: d */
    public static /* synthetic */ void m3158d(InterfaceC11719g interfaceC11719g, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        C14040s1.m3185c(interfaceC11719g, cancellationException);
    }

    /* renamed from: e */
    public static final void m3157e(InterfaceC11719g interfaceC11719g) {
        InterfaceC13947p1 interfaceC13947p1 = (InterfaceC13947p1) interfaceC11719g.get(InterfaceC13947p1.f30435u);
        if (interfaceC13947p1 == null) {
            return;
        }
        C14040s1.m3182f(interfaceC13947p1);
    }

    /* renamed from: f */
    public static final void m3156f(InterfaceC13947p1 interfaceC13947p1) {
        if (!interfaceC13947p1.isActive()) {
            throw interfaceC13947p1.mo3025X();
        }
    }
}
