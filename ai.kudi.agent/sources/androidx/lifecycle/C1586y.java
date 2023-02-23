package androidx.lifecycle;

import androidx.lifecycle.AbstractC1565i;
import kotlin.C13291q;
import kotlin.C13666w;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.p477j.C11734d;
import kotlin.p476c0.p478k.p479a.AbstractC11745k;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlinx.coroutines.C13864i;
import kotlinx.coroutines.C14107x0;
import kotlinx.coroutines.InterfaceC13932m0;
import kotlinx.coroutines.InterfaceC13947p1;
/* compiled from: PausingDispatcher.kt */
/* renamed from: androidx.lifecycle.y */
/* loaded from: classes2.dex */
public final class C1586y {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PausingDispatcher.kt */
    @kotlin.c0.k.a.f(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.kt", l = {162}, m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.y$a */
    /* loaded from: classes2.dex */
    public static final class C1587a extends AbstractC11745k implements InterfaceC11771p<InterfaceC13932m0, InterfaceC11714d<? super T>, Object> {

        /* renamed from: c */
        private /* synthetic */ Object f4793c;

        /* renamed from: d */
        int f4794d;

        /* renamed from: e */
        final /* synthetic */ AbstractC1565i f4795e;

        /* renamed from: f */
        final /* synthetic */ AbstractC1565i.c f4796f;

        /* renamed from: w */
        final /* synthetic */ InterfaceC11771p f4797w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1587a(AbstractC1565i abstractC1565i, AbstractC1565i.c cVar, InterfaceC11771p interfaceC11771p, InterfaceC11714d interfaceC11714d) {
            super(2, interfaceC11714d);
            this.f4795e = abstractC1565i;
            this.f4796f = cVar;
            this.f4797w = interfaceC11771p;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final InterfaceC11714d<C13666w> create(Object obj, InterfaceC11714d<?> interfaceC11714d) {
            kotlin.e0.d.l.f(interfaceC11714d, "completion");
            C1587a c1587a = new C1587a(this.f4795e, this.f4796f, this.f4797w, interfaceC11714d);
            c1587a.f4793c = obj;
            return c1587a;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11771p
        public final Object invoke(InterfaceC13932m0 interfaceC13932m0, Object obj) {
            return ((C1587a) create(interfaceC13932m0, (InterfaceC11714d) obj)).invokeSuspend(C13666w.f30112a);
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            Object m10387d;
            LifecycleController lifecycleController;
            m10387d = C11734d.m10387d();
            int i = this.f4794d;
            if (i == 0) {
                C13291q.m5357b(obj);
                InterfaceC13947p1 interfaceC13947p1 = (InterfaceC13947p1) ((InterfaceC13932m0) this.f4793c).mo3397o0().get(InterfaceC13947p1.f30435u);
                if (interfaceC13947p1 != null) {
                    C1585x c1585x = new C1585x();
                    LifecycleController lifecycleController2 = new LifecycleController(this.f4795e, this.f4796f, c1585x.f4792d, interfaceC13947p1);
                    try {
                        InterfaceC11771p interfaceC11771p = this.f4797w;
                        this.f4793c = lifecycleController2;
                        this.f4794d = 1;
                        obj = C13864i.m3566c(c1585x, interfaceC11771p, this);
                        if (obj == m10387d) {
                            return m10387d;
                        }
                        lifecycleController = lifecycleController2;
                    } catch (Throwable th) {
                        th = th;
                        lifecycleController = lifecycleController2;
                        lifecycleController.m35581c();
                        throw th;
                    }
                } else {
                    throw new IllegalStateException("when[State] methods should have a parent job".toString());
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                lifecycleController = (LifecycleController) this.f4793c;
                try {
                    C13291q.m5357b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    lifecycleController.m35581c();
                    throw th;
                }
            }
            lifecycleController.m35581c();
            return obj;
        }
    }

    /* renamed from: a */
    public static final <T> Object m35480a(AbstractC1565i abstractC1565i, InterfaceC11771p<? super InterfaceC13932m0, ? super InterfaceC11714d<? super T>, ? extends Object> interfaceC11771p, InterfaceC11714d<? super T> interfaceC11714d) {
        return m35479b(abstractC1565i, AbstractC1565i.c.w, interfaceC11771p, interfaceC11714d);
    }

    /* renamed from: b */
    public static final <T> Object m35479b(AbstractC1565i abstractC1565i, AbstractC1565i.c cVar, InterfaceC11771p<? super InterfaceC13932m0, ? super InterfaceC11714d<? super T>, ? extends Object> interfaceC11771p, InterfaceC11714d<? super T> interfaceC11714d) {
        return C13864i.m3566c(C14107x0.m2944c().mo2938J0(), new C1587a(abstractC1565i, cVar, interfaceC11771p, null), interfaceC11714d);
    }
}
