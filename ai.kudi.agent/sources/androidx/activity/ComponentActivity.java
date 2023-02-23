package androidx.activity;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.p052d.C0894a;
import androidx.activity.p052d.InterfaceC0895b;
import androidx.activity.result.AbstractC0904c;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.C0905e;
import androidx.activity.result.InterfaceC0903b;
import androidx.activity.result.QueryResult;
import androidx.activity.result.p053f.AbstractC0908a;
import androidx.core.app.BaseListFragment;
import androidx.core.app.C1291a;
import androidx.core.app.C1297b;
import androidx.core.content.C1335a;
import androidx.lifecycle.AbstractC1565i;
import androidx.lifecycle.C1548c0;
import androidx.lifecycle.C1556g0;
import androidx.lifecycle.C1566i0;
import androidx.lifecycle.C1571k0;
import androidx.lifecycle.C1573l0;
import androidx.lifecycle.C1578q;
import androidx.lifecycle.FragmentC1539a0;
import androidx.lifecycle.InterfaceC1572l;
import androidx.lifecycle.Lock;
import androidx.lifecycle.PreferenceActivity;
import androidx.lifecycle.Priority;
import androidx.lifecycle.Rule;
import androidx.lifecycle.Service;
import androidx.lifecycle.o;
import androidx.savedstate.C1868b;
import androidx.savedstate.C1869d;
import androidx.savedstate.ResultSet;
import androidx.savedstate.SavedStateRegistry;
import java.util.concurrent.atomic.AtomicInteger;
import p201g.p265u.C8111a;
/* loaded from: classes.dex */
public class ComponentActivity extends BaseListFragment implements PreferenceActivity, Rule, Lock, ResultSet, AppPreferences, QueryResult {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final ActivityResultRegistry mActivityResultRegistry;
    private int mContentLayoutId;
    final C0894a mContextAwareHelper;
    private C1556g0.InterfaceC1559b mDefaultFactory;
    private final C1578q mLifecycleRegistry;
    private final AtomicInteger mNextLocalRequestCode;
    private final OnBackPressedDispatcher mOnBackPressedDispatcher;
    final C1868b mSavedStateRegistryController;
    private C1566i0 mViewModelStore;

    /* renamed from: androidx.activity.ComponentActivity$a */
    /* loaded from: classes2.dex */
    class RunnableC0884a implements Runnable {
        RunnableC0884a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e) {
                if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e;
                }
            }
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$b */
    /* loaded from: classes2.dex */
    class C0885b extends ActivityResultRegistry {

        /* renamed from: androidx.activity.ComponentActivity$b$a */
        /* loaded from: classes2.dex */
        class RunnableC0886a implements Runnable {

            /* renamed from: c */
            final /* synthetic */ int f2362c;

            /* renamed from: d */
            final /* synthetic */ AbstractC0908a.C0909a f2363d;

            RunnableC0886a(int i, AbstractC0908a.C0909a c0909a) {
                this.f2362c = i;
                this.f2363d = c0909a;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0885b.this.m37870c(this.f2362c, this.f2363d.m37843a());
            }
        }

        /* renamed from: androidx.activity.ComponentActivity$b$b */
        /* loaded from: classes2.dex */
        class RunnableC0887b implements Runnable {

            /* renamed from: c */
            final /* synthetic */ int f2365c;

            /* renamed from: d */
            final /* synthetic */ IntentSender.SendIntentException f2366d;

            RunnableC0887b(int i, IntentSender.SendIntentException sendIntentException) {
                this.f2365c = i;
                this.f2366d = sendIntentException;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0885b.this.m37871b(this.f2365c, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f2366d));
            }
        }

        C0885b() {
        }

        @Override // androidx.activity.result.ActivityResultRegistry
        /* renamed from: f */
        public <I, O> void mo37867f(int i, AbstractC0908a<I, O> abstractC0908a, I i2, C1297b c1297b) {
            ComponentActivity componentActivity = ComponentActivity.this;
            AbstractC0908a.C0909a<O> mo37842b = abstractC0908a.mo37842b(componentActivity, i2);
            if (mo37842b != null) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0886a(i, mo37842b));
                return;
            }
            Intent mo35877a = abstractC0908a.mo35877a(componentActivity, i2);
            Bundle bundle = null;
            if (mo35877a.getExtras() != null && mo35877a.getExtras().getClassLoader() == null) {
                mo35877a.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (mo35877a.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundle = mo35877a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                mo35877a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            } else if (c1297b != null) {
                bundle = c1297b.mo36456c();
            }
            Bundle bundle2 = bundle;
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(mo35877a.getAction())) {
                String[] stringArrayExtra = mo35877a.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                C1291a.m36466q(componentActivity, stringArrayExtra, i);
            } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(mo35877a.getAction())) {
                C0905e c0905e = (C0905e) mo35877a.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    C1291a.m36461v(componentActivity, c0905e.m37849d(), i, c0905e.m37852a(), c0905e.m37851b(), c0905e.m37850c(), 0, bundle2);
                } catch (IntentSender.SendIntentException e) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC0887b(i, e));
                }
            } else {
                C1291a.m36462u(componentActivity, mo35877a, i, bundle2);
            }
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$c */
    /* loaded from: classes2.dex */
    class C0888c implements SavedStateRegistry.InterfaceC1866b {
        C0888c() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.InterfaceC1866b
        public Bundle saveState() {
            Bundle bundle = new Bundle();
            ComponentActivity.this.mActivityResultRegistry.m37865h(bundle);
            return bundle;
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$d */
    /* loaded from: classes2.dex */
    class C0889d implements InterfaceC0895b {
        C0889d() {
        }

        @Override // androidx.activity.p052d.InterfaceC0895b
        /* renamed from: a */
        public void mo35830a(Context context) {
            Bundle m34399a = ComponentActivity.this.getSavedStateRegistry().m34399a(ComponentActivity.ACTIVITY_RESULT_TAG);
            if (m34399a != null) {
                ComponentActivity.this.mActivityResultRegistry.m37866g(m34399a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.activity.ComponentActivity$e */
    /* loaded from: classes2.dex */
    public static final class C0890e {

        /* renamed from: a */
        Object f2370a;

        /* renamed from: b */
        C1566i0 f2371b;

        C0890e() {
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ComponentActivity() {
        C0894a r17 = new C0894a();
        this.mContextAwareHelper = r17;
        C1578q r18 = new C1578q(this);
        this.mLifecycleRegistry = r18;
        C1868b $r3 = C1868b.a(this);
        this.mSavedStateRegistryController = $r3;
        Runnable r19 = new RunnableC0884a();
        Runnable r30 = r19;
        OnBackPressedDispatcher r20 = new OnBackPressedDispatcher(r30);
        this.mOnBackPressedDispatcher = r20;
        AtomicInteger r21 = new AtomicInteger();
        this.mNextLocalRequestCode = r21;
        C0885b r22 = new C0885b();
        this.mActivityResultRegistry = r22;
        AbstractC1565i $r8 = getLifecycle();
        if ($r8 == null) {
            IllegalStateException r29 = new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
            throw r29;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            AbstractC1565i $r82 = getLifecycle();
            $r82.a((Service) new InterfaceC1572l() { // from class: androidx.activity.ComponentActivity.3
                @Override // androidx.lifecycle.InterfaceC1572l
                /* renamed from: m */
                public void mo34271m(o oVar, AbstractC1565i.b bVar) {
                    if (bVar == AbstractC1565i.b.ON_STOP) {
                        Window window = ComponentActivity.this.getWindow();
                        View peekDecorView = window != null ? window.peekDecorView() : null;
                        if (peekDecorView != null) {
                            peekDecorView.cancelPendingInputEvents();
                        }
                    }
                }
            });
        }
        AbstractC1565i $r83 = getLifecycle();
        Service r31 = (Service) new InterfaceC1572l() { // from class: androidx.activity.ComponentActivity.4
            @Override // androidx.lifecycle.InterfaceC1572l
            /* renamed from: m */
            public void mo34271m(o oVar, AbstractC1565i.b bVar) {
                if (bVar == AbstractC1565i.b.ON_DESTROY) {
                    ComponentActivity.this.mContextAwareHelper.m37876b();
                    if (ComponentActivity.this.isChangingConfigurations()) {
                        return;
                    }
                    ComponentActivity.this.getViewModelStore().m35517a();
                }
            }
        };
        $r83.a(r31);
        AbstractC1565i $r84 = getLifecycle();
        Service r312 = (Service) new InterfaceC1572l() { // from class: androidx.activity.ComponentActivity.5
            @Override // androidx.lifecycle.InterfaceC1572l
            /* renamed from: m */
            public void mo34271m(o oVar, AbstractC1565i.b bVar) {
                ComponentActivity.this.ensureViewModelStore();
                ComponentActivity.this.getLifecycle().mo35504c(this);
            }
        };
        $r84.a(r312);
        int $i0 = Build.VERSION.SDK_INT;
        if (19 <= $i0 && $i0 <= 23) {
            AbstractC1565i $r85 = getLifecycle();
            ImmLeaksCleaner r26 = new ImmLeaksCleaner(this);
            Service r313 = (Service) r26;
            $r85.a(r313);
        }
        SavedStateRegistry $r13 = getSavedStateRegistry();
        C0888c r27 = new C0888c();
        $r13.m34396d(ACTIVITY_RESULT_TAG, r27);
        C0889d r28 = new C0889d();
        addOnContextAvailableListener(r28);
    }

    public ComponentActivity(int i) {
        this();
        this.mContentLayoutId = i;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void initViewTreeOwners() {
        Window $r1 = getWindow();
        View $r2 = $r1.getDecorView();
        C1571k0.a($r2, this);
        Window $r12 = getWindow();
        View $r22 = $r12.getDecorView();
        C1573l0.a($r22, this);
        Window $r13 = getWindow();
        View $r23 = $r13.getDecorView();
        C1869d.a($r23, this);
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void addOnContextAvailableListener(InterfaceC0895b interfaceC0895b) {
        C0894a $r2 = this.mContextAwareHelper;
        $r2.m37877a(interfaceC0895b);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    void ensureViewModelStore() {
        C1566i0 $r2 = this.mViewModelStore;
        if ($r2 == null) {
            Object $r1 = getLastNonConfigurationInstance();
            C0890e $r3 = (C0890e) $r1;
            if ($r3 != null) {
                C1566i0 $r22 = $r3.f2371b;
                this.mViewModelStore = $r22;
            }
            C1566i0 $r23 = this.mViewModelStore;
            if ($r23 == null) {
                C1566i0 $r24 = new C1566i0();
                this.mViewModelStore = $r24;
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.activity.result.QueryResult
    public final ActivityResultRegistry getActivityResultRegistry() {
        ActivityResultRegistry r1 = this.mActivityResultRegistry;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.lifecycle.Lock
    public C1556g0.InterfaceC1559b getDefaultViewModelProviderFactory() {
        Bundle $r5;
        Application $r1 = getApplication();
        if ($r1 == null) {
            IllegalStateException r8 = new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            throw r8;
        }
        C1556g0.InterfaceC1559b $r2 = this.mDefaultFactory;
        if ($r2 == null) {
            Application $r12 = getApplication();
            Intent $r4 = getIntent();
            if ($r4 != null) {
                Intent $r42 = getIntent();
                $r5 = $r42.getExtras();
            } else {
                $r5 = null;
            }
            C1556g0.InterfaceC1559b r7 = new C1548c0($r12, this, $r5);
            C1556g0.InterfaceC1559b $r22 = r7;
            this.mDefaultFactory = $r22;
        }
        C1556g0.InterfaceC1559b $r23 = this.mDefaultFactory;
        return $r23;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public Object getLastCustomNonConfigurationInstance() {
        Object $r1 = getLastNonConfigurationInstance();
        C0890e $r2 = (C0890e) $r1;
        if ($r2 != null) {
            Object $r12 = $r2.f2370a;
            return $r12;
        }
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.core.app.BaseListFragment, androidx.lifecycle.PreferenceActivity
    public AbstractC1565i getLifecycle() {
        C1578q r1 = this.mLifecycleRegistry;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.activity.AppPreferences
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        OnBackPressedDispatcher r1 = this.mOnBackPressedDispatcher;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.savedstate.ResultSet
    public final SavedStateRegistry getSavedStateRegistry() {
        C1868b $r2 = this.mSavedStateRegistryController;
        SavedStateRegistry $r1 = $r2.m34392b();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.lifecycle.Rule
    public C1566i0 getViewModelStore() {
        Application $r1 = getApplication();
        if ($r1 == null) {
            IllegalStateException $r2 = new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            throw $r2;
        }
        ensureViewModelStore();
        C1566i0 r3 = this.mViewModelStore;
        return r3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        ActivityResultRegistry $r2 = this.mActivityResultRegistry;
        boolean $z0 = $r2.m37871b(i, i2, intent);
        if ($z0) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.app.Activity
    public void onBackPressed() {
        OnBackPressedDispatcher $r1 = this.mOnBackPressedDispatcher;
        $r1.m37878c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.core.app.BaseListFragment, android.app.Activity
    public void onCreate(Bundle bundle) {
        C1868b $r2 = this.mSavedStateRegistryController;
        $r2.m34391c(bundle);
        C0894a $r3 = this.mContextAwareHelper;
        $r3.m37875c(this);
        super.onCreate(bundle);
        FragmentC1539a0.m35561g(this);
        int $i0 = this.mContentLayoutId;
        if ($i0 != 0) {
            setContentView($i0);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        ActivityResultRegistry $r3 = this.mActivityResultRegistry;
        Intent $r4 = new Intent();
        boolean $z0 = $r3.m37871b(i, -1, $r4.putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr));
        if ($z0) {
            return;
        }
        int $i1 = Build.VERSION.SDK_INT;
        if ($i1 >= 23) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        Object $r1 = onRetainCustomNonConfigurationInstance();
        C1566i0 $r2 = this.mViewModelStore;
        if ($r2 == null) {
            Object $r3 = getLastNonConfigurationInstance();
            C0890e $r4 = (C0890e) $r3;
            if ($r4 != null) {
                $r2 = $r4.f2371b;
            }
        }
        if ($r2 == null && $r1 == null) {
            return null;
        }
        C0890e $r42 = new C0890e();
        $r42.f2370a = $r1;
        $r42.f2371b = $r2;
        return $r42;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.core.app.BaseListFragment, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        AbstractC1565i $r2 = getLifecycle();
        boolean $z0 = $r2 instanceof C1578q;
        if ($z0) {
            C1578q $r3 = (C1578q) $r2;
            Priority $r4 = Priority.f4721I;
            $r3.o($r4);
        }
        super.onSaveInstanceState(bundle);
        C1868b $r5 = this.mSavedStateRegistryController;
        $r5.m34390d(bundle);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public Context peekAvailableContext() {
        C0894a $r2 = this.mContextAwareHelper;
        Context $r1 = $r2.m37874d();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC0904c registerForActivityResult(AbstractC0908a abstractC0908a, ActivityResultRegistry activityResultRegistry, InterfaceC0903b interfaceC0903b) {
        StringBuilder $r4 = new StringBuilder();
        $r4.append("activity_rq#");
        AtomicInteger $r5 = this.mNextLocalRequestCode;
        int $i0 = $r5.getAndIncrement();
        $r4.append($i0);
        String $r6 = $r4.toString();
        AbstractC0904c $r7 = activityResultRegistry.j($r6, this, abstractC0908a, interfaceC0903b);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AbstractC0904c registerForActivityResult(AbstractC0908a abstractC0908a, InterfaceC0903b interfaceC0903b) {
        ActivityResultRegistry $r2 = this.mActivityResultRegistry;
        AbstractC0904c $r3 = registerForActivityResult(abstractC0908a, $r2, interfaceC0903b);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void removeOnContextAvailableListener(InterfaceC0895b interfaceC0895b) {
        C0894a $r2 = this.mContextAwareHelper;
        $r2.m37873e(interfaceC0895b);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            boolean $z0 = C8111a.m16738d();
            if ($z0) {
                StringBuilder $r1 = new StringBuilder();
                $r1.append("reportFullyDrawn() for ");
                ComponentName $r2 = getComponentName();
                $r1.append($r2);
                String $r3 = $r1.toString();
                C8111a.m16741a($r3);
            }
            int $i0 = Build.VERSION.SDK_INT;
            if ($i0 > 19) {
                super.reportFullyDrawn();
            } else {
                int $i02 = Build.VERSION.SDK_INT;
                if ($i02 == 19) {
                    int $i03 = C1335a.m36327a(this, "android.permission.UPDATE_DEVICE_STATS");
                    if ($i03 == 0) {
                        super.reportFullyDrawn();
                    }
                }
            }
        } finally {
            C8111a.m16740b();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        initViewTreeOwners();
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initViewTreeOwners();
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
