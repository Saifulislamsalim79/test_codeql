package p201g.p259r;

import kotlin.C13291q;
import kotlin.C13666w;
import kotlin.c0.k.a.f;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.p477j.C11734d;
import kotlin.p476c0.p478k.p479a.AbstractC11745k;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlinx.coroutines.AbstractC13857h0;
import kotlinx.coroutines.C13864i;
import kotlinx.coroutines.InterfaceC13932m0;
/* compiled from: SuspendingPagingSourceFactory.kt */
/* renamed from: g.r.i1 */
/* loaded from: classes2.dex */
public final class C7902i1<Key, Value> implements InterfaceC11756a<AbstractC8041v0<Key, Value>> {

    /* renamed from: c */
    private final AbstractC13857h0 f18940c;

    /* renamed from: d */
    private final InterfaceC11756a<AbstractC8041v0<Key, Value>> f18941d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SuspendingPagingSourceFactory.kt */
    @f(c = "androidx.paging.SuspendingPagingSourceFactory$create$2", f = "SuspendingPagingSourceFactory.kt", l = {}, m = "invokeSuspend")
    /* renamed from: g.r.i1$a */
    /* loaded from: classes2.dex */
    public static final class C7903a extends AbstractC11745k implements InterfaceC11771p<InterfaceC13932m0, InterfaceC11714d<? super AbstractC8041v0<Key, Value>>, Object> {

        /* renamed from: c */
        int f18942c;

        /* renamed from: d */
        final /* synthetic */ C7902i1<Key, Value> f18943d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7903a(C7902i1<Key, Value> c7902i1, InterfaceC11714d<? super C7903a> interfaceC11714d) {
            super(2, interfaceC11714d);
            this.f18943d = c7902i1;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final InterfaceC11714d<C13666w> create(Object obj, InterfaceC11714d<?> interfaceC11714d) {
            return new C7903a(this.f18943d, interfaceC11714d);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11771p
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC13932m0 interfaceC13932m0, Object obj) {
            return invoke(interfaceC13932m0, (InterfaceC11714d) ((InterfaceC11714d) obj));
        }

        public final Object invoke(InterfaceC13932m0 interfaceC13932m0, InterfaceC11714d<? super AbstractC8041v0<Key, Value>> interfaceC11714d) {
            return ((C7903a) create(interfaceC13932m0, interfaceC11714d)).invokeSuspend(C13666w.f30112a);
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            C11734d.m10387d();
            if (this.f18942c == 0) {
                C13291q.m5357b(obj);
                return ((C7902i1) this.f18943d).f18941d.invoke();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: b */
    public final Object m17085b(InterfaceC11714d<? super AbstractC8041v0<Key, Value>> interfaceC11714d) {
        return C13864i.m3566c(this.f18940c, new C7903a(this, null), interfaceC11714d);
    }

    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    /* renamed from: c */
    public AbstractC8041v0<Key, Value> invoke() {
        return this.f18941d.invoke();
    }
}
