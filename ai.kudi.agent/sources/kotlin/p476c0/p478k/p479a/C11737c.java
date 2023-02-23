package kotlin.p476c0.p478k.p479a;

import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.InterfaceC11719g;
/* compiled from: ContinuationImpl.kt */
/* renamed from: kotlin.c0.k.a.c */
/* loaded from: classes3.dex */
public final class C11737c implements InterfaceC11714d<Object> {

    /* renamed from: c */
    public static final C11737c f26463c = new C11737c();

    private C11737c() {
    }

    @Override // kotlin.p476c0.InterfaceC11714d
    public InterfaceC11719g getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // kotlin.p476c0.InterfaceC11714d
    public void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
