package p201g.p259r;

import kotlin.C13291q;
import kotlin.C13666w;
import kotlin.c0.k.a.f;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.p477j.C11734d;
import kotlin.p476c0.p478k.p479a.AbstractC11745k;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.C11800j;
import kotlinx.coroutines.p559q2.InterfaceC13964d;
/* compiled from: Pager.kt */
/* renamed from: g.r.p0 */
/* loaded from: classes2.dex */
public final class C7998p0<Key, Value> {

    /* renamed from: a */
    private final InterfaceC13964d<C8013r0<Value>> f19262a;

    /* compiled from: Pager.kt */
    /* renamed from: g.r.p0$a */
    /* loaded from: classes2.dex */
    /* synthetic */ class C7999a extends C11800j implements InterfaceC11767l<AbstractC8041v0<Key, Value>> {
        C7999a(Object obj) {
            super(1, obj, C7902i1.class, "create", "create(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: l */
        public final Object invoke(InterfaceC11714d<? super AbstractC8041v0<Key, Value>> interfaceC11714d) {
            return ((C7902i1) this.f26478d).m17085b(interfaceC11714d);
        }
    }

    /* compiled from: Pager.kt */
    @f(c = "androidx.paging.Pager$flow$2", f = "Pager.kt", l = {}, m = "invokeSuspend")
    /* renamed from: g.r.p0$b */
    /* loaded from: classes2.dex */
    static final class C8000b extends AbstractC11745k implements InterfaceC11767l<InterfaceC11714d<? super AbstractC8041v0<Key, Value>>, Object> {

        /* renamed from: c */
        int f19263c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC11756a<AbstractC8041v0<Key, Value>> f19264d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C8000b(InterfaceC11756a<? extends AbstractC8041v0<Key, Value>> interfaceC11756a, InterfaceC11714d<? super C8000b> interfaceC11714d) {
            super(1, interfaceC11714d);
            this.f19264d = interfaceC11756a;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final InterfaceC11714d<C13666w> create(InterfaceC11714d<?> interfaceC11714d) {
            return new C8000b(this.f19264d, interfaceC11714d);
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            C11734d.m10387d();
            if (this.f19263c == 0) {
                C13291q.m5357b(obj);
                return this.f19264d.invoke();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: m */
        public final Object invoke(InterfaceC11714d<? super AbstractC8041v0<Key, Value>> interfaceC11714d) {
            return ((C8000b) create(interfaceC11714d)).invokeSuspend(C13666w.f30112a);
        }
    }

    public C7998p0(C8003q0 c8003q0, Key key, AbstractC8056x0<Key, Value> abstractC8056x0, InterfaceC11756a<? extends AbstractC8041v0<Key, Value>> interfaceC11756a) {
        InterfaceC11767l c8000b;
        l.f(c8003q0, "config");
        l.f(interfaceC11756a, "pagingSourceFactory");
        if (interfaceC11756a instanceof C7902i1) {
            c8000b = new C7999a(interfaceC11756a);
        } else {
            c8000b = new C8000b(interfaceC11756a, null);
        }
        this.f19262a = new C7916k0(c8000b, key, c8003q0, abstractC8056x0).m17046i();
    }

    /* renamed from: a */
    public final InterfaceC13964d<C8013r0<Value>> m16913a() {
        return this.f19262a;
    }

    public /* synthetic */ C7998p0(C8003q0 c8003q0, Object obj, InterfaceC11756a interfaceC11756a, int i, g gVar) {
        this(c8003q0, (i & 2) != 0 ? null : obj, interfaceC11756a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7998p0(C8003q0 c8003q0, Key key, InterfaceC11756a<? extends AbstractC8041v0<Key, Value>> interfaceC11756a) {
        this(c8003q0, key, null, interfaceC11756a);
        l.f(c8003q0, "config");
        l.f(interfaceC11756a, "pagingSourceFactory");
    }
}
