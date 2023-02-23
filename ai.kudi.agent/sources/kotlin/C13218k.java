package kotlin;

import ai.kudi.agent.wallettopup.WalletTopUpActivity;
import kotlin.p483e0.p484c.InterfaceC11756a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LazyJVM.kt */
/* renamed from: kotlin.k */
/* loaded from: classes3.dex */
public class C13218k {
    /* renamed from: a */
    public static <T> InterfaceC11824h<T> m5626a(EnumC13285m enumC13285m, InterfaceC11756a<? extends T> interfaceC11756a) {
        kotlin.e0.d.l.f(enumC13285m, WalletTopUpActivity.EXTRA_MODE);
        kotlin.e0.d.l.f(interfaceC11756a, "initializer");
        int i = C11831i.f26512a[enumC13285m.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return new C13667x(interfaceC11756a);
                }
                throw new NoWhenBranchMatchedException();
            }
            return new C13292r(interfaceC11756a);
        }
        return new C13662s(interfaceC11756a, null, 2, null);
    }

    /* renamed from: b */
    public static <T> InterfaceC11824h<T> m5625b(InterfaceC11756a<? extends T> interfaceC11756a) {
        kotlin.e0.d.l.f(interfaceC11756a, "initializer");
        return new C13662s(interfaceC11756a, null, 2, null);
    }
}
