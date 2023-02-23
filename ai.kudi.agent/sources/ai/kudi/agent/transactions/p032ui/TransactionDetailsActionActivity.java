package ai.kudi.agent.transactions.p032ui;

import ai.kudi.agent.BaseApplication;
import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.internal.components.ApplicationComponent;
import ai.kudi.agent.core.mvp.MvpActivity;
import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.databinding.ActivityTransactionDetailsActionBinding;
import ai.kudi.agent.transactions.navigators.DetailsActionNavigator;
import ai.kudi.agent.transactions.p032ui.CreateCustomerFragment;
import ai.kudi.agent.transactions.p032ui.TransactionIssueFragment;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.transactions.presenters.PendingVerificationPresenter;
import ai.kudi.agent.transactions.views.PendingVerificationView;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
/* compiled from: TransactionDetailsActionActivity.kt */
@Metadata(m10422d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 ,2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00022\u00020\u0005:\u0001,B\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u001c\u001a\u00020\u0003H\u0016J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\bH\u0016J\u001a\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\bH\u0016J$\u0010$\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010\b2\b\u0010&\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010'\u001a\u00020\u001eH\u0016J\u0012\u0010(\u001a\u00020\u001e2\b\u0010)\u001a\u0004\u0018\u00010*H\u0014J\b\u0010+\u001a\u00020\"H\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R*\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0016j\u0002`\u0017X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006-"}, m10421d2 = {"Lai/kudi/agent/transactions/ui/TransactionDetailsActionActivity;", "Lai/kudi/agent/core/mvp/MvpActivity;", "Lai/kudi/agent/transactions/views/PendingVerificationView;", "Lai/kudi/agent/transactions/presenters/PendingVerificationPresenter;", "Lai/kudi/agent/databinding/ActivityTransactionDetailsActionBinding;", "Lai/kudi/agent/transactions/navigators/DetailsActionNavigator;", "()V", "actionMode", "", "getActionMode", "()Ljava/lang/String;", "setActionMode", "(Ljava/lang/String;)V", "activityBinding", "getActivityBinding", "()Lai/kudi/agent/databinding/ActivityTransactionDetailsActionBinding;", "thisPresenter", "getThisPresenter", "()Lai/kudi/agent/transactions/presenters/PendingVerificationPresenter;", "setThisPresenter", "(Lai/kudi/agent/transactions/presenters/PendingVerificationPresenter;)V", "transaction", "Ljava/util/HashMap;", "Lai/kudi/agent/transactions/domain/dto/Transaction;", "getTransaction", "()Ljava/util/HashMap;", "setTransaction", "(Ljava/util/HashMap;)V", "createPresenter", "navigateToCustomerCreationPage", "", "transactionRef", "navigateToStatusPage", "isANewCustomer", "", "customerName", "navigateToSupportPage", TransactionField.AMOUNT, "type", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onSupportNavigateUp", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.transactions.ui.TransactionDetailsActionActivity */
/* loaded from: classes.dex */
public final class TransactionDetailsActionActivity extends MvpActivity<PendingVerificationView, PendingVerificationPresenter, ActivityTransactionDetailsActionBinding> implements PendingVerificationView, DetailsActionNavigator {
    public static final String ACTION_MODE_CUSTOMER = "add_customer";
    public static final String ACTION_MODE_ISSUES = "submit_issues";
    public static final Companion Companion;
    public static final String EXTRA_ACTION_MODE = "action_mode";
    public static final String EXTRA_TRANSACTION = "extra_transaction";
    public static final String EXTRA_TRANSACTION_REF = "extra_trx_ref";
    public String actionMode;
    public PendingVerificationPresenter thisPresenter;
    public HashMap<String, String> transaction;

    /* compiled from: TransactionDetailsActionActivity.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/transactions/ui/TransactionDetailsActionActivity$Companion;", "", "()V", "ACTION_MODE_CUSTOMER", "", "ACTION_MODE_ISSUES", "EXTRA_ACTION_MODE", "EXTRA_TRANSACTION", "EXTRA_TRANSACTION_REF", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.transactions.ui.TransactionDetailsActionActivity$Companion */
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

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9409a, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public PendingVerificationPresenter createPresenter() {
        PendingVerificationPresenter $r1 = getThisPresenter();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9409a, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public /* bridge */ /* synthetic */ InterfaceC9413d createPresenter() {
        PendingVerificationPresenter $r1 = createPresenter();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getActionMode() {
        String $r1 = this.actionMode;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("actionMode");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity
    public ActivityTransactionDetailsActionBinding getActivityBinding() {
        Activity r3 = (Activity) this;
        LayoutInflater $r1 = r3.getLayoutInflater();
        ActivityTransactionDetailsActionBinding $r2 = ActivityTransactionDetailsActionBinding.inflate($r1);
        Log_OC.loadImage($r2, "inflate(layoutInflater)");
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity
    public /* bridge */ /* synthetic */ InterfaceC8209a getActivityBinding() {
        ActivityTransactionDetailsActionBinding $r1 = getActivityBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final PendingVerificationPresenter getThisPresenter() {
        PendingVerificationPresenter $r1 = this.thisPresenter;
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
    public final HashMap getTransaction() {
        HashMap $r1 = this.transaction;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("transaction");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactions.navigators.DetailsActionNavigator
    public void navigateToCustomerCreationPage(String str) {
        Log_OC.getArray(str, "transactionRef");
        setTitle("Add Customer");
        CreateCustomerFragment.Companion $r3 = CreateCustomerFragment.Companion;
        Fragment $r2 = $r3.newInstance(str);
        AppCompatActivity r4 = (AppCompatActivity) this;
        Fragment r5 = $r2;
        AppCompatActivityExtKt.startFragment$default(r4, r5, C0001R.C0003id.containerFrameLayout, false, false, false, 12, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactions.navigators.DetailsActionNavigator
    public void navigateToStatusPage(boolean z, String str) {
        Activity r5 = (Activity) this;
        r5.finish();
        Context r6 = (Context) this;
        Intent r4 = new Intent(r6, CustomerCreationStatusActivity.class);
        r4.putExtra("extra_customer_name", str);
        r4.putExtra(CustomerCreationStatusActivity.EXTRA_IS_A_NEW_CUSTOMER, z);
        C13666w c13666w = C13666w.f30112a;
        Activity r52 = (Activity) this;
        r52.startActivity(r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactions.navigators.DetailsActionNavigator
    public void navigateToSupportPage(String str, String str2, String str3) {
        Log_OC.getArray(str, "transactionRef");
        setTitle("Issue Resolution");
        TransactionIssueFragment.Companion $r4 = TransactionIssueFragment.Companion;
        HashMap $r5 = getTransaction();
        Fragment $r6 = $r4.newInstance($r5);
        AppCompatActivity r7 = (AppCompatActivity) this;
        Fragment r8 = $r6;
        AppCompatActivityExtKt.startFragment$default(r7, r8, C0001R.C0003id.containerFrameLayout, false, false, false, 12, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onBackPressed() {
        FragmentActivity r2 = (FragmentActivity) this;
        FragmentManager $r1 = r2.getSupportFragmentManager();
        int $i0 = $r1.m35920m0();
        if ($i0 <= 1) {
            Activity r3 = (Activity) this;
            r3.finish();
            return;
        }
        ComponentActivity r4 = (ComponentActivity) this;
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity, p272h.p364d.p365a.p366c.AbstractC9409a
    public void onCreate(Bundle bundle) {
        Activity r17 = (Activity) this;
        Application $r2 = r17.getApplication();
        if ($r2 == null) {
            NullPointerException r16 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.BaseApplication");
            throw r16;
        }
        BaseApplication $r3 = (BaseApplication) $r2;
        ApplicationComponent $r4 = $r3.initializeComponent();
        $r4.inject(this);
        super.onCreate(bundle);
        InterfaceC8209a $r5 = getBinding();
        ActivityTransactionDetailsActionBinding $r6 = (ActivityTransactionDetailsActionBinding) $r5;
        Toolbar $r7 = $r6.toolbar;
        AppCompatActivity r18 = (AppCompatActivity) this;
        r18.setSupportActionBar($r7);
        Activity r172 = (Activity) this;
        Intent $r8 = r172.getIntent();
        Serializable $r9 = $r8.getSerializableExtra(EXTRA_TRANSACTION);
        if ($r9 == null) {
            NullPointerException r162 = new NullPointerException("null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>{ ai.kudi.agent.transactions.domain.dto.TransactionKt.Transaction }");
            throw r162;
        }
        HashMap $r10 = (HashMap) $r9;
        setTransaction($r10);
        Activity r173 = (Activity) this;
        Intent $r82 = r173.getIntent();
        String $r11 = $r82.getStringExtra(EXTRA_ACTION_MODE);
        String $r12 = $r11;
        if ($r11 == null) {
            $r12 = "";
        }
        setActionMode($r12);
        String $r112 = getActionMode();
        boolean $z0 = Log_OC.append($r112, ACTION_MODE_CUSTOMER);
        if ($z0) {
            HashMap $r102 = getTransaction();
            Object $r13 = $r102.get("reference");
            Log_OC.append($r13);
            Log_OC.loadImage($r13, "transaction[\"reference\"]!!");
            navigateToCustomerCreationPage((String) $r13);
            return;
        }
        boolean $z02 = Log_OC.append($r112, ACTION_MODE_ISSUES);
        if ($z02) {
            HashMap $r103 = getTransaction();
            Object $r132 = $r103.get("reference");
            Log_OC.append($r132);
            Log_OC.loadImage($r132, "transaction[\"reference\"]!!");
            HashMap $r104 = getTransaction();
            String $r122 = (String) $r104.get(TransactionField.AMOUNT);
            HashMap $r105 = getTransaction();
            String $r14 = (String) $r105.get("type");
            navigateToSupportPage((String) $r132, $r122, $r14);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean onSupportNavigateUp() {
        onBackPressed();
        AppCompatActivity r1 = (AppCompatActivity) this;
        boolean $z0 = super/*androidx.appcompat.app.AppCompatActivity*/.onSupportNavigateUp();
        return $z0;
    }

    public final void setActionMode(String str) {
        Log_OC.getArray(str, "<set-?>");
        this.actionMode = str;
    }

    public final void setThisPresenter(PendingVerificationPresenter pendingVerificationPresenter) {
        Log_OC.getArray(pendingVerificationPresenter, "<set-?>");
        this.thisPresenter = pendingVerificationPresenter;
    }

    public final void setTransaction(HashMap hashMap) {
        Log_OC.getArray(hashMap, "<set-?>");
        this.transaction = hashMap;
    }
}
