package kotlinx.coroutines.p559q2;

import kotlin.e0.d.l;
import kotlin.p476c0.InterfaceC11719g;
import kotlinx.coroutines.channels.EnumC13778e;
import kotlinx.coroutines.flow.internal.C13826g;
import kotlinx.coroutines.internal.C13914y;
/* compiled from: SharedFlow.kt */
/* renamed from: kotlinx.coroutines.q2.x */
/* loaded from: classes3.dex */
public final class C14030x {

    /* renamed from: a */
    public static final C13914y f30609a = new C13914y("NO_VALUE");

    /* renamed from: a */
    public static final <T> InterfaceC14021r<T> m3216a(int i, int i2, EnumC13778e enumC13778e) {
        boolean z = true;
        if (i >= 0) {
            if (i2 >= 0) {
                if (i <= 0 && i2 <= 0 && enumC13778e != EnumC13778e.SUSPEND) {
                    z = false;
                }
                if (z) {
                    int i3 = i2 + i;
                    if (i3 < 0) {
                        i3 = Integer.MAX_VALUE;
                    }
                    return new C14026w(i, i3, enumC13778e);
                }
                throw new IllegalArgumentException(l.m("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ", enumC13778e).toString());
            }
            throw new IllegalArgumentException(l.m("extraBufferCapacity cannot be negative, but was ", Integer.valueOf(i2)).toString());
        }
        throw new IllegalArgumentException(l.m("replay cannot be negative, but was ", Integer.valueOf(i)).toString());
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC14021r m3215b(int i, int i2, EnumC13778e enumC13778e, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            enumC13778e = EnumC13778e.SUSPEND;
        }
        return m3216a(i, i2, enumC13778e);
    }

    /* renamed from: e */
    public static final <T> InterfaceC13964d<T> m3212e(InterfaceC14025v<? extends T> interfaceC14025v, InterfaceC11719g interfaceC11719g, int i, EnumC13778e enumC13778e) {
        return ((i == 0 || i == -3) && enumC13778e == EnumC13778e.SUSPEND) ? interfaceC14025v : new C13826g(interfaceC14025v, interfaceC11719g, i, enumC13778e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final Object m3211f(Object[] objArr, long j) {
        return objArr[(objArr.length - 1) & ((int) j)];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final void m3210g(Object[] objArr, long j, Object obj) {
        objArr[(objArr.length - 1) & ((int) j)] = obj;
    }
}
