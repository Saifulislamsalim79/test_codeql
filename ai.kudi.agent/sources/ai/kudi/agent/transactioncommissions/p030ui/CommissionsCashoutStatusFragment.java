package ai.kudi.agent.transactioncommissions.p030ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.databinding.FragmentCommissionsCashoutStatusBinding;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.h;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: CommissionsCashoutStatusFragment.kt */
@Metadata(m10422d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00182\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0004J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0096\u0001J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J&\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u001a\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\t\u0010\u0017\u001a\u00020\u0003H\u0096\u0001R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0019"}, m10421d2 = {"Lai/kudi/agent/transactioncommissions/ui/CommissionsCashoutStatusFragment;", "Landroidx/fragment/app/DialogFragment;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/databinding/FragmentCommissionsCashoutStatusBinding;", "()V", "binding", "getBinding", "()Lai/kudi/agent/databinding/FragmentCommissionsCashoutStatusBinding;", "initBinding", "Landroid/view/View;", "fragment", "Landroidx/fragment/app/Fragment;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "requireBinding", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.transactioncommissions.ui.CommissionsCashoutStatusFragment */
/* loaded from: classes.dex */
public final class CommissionsCashoutStatusFragment extends h implements BaseViewBinder<FragmentCommissionsCashoutStatusBinding> {
    public static final Companion Companion;
    public static final String PAGE_KEY = "CommissionsCashoutStatusFragment";
    private final /* synthetic */ BaseViewBinderImpl<FragmentCommissionsCashoutStatusBinding> $$delegate_0;

    /* compiled from: CommissionsCashoutStatusFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/transactioncommissions/ui/CommissionsCashoutStatusFragment$Companion;", "", "()V", "TAG", "", "newInstance", "Lai/kudi/agent/transactioncommissions/ui/CommissionsCashoutStatusFragment;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.transactioncommissions.ui.CommissionsCashoutStatusFragment$Companion */
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
        public final CommissionsCashoutStatusFragment newInstance() {
            CommissionsCashoutStatusFragment $r1 = new CommissionsCashoutStatusFragment();
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
    public CommissionsCashoutStatusFragment() {
        BaseViewBinderImpl $r1 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-2$lambda-0  reason: not valid java name */
    public static final void m40978onViewCreated$lambda2$lambda0(CommissionsCashoutStatusFragment commissionsCashoutStatusFragment, View view) {
        Log_OC.getArray(commissionsCashoutStatusFragment, "this$0");
        commissionsCashoutStatusFragment.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-2$lambda-1  reason: not valid java name */
    public static final void m40979onViewCreated$lambda2$lambda1(CommissionsCashoutStatusFragment commissionsCashoutStatusFragment, View view) {
        Log_OC.getArray(commissionsCashoutStatusFragment, "this$0");
        commissionsCashoutStatusFragment.dismiss();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentCommissionsCashoutStatusBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        FragmentCommissionsCashoutStatusBinding $r3 = (FragmentCommissionsCashoutStatusBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        FragmentCommissionsCashoutStatusBinding $r1 = getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View initBinding(FragmentCommissionsCashoutStatusBinding fragmentCommissionsCashoutStatusBinding, Fragment fragment) {
        Log_OC.getArray(fragmentCommissionsCashoutStatusBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(fragmentCommissionsCashoutStatusBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        FragmentCommissionsCashoutStatusBinding $r4 = (FragmentCommissionsCashoutStatusBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, C0001R.style.AppTheme_FullScreenDialog);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentCommissionsCashoutStatusBinding $r4 = FragmentCommissionsCashoutStatusBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(\n                inflater,\n                container,\n                false\n            )");
        View $r5 = initBinding($r4, (Fragment) this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        FragmentCommissionsCashoutStatusBinding $r1 = requireBinding();
        ImageButton $r4 = $r1.closeButton;
        ImageButton r10 = $r4;
        r10.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transactioncommissions.ui.AboutFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CommissionsCashoutStatusFragment $r2 = CommissionsCashoutStatusFragment.this;
                CommissionsCashoutStatusFragment.m40978onViewCreated$lambda2$lambda0($r2, view2);
            }
        });
        ViewGroup $r6 = $r1.closeCashoutStatusButton;
        ViewGroup r11 = $r6;
        r11.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transactioncommissions.ui.g
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CommissionsCashoutStatusFragment $r2 = CommissionsCashoutStatusFragment.this;
                CommissionsCashoutStatusFragment.m40979onViewCreated$lambda2$lambda1($r2, view2);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentCommissionsCashoutStatusBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        FragmentCommissionsCashoutStatusBinding $r3 = (FragmentCommissionsCashoutStatusBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        FragmentCommissionsCashoutStatusBinding $r1 = requireBinding();
        return $r1;
    }
}
