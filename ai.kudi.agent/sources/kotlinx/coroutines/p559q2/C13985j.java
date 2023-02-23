package kotlinx.coroutines.p559q2;

import kotlin.e0.d.l;
import kotlinx.coroutines.channels.EnumC13778e;
import kotlinx.coroutines.flow.internal.C13826g;
import kotlinx.coroutines.flow.internal.InterfaceC13837m;
/* compiled from: Context.kt */
/* renamed from: kotlinx.coroutines.q2.j */
/* loaded from: classes3.dex */
public final /* synthetic */ class C13985j {
    /* renamed from: a */
    public static final <T> InterfaceC13964d<T> m3284a(InterfaceC13964d<? extends T> interfaceC13964d, int i, EnumC13778e enumC13778e) {
        int i2;
        EnumC13778e enumC13778e2;
        boolean z = true;
        if (i >= 0 || i == -2 || i == -1) {
            if (i == -1 && enumC13778e != EnumC13778e.SUSPEND) {
                z = false;
            }
            if (z) {
                if (i == -1) {
                    enumC13778e2 = EnumC13778e.DROP_OLDEST;
                    i2 = 0;
                } else {
                    i2 = i;
                    enumC13778e2 = enumC13778e;
                }
                return interfaceC13964d instanceof InterfaceC13837m ? InterfaceC13837m.C13838a.m3589a((InterfaceC13837m) interfaceC13964d, null, i2, enumC13778e2, 1, null) : new C13826g(interfaceC13964d, null, i2, enumC13778e2, 2, null);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
        throw new IllegalArgumentException(l.m("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ", Integer.valueOf(i)).toString());
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC13964d m3283b(InterfaceC13964d interfaceC13964d, int i, EnumC13778e enumC13778e, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -2;
        }
        if ((i2 & 2) != 0) {
            enumC13778e = EnumC13778e.SUSPEND;
        }
        return C13971f.m3332b(interfaceC13964d, i, enumC13778e);
    }

    /* renamed from: c */
    public static final <T> InterfaceC13964d<T> m3282c(InterfaceC13964d<? extends T> interfaceC13964d) {
        InterfaceC13964d<T> m3283b;
        m3283b = m3283b(interfaceC13964d, -1, null, 2, null);
        return m3283b;
    }
}
