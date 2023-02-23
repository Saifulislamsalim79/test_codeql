package kotlinx.coroutines.flow.internal;

import kotlin.C13666w;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p483e0.p484c.InterfaceC11772q;
import kotlin.p483e0.p485d.C11782b0;
import kotlin.p483e0.p485d.C11800j;
import kotlinx.coroutines.p559q2.InterfaceC13969e;
/* compiled from: SafeCollector.kt */
/* renamed from: kotlinx.coroutines.flow.internal.r */
/* loaded from: classes3.dex */
public final class C13844r {

    /* renamed from: a */
    private static final InterfaceC11772q<InterfaceC13969e<Object>, Object, InterfaceC11714d<? super C13666w>, Object> f30318a;

    /* compiled from: SafeCollector.kt */
    /* renamed from: kotlinx.coroutines.flow.internal.r$a */
    /* loaded from: classes3.dex */
    /* synthetic */ class C13845a extends C11800j implements InterfaceC11772q<InterfaceC13969e<? super Object>, Object, C13666w> {

        /* renamed from: B */
        public static final C13845a f30319B = new C13845a();

        C13845a() {
            super(3, InterfaceC13969e.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11772q
        /* renamed from: l */
        public final Object invoke(InterfaceC13969e<Object> interfaceC13969e, Object obj, InterfaceC11714d<? super C13666w> interfaceC11714d) {
            return interfaceC13969e.emit(obj, interfaceC11714d);
        }
    }

    static {
        C13845a c13845a = C13845a.f30319B;
        C11782b0.m10345f(c13845a, 3);
        f30318a = c13845a;
    }

    /* renamed from: a */
    public static final /* synthetic */ InterfaceC11772q m3584a() {
        return f30318a;
    }
}
