package ai.kudi.agent.transfer.p034ui;

import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.databinding.FragmentTransferToBankCustomersBinding;
import ai.kudi.agent.login.domain.LoginParams;
import ai.kudi.agent.transfer.domain.usecases.TransferToBankPayload;
import ai.kudi.agent.transfer.generation.components.MainTransferSubComponent;
import ai.kudi.agent.transfer.presenter.TransferToBankCustomerPresenter;
import ai.kudi.agent.transfer.views.TransferToBankCustomerView;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
import p272h.p364d.p365a.p366c.AbstractC9412c;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
/* compiled from: TransferToBankCustomersFragment.kt */
@Metadata(m10422d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 02\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00050\u0004:\u00010B\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0016\u001a\u00020\u0003H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001cH\u0096\u0001J\u0010\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J$\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u001a\u0010'\u001a\u00020\u00182\u0006\u0010(\u001a\u00020\u001a2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\t\u0010)\u001a\u00020\u0005H\u0096\u0001J\u0010\u0010*\u001a\u00020\u00182\u0006\u0010+\u001a\u00020,H\u0016J\u0010\u0010-\u001a\u00020\u00182\u0006\u0010+\u001a\u00020,H\u0016J\u0010\u0010.\u001a\u00020\u00182\u0006\u0010+\u001a\u00020,H\u0016J\b\u0010/\u001a\u00020\u0018H\u0016R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\tR$\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u00061"}, m10421d2 = {"Lai/kudi/agent/transfer/ui/TransferToBankCustomersFragment;", "Lcom/hannesdorfmann/mosby3/mvp/MvpFragment;", "Lai/kudi/agent/transfer/views/TransferToBankCustomerView;", "Lai/kudi/agent/transfer/presenter/TransferToBankCustomerPresenter;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/databinding/FragmentTransferToBankCustomersBinding;", "()V", "binding", "getBinding", "()Lai/kudi/agent/databinding/FragmentTransferToBankCustomersBinding;", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences$annotations", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "setSharedPreferences", "(Landroid/content/SharedPreferences;)V", "thisPresenter", "getThisPresenter", "()Lai/kudi/agent/transfer/presenter/TransferToBankCustomerPresenter;", "setThisPresenter", "(Lai/kudi/agent/transfer/presenter/TransferToBankCustomerPresenter;)V", "createPresenter", "hideServiceFeeLoader", "", "initBinding", "Landroid/view/View;", "fragment", "Landroidx/fragment/app/Fragment;", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "requireBinding", "showReasonError", MetricTracker.Object.MESSAGE, "", "showReceiversPhoneNumberError", "showSendersPhoneNumberError", "showServiceFeeLoader", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.transfer.ui.TransferToBankCustomersFragment */
/* loaded from: classes.dex */
public final class TransferToBankCustomersFragment extends AbstractC9412c<TransferToBankCustomerView, TransferToBankCustomerPresenter> implements TransferToBankCustomerView, BaseViewBinder<FragmentTransferToBankCustomersBinding> {
    public static final String ARGS_PAYLOAD = "args_transfer_payload";
    public static final Companion Companion;
    private final /* synthetic */ BaseViewBinderImpl<FragmentTransferToBankCustomersBinding> $$delegate_0;
    public SharedPreferences sharedPreferences;
    public TransferToBankCustomerPresenter thisPresenter;

    /* compiled from: TransferToBankCustomersFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/transfer/ui/TransferToBankCustomersFragment$Companion;", "", "()V", "ARGS_PAYLOAD", "", "newInstance", "Lai/kudi/agent/transfer/ui/TransferToBankCustomersFragment;", "payload", "Lai/kudi/agent/transfer/domain/usecases/TransferToBankPayload;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.transfer.ui.TransferToBankCustomersFragment$Companion */
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
        public final TransferToBankCustomersFragment newInstance(TransferToBankPayload transferToBankPayload) {
            Log_OC.getArray(transferToBankPayload, "payload");
            TransferToBankCustomersFragment r5 = new TransferToBankCustomersFragment();
            Bundle r6 = new Bundle();
            r6.putParcelable("args_transfer_payload", transferToBankPayload);
            C13666w c13666w = C13666w.f30112a;
            TransferToBankCustomersFragment r7 = r5;
            r7.setArguments(r6);
            return r5;
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
    public TransferToBankCustomersFragment() {
        BaseViewBinderImpl $r1 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r1;
    }

    public static /* synthetic */ void getSharedPreferences$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-4$lambda-1  reason: not valid java name */
    public static final void m41380onViewCreated$lambda4$lambda1(FragmentTransferToBankCustomersBinding fragmentTransferToBankCustomersBinding, TransferToBankCustomersFragment transferToBankCustomersFragment, TransferToBankPayload transferToBankPayload, boolean z, View view) {
        Log_OC.getArray(fragmentTransferToBankCustomersBinding, "$this_apply");
        Log_OC.getArray(transferToBankCustomersFragment, "this$0");
        KudiInputField $r4 = fragmentTransferToBankCustomersBinding.senderPhoneEditText;
        String $r5 = $r4.getText();
        KudiInputField $r42 = fragmentTransferToBankCustomersBinding.recipientPhoneEditText;
        String $r6 = $r42.getText();
        KudiInputField $r43 = fragmentTransferToBankCustomersBinding.reasonField;
        String $r7 = $r43.getText();
        SwitchCompat $r8 = fragmentTransferToBankCustomersBinding.sendSmsToggle;
        boolean $z1 = $r8.isChecked();
        ContextExtKt.hideKeyboard(transferToBankCustomersFragment);
        TransferToBankCustomerPresenter $r9 = transferToBankCustomersFragment.getThisPresenter();
        Log_OC.append(transferToBankPayload);
        Boolean $r10 = Boolean.valueOf($z1);
        TransferToBankPayload $r2 = TransferToBankPayload.copy$default(transferToBankPayload, null, null, null, $r10, null, $r6, null, null, $r5, $r7, null, null, null, 7383, null);
        $r9.navigateToSummaryPage($r2, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-4$lambda-2  reason: not valid java name */
    public static final void m41381onViewCreated$lambda4$lambda2(FragmentTransferToBankCustomersBinding fragmentTransferToBankCustomersBinding, CompoundButton compoundButton, boolean z) {
        Log_OC.getArray(fragmentTransferToBankCustomersBinding, "$this_apply");
        if (!z) {
            View $r2 = fragmentTransferToBankCustomersBinding.recipientPhoneEditText;
            Log_OC.loadImage($r2, "recipientPhoneEditText");
            View r4 = $r2;
            ViewExtKt.hide$default(r4, false, 1, null);
            EditText $r3 = fragmentTransferToBankCustomersBinding.reasonField.getEditText();
            $r3.setImeOptions(6);
            return;
        }
        View $r22 = fragmentTransferToBankCustomersBinding.recipientPhoneEditText;
        Log_OC.loadImage($r22, "recipientPhoneEditText");
        View r42 = $r22;
        ViewExtKt.show(r42);
        EditText $r32 = fragmentTransferToBankCustomersBinding.reasonField.getEditText();
        $r32.setImeOptions(5);
        EditText $r33 = fragmentTransferToBankCustomersBinding.recipientPhoneEditText.getEditText();
        $r33.setImeOptions(6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-4$lambda-3  reason: not valid java name */
    public static final void m41382onViewCreated$lambda4$lambda3(FragmentTransferToBankCustomersBinding fragmentTransferToBankCustomersBinding, View view) {
        Log_OC.getArray(fragmentTransferToBankCustomersBinding, "$this_apply");
        SwitchCompat $r2 = fragmentTransferToBankCustomersBinding.sendSmsToggle;
        SwitchCompat r3 = $r2;
        boolean $z0 = r3.isChecked();
        $r2.setChecked(!$z0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public TransferToBankCustomerPresenter createPresenter() {
        TransferToBankCustomerPresenter $r1 = getThisPresenter();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public /* bridge */ /* synthetic */ InterfaceC9413d createPresenter() {
        InterfaceC9413d $r1 = createPresenter();
        InterfaceC9413d r2 = $r1;
        return r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentTransferToBankCustomersBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        FragmentTransferToBankCustomersBinding $r3 = (FragmentTransferToBankCustomersBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        FragmentTransferToBankCustomersBinding $r1 = getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SharedPreferences getSharedPreferences() {
        SharedPreferences $r1 = this.sharedPreferences;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("sharedPreferences");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final TransferToBankCustomerPresenter getThisPresenter() {
        TransferToBankCustomerPresenter $r1 = this.thisPresenter;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("thisPresenter");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transfer.views.TransferToBankCustomerView
    public void hideServiceFeeLoader() {
        FragmentTransferToBankCustomersBinding $r1 = requireBinding();
        KudiButton $r2 = $r1.continueToNextPage;
        $r2.m38033e();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View initBinding(FragmentTransferToBankCustomersBinding fragmentTransferToBankCustomersBinding, Fragment fragment) {
        Log_OC.getArray(fragmentTransferToBankCustomersBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(fragmentTransferToBankCustomersBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        FragmentTransferToBankCustomersBinding $r4 = (FragmentTransferToBankCustomersBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        TransferToBankCustomersFragment r7 = this;
        super.onAttach(context);
        TransferToBankCustomersFragment r72 = this;
        FragmentActivity $r2 = r72.getActivity();
        if ($r2 == null) {
            NullPointerException r6 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.transfer.ui.TransferActivity");
            throw r6;
        }
        TransferActivity $r3 = (TransferActivity) $r2;
        MainTransferSubComponent $r4 = $r3.getTransferSubComponent();
        $r4.inject(this);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentTransferToBankCustomersBinding $r4 = FragmentTransferToBankCustomersBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(\n                inflater,\n                container,\n                false\n            )");
        TransferToBankCustomersFragment r6 = this;
        View $r5 = initBinding($r4, (Fragment) r6);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        final FragmentTransferToBankCustomersBinding $r3 = requireBinding();
        TransferToBankCustomersFragment r20 = this;
        Bundle $r2 = r20.requireArguments();
        Parcelable $r4 = $r2.getParcelable("args_transfer_payload");
        final TransferToBankPayload $r5 = (TransferToBankPayload) $r4;
        SharedPreferences $r6 = getSharedPreferences();
        String $r7 = $r6.getString(LoginParams.EXTRA_CUSTOMER_TYPE, "USER");
        final boolean $z0 = Log_OC.append($r7, "USER");
        if ($z0) {
            TextView $r8 = $r3.pageTitle;
            Log_OC.loadImage($r8, "pageTitle");
            ViewExtKt.hide$default($r8, false, 1, null);
            View $r9 = $r3.senderPhoneEditText;
            Log_OC.loadImage($r9, "senderPhoneEditText");
            View $r1 = $r9;
            ViewExtKt.hide$default($r1, false, 1, null);
        }
        if ($r5 != null) {
            KudiInputField $r92 = $r3.senderPhoneEditText;
            String $r10 = $r5.getSendersPhone();
            String $r11 = $r10;
            if ($r10 == null) {
                $r11 = "";
            }
            $r92.setText($r11);
            KudiInputField $r93 = $r3.reasonField;
            String $r102 = $r5.getReason();
            String $r112 = $r102;
            if ($r102 == null) {
                $r112 = "";
            }
            $r93.setText($r112);
            KudiInputField $r94 = $r3.recipientPhoneEditText;
            String $r103 = $r5.getPhoneNumber();
            String $r72 = $r103 != null ? $r103 : "";
            $r94.setText($r72);
        }
        ViewGroup $r12 = $r3.continueToNextPage;
        ViewGroup r21 = $r12;
        r21.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transfer.ui.g
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                FragmentTransferToBankCustomersBinding $r22 = FragmentTransferToBankCustomersBinding.this;
                TransferToBankCustomersFragment $r32 = this;
                TransferToBankPayload $r42 = $r5;
                boolean $z02 = $z0;
                TransferToBankCustomersFragment.m41380onViewCreated$lambda4$lambda1($r22, $r32, $r42, $z02, view2);
            }
        });
        CompoundButton $r14 = $r3.sendSmsToggle;
        CompoundButton r22 = $r14;
        r22.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ai.kudi.agent.transfer.ui.SettingsFragment$9
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                FragmentTransferToBankCustomersBinding $r22 = FragmentTransferToBankCustomersBinding.this;
                TransferToBankCustomersFragment.m41381onViewCreated$lambda4$lambda2($r22, compoundButton, z);
            }
        });
        $r3.sendSmsToggleLabel.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transfer.ui.c
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                FragmentTransferToBankCustomersBinding $r22 = FragmentTransferToBankCustomersBinding.this;
                TransferToBankCustomersFragment.m41382onViewCreated$lambda4$lambda3($r22, view2);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentTransferToBankCustomersBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        FragmentTransferToBankCustomersBinding $r3 = (FragmentTransferToBankCustomersBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        FragmentTransferToBankCustomersBinding $r1 = requireBinding();
        return $r1;
    }

    public final void setSharedPreferences(SharedPreferences sharedPreferences) {
        Log_OC.getArray(sharedPreferences, "<set-?>");
        this.sharedPreferences = sharedPreferences;
    }

    public final void setThisPresenter(TransferToBankCustomerPresenter transferToBankCustomerPresenter) {
        Log_OC.getArray(transferToBankCustomerPresenter, "<set-?>");
        this.thisPresenter = transferToBankCustomerPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transfer.views.TransferToBankCustomerView
    public void showReasonError(String str) {
        Log_OC.getArray(str, MetricTracker.Object.MESSAGE);
        FragmentTransferToBankCustomersBinding $r2 = requireBinding();
        KudiInputField $r3 = $r2.reasonField;
        $r3.setError(str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transfer.views.TransferToBankCustomerView
    public void showReceiversPhoneNumberError(String str) {
        Log_OC.getArray(str, MetricTracker.Object.MESSAGE);
        FragmentTransferToBankCustomersBinding $r2 = requireBinding();
        KudiInputField $r3 = $r2.recipientPhoneEditText;
        $r3.setError(str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transfer.views.TransferToBankCustomerView
    public void showSendersPhoneNumberError(String str) {
        Log_OC.getArray(str, MetricTracker.Object.MESSAGE);
        FragmentTransferToBankCustomersBinding $r2 = requireBinding();
        KudiInputField $r3 = $r2.senderPhoneEditText;
        $r3.setError(str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transfer.views.TransferToBankCustomerView
    public void showServiceFeeLoader() {
        FragmentTransferToBankCustomersBinding $r1 = requireBinding();
        KudiButton $r2 = $r1.continueToNextPage;
        $r2.m38032f();
    }
}
