package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.AbstractC1486i0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.strictmode.C1515c;
import androidx.lifecycle.AbstractC1565i;
import p201g.p227h.p238l.C7759x;
import p201g.p248l.C7802b;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FragmentStateManager.java */
/* renamed from: androidx.fragment.app.y */
/* loaded from: classes2.dex */
public class C1526y {

    /* renamed from: a */
    private final C1508q f4685a;

    /* renamed from: b */
    private final C1447a0 f4686b;

    /* renamed from: c */
    private final Fragment f4687c;

    /* renamed from: d */
    private boolean f4688d = false;

    /* renamed from: e */
    private int f4689e = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentStateManager.java */
    /* renamed from: androidx.fragment.app.y$a */
    /* loaded from: classes2.dex */
    public class View$OnAttachStateChangeListenerC1527a implements View.OnAttachStateChangeListener {

        /* renamed from: c */
        final /* synthetic */ View f4690c;

        View$OnAttachStateChangeListenerC1527a(C1526y c1526y, View view) {
            this.f4690c = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f4690c.removeOnAttachStateChangeListener(this);
            C7759x.m17504m0(this.f4690c);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentStateManager.java */
    /* renamed from: androidx.fragment.app.y$b */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C1528b {

        /* renamed from: a */
        static final /* synthetic */ int[] f4691a;

        static {
            int[] iArr = new int[AbstractC1565i.c.values().length];
            f4691a = iArr;
            try {
                iArr[AbstractC1565i.c.w.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4691a[AbstractC1565i.c.f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4691a[AbstractC1565i.c.e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4691a[AbstractC1565i.c.d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1526y(C1508q c1508q, C1447a0 c1447a0, Fragment fragment) {
        this.f4685a = c1508q;
        this.f4686b = c1447a0;
        this.f4687c = fragment;
    }

    /* renamed from: l */
    private boolean m35596l(View view) {
        if (view == this.f4687c.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f4687c.mView) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: q */
    private Bundle m35591q() {
        Bundle bundle = new Bundle();
        this.f4687c.performSaveInstanceState(bundle);
        this.f4685a.m35658j(this.f4687c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f4687c.mView != null) {
            m35588t();
        }
        if (this.f4687c.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f4687c.mSavedViewState);
        }
        if (this.f4687c.mSavedViewRegistryState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.f4687c.mSavedViewRegistryState);
        }
        if (!this.f4687c.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f4687c.mUserVisibleHint);
        }
        return bundle;
    }

    /* renamed from: a */
    void m35607a() {
        if (FragmentManager.m35996G0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f4687c);
        }
        Fragment fragment = this.f4687c;
        fragment.performActivityCreated(fragment.mSavedFragmentState);
        C1508q c1508q = this.f4685a;
        Fragment fragment2 = this.f4687c;
        c1508q.m35667a(fragment2, fragment2.mSavedFragmentState, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m35606b() {
        int m35847j = this.f4686b.m35847j(this.f4687c);
        Fragment fragment = this.f4687c;
        fragment.mContainer.addView(fragment.mView, m35847j);
    }

    /* renamed from: c */
    void m35605c() {
        if (FragmentManager.m35996G0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f4687c);
        }
        Fragment fragment = this.f4687c;
        Fragment fragment2 = fragment.mTarget;
        C1526y c1526y = null;
        if (fragment2 != null) {
            C1526y m35843n = this.f4686b.m35843n(fragment2.mWho);
            if (m35843n != null) {
                Fragment fragment3 = this.f4687c;
                fragment3.mTargetWho = fragment3.mTarget.mWho;
                fragment3.mTarget = null;
                c1526y = m35843n;
            } else {
                throw new IllegalStateException("Fragment " + this.f4687c + " declared target fragment " + this.f4687c.mTarget + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (c1526y = this.f4686b.m35843n(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f4687c + " declared target fragment " + this.f4687c.mTargetWho + " that does not belong to this FragmentManager!");
            }
        }
        if (c1526y != null) {
            c1526y.m35595m();
        }
        Fragment fragment4 = this.f4687c;
        fragment4.mHost = fragment4.mFragmentManager.m35899t0();
        Fragment fragment5 = this.f4687c;
        fragment5.mParentFragment = fragment5.mFragmentManager.m35890w0();
        this.f4685a.m35661g(this.f4687c, false);
        this.f4687c.performAttach();
        this.f4685a.m35666b(this.f4687c, false);
    }

    /* renamed from: d */
    int m35604d() {
        Fragment fragment = this.f4687c;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int i = this.f4689e;
        int i2 = C1528b.f4691a[fragment.mMaxState.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                i = Math.min(i, 5);
            } else if (i2 == 3) {
                i = Math.min(i, 1);
            } else if (i2 != 4) {
                i = Math.min(i, -1);
            } else {
                i = Math.min(i, 0);
            }
        }
        Fragment fragment2 = this.f4687c;
        if (fragment2.mFromLayout) {
            if (fragment2.mInLayout) {
                i = Math.max(this.f4689e, 2);
                View view = this.f4687c.mView;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.f4689e < 4 ? Math.min(i, fragment2.mState) : Math.min(i, 1);
            }
        }
        if (!this.f4687c.mAdded) {
            i = Math.min(i, 1);
        }
        Fragment fragment3 = this.f4687c;
        ViewGroup viewGroup = fragment3.mContainer;
        AbstractC1486i0.C1491e.EnumC1493b m35737l = viewGroup != null ? AbstractC1486i0.m35735n(viewGroup, fragment3.getParentFragmentManager()).m35737l(this) : null;
        if (m35737l == AbstractC1486i0.C1491e.EnumC1493b.ADDING) {
            i = Math.min(i, 6);
        } else if (m35737l == AbstractC1486i0.C1491e.EnumC1493b.REMOVING) {
            i = Math.max(i, 3);
        } else {
            Fragment fragment4 = this.f4687c;
            if (fragment4.mRemoving) {
                if (fragment4.isInBackStack()) {
                    i = Math.min(i, 1);
                } else {
                    i = Math.min(i, -1);
                }
            }
        }
        Fragment fragment5 = this.f4687c;
        if (fragment5.mDeferStart && fragment5.mState < 5) {
            i = Math.min(i, 4);
        }
        if (FragmentManager.m35996G0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i + " for " + this.f4687c);
        }
        return i;
    }

    /* renamed from: e */
    void m35603e() {
        if (FragmentManager.m35996G0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f4687c);
        }
        Fragment fragment = this.f4687c;
        if (!fragment.mIsCreated) {
            this.f4685a.m35660h(fragment, fragment.mSavedFragmentState, false);
            Fragment fragment2 = this.f4687c;
            fragment2.performCreate(fragment2.mSavedFragmentState);
            C1508q c1508q = this.f4685a;
            Fragment fragment3 = this.f4687c;
            c1508q.m35665c(fragment3, fragment3.mSavedFragmentState, false);
            return;
        }
        fragment.restoreChildFragmentState(fragment.mSavedFragmentState);
        this.f4687c.mState = 1;
    }

    /* renamed from: f */
    void m35602f() {
        String str;
        if (this.f4687c.mFromLayout) {
            return;
        }
        if (FragmentManager.m35996G0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f4687c);
        }
        Fragment fragment = this.f4687c;
        LayoutInflater performGetLayoutInflater = fragment.performGetLayoutInflater(fragment.mSavedFragmentState);
        ViewGroup viewGroup = null;
        Fragment fragment2 = this.f4687c;
        ViewGroup viewGroup2 = fragment2.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = fragment2.mContainerId;
            if (i != 0) {
                if (i != -1) {
                    viewGroup = (ViewGroup) fragment2.mFragmentManager.m35914o0().mo35680c(this.f4687c.mContainerId);
                    if (viewGroup == null) {
                        Fragment fragment3 = this.f4687c;
                        if (!fragment3.mRestored) {
                            try {
                                str = fragment3.getResources().getResourceName(this.f4687c.mContainerId);
                            } catch (Resources.NotFoundException unused) {
                                str = "unknown";
                            }
                            throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f4687c.mContainerId) + " (" + str + ") for fragment " + this.f4687c);
                        }
                    } else if (!(viewGroup instanceof C1501l)) {
                        C1515c.m35633p(this.f4687c, viewGroup);
                    }
                } else {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f4687c + " for a container view with no id");
                }
            }
        }
        Fragment fragment4 = this.f4687c;
        fragment4.mContainer = viewGroup;
        fragment4.performCreateView(performGetLayoutInflater, viewGroup, fragment4.mSavedFragmentState);
        View view = this.f4687c.mView;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            Fragment fragment5 = this.f4687c;
            fragment5.mView.setTag(C7802b.fragment_container_view_tag, fragment5);
            if (viewGroup != null) {
                m35606b();
            }
            Fragment fragment6 = this.f4687c;
            if (fragment6.mHidden) {
                fragment6.mView.setVisibility(8);
            }
            if (C7759x.m17536T(this.f4687c.mView)) {
                C7759x.m17504m0(this.f4687c.mView);
            } else {
                View view2 = this.f4687c.mView;
                view2.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC1527a(this, view2));
            }
            this.f4687c.performViewCreated();
            C1508q c1508q = this.f4685a;
            Fragment fragment7 = this.f4687c;
            c1508q.m35655m(fragment7, fragment7.mView, fragment7.mSavedFragmentState, false);
            int visibility = this.f4687c.mView.getVisibility();
            this.f4687c.setPostOnViewCreatedAlpha(this.f4687c.mView.getAlpha());
            Fragment fragment8 = this.f4687c;
            if (fragment8.mContainer != null && visibility == 0) {
                View findFocus = fragment8.mView.findFocus();
                if (findFocus != null) {
                    this.f4687c.setFocusedView(findFocus);
                    if (FragmentManager.m35996G0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.f4687c);
                    }
                }
                this.f4687c.mView.setAlpha(0.0f);
            }
        }
        this.f4687c.mState = 2;
    }

    /* renamed from: g */
    void m35601g() {
        Fragment m35851f;
        if (FragmentManager.m35996G0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f4687c);
        }
        Fragment fragment = this.f4687c;
        boolean z = true;
        boolean z2 = fragment.mRemoving && !fragment.isInBackStack();
        if (z2) {
            Fragment fragment2 = this.f4687c;
            if (!fragment2.mBeingSaved) {
                this.f4686b.m35857B(fragment2.mWho, null);
            }
        }
        if (z2 || this.f4686b.m35841p().m35613m(this.f4687c)) {
            AbstractC1505o<?> abstractC1505o = this.f4687c.mHost;
            if (abstractC1505o instanceof androidx.lifecycle.j0) {
                z = this.f4686b.m35841p().m35616j();
            } else if (abstractC1505o.m35677f() instanceof Activity) {
                z = true ^ ((Activity) abstractC1505o.m35677f()).isChangingConfigurations();
            }
            if ((z2 && !this.f4687c.mBeingSaved) || z) {
                this.f4686b.m35841p().m35624b(this.f4687c);
            }
            this.f4687c.performDestroy();
            this.f4685a.m35664d(this.f4687c, false);
            for (C1526y c1526y : this.f4686b.m35846k()) {
                if (c1526y != null) {
                    Fragment m35597k = c1526y.m35597k();
                    if (this.f4687c.mWho.equals(m35597k.mTargetWho)) {
                        m35597k.mTarget = this.f4687c;
                        m35597k.mTargetWho = null;
                    }
                }
            }
            Fragment fragment3 = this.f4687c;
            String str = fragment3.mTargetWho;
            if (str != null) {
                fragment3.mTarget = this.f4686b.m35851f(str);
            }
            this.f4686b.m35838s(this);
            return;
        }
        String str2 = this.f4687c.mTargetWho;
        if (str2 != null && (m35851f = this.f4686b.m35851f(str2)) != null && m35851f.mRetainInstance) {
            this.f4687c.mTarget = m35851f;
        }
        this.f4687c.mState = 0;
    }

    /* renamed from: h */
    void m35600h() {
        View view;
        if (FragmentManager.m35996G0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f4687c);
        }
        Fragment fragment = this.f4687c;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        this.f4687c.performDestroyView();
        this.f4685a.m35654n(this.f4687c, false);
        Fragment fragment2 = this.f4687c;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.setValue(null);
        this.f4687c.mInLayout = false;
    }

    /* renamed from: i */
    void m35599i() {
        if (FragmentManager.m35996G0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f4687c);
        }
        this.f4687c.performDetach();
        boolean z = false;
        this.f4685a.m35663e(this.f4687c, false);
        Fragment fragment = this.f4687c;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if (fragment.mRemoving && !fragment.isInBackStack()) {
            z = true;
        }
        if (z || this.f4686b.m35841p().m35613m(this.f4687c)) {
            if (FragmentManager.m35996G0(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + this.f4687c);
            }
            this.f4687c.initState();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m35598j() {
        Fragment fragment = this.f4687c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.m35996G0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f4687c);
            }
            Fragment fragment2 = this.f4687c;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(fragment2.mSavedFragmentState), null, this.f4687c.mSavedFragmentState);
            View view = this.f4687c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f4687c;
                fragment3.mView.setTag(C7802b.fragment_container_view_tag, fragment3);
                Fragment fragment4 = this.f4687c;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.f4687c.performViewCreated();
                C1508q c1508q = this.f4685a;
                Fragment fragment5 = this.f4687c;
                c1508q.m35655m(fragment5, fragment5.mView, fragment5.mSavedFragmentState, false);
                this.f4687c.mState = 2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public Fragment m35597k() {
        return this.f4687c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m35595m() {
        if (this.f4688d) {
            if (FragmentManager.m35996G0(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + m35597k());
                return;
            }
            return;
        }
        try {
            this.f4688d = true;
            boolean z = false;
            while (true) {
                int m35604d = m35604d();
                if (m35604d != this.f4687c.mState) {
                    if (m35604d > this.f4687c.mState) {
                        switch (this.f4687c.mState + 1) {
                            case 0:
                                m35605c();
                                continue;
                            case 1:
                                m35603e();
                                continue;
                            case 2:
                                m35598j();
                                m35602f();
                                continue;
                            case 3:
                                m35607a();
                                continue;
                            case 4:
                                if (this.f4687c.mView != null && this.f4687c.mContainer != null) {
                                    AbstractC1486i0.m35735n(this.f4687c.mContainer, this.f4687c.getParentFragmentManager()).m35747b(AbstractC1486i0.C1491e.EnumC1494c.m35716b(this.f4687c.mView.getVisibility()), this);
                                }
                                this.f4687c.mState = 4;
                                continue;
                            case 5:
                                m35586v();
                                continue;
                            case 6:
                                this.f4687c.mState = 6;
                                continue;
                            case 7:
                                m35592p();
                                continue;
                            default:
                                continue;
                        }
                    } else {
                        switch (this.f4687c.mState - 1) {
                            case -1:
                                m35599i();
                                continue;
                            case 0:
                                if (this.f4687c.mBeingSaved && this.f4686b.m35840q(this.f4687c.mWho) == null) {
                                    m35589s();
                                }
                                m35601g();
                                continue;
                            case 1:
                                m35600h();
                                this.f4687c.mState = 1;
                                continue;
                            case 2:
                                this.f4687c.mInLayout = false;
                                this.f4687c.mState = 2;
                                continue;
                            case 3:
                                if (FragmentManager.m35996G0(3)) {
                                    Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f4687c);
                                }
                                if (this.f4687c.mBeingSaved) {
                                    m35589s();
                                } else if (this.f4687c.mView != null && this.f4687c.mSavedViewState == null) {
                                    m35588t();
                                }
                                if (this.f4687c.mView != null && this.f4687c.mContainer != null) {
                                    AbstractC1486i0.m35735n(this.f4687c.mContainer, this.f4687c.getParentFragmentManager()).m35745d(this);
                                }
                                this.f4687c.mState = 3;
                                continue;
                            case 4:
                                m35585w();
                                continue;
                            case 5:
                                this.f4687c.mState = 5;
                                continue;
                            case 6:
                                m35594n();
                                continue;
                            default:
                                continue;
                        }
                    }
                    z = true;
                } else {
                    if (!z && this.f4687c.mState == -1 && this.f4687c.mRemoving && !this.f4687c.isInBackStack() && !this.f4687c.mBeingSaved) {
                        if (FragmentManager.m35996G0(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + this.f4687c);
                        }
                        this.f4686b.m35841p().m35624b(this.f4687c);
                        this.f4686b.m35838s(this);
                        if (FragmentManager.m35996G0(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + this.f4687c);
                        }
                        this.f4687c.initState();
                    }
                    if (this.f4687c.mHiddenChanged) {
                        if (this.f4687c.mView != null && this.f4687c.mContainer != null) {
                            AbstractC1486i0 m35735n = AbstractC1486i0.m35735n(this.f4687c.mContainer, this.f4687c.getParentFragmentManager());
                            if (this.f4687c.mHidden) {
                                m35735n.m35746c(this);
                            } else {
                                m35735n.m35744e(this);
                            }
                        }
                        if (this.f4687c.mFragmentManager != null) {
                            this.f4687c.mFragmentManager.m36000E0(this.f4687c);
                        }
                        this.f4687c.mHiddenChanged = false;
                        this.f4687c.onHiddenChanged(this.f4687c.mHidden);
                        this.f4687c.mChildFragmentManager.m35997G();
                    }
                    return;
                }
            }
        } finally {
            this.f4688d = false;
        }
    }

    /* renamed from: n */
    void m35594n() {
        if (FragmentManager.m35996G0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f4687c);
        }
        this.f4687c.performPause();
        this.f4685a.m35662f(this.f4687c, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m35593o(ClassLoader classLoader) {
        Bundle bundle = this.f4687c.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        Fragment fragment = this.f4687c;
        fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
        Fragment fragment2 = this.f4687c;
        fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle("android:view_registry_state");
        Fragment fragment3 = this.f4687c;
        fragment3.mTargetWho = fragment3.mSavedFragmentState.getString("android:target_state");
        Fragment fragment4 = this.f4687c;
        if (fragment4.mTargetWho != null) {
            fragment4.mTargetRequestCode = fragment4.mSavedFragmentState.getInt("android:target_req_state", 0);
        }
        Fragment fragment5 = this.f4687c;
        Boolean bool = fragment5.mSavedUserVisibleHint;
        if (bool != null) {
            fragment5.mUserVisibleHint = bool.booleanValue();
            this.f4687c.mSavedUserVisibleHint = null;
        } else {
            fragment5.mUserVisibleHint = fragment5.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
        }
        Fragment fragment6 = this.f4687c;
        if (fragment6.mUserVisibleHint) {
            return;
        }
        fragment6.mDeferStart = true;
    }

    /* renamed from: p */
    void m35592p() {
        if (FragmentManager.m35996G0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f4687c);
        }
        View focusedView = this.f4687c.getFocusedView();
        if (focusedView != null && m35596l(focusedView)) {
            boolean requestFocus = focusedView.requestFocus();
            if (FragmentManager.m35996G0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("requestFocus: Restoring focused view ");
                sb.append(focusedView);
                sb.append(" ");
                sb.append(requestFocus ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(this.f4687c);
                sb.append(" resulting in focused view ");
                sb.append(this.f4687c.mView.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        this.f4687c.setFocusedView(null);
        this.f4687c.performResume();
        this.f4685a.m35659i(this.f4687c, false);
        Fragment fragment = this.f4687c;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public Fragment.C1427l m35590r() {
        Bundle m35591q;
        if (this.f4687c.mState <= -1 || (m35591q = m35591q()) == null) {
            return null;
        }
        return new Fragment.C1427l(m35591q);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m35589s() {
        C1524x c1524x = new C1524x(this.f4687c);
        if (this.f4687c.mState > -1 && c1524x.f4676E == null) {
            Bundle m35591q = m35591q();
            c1524x.f4676E = m35591q;
            if (this.f4687c.mTargetWho != null) {
                if (m35591q == null) {
                    c1524x.f4676E = new Bundle();
                }
                c1524x.f4676E.putString("android:target_state", this.f4687c.mTargetWho);
                int i = this.f4687c.mTargetRequestCode;
                if (i != 0) {
                    c1524x.f4676E.putInt("android:target_req_state", i);
                }
            }
        } else {
            c1524x.f4676E = this.f4687c.mSavedFragmentState;
        }
        this.f4686b.m35857B(this.f4687c.mWho, c1524x);
    }

    /* renamed from: t */
    void m35588t() {
        if (this.f4687c.mView == null) {
            return;
        }
        if (FragmentManager.m35996G0(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + this.f4687c + " with view " + this.f4687c.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f4687c.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f4687c.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f4687c.mViewLifecycleOwner.m35771e(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f4687c.mSavedViewRegistryState = bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public void m35587u(int i) {
        this.f4689e = i;
    }

    /* renamed from: v */
    void m35586v() {
        if (FragmentManager.m35996G0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f4687c);
        }
        this.f4687c.performStart();
        this.f4685a.m35657k(this.f4687c, false);
    }

    /* renamed from: w */
    void m35585w() {
        if (FragmentManager.m35996G0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f4687c);
        }
        this.f4687c.performStop();
        this.f4685a.m35656l(this.f4687c, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1526y(C1508q c1508q, C1447a0 c1447a0, ClassLoader classLoader, C1504n c1504n, C1524x c1524x) {
        this.f4685a = c1508q;
        this.f4686b = c1447a0;
        this.f4687c = c1524x.m35610a(c1504n, classLoader);
        if (FragmentManager.m35996G0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + this.f4687c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1526y(C1508q c1508q, C1447a0 c1447a0, Fragment fragment, C1524x c1524x) {
        this.f4685a = c1508q;
        this.f4686b = c1447a0;
        this.f4687c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        Fragment fragment3 = this.f4687c;
        fragment3.mTarget = null;
        Bundle bundle = c1524x.f4676E;
        if (bundle != null) {
            fragment3.mSavedFragmentState = bundle;
        } else {
            fragment3.mSavedFragmentState = new Bundle();
        }
    }
}
