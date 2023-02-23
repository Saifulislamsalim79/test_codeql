package p425j.p426a.p427a.p428a;
/* compiled from: SectionParameters.java */
/* renamed from: j.a.a.a.c */
/* loaded from: classes2.dex */
public final class C11123c {

    /* renamed from: a */
    public final transient Integer f25153a;

    /* renamed from: b */
    public final transient Integer f25154b;

    /* renamed from: c */
    public final transient Integer f25155c;

    /* renamed from: d */
    public final transient Integer f25156d;

    /* renamed from: e */
    public final transient Integer f25157e;

    /* renamed from: f */
    public final transient Integer f25158f;

    /* renamed from: g */
    public final transient boolean f25159g;

    /* renamed from: h */
    public final transient boolean f25160h;

    /* renamed from: i */
    public final transient boolean f25161i;

    /* renamed from: j */
    public final transient boolean f25162j;

    /* renamed from: k */
    public final transient boolean f25163k;

    /* renamed from: l */
    public final transient boolean f25164l;

    /* compiled from: SectionParameters.java */
    /* renamed from: j.a.a.a.c$b */
    /* loaded from: classes2.dex */
    public static class C11125b {

        /* renamed from: a */
        private transient Integer f25165a;

        /* renamed from: b */
        private transient Integer f25166b;

        /* renamed from: c */
        private transient Integer f25167c;

        /* renamed from: d */
        private transient Integer f25168d;

        /* renamed from: e */
        private transient Integer f25169e;

        /* renamed from: f */
        private transient Integer f25170f;

        /* renamed from: g */
        private transient boolean f25171g;

        /* renamed from: h */
        private transient boolean f25172h;

        /* renamed from: i */
        private transient boolean f25173i;

        /* renamed from: j */
        private transient boolean f25174j;

        /* renamed from: k */
        private transient boolean f25175k;

        /* renamed from: l */
        private transient boolean f25176l;

        /* renamed from: m */
        public C11123c m11626m() {
            return new C11123c(this);
        }

        /* renamed from: n */
        public C11125b m11625n(int i) {
            this.f25166b = Integer.valueOf(i);
            return this;
        }

        /* renamed from: o */
        public C11125b m11624o(int i) {
            this.f25165a = Integer.valueOf(i);
            return this;
        }

        private C11125b() {
        }
    }

    /* renamed from: a */
    public static C11125b m11639a() {
        return new C11125b();
    }

    private C11123c(C11125b c11125b) {
        this.f25153a = c11125b.f25165a;
        this.f25154b = c11125b.f25166b;
        this.f25155c = c11125b.f25167c;
        this.f25156d = c11125b.f25168d;
        this.f25157e = c11125b.f25169e;
        this.f25158f = c11125b.f25170f;
        this.f25159g = c11125b.f25171g;
        this.f25160h = c11125b.f25172h;
        this.f25161i = c11125b.f25173i;
        this.f25162j = c11125b.f25174j;
        this.f25163k = c11125b.f25175k;
        this.f25164l = c11125b.f25176l;
        if (this.f25153a != null && this.f25159g) {
            throw new IllegalArgumentException("itemResourceId and itemViewWillBeProvided cannot both be set");
        }
        if (this.f25153a == null && !this.f25159g) {
            throw new IllegalArgumentException("Either itemResourceId or itemViewWillBeProvided must be set");
        }
        if (this.f25154b != null && this.f25160h) {
            throw new IllegalArgumentException("headerResourceId and headerViewWillBeProvided cannot both be set");
        }
        if (this.f25155c != null && this.f25161i) {
            throw new IllegalArgumentException("footerResourceId and footerViewWillBeProvided cannot both be set");
        }
        if (this.f25156d != null && this.f25162j) {
            throw new IllegalArgumentException("loadingResourceId and loadingViewWillBeProvided cannot both be set");
        }
        if (this.f25157e != null && this.f25163k) {
            throw new IllegalArgumentException("failedResourceId and failedViewWillBeProvided cannot both be set");
        }
        if (this.f25158f != null && this.f25164l) {
            throw new IllegalArgumentException("emptyResourceId and emptyViewWillBeProvided cannot both be set");
        }
    }
}
