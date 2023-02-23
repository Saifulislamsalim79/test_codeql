package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.AbstractC0904c;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.InterfaceC0903b;
import androidx.activity.result.p053f.AbstractC0908a;
import androidx.core.app.AbstractC1330p;
import androidx.core.app.C1297b;
import androidx.fragment.app.strictmode.C1515c;
import androidx.lifecycle.AbstractC1565i;
import androidx.lifecycle.C1548c0;
import androidx.lifecycle.C1556g0;
import androidx.lifecycle.C1566i0;
import androidx.lifecycle.C1571k0;
import androidx.lifecycle.C1573l0;
import androidx.lifecycle.C1578q;
import androidx.lifecycle.C1583u;
import androidx.lifecycle.InterfaceC1572l;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Lock;
import androidx.lifecycle.PreferenceActivity;
import androidx.lifecycle.Priority;
import androidx.lifecycle.Rule;
import androidx.lifecycle.Scope;
import androidx.lifecycle.Service;
import androidx.savedstate.C1868b;
import androidx.savedstate.C1869d;
import androidx.savedstate.ResultSet;
import androidx.savedstate.SavedStateRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p201g.p210b.p211a.p214c.InterfaceC7511a;
import p201g.p227h.p238l.C7697g;
import p201g.p254o.p255a.AbstractC7809a;
/* loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, PreferenceActivity, Rule, Lock, ResultSet {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION;
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    C1424i mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;
    FragmentManager mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    C1556g0.InterfaceC1559b mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    FragmentManager mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    AbstractC1505o<?> mHost;
    boolean mInLayout;
    boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    C1578q mLifecycleRegistry;
    Priority mMaxState;
    boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<AbstractC1426k> mOnPreAttachedListeners;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    Runnable mPostponedDurationRunnable;
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    C1868b mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    int mState;
    String mTag;
    Fragment mTarget;
    int mTargetRequestCode;
    String mTargetWho;
    boolean mUserVisibleHint;
    View mView;
    C1467f0 mViewLifecycleOwner;
    C1583u<androidx.lifecycle.o> mViewLifecycleOwnerLiveData;
    String mWho;

    /* loaded from: classes2.dex */
    public static class InstantiationException extends RuntimeException {
        public InstantiationException(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$a */
    /* loaded from: classes2.dex */
    class RunnableC1416a implements Runnable {
        RunnableC1416a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.startPostponedEnterTransition();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.Fragment$b */
    /* loaded from: classes2.dex */
    public class RunnableC1417b implements Runnable {
        RunnableC1417b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.callStartTransitionListener(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.Fragment$c */
    /* loaded from: classes2.dex */
    public class RunnableC1418c implements Runnable {

        /* renamed from: c */
        final /* synthetic */ AbstractC1486i0 f4361c;

        RunnableC1418c(Fragment fragment, AbstractC1486i0 abstractC1486i0) {
            this.f4361c = abstractC1486i0;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4361c.m35742g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.Fragment$d */
    /* loaded from: classes2.dex */
    public class C1419d extends AbstractC1499k {
        C1419d() {
        }

        @Override // androidx.fragment.app.AbstractC1499k
        /* renamed from: c */
        public View mo35680c(int i) {
            View view = Fragment.this.mView;
            if (view != null) {
                return view.findViewById(i);
            }
            throw new IllegalStateException("Fragment " + Fragment.this + " does not have a view");
        }

        @Override // androidx.fragment.app.AbstractC1499k
        /* renamed from: d */
        public boolean mo35679d() {
            return Fragment.this.mView != null;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$e */
    /* loaded from: classes2.dex */
    class C1420e implements InterfaceC7511a<Void, ActivityResultRegistry> {
        C1420e() {
        }

        @Override // p201g.p210b.p211a.p214c.InterfaceC7511a
        /* renamed from: b */
        public ActivityResultRegistry mo18527a(Void r3) {
            Fragment fragment = Fragment.this;
            androidx.activity.result.d dVar = fragment.mHost;
            if (dVar instanceof androidx.activity.result.d) {
                return dVar.getActivityResultRegistry();
            }
            return fragment.requireActivity().getActivityResultRegistry();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$f */
    /* loaded from: classes2.dex */
    class C1421f implements InterfaceC7511a<Void, ActivityResultRegistry> {

        /* renamed from: a */
        final /* synthetic */ ActivityResultRegistry f4364a;

        C1421f(Fragment fragment, ActivityResultRegistry activityResultRegistry) {
            this.f4364a = activityResultRegistry;
        }

        @Override // p201g.p210b.p211a.p214c.InterfaceC7511a
        /* renamed from: b */
        public ActivityResultRegistry mo18527a(Void r1) {
            return this.f4364a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.Fragment$g */
    /* loaded from: classes2.dex */
    public class C1422g extends AbstractC1426k {

        /* renamed from: a */
        final /* synthetic */ InterfaceC7511a f4365a;

        /* renamed from: b */
        final /* synthetic */ AtomicReference f4366b;

        /* renamed from: c */
        final /* synthetic */ AbstractC0908a f4367c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC0903b f4368d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1422g(InterfaceC7511a interfaceC7511a, AtomicReference atomicReference, AbstractC0908a abstractC0908a, InterfaceC0903b interfaceC0903b) {
            super(null);
            this.f4365a = interfaceC7511a;
            this.f4366b = atomicReference;
            this.f4367c = abstractC0908a;
            this.f4368d = interfaceC0903b;
        }

        @Override // androidx.fragment.app.Fragment.AbstractC1426k
        /* renamed from: a */
        void mo36013a() {
            this.f4366b.set(((ActivityResultRegistry) this.f4365a.mo18527a(null)).m37863j(Fragment.this.generateActivityResultKey(), Fragment.this, this.f4367c, this.f4368d));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.Fragment$h */
    /* loaded from: classes2.dex */
    public class C1423h extends AbstractC0904c<I> {

        /* renamed from: a */
        final /* synthetic */ AtomicReference f4370a;

        C1423h(Fragment fragment, AtomicReference atomicReference, AbstractC0908a abstractC0908a) {
            this.f4370a = atomicReference;
        }

        @Override // androidx.activity.result.AbstractC0904c
        /* renamed from: b */
        public void mo36016b(I i, C1297b c1297b) {
            AbstractC0904c abstractC0904c = (AbstractC0904c) this.f4370a.get();
            if (abstractC0904c != null) {
                abstractC0904c.mo36016b(i, c1297b);
                return;
            }
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }

        @Override // androidx.activity.result.AbstractC0904c
        /* renamed from: c */
        public void mo36015c() {
            AbstractC0904c abstractC0904c = (AbstractC0904c) this.f4370a.getAndSet(null);
            if (abstractC0904c != null) {
                abstractC0904c.mo36015c();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.Fragment$i */
    /* loaded from: classes2.dex */
    public static class C1424i {

        /* renamed from: a */
        View f4371a;

        /* renamed from: b */
        boolean f4372b;

        /* renamed from: c */
        int f4373c;

        /* renamed from: d */
        int f4374d;

        /* renamed from: e */
        int f4375e;

        /* renamed from: f */
        int f4376f;

        /* renamed from: g */
        int f4377g;

        /* renamed from: h */
        ArrayList<String> f4378h;

        /* renamed from: i */
        ArrayList<String> f4379i;

        /* renamed from: j */
        Object f4380j = null;

        /* renamed from: k */
        Object f4381k;

        /* renamed from: l */
        Object f4382l;

        /* renamed from: m */
        Object f4383m;

        /* renamed from: n */
        Object f4384n;

        /* renamed from: o */
        Object f4385o;

        /* renamed from: p */
        Boolean f4386p;

        /* renamed from: q */
        Boolean f4387q;

        /* renamed from: r */
        AbstractC1330p f4388r;

        /* renamed from: s */
        AbstractC1330p f4389s;

        /* renamed from: t */
        float f4390t;

        /* renamed from: u */
        View f4391u;

        /* renamed from: v */
        boolean f4392v;

        C1424i() {
            Object obj = Fragment.USE_DEFAULT_TRANSITION;
            this.f4381k = obj;
            this.f4382l = null;
            this.f4383m = obj;
            this.f4384n = null;
            this.f4385o = obj;
            this.f4388r = null;
            this.f4389s = null;
            this.f4390t = 1.0f;
            this.f4391u = null;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$j */
    /* loaded from: classes2.dex */
    static class C1425j {
        /* renamed from: a */
        static void m36014a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.fragment.app.Fragment$k */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC1426k {
        private AbstractC1426k() {
        }

        /* renamed from: a */
        abstract void mo36013a();

        /* synthetic */ AbstractC1426k(RunnableC1416a runnableC1416a) {
            this();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    static {
        Object $r0 = new Object();
        USE_DEFAULT_TRANSITION = $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public Fragment() {
        this.mState = -1;
        UUID $r1 = UUID.randomUUID();
        String $r2 = $r1.toString();
        this.mWho = $r2;
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        C1510r r9 = new C1510r();
        this.mChildFragmentManager = r9;
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        Runnable r10 = new RunnableC1416a();
        Runnable r14 = r10;
        this.mPostponedDurationRunnable = r14;
        Priority $r5 = Priority.f4719G;
        this.mMaxState = $r5;
        C1583u r11 = new C1583u();
        this.mViewLifecycleOwnerLiveData = r11;
        AtomicInteger r12 = new AtomicInteger();
        this.mNextLocalRequestCode = r12;
        ArrayList r13 = new ArrayList();
        this.mOnPreAttachedListeners = r13;
        initLifecycle();
    }

    public Fragment(int i) {
        this();
        this.mContentLayoutId = i;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    private C1424i ensureAnimationInfo() {
        C1424i $r1 = this.mAnimationInfo;
        if ($r1 == null) {
            C1424i $r12 = new C1424i();
            this.mAnimationInfo = $r12;
        }
        C1424i $r13 = this.mAnimationInfo;
        return $r13;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    private int getMinimumMaxLifecycleState() {
        Priority $r1 = this.mMaxState;
        Priority $r2 = Priority.f4720H;
        if ($r1 != $r2) {
            Fragment $r3 = this.mParentFragment;
            if ($r3 != null) {
                int $i0 = $r1.ordinal();
                int $i1 = this.mParentFragment.getMinimumMaxLifecycleState();
                return Math.min($i0, $i1);
            }
        }
        int $i02 = this.mMaxState.ordinal();
        return $i02;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    private Fragment getTargetFragment(boolean z) {
        String $r1;
        if (z) {
            C1515c.m35637l(this);
        }
        Fragment $r2 = this.mTarget;
        if ($r2 != null) {
            return $r2;
        }
        FragmentManager $r3 = this.mFragmentManager;
        if ($r3 == null || ($r1 = this.mTargetWho) == null) {
            return null;
        }
        Fragment $r0 = $r3.m35947d0($r1);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    private void initLifecycle() {
        C1578q $r2 = new C1578q(this);
        this.mLifecycleRegistry = $r2;
        C1868b $r1 = C1868b.a(this);
        this.mSavedStateRegistryController = $r1;
        this.mDefaultFactory = null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static Fragment instantiate(Context context, String str) {
        Fragment $r1 = instantiate(context, str, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static Fragment instantiate(Context context, String $r2, Bundle bundle) {
        try {
            ClassLoader $r4 = context.getClassLoader();
            Class $r5 = C1504n.m35681d($r4, $r2);
            Class[] $r0 = new Class[0];
            Constructor $r6 = $r5.getConstructor($r0);
            Object[] $r7 = new Object[0];
            Object $r8 = $r6.newInstance($r7);
            Fragment $r9 = (Fragment) $r8;
            if (bundle != null) {
                Class $r52 = $r9.getClass();
                ClassLoader $r42 = $r52.getClassLoader();
                bundle.setClassLoader($r42);
                $r9.setArguments(bundle);
                return $r9;
            }
            return $r9;
        } catch (IllegalAccessException $r14) {
            Throwable r17 = new InstantiationException("Unable to instantiate fragment " + $r2 + ": make sure class name exists, is public, and has an empty constructor that is public", $r14);
            Throwable r18 = r17;
            throw r18;
        } catch (java.lang.InstantiationException $r15) {
            Throwable r172 = new InstantiationException("Unable to instantiate fragment " + $r2 + ": make sure class name exists, is public, and has an empty constructor that is public", $r15);
            Throwable r182 = r172;
            throw r182;
        } catch (NoSuchMethodException $r13) {
            Throwable r173 = new InstantiationException("Unable to instantiate fragment " + $r2 + ": could not find Fragment constructor", $r13);
            Throwable r183 = r173;
            throw r183;
        } catch (InvocationTargetException $r10) {
            Throwable r174 = new InstantiationException("Unable to instantiate fragment " + $r2 + ": calling Fragment constructor caused an exception", $r10);
            Throwable r184 = r174;
            throw r184;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    private AbstractC0904c prepareCallInternal(AbstractC0908a abstractC0908a, InterfaceC7511a interfaceC7511a, InterfaceC0903b interfaceC0903b) {
        int $i0 = this.mState;
        if ($i0 <= 1) {
            AtomicReference $r5 = new AtomicReference();
            C1422g $r6 = new C1422g(interfaceC7511a, $r5, abstractC0908a, interfaceC0903b);
            registerOnPreAttachListener($r6);
            C1423h $r7 = new C1423h(this, $r5, abstractC0908a);
            return $r7;
        }
        String $r1 = "Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).";
        IllegalStateException $r8 = new IllegalStateException($r1);
        throw $r8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    private void registerOnPreAttachListener(AbstractC1426k abstractC1426k) {
        int $i0 = this.mState;
        if ($i0 >= 0) {
            abstractC1426k.mo36013a();
            return;
        }
        ArrayList $r2 = this.mOnPreAttachedListeners;
        $r2.add(abstractC1426k);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    private void restoreViewState() {
        boolean $z0 = FragmentManager.m35996G0(3);
        if ($z0) {
            String $r2 = "moveto RESTORE_VIEW_STATE: " + this;
            Log.d("FragmentManager", $r2);
        }
        View $r3 = this.mView;
        if ($r3 != null) {
            Bundle $r4 = this.mSavedFragmentState;
            restoreViewState($r4);
        }
        this.mSavedFragmentState = null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    void callStartTransitionListener(boolean z) {
        ViewGroup $r3;
        FragmentManager $r4;
        C1424i $r1 = this.mAnimationInfo;
        if ($r1 != null) {
            $r1.f4392v = false;
        }
        View $r2 = this.mView;
        if ($r2 == null || ($r3 = this.mContainer) == null || ($r4 = this.mFragmentManager) == null) {
            return;
        }
        AbstractC1486i0 $r5 = AbstractC1486i0.m35735n($r3, $r4);
        $r5.m35733p();
        if (!z) {
            $r5.m35742g();
            return;
        }
        AbstractC1505o $r6 = this.mHost;
        Handler $r7 = $r6.m35676g();
        Runnable r9 = new RunnableC1418c(this, $r5);
        Runnable r10 = r9;
        $r7.post(r10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public AbstractC1499k createFragmentContainer() {
        C1419d $r1 = new C1419d();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        int $i0 = this.mFragmentId;
        String $r5 = Integer.toHexString($i0);
        printWriter.print($r5);
        printWriter.print(" mContainerId=#");
        int $i02 = this.mContainerId;
        String $r52 = Integer.toHexString($i02);
        printWriter.print($r52);
        printWriter.print(" mTag=");
        String $r53 = this.mTag;
        printWriter.println($r53);
        printWriter.print(str);
        printWriter.print("mState=");
        int $i03 = this.mState;
        printWriter.print($i03);
        printWriter.print(" mWho=");
        String $r54 = this.mWho;
        printWriter.print($r54);
        printWriter.print(" mBackStackNesting=");
        int $i04 = this.mBackStackNesting;
        printWriter.println($i04);
        printWriter.print(str);
        printWriter.print("mAdded=");
        boolean $z0 = this.mAdded;
        printWriter.print($z0);
        printWriter.print(" mRemoving=");
        boolean $z02 = this.mRemoving;
        printWriter.print($z02);
        printWriter.print(" mFromLayout=");
        boolean $z03 = this.mFromLayout;
        printWriter.print($z03);
        printWriter.print(" mInLayout=");
        boolean $z04 = this.mInLayout;
        printWriter.println($z04);
        printWriter.print(str);
        printWriter.print("mHidden=");
        boolean $z05 = this.mHidden;
        printWriter.print($z05);
        printWriter.print(" mDetached=");
        boolean $z06 = this.mDetached;
        printWriter.print($z06);
        printWriter.print(" mMenuVisible=");
        boolean $z07 = this.mMenuVisible;
        printWriter.print($z07);
        printWriter.print(" mHasMenu=");
        boolean $z08 = this.mHasMenu;
        printWriter.println($z08);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        boolean $z09 = this.mRetainInstance;
        printWriter.print($z09);
        printWriter.print(" mUserVisibleHint=");
        boolean $z010 = this.mUserVisibleHint;
        printWriter.println($z010);
        FragmentManager $r6 = this.mFragmentManager;
        if ($r6 != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            FragmentManager $r62 = this.mFragmentManager;
            printWriter.println($r62);
        }
        AbstractC1505o $r7 = this.mHost;
        if ($r7 != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            AbstractC1505o $r72 = this.mHost;
            printWriter.println($r72);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        Bundle $r9 = this.mArguments;
        if ($r9 != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            Bundle $r92 = this.mArguments;
            printWriter.println($r92);
        }
        Bundle $r93 = this.mSavedFragmentState;
        if ($r93 != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            Bundle $r94 = this.mSavedFragmentState;
            printWriter.println($r94);
        }
        SparseArray $r10 = this.mSavedViewState;
        if ($r10 != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            SparseArray $r102 = this.mSavedViewState;
            printWriter.println($r102);
        }
        Bundle $r95 = this.mSavedViewRegistryState;
        if ($r95 != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            Bundle $r96 = this.mSavedViewRegistryState;
            printWriter.println($r96);
        }
        Fragment $r8 = getTargetFragment(false);
        if ($r8 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print($r8);
            printWriter.print(" mTargetRequestCode=");
            int $i05 = this.mTargetRequestCode;
            printWriter.println($i05);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        boolean $z011 = getPopDirection();
        printWriter.println($z011);
        int $i06 = getEnterAnim();
        if ($i06 != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            int $i07 = getEnterAnim();
            printWriter.println($i07);
        }
        int $i08 = getExitAnim();
        if ($i08 != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            int $i09 = getExitAnim();
            printWriter.println($i09);
        }
        int $i010 = getPopEnterAnim();
        if ($i010 != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            int $i011 = getPopEnterAnim();
            printWriter.println($i011);
        }
        int $i012 = getPopExitAnim();
        if ($i012 != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            int $i013 = getPopExitAnim();
            printWriter.println($i013);
        }
        ViewGroup $r11 = this.mContainer;
        if ($r11 != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            ViewGroup $r112 = this.mContainer;
            printWriter.println($r112);
        }
        View $r12 = this.mView;
        if ($r12 != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            View $r122 = this.mView;
            printWriter.println($r122);
        }
        View $r123 = getAnimatingAway();
        if ($r123 != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            View $r124 = getAnimatingAway();
            printWriter.println($r124);
        }
        Context $r13 = getContext();
        if ($r13 != null) {
            AbstractC7809a $r14 = AbstractC7809a.b(this);
            $r14.mo17253a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        StringBuilder $r15 = new StringBuilder();
        $r15.append("Child ");
        FragmentManager $r63 = this.mChildFragmentManager;
        $r15.append($r63);
        $r15.append(":");
        String $r55 = $r15.toString();
        printWriter.println($r55);
        FragmentManager $r64 = this.mChildFragmentManager;
        String $r4 = str + "  ";
        $r64.m35969U($r4, fileDescriptor, printWriter, strArr);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final boolean equals(Object obj) {
        boolean $z0 = super.equals(obj);
        return $z0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public Fragment findFragmentByWho(String str) {
        String $r2 = this.mWho;
        boolean $z0 = str.equals($r2);
        if ($z0) {
            return this;
        }
        FragmentManager $r3 = this.mChildFragmentManager;
        Fragment $r0 = $r3.m35935h0(str);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    String generateActivityResultKey() {
        StringBuilder $r1 = new StringBuilder();
        $r1.append("fragment_");
        String $r2 = this.mWho;
        $r1.append($r2);
        $r1.append("_rq#");
        AtomicInteger $r3 = this.mNextLocalRequestCode;
        int $i0 = $r3.getAndIncrement();
        $r1.append($i0);
        String $r22 = $r1.toString();
        return $r22;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final FragmentActivity getActivity() {
        AbstractC1505o $r2 = this.mHost;
        if ($r2 == null) {
            return null;
        }
        Activity $r1 = $r2.m35678e();
        FragmentActivity $r3 = (FragmentActivity) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public boolean getAllowEnterTransitionOverlap() {
        Boolean $r2;
        C1424i $r1 = this.mAnimationInfo;
        if ($r1 == null || ($r2 = $r1.f4387q) == null) {
            return true;
        }
        boolean $z0 = $r2.booleanValue();
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public boolean getAllowReturnTransitionOverlap() {
        Boolean $r2;
        C1424i $r1 = this.mAnimationInfo;
        if ($r1 == null || ($r2 = $r1.f4386p) == null) {
            return true;
        }
        boolean $z0 = $r2.booleanValue();
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    View getAnimatingAway() {
        C1424i $r1 = this.mAnimationInfo;
        if ($r1 == null) {
            return null;
        }
        View r2 = $r1.f4371a;
        return r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final Bundle getArguments() {
        Bundle r1 = this.mArguments;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final FragmentManager getChildFragmentManager() {
        AbstractC1505o $r2 = this.mHost;
        if ($r2 != null) {
            FragmentManager r5 = this.mChildFragmentManager;
            return r5;
        }
        String $r1 = "Fragment " + this + " has not been attached yet.";
        IllegalStateException $r3 = new IllegalStateException($r1);
        throw $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public Context getContext() {
        AbstractC1505o $r2 = this.mHost;
        if ($r2 == null) {
            return null;
        }
        Context $r1 = $r2.m35677f();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchDebugInfoByOffset(DebugInfoApplyVisitor.java:106)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:83)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
    	at java.util.ArrayList.forEach(ArrayList.java:1259)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    @Override // androidx.lifecycle.Lock
    public C1556g0.InterfaceC1559b getDefaultViewModelProviderFactory() {
        FragmentManager $r1 = this.mFragmentManager;
        if ($r1 == null) {
            IllegalStateException r13 = new IllegalStateException("Can't access ViewModels from detached fragment");
            throw r13;
        }
        C1556g0.InterfaceC1559b $r2 = this.mDefaultFactory;
        if ($r2 == null) {
            Application $r3 = null;
            Context $r4 = requireContext();
            Context $r42 = $r4.getApplicationContext();
            while (true) {
                boolean $z0 = $r42 instanceof ContextWrapper;
                if (!$z0) {
                    break;
                }
                boolean $z02 = $r42 instanceof Application;
                if ($z02) {
                    $r3 = (Application) $r42;
                    break;
                }
                ContextWrapper $r5 = (ContextWrapper) $r42;
                $r42 = $r5.getBaseContext();
            }
            if ($r3 == null) {
                boolean $z03 = FragmentManager.m35996G0(3);
                if ($z03) {
                    StringBuilder r11 = new StringBuilder();
                    r11.append("Could not find Application instance from Context ");
                    Context $r43 = requireContext();
                    r11.append($r43.getApplicationContext());
                    r11.append(", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
                    String $r7 = r11.toString();
                    Log.d("FragmentManager", $r7);
                }
            }
            Bundle $r9 = getArguments();
            C1556g0.InterfaceC1559b r12 = new C1548c0($r3, this, $r9);
            C1556g0.InterfaceC1559b $r22 = r12;
            this.mDefaultFactory = $r22;
        }
        C1556g0.InterfaceC1559b $r23 = this.mDefaultFactory;
        return $r23;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public int getEnterAnim() {
        C1424i $r1 = this.mAnimationInfo;
        if ($r1 == null) {
            return 0;
        }
        int i0 = $r1.f4373c;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public Object getEnterTransition() {
        C1424i $r1 = this.mAnimationInfo;
        if ($r1 == null) {
            return null;
        }
        Object r2 = $r1.f4380j;
        return r2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public AbstractC1330p getEnterTransitionCallback() {
        C1424i $r1 = this.mAnimationInfo;
        if ($r1 == null) {
            return null;
        }
        AbstractC1330p r2 = $r1.f4388r;
        return r2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public int getExitAnim() {
        C1424i $r1 = this.mAnimationInfo;
        if ($r1 == null) {
            return 0;
        }
        int i0 = $r1.f4374d;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public Object getExitTransition() {
        C1424i $r1 = this.mAnimationInfo;
        if ($r1 == null) {
            return null;
        }
        Object r2 = $r1.f4382l;
        return r2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public AbstractC1330p getExitTransitionCallback() {
        C1424i $r1 = this.mAnimationInfo;
        if ($r1 == null) {
            return null;
        }
        AbstractC1330p r2 = $r1.f4389s;
        return r2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public View getFocusedView() {
        C1424i $r1 = this.mAnimationInfo;
        if ($r1 == null) {
            return null;
        }
        View r2 = $r1.f4391u;
        return r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final FragmentManager getFragmentManager() {
        FragmentManager r1 = this.mFragmentManager;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final Object getHost() {
        AbstractC1505o $r2 = this.mHost;
        if ($r2 == null) {
            return null;
        }
        Object $r1 = $r2.mo35674i();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final int getId() {
        int i0 = this.mFragmentId;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final LayoutInflater getLayoutInflater() {
        LayoutInflater $r1 = this.mLayoutInflater;
        return $r1 == null ? performGetLayoutInflater(null) : $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        AbstractC1505o $r2 = this.mHost;
        if ($r2 == null) {
            IllegalStateException $r6 = new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
            throw $r6;
        }
        LayoutInflater $r3 = $r2.mo35673j();
        FragmentManager $r4 = this.mChildFragmentManager;
        LayoutInflater.Factory2 $r5 = $r4.m35896u0();
        C7697g.m17794b($r3, $r5);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    @Override // androidx.lifecycle.PreferenceActivity
    public AbstractC1565i getLifecycle() {
        C1578q r1 = this.mLifecycleRegistry;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public AbstractC7809a getLoaderManager() {
        AbstractC7809a $r1 = AbstractC7809a.b(this);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public int getNextTransition() {
        C1424i $r1 = this.mAnimationInfo;
        if ($r1 == null) {
            return 0;
        }
        int i0 = $r1.f4377g;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final Fragment getParentFragment() {
        Fragment $r0 = this.mParentFragment;
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final FragmentManager getParentFragmentManager() {
        FragmentManager $r2 = this.mFragmentManager;
        if ($r2 != null) {
            return $r2;
        }
        String $r1 = "Fragment " + this + " not associated with a fragment manager.";
        IllegalStateException $r3 = new IllegalStateException($r1);
        throw $r3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public boolean getPopDirection() {
        C1424i $r1 = this.mAnimationInfo;
        if ($r1 == null) {
            return false;
        }
        boolean z0 = $r1.f4372b;
        return z0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public int getPopEnterAnim() {
        C1424i $r1 = this.mAnimationInfo;
        if ($r1 == null) {
            return 0;
        }
        int i0 = $r1.f4375e;
        return i0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public int getPopExitAnim() {
        C1424i $r1 = this.mAnimationInfo;
        if ($r1 == null) {
            return 0;
        }
        int i0 = $r1.f4376f;
        return i0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public float getPostOnViewCreatedAlpha() {
        C1424i $r1 = this.mAnimationInfo;
        if ($r1 == null) {
            return 1.0f;
        }
        float f0 = $r1.f4390t;
        return f0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public Object getReenterTransition() {
        C1424i $r2 = this.mAnimationInfo;
        if ($r2 == null) {
            return null;
        }
        Object $r3 = $r2.f4383m;
        Object $r1 = USE_DEFAULT_TRANSITION;
        if ($r3 == $r1) {
            Object $r12 = getExitTransition();
            return $r12;
        }
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final Resources getResources() {
        Context $r1 = requireContext();
        Resources $r2 = $r1.getResources();
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final boolean getRetainInstance() {
        C1515c.m35639j(this);
        boolean z0 = this.mRetainInstance;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public Object getReturnTransition() {
        C1424i $r2 = this.mAnimationInfo;
        if ($r2 == null) {
            return null;
        }
        Object $r3 = $r2.f4381k;
        Object $r1 = USE_DEFAULT_TRANSITION;
        if ($r3 == $r1) {
            Object $r12 = getEnterTransition();
            return $r12;
        }
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    @Override // androidx.savedstate.ResultSet
    public final SavedStateRegistry getSavedStateRegistry() {
        C1868b $r2 = this.mSavedStateRegistryController;
        SavedStateRegistry $r1 = $r2.m34392b();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public Object getSharedElementEnterTransition() {
        C1424i $r1 = this.mAnimationInfo;
        if ($r1 == null) {
            return null;
        }
        Object r2 = $r1.f4384n;
        return r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public Object getSharedElementReturnTransition() {
        C1424i $r2 = this.mAnimationInfo;
        if ($r2 == null) {
            return null;
        }
        Object $r3 = $r2.f4385o;
        Object $r1 = USE_DEFAULT_TRANSITION;
        if ($r3 == $r1) {
            Object $r12 = getSharedElementEnterTransition();
            return $r12;
        }
        return $r3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public ArrayList getSharedElementSourceNames() {
        ArrayList $r2;
        C1424i $r1 = this.mAnimationInfo;
        return ($r1 == null || ($r2 = $r1.f4378h) == null) ? new ArrayList() : $r2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public ArrayList getSharedElementTargetNames() {
        ArrayList $r2;
        C1424i $r1 = this.mAnimationInfo;
        return ($r1 == null || ($r2 = $r1.f4379i) == null) ? new ArrayList() : $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String getString(int i) {
        Resources $r1 = getResources();
        String $r2 = $r1.getString(i);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String getString(int i, Object... objArr) {
        Resources $r2 = getResources();
        String $r3 = $r2.getString(i, objArr);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String getTag() {
        String r1 = this.mTag;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final Fragment getTargetFragment() {
        Fragment $r0 = getTargetFragment(true);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final int getTargetRequestCode() {
        C1515c.m35638k(this);
        int i0 = this.mTargetRequestCode;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final CharSequence getText(int i) {
        Resources $r1 = getResources();
        CharSequence $r2 = $r1.getText(i);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public boolean getUserVisibleHint() {
        boolean z0 = this.mUserVisibleHint;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public View getView() {
        View r1 = this.mView;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public PreferenceActivity getViewLifecycleOwner() {
        C1467f0 $r1 = this.mViewLifecycleOwner;
        if ($r1 != null) {
            PreferenceActivity r4 = (PreferenceActivity) $r1;
            return r4;
        }
        IllegalStateException r3 = new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
        throw r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public LiveData getViewLifecycleOwnerLiveData() {
        C1583u r1 = this.mViewLifecycleOwnerLiveData;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    @Override // androidx.lifecycle.Rule
    public C1566i0 getViewModelStore() {
        FragmentManager $r1 = this.mFragmentManager;
        if ($r1 == null) {
            IllegalStateException $r4 = new IllegalStateException("Can't access ViewModels from detached fragment");
            throw $r4;
        }
        int $i0 = getMinimumMaxLifecycleState();
        Priority $r2 = Priority.f4720H;
        int $i1 = $r2.ordinal();
        if ($i0 == $i1) {
            IllegalStateException $r42 = new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
            throw $r42;
        }
        FragmentManager $r12 = this.mFragmentManager;
        C1566i0 $r3 = $r12.m36006B0(this);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final boolean hasOptionsMenu() {
        boolean z0 = this.mHasMenu;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final int hashCode() {
        int $i0 = super.hashCode();
        return $i0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void initState() {
        initLifecycle();
        String $r2 = this.mWho;
        this.mPreviousWho = $r2;
        UUID $r3 = UUID.randomUUID();
        String $r22 = $r3.toString();
        this.mWho = $r22;
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        C1510r $r1 = new C1510r();
        this.mChildFragmentManager = $r1;
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final boolean isAdded() {
        AbstractC1505o $r1 = this.mHost;
        if ($r1 != null) {
            boolean $z0 = this.mAdded;
            return $z0;
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final boolean isDetached() {
        boolean z0 = this.mDetached;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final boolean isHidden() {
        boolean $z0 = this.mHidden;
        if ($z0) {
            return true;
        }
        FragmentManager $r1 = this.mFragmentManager;
        if ($r1 != null) {
            Fragment $r0 = this.mParentFragment;
            boolean $z02 = $r1.m35992I0($r0);
            return $z02;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final boolean isInBackStack() {
        int $i0 = this.mBackStackNesting;
        return $i0 > 0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final boolean isInLayout() {
        boolean z0 = this.mInLayout;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final boolean isMenuVisible() {
        boolean $z0 = this.mMenuVisible;
        if ($z0) {
            FragmentManager $r1 = this.mFragmentManager;
            if ($r1 != null) {
                Fragment $r0 = this.mParentFragment;
                boolean $z02 = $r1.m35990J0($r0);
                return $z02;
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public boolean isPostponed() {
        C1424i $r1 = this.mAnimationInfo;
        if ($r1 == null) {
            return false;
        }
        boolean z0 = $r1.f4392v;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final boolean isRemoving() {
        boolean z0 = this.mRemoving;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final boolean isResumed() {
        int $i0 = this.mState;
        return $i0 >= 7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final boolean isStateSaved() {
        FragmentManager $r1 = this.mFragmentManager;
        if ($r1 == null) {
            return false;
        }
        boolean $z0 = $r1.m35984M0();
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final boolean isVisible() {
        View $r1;
        boolean $z0 = isAdded();
        if ($z0) {
            boolean $z02 = isHidden();
            if ($z02 || ($r1 = this.mView) == null) {
                return false;
            }
            IBinder $r2 = $r1.getWindowToken();
            if ($r2 != null) {
                int $i0 = this.mView.getVisibility();
                return $i0 == 0;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void noteStateNotSaved() {
        FragmentManager $r1 = this.mChildFragmentManager;
        $r1.m35972S0();
    }

    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void onActivityResult(int i, int i2, Intent intent) {
        boolean $z0 = FragmentManager.m35996G0(2);
        if ($z0) {
            String $r3 = "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent;
            Log.v("FragmentManager", $r3);
        }
    }

    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchDebugInfoByOffset(DebugInfoApplyVisitor.java:106)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:83)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
    	at java.util.ArrayList.forEach(ArrayList.java:1259)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void onAttach(Context context) {
        this.mCalled = true;
        AbstractC1505o $r3 = this.mHost;
        Activity $r1 = $r3 == null ? null : $r3.m35678e();
        if ($r1 != null) {
            this.mCalled = false;
            onAttach($r1);
        }
    }

    public void onAttachFragment(Fragment fragment) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState(bundle);
        FragmentManager $r2 = this.mChildFragmentManager;
        boolean $z0 = $r2.m35986L0(1);
        if ($z0) {
            return;
        }
        FragmentManager $r22 = this.mChildFragmentManager;
        $r22.m35883z();
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        FragmentActivity $r4 = requireActivity();
        $r4.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int $i0 = this.mContentLayoutId;
        if ($i0 != 0) {
            View $r2 = layoutInflater.inflate($i0, viewGroup, false);
            return $r2;
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater $r1 = getLayoutInflater(bundle);
        return $r1;
    }

    public void onHiddenChanged(boolean z) {
    }

    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchDebugInfoByOffset(DebugInfoApplyVisitor.java:106)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:83)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
    	at java.util.ArrayList.forEach(ArrayList.java:1259)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        AbstractC1505o $r5 = this.mHost;
        Activity $r3 = $r5 == null ? null : $r5.m35678e();
        if ($r3 != null) {
            this.mCalled = false;
            onInflate($r3, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void performActivityCreated(Bundle bundle) {
        FragmentManager $r3 = this.mChildFragmentManager;
        $r3.m35972S0();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        boolean $z0 = this.mCalled;
        if ($z0) {
            restoreViewState();
            FragmentManager $r32 = this.mChildFragmentManager;
            $r32.m35894v();
            return;
        }
        String $r1 = "Fragment " + this + " did not call through to super.onActivityCreated()";
        Throwable r7 = new C1500k0($r1);
        Throwable r8 = r7;
        throw r8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x000e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void performAttach() {
        /*
            r19 = this;
            r0 = r19
            java.util.ArrayList<androidx.fragment.app.Fragment$k> r1 = r0.mOnPreAttachedListeners
            r19 = r0
            java.util.Iterator r2 = r1.iterator()
        La:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L1c
            java.lang.Object r4 = r2.next()
            r6 = r4
            androidx.fragment.app.Fragment$k r6 = (androidx.fragment.app.Fragment.AbstractC1426k) r6
            r5 = r6
            r5.mo36013a()
            goto La
        L1c:
            r0 = r19
            java.util.ArrayList<androidx.fragment.app.Fragment$k> r1 = r0.mOnPreAttachedListeners
            r19 = r0
            r1.clear()
            r0 = r19
            androidx.fragment.app.FragmentManager r7 = r0.mChildFragmentManager
            r0 = r19
            androidx.fragment.app.o<?> r8 = r0.mHost
            r0 = r19
            androidx.fragment.app.k r9 = r0.createFragmentContainer()
            r0 = r19
            r7.m35930j(r8, r9, r0)
            r10 = 0
            r0 = r19
            r0.mState = r10
            r10 = 0
            r0 = r19
            r0.mCalled = r10
            r0 = r19
            androidx.fragment.app.o<?> r8 = r0.mHost
            android.content.Context r11 = r8.m35677f()
            r0 = r19
            r0.onAttach(r11)
            r0 = r19
            boolean r3 = r0.mCalled
            if (r3 == 0) goto L66
            r0 = r19
            androidx.fragment.app.FragmentManager r7 = r0.mFragmentManager
            r0 = r19
            r7.m35999F(r0)
            r0 = r19
            androidx.fragment.app.FragmentManager r7 = r0.mChildFragmentManager
            r7.m35891w()
            return
        L66:
            androidx.fragment.app.k0 r12 = new androidx.fragment.app.k0
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r14 = r13
            r13.<init>()
            java.lang.String r15 = "Fragment "
            r14.append(r15)
            r0 = r19
            r14.append(r0)
            java.lang.String r15 = " did not call through to super.onAttach()"
            r14.append(r15)
            java.lang.String r16 = r14.toString()
            r0 = r16
            r12.<init>(r0)
            goto L87
        L87:
            r18 = r12
            java.lang.Throwable r18 = (java.lang.Throwable) r18
            r17 = r18
            throw r17
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.performAttach():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
        FragmentManager $r2 = this.mChildFragmentManager;
        $r2.m35888x(configuration);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public boolean performContextItemSelected(MenuItem menuItem) {
        boolean $z0 = this.mHidden;
        if ($z0) {
            return false;
        }
        boolean $z02 = onContextItemSelected(menuItem);
        if ($z02) {
            return true;
        }
        FragmentManager $r2 = this.mChildFragmentManager;
        boolean $z03 = $r2.m35885y(menuItem);
        return $z03;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchDebugInfoByOffset(DebugInfoApplyVisitor.java:106)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:83)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
    	at java.util.ArrayList.forEach(ArrayList.java:1259)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void performCreate(Bundle bundle) {
        FragmentManager $r3 = this.mChildFragmentManager;
        $r3.m35972S0();
        this.mState = 1;
        this.mCalled = false;
        int $i0 = Build.VERSION.SDK_INT;
        if ($i0 >= 19) {
            C1578q $r4 = this.mLifecycleRegistry;
            Service r13 = (Service) new InterfaceC1572l() { // from class: androidx.fragment.app.Fragment.5
                @Override // androidx.lifecycle.InterfaceC1572l
                /* renamed from: m */
                public void mo34271m(androidx.lifecycle.o oVar, AbstractC1565i.b bVar) {
                    View view;
                    if (bVar != AbstractC1565i.b.ON_STOP || (view = Fragment.this.mView) == null) {
                        return;
                    }
                    C1425j.m36014a(view);
                }
            };
            $r4.a(r13);
        }
        C1868b $r6 = this.mSavedStateRegistryController;
        $r6.m34391c(bundle);
        onCreate(bundle);
        this.mIsCreated = true;
        boolean $z0 = this.mCalled;
        if ($z0) {
            C1578q $r42 = this.mLifecycleRegistry;
            Scope $r7 = Scope.ON_CREATE;
            $r42.h($r7);
            return;
        }
        String $r1 = "Fragment " + this + " did not call through to super.onCreate()";
        Throwable r12 = new C1500k0($r1);
        Throwable r14 = r12;
        throw r14;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchDebugInfoByOffset(DebugInfoApplyVisitor.java:106)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:83)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
    	at java.util.ArrayList.forEach(ArrayList.java:1259)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean $z0 = this.mHidden;
        boolean $z1 = false;
        if ($z0) {
            return false;
        }
        boolean $z02 = this.mHasMenu;
        if ($z02) {
            boolean $z03 = this.mMenuVisible;
            if ($z03) {
                $z1 = true;
                onCreateOptionsMenu(menu, menuInflater);
            }
        }
        FragmentManager $r3 = this.mChildFragmentManager;
        boolean $z04 = $r3.m36009A(menu, menuInflater);
        return $z1 | $z04;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FragmentManager $r4 = this.mChildFragmentManager;
        $r4.m35972S0();
        this.mPerformedCreateView = true;
        C1566i0 $r6 = getViewModelStore();
        C1467f0 r10 = new C1467f0(this, $r6);
        this.mViewLifecycleOwner = r10;
        View $r7 = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = $r7;
        if ($r7 == null) {
            C1467f0 $r5 = this.mViewLifecycleOwner;
            boolean $z0 = $r5.m35773c();
            if ($z0) {
                IllegalStateException r11 = new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
                throw r11;
            } else {
                this.mViewLifecycleOwner = null;
                return;
            }
        }
        C1467f0 $r52 = this.mViewLifecycleOwner;
        $r52.m35774b();
        View $r72 = this.mView;
        C1467f0 $r53 = this.mViewLifecycleOwner;
        PreferenceActivity r12 = (PreferenceActivity) $r53;
        C1571k0.a($r72, r12);
        View $r73 = this.mView;
        C1467f0 $r54 = this.mViewLifecycleOwner;
        Rule r13 = (Rule) $r54;
        C1573l0.a($r73, r13);
        View $r74 = this.mView;
        C1467f0 $r55 = this.mViewLifecycleOwner;
        ResultSet r14 = (ResultSet) $r55;
        C1869d.a($r74, r14);
        C1583u $r8 = this.mViewLifecycleOwnerLiveData;
        C1467f0 $r56 = this.mViewLifecycleOwner;
        $r8.setValue($r56);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void performDestroy() {
        FragmentManager $r2 = this.mChildFragmentManager;
        $r2.m36007B();
        C1578q $r3 = this.mLifecycleRegistry;
        Scope $r4 = Scope.ON_DESTROY;
        $r3.h($r4);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        boolean $z0 = this.mCalled;
        if ($z0) {
            return;
        }
        String $r1 = "Fragment " + this + " did not call through to super.onDestroy()";
        Throwable r8 = new C1500k0($r1);
        Throwable r9 = r8;
        throw r9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void performDestroyView() {
        FragmentManager $r1 = this.mChildFragmentManager;
        $r1.m36005C();
        View $r2 = this.mView;
        if ($r2 != null) {
            C1467f0 $r3 = this.mViewLifecycleOwner;
            AbstractC1565i $r4 = $r3.getLifecycle();
            Priority $r5 = $r4.mo35505b();
            Priority $r6 = Priority.f4721I;
            boolean $z0 = $r5.m35575c($r6);
            if ($z0) {
                C1467f0 $r32 = this.mViewLifecycleOwner;
                Scope $r7 = Scope.ON_DESTROY;
                $r32.a($r7);
            }
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        boolean $z02 = this.mCalled;
        if ($z02) {
            AbstractC7809a $r8 = AbstractC7809a.b(this);
            $r8.mo17252c();
            this.mPerformedCreateView = false;
            return;
        }
        String $r11 = "Fragment " + this + " did not call through to super.onDestroyView()";
        Throwable r13 = new C1500k0($r11);
        Throwable r14 = r13;
        throw r14;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        boolean $z0 = this.mCalled;
        if (!$z0) {
            String $r5 = "Fragment " + this + " did not call through to super.onDetach()";
            Throwable r8 = new C1500k0($r5);
            Throwable r9 = r8;
            throw r9;
        }
        FragmentManager $r1 = this.mChildFragmentManager;
        boolean $z02 = $r1.m35998F0();
        if ($z02) {
            return;
        }
        FragmentManager $r12 = this.mChildFragmentManager;
        $r12.m36007B();
        C1510r r6 = new C1510r();
        this.mChildFragmentManager = r6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater $r1 = onGetLayoutInflater(bundle);
        this.mLayoutInflater = $r1;
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void performLowMemory() {
        onLowMemory();
        FragmentManager $r1 = this.mChildFragmentManager;
        $r1.m36003D();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
        FragmentManager $r1 = this.mChildFragmentManager;
        $r1.m36001E(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public boolean performOptionsItemSelected(MenuItem menuItem) {
        boolean $z0 = this.mHidden;
        if ($z0) {
            return false;
        }
        boolean $z02 = this.mHasMenu;
        if ($z02) {
            boolean $z03 = this.mMenuVisible;
            if ($z03) {
                boolean $z04 = onOptionsItemSelected(menuItem);
                if ($z04) {
                    return true;
                }
            }
        }
        FragmentManager $r2 = this.mChildFragmentManager;
        boolean $z05 = $r2.m35995H(menuItem);
        return $z05;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void performOptionsMenuClosed(Menu menu) {
        boolean $z0 = this.mHidden;
        if ($z0) {
            return;
        }
        boolean $z02 = this.mHasMenu;
        if ($z02) {
            boolean $z03 = this.mMenuVisible;
            if ($z03) {
                onOptionsMenuClosed(menu);
            }
        }
        FragmentManager $r2 = this.mChildFragmentManager;
        $r2.m35993I(menu);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void performPause() {
        FragmentManager $r2 = this.mChildFragmentManager;
        $r2.m35989K();
        View $r3 = this.mView;
        if ($r3 != null) {
            C1467f0 $r4 = this.mViewLifecycleOwner;
            Scope $r5 = Scope.ON_PAUSE;
            $r4.a($r5);
        }
        C1578q $r6 = this.mLifecycleRegistry;
        Scope $r52 = Scope.ON_PAUSE;
        $r6.h($r52);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        boolean $z0 = this.mCalled;
        if ($z0) {
            return;
        }
        String $r1 = "Fragment " + this + " did not call through to super.onPause()";
        Throwable r10 = new C1500k0($r1);
        Throwable r11 = r10;
        throw r11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
        FragmentManager $r1 = this.mChildFragmentManager;
        $r1.m35987L(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchDebugInfoByOffset(DebugInfoApplyVisitor.java:106)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:83)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
    	at java.util.ArrayList.forEach(ArrayList.java:1259)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean $z0 = this.mHidden;
        boolean $z1 = false;
        if ($z0) {
            return false;
        }
        boolean $z02 = this.mHasMenu;
        if ($z02) {
            boolean $z03 = this.mMenuVisible;
            if ($z03) {
                $z1 = true;
                onPrepareOptionsMenu(menu);
            }
        }
        FragmentManager $r2 = this.mChildFragmentManager;
        boolean $z04 = $r2.m35985M(menu);
        return $z1 | $z04;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void performPrimaryNavigationFragmentChanged() {
        FragmentManager $r1 = this.mFragmentManager;
        boolean $z0 = $r1.m35988K0(this);
        Boolean $r2 = this.mIsPrimaryNavigationFragment;
        if ($r2 != null) {
            boolean $z1 = $r2.booleanValue();
            if ($z1 == $z0) {
                return;
            }
        }
        this.mIsPrimaryNavigationFragment = Boolean.valueOf($z0);
        onPrimaryNavigationFragmentChanged($z0);
        FragmentManager $r12 = this.mChildFragmentManager;
        $r12.m35983N();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void performResume() {
        FragmentManager $r2 = this.mChildFragmentManager;
        $r2.m35972S0();
        FragmentManager $r22 = this.mChildFragmentManager;
        $r22.m35961Y(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        boolean $z0 = this.mCalled;
        if (!$z0) {
            String $r1 = "Fragment " + this + " did not call through to super.onResume()";
            Throwable r10 = new C1500k0($r1);
            Throwable r11 = r10;
            throw r11;
        }
        C1578q $r3 = this.mLifecycleRegistry;
        Scope $r4 = Scope.ON_RESUME;
        $r3.h($r4);
        View $r5 = this.mView;
        if ($r5 != null) {
            C1467f0 $r6 = this.mViewLifecycleOwner;
            Scope $r42 = Scope.ON_RESUME;
            $r6.a($r42);
        }
        FragmentManager $r23 = this.mChildFragmentManager;
        $r23.m35981O();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        C1868b $r3 = this.mSavedStateRegistryController;
        $r3.m34390d(bundle);
        FragmentManager $r4 = this.mChildFragmentManager;
        Parcelable $r2 = $r4.m35925k1();
        if ($r2 != null) {
            bundle.putParcelable("android:support:fragments", $r2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void performStart() {
        FragmentManager $r2 = this.mChildFragmentManager;
        $r2.m35972S0();
        FragmentManager $r22 = this.mChildFragmentManager;
        $r22.m35961Y(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        boolean $z0 = this.mCalled;
        if (!$z0) {
            String $r1 = "Fragment " + this + " did not call through to super.onStart()";
            Throwable r10 = new C1500k0($r1);
            Throwable r11 = r10;
            throw r11;
        }
        C1578q $r3 = this.mLifecycleRegistry;
        Scope $r4 = Scope.ON_START;
        $r3.h($r4);
        View $r5 = this.mView;
        if ($r5 != null) {
            C1467f0 $r6 = this.mViewLifecycleOwner;
            Scope $r42 = Scope.ON_START;
            $r6.a($r42);
        }
        FragmentManager $r23 = this.mChildFragmentManager;
        $r23.m35979P();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void performStop() {
        FragmentManager $r2 = this.mChildFragmentManager;
        $r2.m35975R();
        View $r3 = this.mView;
        if ($r3 != null) {
            C1467f0 $r4 = this.mViewLifecycleOwner;
            Scope $r5 = Scope.ON_STOP;
            $r4.a($r5);
        }
        C1578q $r6 = this.mLifecycleRegistry;
        Scope $r52 = Scope.ON_STOP;
        $r6.h($r52);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        boolean $z0 = this.mCalled;
        if ($z0) {
            return;
        }
        String $r1 = "Fragment " + this + " did not call through to super.onStop()";
        Throwable r10 = new C1500k0($r1);
        Throwable r11 = r10;
        throw r11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void performViewCreated() {
        View $r2 = this.mView;
        Bundle $r1 = this.mSavedFragmentState;
        onViewCreated($r2, $r1);
        FragmentManager $r3 = this.mChildFragmentManager;
        $r3.m35973S();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void postponeEnterTransition() {
        C1424i $r1 = ensureAnimationInfo();
        $r1.f4392v = true;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchDebugInfoByOffset(DebugInfoApplyVisitor.java:106)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:83)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
    	at java.util.ArrayList.forEach(ArrayList.java:1259)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final void postponeEnterTransition(long j, TimeUnit timeUnit) {
        Handler $r5;
        C1424i $r2 = ensureAnimationInfo();
        $r2.f4392v = true;
        FragmentManager $r3 = this.mFragmentManager;
        if ($r3 != null) {
            AbstractC1505o $r4 = $r3.m35899t0();
            $r5 = $r4.m35676g();
        } else {
            Looper $r6 = Looper.getMainLooper();
            $r5 = new Handler($r6);
        }
        Runnable $r7 = this.mPostponedDurationRunnable;
        $r5.removeCallbacks($r7);
        Runnable $r72 = this.mPostponedDurationRunnable;
        long $l0 = timeUnit.toMillis(j);
        $r5.postDelayed($r72, $l0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final AbstractC0904c registerForActivityResult(AbstractC0908a abstractC0908a, ActivityResultRegistry activityResultRegistry, InterfaceC0903b interfaceC0903b) {
        C1421f $r3 = new C1421f(this, activityResultRegistry);
        AbstractC0904c $r4 = prepareCallInternal(abstractC0908a, $r3, interfaceC0903b);
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final AbstractC0904c registerForActivityResult(AbstractC0908a abstractC0908a, InterfaceC0903b interfaceC0903b) {
        C1420e $r2 = new C1420e();
        AbstractC0904c $r3 = prepareCallInternal(abstractC0908a, $r2, interfaceC0903b);
        return $r3;
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final void requestPermissions(String[] strArr, int i) {
        AbstractC1505o $r2 = this.mHost;
        if ($r2 != null) {
            FragmentManager $r3 = getParentFragmentManager();
            $r3.m35980O0(this, strArr, i);
            return;
        }
        String $r6 = "Fragment " + this + " not attached to Activity";
        IllegalStateException $r4 = new IllegalStateException($r6);
        throw $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final FragmentActivity requireActivity() {
        FragmentActivity $r1 = getActivity();
        if ($r1 != null) {
            return $r1;
        }
        String $r4 = "Fragment " + this + " not attached to an activity.";
        IllegalStateException $r2 = new IllegalStateException($r4);
        throw $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final Bundle requireArguments() {
        Bundle $r1 = getArguments();
        if ($r1 != null) {
            return $r1;
        }
        String $r4 = "Fragment " + this + " does not have any arguments.";
        IllegalStateException $r2 = new IllegalStateException($r4);
        throw $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final Context requireContext() {
        Context $r1 = getContext();
        if ($r1 != null) {
            return $r1;
        }
        String $r4 = "Fragment " + this + " not attached to a context.";
        IllegalStateException $r2 = new IllegalStateException($r4);
        throw $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final FragmentManager requireFragmentManager() {
        FragmentManager $r1 = getParentFragmentManager();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final Object requireHost() {
        Object $r1 = getHost();
        if ($r1 != null) {
            return $r1;
        }
        String $r4 = "Fragment " + this + " not attached to a host.";
        IllegalStateException $r2 = new IllegalStateException($r4);
        throw $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final Fragment requireParentFragment() {
        Fragment $r1 = getParentFragment();
        if ($r1 == null) {
            Context $r2 = getContext();
            if ($r2 == null) {
                String $r5 = "Fragment " + this + " is not attached to any Fragment or host";
                IllegalStateException $r3 = new IllegalStateException($r5);
                throw $r3;
            }
            StringBuilder $r4 = new StringBuilder();
            $r4.append("Fragment ");
            $r4.append(this);
            $r4.append(" is not a child Fragment, it is directly attached to ");
            Context $r22 = getContext();
            $r4.append($r22);
            String $r52 = $r4.toString();
            IllegalStateException $r32 = new IllegalStateException($r52);
            throw $r32;
        }
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final View requireView() {
        View $r1 = getView();
        if ($r1 != null) {
            return $r1;
        }
        String $r4 = "Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().";
        IllegalStateException $r2 = new IllegalStateException($r4);
        throw $r2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void restoreChildFragmentState(Bundle bundle) {
        Parcelable $r1;
        if (bundle == null || ($r1 = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        FragmentManager $r3 = this.mChildFragmentManager;
        $r3.m35931i1($r1);
        FragmentManager $r32 = this.mChildFragmentManager;
        $r32.m35883z();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    final void restoreViewState(Bundle bundle) {
        SparseArray $r3 = this.mSavedViewState;
        if ($r3 != null) {
            View $r4 = this.mView;
            $r4.restoreHierarchyState($r3);
            this.mSavedViewState = null;
        }
        View $r42 = this.mView;
        if ($r42 != null) {
            C1467f0 $r5 = this.mViewLifecycleOwner;
            Bundle $r6 = this.mSavedViewRegistryState;
            $r5.m35772d($r6);
            this.mSavedViewRegistryState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        boolean $z0 = this.mCalled;
        if ($z0) {
            View $r43 = this.mView;
            if ($r43 != null) {
                C1467f0 $r52 = this.mViewLifecycleOwner;
                Scope $r7 = Scope.ON_CREATE;
                $r52.a($r7);
                return;
            }
            return;
        }
        String $r1 = "Fragment " + this + " did not call through to super.onViewStateRestored()";
        Throwable r11 = new C1500k0($r1);
        Throwable r12 = r11;
        throw r12;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void setAllowEnterTransitionOverlap(boolean z) {
        C1424i $r1 = ensureAnimationInfo();
        Boolean $r2 = Boolean.valueOf(z);
        $r1.f4387q = $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void setAllowReturnTransitionOverlap(boolean z) {
        C1424i $r1 = ensureAnimationInfo();
        Boolean $r2 = Boolean.valueOf(z);
        $r1.f4386p = $r2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void setAnimations(int i, int i2, int i3, int i4) {
        C1424i $r1 = this.mAnimationInfo;
        if ($r1 == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        C1424i $r12 = ensureAnimationInfo();
        $r12.f4373c = i;
        C1424i $r13 = ensureAnimationInfo();
        $r13.f4374d = i2;
        C1424i $r14 = ensureAnimationInfo();
        $r14.f4375e = i3;
        C1424i $r15 = ensureAnimationInfo();
        $r15.f4376f = i4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void setArguments(Bundle bundle) {
        FragmentManager $r2 = this.mFragmentManager;
        if ($r2 != null) {
            boolean $z0 = isStateSaved();
            if ($z0) {
                IllegalStateException $r3 = new IllegalStateException("Fragment already added and state has been saved");
                throw $r3;
            }
        }
        this.mArguments = bundle;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void setEnterSharedElementCallback(AbstractC1330p abstractC1330p) {
        C1424i $r2 = ensureAnimationInfo();
        $r2.f4388r = abstractC1330p;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void setEnterTransition(Object obj) {
        C1424i $r2 = ensureAnimationInfo();
        $r2.f4380j = obj;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void setExitSharedElementCallback(AbstractC1330p abstractC1330p) {
        C1424i $r2 = ensureAnimationInfo();
        $r2.f4389s = abstractC1330p;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void setExitTransition(Object obj) {
        C1424i $r2 = ensureAnimationInfo();
        $r2.f4382l = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void setFocusedView(View view) {
        C1424i $r2 = ensureAnimationInfo();
        $r2.f4391u = view;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void setHasOptionsMenu(boolean z) {
        boolean $z0 = this.mHasMenu;
        if ($z0 != z) {
            this.mHasMenu = z;
            boolean $z1 = isAdded();
            if ($z1) {
                boolean $z12 = isHidden();
                if ($z12) {
                    return;
                }
                AbstractC1505o $r1 = this.mHost;
                $r1.mo35668o();
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void setInitialSavedState(C1427l c1427l) {
        FragmentManager $r2 = this.mFragmentManager;
        if ($r2 != null) {
            IllegalStateException $r4 = new IllegalStateException("Fragment already added");
            throw $r4;
        }
        Bundle $r3 = (c1427l == null || ($r3 = c1427l.f4393c) == null) ? null : null;
        this.mSavedFragmentState = $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void setMenuVisibility(boolean z) {
        boolean $z0 = this.mMenuVisible;
        if ($z0 != z) {
            this.mMenuVisible = z;
            boolean $z1 = this.mHasMenu;
            if ($z1) {
                boolean $z12 = isAdded();
                if ($z12) {
                    boolean $z13 = isHidden();
                    if ($z13) {
                        return;
                    }
                    AbstractC1505o $r1 = this.mHost;
                    $r1.mo35668o();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void setNextTransition(int i) {
        C1424i $r1 = this.mAnimationInfo;
        if ($r1 == null && i == 0) {
            return;
        }
        ensureAnimationInfo();
        C1424i $r12 = this.mAnimationInfo;
        $r12.f4377g = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void setPopDirection(boolean z) {
        C1424i $r1 = this.mAnimationInfo;
        if ($r1 == null) {
            return;
        }
        C1424i $r12 = ensureAnimationInfo();
        $r12.f4372b = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void setPostOnViewCreatedAlpha(float f) {
        C1424i $r1 = ensureAnimationInfo();
        $r1.f4390t = f;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void setReenterTransition(Object obj) {
        C1424i $r2 = ensureAnimationInfo();
        $r2.f4383m = obj;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void setRetainInstance(boolean z) {
        C1515c.m35636m(this);
        this.mRetainInstance = z;
        FragmentManager $r1 = this.mFragmentManager;
        if ($r1 == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z) {
            $r1.m35936h(this);
        } else {
            $r1.m35937g1(this);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void setReturnTransition(Object obj) {
        C1424i $r2 = ensureAnimationInfo();
        $r2.f4381k = obj;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void setSharedElementEnterTransition(Object obj) {
        C1424i $r2 = ensureAnimationInfo();
        $r2.f4384n = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void setSharedElementNames(ArrayList arrayList, ArrayList arrayList2) {
        ensureAnimationInfo();
        C1424i $r3 = this.mAnimationInfo;
        $r3.f4378h = arrayList;
        $r3.f4379i = arrayList2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void setSharedElementReturnTransition(Object obj) {
        C1424i $r2 = ensureAnimationInfo();
        $r2.f4385o = obj;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchDebugInfoByOffset(DebugInfoApplyVisitor.java:106)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:83)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
    	at java.util.ArrayList.forEach(ArrayList.java:1259)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void setTargetFragment(Fragment fragment, int i) {
        if (fragment != null) {
            C1515c.m35635n(this, fragment, i);
        }
        FragmentManager $r2 = this.mFragmentManager;
        FragmentManager $r3 = fragment != null ? fragment.mFragmentManager : null;
        if ($r2 != null && $r3 != null && $r2 != $r3) {
            String $r6 = "Fragment " + fragment + " must share the same FragmentManager to be set as a target fragment";
            IllegalArgumentException $r4 = new IllegalArgumentException($r6);
            throw $r4;
        }
        for (Fragment $r7 = fragment; $r7 != null; $r7 = $r7.getTargetFragment(false)) {
            boolean $z0 = $r7.equals(this);
            if ($z0) {
                String $r62 = "Setting " + fragment + " as the target of " + this + " would create a target cycle";
                IllegalArgumentException $r42 = new IllegalArgumentException($r62);
                throw $r42;
            }
        }
        if (fragment == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager == null || fragment.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = fragment;
        } else {
            String $r63 = fragment.mWho;
            this.mTargetWho = $r63;
            this.mTarget = null;
        }
        this.mTargetRequestCode = i;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void setUserVisibleHint(boolean z) {
        C1515c.m35634o(this, z);
        boolean $z1 = this.mUserVisibleHint;
        if (!$z1 && z) {
            int $i0 = this.mState;
            if ($i0 < 5 && this.mFragmentManager != null) {
                boolean $z12 = isAdded();
                if ($z12) {
                    boolean $z13 = this.mIsCreated;
                    if ($z13) {
                        FragmentManager $r1 = this.mFragmentManager;
                        C1526y $r2 = $r1.m35900t(this);
                        $r1.m35968U0($r2);
                    }
                }
            }
        }
        this.mUserVisibleHint = z;
        int $i02 = this.mState;
        boolean $z14 = $i02 < 5 && !z;
        this.mDeferStart = $z14;
        Bundle $r3 = this.mSavedFragmentState;
        if ($r3 != null) {
            Boolean $r4 = Boolean.valueOf(z);
            this.mSavedUserVisibleHint = $r4;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public boolean shouldShowRequestPermissionRationale(String str) {
        AbstractC1505o $r1 = this.mHost;
        if ($r1 != null) {
            boolean $z0 = $r1.mo35671l(str);
            return $z0;
        }
        return false;
    }

    public void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void startActivity(Intent intent, Bundle bundle) {
        AbstractC1505o $r4 = this.mHost;
        if ($r4 != null) {
            $r4.m35670m(this, intent, -1, bundle);
            return;
        }
        String $r1 = "Fragment " + this + " not attached to Activity";
        IllegalStateException $r5 = new IllegalStateException($r1);
        throw $r5;
    }

    public void startActivityForResult(Intent intent, int i) {
        startActivityForResult(intent, i, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        AbstractC1505o $r3 = this.mHost;
        if ($r3 != null) {
            FragmentManager $r4 = getParentFragmentManager();
            $r4.m35978P0(this, intent, i, bundle);
            return;
        }
        String $r7 = "Fragment " + this + " not attached to Activity";
        IllegalStateException $r5 = new IllegalStateException($r7);
        throw $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        AbstractC1505o $r4 = this.mHost;
        if ($r4 == null) {
            String $r6 = "Fragment " + this + " not attached to Activity";
            IllegalStateException $r8 = new IllegalStateException($r6);
            throw $r8;
        }
        boolean $z0 = FragmentManager.m35996G0(2);
        if ($z0) {
            String $r62 = "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + i + " IntentSender: " + intentSender + " fillInIntent: " + intent + " options: " + bundle;
            Log.v("FragmentManager", $r62);
        }
        FragmentManager $r7 = getParentFragmentManager();
        $r7.m35976Q0(this, intentSender, i, intent, i2, i3, i4, bundle);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public void startPostponedEnterTransition() {
        C1424i $r1 = this.mAnimationInfo;
        if ($r1 != null) {
            C1424i $r12 = ensureAnimationInfo();
            boolean $z0 = $r12.f4392v;
            if ($z0) {
                AbstractC1505o $r2 = this.mHost;
                if ($r2 == null) {
                    C1424i $r13 = ensureAnimationInfo();
                    $r13.f4392v = false;
                    return;
                }
                Looper $r3 = Looper.myLooper();
                AbstractC1505o $r22 = this.mHost;
                Handler $r4 = $r22.m35676g();
                Looper $r5 = $r4.getLooper();
                if ($r3 == $r5) {
                    callStartTransitionListener(true);
                    return;
                }
                AbstractC1505o $r23 = this.mHost;
                Handler $r42 = $r23.m35676g();
                Runnable r7 = new RunnableC1417b();
                Runnable r8 = r7;
                $r42.postAtFrontOfQueue(r8);
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String toString() {
        StringBuilder $r1 = new StringBuilder(128);
        Class $r2 = getClass();
        String $r3 = $r2.getSimpleName();
        $r1.append($r3);
        $r1.append("{");
        int $i0 = System.identityHashCode(this);
        String $r32 = Integer.toHexString($i0);
        $r1.append($r32);
        $r1.append("}");
        $r1.append(" (");
        String $r33 = this.mWho;
        $r1.append($r33);
        int $i02 = this.mFragmentId;
        if ($i02 != 0) {
            $r1.append(" id=0x");
            int $i03 = this.mFragmentId;
            String $r34 = Integer.toHexString($i03);
            $r1.append($r34);
        }
        String $r35 = this.mTag;
        if ($r35 != null) {
            $r1.append(" tag=");
            String $r36 = this.mTag;
            $r1.append($r36);
        }
        $r1.append(")");
        String $r37 = $r1.toString();
        return $r37;
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    /* renamed from: androidx.fragment.app.Fragment$l */
    /* loaded from: classes2.dex */
    public static class C1427l implements Parcelable {
        public static final Parcelable.Creator<C1427l> CREATOR = new C1428a();

        /* renamed from: c */
        final Bundle f4393c;

        /* renamed from: androidx.fragment.app.Fragment$l$a */
        /* loaded from: classes2.dex */
        class C1428a implements Parcelable.ClassLoaderCreator<C1427l> {
            C1428a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C1427l createFromParcel(Parcel parcel) {
                return new C1427l(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public C1427l createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C1427l(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public C1427l[] newArray(int i) {
                return new C1427l[i];
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C1427l(Bundle bundle) {
            this.f4393c = bundle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.f4393c);
        }

        C1427l(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.f4393c = readBundle;
            if (classLoader == null || readBundle == null) {
                return;
            }
            readBundle.setClassLoader(classLoader);
        }
    }
}
