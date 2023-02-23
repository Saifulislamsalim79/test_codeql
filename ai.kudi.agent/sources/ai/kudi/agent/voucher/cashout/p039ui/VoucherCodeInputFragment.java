package ai.kudi.agent.voucher.cashout.p039ui;

import ai.kudi.agent.BaseApplication;
import ai.kudi.agent.core.internal.components.ApplicationComponent;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.databinding.FragmentVoucherCodeInputBinding;
import ai.kudi.agent.voucher.cashout.domain.model.VoucherVerification;
import ai.kudi.agent.voucher.cashout.presenter.VoucherVerificationPresenter;
import ai.kudi.agent.voucher.cashout.view.VoucherVerificationView;
import ai.kudi.dip.library.keypad.PinpadView;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import io.intercom.android.sdk.views.holder.AttributeType;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13277t;
import p201g.p270x.InterfaceC8209a;
import p272h.p364d.p365a.p366c.AbstractC9412c;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: VoucherCodeInputFragment.kt */
@Metadata(m10422d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 )2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0001)B\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0003H\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0015H\u0096\u0001J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0012\u0010\u0019\u001a\u00020\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J$\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\t\u0010$\u001a\u00020\u0005H\u0096\u0001J\u0012\u0010%\u001a\u00020\u00112\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\b\u0010(\u001a\u00020\u0011H\u0016R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006*"}, m10421d2 = {"Lai/kudi/agent/voucher/cashout/ui/VoucherCodeInputFragment;", "Lcom/hannesdorfmann/mosby3/mvp/MvpFragment;", "Lai/kudi/agent/voucher/cashout/view/VoucherVerificationView;", "Lai/kudi/agent/voucher/cashout/presenter/VoucherVerificationPresenter;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/databinding/FragmentVoucherCodeInputBinding;", "()V", "binding", "getBinding", "()Lai/kudi/agent/databinding/FragmentVoucherCodeInputBinding;", "thisPresenter", "getThisPresenter", "()Lai/kudi/agent/voucher/cashout/presenter/VoucherVerificationPresenter;", "setThisPresenter", "(Lai/kudi/agent/voucher/cashout/presenter/VoucherVerificationPresenter;)V", "createPresenter", "hideLoading", "", "initBinding", "Landroid/view/View;", "fragment", "Landroidx/fragment/app/Fragment;", "navigateToPhoneVerificationPage", "voucherVerification", "Lai/kudi/agent/voucher/cashout/domain/model/VoucherVerification;", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "requireBinding", "showError", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "", "showLoading", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.voucher.cashout.ui.VoucherCodeInputFragment */
/* loaded from: classes.dex */
public final class VoucherCodeInputFragment extends AbstractC9412c<VoucherVerificationView, VoucherVerificationPresenter> implements VoucherVerificationView, BaseViewBinder<FragmentVoucherCodeInputBinding> {
    public static final Companion Companion;
    private final /* synthetic */ BaseViewBinderImpl<FragmentVoucherCodeInputBinding> $$delegate_0;
    public VoucherVerificationPresenter thisPresenter;

    /* compiled from: VoucherCodeInputFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/agent/voucher/cashout/ui/VoucherCodeInputFragment$Companion;", "", "()V", "newInstance", "Lai/kudi/agent/voucher/cashout/ui/VoucherCodeInputFragment;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.voucher.cashout.ui.VoucherCodeInputFragment$Companion */
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
        public final VoucherCodeInputFragment newInstance() {
            VoucherCodeInputFragment $r1 = new VoucherCodeInputFragment();
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
    public VoucherCodeInputFragment() {
        BaseViewBinderImpl $r1 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onActivityCreated$lambda-1$lambda-0  reason: not valid java name */
    public static final void m41743onActivityCreated$lambda1$lambda0(VoucherCodeInputFragment voucherCodeInputFragment, FragmentVoucherCodeInputBinding fragmentVoucherCodeInputBinding, View view) {
        Log_OC.getArray(voucherCodeInputFragment, "this$0");
        Log_OC.getArray(fragmentVoucherCodeInputBinding, "$this_apply");
        VoucherVerificationPresenter $r3 = voucherCodeInputFragment.getThisPresenter();
        EditText $r4 = fragmentVoucherCodeInputBinding.voucherEditText;
        Editable $r5 = $r4.getText();
        String $r6 = String.valueOf($r5);
        $r3.verifyVoucher($r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public VoucherVerificationPresenter createPresenter() {
        VoucherVerificationPresenter $r1 = getThisPresenter();
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
    public FragmentVoucherCodeInputBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        FragmentVoucherCodeInputBinding $r3 = (FragmentVoucherCodeInputBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        FragmentVoucherCodeInputBinding $r1 = getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final VoucherVerificationPresenter getThisPresenter() {
        VoucherVerificationPresenter $r1 = this.thisPresenter;
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
    @Override // ai.kudi.agent.voucher.cashout.view.VoucherVerificationView
    public void hideLoading() {
        FragmentVoucherCodeInputBinding $r1 = requireBinding();
        View $r2 = $r1.sendVoucherButton;
        Log_OC.loadImage($r2, "sendVoucherButton");
        View r4 = $r2;
        ViewExtKt.show(r4);
        ProgressBar $r3 = $r1.progressBar;
        Log_OC.loadImage($r3, "progressBar");
        ViewExtKt.hide($r3, true);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View initBinding(FragmentVoucherCodeInputBinding fragmentVoucherCodeInputBinding, Fragment fragment) {
        Log_OC.getArray(fragmentVoucherCodeInputBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(fragmentVoucherCodeInputBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        FragmentVoucherCodeInputBinding $r4 = (FragmentVoucherCodeInputBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.voucher.cashout.view.VoucherVerificationView
    public void navigateToPhoneVerificationPage(VoucherVerification voucherVerification) {
        Log_OC.getArray(voucherVerification, "voucherVerification");
        VoucherCodeInputFragment r5 = this;
        FragmentActivity $r2 = r5.requireActivity();
        Intent r4 = new Intent($r2, VoucherCashOutPhoneVerificationActivity.class);
        r4.putExtra(VoucherCashOutPhoneVerificationActivity.VOUCHER_VERIFICATION_INTENT, voucherVerification);
        VoucherCodeInputFragment r52 = this;
        r52.startActivity(r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        VoucherCodeInputFragment r10 = this;
        FragmentActivity $r2 = r10.getActivity();
        if ($r2 != null) {
            ContextExtKt.hideKeyboard($r2);
        }
        final FragmentVoucherCodeInputBinding $r3 = requireBinding();
        ViewGroup $r4 = $r3.sendVoucherButton;
        ViewGroup r11 = $r4;
        r11.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.voucher.cashout.ui.g
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VoucherCodeInputFragment $r22 = VoucherCodeInputFragment.this;
                FragmentVoucherCodeInputBinding $r32 = $r3;
                VoucherCodeInputFragment.m41743onActivityCreated$lambda1$lambda0($r22, $r32, view);
            }
        });
        PinpadView $r6 = $r3.pinTextInput;
        $r6.setViewProvider(new PinpadView.InterfaceC0836d() { // from class: ai.kudi.agent.voucher.cashout.ui.VoucherCodeInputFragment$onActivityCreated$1$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.dip.library.keypad.PinpadView.InterfaceC0836d
            public void onAppendChar(String str) {
                Log_OC.getArray(str, "char");
                FragmentVoucherCodeInputBinding $r22 = FragmentVoucherCodeInputBinding.this;
                EditText $r32 = $r22.voucherEditText;
                $r32.append(str);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.dip.library.keypad.PinpadView.InterfaceC0836d
            public void onDeleteChar() {
                int $i0;
                FragmentVoucherCodeInputBinding $r1 = FragmentVoucherCodeInputBinding.this;
                EditText $r22 = $r1.voucherEditText;
                Editable $r32 = $r22.getText();
                int $i02 = $r32.toString().length();
                boolean $z0 = $i02 > 0;
                if ($z0) {
                    Editable $r33 = $r22.getText();
                    String $r42 = $r33.toString();
                    Editable $r34 = $r22.getText();
                    Log_OC.loadImage($r34, AttributeType.TEXT);
                    $i0 = C13277t.m5410Q($r34);
                    if ($r42 == null) {
                        NullPointerException $r5 = new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        throw $r5;
                    }
                    String $r43 = $r42.substring(0, $i0);
                    Log_OC.loadImage($r43, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    $r22.setText($r43);
                }
            }

            public void onReset() {
            }

            public void setNumDigits(int i) {
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        VoucherCodeInputFragment r8 = this;
        super.onAttach(context);
        VoucherCodeInputFragment r82 = this;
        FragmentActivity $r2 = r82.requireActivity();
        Application $r3 = $r2.getApplication();
        if ($r3 == null) {
            NullPointerException r7 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.BaseApplication");
            throw r7;
        }
        BaseApplication $r4 = (BaseApplication) $r3;
        ApplicationComponent $r5 = $r4.getApplicationComponent();
        $r5.inject(this);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentVoucherCodeInputBinding $r4 = FragmentVoucherCodeInputBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        VoucherCodeInputFragment r6 = this;
        View $r5 = initBinding($r4, (Fragment) r6);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentVoucherCodeInputBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        FragmentVoucherCodeInputBinding $r3 = (FragmentVoucherCodeInputBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        FragmentVoucherCodeInputBinding $r1 = requireBinding();
        return $r1;
    }

    public final void setThisPresenter(VoucherVerificationPresenter voucherVerificationPresenter) {
        Log_OC.getArray(voucherVerificationPresenter, "<set-?>");
        this.thisPresenter = voucherVerificationPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.voucher.cashout.view.VoucherVerificationView
    public void showError(String str) {
        VoucherCodeInputFragment r3 = this;
        FragmentActivity $r2 = r3.getActivity();
        if ($r2 == null) {
            return;
        }
        ContextExtKt.toast$default($r2, str, 0, 2, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.voucher.cashout.view.VoucherVerificationView
    public void showLoading() {
        FragmentVoucherCodeInputBinding $r1 = requireBinding();
        View $r2 = $r1.sendVoucherButton;
        Log_OC.loadImage($r2, "sendVoucherButton");
        View r4 = $r2;
        ViewExtKt.hide(r4, true);
        ProgressBar $r3 = $r1.progressBar;
        Log_OC.loadImage($r3, "progressBar");
        ViewExtKt.show($r3);
    }
}
