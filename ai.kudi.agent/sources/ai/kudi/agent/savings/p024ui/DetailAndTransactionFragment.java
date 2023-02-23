package ai.kudi.agent.savings.p024ui;

import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.savings.C0456R;
import ai.kudi.agent.savings.adapter.DetailAndTransactionAdapter;
import ai.kudi.agent.savings.data.model.SavingResponse;
import ai.kudi.agent.savings.databinding.FragmentDetailAndTransactionBinding;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1565i;
import androidx.lifecycle.PreferenceActivity;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.C4752c;
import com.google.android.material.tabs.TabLayout;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.Registry;
import dagger.android.d;
import dagger.android.p197e.C7429a;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: DetailAndTransactionFragment.kt */
@Metadata(m10422d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 %2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004:\u0001%B\u0005¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0001H\u0096\u0001J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0012\u0010\u0019\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J$\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u001a\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u00132\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\t\u0010#\u001a\u00020\u0003H\u0096\u0001J\b\u0010$\u001a\u00020\u0016H\u0002R$\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, m10421d2 = {"Lai/kudi/agent/savings/ui/DetailAndTransactionFragment;", "Landroidx/fragment/app/Fragment;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/savings/databinding/FragmentDetailAndTransactionBinding;", "Ldagger/android/HasAndroidInjector;", "()V", "androidInjector", "Ldagger/android/DispatchingAndroidInjector;", "", "getAndroidInjector", "()Ldagger/android/DispatchingAndroidInjector;", "setAndroidInjector", "(Ldagger/android/DispatchingAndroidInjector;)V", "binding", "getBinding", "()Lai/kudi/agent/savings/databinding/FragmentDetailAndTransactionBinding;", "savingDetail", "Lai/kudi/agent/savings/data/model/SavingResponse;", "initBinding", "Landroid/view/View;", "fragment", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "requireBinding", "setUpViewPager", "Companion", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.savings.ui.DetailAndTransactionFragment */
/* loaded from: classes.dex */
public final class DetailAndTransactionFragment extends Fragment implements BaseViewBinder<FragmentDetailAndTransactionBinding>, d {
    public static final Companion Companion;
    private final /* synthetic */ BaseViewBinderImpl<FragmentDetailAndTransactionBinding> $$delegate_0;
    public DispatchingAndroidInjector<Object> androidInjector;
    private SavingResponse savingDetail;

    /* compiled from: DetailAndTransactionFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/savings/ui/DetailAndTransactionFragment$Companion;", "", "()V", "newInstance", "Lai/kudi/agent/savings/ui/DetailAndTransactionFragment;", "savingResponse", "Lai/kudi/agent/savings/data/model/SavingResponse;", "feature-savings_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.savings.ui.DetailAndTransactionFragment$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final DetailAndTransactionFragment newInstance(SavingResponse savingResponse) {
            Log_OC.getArray(savingResponse, "savingResponse");
            DetailAndTransactionFragment $r3 = new DetailAndTransactionFragment();
            Bundle $r1 = new Bundle();
            $r1.putParcelable(SavingsDetailFragment.SAVING_DETAIL_KEY, savingResponse);
            C13666w c13666w = C13666w.f30112a;
            $r3.setArguments($r1);
            return $r3;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public DetailAndTransactionFragment() {
        BaseViewBinderImpl $r1 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setUpViewPager() {
        DetailAndTransactionAdapter $r5;
        FragmentDetailAndTransactionBinding $r1 = requireBinding();
        int $i0 = C0456R.string.detail_page_title;
        String $r3 = getString($i0);
        int $i02 = C0456R.string.transaction_page_title;
        String $r32 = getString($i02);
        final String[] $r2 = {$r3, $r32};
        SavingResponse $r4 = this.savingDetail;
        if ($r4 == null) {
            $r5 = null;
        } else {
            FragmentManager $r6 = getChildFragmentManager();
            Log_OC.loadImage($r6, "childFragmentManager");
            PreferenceActivity $r7 = getViewLifecycleOwner();
            AbstractC1565i $r8 = $r7.getLifecycle();
            Log_OC.loadImage($r8, "viewLifecycleOwner.lifecycle");
            $r5 = new DetailAndTransactionAdapter($r6, $r8, $r4, $r2);
        }
        ViewPager2 $r9 = $r1.vpDetailTransaction;
        $r9.setAdapter($r5);
        TabLayout $r11 = $r1.tlDetailTransaction;
        ViewPager2 $r92 = $r1.vpDetailTransaction;
        C4752c $r10 = new C4752c($r11, $r92, new C4752c.InterfaceC4754b() { // from class: ai.kudi.agent.savings.ui.f
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: c */
            public final void m38477c(TabLayout.C4745g c4745g, int i) {
                String[] $r22 = $r2;
                DetailAndTransactionFragment.m40526setUpViewPager$lambda3$lambda2($r22, c4745g, i);
            }
        });
        $r10.m26473a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setUpViewPager$lambda-3$lambda-2  reason: not valid java name */
    public static final void m40526setUpViewPager$lambda3$lambda2(String[] strArr, TabLayout.C4745g c4745g, int i) {
        Log_OC.getArray(strArr, "$titles");
        Log_OC.getArray(c4745g, "tab");
        String $r2 = strArr[i];
        c4745g.m26505u($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public DispatchingAndroidInjector androidInjector() {
        DispatchingAndroidInjector $r1 = getAndroidInjector();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: androidInjector  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Registry m40527androidInjector() {
        DispatchingAndroidInjector $r1 = androidInjector();
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
    public FragmentDetailAndTransactionBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        FragmentDetailAndTransactionBinding $r3 = (FragmentDetailAndTransactionBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        FragmentDetailAndTransactionBinding $r1 = getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View initBinding(FragmentDetailAndTransactionBinding fragmentDetailAndTransactionBinding, Fragment fragment) {
        Log_OC.getArray(fragmentDetailAndTransactionBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(fragmentDetailAndTransactionBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        FragmentDetailAndTransactionBinding $r4 = (FragmentDetailAndTransactionBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        C7429a.m18752b(this);
        super.onAttach(context);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle $r1 = getArguments();
        if ($r1 == null) {
            return;
        }
        Parcelable $r2 = $r1.getParcelable(SavingsDetailFragment.SAVING_DETAIL_KEY);
        SavingResponse $r3 = (SavingResponse) $r2;
        this.savingDetail = $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentDetailAndTransactionBinding $r4 = FragmentDetailAndTransactionBinding.inflate(layoutInflater);
        Log_OC.loadImage($r4, "inflate(inflater)");
        View $r5 = initBinding($r4, (Fragment) this);
        return $r5;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        setUpViewPager();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentDetailAndTransactionBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        FragmentDetailAndTransactionBinding $r3 = (FragmentDetailAndTransactionBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        FragmentDetailAndTransactionBinding $r1 = requireBinding();
        return $r1;
    }

    public final void setAndroidInjector(DispatchingAndroidInjector dispatchingAndroidInjector) {
        Log_OC.getArray(dispatchingAndroidInjector, "<set-?>");
        this.androidInjector = dispatchingAndroidInjector;
    }
}
