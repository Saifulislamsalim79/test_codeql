package androidx.recyclerview.widget;

import p201g.p218e.C7526d;
/* compiled from: StableIdStorage.java */
/* renamed from: androidx.recyclerview.widget.a0 */
/* loaded from: classes2.dex */
interface InterfaceC1664a0 {

    /* compiled from: StableIdStorage.java */
    /* renamed from: androidx.recyclerview.widget.a0$a */
    /* loaded from: classes2.dex */
    public static class C1665a implements InterfaceC1664a0 {

        /* renamed from: a */
        long f5131a = 0;

        /* compiled from: StableIdStorage.java */
        /* renamed from: androidx.recyclerview.widget.a0$a$a */
        /* loaded from: classes2.dex */
        class C1666a implements InterfaceC1671d {

            /* renamed from: a */
            private final C7526d<Long> f5132a = new C7526d<>();

            C1666a() {
            }

            @Override // androidx.recyclerview.widget.InterfaceC1664a0.InterfaceC1671d
            /* renamed from: a */
            public long mo34863a(long j) {
                Long m18499f = this.f5132a.m18499f(j);
                if (m18499f == null) {
                    m18499f = Long.valueOf(C1665a.this.m34865b());
                    this.f5132a.m18494k(j, m18499f);
                }
                return m18499f.longValue();
            }
        }

        @Override // androidx.recyclerview.widget.InterfaceC1664a0
        /* renamed from: a */
        public InterfaceC1671d mo34864a() {
            return new C1666a();
        }

        /* renamed from: b */
        long m34865b() {
            long j = this.f5131a;
            this.f5131a = 1 + j;
            return j;
        }
    }

    /* compiled from: StableIdStorage.java */
    /* renamed from: androidx.recyclerview.widget.a0$b */
    /* loaded from: classes2.dex */
    public static class C1667b implements InterfaceC1664a0 {

        /* renamed from: a */
        private final InterfaceC1671d f5134a = new C1668a(this);

        /* compiled from: StableIdStorage.java */
        /* renamed from: androidx.recyclerview.widget.a0$b$a */
        /* loaded from: classes2.dex */
        class C1668a implements InterfaceC1671d {
            C1668a(C1667b c1667b) {
            }

            @Override // androidx.recyclerview.widget.InterfaceC1664a0.InterfaceC1671d
            /* renamed from: a */
            public long mo34863a(long j) {
                return -1L;
            }
        }

        @Override // androidx.recyclerview.widget.InterfaceC1664a0
        /* renamed from: a */
        public InterfaceC1671d mo34864a() {
            return this.f5134a;
        }
    }

    /* compiled from: StableIdStorage.java */
    /* renamed from: androidx.recyclerview.widget.a0$c */
    /* loaded from: classes2.dex */
    public static class C1669c implements InterfaceC1664a0 {

        /* renamed from: a */
        private final InterfaceC1671d f5135a = new C1670a(this);

        /* compiled from: StableIdStorage.java */
        /* renamed from: androidx.recyclerview.widget.a0$c$a */
        /* loaded from: classes2.dex */
        class C1670a implements InterfaceC1671d {
            C1670a(C1669c c1669c) {
            }

            @Override // androidx.recyclerview.widget.InterfaceC1664a0.InterfaceC1671d
            /* renamed from: a */
            public long mo34863a(long j) {
                return j;
            }
        }

        @Override // androidx.recyclerview.widget.InterfaceC1664a0
        /* renamed from: a */
        public InterfaceC1671d mo34864a() {
            return this.f5135a;
        }
    }

    /* compiled from: StableIdStorage.java */
    /* renamed from: androidx.recyclerview.widget.a0$d */
    /* loaded from: classes2.dex */
    public interface InterfaceC1671d {
        /* renamed from: a */
        long mo34863a(long j);
    }

    /* renamed from: a */
    InterfaceC1671d mo34864a();
}
