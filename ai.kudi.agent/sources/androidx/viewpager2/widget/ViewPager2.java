package androidx.viewpager2.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.C1747v;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.InterfaceC1915b;
import p201g.p227h.p238l.C7759x;
import p201g.p227h.p238l.p239h0.C7716c;
import p201g.p227h.p238l.p239h0.InterfaceC7725f;
import p201g.p271y.C8210a;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* loaded from: classes2.dex */
public final class ViewPager2 extends ViewGroup {

    /* renamed from: M */
    static boolean f5802M = true;

    /* renamed from: A */
    private Parcelable f5803A;

    /* renamed from: B */
    RecyclerView f5804B;

    /* renamed from: C */
    private C1747v f5805C;

    /* renamed from: D */
    C1940e f5806D;

    /* renamed from: E */
    private C1937b f5807E;

    /* renamed from: F */
    private C1938c f5808F;

    /* renamed from: G */
    private C1939d f5809G;

    /* renamed from: H */
    private RecyclerView.AbstractC1629m f5810H;

    /* renamed from: I */
    private boolean f5811I;

    /* renamed from: J */
    private boolean f5812J;

    /* renamed from: K */
    private int f5813K;

    /* renamed from: L */
    AbstractC1920e f5814L;

    /* renamed from: c */
    private final Rect f5815c;

    /* renamed from: d */
    private final Rect f5816d;

    /* renamed from: e */
    private C1937b f5817e;

    /* renamed from: f */
    int f5818f;

    /* renamed from: w */
    boolean f5819w;

    /* renamed from: x */
    private RecyclerView.AbstractC1626j f5820x;

    /* renamed from: y */
    private LinearLayoutManager f5821y;

    /* renamed from: z */
    private int f5822z;

    /* renamed from: androidx.viewpager2.widget.ViewPager2$a */
    /* loaded from: classes2.dex */
    class C1916a extends AbstractC1922g {
        C1916a() {
            super(null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1626j
        /* renamed from: a */
        public void mo26471a() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f5819w = true;
            viewPager2.f5806D.m34198j();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager2.widget.ViewPager2$b */
    /* loaded from: classes2.dex */
    public class C1917b extends AbstractC1924i {
        C1917b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1924i
        /* renamed from: a */
        public void mo26465a(int i) {
            if (i == 0) {
                ViewPager2.this.m34253o();
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1924i
        /* renamed from: c */
        public void mo26463c(int i) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f5818f != i) {
                viewPager2.f5818f = i;
                viewPager2.f5814L.mo34231q();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager2.widget.ViewPager2$c */
    /* loaded from: classes2.dex */
    public class C1918c extends AbstractC1924i {
        C1918c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1924i
        /* renamed from: c */
        public void mo26463c(int i) {
            ViewPager2.this.clearFocus();
            if (ViewPager2.this.hasFocus()) {
                ViewPager2.this.f5804B.requestFocus(2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager2.widget.ViewPager2$d */
    /* loaded from: classes2.dex */
    public class C1919d implements RecyclerView.InterfaceC1641r {
        C1919d(ViewPager2 viewPager2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1641r
        /* renamed from: a */
        public void mo34252a(View view) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1641r
        /* renamed from: b */
        public void mo34251b(View view) {
            RecyclerView.C1640q c1640q = (RecyclerView.C1640q) view.getLayoutParams();
            if (((ViewGroup.MarginLayoutParams) c1640q).width != -1 || ((ViewGroup.MarginLayoutParams) c1640q).height != -1) {
                throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.viewpager2.widget.ViewPager2$e */
    /* loaded from: classes2.dex */
    public abstract class AbstractC1920e {
        private AbstractC1920e(ViewPager2 viewPager2) {
        }

        /* renamed from: a */
        boolean mo34242a() {
            return false;
        }

        /* renamed from: b */
        boolean mo34250b(int i) {
            return false;
        }

        /* renamed from: c */
        boolean mo34241c(int i, Bundle bundle) {
            return false;
        }

        /* renamed from: d */
        boolean mo34249d() {
            return false;
        }

        /* renamed from: e */
        void mo34240e(RecyclerView.AbstractC1623h<?> abstractC1623h) {
        }

        /* renamed from: f */
        void mo34239f(RecyclerView.AbstractC1623h<?> abstractC1623h) {
        }

        /* renamed from: g */
        String mo34238g() {
            throw new IllegalStateException("Not implemented.");
        }

        /* renamed from: h */
        void mo34237h(C1937b c1937b, RecyclerView recyclerView) {
        }

        /* renamed from: i */
        void mo34236i(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        /* renamed from: j */
        void mo34248j(C7716c c7716c) {
        }

        /* renamed from: k */
        boolean mo34247k(int i) {
            throw new IllegalStateException("Not implemented.");
        }

        /* renamed from: l */
        boolean mo34235l(int i, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }

        /* renamed from: m */
        void mo34234m() {
        }

        /* renamed from: n */
        CharSequence mo34246n() {
            throw new IllegalStateException("Not implemented.");
        }

        /* renamed from: o */
        void mo34233o(AccessibilityEvent accessibilityEvent) {
        }

        /* renamed from: p */
        void mo34232p() {
        }

        /* renamed from: q */
        void mo34231q() {
        }

        /* renamed from: r */
        void mo34230r() {
        }

        /* renamed from: s */
        void mo34229s() {
        }

        /* synthetic */ AbstractC1920e(ViewPager2 viewPager2, C1916a c1916a) {
            this(viewPager2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager2.widget.ViewPager2$f */
    /* loaded from: classes2.dex */
    public class C1921f extends AbstractC1920e {
        C1921f() {
            super(ViewPager2.this, null);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1920e
        /* renamed from: b */
        public boolean mo34250b(int i) {
            return (i == 8192 || i == 4096) && !ViewPager2.this.m34263e();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1920e
        /* renamed from: d */
        public boolean mo34249d() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1920e
        /* renamed from: j */
        public void mo34248j(C7716c c7716c) {
            if (ViewPager2.this.m34263e()) {
                return;
            }
            c7716c.m17702S(C7716c.C7717a.f18478i);
            c7716c.m17702S(C7716c.C7717a.f18477h);
            c7716c.m17653u0(false);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1920e
        /* renamed from: k */
        public boolean mo34247k(int i) {
            if (mo34250b(i)) {
                return false;
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1920e
        /* renamed from: n */
        public CharSequence mo34246n() {
            if (mo34249d()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$g */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC1922g extends RecyclerView.AbstractC1626j {
        private AbstractC1922g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1626j
        /* renamed from: b */
        public final void mo26470b(int i, int i2) {
            mo26471a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1626j
        /* renamed from: c */
        public final void mo26469c(int i, int i2, Object obj) {
            mo26471a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1626j
        /* renamed from: d */
        public final void mo16890d(int i, int i2) {
            mo26471a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1626j
        /* renamed from: e */
        public final void mo26468e(int i, int i2, int i3) {
            mo26471a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1626j
        /* renamed from: f */
        public final void mo26467f(int i, int i2) {
            mo26471a();
        }

        /* synthetic */ AbstractC1922g(C1916a c1916a) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.viewpager2.widget.ViewPager2$h */
    /* loaded from: classes2.dex */
    public class C1923h extends LinearLayoutManager {
        C1923h(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
        /* renamed from: A1 */
        public boolean mo34245A1(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
        /* renamed from: U0 */
        public void mo34244U0(RecyclerView.C1647w c1647w, RecyclerView.C1614b0 c1614b0, C7716c c7716c) {
            super.mo34244U0(c1647w, c1614b0, c7716c);
            ViewPager2.this.f5814L.mo34248j(c7716c);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.LinearLayoutManager
        /* renamed from: V1 */
        public void mo27089V1(RecyclerView.C1614b0 c1614b0, int[] iArr) {
            int offscreenPageLimit = ViewPager2.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.mo27089V1(c1614b0, iArr);
                return;
            }
            int pageSize = ViewPager2.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1635p
        /* renamed from: o1 */
        public boolean mo34243o1(RecyclerView.C1647w c1647w, RecyclerView.C1614b0 c1614b0, int i, Bundle bundle) {
            if (ViewPager2.this.f5814L.mo34250b(i)) {
                return ViewPager2.this.f5814L.mo34247k(i);
            }
            return super.mo34243o1(c1647w, c1614b0, i, bundle);
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$i */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC1924i {
        /* renamed from: a */
        public void mo26465a(int i) {
        }

        /* renamed from: b */
        public void mo26464b(int i, float f, int i2) {
        }

        /* renamed from: c */
        public void mo26463c(int i) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager2.widget.ViewPager2$j */
    /* loaded from: classes2.dex */
    public class C1925j extends AbstractC1920e {

        /* renamed from: a */
        private final InterfaceC7725f f5828a;

        /* renamed from: b */
        private final InterfaceC7725f f5829b;

        /* renamed from: c */
        private RecyclerView.AbstractC1626j f5830c;

        /* renamed from: androidx.viewpager2.widget.ViewPager2$j$a */
        /* loaded from: classes2.dex */
        class C1926a implements InterfaceC7725f {
            C1926a() {
            }

            @Override // p201g.p227h.p238l.p239h0.InterfaceC7725f
            /* renamed from: a */
            public boolean mo17629a(View view, InterfaceC7725f.AbstractC7726a abstractC7726a) {
                C1925j.this.m34226v(((ViewPager2) view).getCurrentItem() + 1);
                return true;
            }
        }

        /* renamed from: androidx.viewpager2.widget.ViewPager2$j$b */
        /* loaded from: classes2.dex */
        class C1927b implements InterfaceC7725f {
            C1927b() {
            }

            @Override // p201g.p227h.p238l.p239h0.InterfaceC7725f
            /* renamed from: a */
            public boolean mo17629a(View view, InterfaceC7725f.AbstractC7726a abstractC7726a) {
                C1925j.this.m34226v(((ViewPager2) view).getCurrentItem() - 1);
                return true;
            }
        }

        /* renamed from: androidx.viewpager2.widget.ViewPager2$j$c */
        /* loaded from: classes2.dex */
        class C1928c extends AbstractC1922g {
            C1928c() {
                super(null);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1626j
            /* renamed from: a */
            public void mo26471a() {
                C1925j.this.m34225w();
            }
        }

        C1925j() {
            super(ViewPager2.this, null);
            this.f5828a = new C1926a();
            this.f5829b = new C1927b();
        }

        /* renamed from: t */
        private void m34228t(AccessibilityNodeInfo accessibilityNodeInfo) {
            int i;
            int i2;
            if (ViewPager2.this.getAdapter() == null) {
                i = 0;
            } else if (ViewPager2.this.getOrientation() == 1) {
                i = ViewPager2.this.getAdapter().getItemCount();
            } else {
                i2 = ViewPager2.this.getAdapter().getItemCount();
                i = 0;
                C7716c.m17716E0(accessibilityNodeInfo).m17689c0(C7716c.C7718b.m17637b(i, i2, false, 0));
            }
            i2 = 0;
            C7716c.m17716E0(accessibilityNodeInfo).m17689c0(C7716c.C7718b.m17637b(i, i2, false, 0));
        }

        /* renamed from: u */
        private void m34227u(AccessibilityNodeInfo accessibilityNodeInfo) {
            int itemCount;
            RecyclerView.AbstractC1623h adapter = ViewPager2.this.getAdapter();
            if (adapter == null || (itemCount = adapter.getItemCount()) == 0 || !ViewPager2.this.m34263e()) {
                return;
            }
            if (ViewPager2.this.f5818f > 0) {
                accessibilityNodeInfo.addAction(8192);
            }
            if (ViewPager2.this.f5818f < itemCount - 1) {
                accessibilityNodeInfo.addAction(4096);
            }
            accessibilityNodeInfo.setScrollable(true);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1920e
        /* renamed from: a */
        public boolean mo34242a() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1920e
        /* renamed from: c */
        public boolean mo34241c(int i, Bundle bundle) {
            return i == 8192 || i == 4096;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1920e
        /* renamed from: e */
        public void mo34240e(RecyclerView.AbstractC1623h<?> abstractC1623h) {
            m34225w();
            if (abstractC1623h != null) {
                abstractC1623h.registerAdapterDataObserver(this.f5830c);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1920e
        /* renamed from: f */
        public void mo34239f(RecyclerView.AbstractC1623h<?> abstractC1623h) {
            if (abstractC1623h != null) {
                abstractC1623h.unregisterAdapterDataObserver(this.f5830c);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1920e
        /* renamed from: g */
        public String mo34238g() {
            if (mo34242a()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1920e
        /* renamed from: h */
        public void mo34237h(C1937b c1937b, RecyclerView recyclerView) {
            C7759x.m17478z0(recyclerView, 2);
            this.f5830c = new C1928c();
            if (C7759x.m17567A(ViewPager2.this) == 0) {
                C7759x.m17478z0(ViewPager2.this, 1);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1920e
        /* renamed from: i */
        public void mo34236i(AccessibilityNodeInfo accessibilityNodeInfo) {
            m34228t(accessibilityNodeInfo);
            if (Build.VERSION.SDK_INT >= 16) {
                m34227u(accessibilityNodeInfo);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1920e
        /* renamed from: l */
        public boolean mo34235l(int i, Bundle bundle) {
            int currentItem;
            if (mo34241c(i, bundle)) {
                if (i == 8192) {
                    currentItem = ViewPager2.this.getCurrentItem() - 1;
                } else {
                    currentItem = ViewPager2.this.getCurrentItem() + 1;
                }
                m34226v(currentItem);
                return true;
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1920e
        /* renamed from: m */
        public void mo34234m() {
            m34225w();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1920e
        /* renamed from: o */
        public void mo34233o(AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName(mo34238g());
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1920e
        /* renamed from: p */
        public void mo34232p() {
            m34225w();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1920e
        /* renamed from: q */
        public void mo34231q() {
            m34225w();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1920e
        /* renamed from: r */
        public void mo34230r() {
            m34225w();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1920e
        /* renamed from: s */
        public void mo34229s() {
            m34225w();
            if (Build.VERSION.SDK_INT < 21) {
                ViewPager2.this.sendAccessibilityEvent(IjkMediaMeta.FF_PROFILE_H264_INTRA);
            }
        }

        /* renamed from: v */
        void m34226v(int i) {
            if (ViewPager2.this.m34263e()) {
                ViewPager2.this.m34257k(i, true);
            }
        }

        /* renamed from: w */
        void m34225w() {
            int itemCount;
            ViewPager2 viewPager2 = ViewPager2.this;
            C7759x.m17510j0(viewPager2, 16908360);
            C7759x.m17510j0(viewPager2, 16908361);
            C7759x.m17510j0(viewPager2, 16908358);
            C7759x.m17510j0(viewPager2, 16908359);
            if (ViewPager2.this.getAdapter() == null || (itemCount = ViewPager2.this.getAdapter().getItemCount()) == 0 || !ViewPager2.this.m34263e()) {
                return;
            }
            if (ViewPager2.this.getOrientation() == 0) {
                boolean m34264d = ViewPager2.this.m34264d();
                int i = m34264d ? 16908360 : 16908361;
                int i2 = m34264d ? 16908361 : 16908360;
                if (ViewPager2.this.f5818f < itemCount - 1) {
                    C7759x.m17506l0(viewPager2, new C7716c.C7717a(i, null), null, this.f5828a);
                }
                if (ViewPager2.this.f5818f > 0) {
                    C7759x.m17506l0(viewPager2, new C7716c.C7717a(i2, null), null, this.f5829b);
                    return;
                }
                return;
            }
            if (ViewPager2.this.f5818f < itemCount - 1) {
                C7759x.m17506l0(viewPager2, new C7716c.C7717a(16908359, null), null, this.f5828a);
            }
            if (ViewPager2.this.f5818f > 0) {
                C7759x.m17506l0(viewPager2, new C7716c.C7717a(16908358, null), null, this.f5829b);
            }
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$k */
    /* loaded from: classes2.dex */
    public interface InterfaceC1929k {
        /* renamed from: a */
        void m34224a(View view, float f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.viewpager2.widget.ViewPager2$l */
    /* loaded from: classes2.dex */
    public class C1930l extends C1747v {
        C1930l() {
        }

        @Override // androidx.recyclerview.widget.C1747v, androidx.recyclerview.widget.AbstractC1753z
        /* renamed from: h */
        public View mo34223h(RecyclerView.AbstractC1635p abstractC1635p) {
            if (ViewPager2.this.m34265c()) {
                return null;
            }
            return super.mo34223h(abstractC1635p);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.viewpager2.widget.ViewPager2$m */
    /* loaded from: classes2.dex */
    public class C1931m extends RecyclerView {
        C1931m(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public CharSequence getAccessibilityClassName() {
            if (ViewPager2.this.f5814L.mo34249d()) {
                return ViewPager2.this.f5814L.mo34246n();
            }
            return super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.f5818f);
            accessibilityEvent.setToIndex(ViewPager2.this.f5818f);
            ViewPager2.this.f5814L.mo34233o(accessibilityEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.m34263e() && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.m34263e() && super.onTouchEvent(motionEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.viewpager2.widget.ViewPager2$o */
    /* loaded from: classes2.dex */
    public static class RunnableC1934o implements Runnable {

        /* renamed from: c */
        private final int f5840c;

        /* renamed from: d */
        private final RecyclerView f5841d;

        RunnableC1934o(int i, RecyclerView recyclerView) {
            this.f5840c = i;
            this.f5841d = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5841d.m35253u1(this.f5840c);
        }
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5815c = new Rect();
        this.f5816d = new Rect();
        this.f5817e = new C1937b(3);
        this.f5819w = false;
        this.f5820x = new C1916a();
        this.f5822z = -1;
        this.f5810H = null;
        this.f5811I = false;
        this.f5812J = true;
        this.f5813K = -1;
        m34266b(context, attributeSet);
    }

    /* renamed from: a */
    private RecyclerView.InterfaceC1641r m34267a() {
        return new C1919d(this);
    }

    /* renamed from: b */
    private void m34266b(Context context, AttributeSet attributeSet) {
        this.f5814L = f5802M ? new C1925j() : new C1921f();
        C1931m c1931m = new C1931m(context);
        this.f5804B = c1931m;
        c1931m.setId(C7759x.m17509k());
        this.f5804B.setDescendantFocusability(131072);
        C1923h c1923h = new C1923h(context);
        this.f5821y = c1923h;
        this.f5804B.setLayoutManager(c1923h);
        this.f5804B.setScrollingTouchSlop(1);
        m34256l(context, attributeSet);
        this.f5804B.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f5804B.m35288j(m34267a());
        C1940e c1940e = new C1940e(this);
        this.f5806D = c1940e;
        this.f5808F = new C1938c(this, c1940e, this.f5804B);
        C1930l c1930l = new C1930l();
        this.f5805C = c1930l;
        c1930l.mo34559b(this.f5804B);
        this.f5804B.m35282l(this.f5806D);
        C1937b c1937b = new C1937b(3);
        this.f5807E = c1937b;
        this.f5806D.m34195m(c1937b);
        C1917b c1917b = new C1917b();
        C1918c c1918c = new C1918c();
        this.f5807E.m34213d(c1917b);
        this.f5807E.m34213d(c1918c);
        this.f5814L.mo34237h(this.f5807E, this.f5804B);
        this.f5807E.m34213d(this.f5817e);
        C1939d c1939d = new C1939d(this.f5821y);
        this.f5809G = c1939d;
        this.f5807E.m34213d(c1939d);
        RecyclerView recyclerView = this.f5804B;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    /* renamed from: f */
    private void m34262f(RecyclerView.AbstractC1623h<?> abstractC1623h) {
        if (abstractC1623h != null) {
            abstractC1623h.registerAdapterDataObserver(this.f5820x);
        }
    }

    /* renamed from: i */
    private void m34259i() {
        RecyclerView.AbstractC1623h adapter;
        if (this.f5822z == -1 || (adapter = getAdapter()) == null) {
            return;
        }
        Parcelable parcelable = this.f5803A;
        if (parcelable != null) {
            if (adapter instanceof InterfaceC1915b) {
                ((InterfaceC1915b) adapter).restoreState(parcelable);
            }
            this.f5803A = null;
        }
        int max = Math.max(0, Math.min(this.f5822z, adapter.getItemCount() - 1));
        this.f5818f = max;
        this.f5822z = -1;
        this.f5804B.m35277m1(max);
        this.f5814L.mo34234m();
    }

    /* renamed from: l */
    private void m34256l(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8210a.ViewPager2);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, C8210a.ViewPager2, attributeSet, obtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(obtainStyledAttributes.getInt(C8210a.ViewPager2_android_orientation, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: m */
    private void m34255m(RecyclerView.AbstractC1623h<?> abstractC1623h) {
        if (abstractC1623h != null) {
            abstractC1623h.unregisterAdapterDataObserver(this.f5820x);
        }
    }

    /* renamed from: c */
    public boolean m34265c() {
        return this.f5808F.m34210a();
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        return this.f5804B.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        return this.f5804B.canScrollVertically(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m34264d() {
        return this.f5821y.m35118j0() == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof C1932n) {
            int i = ((C1932n) parcelable).f5837c;
            sparseArray.put(this.f5804B.getId(), sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        m34259i();
    }

    /* renamed from: e */
    public boolean m34263e() {
        return this.f5812J;
    }

    /* renamed from: g */
    public void m34261g(AbstractC1924i abstractC1924i) {
        this.f5817e.m34213d(abstractC1924i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (this.f5814L.mo34242a()) {
            return this.f5814L.mo34238g();
        }
        return super.getAccessibilityClassName();
    }

    public RecyclerView.AbstractC1623h getAdapter() {
        return this.f5804B.getAdapter();
    }

    public int getCurrentItem() {
        return this.f5818f;
    }

    public int getItemDecorationCount() {
        return this.f5804B.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f5813K;
    }

    public int getOrientation() {
        return this.f5821y.m35389v2();
    }

    int getPageSize() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.f5804B;
        if (getOrientation() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f5806D.m34202f();
    }

    /* renamed from: h */
    public void m34260h() {
        if (this.f5809G.m34209d() == null) {
            return;
        }
        double m34203e = this.f5806D.m34203e();
        int i = (int) m34203e;
        double d = i;
        Double.isNaN(d);
        float f = (float) (m34203e - d);
        this.f5809G.mo26464b(i, f, Math.round(getPageSize() * f));
    }

    /* renamed from: j */
    public void m34258j(int i, boolean z) {
        if (!m34265c()) {
            m34257k(i, z);
            return;
        }
        throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
    }

    /* renamed from: k */
    void m34257k(int i, boolean z) {
        RecyclerView.AbstractC1623h adapter = getAdapter();
        if (adapter == null) {
            if (this.f5822z != -1) {
                this.f5822z = Math.max(i, 0);
            }
        } else if (adapter.getItemCount() <= 0) {
        } else {
            int min = Math.min(Math.max(i, 0), adapter.getItemCount() - 1);
            if (min == this.f5818f && this.f5806D.m34200h()) {
                return;
            }
            if (min == this.f5818f && z) {
                return;
            }
            double d = this.f5818f;
            this.f5818f = min;
            this.f5814L.mo34231q();
            if (!this.f5806D.m34200h()) {
                d = this.f5806D.m34203e();
            }
            this.f5806D.m34197k(min, z);
            if (!z) {
                this.f5804B.m35277m1(min);
                return;
            }
            double d2 = min;
            Double.isNaN(d2);
            if (Math.abs(d2 - d) > 3.0d) {
                this.f5804B.m35277m1(d2 > d ? min - 3 : min + 3);
                RecyclerView recyclerView = this.f5804B;
                recyclerView.post(new RunnableC1934o(min, recyclerView));
                return;
            }
            this.f5804B.m35253u1(min);
        }
    }

    /* renamed from: n */
    public void m34254n(AbstractC1924i abstractC1924i) {
        this.f5817e.m34212e(abstractC1924i);
    }

    /* renamed from: o */
    void m34253o() {
        C1747v c1747v = this.f5805C;
        if (c1747v != null) {
            View mo34223h = c1747v.mo34223h(this.f5821y);
            if (mo34223h == null) {
                return;
            }
            int m35110n0 = this.f5821y.m35110n0(mo34223h);
            if (m35110n0 != this.f5818f && getScrollState() == 0) {
                this.f5807E.mo26463c(m35110n0);
            }
            this.f5819w = false;
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f5814L.mo34236i(accessibilityNodeInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.f5804B.getMeasuredWidth();
        int measuredHeight = this.f5804B.getMeasuredHeight();
        this.f5815c.left = getPaddingLeft();
        this.f5815c.right = (i3 - i) - getPaddingRight();
        this.f5815c.top = getPaddingTop();
        this.f5815c.bottom = (i4 - i2) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.f5815c, this.f5816d);
        RecyclerView recyclerView = this.f5804B;
        Rect rect = this.f5816d;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.f5819w) {
            m34253o();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        measureChild(this.f5804B, i, i2);
        int measuredWidth = this.f5804B.getMeasuredWidth();
        int measuredHeight = this.f5804B.getMeasuredHeight();
        int measuredState = this.f5804B.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(ViewGroup.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, measuredState), ViewGroup.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1932n)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1932n c1932n = (C1932n) parcelable;
        super.onRestoreInstanceState(c1932n.getSuperState());
        this.f5822z = c1932n.f5838d;
        this.f5803A = c1932n.f5839e;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        C1932n c1932n = new C1932n(super.onSaveInstanceState());
        c1932n.f5837c = this.f5804B.getId();
        int i = this.f5822z;
        if (i == -1) {
            i = this.f5818f;
        }
        c1932n.f5838d = i;
        Parcelable parcelable = this.f5803A;
        if (parcelable != null) {
            c1932n.f5839e = parcelable;
        } else {
            RecyclerView.AbstractC1623h adapter = this.f5804B.getAdapter();
            if (adapter instanceof InterfaceC1915b) {
                c1932n.f5839e = ((InterfaceC1915b) adapter).saveState();
            }
        }
        return c1932n;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        throw new IllegalStateException(ViewPager2.class.getSimpleName() + " does not support direct child views");
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i, Bundle bundle) {
        if (this.f5814L.mo34241c(i, bundle)) {
            return this.f5814L.mo34235l(i, bundle);
        }
        return super.performAccessibilityAction(i, bundle);
    }

    public void setAdapter(RecyclerView.AbstractC1623h abstractC1623h) {
        RecyclerView.AbstractC1623h adapter = this.f5804B.getAdapter();
        this.f5814L.mo34239f(adapter);
        m34255m(adapter);
        this.f5804B.setAdapter(abstractC1623h);
        this.f5818f = 0;
        m34259i();
        this.f5814L.mo34240e(abstractC1623h);
        m34262f(abstractC1623h);
    }

    public void setCurrentItem(int i) {
        m34258j(i, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.f5814L.mo34232p();
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1 && i != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f5813K = i;
        this.f5804B.requestLayout();
    }

    public void setOrientation(int i) {
        this.f5821y.m35425I2(i);
        this.f5814L.mo34230r();
    }

    public void setPageTransformer(InterfaceC1929k interfaceC1929k) {
        if (interfaceC1929k != null) {
            if (!this.f5811I) {
                this.f5810H = this.f5804B.getItemAnimator();
                this.f5811I = true;
            }
            this.f5804B.setItemAnimator(null);
        } else if (this.f5811I) {
            this.f5804B.setItemAnimator(this.f5810H);
            this.f5810H = null;
            this.f5811I = false;
        }
        if (interfaceC1929k == this.f5809G.m34209d()) {
            return;
        }
        this.f5809G.m34208e(interfaceC1929k);
        m34260h();
    }

    public void setUserInputEnabled(boolean z) {
        this.f5812J = z;
        this.f5814L.mo34229s();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager2.widget.ViewPager2$n */
    /* loaded from: classes2.dex */
    public static class C1932n extends View.BaseSavedState {
        public static final Parcelable.Creator<C1932n> CREATOR = new C1933a();

        /* renamed from: c */
        int f5837c;

        /* renamed from: d */
        int f5838d;

        /* renamed from: e */
        Parcelable f5839e;

        /* renamed from: androidx.viewpager2.widget.ViewPager2$n$a */
        /* loaded from: classes2.dex */
        static class C1933a implements Parcelable.ClassLoaderCreator<C1932n> {
            C1933a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C1932n createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public C1932n createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return Build.VERSION.SDK_INT >= 24 ? new C1932n(parcel, classLoader) : new C1932n(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public C1932n[] newArray(int i) {
                return new C1932n[i];
            }
        }

        C1932n(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m34222a(parcel, classLoader);
        }

        /* renamed from: a */
        private void m34222a(Parcel parcel, ClassLoader classLoader) {
            this.f5837c = parcel.readInt();
            this.f5838d = parcel.readInt();
            this.f5839e = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f5837c);
            parcel.writeInt(this.f5838d);
            parcel.writeParcelable(this.f5839e, i);
        }

        C1932n(Parcel parcel) {
            super(parcel);
            m34222a(parcel, null);
        }

        C1932n(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
