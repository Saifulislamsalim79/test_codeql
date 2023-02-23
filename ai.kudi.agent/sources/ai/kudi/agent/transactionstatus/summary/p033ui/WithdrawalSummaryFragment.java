package ai.kudi.agent.transactionstatus.summary.p033ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.common_screens.success_screen.fragment.SuccessScreenDialogFragment;
import ai.kudi.agent.common_screens.success_screen.labs.SuccessScreenCustomOption;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.databinding.FragmentWithdrawalSummaryBinding;
import ai.kudi.agent.pin.KudiPin;
import ai.kudi.agent.transactionstatus.summary.adapter.WithdrawalSummaryAdapter;
import ai.kudi.agent.transactionstatus.summary.model.WithdrawalSummaryModel;
import ai.kudi.agent.transactionstatus.summary.presenter.WithdrawalSummaryPresenter;
import ai.kudi.agent.transactionstatus.summary.view.WithdrawalView;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.voucher.cashout.domain.model.VoucherResponse;
import ai.kudi.agent.withdrawal.p041ui.WithdrawActivity;
import ai.kudi.agent.withdrawal.xmpp.components.WithdrawalSubComponent;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import androidx.fragment.app.Chapter;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.InterfaceC1523w;
import androidx.lifecycle.PreferenceActivity;
import java.util.ArrayList;
import java.util.List;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
import p201g.p270x.InterfaceC8209a;
import p272h.p364d.p365a.p366c.AbstractC9412c;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: WithdrawalSummaryFragment.kt */
@Metadata(m10422d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 62\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00050\u0004:\u00016B\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0015\u001a\u00020\u0003H\u0016J \u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00180\u0017j\b\u0012\u0004\u0012\u00020\u0018`\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010 \u001a\u00020!H\u0096\u0001J\u0010\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020$H\u0016J\u0012\u0010%\u001a\u00020\u001d2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\u0010\u0010(\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020*H\u0016J$\u0010+\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\b\u00100\u001a\u00020\u001dH\u0016J\t\u00101\u001a\u00020\u0005H\u0096\u0001J\u0012\u00102\u001a\u00020\u001d2\b\u00103\u001a\u0004\u0018\u000104H\u0016J\b\u00105\u001a\u00020\u001dH\u0016R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u00067"}, m10421d2 = {"Lai/kudi/agent/transactionstatus/summary/ui/WithdrawalSummaryFragment;", "Lcom/hannesdorfmann/mosby3/mvp/MvpFragment;", "Lai/kudi/agent/transactionstatus/summary/view/WithdrawalView;", "Lai/kudi/agent/transactionstatus/summary/presenter/WithdrawalSummaryPresenter;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/databinding/FragmentWithdrawalSummaryBinding;", "()V", "binding", "getBinding", "()Lai/kudi/agent/databinding/FragmentWithdrawalSummaryBinding;", "thisPresenter", "getThisPresenter", "()Lai/kudi/agent/transactionstatus/summary/presenter/WithdrawalSummaryPresenter;", "setThisPresenter", "(Lai/kudi/agent/transactionstatus/summary/presenter/WithdrawalSummaryPresenter;)V", "withdrawalType", "Landroid/os/Parcelable;", "getWithdrawalType", "()Landroid/os/Parcelable;", "setWithdrawalType", "(Landroid/os/Parcelable;)V", "createPresenter", "getVoucherWithdrawalSummary", "Ljava/util/ArrayList;", "Lai/kudi/agent/transactionstatus/summary/model/WithdrawalSummaryModel;", "Lkotlin/collections/ArrayList;", "voucher", "Lai/kudi/agent/voucher/cashout/domain/model/VoucherResponse;", "hideLoading", "", "initBinding", "Landroid/view/View;", "fragment", "Landroidx/fragment/app/Fragment;", "navigateToTransactionStatusPage", "isSuccessful", "", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "pinConfirmationDialog", "requireBinding", "showError", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "", "showLoading", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.transactionstatus.summary.ui.WithdrawalSummaryFragment */
/* loaded from: classes.dex */
public final class WithdrawalSummaryFragment extends AbstractC9412c<WithdrawalView, WithdrawalSummaryPresenter> implements WithdrawalView, BaseViewBinder<FragmentWithdrawalSummaryBinding> {
    public static final Companion Companion;
    public static final String WITHDRAWAL_SUMMARY_ARGS = "WITHDRAWAL_SUMMARY_ARGS";
    private final /* synthetic */ BaseViewBinderImpl<FragmentWithdrawalSummaryBinding> $$delegate_0;
    public WithdrawalSummaryPresenter thisPresenter;
    public Parcelable withdrawalType;

    /* compiled from: WithdrawalSummaryFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/transactionstatus/summary/ui/WithdrawalSummaryFragment$Companion;", "", "()V", WithdrawalSummaryFragment.WITHDRAWAL_SUMMARY_ARGS, "", "newInstance", "Lai/kudi/agent/transactionstatus/summary/ui/WithdrawalSummaryFragment;", "summary", "Landroid/os/Parcelable;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.transactionstatus.summary.ui.WithdrawalSummaryFragment$Companion */
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
        public final WithdrawalSummaryFragment newInstance(Parcelable parcelable) {
            Log_OC.getArray(parcelable, "summary");
            WithdrawalSummaryFragment r5 = new WithdrawalSummaryFragment();
            Bundle r6 = new Bundle();
            r6.putParcelable(WithdrawalSummaryFragment.WITHDRAWAL_SUMMARY_ARGS, parcelable);
            C13666w c13666w = C13666w.f30112a;
            WithdrawalSummaryFragment r7 = r5;
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
    public WithdrawalSummaryFragment() {
        BaseViewBinderImpl $r1 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final ArrayList getVoucherWithdrawalSummary(VoucherResponse voucherResponse) {
        ArrayList $r7;
        String $r4 = voucherResponse.getRecipientName();
        WithdrawalSummaryModel r8 = new WithdrawalSummaryModel("Receiver's Name", StringExtKt.getCapitalizeAllWords($r4));
        StringBuilder r9 = new StringBuilder();
        WithdrawalSummaryFragment r10 = this;
        String $r42 = r10.getString(C0001R.string.naira_symbol);
        r9.append($r42);
        r9.append(' ');
        double $d0 = voucherResponse.getAmount();
        r9.append($d0);
        String $r43 = r9.toString();
        WithdrawalSummaryModel r82 = new WithdrawalSummaryModel("Voucher Value", $r43);
        double $d02 = voucherResponse.getKudiCharge();
        Double $r6 = Double.valueOf($d02);
        String $r44 = StringExtKt.formatAmount($r6);
        WithdrawalSummaryModel r83 = new WithdrawalSummaryModel("Nomba Charge", $r44);
        WithdrawalSummaryModel[] $r2 = {r8, r82, r83};
        $r7 = C13726r.m3893c($r2);
        return $r7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onActivityCreated$lambda-0  reason: not valid java name */
    public static final void m41307onActivityCreated$lambda0(WithdrawalSummaryFragment withdrawalSummaryFragment, View view) {
        Log_OC.getArray(withdrawalSummaryFragment, "this$0");
        WithdrawalSummaryPresenter $r0 = withdrawalSummaryFragment.getThisPresenter();
        $r0.showAuthDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: pinConfirmationDialog$lambda-1  reason: not valid java name */
    public static final void m41308pinConfirmationDialog$lambda1(WithdrawalSummaryFragment withdrawalSummaryFragment, String str, Bundle bundle) {
        String $r7;
        Log_OC.getArray(withdrawalSummaryFragment, "this$0");
        Log_OC.getArray(str, "$noName_0");
        Log_OC.getArray(bundle, "bundle");
        String $r1 = bundle.getString(KudiPin.ERROR_MESSAGE_KEY);
        WithdrawalSummaryPresenter $r3 = withdrawalSummaryFragment.getThisPresenter();
        WithdrawalSummaryPresenter $r4 = withdrawalSummaryFragment.getThisPresenter();
        User $r5 = $r4.getUser();
        String $r6 = "";
        if ($r5 != null && ($r7 = $r5.getPhoneNumber()) != null) {
            $r6 = $r7;
        }
        $r3.logEventUponPinVerification($r6, false, $r1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: pinConfirmationDialog$lambda-2  reason: not valid java name */
    public static final void m41309pinConfirmationDialog$lambda2(WithdrawalSummaryFragment withdrawalSummaryFragment, String str, Bundle bundle) {
        String $r6;
        Log_OC.getArray(withdrawalSummaryFragment, "this$0");
        Log_OC.getArray(str, "$noName_0");
        Log_OC.getArray(bundle, "$noName_1");
        WithdrawalSummaryPresenter $r3 = withdrawalSummaryFragment.getThisPresenter();
        WithdrawalSummaryPresenter $r4 = withdrawalSummaryFragment.getThisPresenter();
        User $r5 = $r4.getUser();
        String $r1 = "";
        if ($r5 != null && ($r6 = $r5.getPhoneNumber()) != null) {
            $r1 = $r6;
        }
        VoucherResponse $r7 = null;
        $r3.logEventUponPinVerification($r1, true, null);
        Parcelable $r8 = withdrawalSummaryFragment.getWithdrawalType();
        boolean $z0 = $r8 instanceof VoucherResponse;
        if ($z0) {
            WithdrawalSummaryFragment r11 = withdrawalSummaryFragment;
            Bundle $r2 = r11.getArguments();
            if ($r2 != null) {
                Parcelable $r82 = $r2.getParcelable(WITHDRAWAL_SUMMARY_ARGS);
                $r7 = (VoucherResponse) $r82;
            }
            if ($r7 == null) {
                NullPointerException r10 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.voucher.cashout.domain.model.VoucherResponse");
                throw r10;
            }
            WithdrawalSummaryPresenter $r32 = withdrawalSummaryFragment.getThisPresenter();
            $r32.redeemVoucher($r7.getReference());
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public WithdrawalSummaryPresenter createPresenter() {
        WithdrawalSummaryPresenter $r1 = getThisPresenter();
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
    public FragmentWithdrawalSummaryBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        FragmentWithdrawalSummaryBinding $r3 = (FragmentWithdrawalSummaryBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        FragmentWithdrawalSummaryBinding $r1 = getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final WithdrawalSummaryPresenter getThisPresenter() {
        WithdrawalSummaryPresenter $r1 = this.thisPresenter;
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
    public final Parcelable getWithdrawalType() {
        Parcelable $r1 = this.withdrawalType;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("withdrawalType");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactionstatus.summary.view.WithdrawalView
    public void hideLoading() {
        FragmentWithdrawalSummaryBinding $r1 = requireBinding();
        View $r2 = $r1.confirmPayment;
        Log_OC.loadImage($r2, "confirmPayment");
        View r4 = $r2;
        ViewExtKt.show(r4);
        ProgressBar $r3 = $r1.progressBar;
        Log_OC.loadImage($r3, "progressBar");
        ViewExtKt.hide$default($r3, false, 1, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View initBinding(FragmentWithdrawalSummaryBinding fragmentWithdrawalSummaryBinding, Fragment fragment) {
        Log_OC.getArray(fragmentWithdrawalSummaryBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(fragmentWithdrawalSummaryBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        FragmentWithdrawalSummaryBinding $r4 = (FragmentWithdrawalSummaryBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactionstatus.summary.view.WithdrawalView
    public void navigateToTransactionStatusPage(boolean z) {
        SuccessScreenCustomOption successScreenCustomOption;
        WithdrawalSummaryFragment$navigateToTransactionStatusPage$1 $r4;
        if (z) {
            String $r1 = getString(C0001R.string.transaction_successful);
            String $r2 = getString(C0001R.string.send_more);
            successScreenCustomOption = r8;
            Log_OC.loadImage($r1, "getString(\n                    R.string.transaction_successful\n                )");
            Log_OC.loadImage($r2, "getString(\n                    R.string.send_more\n                )");
            SuccessScreenCustomOption r8 = new SuccessScreenCustomOption($r1, null, $r2, false, false, false, 0, 0, 0, 0, C0001R.C0002drawable.ic_successful_transaction_status, 0, false, 7162, null);
            $r4 = r9;
            WithdrawalSummaryFragment$navigateToTransactionStatusPage$1 r9 = new WithdrawalSummaryFragment$navigateToTransactionStatusPage$1(this);
        } else {
            successScreenCustomOption = r8;
            WithdrawalSummaryFragment r10 = this;
            String $r12 = r10.getString(C0001R.string.transaction_pending);
            Log_OC.loadImage($r12, "getString(\n                    R.string.transaction_pending\n                )");
            WithdrawalSummaryFragment r102 = this;
            String $r22 = r102.getString(C0001R.string.something_went_wrong);
            Log_OC.loadImage($r22, "getString(R.string.something_went_wrong)");
            SuccessScreenCustomOption r82 = new SuccessScreenCustomOption($r12, $r22, null, false, true, false, 0, 0, 0, 0, C0001R.C0002drawable.ic_wallet_pending, 0, false, 7148, null);
            $r4 = null;
        }
        SuccessScreenDialogFragment.Companion $r5 = SuccessScreenDialogFragment.Companion;
        SuccessScreenDialogFragment $r6 = $r5.newInstance(successScreenCustomOption, $r4);
        WithdrawalSummaryFragment r103 = this;
        FragmentManager $r7 = r103.getChildFragmentManager();
        $r6.show($r7, SuccessScreenDialogFragment.PAGE_KEY);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        List m3891e;
        super.onActivityCreated(bundle);
        m3891e = C13726r.m3891e();
        WithdrawalSummaryFragment r18 = this;
        Bundle $r1 = r18.getArguments();
        Parcelable $r5 = $r1 == null ? null : $r1.getParcelable(WITHDRAWAL_SUMMARY_ARGS);
        if ($r5 == null) {
            NullPointerException r15 = new NullPointerException("null cannot be cast to non-null type android.os.Parcelable");
            throw r15;
        }
        setWithdrawalType($r5);
        boolean $z0 = getWithdrawalType() instanceof VoucherResponse;
        if ($z0) {
            WithdrawalSummaryFragment r182 = this;
            Bundle $r12 = r182.getArguments();
            Parcelable $r4 = $r12 != null ? $r12.getParcelable(WITHDRAWAL_SUMMARY_ARGS) : null;
            if ($r4 == null) {
                NullPointerException r152 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.voucher.cashout.domain.model.VoucherResponse");
                throw r152;
            } else {
                VoucherResponse $r6 = (VoucherResponse) $r4;
                m3891e = getVoucherWithdrawalSummary($r6);
            }
        }
        FragmentWithdrawalSummaryBinding $r9 = requireBinding();
        ListView $r10 = $r9.summaryListView;
        WithdrawalSummaryFragment r183 = this;
        FragmentActivity $r122 = r183.requireActivity();
        Log_OC.loadImage($r122, "requireActivity()");
        List $r2 = m3891e;
        WithdrawalSummaryAdapter r16 = new WithdrawalSummaryAdapter($r122, $r2);
        $r10.setAdapter((ListAdapter) r16);
        FragmentWithdrawalSummaryBinding $r92 = requireBinding();
        ViewGroup $r13 = $r92.confirmPayment;
        ViewGroup r19 = $r13;
        r19.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transactionstatus.summary.ui.d
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WithdrawalSummaryFragment $r22 = WithdrawalSummaryFragment.this;
                WithdrawalSummaryFragment.m41307onActivityCreated$lambda0($r22, view);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        WithdrawalSummaryFragment r7 = this;
        super.onAttach(context);
        WithdrawalSummaryFragment r72 = this;
        FragmentActivity $r2 = r72.getActivity();
        if ($r2 == null) {
            NullPointerException r6 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.withdrawal.ui.WithdrawActivity");
            throw r6;
        }
        WithdrawActivity $r3 = (WithdrawActivity) $r2;
        WithdrawalSubComponent $r4 = $r3.getWithdrawalSubComponent();
        $r4.inject(this);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentWithdrawalSummaryBinding $r4 = FragmentWithdrawalSummaryBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        WithdrawalSummaryFragment r6 = this;
        View $r5 = initBinding($r4, (Fragment) r6);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactionstatus.summary.view.WithdrawalView
    public void pinConfirmationDialog() {
        WithdrawalSummaryFragment r9 = this;
        FragmentManager $r2 = r9.getChildFragmentManager();
        WithdrawalSummaryFragment r92 = this;
        PreferenceActivity $r3 = r92.getViewLifecycleOwner();
        $r2.p1("ERROR", $r3, new InterfaceC1523w() { // from class: ai.kudi.agent.transactionstatus.summary.ui.h
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: c */
            public final void m38216c(String str, Bundle bundle) {
                WithdrawalSummaryFragment $r32 = WithdrawalSummaryFragment.this;
                WithdrawalSummaryFragment.m41308pinConfirmationDialog$lambda1($r32, str, bundle);
            }
        });
        WithdrawalSummaryFragment r93 = this;
        FragmentManager $r22 = r93.getChildFragmentManager();
        WithdrawalSummaryFragment r94 = this;
        PreferenceActivity $r32 = r94.getViewLifecycleOwner();
        $r22.p1(KudiPin.KUDI_PIN_AUTH_SUCCESS_KEY, $r32, new InterfaceC1523w() { // from class: ai.kudi.agent.transactionstatus.summary.ui.c
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: b */
            public final void m38217b(String str, Bundle bundle) {
                WithdrawalSummaryFragment $r33 = WithdrawalSummaryFragment.this;
                WithdrawalSummaryFragment.m41309pinConfirmationDialog$lambda2($r33, str, bundle);
            }
        });
        KudiPin.Companion $r1 = KudiPin.Companion;
        KudiPin $r6 = KudiPin.Companion.newInstance$default($r1, null, null, false, 7, null);
        WithdrawalSummaryFragment r95 = this;
        FragmentManager $r23 = r95.getChildFragmentManager();
        Chapter r10 = (Chapter) $r6;
        r10.show($r23, ".AuthDialog.Dialog");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentWithdrawalSummaryBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        FragmentWithdrawalSummaryBinding $r3 = (FragmentWithdrawalSummaryBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        FragmentWithdrawalSummaryBinding $r1 = requireBinding();
        return $r1;
    }

    public final void setThisPresenter(WithdrawalSummaryPresenter withdrawalSummaryPresenter) {
        Log_OC.getArray(withdrawalSummaryPresenter, "<set-?>");
        this.thisPresenter = withdrawalSummaryPresenter;
    }

    public final void setWithdrawalType(Parcelable parcelable) {
        Log_OC.getArray(parcelable, "<set-?>");
        this.withdrawalType = parcelable;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactionstatus.summary.view.WithdrawalView
    public void showError(String str) {
        WithdrawalSummaryFragment r3 = this;
        FragmentActivity $r2 = r3.getActivity();
        if ($r2 == null) {
            return;
        }
        ContextExtKt.toast$default($r2, str, 0, 2, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactionstatus.summary.view.WithdrawalView
    public void showLoading() {
        FragmentWithdrawalSummaryBinding $r1 = requireBinding();
        ProgressBar $r2 = $r1.progressBar;
        Log_OC.loadImage($r2, "progressBar");
        ViewExtKt.show($r2);
        View $r3 = $r1.confirmPayment;
        Log_OC.loadImage($r3, "confirmPayment");
        View r4 = $r3;
        ViewExtKt.hide$default(r4, false, 1, null);
    }
}
