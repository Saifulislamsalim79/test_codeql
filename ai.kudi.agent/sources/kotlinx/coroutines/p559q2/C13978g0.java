package kotlinx.coroutines.p559q2;

import ai.kudi.agent.kshock.p009ui.KShockActivity;
import ai.kudi.agent.settings.dataSource.KycLevelRemoteDataSource;
import kotlin.p476c0.InterfaceC11719g;
import kotlinx.coroutines.C13952q0;
import kotlinx.coroutines.channels.EnumC13778e;
import kotlinx.coroutines.flow.internal.C13841p;
import kotlinx.coroutines.internal.C13914y;
/* compiled from: StateFlow.kt */
/* renamed from: kotlinx.coroutines.q2.g0 */
/* loaded from: classes3.dex */
public final class C13978g0 {

    /* renamed from: a */
    private static final C13914y f30492a = new C13914y(KycLevelRemoteDataSource.NONE);

    /* renamed from: b */
    private static final C13914y f30493b = new C13914y(KShockActivity.PAYBACK_PENDING);

    /* renamed from: a */
    public static final <T> InterfaceC14022s<T> m3302a(T t) {
        if (t == null) {
            t = (T) C13841p.f30311a;
        }
        return new C13972f0(t);
    }

    /* renamed from: d */
    public static final <T> InterfaceC13964d<T> m3299d(InterfaceC13970e0<? extends T> interfaceC13970e0, InterfaceC11719g interfaceC11719g, int i, EnumC13778e enumC13778e) {
        boolean z = true;
        if (C13952q0.m3345a()) {
            if (!(i != -1)) {
                throw new AssertionError();
            }
        }
        return ((((i < 0 || i > 1) ? false : false) || i == -2) && enumC13778e == EnumC13778e.DROP_OLDEST) ? interfaceC13970e0 : C14030x.m3212e(interfaceC13970e0, interfaceC11719g, i, enumC13778e);
    }

    /* renamed from: e */
    public static final void m3298e(InterfaceC14022s<Integer> interfaceC14022s, int i) {
        Integer value;
        do {
            value = interfaceC14022s.getValue();
        } while (!interfaceC14022s.mo3257c(value, Integer.valueOf(value.intValue() + i)));
    }
}
