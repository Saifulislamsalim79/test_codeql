package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
/* compiled from: DiffUtil.java */
/* renamed from: androidx.recyclerview.widget.j */
/* loaded from: classes2.dex */
public class C1713j {

    /* renamed from: a */
    private static final Comparator<C1717d> f5264a = new C1714a();

    /* compiled from: DiffUtil.java */
    /* renamed from: androidx.recyclerview.widget.j$a */
    /* loaded from: classes2.dex */
    class C1714a implements Comparator<C1717d> {
        C1714a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C1717d c1717d, C1717d c1717d2) {
            return c1717d.f5267a - c1717d2.f5267a;
        }
    }

    /* compiled from: DiffUtil.java */
    /* renamed from: androidx.recyclerview.widget.j$b */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC1715b {
        public abstract boolean areContentsTheSame(int i, int i2);

        public abstract boolean areItemsTheSame(int i, int i2);

        public Object getChangePayload(int i, int i2) {
            return null;
        }

        public abstract int getNewListSize();

        public abstract int getOldListSize();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DiffUtil.java */
    /* renamed from: androidx.recyclerview.widget.j$c */
    /* loaded from: classes2.dex */
    public static class C1716c {

        /* renamed from: a */
        private final int[] f5265a;

        /* renamed from: b */
        private final int f5266b;

        C1716c(int i) {
            int[] iArr = new int[i];
            this.f5265a = iArr;
            this.f5266b = iArr.length / 2;
        }

        /* renamed from: a */
        int[] m34724a() {
            return this.f5265a;
        }

        /* renamed from: b */
        int m34723b(int i) {
            return this.f5265a[i + this.f5266b];
        }

        /* renamed from: c */
        void m34722c(int i, int i2) {
            this.f5265a[i + this.f5266b] = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DiffUtil.java */
    /* renamed from: androidx.recyclerview.widget.j$d */
    /* loaded from: classes2.dex */
    public static class C1717d {

        /* renamed from: a */
        public final int f5267a;

        /* renamed from: b */
        public final int f5268b;

        /* renamed from: c */
        public final int f5269c;

        C1717d(int i, int i2, int i3) {
            this.f5267a = i;
            this.f5268b = i2;
            this.f5269c = i3;
        }

        /* renamed from: a */
        int m34721a() {
            return this.f5267a + this.f5269c;
        }

        /* renamed from: b */
        int m34720b() {
            return this.f5268b + this.f5269c;
        }
    }

    /* compiled from: DiffUtil.java */
    /* renamed from: androidx.recyclerview.widget.j$e */
    /* loaded from: classes2.dex */
    public static class C1718e {

        /* renamed from: a */
        private final List<C1717d> f5270a;

        /* renamed from: b */
        private final int[] f5271b;

        /* renamed from: c */
        private final int[] f5272c;

        /* renamed from: d */
        private final AbstractC1715b f5273d;

        /* renamed from: e */
        private final int f5274e;

        /* renamed from: f */
        private final int f5275f;

        /* renamed from: g */
        private final boolean f5276g;

        C1718e(AbstractC1715b abstractC1715b, List<C1717d> list, int[] iArr, int[] iArr2, boolean z) {
            this.f5270a = list;
            this.f5271b = iArr;
            this.f5272c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(this.f5272c, 0);
            this.f5273d = abstractC1715b;
            this.f5274e = abstractC1715b.getOldListSize();
            this.f5275f = abstractC1715b.getNewListSize();
            this.f5276g = z;
            m34719a();
            m34714f();
        }

        /* renamed from: a */
        private void m34719a() {
            C1717d c1717d = this.f5270a.isEmpty() ? null : this.f5270a.get(0);
            if (c1717d == null || c1717d.f5267a != 0 || c1717d.f5268b != 0) {
                this.f5270a.add(0, new C1717d(0, 0, 0));
            }
            this.f5270a.add(new C1717d(this.f5274e, this.f5275f, 0));
        }

        /* renamed from: e */
        private void m34715e(int i) {
            int size = this.f5270a.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                C1717d c1717d = this.f5270a.get(i3);
                while (i2 < c1717d.f5268b) {
                    if (this.f5272c[i2] == 0 && this.f5273d.areItemsTheSame(i, i2)) {
                        int i4 = this.f5273d.areContentsTheSame(i, i2) ? 8 : 4;
                        this.f5271b[i] = (i2 << 4) | i4;
                        this.f5272c[i2] = (i << 4) | i4;
                        return;
                    }
                    i2++;
                }
                i2 = c1717d.m34720b();
            }
        }

        /* renamed from: f */
        private void m34714f() {
            for (C1717d c1717d : this.f5270a) {
                for (int i = 0; i < c1717d.f5269c; i++) {
                    int i2 = c1717d.f5267a + i;
                    int i3 = c1717d.f5268b + i;
                    int i4 = this.f5273d.areContentsTheSame(i2, i3) ? 1 : 2;
                    this.f5271b[i2] = (i3 << 4) | i4;
                    this.f5272c[i3] = (i2 << 4) | i4;
                }
            }
            if (this.f5276g) {
                m34713g();
            }
        }

        /* renamed from: g */
        private void m34713g() {
            int i = 0;
            for (C1717d c1717d : this.f5270a) {
                while (i < c1717d.f5267a) {
                    if (this.f5271b[i] == 0) {
                        m34715e(i);
                    }
                    i++;
                }
                i = c1717d.m34721a();
            }
        }

        /* renamed from: h */
        private static C1720g m34712h(Collection<C1720g> collection, int i, boolean z) {
            C1720g c1720g;
            Iterator<C1720g> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    c1720g = null;
                    break;
                }
                c1720g = it.next();
                if (c1720g.f5277a == i && c1720g.f5279c == z) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                C1720g next = it.next();
                if (z) {
                    next.f5278b--;
                } else {
                    next.f5278b++;
                }
            }
            return c1720g;
        }

        /* renamed from: b */
        public int m34718b(int i) {
            if (i >= 0 && i < this.f5274e) {
                int i2 = this.f5271b[i];
                if ((i2 & 15) == 0) {
                    return -1;
                }
                return i2 >> 4;
            }
            throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + i + ", old list size = " + this.f5274e);
        }

        /* renamed from: c */
        public void m34717c(InterfaceC1738r interfaceC1738r) {
            C1693e c1693e;
            int i;
            if (interfaceC1738r instanceof C1693e) {
                c1693e = (C1693e) interfaceC1738r;
            } else {
                c1693e = new C1693e(interfaceC1738r);
            }
            int i2 = this.f5274e;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i3 = this.f5274e;
            int i4 = this.f5275f;
            for (int size = this.f5270a.size() - 1; size >= 0; size--) {
                C1717d c1717d = this.f5270a.get(size);
                int m34721a = c1717d.m34721a();
                int m34720b = c1717d.m34720b();
                while (true) {
                    if (i3 <= m34721a) {
                        break;
                    }
                    i3--;
                    int i5 = this.f5271b[i3];
                    if ((i5 & 12) != 0) {
                        int i6 = i5 >> 4;
                        C1720g m34712h = m34712h(arrayDeque, i6, false);
                        if (m34712h != null) {
                            int i7 = (i2 - m34712h.f5278b) - 1;
                            c1693e.mo17096c(i3, i7);
                            if ((i5 & 4) != 0) {
                                c1693e.mo17095d(i7, 1, this.f5273d.getChangePayload(i3, i6));
                            }
                        } else {
                            arrayDeque.add(new C1720g(i3, (i2 - i3) - 1, true));
                        }
                    } else {
                        c1693e.mo17097b(i3, 1);
                        i2--;
                    }
                }
                while (i4 > m34720b) {
                    i4--;
                    int i8 = this.f5272c[i4];
                    if ((i8 & 12) != 0) {
                        int i9 = i8 >> 4;
                        C1720g m34712h2 = m34712h(arrayDeque, i9, true);
                        if (m34712h2 == null) {
                            arrayDeque.add(new C1720g(i4, i2 - i3, false));
                        } else {
                            c1693e.mo17096c((i2 - m34712h2.f5278b) - 1, i3);
                            if ((i8 & 4) != 0) {
                                c1693e.mo17095d(i3, 1, this.f5273d.getChangePayload(i9, i4));
                            }
                        }
                    } else {
                        c1693e.mo17098a(i3, 1);
                        i2++;
                    }
                }
                int i10 = c1717d.f5267a;
                int i11 = c1717d.f5268b;
                for (i = 0; i < c1717d.f5269c; i++) {
                    if ((this.f5271b[i10] & 15) == 2) {
                        c1693e.mo17095d(i10, 1, this.f5273d.getChangePayload(i10, i11));
                    }
                    i10++;
                    i11++;
                }
                i3 = c1717d.f5267a;
                i4 = c1717d.f5268b;
            }
            c1693e.m34811e();
        }

        /* renamed from: d */
        public void m34716d(RecyclerView.AbstractC1623h abstractC1623h) {
            m34717c(new C1672b(abstractC1623h));
        }
    }

    /* compiled from: DiffUtil.java */
    /* renamed from: androidx.recyclerview.widget.j$f */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC1719f<T> {
        public abstract boolean areContentsTheSame(T t, T t2);

        public abstract boolean areItemsTheSame(T t, T t2);

        public Object getChangePayload(T t, T t2) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DiffUtil.java */
    /* renamed from: androidx.recyclerview.widget.j$g */
    /* loaded from: classes2.dex */
    public static class C1720g {

        /* renamed from: a */
        int f5277a;

        /* renamed from: b */
        int f5278b;

        /* renamed from: c */
        boolean f5279c;

        C1720g(int i, int i2, boolean z) {
            this.f5277a = i;
            this.f5278b = i2;
            this.f5279c = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DiffUtil.java */
    /* renamed from: androidx.recyclerview.widget.j$h */
    /* loaded from: classes2.dex */
    public static class C1721h {

        /* renamed from: a */
        int f5280a;

        /* renamed from: b */
        int f5281b;

        /* renamed from: c */
        int f5282c;

        /* renamed from: d */
        int f5283d;

        public C1721h() {
        }

        /* renamed from: a */
        int m34711a() {
            return this.f5283d - this.f5282c;
        }

        /* renamed from: b */
        int m34710b() {
            return this.f5281b - this.f5280a;
        }

        public C1721h(int i, int i2, int i3, int i4) {
            this.f5280a = i;
            this.f5281b = i2;
            this.f5282c = i3;
            this.f5283d = i4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DiffUtil.java */
    /* renamed from: androidx.recyclerview.widget.j$i */
    /* loaded from: classes2.dex */
    public static class C1722i {

        /* renamed from: a */
        public int f5284a;

        /* renamed from: b */
        public int f5285b;

        /* renamed from: c */
        public int f5286c;

        /* renamed from: d */
        public int f5287d;

        /* renamed from: e */
        public boolean f5288e;

        C1722i() {
        }

        /* renamed from: a */
        int m34709a() {
            return Math.min(this.f5286c - this.f5284a, this.f5287d - this.f5285b);
        }

        /* renamed from: b */
        boolean m34708b() {
            return this.f5287d - this.f5285b != this.f5286c - this.f5284a;
        }

        /* renamed from: c */
        boolean m34707c() {
            return this.f5287d - this.f5285b > this.f5286c - this.f5284a;
        }

        /* renamed from: d */
        C1717d m34706d() {
            if (m34708b()) {
                if (this.f5288e) {
                    return new C1717d(this.f5284a, this.f5285b, m34709a());
                }
                if (m34707c()) {
                    return new C1717d(this.f5284a, this.f5285b + 1, m34709a());
                }
                return new C1717d(this.f5284a + 1, this.f5285b, m34709a());
            }
            int i = this.f5284a;
            return new C1717d(i, this.f5285b, this.f5286c - i);
        }
    }

    /* renamed from: a */
    private static C1722i m34730a(C1721h c1721h, AbstractC1715b abstractC1715b, C1716c c1716c, C1716c c1716c2, int i) {
        int m34723b;
        int i2;
        int i3;
        boolean z = (c1721h.m34710b() - c1721h.m34711a()) % 2 == 0;
        int m34710b = c1721h.m34710b() - c1721h.m34711a();
        int i4 = -i;
        for (int i5 = i4; i5 <= i; i5 += 2) {
            if (i5 != i4 && (i5 == i || c1716c2.m34723b(i5 + 1) >= c1716c2.m34723b(i5 - 1))) {
                m34723b = c1716c2.m34723b(i5 - 1);
                i2 = m34723b - 1;
            } else {
                m34723b = c1716c2.m34723b(i5 + 1);
                i2 = m34723b;
            }
            int i6 = c1721h.f5283d - ((c1721h.f5281b - i2) - i5);
            int i7 = (i == 0 || i2 != m34723b) ? i6 : i6 + 1;
            while (i2 > c1721h.f5280a && i6 > c1721h.f5282c && abstractC1715b.areItemsTheSame(i2 - 1, i6 - 1)) {
                i2--;
                i6--;
            }
            c1716c2.m34722c(i5, i2);
            if (z && (i3 = m34710b - i5) >= i4 && i3 <= i && c1716c.m34723b(i3) >= i2) {
                C1722i c1722i = new C1722i();
                c1722i.f5284a = i2;
                c1722i.f5285b = i6;
                c1722i.f5286c = m34723b;
                c1722i.f5287d = i7;
                c1722i.f5288e = true;
                return c1722i;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static C1718e m34729b(AbstractC1715b abstractC1715b) {
        return m34728c(abstractC1715b, true);
    }

    /* renamed from: c */
    public static C1718e m34728c(AbstractC1715b abstractC1715b, boolean z) {
        int oldListSize = abstractC1715b.getOldListSize();
        int newListSize = abstractC1715b.getNewListSize();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C1721h(0, oldListSize, 0, newListSize));
        int i = ((((oldListSize + newListSize) + 1) / 2) * 2) + 1;
        C1716c c1716c = new C1716c(i);
        C1716c c1716c2 = new C1716c(i);
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            C1721h c1721h = (C1721h) arrayList2.remove(arrayList2.size() - 1);
            C1722i m34726e = m34726e(c1721h, abstractC1715b, c1716c, c1716c2);
            if (m34726e != null) {
                if (m34726e.m34709a() > 0) {
                    arrayList.add(m34726e.m34706d());
                }
                C1721h c1721h2 = arrayList3.isEmpty() ? new C1721h() : (C1721h) arrayList3.remove(arrayList3.size() - 1);
                c1721h2.f5280a = c1721h.f5280a;
                c1721h2.f5282c = c1721h.f5282c;
                c1721h2.f5281b = m34726e.f5284a;
                c1721h2.f5283d = m34726e.f5285b;
                arrayList2.add(c1721h2);
                c1721h.f5281b = c1721h.f5281b;
                c1721h.f5283d = c1721h.f5283d;
                c1721h.f5280a = m34726e.f5286c;
                c1721h.f5282c = m34726e.f5287d;
                arrayList2.add(c1721h);
            } else {
                arrayList3.add(c1721h);
            }
        }
        Collections.sort(arrayList, f5264a);
        return new C1718e(abstractC1715b, arrayList, c1716c.m34724a(), c1716c2.m34724a(), z);
    }

    /* renamed from: d */
    private static C1722i m34727d(C1721h c1721h, AbstractC1715b abstractC1715b, C1716c c1716c, C1716c c1716c2, int i) {
        int m34723b;
        int i2;
        int i3;
        boolean z = Math.abs(c1721h.m34710b() - c1721h.m34711a()) % 2 == 1;
        int m34710b = c1721h.m34710b() - c1721h.m34711a();
        int i4 = -i;
        for (int i5 = i4; i5 <= i; i5 += 2) {
            if (i5 != i4 && (i5 == i || c1716c.m34723b(i5 + 1) <= c1716c.m34723b(i5 - 1))) {
                m34723b = c1716c.m34723b(i5 - 1);
                i2 = m34723b + 1;
            } else {
                m34723b = c1716c.m34723b(i5 + 1);
                i2 = m34723b;
            }
            int i6 = (c1721h.f5282c + (i2 - c1721h.f5280a)) - i5;
            int i7 = (i == 0 || i2 != m34723b) ? i6 : i6 - 1;
            while (i2 < c1721h.f5281b && i6 < c1721h.f5283d && abstractC1715b.areItemsTheSame(i2, i6)) {
                i2++;
                i6++;
            }
            c1716c.m34722c(i5, i2);
            if (z && (i3 = m34710b - i5) >= i4 + 1 && i3 <= i - 1 && c1716c2.m34723b(i3) <= i2) {
                C1722i c1722i = new C1722i();
                c1722i.f5284a = m34723b;
                c1722i.f5285b = i7;
                c1722i.f5286c = i2;
                c1722i.f5287d = i6;
                c1722i.f5288e = false;
                return c1722i;
            }
        }
        return null;
    }

    /* renamed from: e */
    private static C1722i m34726e(C1721h c1721h, AbstractC1715b abstractC1715b, C1716c c1716c, C1716c c1716c2) {
        if (c1721h.m34710b() >= 1 && c1721h.m34711a() >= 1) {
            int m34710b = ((c1721h.m34710b() + c1721h.m34711a()) + 1) / 2;
            c1716c.m34722c(1, c1721h.f5280a);
            c1716c2.m34722c(1, c1721h.f5281b);
            for (int i = 0; i < m34710b; i++) {
                C1722i m34727d = m34727d(c1721h, abstractC1715b, c1716c, c1716c2, i);
                if (m34727d != null) {
                    return m34727d;
                }
                C1722i m34730a = m34730a(c1721h, abstractC1715b, c1716c, c1716c2, i);
                if (m34730a != null) {
                    return m34730a;
                }
            }
        }
        return null;
    }
}
