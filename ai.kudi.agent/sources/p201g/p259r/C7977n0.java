package p201g.p259r;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C13291q;
import kotlin.C13666w;
import kotlin.NoWhenBranchMatchedException;
import kotlin.c0.k.a.f;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.p477j.C11734d;
import kotlin.p476c0.p478k.p479a.AbstractC11745k;
import kotlin.p476c0.p478k.p479a.C11736b;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p491i0.C11841h;
import kotlin.p557z.C13724q;
import kotlin.p557z.C13726r;
import kotlin.p557z.C13742z;
import kotlinx.coroutines.channels.C13783i;
import kotlinx.coroutines.channels.InterfaceC13779f;
import kotlinx.coroutines.p559q2.C13971f;
import kotlinx.coroutines.p559q2.InterfaceC13964d;
import kotlinx.coroutines.p559q2.InterfaceC13969e;
import kotlinx.coroutines.p564v2.C14102d;
import kotlinx.coroutines.p564v2.InterfaceC14094b;
import p201g.p259r.AbstractC7905j0;
import p201g.p259r.AbstractC7982n1;
import p201g.p259r.AbstractC8041v0;
import p201g.p259r.AbstractC8061y;
/* compiled from: PageFetcherSnapshotState.kt */
/* renamed from: g.r.n0 */
/* loaded from: classes2.dex */
public final class C7977n0<Key, Value> {

    /* renamed from: a */
    private final C8003q0 f19210a;

    /* renamed from: b */
    private final List<AbstractC8041v0.AbstractC8048b.C8050b<Key, Value>> f19211b;

    /* renamed from: c */
    private final List<AbstractC8041v0.AbstractC8048b.C8050b<Key, Value>> f19212c;

    /* renamed from: d */
    private int f19213d;

    /* renamed from: e */
    private int f19214e;

    /* renamed from: f */
    private int f19215f;

    /* renamed from: g */
    private int f19216g;

    /* renamed from: h */
    private int f19217h;

    /* renamed from: i */
    private final InterfaceC13779f<Integer> f19218i;

    /* renamed from: j */
    private final InterfaceC13779f<Integer> f19219j;

    /* renamed from: k */
    private final Map<EnumC7830b0, AbstractC7982n1> f19220k;

    /* renamed from: l */
    private C7865e0 f19221l;

    /* compiled from: PageFetcherSnapshotState.kt */
    /* renamed from: g.r.n0$a */
    /* loaded from: classes2.dex */
    public static final class C7978a<Key, Value> {

        /* renamed from: a */
        private final C8003q0 f19222a;

        /* renamed from: b */
        private final InterfaceC14094b f19223b;

        /* renamed from: c */
        private final C7977n0<Key, Value> f19224c;

        public C7978a(C8003q0 c8003q0) {
            l.f(c8003q0, "config");
            this.f19222a = c8003q0;
            this.f19223b = C14102d.m2968b(false, 1, null);
            this.f19224c = new C7977n0<>(this.f19222a, null);
        }
    }

    /* compiled from: PageFetcherSnapshotState.kt */
    /* renamed from: g.r.n0$b */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C7979b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19225a;

        static {
            int[] iArr = new int[EnumC7830b0.values().length];
            iArr[EnumC7830b0.REFRESH.ordinal()] = 1;
            iArr[EnumC7830b0.PREPEND.ordinal()] = 2;
            iArr[EnumC7830b0.APPEND.ordinal()] = 3;
            f19225a = iArr;
        }
    }

    /* compiled from: PageFetcherSnapshotState.kt */
    @f(c = "androidx.paging.PageFetcherSnapshotState$consumeAppendGenerationIdAsFlow$1", f = "PageFetcherSnapshotState.kt", l = {}, m = "invokeSuspend")
    /* renamed from: g.r.n0$c */
    /* loaded from: classes2.dex */
    public static final class C7980c extends AbstractC11745k implements InterfaceC11771p<InterfaceC13969e<? super Integer>, InterfaceC11714d<? super C13666w>, Object> {

        /* renamed from: c */
        int f19226c;

        /* renamed from: d */
        final /* synthetic */ C7977n0<Key, Value> f19227d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7980c(C7977n0<Key, Value> c7977n0, InterfaceC11714d<? super C7980c> interfaceC11714d) {
            super(2, interfaceC11714d);
            this.f19227d = c7977n0;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final InterfaceC11714d<C13666w> create(Object obj, InterfaceC11714d<?> interfaceC11714d) {
            return new C7980c(this.f19227d, interfaceC11714d);
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            C11734d.m10387d();
            if (this.f19226c == 0) {
                C13291q.m5357b(obj);
                ((C7977n0) this.f19227d).f19219j.mo3640k(C11736b.m10381b(((C7977n0) this.f19227d).f19217h));
                return C13666w.f30112a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11771p
        /* renamed from: m */
        public final Object invoke(InterfaceC13969e<? super Integer> interfaceC13969e, InterfaceC11714d<? super C13666w> interfaceC11714d) {
            return ((C7980c) create(interfaceC13969e, interfaceC11714d)).invokeSuspend(C13666w.f30112a);
        }
    }

    /* compiled from: PageFetcherSnapshotState.kt */
    @f(c = "androidx.paging.PageFetcherSnapshotState$consumePrependGenerationIdAsFlow$1", f = "PageFetcherSnapshotState.kt", l = {}, m = "invokeSuspend")
    /* renamed from: g.r.n0$d */
    /* loaded from: classes2.dex */
    public static final class C7981d extends AbstractC11745k implements InterfaceC11771p<InterfaceC13969e<? super Integer>, InterfaceC11714d<? super C13666w>, Object> {

        /* renamed from: c */
        int f19228c;

        /* renamed from: d */
        final /* synthetic */ C7977n0<Key, Value> f19229d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7981d(C7977n0<Key, Value> c7977n0, InterfaceC11714d<? super C7981d> interfaceC11714d) {
            super(2, interfaceC11714d);
            this.f19229d = c7977n0;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final InterfaceC11714d<C13666w> create(Object obj, InterfaceC11714d<?> interfaceC11714d) {
            return new C7981d(this.f19229d, interfaceC11714d);
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            C11734d.m10387d();
            if (this.f19228c == 0) {
                C13291q.m5357b(obj);
                ((C7977n0) this.f19229d).f19218i.mo3640k(C11736b.m10381b(((C7977n0) this.f19229d).f19216g));
                return C13666w.f30112a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11771p
        /* renamed from: m */
        public final Object invoke(InterfaceC13969e<? super Integer> interfaceC13969e, InterfaceC11714d<? super C13666w> interfaceC11714d) {
            return ((C7981d) create(interfaceC13969e, interfaceC11714d)).invokeSuspend(C13666w.f30112a);
        }
    }

    private C7977n0(C8003q0 c8003q0) {
        this.f19210a = c8003q0;
        ArrayList arrayList = new ArrayList();
        this.f19211b = arrayList;
        this.f19212c = arrayList;
        this.f19218i = C13783i.m3686b(-1, null, null, 6, null);
        this.f19219j = C13783i.m3686b(-1, null, null, 6, null);
        this.f19220k = new LinkedHashMap();
        C7865e0 c7865e0 = new C7865e0();
        c7865e0.m17125c(EnumC7830b0.REFRESH, AbstractC8061y.C8063b.f19410b);
        C13666w c13666w = C13666w.f30112a;
        this.f19221l = c7865e0;
    }

    public /* synthetic */ C7977n0(C8003q0 c8003q0, g gVar) {
        this(c8003q0);
    }

    /* renamed from: e */
    public final InterfaceC13964d<Integer> m16969e() {
        return C13971f.m3314t(C13971f.m3327g(this.f19219j), new C7980c(this, null));
    }

    /* renamed from: f */
    public final InterfaceC13964d<Integer> m16968f() {
        return C13971f.m3314t(C13971f.m3327g(this.f19218i), new C7981d(this, null));
    }

    /* renamed from: g */
    public final C8053w0<Key, Value> m16967g(AbstractC7982n1.C7983a c7983a) {
        List m3825B0;
        int m3889g;
        Integer valueOf;
        int size;
        m3825B0 = C13742z.m3825B0(this.f19212c);
        if (c7983a == null) {
            valueOf = null;
        } else {
            int m16959o = m16959o();
            int i = -m16962l();
            m3889g = C13726r.m3889g(m16961m());
            int m16962l = m3889g - m16962l();
            int m16942g = c7983a.m16942g();
            if (i < m16942g) {
                int i2 = i;
                while (true) {
                    int i3 = i2 + 1;
                    if (i2 > m16962l) {
                        size = this.f19210a.f19271a;
                    } else {
                        size = m16961m().get(i2 + m16962l()).m16823c().size();
                    }
                    m16959o += size;
                    if (i3 >= m16942g) {
                        break;
                    }
                    i2 = i3;
                }
            }
            int m16943f = m16959o + c7983a.m16943f();
            if (c7983a.m16942g() < i) {
                m16943f -= this.f19210a.f19271a;
            }
            valueOf = Integer.valueOf(m16943f);
        }
        return new C8053w0<>(m3825B0, valueOf, this.f19210a, m16959o());
    }

    /* renamed from: h */
    public final void m16966h(AbstractC7905j0.C7906a<Value> c7906a) {
        l.f(c7906a, "event");
        if (c7906a.m17076f() <= this.f19212c.size()) {
            this.f19220k.remove(c7906a.m17079c());
            this.f19221l.m17125c(c7906a.m17079c(), AbstractC8061y.C8064c.f19411b.m16800b());
            int i = C7979b.f19225a[c7906a.m17079c().ordinal()];
            if (i != 2) {
                if (i == 3) {
                    int m17076f = c7906a.m17076f();
                    for (int i2 = 0; i2 < m17076f; i2++) {
                        this.f19211b.remove(m16961m().size() - 1);
                    }
                    m16955s(c7906a.m17075g());
                    int i3 = this.f19217h + 1;
                    this.f19217h = i3;
                    this.f19219j.mo3640k(Integer.valueOf(i3));
                    return;
                }
                throw new IllegalArgumentException(l.m("cannot drop ", c7906a.m17079c()));
            }
            int m17076f2 = c7906a.m17076f();
            for (int i4 = 0; i4 < m17076f2; i4++) {
                this.f19211b.remove(0);
            }
            this.f19213d -= c7906a.m17076f();
            m16954t(c7906a.m17075g());
            int i5 = this.f19216g + 1;
            this.f19216g = i5;
            this.f19218i.mo3640k(Integer.valueOf(i5));
            return;
        }
        throw new IllegalStateException(("invalid drop count. have " + m16961m().size() + " but wanted to drop " + c7906a.m17076f()).toString());
    }

    /* renamed from: i */
    public final AbstractC7905j0.C7906a<Value> m16965i(EnumC7830b0 enumC7830b0, AbstractC7982n1 abstractC7982n1) {
        int m3889g;
        int i;
        int m3889g2;
        int i2;
        int m3889g3;
        int size;
        int m16946c;
        l.f(enumC7830b0, "loadType");
        l.f(abstractC7982n1, "hint");
        AbstractC7905j0.C7906a<Value> c7906a = null;
        if (this.f19210a.f19275e != Integer.MAX_VALUE && this.f19212c.size() > 2 && m16957q() > this.f19210a.f19275e) {
            int i3 = 0;
            if (enumC7830b0 != EnumC7830b0.REFRESH) {
                int i4 = 0;
                int i5 = 0;
                while (i4 < this.f19212c.size() && m16957q() - i5 > this.f19210a.f19275e) {
                    if (C7979b.f19225a[enumC7830b0.ordinal()] == 2) {
                        size = this.f19212c.get(i4).m16823c().size();
                    } else {
                        List<AbstractC8041v0.AbstractC8048b.C8050b<Key, Value>> list = this.f19212c;
                        m3889g3 = C13726r.m3889g(list);
                        size = list.get(m3889g3 - i4).m16823c().size();
                    }
                    if (C7979b.f19225a[enumC7830b0.ordinal()] == 2) {
                        m16946c = abstractC7982n1.m16945d();
                    } else {
                        m16946c = abstractC7982n1.m16946c();
                    }
                    if ((m16946c - i5) - size < this.f19210a.f19272b) {
                        break;
                    }
                    i5 += size;
                    i4++;
                }
                if (i4 != 0) {
                    if (C7979b.f19225a[enumC7830b0.ordinal()] == 2) {
                        i = -this.f19213d;
                    } else {
                        m3889g = C13726r.m3889g(this.f19212c);
                        i = (m3889g - this.f19213d) - (i4 - 1);
                    }
                    if (C7979b.f19225a[enumC7830b0.ordinal()] == 2) {
                        m3889g2 = i4 - 1;
                        i2 = this.f19213d;
                    } else {
                        m3889g2 = C13726r.m3889g(this.f19212c);
                        i2 = this.f19213d;
                    }
                    int i6 = m3889g2 - i2;
                    if (this.f19210a.f19273c) {
                        i3 = (enumC7830b0 == EnumC7830b0.PREPEND ? m16959o() : m16960n()) + i5;
                    }
                    c7906a = new AbstractC7905j0.C7906a<>(enumC7830b0, i, i6, i3);
                }
                return c7906a;
            }
            throw new IllegalArgumentException(l.m("Drop LoadType must be PREPEND or APPEND, but got ", enumC7830b0).toString());
        }
        return null;
    }

    /* renamed from: j */
    public final int m16964j(EnumC7830b0 enumC7830b0) {
        l.f(enumC7830b0, "loadType");
        int i = C7979b.f19225a[enumC7830b0.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return this.f19217h;
                }
                throw new NoWhenBranchMatchedException();
            }
            return this.f19216g;
        }
        throw new IllegalArgumentException("Cannot get loadId for loadType: REFRESH");
    }

    /* renamed from: k */
    public final Map<EnumC7830b0, AbstractC7982n1> m16963k() {
        return this.f19220k;
    }

    /* renamed from: l */
    public final int m16962l() {
        return this.f19213d;
    }

    /* renamed from: m */
    public final List<AbstractC8041v0.AbstractC8048b.C8050b<Key, Value>> m16961m() {
        return this.f19212c;
    }

    /* renamed from: n */
    public final int m16960n() {
        if (this.f19210a.f19273c) {
            return this.f19215f;
        }
        return 0;
    }

    /* renamed from: o */
    public final int m16959o() {
        if (this.f19210a.f19273c) {
            return this.f19214e;
        }
        return 0;
    }

    /* renamed from: p */
    public final C7865e0 m16958p() {
        return this.f19221l;
    }

    /* renamed from: q */
    public final int m16957q() {
        Iterator<T> it = this.f19212c.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((AbstractC8041v0.AbstractC8048b.C8050b) it.next()).m16823c().size();
        }
        return i;
    }

    /* renamed from: r */
    public final boolean m16956r(int i, EnumC7830b0 enumC7830b0, AbstractC8041v0.AbstractC8048b.C8050b<Key, Value> c8050b) {
        int m16821e;
        int m16822d;
        l.f(enumC7830b0, "loadType");
        l.f(c8050b, "page");
        int i2 = C7979b.f19225a[enumC7830b0.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    if (!this.f19212c.isEmpty()) {
                        if (i != this.f19217h) {
                            return false;
                        }
                        this.f19211b.add(c8050b);
                        if (c8050b.m16822d() == Integer.MIN_VALUE) {
                            m16822d = C11841h.m10271a(m16960n() - c8050b.m16823c().size(), 0);
                        } else {
                            m16822d = c8050b.m16822d();
                        }
                        m16955s(m16822d);
                        this.f19220k.remove(EnumC7830b0.APPEND);
                    } else {
                        throw new IllegalStateException("should've received an init before append".toString());
                    }
                }
            } else if (!this.f19212c.isEmpty()) {
                if (i != this.f19216g) {
                    return false;
                }
                this.f19211b.add(0, c8050b);
                this.f19213d++;
                if (c8050b.m16821e() == Integer.MIN_VALUE) {
                    m16821e = C11841h.m10271a(m16959o() - c8050b.m16823c().size(), 0);
                } else {
                    m16821e = c8050b.m16821e();
                }
                m16954t(m16821e);
                this.f19220k.remove(EnumC7830b0.PREPEND);
            } else {
                throw new IllegalStateException("should've received an init before prepend".toString());
            }
        } else if (!this.f19212c.isEmpty()) {
            throw new IllegalStateException("cannot receive multiple init calls".toString());
        } else {
            if (i == 0) {
                this.f19211b.add(c8050b);
                this.f19213d = 0;
                m16955s(c8050b.m16822d());
                m16954t(c8050b.m16821e());
            } else {
                throw new IllegalStateException("init loadId must be the initial value, 0".toString());
            }
        }
        return true;
    }

    /* renamed from: s */
    public final void m16955s(int i) {
        if (i == Integer.MIN_VALUE) {
            i = 0;
        }
        this.f19215f = i;
    }

    /* renamed from: t */
    public final void m16954t(int i) {
        if (i == Integer.MIN_VALUE) {
            i = 0;
        }
        this.f19214e = i;
    }

    /* renamed from: u */
    public final AbstractC7905j0<Value> m16953u(AbstractC8041v0.AbstractC8048b.C8050b<Key, Value> c8050b, EnumC7830b0 enumC7830b0) {
        List m3901b;
        l.f(c8050b, "<this>");
        l.f(enumC7830b0, "loadType");
        int i = C7979b.f19225a[enumC7830b0.ordinal()];
        int i2 = 0;
        if (i != 1) {
            if (i == 2) {
                i2 = 0 - this.f19213d;
            } else if (i != 3) {
                throw new NoWhenBranchMatchedException();
            } else {
                i2 = (this.f19212c.size() - this.f19213d) - 1;
            }
        }
        m3901b = C13724q.m3901b(new C7936k1(i2, c8050b.m16823c()));
        int i3 = C7979b.f19225a[enumC7830b0.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 3) {
                    return AbstractC7905j0.C7907b.f18953g.m17064a(m3901b, m16960n(), this.f19221l.m17124d(), null);
                }
                throw new NoWhenBranchMatchedException();
            }
            return AbstractC7905j0.C7907b.f18953g.m17063b(m3901b, m16959o(), this.f19221l.m17124d(), null);
        }
        return AbstractC7905j0.C7907b.f18953g.m17062c(m3901b, m16959o(), m16960n(), this.f19221l.m17124d(), null);
    }
}
