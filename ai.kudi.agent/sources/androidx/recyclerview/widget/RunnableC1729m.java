package androidx.recyclerview.widget;

import androidx.core.p058os.C1382j;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GapWorker.java */
/* renamed from: androidx.recyclerview.widget.m */
/* loaded from: classes2.dex */
public final class RunnableC1729m implements Runnable {

    /* renamed from: w */
    static final ThreadLocal<RunnableC1729m> f5329w = new ThreadLocal<>();

    /* renamed from: x */
    static Comparator<C1732c> f5330x = new C1730a();

    /* renamed from: d */
    long f5332d;

    /* renamed from: e */
    long f5333e;

    /* renamed from: c */
    ArrayList<RecyclerView> f5331c = new ArrayList<>();

    /* renamed from: f */
    private ArrayList<C1732c> f5334f = new ArrayList<>();

    /* compiled from: GapWorker.java */
    /* renamed from: androidx.recyclerview.widget.m$a */
    /* loaded from: classes2.dex */
    class C1730a implements Comparator<C1732c> {
        C1730a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C1732c c1732c, C1732c c1732c2) {
            if ((c1732c.f5342d == null) != (c1732c2.f5342d == null)) {
                return c1732c.f5342d == null ? 1 : -1;
            }
            boolean z = c1732c.f5339a;
            if (z != c1732c2.f5339a) {
                return z ? -1 : 1;
            }
            int i = c1732c2.f5340b - c1732c.f5340b;
            if (i != 0) {
                return i;
            }
            int i2 = c1732c.f5341c - c1732c2.f5341c;
            if (i2 != 0) {
                return i2;
            }
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GapWorker.java */
    /* renamed from: androidx.recyclerview.widget.m$b */
    /* loaded from: classes2.dex */
    public static class C1731b implements RecyclerView.AbstractC1635p.InterfaceC1638c {

        /* renamed from: a */
        int f5335a;

        /* renamed from: b */
        int f5336b;

        /* renamed from: c */
        int[] f5337c;

        /* renamed from: d */
        int f5338d;

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p.InterfaceC1638c
        /* renamed from: a */
        public void mo34667a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i2 >= 0) {
                int i3 = this.f5338d * 2;
                int[] iArr = this.f5337c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f5337c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i3 >= iArr.length) {
                    int[] iArr3 = new int[i3 * 2];
                    this.f5337c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.f5337c;
                iArr4[i3] = i;
                iArr4[i3 + 1] = i2;
                this.f5338d++;
                return;
            }
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public void m34666b() {
            int[] iArr = this.f5337c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f5338d = 0;
        }

        /* renamed from: c */
        void m34665c(RecyclerView recyclerView, boolean z) {
            this.f5338d = 0;
            int[] iArr = this.f5337c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.AbstractC1635p abstractC1635p = recyclerView.f4891E;
            if (recyclerView.f4889D == null || abstractC1635p == null || !abstractC1635p.m35177A0()) {
                return;
            }
            if (z) {
                if (!recyclerView.f4934f.m34885p()) {
                    abstractC1635p.mo35082z(recyclerView.f4889D.getItemCount(), this);
                }
            } else if (!recyclerView.m35269p0()) {
                abstractC1635p.mo34951y(this.f5335a, this.f5336b, recyclerView.f4884A0, this);
            }
            int i = this.f5338d;
            if (i > abstractC1635p.f5022E) {
                abstractC1635p.f5022E = i;
                abstractC1635p.f5023F = z;
                recyclerView.f4930d.m35052K();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean m34664d(int i) {
            if (this.f5337c != null) {
                int i2 = this.f5338d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f5337c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* renamed from: e */
        void m34663e(int i, int i2) {
            this.f5335a = i;
            this.f5336b = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GapWorker.java */
    /* renamed from: androidx.recyclerview.widget.m$c */
    /* loaded from: classes2.dex */
    public static class C1732c {

        /* renamed from: a */
        public boolean f5339a;

        /* renamed from: b */
        public int f5340b;

        /* renamed from: c */
        public int f5341c;

        /* renamed from: d */
        public RecyclerView f5342d;

        /* renamed from: e */
        public int f5343e;

        C1732c() {
        }

        /* renamed from: a */
        public void m34662a() {
            this.f5339a = false;
            this.f5340b = 0;
            this.f5341c = 0;
            this.f5342d = null;
            this.f5343e = 0;
        }
    }

    /* renamed from: b */
    private void m34677b() {
        C1732c c1732c;
        int size = this.f5331c.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView = this.f5331c.get(i2);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f4959z0.m34665c(recyclerView, false);
                i += recyclerView.f4959z0.f5338d;
            }
        }
        this.f5334f.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = this.f5331c.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                C1731b c1731b = recyclerView2.f4959z0;
                int abs = Math.abs(c1731b.f5335a) + Math.abs(c1731b.f5336b);
                for (int i5 = 0; i5 < c1731b.f5338d * 2; i5 += 2) {
                    if (i3 >= this.f5334f.size()) {
                        c1732c = new C1732c();
                        this.f5334f.add(c1732c);
                    } else {
                        c1732c = this.f5334f.get(i3);
                    }
                    int i6 = c1731b.f5337c[i5 + 1];
                    c1732c.f5339a = i6 <= abs;
                    c1732c.f5340b = abs;
                    c1732c.f5341c = i6;
                    c1732c.f5342d = recyclerView2;
                    c1732c.f5343e = c1731b.f5337c[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.f5334f, f5330x);
    }

    /* renamed from: c */
    private void m34676c(C1732c c1732c, long j) {
        RecyclerView.AbstractC1620e0 m34670i = m34670i(c1732c.f5342d, c1732c.f5343e, c1732c.f5339a ? Long.MAX_VALUE : j);
        if (m34670i == null || m34670i.mNestedRecyclerView == null || !m34670i.isBound() || m34670i.isInvalid()) {
            return;
        }
        m34671h(m34670i.mNestedRecyclerView.get(), j);
    }

    /* renamed from: d */
    private void m34675d(long j) {
        for (int i = 0; i < this.f5334f.size(); i++) {
            C1732c c1732c = this.f5334f.get(i);
            if (c1732c.f5342d == null) {
                return;
            }
            m34676c(c1732c, j);
            c1732c.m34662a();
        }
    }

    /* renamed from: e */
    static boolean m34674e(RecyclerView recyclerView, int i) {
        int m34801j = recyclerView.f4952w.m34801j();
        for (int i2 = 0; i2 < m34801j; i2++) {
            RecyclerView.AbstractC1620e0 m35293h0 = RecyclerView.m35293h0(recyclerView.f4952w.m34802i(i2));
            if (m35293h0.mPosition == i && !m35293h0.isInvalid()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    private void m34671h(RecyclerView recyclerView, long j) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.f4925W && recyclerView.f4952w.m34801j() != 0) {
            recyclerView.m35317Y0();
        }
        C1731b c1731b = recyclerView.f4959z0;
        c1731b.m34665c(recyclerView, true);
        if (c1731b.f5338d != 0) {
            try {
                C1382j.m36160a("RV Nested Prefetch");
                recyclerView.f4884A0.m35213f(recyclerView.f4889D);
                for (int i = 0; i < c1731b.f5338d * 2; i += 2) {
                    m34670i(recyclerView, c1731b.f5337c[i], j);
                }
            } finally {
                C1382j.m36159b();
            }
        }
    }

    /* renamed from: i */
    private RecyclerView.AbstractC1620e0 m34670i(RecyclerView recyclerView, int i, long j) {
        if (m34674e(recyclerView, i)) {
            return null;
        }
        RecyclerView.C1647w c1647w = recyclerView.f4930d;
        try {
            recyclerView.m35345K0();
            RecyclerView.AbstractC1620e0 m35054I = c1647w.m35054I(i, false, j);
            if (m35054I != null) {
                if (m35054I.isBound() && !m35054I.isInvalid()) {
                    c1647w.m35061B(m35054I.itemView);
                } else {
                    c1647w.m35049a(m35054I, false);
                }
            }
            return m35054I;
        } finally {
            recyclerView.m35341M0(false);
        }
    }

    /* renamed from: a */
    public void m34678a(RecyclerView recyclerView) {
        this.f5331c.add(recyclerView);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m34673f(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f5332d == 0) {
            this.f5332d = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.f4959z0.m34663e(i, i2);
    }

    /* renamed from: g */
    void m34672g(long j) {
        m34677b();
        m34675d(j);
    }

    /* renamed from: j */
    public void m34669j(RecyclerView recyclerView) {
        this.f5331c.remove(recyclerView);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            C1382j.m36160a("RV Prefetch");
            if (!this.f5331c.isEmpty()) {
                int size = this.f5331c.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = this.f5331c.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    m34672g(TimeUnit.MILLISECONDS.toNanos(j) + this.f5333e);
                }
            }
        } finally {
            this.f5332d = 0L;
            C1382j.m36159b();
        }
    }
}
