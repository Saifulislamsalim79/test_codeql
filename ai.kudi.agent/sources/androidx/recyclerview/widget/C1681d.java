package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.C1676c;
import androidx.recyclerview.widget.C1713j;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
/* compiled from: AsyncListDiffer.java */
/* renamed from: androidx.recyclerview.widget.d */
/* loaded from: classes2.dex */
public class C1681d<T> {

    /* renamed from: h */
    private static final Executor f5158h = new ExecutorC1686c();

    /* renamed from: a */
    private final InterfaceC1738r f5159a;

    /* renamed from: b */
    final C1676c<T> f5160b;

    /* renamed from: c */
    Executor f5161c;

    /* renamed from: d */
    private final List<InterfaceC1685b<T>> f5162d;

    /* renamed from: e */
    private List<T> f5163e;

    /* renamed from: f */
    private List<T> f5164f;

    /* renamed from: g */
    int f5165g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AsyncListDiffer.java */
    /* renamed from: androidx.recyclerview.widget.d$a */
    /* loaded from: classes2.dex */
    public class RunnableC1682a implements Runnable {

        /* renamed from: c */
        final /* synthetic */ List f5166c;

        /* renamed from: d */
        final /* synthetic */ List f5167d;

        /* renamed from: e */
        final /* synthetic */ int f5168e;

        /* renamed from: f */
        final /* synthetic */ Runnable f5169f;

        /* compiled from: AsyncListDiffer.java */
        /* renamed from: androidx.recyclerview.widget.d$a$a */
        /* loaded from: classes2.dex */
        class C1683a extends C1713j.AbstractC1715b {
            C1683a() {
            }

            @Override // androidx.recyclerview.widget.C1713j.AbstractC1715b
            public boolean areContentsTheSame(int i, int i2) {
                Object obj = RunnableC1682a.this.f5166c.get(i);
                Object obj2 = RunnableC1682a.this.f5167d.get(i2);
                if (obj == null || obj2 == null) {
                    if (obj == null && obj2 == null) {
                        return true;
                    }
                    throw new AssertionError();
                }
                return C1681d.this.f5160b.m34849b().areContentsTheSame(obj, obj2);
            }

            @Override // androidx.recyclerview.widget.C1713j.AbstractC1715b
            public boolean areItemsTheSame(int i, int i2) {
                Object obj = RunnableC1682a.this.f5166c.get(i);
                Object obj2 = RunnableC1682a.this.f5167d.get(i2);
                if (obj == null || obj2 == null) {
                    return obj == null && obj2 == null;
                }
                return C1681d.this.f5160b.m34849b().areItemsTheSame(obj, obj2);
            }

            @Override // androidx.recyclerview.widget.C1713j.AbstractC1715b
            public Object getChangePayload(int i, int i2) {
                Object obj = RunnableC1682a.this.f5166c.get(i);
                Object obj2 = RunnableC1682a.this.f5167d.get(i2);
                if (obj != null && obj2 != null) {
                    return C1681d.this.f5160b.m34849b().getChangePayload(obj, obj2);
                }
                throw new AssertionError();
            }

            @Override // androidx.recyclerview.widget.C1713j.AbstractC1715b
            public int getNewListSize() {
                return RunnableC1682a.this.f5167d.size();
            }

            @Override // androidx.recyclerview.widget.C1713j.AbstractC1715b
            public int getOldListSize() {
                return RunnableC1682a.this.f5166c.size();
            }
        }

        /* compiled from: AsyncListDiffer.java */
        /* renamed from: androidx.recyclerview.widget.d$a$b */
        /* loaded from: classes2.dex */
        class RunnableC1684b implements Runnable {

            /* renamed from: c */
            final /* synthetic */ C1713j.C1718e f5172c;

            RunnableC1684b(C1713j.C1718e c1718e) {
                this.f5172c = c1718e;
            }

            @Override // java.lang.Runnable
            public void run() {
                RunnableC1682a runnableC1682a = RunnableC1682a.this;
                C1681d c1681d = C1681d.this;
                if (c1681d.f5165g == runnableC1682a.f5168e) {
                    c1681d.m34820c(runnableC1682a.f5167d, this.f5172c, runnableC1682a.f5169f);
                }
            }
        }

        RunnableC1682a(List list, List list2, int i, Runnable runnable) {
            this.f5166c = list;
            this.f5167d = list2;
            this.f5168e = i;
            this.f5169f = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1681d.this.f5161c.execute(new RunnableC1684b(C1713j.m34729b(new C1683a())));
        }
    }

    /* compiled from: AsyncListDiffer.java */
    /* renamed from: androidx.recyclerview.widget.d$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC1685b<T> {
        /* renamed from: a */
        void mo34641a(List<T> list, List<T> list2);
    }

    /* compiled from: AsyncListDiffer.java */
    /* renamed from: androidx.recyclerview.widget.d$c */
    /* loaded from: classes2.dex */
    private static class ExecutorC1686c implements Executor {

        /* renamed from: c */
        final Handler f5174c = new Handler(Looper.getMainLooper());

        ExecutorC1686c() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f5174c.post(runnable);
        }
    }

    public C1681d(RecyclerView.AbstractC1623h abstractC1623h, C1713j.AbstractC1719f<T> abstractC1719f) {
        this(new C1672b(abstractC1623h), new C1676c.C1677a(abstractC1719f).m34847a());
    }

    /* renamed from: d */
    private void m34819d(List<T> list, Runnable runnable) {
        for (InterfaceC1685b<T> interfaceC1685b : this.f5162d) {
            interfaceC1685b.mo34641a(list, this.f5164f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public void m34822a(InterfaceC1685b<T> interfaceC1685b) {
        this.f5162d.add(interfaceC1685b);
    }

    /* renamed from: b */
    public List<T> m34821b() {
        return this.f5164f;
    }

    /* renamed from: c */
    void m34820c(List<T> list, C1713j.C1718e c1718e, Runnable runnable) {
        List<T> list2 = this.f5164f;
        this.f5163e = list;
        this.f5164f = Collections.unmodifiableList(list);
        c1718e.m34717c(this.f5159a);
        m34819d(list2, runnable);
    }

    /* renamed from: e */
    public void m34818e(List<T> list) {
        m34817f(list, null);
    }

    /* renamed from: f */
    public void m34817f(List<T> list, Runnable runnable) {
        int i = this.f5165g + 1;
        this.f5165g = i;
        List<T> list2 = this.f5163e;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List<T> list3 = this.f5164f;
        if (list == null) {
            int size = list2.size();
            this.f5163e = null;
            this.f5164f = Collections.emptyList();
            this.f5159a.mo17097b(0, size);
            m34819d(list3, runnable);
        } else if (list2 == null) {
            this.f5163e = list;
            this.f5164f = Collections.unmodifiableList(list);
            this.f5159a.mo17098a(0, list.size());
            m34819d(list3, runnable);
        } else {
            this.f5160b.m34850a().execute(new RunnableC1682a(list2, list, i, runnable));
        }
    }

    public C1681d(InterfaceC1738r interfaceC1738r, C1676c<T> c1676c) {
        this.f5162d = new CopyOnWriteArrayList();
        this.f5164f = Collections.emptyList();
        this.f5159a = interfaceC1738r;
        this.f5160b = c1676c;
        if (c1676c.m34848c() != null) {
            this.f5161c = c1676c.m34848c();
        } else {
            this.f5161c = f5158h;
        }
    }
}
