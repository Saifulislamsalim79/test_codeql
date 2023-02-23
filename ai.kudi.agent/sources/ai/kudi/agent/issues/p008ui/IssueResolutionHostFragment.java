package ai.kudi.agent.issues.p008ui;

import ai.kudi.agent.analytics.SmartLookAnalytics;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.feature_issue_resolution.C0214R;
import ai.kudi.agent.feature_issue_resolution.databinding.FragmentIssueResolutionHostBinding;
import ai.kudi.agent.issues.p008ui.IssueHistoryFragment;
import ai.kudi.agent.settings.p029ui.adapters.TabAdapter;
import ai.kudi.dip.library.SafeViewPager;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.Registry;
import dagger.android.d;
import dagger.android.p197e.C7429a;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
import p201g.p270x.InterfaceC8209a;
/* compiled from: IssueResolutionHostFragment.kt */
@Metadata(m10422d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0005¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0016H\u0016J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0001H\u0096\u0001J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0012\u0010\u001e\u001a\u00020\u001b2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0018\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J$\u0010&\u001a\u00020\u00182\u0006\u0010$\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u001a\u0010*\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020\u00182\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\t\u0010,\u001a\u00020\u0004H\u0096\u0001J\b\u0010-\u001a\u00020\u001bH\u0002R$\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u0004\u0018\u00010\u0004X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006."}, m10421d2 = {"Lai/kudi/agent/issues/ui/IssueResolutionHostFragment;", "Landroidx/fragment/app/Fragment;", "Ldagger/android/HasAndroidInjector;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/feature_issue_resolution/databinding/FragmentIssueResolutionHostBinding;", "()V", "androidInjector", "Ldagger/android/DispatchingAndroidInjector;", "", "getAndroidInjector", "()Ldagger/android/DispatchingAndroidInjector;", "setAndroidInjector", "(Ldagger/android/DispatchingAndroidInjector;)V", "binding", "getBinding", "()Lai/kudi/agent/feature_issue_resolution/databinding/FragmentIssueResolutionHostBinding;", "smartLookAnalytics", "Lai/kudi/agent/analytics/SmartLookAnalytics;", "getSmartLookAnalytics", "()Lai/kudi/agent/analytics/SmartLookAnalytics;", "setSmartLookAnalytics", "(Lai/kudi/agent/analytics/SmartLookAnalytics;)V", "Ldagger/android/AndroidInjector;", "initBinding", "Landroid/view/View;", "fragment", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "requireBinding", "setupViewPager", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.issues.ui.IssueResolutionHostFragment */
/* loaded from: classes.dex */
public final class IssueResolutionHostFragment extends Fragment implements d, BaseViewBinder<FragmentIssueResolutionHostBinding> {
    private final /* synthetic */ BaseViewBinderImpl<FragmentIssueResolutionHostBinding> $$delegate_0;
    public DispatchingAndroidInjector<Object> androidInjector;
    public SmartLookAnalytics smartLookAnalytics;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public IssueResolutionHostFragment() {
        BaseViewBinderImpl $r1 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setupViewPager() {
        List $r6;
        List $r12;
        IssueTypeFragmentNew $r3 = new IssueTypeFragmentNew();
        IssueHistoryFragment.Companion $r4 = IssueHistoryFragment.Companion;
        IssueHistoryFragment $r5 = $r4.newInstance();
        Object[] $r2 = {$r3, $r5};
        $r6 = C13726r.m3888h($r2);
        FragmentIssueResolutionHostBinding $r7 = requireBinding();
        SafeViewPager $r8 = $r7.viewPager;
        FragmentManager $r9 = getChildFragmentManager();
        Log_OC.loadImage($r9, "childFragmentManager");
        int $i0 = C0214R.string.issue_resolution;
        String $r11 = getString($i0);
        Log_OC.loadImage($r11, "getString(R.string.issue_resolution)");
        int $i02 = C0214R.string.issue_history;
        String $r112 = getString($i02);
        Log_OC.loadImage($r112, "getString(R.string.issue_history)");
        String[] $r10 = {$r11, $r112};
        $r12 = C13726r.m3885k($r10);
        TabAdapter $r1 = new TabAdapter($r9, 1, $r12);
        $r1.setPages($r6);
        $r8.setAdapter($r1);
        $r8.addOnPageChangeListener(new ViewPager.InterfaceC1898j() { // from class: ai.kudi.agent.issues.ui.IssueResolutionHostFragment$setupViewPager$1$1
            @Override // androidx.viewpager.widget.ViewPager.InterfaceC1898j
            public void onPageScrollStateChanged(int i) {
            }

            @Override // androidx.viewpager.widget.ViewPager.InterfaceC1898j
            public void onPageScrolled(int i, float f, int i2) {
            }

            @Override // androidx.viewpager.widget.ViewPager.InterfaceC1898j
            public void onPageSelected(int i) {
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public Registry androidInjector() {
        DispatchingAndroidInjector $r1 = getAndroidInjector();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final DispatchingAndroidInjector getAndroidInjector() {
        DispatchingAndroidInjector $r1 = this.androidInjector;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("androidInjector");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentIssueResolutionHostBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        FragmentIssueResolutionHostBinding $r3 = (FragmentIssueResolutionHostBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        FragmentIssueResolutionHostBinding $r1 = getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SmartLookAnalytics getSmartLookAnalytics() {
        SmartLookAnalytics $r1 = this.smartLookAnalytics;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("smartLookAnalytics");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View initBinding(FragmentIssueResolutionHostBinding fragmentIssueResolutionHostBinding, Fragment fragment) {
        Log_OC.getArray(fragmentIssueResolutionHostBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(fragmentIssueResolutionHostBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        FragmentIssueResolutionHostBinding $r4 = (FragmentIssueResolutionHostBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        C7429a.m18752b(this);
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        Log_OC.getArray(menu, "menu");
        Log_OC.getArray(menuInflater, "inflater");
        super.onCreateOptionsMenu(menu, menuInflater);
        menu.clear();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentIssueResolutionHostBinding $r4 = FragmentIssueResolutionHostBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        View $r5 = initBinding($r4, (Fragment) this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        setupViewPager();
        FragmentIssueResolutionHostBinding $r3 = requireBinding();
        TabLayout $r4 = $r3.tabLayout;
        SafeViewPager $r5 = $r3.viewPager;
        $r4.setupWithViewPager($r5);
        SmartLookAnalytics $r6 = getSmartLookAnalytics();
        $r6.logSupport();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentIssueResolutionHostBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        FragmentIssueResolutionHostBinding $r3 = (FragmentIssueResolutionHostBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        FragmentIssueResolutionHostBinding $r1 = requireBinding();
        return $r1;
    }

    public final void setAndroidInjector(DispatchingAndroidInjector dispatchingAndroidInjector) {
        Log_OC.getArray(dispatchingAndroidInjector, "<set-?>");
        this.androidInjector = dispatchingAndroidInjector;
    }

    public final void setSmartLookAnalytics(SmartLookAnalytics smartLookAnalytics) {
        Log_OC.getArray(smartLookAnalytics, "<set-?>");
        this.smartLookAnalytics = smartLookAnalytics;
    }
}
