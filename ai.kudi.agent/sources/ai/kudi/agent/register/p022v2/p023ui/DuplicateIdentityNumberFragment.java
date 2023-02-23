package ai.kudi.agent.register.p022v2.p023ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.databinding.BottomLoginViewBinding;
import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.databinding.FragmentDuplicateIdentityNumberBinding;
import ai.kudi.agent.login.p011ui.LoginActivity;
import ai.kudi.agent.settings.p029ui.BvnExistingAgentActivity;
import ai.kudi.dip.library.button.KudiButton;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: DuplicateIdentityNumberFragment.kt */
@Metadata(m10422d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0004J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0001H\u0096\u0001J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J$\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u001a\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\t\u0010\u0016\u001a\u00020\u0003H\u0096\u0001R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m10421d2 = {"Lai/kudi/agent/register/v2/ui/DuplicateIdentityNumberFragment;", "Landroidx/fragment/app/Fragment;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/databinding/FragmentDuplicateIdentityNumberBinding;", "()V", "binding", "getBinding", "()Lai/kudi/agent/databinding/FragmentDuplicateIdentityNumberBinding;", "initBinding", "Landroid/view/View;", "fragment", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "requireBinding", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.register.v2.ui.DuplicateIdentityNumberFragment */
/* loaded from: classes.dex */
public final class DuplicateIdentityNumberFragment extends Fragment implements BaseViewBinder<FragmentDuplicateIdentityNumberBinding> {
    public static final Companion Companion;
    private final /* synthetic */ BaseViewBinderImpl<FragmentDuplicateIdentityNumberBinding> $$delegate_0;

    /* compiled from: DuplicateIdentityNumberFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/agent/register/v2/ui/DuplicateIdentityNumberFragment$Companion;", "", "()V", "newInstance", "Lai/kudi/agent/register/v2/ui/DuplicateIdentityNumberFragment;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.register.v2.ui.DuplicateIdentityNumberFragment$Companion */
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
        public final DuplicateIdentityNumberFragment newInstance() {
            DuplicateIdentityNumberFragment $r1 = new DuplicateIdentityNumberFragment();
            Bundle $r2 = new Bundle();
            C13666w c13666w = C13666w.f30112a;
            $r1.setArguments($r2);
            return $r1;
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
    public DuplicateIdentityNumberFragment() {
        BaseViewBinderImpl $r1 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final DuplicateIdentityNumberFragment newInstance() {
        Companion $r1 = Companion;
        DuplicateIdentityNumberFragment $r0 = $r1.newInstance();
        return $r0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-4$lambda-1  reason: not valid java name */
    public static final void m40443onViewCreated$lambda4$lambda1(DuplicateIdentityNumberFragment duplicateIdentityNumberFragment, View view) {
        Log_OC.getArray(duplicateIdentityNumberFragment, "this$0");
        ContextExtKt.launchActivity$default((Fragment) duplicateIdentityNumberFragment, false, LoginActivity.class, (InterfaceC11767l) null, 5, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-4$lambda-2  reason: not valid java name */
    public static final void m40444onViewCreated$lambda4$lambda2(DuplicateIdentityNumberFragment duplicateIdentityNumberFragment, View view) {
        Log_OC.getArray(duplicateIdentityNumberFragment, "this$0");
        FragmentActivity $r0 = duplicateIdentityNumberFragment.requireActivity();
        $r0.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-4$lambda-3  reason: not valid java name */
    public static final void m40445onViewCreated$lambda4$lambda3(DuplicateIdentityNumberFragment duplicateIdentityNumberFragment, View view) {
        Log_OC.getArray(duplicateIdentityNumberFragment, "this$0");
        FragmentActivity $r0 = duplicateIdentityNumberFragment.requireActivity();
        Log_OC.loadImage($r0, "requireActivity()");
        AppCompatActivityExtKt.callSupport($r0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentDuplicateIdentityNumberBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        FragmentDuplicateIdentityNumberBinding $r3 = (FragmentDuplicateIdentityNumberBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        FragmentDuplicateIdentityNumberBinding $r1 = getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View initBinding(FragmentDuplicateIdentityNumberBinding fragmentDuplicateIdentityNumberBinding, Fragment fragment) {
        Log_OC.getArray(fragmentDuplicateIdentityNumberBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(fragmentDuplicateIdentityNumberBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        FragmentDuplicateIdentityNumberBinding $r4 = (FragmentDuplicateIdentityNumberBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getArguments();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentDuplicateIdentityNumberBinding $r4 = FragmentDuplicateIdentityNumberBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(\n                inflater,\n                container,\n                false\n            )");
        View $r5 = initBinding($r4, (Fragment) this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        FragmentDuplicateIdentityNumberBinding $r3 = requireBinding();
        FragmentActivity $r4 = requireActivity();
        boolean $z0 = $r4 instanceof BvnExistingAgentActivity;
        if ($z0) {
            KudiButton $r5 = $r3.loginButton;
            Log_OC.loadImage($r5, "loginButton");
            ViewExtKt.hide$default($r5, false, 1, null);
        }
        ViewGroup r17 = $r3.loginButton;
        r17.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.register.v2.ui.EulaActivity$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                DuplicateIdentityNumberFragment $r2 = DuplicateIdentityNumberFragment.this;
                DuplicateIdentityNumberFragment.m40443onViewCreated$lambda4$lambda1($r2, view2);
            }
        });
        TextView $r7 = $r3.retryButton;
        $r7.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.register.v2.ui.EditEventView$6
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                DuplicateIdentityNumberFragment $r2 = DuplicateIdentityNumberFragment.this;
                DuplicateIdentityNumberFragment.m40444onViewCreated$lambda4$lambda2($r2, view2);
            }
        });
        BottomLoginViewBinding $r9 = $r3.bottomView;
        TextView $r72 = $r9.buttomViewHeader;
        String $r10 = getString(C0001R.string.other_issues_question);
        $r72.setText($r10);
        BottomLoginViewBinding $r92 = $r3.bottomView;
        TextView $r73 = $r92.loginButton;
        String $r102 = getString(C0001R.string.call_support);
        $r73.setText($r102);
        BottomLoginViewBinding $r93 = $r3.bottomView;
        TextView $r74 = $r93.loginButton;
        Context $r11 = requireContext();
        Log_OC.loadImage($r11, "requireContext()");
        Drawable $r12 = ContextExtKt.getKudiDrawable($r11, C0001R.C0002drawable.ic_call_support_green);
        $r74.setCompoundDrawablesRelativeWithIntrinsicBounds($r12, (Drawable) null, (Drawable) null, (Drawable) null);
        BottomLoginViewBinding $r94 = $r3.bottomView;
        TextView $r75 = $r94.loginButton;
        $r75.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.register.v2.ui.l
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                DuplicateIdentityNumberFragment $r2 = DuplicateIdentityNumberFragment.this;
                DuplicateIdentityNumberFragment.m40445onViewCreated$lambda4$lambda3($r2, view2);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentDuplicateIdentityNumberBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        FragmentDuplicateIdentityNumberBinding $r3 = (FragmentDuplicateIdentityNumberBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        FragmentDuplicateIdentityNumberBinding $r1 = requireBinding();
        return $r1;
    }
}
