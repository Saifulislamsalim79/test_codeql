package androidx.lifecycle;

import kotlin.C13291q;
import kotlin.C13666w;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.p477j.C11734d;
import kotlin.p476c0.p478k.p479a.AbstractC11745k;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlinx.coroutines.C13864i;
import kotlinx.coroutines.InterfaceC13932m0;
import kotlinx.coroutines.InterfaceC13947p1;
/* compiled from: Lifecycle.kt */
/* renamed from: androidx.lifecycle.j */
/* loaded from: classes2.dex */
public abstract class AbstractC1567j implements InterfaceC13932m0 {

    /* compiled from: Lifecycle.kt */
    @kotlin.c0.k.a.f(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1", f = "Lifecycle.kt", l = {99}, m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.j$a */
    /* loaded from: classes2.dex */
    static final class C1568a extends AbstractC11745k implements InterfaceC11771p<InterfaceC13932m0, InterfaceC11714d<? super C13666w>, Object> {

        /* renamed from: c */
        int f4775c;

        /* renamed from: e */
        final /* synthetic */ InterfaceC11771p f4777e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1568a(InterfaceC11771p interfaceC11771p, InterfaceC11714d interfaceC11714d) {
            super(2, interfaceC11714d);
            this.f4777e = interfaceC11771p;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final InterfaceC11714d<C13666w> create(Object obj, InterfaceC11714d<?> interfaceC11714d) {
            kotlin.e0.d.l.f(interfaceC11714d, "completion");
            return new C1568a(this.f4777e, interfaceC11714d);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11771p
        public final Object invoke(InterfaceC13932m0 interfaceC13932m0, InterfaceC11714d<? super C13666w> interfaceC11714d) {
            return ((C1568a) create(interfaceC13932m0, interfaceC11714d)).invokeSuspend(C13666w.f30112a);
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            Object m10387d;
            m10387d = C11734d.m10387d();
            int i = this.f4775c;
            if (i == 0) {
                C13291q.m5357b(obj);
                AbstractC1565i mo35513a = AbstractC1567j.this.mo35513a();
                InterfaceC11771p interfaceC11771p = this.f4777e;
                this.f4775c = 1;
                if (C1586y.m35480a(mo35513a, interfaceC11771p, this) == m10387d) {
                    return m10387d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13291q.m5357b(obj);
            }
            return C13666w.f30112a;
        }
    }

    /* renamed from: a */
    public abstract AbstractC1565i mo35513a();

    /* renamed from: b */
    public final InterfaceC13947p1 m35512b(InterfaceC11771p<? super InterfaceC13932m0, ? super InterfaceC11714d<? super C13666w>, ? extends Object> interfaceC11771p) {
        kotlin.e0.d.l.f(interfaceC11771p, "block");
        return C13864i.m3567b(this, null, null, new C1568a(interfaceC11771p, null), 3, null);
    }
}
