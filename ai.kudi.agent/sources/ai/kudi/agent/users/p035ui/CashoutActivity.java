package ai.kudi.agent.users.p035ui;

import ai.kudi.agent.BaseApplication;
import ai.kudi.agent.C0001R;
import ai.kudi.agent.bills.p002ui.PerformPaymentActivity;
import ai.kudi.agent.core.domain.room_entities.Bank;
import ai.kudi.agent.core.internal.components.ApplicationComponent;
import ai.kudi.agent.core.mvp.MvpActivity;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.databinding.ViewUsersCashoutBinding;
import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import ai.kudi.agent.users.domain.package_1.WithdrawToBankRequest;
import ai.kudi.agent.users.presenters.CashoutPresenter;
import ai.kudi.agent.users.views.CashoutView;
import ai.kudi.agent.wallettopup.data.BanksWithMethods;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AbstractC0925a;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import io.intercom.android.sdk.views.holder.AttributeType;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
import p201g.p270x.InterfaceC8209a;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
/* compiled from: CashoutActivity.kt */
@Metadata(m10422d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010 \u001a\u00020\u0003H\u0016J\b\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\"H\u0016J\u0010\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u0010'\u001a\u00020\"2\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010(\u001a\u00020\"H\u0002J\u0006\u0010)\u001a\u00020\"J\u0012\u0010*\u001a\u00020\"2\b\u0010+\u001a\u0004\u0018\u00010,H\u0014J\u0010\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0016J\u0006\u00101\u001a\u00020\"J\u0010\u00102\u001a\u00020\"2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u00103\u001a\u00020\"H\u0016J\b\u00104\u001a\u00020\"H\u0016J\u0010\u00105\u001a\u00020\"2\u0006\u00106\u001a\u00020\u0007H\u0016J\u0010\u00107\u001a\u00020\"2\u0006\u00106\u001a\u00020\u0007H\u0016J\u0010\u00108\u001a\u00020\"2\u0006\u00106\u001a\u00020\u0007H\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u00038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u00069"}, m10421d2 = {"Lai/kudi/agent/users/ui/CashoutActivity;", "Lai/kudi/agent/core/mvp/MvpActivity;", "Lai/kudi/agent/users/views/CashoutView;", "Lai/kudi/agent/users/presenters/CashoutPresenter;", "Lai/kudi/agent/databinding/ViewUsersCashoutBinding;", "()V", BanksWithMethods.ACCOUNT_NAME, "", "getAccountName", "()Ljava/lang/String;", "setAccountName", "(Ljava/lang/String;)V", "activityBinding", "getActivityBinding", "()Lai/kudi/agent/databinding/ViewUsersCashoutBinding;", "feesDialog", "Lai/kudi/agent/users/ui/CashoutFeesDialog;", "getFeesDialog", "()Lai/kudi/agent/users/ui/CashoutFeesDialog;", "setFeesDialog", "(Lai/kudi/agent/users/ui/CashoutFeesDialog;)V", "selectedBank", "Lai/kudi/agent/core/domain/room_entities/Bank;", "getSelectedBank", "()Lai/kudi/agent/core/domain/room_entities/Bank;", "setSelectedBank", "(Lai/kudi/agent/core/domain/room_entities/Bank;)V", "thisPresenter", "getThisPresenter", "()Lai/kudi/agent/users/presenters/CashoutPresenter;", "setThisPresenter", "(Lai/kudi/agent/users/presenters/CashoutPresenter;)V", "createPresenter", "disableTransferButton", "", "enableTransferButton", "navigate", TransactionRequest.TYPE_REQUEST, "Lai/kudi/agent/users/domain/dto/WithdrawToBankRequest;", "navigateToPerformWithdrawal", "onBackNavClicked", "onChooseBankClicked", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onTransferButtonClicked", "showAccountName", "showAccountNameLoading", "showBankOptions", "showInvalidAccountNoError", "msg", "showInvalidAmountError", "showInvalidBankError", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.users.ui.CashoutActivity */
/* loaded from: classes.dex */
public final class CashoutActivity extends MvpActivity<CashoutView, CashoutPresenter, ViewUsersCashoutBinding> implements CashoutView {
    private String accountName;
    public CashoutFeesDialog feesDialog;
    private Bank selectedBank;
    public CashoutPresenter thisPresenter;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void navigate(WithdrawToBankRequest withdrawToBankRequest) {
        Context r4 = (Context) this;
        Intent r3 = new Intent(r4, PerformPaymentActivity.class);
        r3.putExtra(WithdrawToBankRequest.PARCEL_NAME, withdrawToBankRequest);
        Activity r5 = (Activity) this;
        r5.startActivity(r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void onBackNavClicked() {
        ComponentActivity r1 = (ComponentActivity) this;
        r1.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreate$lambda-0  reason: not valid java name */
    public static final void m41472onCreate$lambda0(CashoutActivity cashoutActivity, View view) {
        Log_OC.getArray(cashoutActivity, "this$0");
        cashoutActivity.onChooseBankClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreate$lambda-1  reason: not valid java name */
    public static final void m41473onCreate$lambda1(CashoutActivity cashoutActivity, View view) {
        Log_OC.getArray(cashoutActivity, "this$0");
        cashoutActivity.onTransferButtonClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: showBankOptions$lambda-3  reason: not valid java name */
    public static final void m41474showBankOptions$lambda3(CashoutActivity cashoutActivity, List list, DialogInterface dialogInterface, int i) {
        String $r9;
        Log_OC.getArray(cashoutActivity, "this$0");
        Log_OC.getArray(list, "$listOfBanks");
        Object $r3 = list.get(i);
        cashoutActivity.setSelectedBank((Bank) $r3);
        InterfaceC8209a $r5 = cashoutActivity.getBinding();
        ViewUsersCashoutBinding $r6 = (ViewUsersCashoutBinding) $r5;
        EditText $r7 = $r6.chooseBankEditText;
        Bank $r4 = cashoutActivity.getSelectedBank();
        String $r8 = "";
        if ($r4 != null && ($r9 = $r4.getName()) != null) {
            $r8 = $r9;
        }
        $r7.setText($r8);
        CashoutPresenter $r11 = (CashoutPresenter) cashoutActivity.getPresenter();
        InterfaceC8209a $r52 = cashoutActivity.getBinding();
        ViewUsersCashoutBinding $r62 = (ViewUsersCashoutBinding) $r52;
        EditText $r72 = $r62.accountNoEditText;
        Editable $r12 = $r72.getText();
        $r11.performLookup($r12.toString(), cashoutActivity.getSelectedBank());
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9409a, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public CashoutPresenter createPresenter() {
        CashoutPresenter $r1 = getThisPresenter();
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
    @Override // ai.kudi.agent.users.views.CashoutView
    public void disableTransferButton() {
        InterfaceC8209a $r1 = getBinding();
        ViewUsersCashoutBinding $r2 = (ViewUsersCashoutBinding) $r1;
        Button $r3 = $r2.transferToBankButton;
        $r3.setEnabled(false);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.users.views.CashoutView
    public void enableTransferButton() {
        InterfaceC8209a $r1 = getBinding();
        ViewUsersCashoutBinding $r2 = (ViewUsersCashoutBinding) $r1;
        Button $r3 = $r2.transferToBankButton;
        $r3.setEnabled(true);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getAccountName() {
        String r1 = this.accountName;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity
    public ViewUsersCashoutBinding getActivityBinding() {
        Activity r3 = (Activity) this;
        LayoutInflater $r1 = r3.getLayoutInflater();
        ViewUsersCashoutBinding $r2 = ViewUsersCashoutBinding.inflate($r1);
        Log_OC.loadImage($r2, "inflate(layoutInflater)");
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity
    public /* bridge */ /* synthetic */ InterfaceC8209a getActivityBinding() {
        ViewUsersCashoutBinding $r1 = getActivityBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final CashoutFeesDialog getFeesDialog() {
        CashoutFeesDialog $r1 = this.feesDialog;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("feesDialog");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Bank getSelectedBank() {
        Bank r1 = this.selectedBank;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final CashoutPresenter getThisPresenter() {
        CashoutPresenter $r1 = this.thisPresenter;
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
    @Override // ai.kudi.agent.users.views.CashoutView
    public void navigateToPerformWithdrawal(WithdrawToBankRequest withdrawToBankRequest) {
        Log_OC.getArray(withdrawToBankRequest, TransactionRequest.TYPE_REQUEST);
        CashoutFeesDialog $r2 = getFeesDialog();
        FragmentActivity r9 = (FragmentActivity) this;
        FragmentManager $r3 = r9.getSupportFragmentManager();
        Log_OC.loadImage($r3, "supportFragmentManager");
        int $i0 = withdrawToBankRequest.getAmount();
        String $r4 = String.valueOf($i0);
        $r2.show($r3, $r4);
        CashoutFeesDialog $r22 = getFeesDialog();
        CashoutActivity$navigateToPerformWithdrawal$1 r7 = new CashoutActivity$navigateToPerformWithdrawal$1(this);
        $r22.setOnErrorListener(r7);
        CashoutFeesDialog $r23 = getFeesDialog();
        CashoutActivity$navigateToPerformWithdrawal$2 r8 = new CashoutActivity$navigateToPerformWithdrawal$2(this, withdrawToBankRequest);
        $r23.setOnProceedClicked(r8);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onChooseBankClicked() {
        CashoutPresenter $r2 = (CashoutPresenter) getPresenter();
        $r2.chooseBankClicked();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity, p272h.p364d.p365a.p366c.AbstractC9409a
    public void onCreate(Bundle bundle) {
        Activity r19 = (Activity) this;
        Application $r2 = r19.getApplication();
        if ($r2 == null) {
            NullPointerException r18 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.BaseApplication");
            throw r18;
        }
        BaseApplication $r3 = (BaseApplication) $r2;
        ApplicationComponent $r4 = $r3.initializeComponent();
        $r4.inject(this);
        super.onCreate(bundle);
        disableLogoutTimer();
        AppCompatActivity r20 = (AppCompatActivity) this;
        AbstractC0925a $r5 = r20.getSupportActionBar();
        if ($r5 != null) {
            Activity r192 = (Activity) this;
            String $r6 = r192.getString(C0001R.string.withdraw);
            $r5.mo37631C($r6);
        }
        AppCompatActivity r202 = (AppCompatActivity) this;
        AbstractC0925a $r52 = r202.getSupportActionBar();
        if ($r52 != null) {
            $r52.mo37602u(true);
        }
        InterfaceC8209a $r7 = getBinding();
        ViewUsersCashoutBinding $r8 = (ViewUsersCashoutBinding) $r7;
        Button $r9 = $r8.transferToBankButton;
        $r9.setEnabled(true);
        InterfaceC8209a $r72 = getBinding();
        ViewUsersCashoutBinding $r82 = (ViewUsersCashoutBinding) $r72;
        EditText $r10 = $r82.accountNoEditText;
        $r10.addTextChangedListener(new TextWatcher() { // from class: ai.kudi.agent.users.ui.CashoutActivity$onCreate$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                Log_OC.getArray(charSequence, AttributeType.TEXT);
                int $i2 = charSequence.length();
                if ($i2 != 10) {
                    CashoutActivity $r22 = CashoutActivity.this;
                    InterfaceC8209a $r32 = $r22.getBinding();
                    ViewUsersCashoutBinding $r42 = (ViewUsersCashoutBinding) $r32;
                    RelativeLayout $r53 = $r42.chooseBankLayout;
                    $r53.setVisibility(8);
                    return;
                }
                CashoutActivity $r23 = CashoutActivity.this;
                InterfaceC8209a $r33 = $r23.getBinding();
                ViewUsersCashoutBinding $r43 = (ViewUsersCashoutBinding) $r33;
                EditText $r62 = $r43.chooseBankEditText;
                $r62.setText("");
                CashoutActivity $r24 = CashoutActivity.this;
                InterfaceC8209a $r34 = $r24.getBinding();
                ViewUsersCashoutBinding $r44 = (ViewUsersCashoutBinding) $r34;
                RelativeLayout $r54 = $r44.chooseBankLayout;
                $r54.setVisibility(0);
            }
        });
        InterfaceC8209a $r73 = getBinding();
        ViewUsersCashoutBinding $r83 = (ViewUsersCashoutBinding) $r73;
        EditText $r102 = $r83.chooseBankEditText;
        $r102.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.users.ui.EditActivity$4
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CashoutActivity $r22 = CashoutActivity.this;
                CashoutActivity.m41472onCreate$lambda0($r22, view);
            }
        });
        InterfaceC8209a $r74 = getBinding();
        ViewUsersCashoutBinding $r84 = (ViewUsersCashoutBinding) $r74;
        Button $r92 = $r84.transferToBankButton;
        $r92.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.users.ui.d
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CashoutActivity $r22 = CashoutActivity.this;
                CashoutActivity.m41473onCreate$lambda1($r22, view);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Log_OC.getArray(menuItem, "item");
        int $i0 = menuItem.getItemId();
        if ($i0 == 16908332) {
            onBackNavClicked();
        }
        boolean $z0 = super.onOptionsItemSelected(menuItem);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onTransferButtonClicked() {
        CashoutPresenter $r4 = (CashoutPresenter) getPresenter();
        InterfaceC8209a $r5 = getBinding();
        ViewUsersCashoutBinding $r6 = (ViewUsersCashoutBinding) $r5;
        EditText $r7 = $r6.amountEditText;
        Editable $r8 = $r7.getText();
        String $r9 = $r8.toString();
        InterfaceC8209a $r52 = getBinding();
        ViewUsersCashoutBinding $r62 = (ViewUsersCashoutBinding) $r52;
        EditText $r72 = $r62.accountNoEditText;
        Editable $r82 = $r72.getText();
        String $r10 = $r82.toString();
        Bank $r1 = this.selectedBank;
        String $r2 = this.accountName;
        $r4.performTransfer($r9, $r10, $r1, $r2);
    }

    public final void setAccountName(String str) {
        this.accountName = str;
    }

    public final void setFeesDialog(CashoutFeesDialog cashoutFeesDialog) {
        Log_OC.getArray(cashoutFeesDialog, "<set-?>");
        this.feesDialog = cashoutFeesDialog;
    }

    public final void setSelectedBank(Bank bank) {
        this.selectedBank = bank;
    }

    public final void setThisPresenter(CashoutPresenter cashoutPresenter) {
        Log_OC.getArray(cashoutPresenter, "<set-?>");
        this.thisPresenter = cashoutPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.users.views.CashoutView
    public void showAccountName(String str) {
        boolean $z0;
        Log_OC.getArray(str, BanksWithMethods.ACCOUNT_NAME);
        InterfaceC8209a $r2 = getBinding();
        ViewUsersCashoutBinding $r3 = (ViewUsersCashoutBinding) $r2;
        ProgressBar $r4 = $r3.accountNameProgressBar;
        $r4.setVisibility(8);
        InterfaceC8209a $r22 = getBinding();
        ViewUsersCashoutBinding $r32 = (ViewUsersCashoutBinding) $r22;
        TextView $r5 = $r32.accountNameTextView;
        $r5.setText(str);
        $z0 = C13276s.m5440u(str);
        if (!$z0) {
            InterfaceC8209a $r23 = getBinding();
            ViewUsersCashoutBinding $r33 = (ViewUsersCashoutBinding) $r23;
            TextView $r52 = $r33.accountNameTextView;
            $r52.setVisibility(0);
            this.accountName = str;
            InterfaceC8209a $r24 = getBinding();
            ViewUsersCashoutBinding $r34 = (ViewUsersCashoutBinding) $r24;
            Button $r7 = $r34.transferToBankButton;
            $r7.setEnabled(true);
            return;
        }
        InterfaceC8209a $r25 = getBinding();
        ViewUsersCashoutBinding $r35 = (ViewUsersCashoutBinding) $r25;
        TextView $r53 = $r35.accountNameTextView;
        $r53.setVisibility(8);
        InterfaceC8209a $r26 = getBinding();
        ViewUsersCashoutBinding $r36 = (ViewUsersCashoutBinding) $r26;
        EditText $r6 = $r36.chooseBankEditText;
        $r6.setText("");
        this.accountName = null;
        InterfaceC8209a $r27 = getBinding();
        ViewUsersCashoutBinding $r37 = (ViewUsersCashoutBinding) $r27;
        Button $r72 = $r37.transferToBankButton;
        $r72.setEnabled(false);
        Context r8 = (Context) this;
        ContextExtKt.toast$default(r8, "Account name could not be resolved. Try again.", 0, 2, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.users.views.CashoutView
    public void showAccountNameLoading() {
        InterfaceC8209a $r1 = getBinding();
        ViewUsersCashoutBinding $r2 = (ViewUsersCashoutBinding) $r1;
        ProgressBar $r3 = $r2.accountNameProgressBar;
        $r3.setVisibility(0);
        InterfaceC8209a $r12 = getBinding();
        ViewUsersCashoutBinding $r22 = (ViewUsersCashoutBinding) $r12;
        TextView $r4 = $r22.accountNameTextView;
        $r4.setVisibility(8);
        InterfaceC8209a $r13 = getBinding();
        ViewUsersCashoutBinding $r23 = (ViewUsersCashoutBinding) $r13;
        Button $r5 = $r23.transferToBankButton;
        $r5.setEnabled(false);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0028 */
    @Override // ai.kudi.agent.users.views.CashoutView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void showBankOptions() {
        /*
            r25 = this;
            ai.kudi.agent.core.domain.room_entities.Bank$BanksList r2 = new ai.kudi.agent.core.domain.room_entities.Bank$BanksList
            r2.<init>()
            java.util.List r3 = r2.getListOfBanks()
            androidx.appcompat.app.d$a r4 = new androidx.appcompat.app.d$a
            r5 = r4
            r7 = r25
            android.content.Context r7 = (android.content.Context) r7
            r6 = r7
            r4.<init>(r6)
            java.util.ArrayList r8 = new java.util.ArrayList
            r9 = r8
            r11 = 10
            int r10 = kotlin.p557z.C13722p.m3921o(r3, r11)
            r8.<init>(r10)
            java.util.Iterator r12 = r3.iterator()
        L24:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L3e
            java.lang.Object r14 = r12.next()
            r16 = r14
            ai.kudi.agent.core.domain.room_entities.Bank r16 = (ai.kudi.agent.core.domain.room_entities.Bank) r16
            r15 = r16
            java.lang.String r17 = r15.getName()
            r0 = r17
            r9.add(r0)
            goto L24
        L3e:
            r11 = 0
            java.lang.String[] r0 = new java.lang.String[r11]
            r18 = r0
            java.lang.Object[] r19 = r9.toArray(r0)
            if (r19 == 0) goto L64
            r21 = r19
            java.lang.CharSequence[] r21 = (java.lang.CharSequence[]) r21
            r20 = r21
            ai.kudi.agent.users.ui.g r22 = new ai.kudi.agent.users.ui.g
            r0 = r22
            r1 = r25
            r0.<init>()
            r0 = r20
            r1 = r22
            androidx.appcompat.app.d$a r5 = r5.setItems(r0, r1)
            r5.show()
            return
        L64:
            java.lang.NullPointerException r23 = new java.lang.NullPointerException
            java.lang.String r24 = "null cannot be cast to non-null type kotlin.Array<T>"
            r0 = r23
            r1 = r24
            r0.<init>(r1)
            goto L70
        L70:
            throw r23
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.users.p035ui.CashoutActivity.showBankOptions():void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.users.views.CashoutView
    public void showInvalidAccountNoError(String str) {
        Log_OC.getArray(str, "msg");
        InterfaceC8209a $r2 = getBinding();
        ViewUsersCashoutBinding $r3 = (ViewUsersCashoutBinding) $r2;
        EditText $r4 = $r3.accountNoEditText;
        $r4.setError(str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.users.views.CashoutView
    public void showInvalidAmountError(String str) {
        Log_OC.getArray(str, "msg");
        InterfaceC8209a $r2 = getBinding();
        ViewUsersCashoutBinding $r3 = (ViewUsersCashoutBinding) $r2;
        EditText $r4 = $r3.amountEditText;
        $r4.setError(str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.users.views.CashoutView
    public void showInvalidBankError(String str) {
        Log_OC.getArray(str, "msg");
        InterfaceC8209a $r2 = getBinding();
        ViewUsersCashoutBinding $r3 = (ViewUsersCashoutBinding) $r2;
        EditText $r4 = $r3.chooseBankEditText;
        $r4.setError(str);
    }
}
