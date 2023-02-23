package kotlinx.coroutines.channels;

import kotlin.C13666w;
import kotlin.p476c0.InterfaceC11714d;
/* compiled from: Channel.kt */
/* renamed from: kotlinx.coroutines.channels.x */
/* loaded from: classes3.dex */
public interface InterfaceC13801x<E> {

    /* compiled from: Channel.kt */
    /* renamed from: kotlinx.coroutines.channels.x$a */
    /* loaded from: classes3.dex */
    public static final class C13802a {
        /* renamed from: a */
        public static /* synthetic */ boolean m3638a(InterfaceC13801x interfaceC13801x, Throwable th, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    th = null;
                }
                return interfaceC13801x.mo3641f(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
        }
    }

    /* renamed from: f */
    boolean mo3641f(Throwable th);

    /* renamed from: k */
    Object mo3640k(E e);

    /* renamed from: o */
    Object mo3639o(E e, InterfaceC11714d<? super C13666w> interfaceC11714d);
}
