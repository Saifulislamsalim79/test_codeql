package kotlinx.coroutines.channels;

import kotlin.C13666w;
import kotlin.p483e0.p484c.InterfaceC11767l;
/* compiled from: Channel.kt */
/* renamed from: kotlinx.coroutines.channels.i */
/* loaded from: classes3.dex */
public final class C13783i {
    /* renamed from: a */
    public static final <E> InterfaceC13779f<E> m3687a(int i, EnumC13778e enumC13778e, InterfaceC11767l<? super E, C13666w> interfaceC11767l) {
        if (i == -2) {
            return new C13776d(enumC13778e == EnumC13778e.SUSPEND ? InterfaceC13779f.f30245v.m3691a() : 1, enumC13778e, interfaceC11767l);
        } else if (i == -1) {
            if ((enumC13778e != EnumC13778e.SUSPEND ? 0 : 1) != 0) {
                return new C13791n(interfaceC11767l);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        } else if (i == 0) {
            if (enumC13778e == EnumC13778e.SUSPEND) {
                return new C13799v(interfaceC11767l);
            }
            return new C13776d(1, enumC13778e, interfaceC11767l);
        } else if (i != Integer.MAX_VALUE) {
            if (i == 1 && enumC13778e == EnumC13778e.DROP_OLDEST) {
                return new C13791n(interfaceC11767l);
            }
            return new C13776d(i, enumC13778e, interfaceC11767l);
        } else {
            return new C13792o(interfaceC11767l);
        }
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC13779f m3686b(int i, EnumC13778e enumC13778e, InterfaceC11767l interfaceC11767l, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            enumC13778e = EnumC13778e.SUSPEND;
        }
        if ((i2 & 4) != 0) {
            interfaceC11767l = null;
        }
        return m3687a(i, enumC13778e, interfaceC11767l);
    }
}
