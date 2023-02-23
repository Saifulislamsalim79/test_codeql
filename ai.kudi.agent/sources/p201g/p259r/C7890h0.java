package p201g.p259r;

import androidx.recyclerview.widget.C1713j;
import androidx.recyclerview.widget.InterfaceC1738r;
import java.util.Collection;
import java.util.Iterator;
import kotlin.e0.d.l;
import kotlin.p491i0.C11837e;
import kotlin.p491i0.C11841h;
import kotlin.p557z.AbstractC13711l0;
/* compiled from: NullPaddedListDiffHelper.kt */
/* renamed from: g.r.h0 */
/* loaded from: classes2.dex */
public final class C7890h0 {

    /* compiled from: NullPaddedListDiffHelper.kt */
    /* renamed from: g.r.h0$a */
    /* loaded from: classes2.dex */
    public static final class C7891a extends C1713j.AbstractC1715b {

        /* renamed from: a */
        final /* synthetic */ InterfaceC7885g0<T> f18893a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC7885g0<T> f18894b;

        /* renamed from: c */
        final /* synthetic */ C1713j.AbstractC1719f<T> f18895c;

        /* renamed from: d */
        final /* synthetic */ int f18896d;

        /* renamed from: e */
        final /* synthetic */ int f18897e;

        C7891a(InterfaceC7885g0<T> interfaceC7885g0, InterfaceC7885g0<T> interfaceC7885g02, C1713j.AbstractC1719f<T> abstractC1719f, int i, int i2) {
            this.f18893a = interfaceC7885g0;
            this.f18894b = interfaceC7885g02;
            this.f18895c = abstractC1719f;
            this.f18896d = i;
            this.f18897e = i2;
        }

        @Override // androidx.recyclerview.widget.C1713j.AbstractC1715b
        public boolean areContentsTheSame(int i, int i2) {
            Object mo16936d = this.f18893a.mo16936d(i);
            Object mo16936d2 = this.f18894b.mo16936d(i2);
            if (mo16936d == mo16936d2) {
                return true;
            }
            return this.f18895c.areContentsTheSame(mo16936d, mo16936d2);
        }

        @Override // androidx.recyclerview.widget.C1713j.AbstractC1715b
        public boolean areItemsTheSame(int i, int i2) {
            Object mo16936d = this.f18893a.mo16936d(i);
            Object mo16936d2 = this.f18894b.mo16936d(i2);
            if (mo16936d == mo16936d2) {
                return true;
            }
            return this.f18895c.areItemsTheSame(mo16936d, mo16936d2);
        }

        @Override // androidx.recyclerview.widget.C1713j.AbstractC1715b
        public Object getChangePayload(int i, int i2) {
            Object mo16936d = this.f18893a.mo16936d(i);
            Object mo16936d2 = this.f18894b.mo16936d(i2);
            if (mo16936d == mo16936d2) {
                return Boolean.TRUE;
            }
            return this.f18895c.getChangePayload(mo16936d, mo16936d2);
        }

        @Override // androidx.recyclerview.widget.C1713j.AbstractC1715b
        public int getNewListSize() {
            return this.f18897e;
        }

        @Override // androidx.recyclerview.widget.C1713j.AbstractC1715b
        public int getOldListSize() {
            return this.f18896d;
        }
    }

    /* renamed from: a */
    public static final <T> C7880f0 m17109a(InterfaceC7885g0<T> interfaceC7885g0, InterfaceC7885g0<T> interfaceC7885g02, C1713j.AbstractC1719f<T> abstractC1719f) {
        C11837e m10262j;
        boolean z;
        l.f(interfaceC7885g0, "<this>");
        l.f(interfaceC7885g02, "newList");
        l.f(abstractC1719f, "diffCallback");
        C7891a c7891a = new C7891a(interfaceC7885g0, interfaceC7885g02, abstractC1719f, interfaceC7885g0.mo16939a(), interfaceC7885g02.mo16939a());
        boolean z2 = true;
        C1713j.C1718e m34728c = C1713j.m34728c(c7891a, true);
        l.e(m34728c, "NullPaddedList<T>.comput…    },\n        true\n    )");
        m10262j = C11841h.m10262j(0, interfaceC7885g0.mo16939a());
        if (!(m10262j instanceof Collection) || !((Collection) m10262j).isEmpty()) {
            Iterator<Integer> it = m10262j.iterator();
            while (it.hasNext()) {
                if (m34728c.m34718b(((AbstractC13711l0) it).mo4069b()) != -1) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
        }
        z2 = false;
        return new C7880f0(m34728c, z2);
    }

    /* renamed from: b */
    public static final <T> void m17108b(InterfaceC7885g0<T> interfaceC7885g0, InterfaceC1738r interfaceC1738r, InterfaceC7885g0<T> interfaceC7885g02, C7880f0 c7880f0) {
        l.f(interfaceC7885g0, "<this>");
        l.f(interfaceC1738r, "callback");
        l.f(interfaceC7885g02, "newList");
        l.f(c7880f0, "diffResult");
        if (c7880f0.m17114b()) {
            C7900i0.f18931a.m17099a(interfaceC7885g0, interfaceC7885g02, interfaceC1738r, c7880f0);
        } else {
            C7986o.f19237a.m16940b(interfaceC1738r, interfaceC7885g0, interfaceC7885g02);
        }
    }

    /* renamed from: c */
    public static final int m17107c(InterfaceC7885g0<?> interfaceC7885g0, C7880f0 c7880f0, InterfaceC7885g0<?> interfaceC7885g02, int i) {
        C11837e m10262j;
        int m10265g;
        int m34718b;
        C11837e m10262j2;
        int m10265g2;
        l.f(interfaceC7885g0, "<this>");
        l.f(c7880f0, "diffResult");
        l.f(interfaceC7885g02, "newList");
        if (!c7880f0.m17114b()) {
            m10262j2 = C11841h.m10262j(0, interfaceC7885g02.getSize());
            m10265g2 = C11841h.m10265g(i, m10262j2);
            return m10265g2;
        }
        int mo16938b = i - interfaceC7885g0.mo16938b();
        if (mo16938b >= 0 && mo16938b < interfaceC7885g0.mo16939a()) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                int i4 = ((i2 / 2) * (i2 % 2 == 1 ? -1 : 1)) + mo16938b;
                if (i4 >= 0 && i4 < interfaceC7885g0.mo16939a() && (m34718b = c7880f0.m17115a().m34718b(i4)) != -1) {
                    return m34718b + interfaceC7885g02.mo16938b();
                }
                if (i3 > 29) {
                    break;
                }
                i2 = i3;
            }
        }
        m10262j = C11841h.m10262j(0, interfaceC7885g02.getSize());
        m10265g = C11841h.m10265g(i, m10262j);
        return m10265g;
    }
}
