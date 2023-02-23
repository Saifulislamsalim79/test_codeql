package androidx.recyclerview.widget;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ViewTypeStorage.java */
/* renamed from: androidx.recyclerview.widget.d0 */
/* loaded from: classes2.dex */
interface InterfaceC1687d0 {

    /* compiled from: ViewTypeStorage.java */
    /* renamed from: androidx.recyclerview.widget.d0$a */
    /* loaded from: classes2.dex */
    public static class C1688a implements InterfaceC1687d0 {

        /* renamed from: a */
        SparseArray<C1739s> f5175a = new SparseArray<>();

        /* renamed from: b */
        int f5176b = 0;

        /* compiled from: ViewTypeStorage.java */
        /* renamed from: androidx.recyclerview.widget.d0$a$a */
        /* loaded from: classes2.dex */
        class C1689a implements InterfaceC1692c {

            /* renamed from: a */
            private SparseIntArray f5177a = new SparseIntArray(1);

            /* renamed from: b */
            private SparseIntArray f5178b = new SparseIntArray(1);

            /* renamed from: c */
            final C1739s f5179c;

            C1689a(C1739s c1739s) {
                this.f5179c = c1739s;
            }

            @Override // androidx.recyclerview.widget.InterfaceC1687d0.InterfaceC1692c
            /* renamed from: a */
            public int mo34813a(int i) {
                int indexOfKey = this.f5178b.indexOfKey(i);
                if (indexOfKey >= 0) {
                    return this.f5178b.valueAt(indexOfKey);
                }
                throw new IllegalStateException("requested global type " + i + " does not belong to the adapter:" + this.f5179c.f5366c);
            }

            @Override // androidx.recyclerview.widget.InterfaceC1687d0.InterfaceC1692c
            /* renamed from: b */
            public int mo34812b(int i) {
                int indexOfKey = this.f5177a.indexOfKey(i);
                if (indexOfKey > -1) {
                    return this.f5177a.valueAt(indexOfKey);
                }
                int m34816c = C1688a.this.m34816c(this.f5179c);
                this.f5177a.put(i, m34816c);
                this.f5178b.put(m34816c, i);
                return m34816c;
            }
        }

        @Override // androidx.recyclerview.widget.InterfaceC1687d0
        /* renamed from: a */
        public C1739s mo34815a(int i) {
            C1739s c1739s = this.f5175a.get(i);
            if (c1739s != null) {
                return c1739s;
            }
            throw new IllegalArgumentException("Cannot find the wrapper for global view type " + i);
        }

        @Override // androidx.recyclerview.widget.InterfaceC1687d0
        /* renamed from: b */
        public InterfaceC1692c mo34814b(C1739s c1739s) {
            return new C1689a(c1739s);
        }

        /* renamed from: c */
        int m34816c(C1739s c1739s) {
            int i = this.f5176b;
            this.f5176b = i + 1;
            this.f5175a.put(i, c1739s);
            return i;
        }
    }

    /* compiled from: ViewTypeStorage.java */
    /* renamed from: androidx.recyclerview.widget.d0$b */
    /* loaded from: classes2.dex */
    public static class C1690b implements InterfaceC1687d0 {

        /* renamed from: a */
        SparseArray<List<C1739s>> f5181a = new SparseArray<>();

        /* compiled from: ViewTypeStorage.java */
        /* renamed from: androidx.recyclerview.widget.d0$b$a */
        /* loaded from: classes2.dex */
        class C1691a implements InterfaceC1692c {

            /* renamed from: a */
            final C1739s f5182a;

            C1691a(C1739s c1739s) {
                this.f5182a = c1739s;
            }

            @Override // androidx.recyclerview.widget.InterfaceC1687d0.InterfaceC1692c
            /* renamed from: a */
            public int mo34813a(int i) {
                return i;
            }

            @Override // androidx.recyclerview.widget.InterfaceC1687d0.InterfaceC1692c
            /* renamed from: b */
            public int mo34812b(int i) {
                List<C1739s> list = C1690b.this.f5181a.get(i);
                if (list == null) {
                    list = new ArrayList<>();
                    C1690b.this.f5181a.put(i, list);
                }
                if (!list.contains(this.f5182a)) {
                    list.add(this.f5182a);
                }
                return i;
            }
        }

        @Override // androidx.recyclerview.widget.InterfaceC1687d0
        /* renamed from: a */
        public C1739s mo34815a(int i) {
            List<C1739s> list = this.f5181a.get(i);
            if (list != null && !list.isEmpty()) {
                return list.get(0);
            }
            throw new IllegalArgumentException("Cannot find the wrapper for global view type " + i);
        }

        @Override // androidx.recyclerview.widget.InterfaceC1687d0
        /* renamed from: b */
        public InterfaceC1692c mo34814b(C1739s c1739s) {
            return new C1691a(c1739s);
        }
    }

    /* compiled from: ViewTypeStorage.java */
    /* renamed from: androidx.recyclerview.widget.d0$c */
    /* loaded from: classes2.dex */
    public interface InterfaceC1692c {
        /* renamed from: a */
        int mo34813a(int i);

        /* renamed from: b */
        int mo34812b(int i);
    }

    /* renamed from: a */
    C1739s mo34815a(int i);

    /* renamed from: b */
    InterfaceC1692c mo34814b(C1739s c1739s);
}
