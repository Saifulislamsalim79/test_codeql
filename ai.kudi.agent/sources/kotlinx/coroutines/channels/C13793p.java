package kotlinx.coroutines.channels;

import kotlin.C13666w;
import kotlin.p476c0.C11725h;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.InterfaceC11719g;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlinx.coroutines.C13853g0;
import kotlinx.coroutines.EnumC13940o0;
import kotlinx.coroutines.InterfaceC13932m0;
/* compiled from: Produce.kt */
/* renamed from: kotlinx.coroutines.channels.p */
/* loaded from: classes3.dex */
public final class C13793p {
    /* renamed from: a */
    public static final <E> InterfaceC13797t<E> m3658a(InterfaceC13932m0 interfaceC13932m0, InterfaceC11719g interfaceC11719g, int i, EnumC13778e enumC13778e, EnumC13940o0 enumC13940o0, InterfaceC11767l<? super Throwable, C13666w> interfaceC11767l, InterfaceC11771p<? super InterfaceC13795r<? super E>, ? super InterfaceC11714d<? super C13666w>, ? extends Object> interfaceC11771p) {
        C13794q c13794q = new C13794q(C13853g0.m3576c(interfaceC13932m0, interfaceC11719g), C13783i.m3686b(i, enumC13778e, null, 4, null));
        if (interfaceC11767l != null) {
            c13794q.mo3002u0(interfaceC11767l);
        }
        c13794q.m3748V0(enumC13940o0, c13794q, interfaceC11771p);
        return c13794q;
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC13797t m3657b(InterfaceC13932m0 interfaceC13932m0, InterfaceC11719g interfaceC11719g, int i, EnumC13778e enumC13778e, EnumC13940o0 enumC13940o0, InterfaceC11767l interfaceC11767l, InterfaceC11771p interfaceC11771p, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            interfaceC11719g = C11725h.f26446c;
        }
        InterfaceC11719g interfaceC11719g2 = interfaceC11719g;
        int i3 = (i2 & 2) != 0 ? 0 : i;
        if ((i2 & 4) != 0) {
            enumC13778e = EnumC13778e.SUSPEND;
        }
        EnumC13778e enumC13778e2 = enumC13778e;
        if ((i2 & 8) != 0) {
            enumC13940o0 = EnumC13940o0.DEFAULT;
        }
        EnumC13940o0 enumC13940o02 = enumC13940o0;
        if ((i2 & 16) != 0) {
            interfaceC11767l = null;
        }
        return m3658a(interfaceC13932m0, interfaceC11719g2, i3, enumC13778e2, enumC13940o02, interfaceC11767l, interfaceC11771p);
    }
}
