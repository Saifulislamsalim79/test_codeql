package p201g.p259r;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import java.util.List;
import kotlin.c0.k.a.f;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.p478k.p479a.AbstractC11738d;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p557z.C13724q;
import p201g.p259r.AbstractC8061y;
/* compiled from: PageEvent.kt */
/* renamed from: g.r.j0 */
/* loaded from: classes2.dex */
public abstract class AbstractC7905j0<T> {

    /* compiled from: PageEvent.kt */
    /* renamed from: g.r.j0$a */
    /* loaded from: classes2.dex */
    public static final class C7906a<T> extends AbstractC7905j0<T> {

        /* renamed from: a */
        private final EnumC7830b0 f18949a;

        /* renamed from: b */
        private final int f18950b;

        /* renamed from: c */
        private final int f18951c;

        /* renamed from: d */
        private final int f18952d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7906a(EnumC7830b0 enumC7830b0, int i, int i2, int i3) {
            super(null);
            l.f(enumC7830b0, "loadType");
            this.f18949a = enumC7830b0;
            this.f18950b = i;
            this.f18951c = i2;
            this.f18952d = i3;
            if (enumC7830b0 != EnumC7830b0.REFRESH) {
                if (m17076f() > 0) {
                    if (!(this.f18952d >= 0)) {
                        throw new IllegalArgumentException(l.m("Invalid placeholdersRemaining ", Integer.valueOf(m17075g())).toString());
                    }
                    return;
                }
                throw new IllegalArgumentException(l.m("Drop count must be > 0, but was ", Integer.valueOf(m17076f())).toString());
            }
            throw new IllegalArgumentException("Drop load type must be PREPEND or APPEND".toString());
        }

        /* renamed from: c */
        public final EnumC7830b0 m17079c() {
            return this.f18949a;
        }

        /* renamed from: d */
        public final int m17078d() {
            return this.f18951c;
        }

        /* renamed from: e */
        public final int m17077e() {
            return this.f18950b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C7906a) {
                C7906a c7906a = (C7906a) obj;
                return this.f18949a == c7906a.f18949a && this.f18950b == c7906a.f18950b && this.f18951c == c7906a.f18951c && this.f18952d == c7906a.f18952d;
            }
            return false;
        }

        /* renamed from: f */
        public final int m17076f() {
            return (this.f18951c - this.f18950b) + 1;
        }

        /* renamed from: g */
        public final int m17075g() {
            return this.f18952d;
        }

        public int hashCode() {
            return (((((this.f18949a.hashCode() * 31) + this.f18950b) * 31) + this.f18951c) * 31) + this.f18952d;
        }

        public String toString() {
            return "Drop(loadType=" + this.f18949a + ", minPageOffset=" + this.f18950b + ", maxPageOffset=" + this.f18951c + ", placeholdersRemaining=" + this.f18952d + ')';
        }
    }

    /* compiled from: PageEvent.kt */
    /* renamed from: g.r.j0$b */
    /* loaded from: classes2.dex */
    public static final class C7907b<T> extends AbstractC7905j0<T> {

        /* renamed from: g */
        public static final C7908a f18953g;

        /* renamed from: h */
        private static final C7907b<Object> f18954h;

        /* renamed from: a */
        private final EnumC7830b0 f18955a;

        /* renamed from: b */
        private final List<C7936k1<T>> f18956b;

        /* renamed from: c */
        private final int f18957c;

        /* renamed from: d */
        private final int f18958d;

        /* renamed from: e */
        private final C7825a0 f18959e;

        /* renamed from: f */
        private final C7825a0 f18960f;

        /* compiled from: PageEvent.kt */
        /* renamed from: g.r.j0$b$a */
        /* loaded from: classes2.dex */
        public static final class C7908a {
            private C7908a() {
            }

            public /* synthetic */ C7908a(g gVar) {
                this();
            }

            /* renamed from: d */
            public static /* synthetic */ C7907b m17061d(C7908a c7908a, List list, int i, int i2, C7825a0 c7825a0, C7825a0 c7825a02, int i3, Object obj) {
                if ((i3 & 16) != 0) {
                    c7825a02 = null;
                }
                return c7908a.m17062c(list, i, i2, c7825a0, c7825a02);
            }

            /* renamed from: a */
            public final <T> C7907b<T> m17064a(List<C7936k1<T>> list, int i, C7825a0 c7825a0, C7825a0 c7825a02) {
                l.f(list, "pages");
                l.f(c7825a0, "sourceLoadStates");
                return new C7907b<>(EnumC7830b0.APPEND, list, -1, i, c7825a0, c7825a02, null);
            }

            /* renamed from: b */
            public final <T> C7907b<T> m17063b(List<C7936k1<T>> list, int i, C7825a0 c7825a0, C7825a0 c7825a02) {
                l.f(list, "pages");
                l.f(c7825a0, "sourceLoadStates");
                return new C7907b<>(EnumC7830b0.PREPEND, list, i, -1, c7825a0, c7825a02, null);
            }

            /* renamed from: c */
            public final <T> C7907b<T> m17062c(List<C7936k1<T>> list, int i, int i2, C7825a0 c7825a0, C7825a0 c7825a02) {
                l.f(list, "pages");
                l.f(c7825a0, "sourceLoadStates");
                return new C7907b<>(EnumC7830b0.REFRESH, list, i, i2, c7825a0, c7825a02, null);
            }

            /* renamed from: e */
            public final C7907b<Object> m17060e() {
                return C7907b.f18954h;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PageEvent.kt */
        @f(c = "androidx.paging.PageEvent$Insert", f = "PageEvent.kt", l = {74}, m = "map")
        /* renamed from: g.r.j0$b$b */
        /* loaded from: classes2.dex */
        public static final class C7909b<R> extends AbstractC11738d {

            /* renamed from: A */
            Object f18961A;

            /* renamed from: B */
            Object f18962B;

            /* renamed from: C */
            Object f18963C;

            /* renamed from: D */
            /* synthetic */ Object f18964D;

            /* renamed from: E */
            final /* synthetic */ C7907b<T> f18965E;

            /* renamed from: F */
            int f18966F;

            /* renamed from: c */
            Object f18967c;

            /* renamed from: d */
            Object f18968d;

            /* renamed from: e */
            Object f18969e;

            /* renamed from: f */
            Object f18970f;

            /* renamed from: w */
            Object f18971w;

            /* renamed from: x */
            Object f18972x;

            /* renamed from: y */
            Object f18973y;

            /* renamed from: z */
            Object f18974z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C7909b(C7907b<T> c7907b, InterfaceC11714d<? super C7909b> interfaceC11714d) {
                super(interfaceC11714d);
                this.f18965E = c7907b;
            }

            @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
            public final Object invokeSuspend(Object obj) {
                this.f18964D = obj;
                this.f18966F |= Integer.MIN_VALUE;
                return this.f18965E.mo17074a(null, this);
            }
        }

        static {
            List m3901b;
            C7908a c7908a = new C7908a(null);
            f18953g = c7908a;
            m3901b = C13724q.m3901b(C7936k1.f19052e.m17023a());
            f18954h = C7908a.m17061d(c7908a, m3901b, 0, 0, new C7825a0(AbstractC8061y.C8064c.f19411b.m16800b(), AbstractC8061y.C8064c.f19411b.m16801a(), AbstractC8061y.C8064c.f19411b.m16801a()), null, 16, null);
        }

        private C7907b(EnumC7830b0 enumC7830b0, List<C7936k1<T>> list, int i, int i2, C7825a0 c7825a0, C7825a0 c7825a02) {
            super(null);
            this.f18955a = enumC7830b0;
            this.f18956b = list;
            this.f18957c = i;
            this.f18958d = i2;
            this.f18959e = c7825a0;
            this.f18960f = c7825a02;
            boolean z = false;
            if (enumC7830b0 == EnumC7830b0.APPEND || i >= 0) {
                if (this.f18955a == EnumC7830b0.PREPEND || this.f18958d >= 0) {
                    if (!((this.f18955a != EnumC7830b0.REFRESH || (this.f18956b.isEmpty() ^ true)) ? true : true)) {
                        throw new IllegalArgumentException("Cannot create a REFRESH Insert event with no TransformablePages as this could permanently stall pagination. Note that this check does not prevent empty LoadResults and is instead usually an indication of an internal error in Paging itself.".toString());
                    }
                    return;
                }
                throw new IllegalArgumentException(l.m("Append insert defining placeholdersAfter must be > 0, but was ", Integer.valueOf(m17067i())).toString());
            }
            throw new IllegalArgumentException(l.m("Prepend insert defining placeholdersBefore must be > 0, but was ", Integer.valueOf(m17066j())).toString());
        }

        public /* synthetic */ C7907b(EnumC7830b0 enumC7830b0, List list, int i, int i2, C7825a0 c7825a0, C7825a0 c7825a02, g gVar) {
            this(enumC7830b0, list, i, i2, c7825a0, c7825a02);
        }

        /* renamed from: e */
        public static /* synthetic */ C7907b m17071e(C7907b c7907b, EnumC7830b0 enumC7830b0, List list, int i, int i2, C7825a0 c7825a0, C7825a0 c7825a02, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                enumC7830b0 = c7907b.f18955a;
            }
            List<C7936k1<T>> list2 = list;
            if ((i3 & 2) != 0) {
                list2 = c7907b.f18956b;
            }
            List list3 = list2;
            if ((i3 & 4) != 0) {
                i = c7907b.f18957c;
            }
            int i4 = i;
            if ((i3 & 8) != 0) {
                i2 = c7907b.f18958d;
            }
            int i5 = i2;
            if ((i3 & 16) != 0) {
                c7825a0 = c7907b.f18959e;
            }
            C7825a0 c7825a03 = c7825a0;
            if ((i3 & 32) != 0) {
                c7825a02 = c7907b.f18960f;
            }
            return c7907b.m17072d(enumC7830b0, list3, i4, i5, c7825a03, c7825a02);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00b6  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00ec  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0104  */
        /* JADX WARN: Type inference failed for: r13v9, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r4v9, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r7v10, types: [java.util.Collection] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x008f -> B:18:0x00b0). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00da -> B:24:0x00e2). Please submit an issue!!! */
        @Override // p201g.p259r.AbstractC7905j0
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public <R> java.lang.Object mo17074a(kotlin.p483e0.p484c.InterfaceC11771p<? super T, ? super kotlin.p476c0.InterfaceC11714d<? super R>, ? extends java.lang.Object> r18, kotlin.p476c0.InterfaceC11714d<? super p201g.p259r.AbstractC7905j0<R>> r19) {
            /*
                Method dump skipped, instructions count: 288
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p201g.p259r.AbstractC7905j0.C7907b.mo17074a(kotlin.e0.c.p, kotlin.c0.d):java.lang.Object");
        }

        /* renamed from: d */
        public final C7907b<T> m17072d(EnumC7830b0 enumC7830b0, List<C7936k1<T>> list, int i, int i2, C7825a0 c7825a0, C7825a0 c7825a02) {
            l.f(enumC7830b0, "loadType");
            l.f(list, "pages");
            l.f(c7825a0, "sourceLoadStates");
            return new C7907b<>(enumC7830b0, list, i, i2, c7825a0, c7825a02);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C7907b) {
                C7907b c7907b = (C7907b) obj;
                return this.f18955a == c7907b.f18955a && l.b(this.f18956b, c7907b.f18956b) && this.f18957c == c7907b.f18957c && this.f18958d == c7907b.f18958d && l.b(this.f18959e, c7907b.f18959e) && l.b(this.f18960f, c7907b.f18960f);
            }
            return false;
        }

        /* renamed from: f */
        public final EnumC7830b0 m17070f() {
            return this.f18955a;
        }

        /* renamed from: g */
        public final C7825a0 m17069g() {
            return this.f18960f;
        }

        /* renamed from: h */
        public final List<C7936k1<T>> m17068h() {
            return this.f18956b;
        }

        public int hashCode() {
            int hashCode = ((((((((this.f18955a.hashCode() * 31) + this.f18956b.hashCode()) * 31) + this.f18957c) * 31) + this.f18958d) * 31) + this.f18959e.hashCode()) * 31;
            C7825a0 c7825a0 = this.f18960f;
            return hashCode + (c7825a0 == null ? 0 : c7825a0.hashCode());
        }

        /* renamed from: i */
        public final int m17067i() {
            return this.f18958d;
        }

        /* renamed from: j */
        public final int m17066j() {
            return this.f18957c;
        }

        /* renamed from: k */
        public final C7825a0 m17065k() {
            return this.f18959e;
        }

        public String toString() {
            return "Insert(loadType=" + this.f18955a + ", pages=" + this.f18956b + ", placeholdersBefore=" + this.f18957c + ", placeholdersAfter=" + this.f18958d + ", sourceLoadStates=" + this.f18959e + ", mediatorLoadStates=" + this.f18960f + ')';
        }
    }

    /* compiled from: PageEvent.kt */
    /* renamed from: g.r.j0$c */
    /* loaded from: classes2.dex */
    public static final class C7910c<T> extends AbstractC7905j0<T> {

        /* renamed from: a */
        private final C7825a0 f18975a;

        /* renamed from: b */
        private final C7825a0 f18976b;

        public /* synthetic */ C7910c(C7825a0 c7825a0, C7825a0 c7825a02, int i, g gVar) {
            this(c7825a0, (i & 2) != 0 ? null : c7825a02);
        }

        /* renamed from: c */
        public final C7825a0 m17059c() {
            return this.f18976b;
        }

        /* renamed from: d */
        public final C7825a0 m17058d() {
            return this.f18975a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C7910c) {
                C7910c c7910c = (C7910c) obj;
                return l.b(this.f18975a, c7910c.f18975a) && l.b(this.f18976b, c7910c.f18976b);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.f18975a.hashCode() * 31;
            C7825a0 c7825a0 = this.f18976b;
            return hashCode + (c7825a0 == null ? 0 : c7825a0.hashCode());
        }

        public String toString() {
            return "LoadStateUpdate(source=" + this.f18975a + ", mediator=" + this.f18976b + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7910c(C7825a0 c7825a0, C7825a0 c7825a02) {
            super(null);
            l.f(c7825a0, TransactionField.TRANSACTION_CHANNEL);
            this.f18975a = c7825a0;
            this.f18976b = c7825a02;
        }
    }

    private AbstractC7905j0() {
    }

    public /* synthetic */ AbstractC7905j0(g gVar) {
        this();
    }

    /* renamed from: b */
    static /* synthetic */ Object m17080b(AbstractC7905j0 abstractC7905j0, InterfaceC11771p interfaceC11771p, InterfaceC11714d interfaceC11714d) {
        return abstractC7905j0;
    }

    /* renamed from: a */
    public <R> Object mo17074a(InterfaceC11771p<? super T, ? super InterfaceC11714d<? super R>, ? extends Object> interfaceC11771p, InterfaceC11714d<? super AbstractC7905j0<R>> interfaceC11714d) {
        m17080b(this, interfaceC11771p, interfaceC11714d);
        return this;
    }
}
