package ai.kudi.agent.transactions.p032ui;

import ai.kudi.agent.BaseAppCompactActivity;
import ai.kudi.agent.C0001R;
import ai.kudi.agent.databinding.ActivityCustomerCreationStatusBinding;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: CustomerCreationStatusActivity.kt */
@Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m10421d2 = {"Lai/kudi/agent/transactions/ui/CustomerCreationStatusActivity;", "Lai/kudi/agent/BaseAppCompactActivity;", "()V", "binding", "Lai/kudi/agent/databinding/ActivityCustomerCreationStatusBinding;", "getBinding", "()Lai/kudi/agent/databinding/ActivityCustomerCreationStatusBinding;", "setBinding", "(Lai/kudi/agent/databinding/ActivityCustomerCreationStatusBinding;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.transactions.ui.CustomerCreationStatusActivity */
/* loaded from: classes.dex */
public final class CustomerCreationStatusActivity extends BaseAppCompactActivity {
    public static final Companion Companion;
    public static final String EXTRA_CUSTOMER_NAME = "extra_customer_name";
    public static final String EXTRA_IS_A_NEW_CUSTOMER = "extra_is_a_new_customer";
    public ActivityCustomerCreationStatusBinding binding;

    /* compiled from: CustomerCreationStatusActivity.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/transactions/ui/CustomerCreationStatusActivity$Companion;", "", "()V", "EXTRA_CUSTOMER_NAME", "", "EXTRA_IS_A_NEW_CUSTOMER", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.transactions.ui.CustomerCreationStatusActivity$Companion */
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
    /* renamed from: onCreate$lambda-0  reason: not valid java name */
    public static final void m41217onCreate$lambda0(CustomerCreationStatusActivity customerCreationStatusActivity, View view) {
        Log_OC.getArray(customerCreationStatusActivity, "this$0");
        customerCreationStatusActivity.finish();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ActivityCustomerCreationStatusBinding getBinding() {
        ActivityCustomerCreationStatusBinding $r1 = this.binding;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("binding");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.BaseAppCompactActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.BaseListFragment, android.app.Activity
    public void onCreate(Bundle bundle) {
        String $r6;
        super.onCreate(bundle);
        LayoutInflater $r2 = getLayoutInflater();
        ActivityCustomerCreationStatusBinding $r3 = ActivityCustomerCreationStatusBinding.inflate($r2);
        Log_OC.loadImage($r3, "inflate(layoutInflater)");
        setBinding($r3);
        RelativeLayout $r4 = getBinding().getRoot();
        setContentView($r4);
        Intent $r5 = getIntent();
        boolean $z0 = $r5.hasExtra("extra_customer_name");
        if ($z0) {
            Intent $r52 = getIntent();
            $r6 = $r52.getStringExtra("extra_customer_name");
        } else {
            $r6 = "";
        }
        Intent $r53 = getIntent();
        boolean $z02 = $r53.getBooleanExtra(EXTRA_IS_A_NEW_CUSTOMER, false);
        TextView $r7 = getBinding().textDetails;
        Object[] $r8 = {$r6};
        String $r62 = getString(C0001R.string.transaction_assigned_success_text, $r8);
        $r7.setText($r62);
        TextView $r72 = getBinding().textHeader;
        int $i0 = $z02 ? C0001R.string.customer_created : C0001R.string.transaction_assigned;
        String $r63 = getString($i0);
        $r72.setText($r63);
        ImageView $r9 = getBinding().closeImageView;
        $r9.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transactions.ui.ErrorActivity$3
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CustomerCreationStatusActivity $r22 = CustomerCreationStatusActivity.this;
                CustomerCreationStatusActivity.m41217onCreate$lambda0($r22, view);
            }
        });
    }

    public final void setBinding(ActivityCustomerCreationStatusBinding activityCustomerCreationStatusBinding) {
        Log_OC.getArray(activityCustomerCreationStatusBinding, "<set-?>");
        this.binding = activityCustomerCreationStatusBinding;
    }
}
