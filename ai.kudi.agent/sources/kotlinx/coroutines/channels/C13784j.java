package kotlinx.coroutines.channels;
/* compiled from: Channel.kt */
/* renamed from: kotlinx.coroutines.channels.j */
/* loaded from: classes3.dex */
public final class C13784j<T> {

    /* renamed from: b */
    public static final C13786b f30249b = new C13786b(null);

    /* renamed from: c */
    private static final C13787c f30250c = new C13787c();

    /* renamed from: a */
    private final Object f30251a;

    /* compiled from: Channel.kt */
    /* renamed from: kotlinx.coroutines.channels.j$a */
    /* loaded from: classes3.dex */
    public static final class C13785a extends C13787c {

        /* renamed from: a */
        public final Throwable f30252a;

        public C13785a(Throwable th) {
            this.f30252a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C13785a) && kotlin.e0.d.l.b(this.f30252a, ((C13785a) obj).f30252a);
        }

        public int hashCode() {
            Throwable th = this.f30252a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // kotlinx.coroutines.channels.C13784j.C13787c
        public String toString() {
            return "Closed(" + this.f30252a + ')';
        }
    }

    /* compiled from: Channel.kt */
    /* renamed from: kotlinx.coroutines.channels.j$b */
    /* loaded from: classes3.dex */
    public static final class C13786b {
        private C13786b() {
        }

        public /* synthetic */ C13786b(kotlin.e0.d.g gVar) {
            this();
        }

        /* renamed from: a */
        public final <E> Object m3674a(Throwable th) {
            C13785a c13785a = new C13785a(th);
            C13784j.m3683c(c13785a);
            return c13785a;
        }

        /* renamed from: b */
        public final <E> Object m3673b() {
            C13787c c13787c = C13784j.f30250c;
            C13784j.m3683c(c13787c);
            return c13787c;
        }

        /* renamed from: c */
        public final <E> Object m3672c(E e) {
            C13784j.m3683c(e);
            return e;
        }
    }

    /* compiled from: Channel.kt */
    /* renamed from: kotlinx.coroutines.channels.j$c */
    /* loaded from: classes3.dex */
    public static class C13787c {
        public String toString() {
            return "Failed";
        }
    }

    private /* synthetic */ C13784j(Object obj) {
        this.f30251a = obj;
    }

    /* renamed from: b */
    public static final /* synthetic */ C13784j m3684b(Object obj) {
        return new C13784j(obj);
    }

    /* renamed from: c */
    public static <T> Object m3683c(Object obj) {
        return obj;
    }

    /* renamed from: d */
    public static boolean m3682d(Object obj, Object obj2) {
        return (obj2 instanceof C13784j) && kotlin.e0.d.l.b(obj, ((C13784j) obj2).m3675k());
    }

    /* renamed from: e */
    public static final Throwable m3681e(Object obj) {
        C13785a c13785a = obj instanceof C13785a ? (C13785a) obj : null;
        if (c13785a == null) {
            return null;
        }
        return c13785a.f30252a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public static final T m3680f(Object obj) {
        Throwable th;
        if (obj instanceof C13787c) {
            if (!(obj instanceof C13785a) || (th = ((C13785a) obj).f30252a) == null) {
                throw new IllegalStateException(kotlin.e0.d.l.m("Trying to call 'getOrThrow' on a failed channel result: ", obj).toString());
            }
            throw th;
        }
        return obj;
    }

    /* renamed from: g */
    public static int m3679g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: h */
    public static final boolean m3678h(Object obj) {
        return obj instanceof C13785a;
    }

    /* renamed from: i */
    public static final boolean m3677i(Object obj) {
        return !(obj instanceof C13787c);
    }

    /* renamed from: j */
    public static String m3676j(Object obj) {
        if (obj instanceof C13785a) {
            return obj.toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m3682d(this.f30251a, obj);
    }

    public int hashCode() {
        return m3679g(this.f30251a);
    }

    /* renamed from: k */
    public final /* synthetic */ Object m3675k() {
        return this.f30251a;
    }

    public String toString() {
        return m3676j(this.f30251a);
    }
}
