package kotlinx.coroutines.flow.internal;

import kotlin.p476c0.C11725h;
import kotlin.p476c0.InterfaceC11719g;
import kotlinx.coroutines.channels.EnumC13778e;
import kotlinx.coroutines.p559q2.InterfaceC13964d;
/* compiled from: ChannelFlow.kt */
/* renamed from: kotlinx.coroutines.flow.internal.m */
/* loaded from: classes3.dex */
public interface InterfaceC13837m<T> extends InterfaceC13964d<T> {

    /* compiled from: ChannelFlow.kt */
    /* renamed from: kotlinx.coroutines.flow.internal.m$a */
    /* loaded from: classes3.dex */
    public static final class C13838a {
        /* renamed from: a */
        public static /* synthetic */ InterfaceC13964d m3589a(InterfaceC13837m interfaceC13837m, InterfaceC11719g interfaceC11719g, int i, EnumC13778e enumC13778e, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    interfaceC11719g = C11725h.f26446c;
                }
                if ((i2 & 2) != 0) {
                    i = -3;
                }
                if ((i2 & 4) != 0) {
                    enumC13778e = EnumC13778e.SUSPEND;
                }
                return interfaceC13837m.mo3233b(interfaceC11719g, i, enumC13778e);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
        }
    }

    /* renamed from: b */
    InterfaceC13964d<T> mo3233b(InterfaceC11719g interfaceC11719g, int i, EnumC13778e enumC13778e);
}
