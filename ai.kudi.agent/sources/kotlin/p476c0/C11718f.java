package kotlin.p476c0;

import kotlin.C13288p;
import kotlin.C13666w;
import kotlin.e0.d.l;
import kotlin.p476c0.p477j.C11729c;
import kotlin.p483e0.p484c.InterfaceC11771p;
/* compiled from: Continuation.kt */
/* renamed from: kotlin.c0.f */
/* loaded from: classes3.dex */
public final class C11718f {
    /* renamed from: a */
    public static final <R, T> void m10402a(InterfaceC11771p<? super R, ? super InterfaceC11714d<? super T>, ? extends Object> interfaceC11771p, R r, InterfaceC11714d<? super T> interfaceC11714d) {
        InterfaceC11714d<C13666w> m10389b;
        InterfaceC11714d m10388c;
        l.f(interfaceC11771p, "$this$startCoroutine");
        l.f(interfaceC11714d, "completion");
        m10389b = C11729c.m10389b(interfaceC11771p, r, interfaceC11714d);
        m10388c = C11729c.m10388c(m10389b);
        C13666w c13666w = C13666w.f30112a;
        C13288p.C13289a c13289a = C13288p.f29444c;
        C13288p.m5362a(c13666w);
        m10388c.resumeWith(c13666w);
    }
}
