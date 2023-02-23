package p201g.p259r;

import kotlin.C13291q;
import kotlin.C13666w;
import kotlin.c0.k.a.f;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.p477j.C11734d;
import kotlin.p476c0.p478k.p479a.AbstractC11745k;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p484c.InterfaceC11772q;
import kotlinx.coroutines.InterfaceC13932m0;
import kotlinx.coroutines.p559q2.C13971f;
import kotlinx.coroutines.p559q2.InterfaceC13969e;
import p201g.p259r.InterfaceC7832c;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CachedPagingData.kt */
/* renamed from: g.r.c0 */
/* loaded from: classes2.dex */
public final class C7834c0<T> {

    /* renamed from: a */
    private final InterfaceC13932m0 f18709a;

    /* renamed from: b */
    private final C8013r0<T> f18710b;

    /* renamed from: c */
    private final InterfaceC7832c f18711c;

    /* renamed from: d */
    private final C7855e<T> f18712d;

    /* compiled from: CachedPagingData.kt */
    @f(c = "androidx.paging.MulticastedPagingData$accumulated$1", f = "CachedPagingData.kt", l = {44}, m = "invokeSuspend")
    /* renamed from: g.r.c0$a */
    /* loaded from: classes2.dex */
    static final class C7835a extends AbstractC11745k implements InterfaceC11771p<InterfaceC13969e<? super AbstractC7905j0<T>>, InterfaceC11714d<? super C13666w>, Object> {

        /* renamed from: c */
        int f18713c;

        /* renamed from: d */
        final /* synthetic */ C7834c0<T> f18714d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7835a(C7834c0<T> c7834c0, InterfaceC11714d<? super C7835a> interfaceC11714d) {
            super(2, interfaceC11714d);
            this.f18714d = c7834c0;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final InterfaceC11714d<C13666w> create(Object obj, InterfaceC11714d<?> interfaceC11714d) {
            return new C7835a(this.f18714d, interfaceC11714d);
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            Object m10387d;
            m10387d = C11734d.m10387d();
            int i = this.f18713c;
            if (i == 0) {
                C13291q.m5357b(obj);
                InterfaceC7832c m17204c = this.f18714d.m17204c();
                if (m17204c != null) {
                    InterfaceC7832c.EnumC7833a enumC7833a = InterfaceC7832c.EnumC7833a.PAGE_EVENT_FLOW;
                    this.f18713c = 1;
                    if (m17204c.m17208b(enumC7833a, this) == m10387d) {
                        return m10387d;
                    }
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
        public final Object invoke(InterfaceC13969e<? super AbstractC7905j0<T>> interfaceC13969e, InterfaceC11714d<? super C13666w> interfaceC11714d) {
            return ((C7835a) create(interfaceC13969e, interfaceC11714d)).invokeSuspend(C13666w.f30112a);
        }
    }

    /* compiled from: CachedPagingData.kt */
    @f(c = "androidx.paging.MulticastedPagingData$accumulated$2", f = "CachedPagingData.kt", l = {46}, m = "invokeSuspend")
    /* renamed from: g.r.c0$b */
    /* loaded from: classes2.dex */
    static final class C7836b extends AbstractC11745k implements InterfaceC11772q<InterfaceC13969e<? super AbstractC7905j0<T>>, Throwable, InterfaceC11714d<? super C13666w>, Object> {

        /* renamed from: c */
        int f18715c;

        /* renamed from: d */
        final /* synthetic */ C7834c0<T> f18716d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7836b(C7834c0<T> c7834c0, InterfaceC11714d<? super C7836b> interfaceC11714d) {
            super(3, interfaceC11714d);
            this.f18716d = c7834c0;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            Object m10387d;
            m10387d = C11734d.m10387d();
            int i = this.f18715c;
            if (i == 0) {
                C13291q.m5357b(obj);
                InterfaceC7832c m17204c = this.f18716d.m17204c();
                if (m17204c != null) {
                    InterfaceC7832c.EnumC7833a enumC7833a = InterfaceC7832c.EnumC7833a.PAGE_EVENT_FLOW;
                    this.f18715c = 1;
                    if (m17204c.m17209a(enumC7833a, this) == m10387d) {
                        return m10387d;
                    }
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13291q.m5357b(obj);
            }
            return C13666w.f30112a;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11772q
        /* renamed from: m */
        public final Object invoke(InterfaceC13969e<? super AbstractC7905j0<T>> interfaceC13969e, Throwable th, InterfaceC11714d<? super C13666w> interfaceC11714d) {
            return new C7836b(this.f18716d, interfaceC11714d).invokeSuspend(C13666w.f30112a);
        }
    }

    public C7834c0(InterfaceC13932m0 interfaceC13932m0, C8013r0<T> c8013r0, InterfaceC7832c interfaceC7832c) {
        l.f(interfaceC13932m0, "scope");
        l.f(c8013r0, "parent");
        this.f18709a = interfaceC13932m0;
        this.f18710b = c8013r0;
        this.f18711c = interfaceC7832c;
        this.f18712d = new C7855e<>(C13971f.m3315s(C13971f.m3314t(c8013r0.m16897a(), new C7835a(this, null)), new C7836b(this, null)), this.f18709a);
    }

    /* renamed from: a */
    public final C8013r0<T> m17206a() {
        return new C8013r0<>(this.f18712d.m17131f(), this.f18710b.m16896b());
    }

    /* renamed from: b */
    public final Object m17205b(InterfaceC11714d<? super C13666w> interfaceC11714d) {
        this.f18712d.m17132e();
        return C13666w.f30112a;
    }

    /* renamed from: c */
    public final InterfaceC7832c m17204c() {
        return this.f18711c;
    }

    public /* synthetic */ C7834c0(InterfaceC13932m0 interfaceC13932m0, C8013r0 c8013r0, InterfaceC7832c interfaceC7832c, int i, g gVar) {
        this(interfaceC13932m0, c8013r0, (i & 4) != 0 ? null : interfaceC7832c);
    }
}
