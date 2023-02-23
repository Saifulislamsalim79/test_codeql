package p201g.p259r;

import kotlin.C13291q;
import kotlin.C13666w;
import kotlin.c0.k.a.f;
import kotlin.e0.d.l;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.p477j.C11734d;
import kotlin.p476c0.p478k.p479a.AbstractC11745k;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlinx.coroutines.InterfaceC13947p1;
import kotlinx.coroutines.channels.InterfaceC13801x;
import kotlinx.coroutines.p559q2.InterfaceC13964d;
/* compiled from: CancelableChannelFlow.kt */
/* renamed from: g.r.g */
/* loaded from: classes2.dex */
public final class C7882g {

    /* compiled from: CancelableChannelFlow.kt */
    @f(c = "androidx.paging.CancelableChannelFlowKt$cancelableChannelFlow$1", f = "CancelableChannelFlow.kt", l = {30}, m = "invokeSuspend")
    /* renamed from: g.r.g$a */
    /* loaded from: classes2.dex */
    static final class C7883a extends AbstractC11745k implements InterfaceC11771p<InterfaceC7881f1<T>, InterfaceC11714d<? super C13666w>, Object> {

        /* renamed from: c */
        int f18879c;

        /* renamed from: d */
        private /* synthetic */ Object f18880d;

        /* renamed from: e */
        final /* synthetic */ InterfaceC13947p1 f18881e;

        /* renamed from: f */
        final /* synthetic */ InterfaceC11771p<InterfaceC7881f1<T>, InterfaceC11714d<? super C13666w>, Object> f18882f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CancelableChannelFlow.kt */
        /* renamed from: g.r.g$a$a */
        /* loaded from: classes2.dex */
        public static final class C7884a extends AbstractC11802m implements InterfaceC11767l<Throwable, C13666w> {

            /* renamed from: c */
            final /* synthetic */ InterfaceC7881f1<T> f18883c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C7884a(InterfaceC7881f1<T> interfaceC7881f1) {
                super(1);
                this.f18883c = interfaceC7881f1;
            }

            @Override // kotlin.p483e0.p484c.InterfaceC11767l
            public /* bridge */ /* synthetic */ C13666w invoke(Throwable th) {
                invoke2(th);
                return C13666w.f30112a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                InterfaceC13801x.C13802a.m3638a(this.f18883c, null, 1, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C7883a(InterfaceC13947p1 interfaceC13947p1, InterfaceC11771p<? super InterfaceC7881f1<T>, ? super InterfaceC11714d<? super C13666w>, ? extends Object> interfaceC11771p, InterfaceC11714d<? super C7883a> interfaceC11714d) {
            super(2, interfaceC11714d);
            this.f18881e = interfaceC13947p1;
            this.f18882f = interfaceC11771p;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final InterfaceC11714d<C13666w> create(Object obj, InterfaceC11714d<?> interfaceC11714d) {
            C7883a c7883a = new C7883a(this.f18881e, this.f18882f, interfaceC11714d);
            c7883a.f18880d = obj;
            return c7883a;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            Object m10387d;
            m10387d = C11734d.m10387d();
            int i = this.f18879c;
            if (i == 0) {
                C13291q.m5357b(obj);
                InterfaceC7881f1 interfaceC7881f1 = (InterfaceC7881f1) this.f18880d;
                this.f18881e.mo3002u0(new C7884a(interfaceC7881f1));
                InterfaceC11771p<InterfaceC7881f1<T>, InterfaceC11714d<? super C13666w>, Object> interfaceC11771p = this.f18882f;
                this.f18879c = 1;
                if (interfaceC11771p.invoke(interfaceC7881f1, this) == m10387d) {
                    return m10387d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13291q.m5357b(obj);
            }
            return C13666w.f30112a;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11771p
        /* renamed from: m */
        public final Object invoke(InterfaceC7881f1<T> interfaceC7881f1, InterfaceC11714d<? super C13666w> interfaceC11714d) {
            return ((C7883a) create(interfaceC7881f1, interfaceC11714d)).invokeSuspend(C13666w.f30112a);
        }
    }

    /* renamed from: a */
    public static final <T> InterfaceC13964d<T> m17113a(InterfaceC13947p1 interfaceC13947p1, InterfaceC11771p<? super InterfaceC7881f1<T>, ? super InterfaceC11714d<? super C13666w>, ? extends Object> interfaceC11771p) {
        l.f(interfaceC13947p1, "controller");
        l.f(interfaceC11771p, "block");
        return C7867e1.m17123a(new C7883a(interfaceC13947p1, interfaceC11771p, null));
    }
}
