package p201g.p259r;

import androidx.recyclerview.widget.InterfaceC1738r;
import kotlin.e0.d.l;
import kotlin.p491i0.C11841h;
/* compiled from: NullPaddedListDiffHelper.kt */
/* renamed from: g.r.i0 */
/* loaded from: classes2.dex */
public final class C7900i0 {

    /* renamed from: a */
    public static final C7900i0 f18931a = new C7900i0();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: NullPaddedListDiffHelper.kt */
    /* renamed from: g.r.i0$a */
    /* loaded from: classes2.dex */
    public static final class C7901a<T> implements InterfaceC1738r {

        /* renamed from: a */
        private final InterfaceC7885g0<T> f18932a;

        /* renamed from: b */
        private final InterfaceC7885g0<T> f18933b;

        /* renamed from: c */
        private final InterfaceC1738r f18934c;

        /* renamed from: d */
        private int f18935d;

        /* renamed from: e */
        private int f18936e;

        /* renamed from: f */
        private int f18937f;

        /* renamed from: g */
        private int f18938g;

        /* renamed from: h */
        private int f18939h;

        public C7901a(InterfaceC7885g0<T> interfaceC7885g0, InterfaceC7885g0<T> interfaceC7885g02, InterfaceC1738r interfaceC1738r) {
            l.f(interfaceC7885g0, "oldList");
            l.f(interfaceC7885g02, "newList");
            l.f(interfaceC1738r, "callback");
            this.f18932a = interfaceC7885g0;
            this.f18933b = interfaceC7885g02;
            this.f18934c = interfaceC1738r;
            this.f18935d = interfaceC7885g0.mo16938b();
            this.f18936e = this.f18932a.mo16937c();
            this.f18937f = this.f18932a.mo16939a();
            this.f18938g = 1;
            this.f18939h = 1;
        }

        /* renamed from: f */
        private final boolean m17093f(int i, int i2) {
            if (i >= this.f18937f && this.f18939h != 2) {
                int min = Math.min(i2, this.f18936e);
                if (min > 0) {
                    this.f18939h = 3;
                    this.f18934c.mo17095d(this.f18935d + i, min, EnumC7976n.PLACEHOLDER_TO_ITEM);
                    this.f18936e -= min;
                }
                int i3 = i2 - min;
                if (i3 > 0) {
                    this.f18934c.mo17098a(i + min + this.f18935d, i3);
                    return true;
                }
                return true;
            }
            return false;
        }

        /* renamed from: g */
        private final boolean m17092g(int i, int i2) {
            if (i <= 0 && this.f18938g != 2) {
                int min = Math.min(i2, this.f18935d);
                if (min > 0) {
                    this.f18938g = 3;
                    this.f18934c.mo17095d((0 - min) + this.f18935d, min, EnumC7976n.PLACEHOLDER_TO_ITEM);
                    this.f18935d -= min;
                }
                int i3 = i2 - min;
                if (i3 > 0) {
                    this.f18934c.mo17098a(this.f18935d + 0, i3);
                    return true;
                }
                return true;
            }
            return false;
        }

        /* renamed from: h */
        private final boolean m17091h(int i, int i2) {
            int m10271a;
            if (i + i2 >= this.f18937f && this.f18939h != 3) {
                m10271a = C11841h.m10271a(Math.min(this.f18933b.mo16937c() - this.f18936e, i2), 0);
                int i3 = i2 - m10271a;
                if (m10271a > 0) {
                    this.f18939h = 2;
                    this.f18934c.mo17095d(this.f18935d + i, m10271a, EnumC7976n.ITEM_TO_PLACEHOLDER);
                    this.f18936e += m10271a;
                }
                if (i3 > 0) {
                    this.f18934c.mo17097b(i + m10271a + this.f18935d, i3);
                    return true;
                }
                return true;
            }
            return false;
        }

        /* renamed from: i */
        private final boolean m17090i(int i, int i2) {
            int m10271a;
            if (i <= 0 && this.f18938g != 3) {
                m10271a = C11841h.m10271a(Math.min(this.f18933b.mo16938b() - this.f18935d, i2), 0);
                int i3 = i2 - m10271a;
                if (i3 > 0) {
                    this.f18934c.mo17097b(this.f18935d + 0, i3);
                }
                if (m10271a > 0) {
                    this.f18938g = 2;
                    this.f18934c.mo17095d(this.f18935d + 0, m10271a, EnumC7976n.ITEM_TO_PLACEHOLDER);
                    this.f18935d += m10271a;
                    return true;
                }
                return true;
            }
            return false;
        }

        /* renamed from: j */
        private final void m17089j() {
            int min = Math.min(this.f18932a.mo16938b(), this.f18935d);
            int mo16938b = this.f18933b.mo16938b() - this.f18935d;
            if (mo16938b > 0) {
                if (min > 0) {
                    this.f18934c.mo17095d(0, min, EnumC7976n.PLACEHOLDER_POSITION_CHANGE);
                }
                this.f18934c.mo17098a(0, mo16938b);
            } else if (mo16938b < 0) {
                this.f18934c.mo17097b(0, -mo16938b);
                int i = min + mo16938b;
                if (i > 0) {
                    this.f18934c.mo17095d(0, i, EnumC7976n.PLACEHOLDER_POSITION_CHANGE);
                }
            }
            this.f18935d = this.f18933b.mo16938b();
        }

        /* renamed from: l */
        private final void m17087l() {
            int min = Math.min(this.f18932a.mo16937c(), this.f18936e);
            int mo16937c = this.f18933b.mo16937c();
            int i = this.f18936e;
            int i2 = mo16937c - i;
            int i3 = this.f18935d + this.f18937f + i;
            int i4 = i3 - min;
            boolean z = i4 != this.f18932a.getSize() - min;
            if (i2 > 0) {
                this.f18934c.mo17098a(i3, i2);
            } else if (i2 < 0) {
                this.f18934c.mo17097b(i3 + i2, -i2);
                min += i2;
            }
            if (min > 0 && z) {
                this.f18934c.mo17095d(i4, min, EnumC7976n.PLACEHOLDER_POSITION_CHANGE);
            }
            this.f18936e = this.f18933b.mo16937c();
        }

        @Override // androidx.recyclerview.widget.InterfaceC1738r
        /* renamed from: a */
        public void mo17098a(int i, int i2) {
            if (!m17093f(i, i2) && !m17092g(i, i2)) {
                this.f18934c.mo17098a(i + this.f18935d, i2);
            }
            this.f18937f += i2;
        }

        @Override // androidx.recyclerview.widget.InterfaceC1738r
        /* renamed from: b */
        public void mo17097b(int i, int i2) {
            if (!m17091h(i, i2) && !m17090i(i, i2)) {
                this.f18934c.mo17097b(i + this.f18935d, i2);
            }
            this.f18937f -= i2;
        }

        @Override // androidx.recyclerview.widget.InterfaceC1738r
        /* renamed from: c */
        public void mo17096c(int i, int i2) {
            this.f18934c.mo17096c(i + this.f18935d, i2 + this.f18935d);
        }

        @Override // androidx.recyclerview.widget.InterfaceC1738r
        /* renamed from: d */
        public void mo17095d(int i, int i2, Object obj) {
            this.f18934c.mo17095d(i + this.f18935d, i2, obj);
        }

        /* renamed from: k */
        public final void m17088k() {
            m17089j();
            m17087l();
        }
    }

    private C7900i0() {
    }

    /* renamed from: a */
    public final <T> void m17099a(InterfaceC7885g0<T> interfaceC7885g0, InterfaceC7885g0<T> interfaceC7885g02, InterfaceC1738r interfaceC1738r, C7880f0 c7880f0) {
        l.f(interfaceC7885g0, "oldList");
        l.f(interfaceC7885g02, "newList");
        l.f(interfaceC1738r, "callback");
        l.f(c7880f0, "diffResult");
        C7901a c7901a = new C7901a(interfaceC7885g0, interfaceC7885g02, interfaceC1738r);
        c7880f0.m17115a().m34717c(c7901a);
        c7901a.m17088k();
    }
}
