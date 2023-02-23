package ai.kudi.agent.bills.p002ui;

import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.databinding.ViewBillsConfirmationBinding;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.h;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: ConfirmationDialog.kt */
@Metadata(m10422d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0005¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0010\u001a\u00020\u000bJ\u0006\u0010\u0011\u001a\u00020\u000bJ\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H\u0096\u0001J$\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u001a\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\t\u0010\u001f\u001a\u00020\u0003H\u0096\u0001J\u000e\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\"J\u0006\u0010#\u001a\u00020\u000bJ\u0006\u0010$\u001a\u00020\u000bJ\u000e\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\"R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R(\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006'"}, m10421d2 = {"Lai/kudi/agent/bills/ui/ConfirmationDialog;", "Landroidx/fragment/app/DialogFragment;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/databinding/ViewBillsConfirmationBinding;", "()V", "binding", "getBinding", "()Lai/kudi/agent/databinding/ViewBillsConfirmationBinding;", "submitClick", "Lkotlin/Function1;", "", "", "getSubmitClick", "()Lkotlin/jvm/functions/Function1;", "setSubmitClick", "(Lkotlin/jvm/functions/Function1;)V", "hideIncludeServiceFeeOption", "hideLoading", "initBinding", "Landroid/view/View;", "fragment", "Landroidx/fragment/app/Fragment;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "requireBinding", "setServiceFee", "fee", "", "showIncludeServiceFeeOption", "showLoading", "showLoadingError", MetricTracker.Object.MESSAGE, "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.bills.ui.ConfirmationDialog */
/* loaded from: classes.dex */
public final class ConfirmationDialog extends h implements BaseViewBinder<ViewBillsConfirmationBinding> {
    private final /* synthetic */ BaseViewBinderImpl<ViewBillsConfirmationBinding> $$delegate_0;
    private InterfaceC11767l<? super Boolean, C13666w> submitClick;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ConfirmationDialog() {
        BaseViewBinderImpl $r1 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-1$lambda-0  reason: not valid java name */
    public static final void m39089onViewCreated$lambda1$lambda0(ConfirmationDialog confirmationDialog, ViewBillsConfirmationBinding viewBillsConfirmationBinding, View view) {
        Log_OC.getArray(confirmationDialog, "this$0");
        Log_OC.getArray(viewBillsConfirmationBinding, "$this_apply");
        InterfaceC11767l $r3 = confirmationDialog.getSubmitClick();
        if ($r3 == null) {
            return;
        }
        CheckBox $r4 = viewBillsConfirmationBinding.serviceFeeCheckBox;
        boolean $z0 = $r4.isChecked();
        Boolean $r5 = Boolean.valueOf($z0);
        $r3.invoke($r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public ViewBillsConfirmationBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        ViewBillsConfirmationBinding $r3 = (ViewBillsConfirmationBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        ViewBillsConfirmationBinding $r1 = getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final InterfaceC11767l getSubmitClick() {
        InterfaceC11767l r1 = this.submitClick;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void hideIncludeServiceFeeOption() {
        ViewBillsConfirmationBinding $r1 = requireBinding();
        CheckBox $r2 = $r1.serviceFeeCheckBox;
        $r2.setVisibility(8);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void hideLoading() {
        ViewBillsConfirmationBinding $r1 = requireBinding();
        Button $r2 = $r1.submitButton;
        $r2.setVisibility(0);
        ViewBillsConfirmationBinding $r12 = requireBinding();
        TextView $r3 = $r12.serviceFeeTextView;
        $r3.setVisibility(0);
        ViewBillsConfirmationBinding $r13 = requireBinding();
        ProgressBar $r4 = $r13.progressBar;
        $r4.setVisibility(8);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View initBinding(ViewBillsConfirmationBinding viewBillsConfirmationBinding, Fragment fragment) {
        Log_OC.getArray(viewBillsConfirmationBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(viewBillsConfirmationBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        ViewBillsConfirmationBinding $r4 = (ViewBillsConfirmationBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        ViewBillsConfirmationBinding $r4 = ViewBillsConfirmationBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        View $r5 = initBinding($r4, (Fragment) this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        final ViewBillsConfirmationBinding $r1 = requireBinding();
        Button $r4 = $r1.submitButton;
        $r4.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.bills.ui.e
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ConfirmationDialog $r2 = ConfirmationDialog.this;
                ViewBillsConfirmationBinding $r3 = $r1;
                ConfirmationDialog.m39089onViewCreated$lambda1$lambda0($r2, $r3, view2);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public ViewBillsConfirmationBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        ViewBillsConfirmationBinding $r3 = (ViewBillsConfirmationBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        ViewBillsConfirmationBinding $r1 = requireBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setServiceFee(String str) {
        Log_OC.getArray(str, "fee");
        ViewBillsConfirmationBinding $r2 = requireBinding();
        TextView $r3 = $r2.serviceFeeTextView;
        String $r1 = Log_OC.m10359a("NGN ", (Object) str);
        $r3.setText($r1);
    }

    public final void setSubmitClick(InterfaceC11767l interfaceC11767l) {
        this.submitClick = interfaceC11767l;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void showIncludeServiceFeeOption() {
        ViewBillsConfirmationBinding $r1 = requireBinding();
        CheckBox $r2 = $r1.serviceFeeCheckBox;
        $r2.setVisibility(0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void showLoading() {
        ViewBillsConfirmationBinding $r1 = requireBinding();
        Button $r2 = $r1.submitButton;
        $r2.setVisibility(8);
        ViewBillsConfirmationBinding $r12 = requireBinding();
        TextView $r3 = $r12.serviceFeeTextView;
        $r3.setVisibility(8);
        ViewBillsConfirmationBinding $r13 = requireBinding();
        ProgressBar $r4 = $r13.progressBar;
        $r4.setVisibility(0);
    }

    public final void showLoadingError(String str) {
        Log_OC.getArray(str, MetricTracker.Object.MESSAGE);
    }
}
