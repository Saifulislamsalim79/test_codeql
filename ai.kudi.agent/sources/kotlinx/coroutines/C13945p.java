package kotlinx.coroutines;

import kotlin.p476c0.InterfaceC11714d;
import kotlinx.coroutines.internal.C13881f;
import kotlinx.coroutines.internal.C13897n;
/* compiled from: CancellableContinuation.kt */
/* renamed from: kotlinx.coroutines.p */
/* loaded from: classes3.dex */
public final class C13945p {
    /* renamed from: a */
    public static final void m3356a(InterfaceC13930m<?> interfaceC13930m, InterfaceC14110y0 interfaceC14110y0) {
        interfaceC13930m.mo3377i(new C14113z0(interfaceC14110y0));
    }

    /* renamed from: b */
    public static final <T> C13935n<T> m3355b(InterfaceC11714d<? super T> interfaceC11714d) {
        if (!(interfaceC11714d instanceof C13881f)) {
            return new C13935n<>(interfaceC11714d, 1);
        }
        C13935n<T> m3525o = ((C13881f) interfaceC11714d).m3525o();
        if (m3525o == null || !m3525o.m3385K()) {
            m3525o = null;
        }
        return m3525o == null ? new C13935n<>(interfaceC11714d, 2) : m3525o;
    }

    /* renamed from: c */
    public static final void m3354c(InterfaceC13930m<?> interfaceC13930m, C13897n c13897n) {
        interfaceC13930m.mo3377i(new C13808d2(c13897n));
    }
}
