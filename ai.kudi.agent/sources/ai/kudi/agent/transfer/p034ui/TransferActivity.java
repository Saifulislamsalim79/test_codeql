package ai.kudi.agent.transfer.p034ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.analytics.SmartLookAnalytics;
import ai.kudi.agent.core.mvp.MvpActivity;
import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.core.util.CustomDialog;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.databinding.ActivityTransferBinding;
import ai.kudi.agent.p2p.fragments.P2pNameAndPhoneNoFragment;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import ai.kudi.agent.transactionstatus.summary.p033ui.TransferSummaryFragment;
import ai.kudi.agent.transfer.domain.usecases.TransferToBankPayload;
import ai.kudi.agent.transfer.generation.components.MainTransferSubComponent;
import ai.kudi.agent.transfer.p034ui.TransferToBankAmountFragment;
import ai.kudi.agent.transfer.p034ui.TransferToBankCustomersFragment;
import ai.kudi.agent.transfer.p034ui.TransferToBankFragment;
import ai.kudi.agent.transfer.p034ui.TransferToMultipleBankFragment;
import ai.kudi.agent.transfer.presenter.MainTransferPresenter;
import ai.kudi.agent.voucher.cashin.domain.model.VoucherCashInRequest;
import ai.kudi.agent.voucher.cashin.p038ui.CreateVoucherAmountInfoFragment;
import ai.kudi.agent.voucher.cashin.p038ui.CreateVoucherRecipientInfoFragment;
import ai.kudi.agent.voucher.cashin.p038ui.CreateVoucherSenderInfoFragment;
import ai.kudi.agent.voucher.cashin.view.MainTransferView;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.tabs.TabLayout;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
/* compiled from: TransferActivity.kt */
@Metadata(m10422d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 G2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0002:\u0001GB\u0005¢\u0006\u0002\u0010\u0005J\b\u0010$\u001a\u00020\u0003H\u0016J\u001a\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*H\u0016J\u001a\u0010+\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010,2\u0006\u0010)\u001a\u00020*H\u0016J \u0010-\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010.\u001a\u00020*H\u0016J\u0018\u0010/\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010.\u001a\u00020*H\u0016J\u0018\u00100\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010.\u001a\u00020*H\u0016J\u0012\u00101\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\u001a\u00102\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010,2\u0006\u0010)\u001a\u00020*H\u0016J\u0012\u00103\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010,H\u0016J\u0012\u00104\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010,H\u0016J\b\u00105\u001a\u00020&H\u0016J\u0012\u00106\u001a\u00020&2\b\u00107\u001a\u0004\u0018\u000108H\u0014J\u0010\u00109\u001a\u00020*2\u0006\u0010:\u001a\u00020;H\u0016J\u0006\u0010<\u001a\u00020&J\b\u0010=\u001a\u00020&H\u0002J8\u0010>\u001a\u00020&2\u0006\u0010?\u001a\u00020\f2\u0006\u0010@\u001a\u00020\f2\u0006\u0010A\u001a\u00020*2\u0006\u0010B\u001a\u00020*2\u000e\u0010C\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010DH\u0016J\u000e\u0010E\u001a\u00020&2\u0006\u0010F\u001a\u00020*R\u0014\u0010\u0006\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u00038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006H"}, m10421d2 = {"Lai/kudi/agent/transfer/ui/TransferActivity;", "Lai/kudi/agent/core/mvp/MvpActivity;", "Lai/kudi/agent/voucher/cashin/view/MainTransferView;", "Lai/kudi/agent/transfer/presenter/MainTransferPresenter;", "Lai/kudi/agent/databinding/ActivityTransferBinding;", "()V", "activityBinding", "getActivityBinding", "()Lai/kudi/agent/databinding/ActivityTransferBinding;", "dialog", "Landroid/app/Dialog;", "p2pRecipientPhoneNo", "", "smartLookAnalytics", "Lai/kudi/agent/analytics/SmartLookAnalytics;", "getSmartLookAnalytics", "()Lai/kudi/agent/analytics/SmartLookAnalytics;", "setSmartLookAnalytics", "(Lai/kudi/agent/analytics/SmartLookAnalytics;)V", "tabLayout", "Lcom/google/android/material/tabs/TabLayout;", "getTabLayout", "()Lcom/google/android/material/tabs/TabLayout;", "setTabLayout", "(Lcom/google/android/material/tabs/TabLayout;)V", "thisPresenter", "getThisPresenter", "()Lai/kudi/agent/transfer/presenter/MainTransferPresenter;", "setThisPresenter", "(Lai/kudi/agent/transfer/presenter/MainTransferPresenter;)V", "transferSubComponent", "Lai/kudi/agent/transfer/di/components/MainTransferSubComponent;", "getTransferSubComponent", "()Lai/kudi/agent/transfer/di/components/MainTransferSubComponent;", "setTransferSubComponent", "(Lai/kudi/agent/transfer/di/components/MainTransferSubComponent;)V", "createPresenter", "navigateToAccountDetailsPage", "", TransactionRequest.TYPE_REQUEST, "Lai/kudi/agent/transfer/domain/usecases/TransferToBankPayload;", "isFromSummaryPage", "", "navigateToAmountPage", "Lai/kudi/agent/voucher/cashin/domain/model/VoucherCashInRequest;", "navigateToBankTransferAmountPage", "isCashOutFlow", "navigateToBankTransferSummaryPage", "navigateToCustomersInformationPage", "navigateToMultipleBankTransferPage", "navigateToRecipientPage", "navigateToSenderPage", "navigateToSummaryPage", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "popP2pTwice", "setFragmentToP2p", "showAlertDialog", MetricTracker.Object.MESSAGE, "buttonText", "upperCaseText", "cancelable", "buttonAction", "Lkotlin/Function0;", "toggleAppBarAndTabLayout", "show", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.transfer.ui.TransferActivity */
/* loaded from: classes.dex */
public final class TransferActivity extends MvpActivity<MainTransferView, MainTransferPresenter, ActivityTransferBinding> implements MainTransferView {
    public static final Companion Companion;
    public static final String RECIPIENT_PHONE_NUMBER = "RECIPIENT_PHONE_NUMBER";
    private Dialog dialog;
    private String p2pRecipientPhoneNo;
    public SmartLookAnalytics smartLookAnalytics;
    public TabLayout tabLayout;
    public MainTransferPresenter thisPresenter;
    public MainTransferSubComponent transferSubComponent;

    /* compiled from: TransferActivity.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/agent/transfer/ui/TransferActivity$Companion;", "", "()V", TransferActivity.RECIPIENT_PHONE_NUMBER, "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.transfer.ui.TransferActivity$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setFragmentToP2p() {
        P2pNameAndPhoneNoFragment.Companion $r1 = P2pNameAndPhoneNoFragment.Companion;
        String $r2 = this.p2pRecipientPhoneNo;
        P2pNameAndPhoneNoFragment $r3 = $r1.newInstance($r2);
        AppCompatActivity r4 = (AppCompatActivity) this;
        AppCompatActivityExtKt.startFragment$default(r4, $r3, C0001R.C0003id.transferContainerLayout, false, false, false, 12, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9409a, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public MainTransferPresenter createPresenter() {
        MainTransferPresenter $r1 = getThisPresenter();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9409a, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public /* bridge */ /* synthetic */ InterfaceC9413d createPresenter() {
        InterfaceC9413d $r1 = createPresenter();
        InterfaceC9413d r2 = $r1;
        return r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity
    public ActivityTransferBinding getActivityBinding() {
        Activity r3 = (Activity) this;
        LayoutInflater $r1 = r3.getLayoutInflater();
        ActivityTransferBinding $r2 = ActivityTransferBinding.inflate($r1);
        Log_OC.loadImage($r2, "inflate(layoutInflater)");
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity
    public /* bridge */ /* synthetic */ InterfaceC8209a getActivityBinding() {
        ActivityTransferBinding $r1 = getActivityBinding();
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
    public final TabLayout getTabLayout() {
        TabLayout $r1 = this.tabLayout;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("tabLayout");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final MainTransferPresenter getThisPresenter() {
        MainTransferPresenter $r1 = this.thisPresenter;
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
    public final MainTransferSubComponent getTransferSubComponent() {
        MainTransferSubComponent $r1 = this.transferSubComponent;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("transferSubComponent");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.voucher.cashin.view.MainTransferView
    public void navigateToAccountDetailsPage(TransferToBankPayload transferToBankPayload, boolean z) {
        TransferToBankFragment.Companion $r2 = TransferToBankFragment.Companion;
        TransferToBankFragment $r3 = TransferToBankFragment.Companion.newInstance$default($r2, transferToBankPayload, z, false, 4, null);
        AppCompatActivity r4 = (AppCompatActivity) this;
        AppCompatActivityExtKt.startFragment$default(r4, $r3, C0001R.C0003id.transferContainerLayout, false, false, false, 12, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.voucher.cashin.view.MainTransferView
    public void navigateToAmountPage(VoucherCashInRequest voucherCashInRequest, boolean z) {
        CreateVoucherAmountInfoFragment.Companion $r2 = CreateVoucherAmountInfoFragment.Companion;
        Fragment $r3 = $r2.newInstance(voucherCashInRequest, z);
        AppCompatActivity r4 = (AppCompatActivity) this;
        Fragment r5 = $r3;
        AppCompatActivityExtKt.startFragment$default(r4, r5, C0001R.C0003id.transferContainerLayout, false, false, false, 12, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.voucher.cashin.view.MainTransferView
    public void navigateToBankTransferAmountPage(TransferToBankPayload transferToBankPayload, boolean z, boolean z2) {
        Log_OC.getArray(transferToBankPayload, TransactionRequest.TYPE_REQUEST);
        TransferToBankAmountFragment.Companion $r3 = TransferToBankAmountFragment.Companion;
        Fragment $r2 = $r3.newInstance(transferToBankPayload, z, z2);
        AppCompatActivity r4 = (AppCompatActivity) this;
        Fragment r5 = $r2;
        AppCompatActivityExtKt.startFragment$default(r4, r5, C0001R.C0003id.transferContainerLayout, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.voucher.cashin.view.MainTransferView
    public void navigateToBankTransferSummaryPage(TransferToBankPayload transferToBankPayload, boolean z) {
        Log_OC.getArray(transferToBankPayload, TransactionRequest.TYPE_REQUEST);
        TransferSummaryFragment.Companion $r3 = TransferSummaryFragment.Companion;
        Fragment $r2 = $r3.newInstance(transferToBankPayload, z);
        AppCompatActivity r4 = (AppCompatActivity) this;
        Fragment r5 = $r2;
        AppCompatActivityExtKt.startFragment$default(r4, r5, C0001R.C0003id.transferContainerLayout, false, false, false, 12, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.voucher.cashin.view.MainTransferView
    public void navigateToCustomersInformationPage(TransferToBankPayload transferToBankPayload, boolean z) {
        Log_OC.getArray(transferToBankPayload, TransactionRequest.TYPE_REQUEST);
        TransferToBankCustomersFragment.Companion $r3 = TransferToBankCustomersFragment.Companion;
        Fragment $r2 = $r3.newInstance(transferToBankPayload);
        AppCompatActivity r4 = (AppCompatActivity) this;
        Fragment r5 = $r2;
        AppCompatActivityExtKt.startFragment$default(r4, r5, C0001R.C0003id.transferContainerLayout, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.voucher.cashin.view.MainTransferView
    public void navigateToMultipleBankTransferPage(TransferToBankPayload transferToBankPayload) {
        TransferToMultipleBankFragment.Companion $r2 = TransferToMultipleBankFragment.Companion;
        TransferToMultipleBankFragment $r3 = $r2.newInstance(transferToBankPayload);
        AppCompatActivity r4 = (AppCompatActivity) this;
        AppCompatActivityExtKt.startFragment$default(r4, $r3, C0001R.C0003id.transferContainerLayout, false, false, false, 12, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.voucher.cashin.view.MainTransferView
    public void navigateToRecipientPage(VoucherCashInRequest voucherCashInRequest, boolean z) {
        CreateVoucherRecipientInfoFragment.Companion $r2 = CreateVoucherRecipientInfoFragment.Companion;
        Fragment $r3 = $r2.newInstance(voucherCashInRequest, z);
        AppCompatActivity r4 = (AppCompatActivity) this;
        Fragment r5 = $r3;
        AppCompatActivityExtKt.startFragment$default(r4, r5, C0001R.C0003id.transferContainerLayout, false, false, false, 12, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.voucher.cashin.view.MainTransferView
    public void navigateToSenderPage(VoucherCashInRequest voucherCashInRequest) {
        CreateVoucherSenderInfoFragment.Companion $r2 = CreateVoucherSenderInfoFragment.Companion;
        Fragment $r3 = $r2.newInstance(voucherCashInRequest);
        AppCompatActivity r4 = (AppCompatActivity) this;
        Fragment r5 = $r3;
        AppCompatActivityExtKt.startFragment$default(r4, r5, C0001R.C0003id.transferContainerLayout, false, false, false, 12, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.voucher.cashin.view.MainTransferView
    public void navigateToSummaryPage(VoucherCashInRequest voucherCashInRequest) {
        TransferSummaryFragment.Companion $r2 = TransferSummaryFragment.Companion;
        TransferSummaryFragment $r3 = TransferSummaryFragment.Companion.newInstance$default($r2, voucherCashInRequest, false, 2, null);
        AppCompatActivity r4 = (AppCompatActivity) this;
        AppCompatActivityExtKt.startFragment$default(r4, $r3, C0001R.C0003id.transferContainerLayout, false, false, false, 12, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onBackPressed() {
        ComponentActivity r2 = (ComponentActivity) this;
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
        FragmentActivity r3 = (FragmentActivity) this;
        FragmentManager $r1 = r3.getSupportFragmentManager();
        int $i0 = $r1.m35920m0();
        if ($i0 <= 1) {
            Activity r4 = (Activity) this;
            r4.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ae, code lost:
        if (r27.getStringExtra(ai.kudi.agent.transfer.p034ui.TransferActivity.RECIPIENT_PHONE_NUMBER) != null) goto L33;
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity, p272h.p364d.p365a.p366c.AbstractC9409a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r63) {
        /*
            Method dump skipped, instructions count: 610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.transfer.p034ui.TransferActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Log_OC.getArray(menuItem, "item");
        int $i0 = menuItem.getItemId();
        if ($i0 != 16908332) {
            boolean $z0 = super.onOptionsItemSelected(menuItem);
            return $z0;
        }
        MainTransferPresenter $r3 = getThisPresenter();
        Activity r6 = (Activity) this;
        String $r4 = r6.getString(C0001R.string.transaction_dialog_msg);
        Log_OC.loadImage($r4, "getString(R.string.transaction_dialog_msg)");
        TransferActivity$onOptionsItemSelected$1 r5 = new TransferActivity$onOptionsItemSelected$1(this);
        $r3.showDialog($r4, "Close", false, true, r5);
        return true;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void popP2pTwice() {
        TransferActivity$popP2pTwice$1 r3 = new TransferActivity$popP2pTwice$1(this);
        AppCompatActivity r5 = (AppCompatActivity) this;
        AppCompatActivityExtKt.add(r5, r3);
        TransferActivity$popP2pTwice$2 r4 = new TransferActivity$popP2pTwice$2(this);
        AppCompatActivity r52 = (AppCompatActivity) this;
        AppCompatActivityExtKt.add(r52, r4);
    }

    public final void setSmartLookAnalytics(SmartLookAnalytics smartLookAnalytics) {
        Log_OC.getArray(smartLookAnalytics, "<set-?>");
        this.smartLookAnalytics = smartLookAnalytics;
    }

    public final void setTabLayout(TabLayout tabLayout) {
        Log_OC.getArray(tabLayout, "<set-?>");
        this.tabLayout = tabLayout;
    }

    public final void setThisPresenter(MainTransferPresenter mainTransferPresenter) {
        Log_OC.getArray(mainTransferPresenter, "<set-?>");
        this.thisPresenter = mainTransferPresenter;
    }

    public final void setTransferSubComponent(MainTransferSubComponent mainTransferSubComponent) {
        Log_OC.getArray(mainTransferSubComponent, "<set-?>");
        this.transferSubComponent = mainTransferSubComponent;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.voucher.cashin.view.MainTransferView
    public void showAlertDialog(String str, String str2, boolean z, boolean z2, InterfaceC11756a interfaceC11756a) {
        Log_OC.getArray(str, MetricTracker.Object.MESSAGE);
        Log_OC.getArray(str2, "buttonText");
        CustomDialog.Companion $r3 = CustomDialog.Companion;
        Context r6 = (Context) this;
        Dialog $r4 = $r3.show(r6, str, str2, z, z2, false, interfaceC11756a);
        this.dialog = $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void toggleAppBarAndTabLayout(boolean z) {
        if (z) {
            InterfaceC8209a $r1 = getBinding();
            ActivityTransferBinding $r2 = (ActivityTransferBinding) $r1;
            View $r3 = $r2.appBarLayout;
            Log_OC.loadImage($r3, "binding.appBarLayout");
            View r5 = $r3;
            ViewExtKt.show(r5);
            View $r4 = getTabLayout();
            View r52 = $r4;
            ViewExtKt.show(r52);
            return;
        }
        InterfaceC8209a $r12 = getBinding();
        ActivityTransferBinding $r22 = (ActivityTransferBinding) $r12;
        View $r32 = $r22.appBarLayout;
        Log_OC.loadImage($r32, "binding.appBarLayout");
        View r53 = $r32;
        ViewExtKt.hide$default(r53, false, 1, null);
        View $r42 = getTabLayout();
        View r54 = $r42;
        ViewExtKt.hide$default(r54, false, 1, null);
    }
}
