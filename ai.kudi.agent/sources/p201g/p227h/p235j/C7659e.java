package p201g.p227h.p235j;

import java.util.Locale;
/* compiled from: TextDirectionHeuristicsCompat.java */
/* renamed from: g.h.j.e */
/* loaded from: classes2.dex */
public final class C7659e {

    /* renamed from: a */
    public static final InterfaceC7658d f18381a = new C7664e(null, false);

    /* renamed from: b */
    public static final InterfaceC7658d f18382b = new C7664e(null, true);

    /* renamed from: c */
    public static final InterfaceC7658d f18383c = new C7664e(C7661b.f18387a, false);

    /* renamed from: d */
    public static final InterfaceC7658d f18384d = new C7664e(C7661b.f18387a, true);

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* renamed from: g.h.j.e$a */
    /* loaded from: classes2.dex */
    private static class C7660a implements InterfaceC7662c {

        /* renamed from: b */
        static final C7660a f18385b = new C7660a(true);

        /* renamed from: a */
        private final boolean f18386a;

        private C7660a(boolean z) {
            this.f18386a = z;
        }

        @Override // p201g.p227h.p235j.C7659e.InterfaceC7662c
        /* renamed from: a */
        public int mo17888a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int m17890a = C7659e.m17890a(Character.getDirectionality(charSequence.charAt(i)));
                if (m17890a != 0) {
                    if (m17890a != 1) {
                        continue;
                        i++;
                    } else if (!this.f18386a) {
                        return 1;
                    }
                } else if (this.f18386a) {
                    return 0;
                }
                z = true;
                i++;
            }
            if (z) {
                return this.f18386a ? 1 : 0;
            }
            return 2;
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* renamed from: g.h.j.e$b */
    /* loaded from: classes2.dex */
    private static class C7661b implements InterfaceC7662c {

        /* renamed from: a */
        static final C7661b f18387a = new C7661b();

        private C7661b() {
        }

        @Override // p201g.p227h.p235j.C7659e.InterfaceC7662c
        /* renamed from: a */
        public int mo17888a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                i4 = C7659e.m17889b(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return i4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* renamed from: g.h.j.e$c */
    /* loaded from: classes2.dex */
    public interface InterfaceC7662c {
        /* renamed from: a */
        int mo17888a(CharSequence charSequence, int i, int i2);
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* renamed from: g.h.j.e$d */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC7663d implements InterfaceC7658d {

        /* renamed from: a */
        private final InterfaceC7662c f18388a;

        AbstractC7663d(InterfaceC7662c interfaceC7662c) {
            this.f18388a = interfaceC7662c;
        }

        /* renamed from: c */
        private boolean m17886c(CharSequence charSequence, int i, int i2) {
            int mo17888a = this.f18388a.mo17888a(charSequence, i, i2);
            if (mo17888a != 0) {
                if (mo17888a != 1) {
                    return mo17885b();
                }
                return false;
            }
            return true;
        }

        @Override // p201g.p227h.p235j.InterfaceC7658d
        /* renamed from: a */
        public boolean mo17887a(CharSequence charSequence, int i, int i2) {
            if (charSequence != null && i >= 0 && i2 >= 0 && charSequence.length() - i2 >= i) {
                if (this.f18388a == null) {
                    return mo17885b();
                }
                return m17886c(charSequence, i, i2);
            }
            throw new IllegalArgumentException();
        }

        /* renamed from: b */
        protected abstract boolean mo17885b();
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* renamed from: g.h.j.e$e */
    /* loaded from: classes2.dex */
    private static class C7664e extends AbstractC7663d {

        /* renamed from: b */
        private final boolean f18389b;

        C7664e(InterfaceC7662c interfaceC7662c, boolean z) {
            super(interfaceC7662c);
            this.f18389b = z;
        }

        @Override // p201g.p227h.p235j.C7659e.AbstractC7663d
        /* renamed from: b */
        protected boolean mo17885b() {
            return this.f18389b;
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* renamed from: g.h.j.e$f */
    /* loaded from: classes2.dex */
    private static class C7665f extends AbstractC7663d {

        /* renamed from: b */
        static final C7665f f18390b = new C7665f();

        C7665f() {
            super(null);
        }

        @Override // p201g.p227h.p235j.C7659e.AbstractC7663d
        /* renamed from: b */
        protected boolean mo17885b() {
            return C7666f.m17883b(Locale.getDefault()) == 1;
        }
    }

    static {
        C7660a c7660a = C7660a.f18385b;
        C7665f c7665f = C7665f.f18390b;
    }

    /* renamed from: a */
    static int m17890a(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    /* renamed from: b */
    static int m17889b(int i) {
        if (i != 0) {
            if (i == 1 || i == 2) {
                return 0;
            }
            switch (i) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
