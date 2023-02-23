package p201g.p259r;

import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import java.util.List;
import kotlin.C13666w;
import kotlin.NoWhenBranchMatchedException;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p557z.C13726r;
/* compiled from: PagingSource.kt */
/* renamed from: g.r.v0 */
/* loaded from: classes2.dex */
public abstract class AbstractC8041v0<Key, Value> {
    private final C8040v<InterfaceC11756a<C13666w>> invalidateCallbackTracker = new C8040v<>(C8051c.f19388c, null, 2, null);

    /* compiled from: PagingSource.kt */
    /* renamed from: g.r.v0$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC8042a<Key> {

        /* renamed from: c */
        public static final C8044b f19375c = new C8044b(null);

        /* renamed from: a */
        private final int f19376a;

        /* renamed from: b */
        private final boolean f19377b;

        /* compiled from: PagingSource.kt */
        /* renamed from: g.r.v0$a$a */
        /* loaded from: classes2.dex */
        public static final class C8043a<Key> extends AbstractC8042a<Key> {

            /* renamed from: d */
            private final Key f19378d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8043a(Key key, int i, boolean z) {
                super(i, z, null);
                l.f(key, "key");
                this.f19378d = key;
            }

            @Override // p201g.p259r.AbstractC8041v0.AbstractC8042a
            /* renamed from: a */
            public Key mo16827a() {
                return this.f19378d;
            }
        }

        /* compiled from: PagingSource.kt */
        /* renamed from: g.r.v0$a$b */
        /* loaded from: classes2.dex */
        public static final class C8044b {

            /* compiled from: PagingSource.kt */
            /* renamed from: g.r.v0$a$b$a */
            /* loaded from: classes2.dex */
            public /* synthetic */ class C8045a {

                /* renamed from: a */
                public static final /* synthetic */ int[] f19379a;

                static {
                    int[] iArr = new int[EnumC7830b0.values().length];
                    iArr[EnumC7830b0.REFRESH.ordinal()] = 1;
                    iArr[EnumC7830b0.PREPEND.ordinal()] = 2;
                    iArr[EnumC7830b0.APPEND.ordinal()] = 3;
                    f19379a = iArr;
                }
            }

            private C8044b() {
            }

            public /* synthetic */ C8044b(g gVar) {
                this();
            }

            /* renamed from: a */
            public final <Key> AbstractC8042a<Key> m16828a(EnumC7830b0 enumC7830b0, Key key, int i, boolean z) {
                l.f(enumC7830b0, "loadType");
                int i2 = C8045a.f19379a[enumC7830b0.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        if (key != null) {
                            return new C8046c(key, i, z);
                        }
                        throw new IllegalArgumentException("key cannot be null for prepend".toString());
                    } else if (i2 == 3) {
                        if (key != null) {
                            return new C8043a(key, i, z);
                        }
                        throw new IllegalArgumentException("key cannot be null for append".toString());
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return new C8047d(key, i, z);
            }
        }

        /* compiled from: PagingSource.kt */
        /* renamed from: g.r.v0$a$c */
        /* loaded from: classes2.dex */
        public static final class C8046c<Key> extends AbstractC8042a<Key> {

            /* renamed from: d */
            private final Key f19380d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8046c(Key key, int i, boolean z) {
                super(i, z, null);
                l.f(key, "key");
                this.f19380d = key;
            }

            @Override // p201g.p259r.AbstractC8041v0.AbstractC8042a
            /* renamed from: a */
            public Key mo16827a() {
                return this.f19380d;
            }
        }

        /* compiled from: PagingSource.kt */
        /* renamed from: g.r.v0$a$d */
        /* loaded from: classes2.dex */
        public static final class C8047d<Key> extends AbstractC8042a<Key> {

            /* renamed from: d */
            private final Key f19381d;

            public C8047d(Key key, int i, boolean z) {
                super(i, z, null);
                this.f19381d = key;
            }

            @Override // p201g.p259r.AbstractC8041v0.AbstractC8042a
            /* renamed from: a */
            public Key mo16827a() {
                return this.f19381d;
            }
        }

        private AbstractC8042a(int i, boolean z) {
            this.f19376a = i;
            this.f19377b = z;
        }

        public /* synthetic */ AbstractC8042a(int i, boolean z, g gVar) {
            this(i, z);
        }

        /* renamed from: a */
        public abstract Key mo16827a();

        /* renamed from: b */
        public final int m16830b() {
            return this.f19376a;
        }

        /* renamed from: c */
        public final boolean m16829c() {
            return this.f19377b;
        }
    }

    /* compiled from: PagingSource.kt */
    /* renamed from: g.r.v0$c */
    /* loaded from: classes2.dex */
    static final class C8051c extends AbstractC11802m implements InterfaceC11767l<InterfaceC11756a<? extends C13666w>, C13666w> {

        /* renamed from: c */
        public static final C8051c f19388c = new C8051c();

        C8051c() {
            super(1);
        }

        /* renamed from: a */
        public final void m16818a(InterfaceC11756a<C13666w> interfaceC11756a) {
            l.f(interfaceC11756a, "it");
            interfaceC11756a.invoke();
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public /* bridge */ /* synthetic */ C13666w invoke(InterfaceC11756a<? extends C13666w> interfaceC11756a) {
            m16818a(interfaceC11756a);
            return C13666w.f30112a;
        }
    }

    public final boolean getInvalid() {
        return this.invalidateCallbackTracker.m16834b();
    }

    public final int getInvalidateCallbackCount$paging_common() {
        return this.invalidateCallbackTracker.m16835a();
    }

    public boolean getJumpingSupported() {
        return false;
    }

    public boolean getKeyReuseSupported() {
        return false;
    }

    public abstract Key getRefreshKey(C8053w0<Key, Value> c8053w0);

    public final void invalidate() {
        this.invalidateCallbackTracker.m16833c();
    }

    public abstract Object load(AbstractC8042a<Key> abstractC8042a, InterfaceC11714d<? super AbstractC8048b<Key, Value>> interfaceC11714d);

    public final void registerInvalidatedCallback(InterfaceC11756a<C13666w> interfaceC11756a) {
        l.f(interfaceC11756a, "onInvalidatedCallback");
        this.invalidateCallbackTracker.m16832d(interfaceC11756a);
    }

    public final void unregisterInvalidatedCallback(InterfaceC11756a<C13666w> interfaceC11756a) {
        l.f(interfaceC11756a, "onInvalidatedCallback");
        this.invalidateCallbackTracker.m16831e(interfaceC11756a);
    }

    /* compiled from: PagingSource.kt */
    /* renamed from: g.r.v0$b */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC8048b<Key, Value> {

        /* compiled from: PagingSource.kt */
        /* renamed from: g.r.v0$b$a */
        /* loaded from: classes2.dex */
        public static final class C8049a<Key, Value> extends AbstractC8048b<Key, Value> {

            /* renamed from: a */
            private final Throwable f19382a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8049a(Throwable th) {
                super(null);
                l.f(th, "throwable");
                this.f19382a = th;
            }

            /* renamed from: a */
            public final Throwable m16826a() {
                return this.f19382a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C8049a) && l.b(this.f19382a, ((C8049a) obj).f19382a);
            }

            public int hashCode() {
                return this.f19382a.hashCode();
            }

            public String toString() {
                return "Error(throwable=" + this.f19382a + ')';
            }
        }

        private AbstractC8048b() {
        }

        public /* synthetic */ AbstractC8048b(g gVar) {
            this();
        }

        /* compiled from: PagingSource.kt */
        /* renamed from: g.r.v0$b$b */
        /* loaded from: classes2.dex */
        public static final class C8050b<Key, Value> extends AbstractC8048b<Key, Value> {

            /* renamed from: a */
            private final List<Value> f19383a;

            /* renamed from: b */
            private final Key f19384b;

            /* renamed from: c */
            private final Key f19385c;

            /* renamed from: d */
            private final int f19386d;

            /* renamed from: e */
            private final int f19387e;

            static {
                List m3891e;
                m3891e = C13726r.m3891e();
                new C8050b(m3891e, null, null, 0, 0);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C8050b(List<? extends Value> list, Key key, Key key2, int i, int i2) {
                super(null);
                l.f(list, TransactionBreakDownItemType.DATA);
                this.f19383a = list;
                this.f19384b = key;
                this.f19385c = key2;
                this.f19386d = i;
                this.f19387e = i2;
                boolean z = false;
                if (i == Integer.MIN_VALUE || i >= 0) {
                    int i3 = this.f19387e;
                    if (!((i3 == Integer.MIN_VALUE || i3 >= 0) ? true : true)) {
                        throw new IllegalArgumentException("itemsAfter cannot be negative".toString());
                    }
                    return;
                }
                throw new IllegalArgumentException("itemsBefore cannot be negative".toString());
            }

            /* renamed from: a */
            public final Key m16825a() {
                return this.f19384b;
            }

            /* renamed from: b */
            public final Key m16824b() {
                return this.f19385c;
            }

            /* renamed from: c */
            public final List<Value> m16823c() {
                return this.f19383a;
            }

            /* renamed from: d */
            public final int m16822d() {
                return this.f19387e;
            }

            /* renamed from: e */
            public final int m16821e() {
                return this.f19386d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C8050b) {
                    C8050b c8050b = (C8050b) obj;
                    return l.b(this.f19383a, c8050b.f19383a) && l.b(this.f19384b, c8050b.f19384b) && l.b(this.f19385c, c8050b.f19385c) && this.f19386d == c8050b.f19386d && this.f19387e == c8050b.f19387e;
                }
                return false;
            }

            /* renamed from: f */
            public final Key m16820f() {
                return this.f19385c;
            }

            /* renamed from: g */
            public final Key m16819g() {
                return this.f19384b;
            }

            public int hashCode() {
                int hashCode = this.f19383a.hashCode() * 31;
                Key key = this.f19384b;
                int hashCode2 = (hashCode + (key == null ? 0 : key.hashCode())) * 31;
                Key key2 = this.f19385c;
                return ((((hashCode2 + (key2 != null ? key2.hashCode() : 0)) * 31) + this.f19386d) * 31) + this.f19387e;
            }

            public String toString() {
                return "Page(data=" + this.f19383a + ", prevKey=" + this.f19384b + ", nextKey=" + this.f19385c + ", itemsBefore=" + this.f19386d + ", itemsAfter=" + this.f19387e + ')';
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public C8050b(List<? extends Value> list, Key key, Key key2) {
                this(list, key, key2, Integer.MIN_VALUE, Integer.MIN_VALUE);
                l.f(list, TransactionBreakDownItemType.DATA);
            }
        }
    }
}
