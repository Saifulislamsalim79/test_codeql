package kotlinx.coroutines;

import kotlin.C13666w;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p483e0.p484c.InterfaceC11767l;
/* compiled from: CancellableContinuation.kt */
/* renamed from: kotlinx.coroutines.m */
/* loaded from: classes3.dex */
public interface InterfaceC13930m<T> extends InterfaceC11714d<T> {

    /* compiled from: CancellableContinuation.kt */
    /* renamed from: kotlinx.coroutines.m$a */
    /* loaded from: classes3.dex */
    public static final class C13931a {
        /* renamed from: a */
        public static /* synthetic */ Object m3398a(InterfaceC13930m interfaceC13930m, Object obj, Object obj2, int i, Object obj3) {
            if (obj3 == null) {
                if ((i & 2) != 0) {
                    obj2 = null;
                }
                return interfaceC13930m.mo3378b(obj, obj2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryResume");
        }
    }

    /* renamed from: b */
    Object mo3378b(T t, Object obj);

    /* renamed from: i */
    void mo3377i(InterfaceC11767l<? super Throwable, C13666w> interfaceC11767l);

    /* renamed from: j */
    Object mo3376j(Throwable th);

    /* renamed from: l */
    Object mo3375l(T t, Object obj, InterfaceC11767l<? super Throwable, C13666w> interfaceC11767l);

    /* renamed from: n */
    void mo3373n(T t, InterfaceC11767l<? super Throwable, C13666w> interfaceC11767l);

    /* renamed from: p */
    void mo3371p(Object obj);
}
