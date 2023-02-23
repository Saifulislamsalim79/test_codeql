package kotlinx.coroutines.internal;

import kotlin.p476c0.InterfaceC11719g;
import kotlinx.coroutines.InterfaceC13932m0;
/* compiled from: Scopes.kt */
/* renamed from: kotlinx.coroutines.internal.e */
/* loaded from: classes3.dex */
public final class C13879e implements InterfaceC13932m0 {

    /* renamed from: c */
    private final InterfaceC11719g f30351c;

    public C13879e(InterfaceC11719g interfaceC11719g) {
        this.f30351c = interfaceC11719g;
    }

    @Override // kotlinx.coroutines.InterfaceC13932m0
    /* renamed from: o0 */
    public InterfaceC11719g mo3397o0() {
        return this.f30351c;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + mo3397o0() + ')';
    }
}
