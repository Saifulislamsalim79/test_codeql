package kotlin.reflect.jvm.internal.impl.utils;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import kotlin.p483e0.p484c.InterfaceC11767l;
/* compiled from: DFS.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.utils.b */
/* loaded from: classes3.dex */
public class C13635b {

    /* compiled from: DFS.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.b$a */
    /* loaded from: classes3.dex */
    static class C13636a extends AbstractC13637b<N, Boolean> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC11767l f30067a;

        /* renamed from: b */
        final /* synthetic */ boolean[] f30068b;

        C13636a(InterfaceC11767l interfaceC11767l, boolean[] zArr) {
            this.f30067a = interfaceC11767l;
            this.f30068b = zArr;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.C13635b.InterfaceC13639d
        /* renamed from: c */
        public boolean mo4271c(N n) {
            if (((Boolean) this.f30067a.invoke(n)).booleanValue()) {
                this.f30068b[0] = true;
            }
            return !this.f30068b[0];
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.C13635b.InterfaceC13639d
        /* renamed from: d */
        public Boolean mo4273a() {
            return Boolean.valueOf(this.f30068b[0]);
        }
    }

    /* compiled from: DFS.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.b$b */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC13637b<N, R> implements InterfaceC13639d<N, R> {
        @Override // kotlin.reflect.jvm.internal.impl.utils.C13635b.InterfaceC13639d
        /* renamed from: b */
        public void mo4272b(N n) {
        }
    }

    /* compiled from: DFS.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.b$c */
    /* loaded from: classes3.dex */
    public interface InterfaceC13638c<N> {
        /* renamed from: a */
        Iterable<? extends N> mo4274a(N n);
    }

    /* compiled from: DFS.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.b$d */
    /* loaded from: classes3.dex */
    public interface InterfaceC13639d<N, R> {
        /* renamed from: a */
        R mo4273a();

        /* renamed from: b */
        void mo4272b(N n);

        /* renamed from: c */
        boolean mo4271c(N n);
    }

    /* compiled from: DFS.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.b$e */
    /* loaded from: classes3.dex */
    public interface InterfaceC13640e<N> {
        /* renamed from: a */
        boolean mo4270a(N n);
    }

    /* compiled from: DFS.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.b$f */
    /* loaded from: classes3.dex */
    public static class C13641f<N> implements InterfaceC13640e<N> {

        /* renamed from: a */
        private final Set<N> f30069a;

        public C13641f() {
            this(new HashSet());
        }

        /* renamed from: b */
        private static /* synthetic */ void m4269b(int i) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "visited", "kotlin/reflect/jvm/internal/impl/utils/DFS$VisitedWithSet", "<init>"));
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.C13635b.InterfaceC13640e
        /* renamed from: a */
        public boolean mo4270a(N n) {
            return this.f30069a.add(n);
        }

        public C13641f(Set<N> set) {
            if (set != null) {
                this.f30069a = set;
            } else {
                m4269b(0);
                throw null;
            }
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m4280a(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case 18:
            case 21:
            case 23:
                objArr[0] = "neighbors";
                break;
            case 2:
            case 12:
            case 16:
            case 19:
            case 24:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case 25:
                objArr[0] = "handler";
                break;
            case 4:
            case 7:
            case 17:
            case 20:
            default:
                objArr[0] = "nodes";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case 14:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = "current";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (i) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* renamed from: b */
    public static <N, R> R m4279b(Collection<N> collection, InterfaceC13638c<N> interfaceC13638c, InterfaceC13639d<N, R> interfaceC13639d) {
        if (collection == null) {
            m4280a(4);
            throw null;
        } else if (interfaceC13638c == null) {
            m4280a(5);
            throw null;
        } else if (interfaceC13639d != null) {
            return (R) m4278c(collection, interfaceC13638c, new C13641f(), interfaceC13639d);
        } else {
            m4280a(6);
            throw null;
        }
    }

    /* renamed from: c */
    public static <N, R> R m4278c(Collection<N> collection, InterfaceC13638c<N> interfaceC13638c, InterfaceC13640e<N> interfaceC13640e, InterfaceC13639d<N, R> interfaceC13639d) {
        if (collection == null) {
            m4280a(0);
            throw null;
        } else if (interfaceC13638c == null) {
            m4280a(1);
            throw null;
        } else if (interfaceC13640e == null) {
            m4280a(2);
            throw null;
        } else if (interfaceC13639d != null) {
            for (N n : collection) {
                m4277d(n, interfaceC13638c, interfaceC13640e, interfaceC13639d);
            }
            return interfaceC13639d.mo4273a();
        } else {
            m4280a(3);
            throw null;
        }
    }

    /* renamed from: d */
    public static <N> void m4277d(N n, InterfaceC13638c<N> interfaceC13638c, InterfaceC13640e<N> interfaceC13640e, InterfaceC13639d<N, ?> interfaceC13639d) {
        if (n == null) {
            m4280a(22);
            throw null;
        } else if (interfaceC13638c == null) {
            m4280a(23);
            throw null;
        } else if (interfaceC13640e == null) {
            m4280a(24);
            throw null;
        } else if (interfaceC13639d != null) {
            if (interfaceC13640e.mo4270a(n) && interfaceC13639d.mo4271c(n)) {
                for (N n2 : interfaceC13638c.mo4274a(n)) {
                    m4277d(n2, interfaceC13638c, interfaceC13640e, interfaceC13639d);
                }
                interfaceC13639d.mo4272b(n);
            }
        } else {
            m4280a(25);
            throw null;
        }
    }

    /* renamed from: e */
    public static <N> Boolean m4276e(Collection<N> collection, InterfaceC13638c<N> interfaceC13638c, InterfaceC11767l<N, Boolean> interfaceC11767l) {
        if (collection == null) {
            m4280a(7);
            throw null;
        } else if (interfaceC13638c == null) {
            m4280a(8);
            throw null;
        } else if (interfaceC11767l != null) {
            return (Boolean) m4279b(collection, interfaceC13638c, new C13636a(interfaceC11767l, new boolean[1]));
        } else {
            m4280a(9);
            throw null;
        }
    }
}
