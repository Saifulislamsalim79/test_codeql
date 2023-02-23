package ai.kudi.agent.transactionhistory.p031ui.view;

import ai.kudi.agent.BaseApplication;
import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.internal.components.ApplicationComponent;
import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.databinding.ActivityIncompleteTransactionsBinding;
import ai.kudi.agent.transactionhistory.data.model.TransactionHistoryScope;
import ai.kudi.agent.transactionhistory.data.model.TransactionItemUiModel;
import ai.kudi.agent.transactionhistory.data.model.TransactionItemUiModelKt;
import ai.kudi.agent.transactionhistory.labs.IncompleteTransactionsSubComponent;
import ai.kudi.agent.transactionhistory.navigator.PendingTransactionsNavigator;
import ai.kudi.agent.transactionhistory.p031ui.view.PendingFraudCheckTransactionsFragment;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: IncompleteTransactionsActivity.kt */
@Metadata(m10422d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0012\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0011H\u0002R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m10421d2 = {"Lai/kudi/agent/transactionhistory/ui/view/IncompleteTransactionsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lai/kudi/agent/transactionhistory/navigator/PendingTransactionsNavigator;", "()V", "binding", "Lai/kudi/agent/databinding/ActivityIncompleteTransactionsBinding;", "getBinding", "()Lai/kudi/agent/databinding/ActivityIncompleteTransactionsBinding;", "setBinding", "(Lai/kudi/agent/databinding/ActivityIncompleteTransactionsBinding;)V", "subComponent", "Lai/kudi/agent/transactionhistory/di/IncompleteTransactionsSubComponent;", "getSubComponent", "()Lai/kudi/agent/transactionhistory/di/IncompleteTransactionsSubComponent;", "setSubComponent", "(Lai/kudi/agent/transactionhistory/di/IncompleteTransactionsSubComponent;)V", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPendingTransactionDetails", "transaction", "Lai/kudi/agent/transactionhistory/data/model/TransactionItemUiModel$Transaction;", "setupPager", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.transactionhistory.ui.view.IncompleteTransactionsActivity */
/* loaded from: classes.dex */
public final class IncompleteTransactionsActivity extends AppCompatActivity implements PendingTransactionsNavigator {
    public static final Companion Companion;
    private ActivityIncompleteTransactionsBinding binding;
    public IncompleteTransactionsSubComponent subComponent;

    /* compiled from: IncompleteTransactionsActivity.kt */
    @Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/transactionhistory/ui/view/IncompleteTransactionsActivity$Companion;", "", "()V", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "transactionHistoryScope", "Lai/kudi/agent/transactionhistory/data/model/TransactionHistoryScope;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.transactionhistory.ui.view.IncompleteTransactionsActivity$Companion */
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
        public final Intent getIntent(Context context, TransactionHistoryScope transactionHistoryScope) {
            Log_OC.getArray(transactionHistoryScope, "transactionHistoryScope");
            Intent $r3 = new Intent(context, IncompleteTransactionsActivity.class);
            $r3.putExtra(TransactionsContainerFragment.BUNDLE_KEY_HISTORY_SCOPE, transactionHistoryScope);
            return $r3;
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
    /* renamed from: onCreate$lambda-0  reason: not valid java name */
    public static final void m41075onCreate$lambda0(IncompleteTransactionsActivity incompleteTransactionsActivity, View view) {
        Log_OC.getArray(incompleteTransactionsActivity, "this$0");
        incompleteTransactionsActivity.onBackPressed();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setupPager() {
        View $r3;
        ActivityIncompleteTransactionsBinding $r1 = this.binding;
        if ($r1 != null && ($r3 = $r1.tabLayout) != null) {
            View r8 = $r3;
            ViewExtKt.hide$default(r8, false, 1, null);
        }
        Intent $r4 = getIntent();
        Parcelable $r5 = $r4.getParcelableExtra(TransactionsContainerFragment.BUNDLE_KEY_HISTORY_SCOPE);
        boolean $z0 = $r5 instanceof TransactionHistoryScope;
        TransactionHistoryScope $r2 = $z0 ? (TransactionHistoryScope) $r5 : null;
        PendingFraudCheckTransactionsFragment.Companion $r6 = PendingFraudCheckTransactionsFragment.Companion;
        PendingFraudCheckTransactionsFragment $r7 = $r6.newInstance($r2);
        AppCompatActivityExtKt.startFragment$default(this, $r7, C0001R.C0003id.frame, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ActivityIncompleteTransactionsBinding getBinding() {
        ActivityIncompleteTransactionsBinding r1 = this.binding;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final IncompleteTransactionsSubComponent getSubComponent() {
        IncompleteTransactionsSubComponent $r1 = this.subComponent;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("subComponent");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        FragmentManager $r1 = getSupportFragmentManager();
        int $i0 = $r1.m35920m0();
        if ($i0 <= 1) {
            finish();
        } else {
            super.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.BaseListFragment, android.app.Activity
    public void onCreate(Bundle bundle) {
        ImageButton $r10;
        Application $r2 = getApplication();
        if ($r2 == null) {
            NullPointerException r14 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.BaseApplication");
            throw r14;
        }
        BaseApplication $r3 = (BaseApplication) $r2;
        ApplicationComponent $r4 = $r3.getApplicationComponent();
        IncompleteTransactionsSubComponent.Factory $r5 = $r4.incompleteTransactionsSubComponent();
        IncompleteTransactionsSubComponent $r6 = $r5.create(this);
        setSubComponent($r6);
        super.onCreate(bundle);
        LayoutInflater $r7 = getLayoutInflater();
        ActivityIncompleteTransactionsBinding $r9 = ActivityIncompleteTransactionsBinding.inflate($r7, null, false);
        this.binding = $r9;
        LinearLayout $r8 = $r9 != null ? $r9.getRoot() : null;
        setContentView($r8);
        setupPager();
        ActivityIncompleteTransactionsBinding $r92 = this.binding;
        if ($r92 == null || ($r10 = $r92.backButton) == null) {
            return;
        }
        ImageButton r15 = $r10;
        r15.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transactionhistory.ui.view.h
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IncompleteTransactionsActivity $r22 = IncompleteTransactionsActivity.this;
                IncompleteTransactionsActivity.m41075onCreate$lambda0($r22, view);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactionhistory.navigator.PendingTransactionsNavigator
    public void onPendingTransactionDetails(TransactionItemUiModel.Transaction transaction) {
        Log_OC.getArray(transaction, "transaction");
        Intent $r1 = TransactionItemUiModelKt.detailsScreenIntent(transaction, this);
        startActivity($r1);
    }

    public final void setBinding(ActivityIncompleteTransactionsBinding activityIncompleteTransactionsBinding) {
        this.binding = activityIncompleteTransactionsBinding;
    }

    public final void setSubComponent(IncompleteTransactionsSubComponent incompleteTransactionsSubComponent) {
        Log_OC.getArray(incompleteTransactionsSubComponent, "<set-?>");
        this.subComponent = incompleteTransactionsSubComponent;
    }
}
