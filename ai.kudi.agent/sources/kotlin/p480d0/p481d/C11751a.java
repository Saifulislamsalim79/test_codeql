package kotlin.p480d0.p481d;

import kotlin.e0.d.l;
import kotlin.p480d0.C11747a;
/* compiled from: JDK7PlatformImplementations.kt */
/* renamed from: kotlin.d0.d.a */
/* loaded from: classes3.dex */
public class C11751a extends C11747a {
    @Override // kotlin.p480d0.C11747a
    /* renamed from: a */
    public void mo10367a(Throwable th, Throwable th2) {
        l.f(th, "cause");
        l.f(th2, "exception");
        th.addSuppressed(th2);
    }
}
