package androidx.viewpager2.adapter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC1449b0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.i;
import androidx.lifecycle.AbstractC1565i;
import androidx.lifecycle.InterfaceC1572l;
import androidx.lifecycle.o;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import p201g.p218e.C7523b;
import p201g.p218e.C7526d;
import p201g.p227h.p237k.C7675h;
import p201g.p227h.p238l.C7759x;
/* loaded from: classes2.dex */
public abstract class FragmentStateAdapter extends RecyclerView.AbstractC1623h<C1914a> implements InterfaceC1915b {
    private static final long GRACE_WINDOW_TIME_MS = 10000;
    private static final String KEY_PREFIX_FRAGMENT = "f#";
    private static final String KEY_PREFIX_STATE = "s#";
    final FragmentManager mFragmentManager;
    private FragmentMaxLifecycleEnforcer mFragmentMaxLifecycleEnforcer;
    final C7526d<Fragment> mFragments;
    private boolean mHasStaleFragments;
    boolean mIsInGracePeriod;
    private final C7526d<Integer> mItemIdToViewHolder;
    final AbstractC1565i mLifecycle;
    private final C7526d<Fragment.C1427l> mSavedStates;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class FragmentMaxLifecycleEnforcer {

        /* renamed from: a */
        private ViewPager2.AbstractC1924i f5786a;

        /* renamed from: b */
        private RecyclerView.AbstractC1626j f5787b;

        /* renamed from: c */
        private InterfaceC1572l f5788c;

        /* renamed from: d */
        private ViewPager2 f5789d;

        /* renamed from: e */
        private long f5790e = -1;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$a */
        /* loaded from: classes2.dex */
        public class C1908a extends ViewPager2.AbstractC1924i {
            C1908a() {
            }

            @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1924i
            /* renamed from: a */
            public void mo26465a(int i) {
                FragmentMaxLifecycleEnforcer.this.m34272d(false);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1924i
            /* renamed from: c */
            public void mo26463c(int i) {
                FragmentMaxLifecycleEnforcer.this.m34272d(false);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$b */
        /* loaded from: classes2.dex */
        public class C1909b extends AbstractC1913d {
            C1909b() {
                super(null);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1626j
            /* renamed from: a */
            public void mo26471a() {
                FragmentMaxLifecycleEnforcer.this.m34272d(true);
            }
        }

        FragmentMaxLifecycleEnforcer() {
        }

        /* renamed from: a */
        private ViewPager2 m34275a(RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        /* renamed from: b */
        void m34274b(RecyclerView recyclerView) {
            this.f5789d = m34275a(recyclerView);
            C1908a c1908a = new C1908a();
            this.f5786a = c1908a;
            this.f5789d.m34261g(c1908a);
            C1909b c1909b = new C1909b();
            this.f5787b = c1909b;
            FragmentStateAdapter.this.registerAdapterDataObserver(c1909b);
            InterfaceC1572l interfaceC1572l = new InterfaceC1572l() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.3
                @Override // androidx.lifecycle.InterfaceC1572l
                /* renamed from: m */
                public void mo34271m(o oVar, AbstractC1565i.b bVar) {
                    FragmentMaxLifecycleEnforcer.this.m34272d(false);
                }
            };
            this.f5788c = interfaceC1572l;
            FragmentStateAdapter.this.mLifecycle.mo35506a(interfaceC1572l);
        }

        /* renamed from: c */
        void m34273c(RecyclerView recyclerView) {
            m34275a(recyclerView).m34254n(this.f5786a);
            FragmentStateAdapter.this.unregisterAdapterDataObserver(this.f5787b);
            FragmentStateAdapter.this.mLifecycle.mo35504c(this.f5788c);
            this.f5789d = null;
        }

        /* renamed from: d */
        void m34272d(boolean z) {
            int currentItem;
            Fragment m18499f;
            if (FragmentStateAdapter.this.shouldDelayFragmentTransactions() || this.f5789d.getScrollState() != 0 || FragmentStateAdapter.this.mFragments.m18496i() || FragmentStateAdapter.this.getItemCount() == 0 || (currentItem = this.f5789d.getCurrentItem()) >= FragmentStateAdapter.this.getItemCount()) {
                return;
            }
            long itemId = FragmentStateAdapter.this.getItemId(currentItem);
            if ((itemId != this.f5790e || z) && (m18499f = FragmentStateAdapter.this.mFragments.m18499f(itemId)) != null && m18499f.isAdded()) {
                this.f5790e = itemId;
                AbstractC1449b0 m35924l = FragmentStateAdapter.this.mFragmentManager.m35924l();
                Fragment fragment = null;
                for (int i = 0; i < FragmentStateAdapter.this.mFragments.m18491o(); i++) {
                    long m18495j = FragmentStateAdapter.this.mFragments.m18495j(i);
                    Fragment m18490p = FragmentStateAdapter.this.mFragments.m18490p(i);
                    if (m18490p.isAdded()) {
                        if (m18495j != this.f5790e) {
                            m35924l.mo35797u(m18490p, AbstractC1565i.c.f);
                        } else {
                            fragment = m18490p;
                        }
                        m18490p.setMenuVisibility(m18495j == this.f5790e);
                    }
                }
                if (fragment != null) {
                    m35924l.mo35797u(fragment, AbstractC1565i.c.w);
                }
                if (m35924l.mo35799p()) {
                    return;
                }
                m35924l.mo35803k();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$a */
    /* loaded from: classes2.dex */
    public class View$OnLayoutChangeListenerC1910a implements View.OnLayoutChangeListener {

        /* renamed from: a */
        final /* synthetic */ FrameLayout f5795a;

        /* renamed from: b */
        final /* synthetic */ C1914a f5796b;

        View$OnLayoutChangeListenerC1910a(FrameLayout frameLayout, C1914a c1914a) {
            this.f5795a = frameLayout;
            this.f5796b = c1914a;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (this.f5795a.getParent() != null) {
                this.f5795a.removeOnLayoutChangeListener(this);
                FragmentStateAdapter.this.placeFragmentInViewHolder(this.f5796b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$b */
    /* loaded from: classes2.dex */
    public class C1911b extends FragmentManager.AbstractC1439j {

        /* renamed from: a */
        final /* synthetic */ Fragment f5798a;

        /* renamed from: b */
        final /* synthetic */ FrameLayout f5799b;

        C1911b(Fragment fragment, FrameLayout frameLayout) {
            this.f5798a = fragment;
            this.f5799b = frameLayout;
        }

        @Override // androidx.fragment.app.FragmentManager.AbstractC1439j
        /* renamed from: m */
        public void mo34270m(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
            if (fragment == this.f5798a) {
                fragmentManager.m35889w1(this);
                FragmentStateAdapter.this.addViewToContainer(view, this.f5799b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$c */
    /* loaded from: classes2.dex */
    public class RunnableC1912c implements Runnable {
        RunnableC1912c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
            fragmentStateAdapter.mIsInGracePeriod = false;
            fragmentStateAdapter.gcFragments();
        }
    }

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$d */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC1913d extends RecyclerView.AbstractC1626j {
        private AbstractC1913d() {
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

        /* synthetic */ AbstractC1913d(View$OnLayoutChangeListenerC1910a view$OnLayoutChangeListenerC1910a) {
            this();
        }
    }

    public FragmentStateAdapter(i iVar) {
        this(iVar.getSupportFragmentManager(), iVar.getLifecycle());
    }

    private static String createKey(String str, long j) {
        return str + j;
    }

    private void ensureFragment(int i) {
        long itemId = getItemId(i);
        if (this.mFragments.m18501d(itemId)) {
            return;
        }
        Fragment createFragment = createFragment(i);
        createFragment.setInitialSavedState(this.mSavedStates.m18499f(itemId));
        this.mFragments.m18494k(itemId, createFragment);
    }

    private boolean isFragmentViewBound(long j) {
        View view;
        if (this.mItemIdToViewHolder.m18501d(j)) {
            return true;
        }
        Fragment m18499f = this.mFragments.m18499f(j);
        return (m18499f == null || (view = m18499f.getView()) == null || view.getParent() == null) ? false : true;
    }

    private static boolean isValidKey(String str, String str2) {
        return str.startsWith(str2) && str.length() > str2.length();
    }

    private Long itemForViewHolder(int i) {
        Long l = null;
        for (int i2 = 0; i2 < this.mItemIdToViewHolder.m18491o(); i2++) {
            if (this.mItemIdToViewHolder.m18490p(i2).intValue() == i) {
                if (l == null) {
                    l = Long.valueOf(this.mItemIdToViewHolder.m18495j(i2));
                } else {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
            }
        }
        return l;
    }

    private static long parseIdFromKey(String str, String str2) {
        return Long.parseLong(str.substring(str2.length()));
    }

    private void removeFragment(long j) {
        ViewParent parent;
        Fragment m18499f = this.mFragments.m18499f(j);
        if (m18499f == null) {
            return;
        }
        if (m18499f.getView() != null && (parent = m18499f.getView().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        if (!containsItem(j)) {
            this.mSavedStates.m18493l(j);
        }
        if (!m18499f.isAdded()) {
            this.mFragments.m18493l(j);
        } else if (shouldDelayFragmentTransactions()) {
            this.mHasStaleFragments = true;
        } else {
            if (m18499f.isAdded() && containsItem(j)) {
                this.mSavedStates.m18494k(j, this.mFragmentManager.m35922l1(m18499f));
            }
            AbstractC1449b0 m35924l = this.mFragmentManager.m35924l();
            m35924l.mo35798q(m18499f);
            m35924l.mo35803k();
            this.mFragments.m18493l(j);
        }
    }

    private void scheduleGracePeriodEnd() {
        final Handler handler = new Handler(Looper.getMainLooper());
        final RunnableC1912c runnableC1912c = new RunnableC1912c();
        this.mLifecycle.mo35506a(new InterfaceC1572l(this) { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.5
            @Override // androidx.lifecycle.InterfaceC1572l
            /* renamed from: m */
            public void mo34271m(o oVar, AbstractC1565i.b bVar) {
                if (bVar == AbstractC1565i.b.ON_DESTROY) {
                    handler.removeCallbacks(runnableC1912c);
                    oVar.getLifecycle().mo35504c(this);
                }
            }
        });
        handler.postDelayed(runnableC1912c, GRACE_WINDOW_TIME_MS);
    }

    private void scheduleViewAttach(Fragment fragment, FrameLayout frameLayout) {
        this.mFragmentManager.m35946d1(new C1911b(fragment, frameLayout), false);
    }

    void addViewToContainer(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() <= 1) {
            if (view.getParent() == frameLayout) {
                return;
            }
            if (frameLayout.getChildCount() > 0) {
                frameLayout.removeAllViews();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            frameLayout.addView(view);
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    public boolean containsItem(long j) {
        return j >= 0 && j < ((long) getItemCount());
    }

    public abstract Fragment createFragment(int i);

    void gcFragments() {
        if (!this.mHasStaleFragments || shouldDelayFragmentTransactions()) {
            return;
        }
        C7523b<Long> c7523b = new C7523b();
        for (int i = 0; i < this.mFragments.m18491o(); i++) {
            long m18495j = this.mFragments.m18495j(i);
            if (!containsItem(m18495j)) {
                c7523b.add(Long.valueOf(m18495j));
                this.mItemIdToViewHolder.m18493l(m18495j);
            }
        }
        if (!this.mIsInGracePeriod) {
            this.mHasStaleFragments = false;
            for (int i2 = 0; i2 < this.mFragments.m18491o(); i2++) {
                long m18495j2 = this.mFragments.m18495j(i2);
                if (!isFragmentViewBound(m18495j2)) {
                    c7523b.add(Long.valueOf(m18495j2));
                }
            }
        }
        for (Long l : c7523b) {
            removeFragment(l.longValue());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C7675h.m17871a(this.mFragmentMaxLifecycleEnforcer == null);
        FragmentMaxLifecycleEnforcer fragmentMaxLifecycleEnforcer = new FragmentMaxLifecycleEnforcer();
        this.mFragmentMaxLifecycleEnforcer = fragmentMaxLifecycleEnforcer;
        fragmentMaxLifecycleEnforcer.m34274b(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.mFragmentMaxLifecycleEnforcer.m34273c(recyclerView);
        this.mFragmentMaxLifecycleEnforcer = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public final boolean onFailedToRecycleView(C1914a c1914a) {
        return true;
    }

    void placeFragmentInViewHolder(final C1914a c1914a) {
        Fragment m18499f = this.mFragments.m18499f(c1914a.getItemId());
        if (m18499f != null) {
            FrameLayout m34268b = c1914a.m34268b();
            View view = m18499f.getView();
            if (!m18499f.isAdded() && view != null) {
                throw new IllegalStateException("Design assumption violated.");
            }
            if (m18499f.isAdded() && view == null) {
                scheduleViewAttach(m18499f, m34268b);
                return;
            } else if (m18499f.isAdded() && view.getParent() != null) {
                if (view.getParent() != m34268b) {
                    addViewToContainer(view, m34268b);
                    return;
                }
                return;
            } else if (m18499f.isAdded()) {
                addViewToContainer(view, m34268b);
                return;
            } else if (!shouldDelayFragmentTransactions()) {
                scheduleViewAttach(m18499f, m34268b);
                AbstractC1449b0 m35924l = this.mFragmentManager.m35924l();
                m35924l.m35826e(m18499f, "f" + c1914a.getItemId());
                m35924l.mo35797u(m18499f, AbstractC1565i.c.f);
                m35924l.mo35803k();
                this.mFragmentMaxLifecycleEnforcer.m34272d(false);
                return;
            } else if (this.mFragmentManager.m35998F0()) {
                return;
            } else {
                this.mLifecycle.mo35506a(new InterfaceC1572l() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.2
                    @Override // androidx.lifecycle.InterfaceC1572l
                    /* renamed from: m */
                    public void mo34271m(o oVar, AbstractC1565i.b bVar) {
                        if (FragmentStateAdapter.this.shouldDelayFragmentTransactions()) {
                            return;
                        }
                        oVar.getLifecycle().mo35504c(this);
                        if (C7759x.m17536T(c1914a.m34268b())) {
                            FragmentStateAdapter.this.placeFragmentInViewHolder(c1914a);
                        }
                    }
                });
                return;
            }
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    @Override // androidx.viewpager2.adapter.InterfaceC1915b
    public final void restoreState(Parcelable parcelable) {
        if (this.mSavedStates.m18496i() && this.mFragments.m18496i()) {
            Bundle bundle = (Bundle) parcelable;
            if (bundle.getClassLoader() == null) {
                bundle.setClassLoader(getClass().getClassLoader());
            }
            for (String str : bundle.keySet()) {
                if (isValidKey(str, KEY_PREFIX_FRAGMENT)) {
                    this.mFragments.m18494k(parseIdFromKey(str, KEY_PREFIX_FRAGMENT), this.mFragmentManager.m35911p0(bundle, str));
                } else if (isValidKey(str, KEY_PREFIX_STATE)) {
                    long parseIdFromKey = parseIdFromKey(str, KEY_PREFIX_STATE);
                    Fragment.C1427l c1427l = (Fragment.C1427l) bundle.getParcelable(str);
                    if (containsItem(parseIdFromKey)) {
                        this.mSavedStates.m18494k(parseIdFromKey, c1427l);
                    }
                } else {
                    throw new IllegalArgumentException("Unexpected key in savedState: " + str);
                }
            }
            if (this.mFragments.m18496i()) {
                return;
            }
            this.mHasStaleFragments = true;
            this.mIsInGracePeriod = true;
            gcFragments();
            scheduleGracePeriodEnd();
            return;
        }
        throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
    }

    @Override // androidx.viewpager2.adapter.InterfaceC1915b
    public final Parcelable saveState() {
        Bundle bundle = new Bundle(this.mFragments.m18491o() + this.mSavedStates.m18491o());
        for (int i = 0; i < this.mFragments.m18491o(); i++) {
            long m18495j = this.mFragments.m18495j(i);
            Fragment m18499f = this.mFragments.m18499f(m18495j);
            if (m18499f != null && m18499f.isAdded()) {
                this.mFragmentManager.m35949c1(bundle, createKey(KEY_PREFIX_FRAGMENT, m18495j), m18499f);
            }
        }
        for (int i2 = 0; i2 < this.mSavedStates.m18491o(); i2++) {
            long m18495j2 = this.mSavedStates.m18495j(i2);
            if (containsItem(m18495j2)) {
                bundle.putParcelable(createKey(KEY_PREFIX_STATE, m18495j2), this.mSavedStates.m18499f(m18495j2));
            }
        }
        return bundle;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public final void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    boolean shouldDelayFragmentTransactions() {
        return this.mFragmentManager.m35984M0();
    }

    public FragmentStateAdapter(Fragment fragment) {
        this(fragment.getChildFragmentManager(), fragment.getLifecycle());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public final void onBindViewHolder(C1914a c1914a, int i) {
        long itemId = c1914a.getItemId();
        int id = c1914a.m34268b().getId();
        Long itemForViewHolder = itemForViewHolder(id);
        if (itemForViewHolder != null && itemForViewHolder.longValue() != itemId) {
            removeFragment(itemForViewHolder.longValue());
            this.mItemIdToViewHolder.m18493l(itemForViewHolder.longValue());
        }
        this.mItemIdToViewHolder.m18494k(itemId, Integer.valueOf(id));
        ensureFragment(i);
        FrameLayout m34268b = c1914a.m34268b();
        if (C7759x.m17536T(m34268b)) {
            if (m34268b.getParent() == null) {
                m34268b.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC1910a(m34268b, c1914a));
            } else {
                throw new IllegalStateException("Design assumption violated.");
            }
        }
        gcFragments();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public final C1914a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return C1914a.m34269a(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public final void onViewAttachedToWindow(C1914a c1914a) {
        placeFragmentInViewHolder(c1914a);
        gcFragments();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public final void onViewRecycled(C1914a c1914a) {
        Long itemForViewHolder = itemForViewHolder(c1914a.m34268b().getId());
        if (itemForViewHolder != null) {
            removeFragment(itemForViewHolder.longValue());
            this.mItemIdToViewHolder.m18493l(itemForViewHolder.longValue());
        }
    }

    public FragmentStateAdapter(FragmentManager fragmentManager, AbstractC1565i abstractC1565i) {
        this.mFragments = new C7526d<>();
        this.mSavedStates = new C7526d<>();
        this.mItemIdToViewHolder = new C7526d<>();
        this.mIsInGracePeriod = false;
        this.mHasStaleFragments = false;
        this.mFragmentManager = fragmentManager;
        this.mLifecycle = abstractC1565i;
        super.setHasStableIds(true);
    }
}
