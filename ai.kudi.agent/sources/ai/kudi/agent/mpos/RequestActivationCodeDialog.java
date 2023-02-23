package ai.kudi.agent.mpos;

import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.databinding.ActivityMposRequestActivationCodeBinding;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.h;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: RequestActivationCodeDialog.kt */
@Metadata(m10422d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0005¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H\u0096\u0001J$\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u000bH\u0002J\u001a\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\t\u0010\u001e\u001a\u00020\u0003H\u0096\u0001R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R(\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001f"}, m10421d2 = {"Lai/kudi/agent/mpos/RequestActivationCodeDialog;", "Landroidx/fragment/app/DialogFragment;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/databinding/ActivityMposRequestActivationCodeBinding;", "()V", "binding", "getBinding", "()Lai/kudi/agent/databinding/ActivityMposRequestActivationCodeBinding;", "submitListener", "Lkotlin/Function1;", "", "", "getSubmitListener", "()Lkotlin/jvm/functions/Function1;", "setSubmitListener", "(Lkotlin/jvm/functions/Function1;)V", "initBinding", "Landroid/view/View;", "fragment", "Landroidx/fragment/app/Fragment;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onSubmitClicked", "onViewCreated", "view", "requireBinding", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class RequestActivationCodeDialog extends h implements BaseViewBinder<ActivityMposRequestActivationCodeBinding> {
    private final /* synthetic */ BaseViewBinderImpl<ActivityMposRequestActivationCodeBinding> $$delegate_0;
    private InterfaceC11767l<? super String, C13666w> submitListener;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public RequestActivationCodeDialog() {
        BaseViewBinderImpl $r1 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void onSubmitClicked() {
        ActivityMposRequestActivationCodeBinding $r1 = requireBinding();
        Button $r2 = $r1.submitButton;
        $r2.setVisibility(8);
        ActivityMposRequestActivationCodeBinding $r12 = requireBinding();
        ProgressBar $r3 = $r12.progressBar;
        $r3.setVisibility(0);
        InterfaceC11767l $r4 = this.submitListener;
        if ($r4 == null) {
            return;
        }
        ActivityMposRequestActivationCodeBinding $r13 = requireBinding();
        EditText $r5 = $r13.activationCodeEditText;
        Editable $r6 = $r5.getText();
        String $r7 = $r6.toString();
        $r4.invoke($r7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-0  reason: not valid java name */
    public static final void m39823onViewCreated$lambda0(RequestActivationCodeDialog requestActivationCodeDialog, View view) {
        Log_OC.getArray(requestActivationCodeDialog, "this$0");
        requestActivationCodeDialog.onSubmitClicked();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public ActivityMposRequestActivationCodeBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        ActivityMposRequestActivationCodeBinding $r3 = (ActivityMposRequestActivationCodeBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        ActivityMposRequestActivationCodeBinding $r1 = getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final InterfaceC11767l getSubmitListener() {
        InterfaceC11767l r1 = this.submitListener;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View initBinding(ActivityMposRequestActivationCodeBinding activityMposRequestActivationCodeBinding, Fragment fragment) {
        Log_OC.getArray(activityMposRequestActivationCodeBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(activityMposRequestActivationCodeBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        ActivityMposRequestActivationCodeBinding $r4 = (ActivityMposRequestActivationCodeBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        ActivityMposRequestActivationCodeBinding $r4 = ActivityMposRequestActivationCodeBinding.inflate(layoutInflater, viewGroup, false);
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
        ActivityMposRequestActivationCodeBinding $r1 = requireBinding();
        Button $r4 = $r1.submitButton;
        $r4.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.mpos.AboutFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                RequestActivationCodeDialog $r2 = RequestActivationCodeDialog.this;
                RequestActivationCodeDialog.m39823onViewCreated$lambda0($r2, view2);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public ActivityMposRequestActivationCodeBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        ActivityMposRequestActivationCodeBinding $r3 = (ActivityMposRequestActivationCodeBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        ActivityMposRequestActivationCodeBinding $r1 = requireBinding();
        return $r1;
    }

    public final void setSubmitListener(InterfaceC11767l interfaceC11767l) {
        this.submitListener = interfaceC11767l;
    }
}
