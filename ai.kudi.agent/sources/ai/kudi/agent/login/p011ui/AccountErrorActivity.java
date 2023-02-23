package ai.kudi.agent.login.p011ui;

import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.databinding.ActivityAccountErrorBinding;
import ai.kudi.agent.databinding.BottomCreateAcctViewBinding;
import ai.kudi.agent.login.domain.model.AccountErrorType;
import ai.kudi.agent.register.p022v2.p023ui.RegisterActivity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: AccountErrorActivity.kt */
@Metadata(m10422d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u0016\u0010\r\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J\b\u0010\u0011\u001a\u00020\nH\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m10421d2 = {"Lai/kudi/agent/login/ui/AccountErrorActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lai/kudi/agent/databinding/ActivityAccountErrorBinding;", "getBinding", "()Lai/kudi/agent/databinding/ActivityAccountErrorBinding;", "setBinding", "(Lai/kudi/agent/databinding/ActivityAccountErrorBinding;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "renderReasons", "reasons", "", "", "setupListeners", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.login.ui.AccountErrorActivity */
/* loaded from: classes.dex */
public final class AccountErrorActivity extends AppCompatActivity {
    private static final String BUNDLE_KEY_ACCOUNT_ERROR = "BUNDLE_KEY_ACCOUNT_ERROR";
    public static final Companion Companion;
    public ActivityAccountErrorBinding binding;

    /* compiled from: AccountErrorActivity.kt */
    @Metadata(m10422d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/login/ui/AccountErrorActivity$Companion;", "", "()V", AccountErrorActivity.BUNDLE_KEY_ACCOUNT_ERROR, "", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "accountErrorType", "Lai/kudi/agent/login/domain/model/AccountErrorType;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.login.ui.AccountErrorActivity$Companion */
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
        public final Intent getIntent(Context context, AccountErrorType accountErrorType) {
            Log_OC.getArray(accountErrorType, "accountErrorType");
            Intent $r3 = new Intent(context, AccountErrorActivity.class);
            $r3.putExtra(AccountErrorActivity.BUNDLE_KEY_ACCOUNT_ERROR, accountErrorType);
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

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x000a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void renderReasons(java.util.List r17) {
        /*
            r16 = this;
            r0 = r17
            java.util.Iterator r1 = r0.iterator()
        L6:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L55
            java.lang.Object r3 = r1.next()
            r5 = r3
            java.lang.String r5 = (java.lang.String) r5
            r4 = r5
            android.widget.TextView r6 = new android.widget.TextView
            r0 = r16
            r6.<init>(r0)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r8 = -1
            r9 = -2
            r7.<init>(r8, r9)
            r6.setLayoutParams(r7)
            android.content.res.Resources r10 = r6.getResources()
            r8 = 2131165768(0x7f070248, float:1.7945762E38)
            float r11 = r10.getDimension(r8)
            r8 = 0
            r6.setTextSize(r8, r11)
            android.content.res.Resources r10 = r6.getResources()
            r8 = 2131165360(0x7f0700b0, float:1.7944935E38)
            float r11 = r10.getDimension(r8)
            int r12 = (int) r11
            r8 = 0
            r9 = 0
            r13 = 0
            r6.setPadding(r8, r12, r9, r13)
            r6.setText(r4)
            r0 = r16
            ai.kudi.agent.databinding.ActivityAccountErrorBinding r14 = r0.getBinding()
            android.widget.LinearLayout r15 = r14.reasonsContainer
            r15.addView(r6)
            goto L6
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.login.p011ui.AccountErrorActivity.renderReasons(java.util.List):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setupListeners() {
        ActivityAccountErrorBinding $r1 = getBinding();
        ViewGroup $r2 = $r1.callSupportButton;
        ViewGroup r9 = $r2;
        r9.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.login.ui.d
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AccountErrorActivity $r22 = AccountErrorActivity.this;
                AccountErrorActivity.m39787setupListeners$lambda1($r22, view);
            }
        });
        ActivityAccountErrorBinding $r12 = getBinding();
        BottomCreateAcctViewBinding $r4 = $r12.createAccountView;
        TextView $r5 = $r4.createAcctTextView;
        TextView r10 = $r5;
        r10.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.login.ui.CardView$4
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AccountErrorActivity $r22 = AccountErrorActivity.this;
                AccountErrorActivity.m39788setupListeners$lambda2($r22, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupListeners$lambda-1  reason: not valid java name */
    public static final void m39787setupListeners$lambda1(AccountErrorActivity accountErrorActivity, View view) {
        Log_OC.getArray(accountErrorActivity, "this$0");
        AppCompatActivityExtKt.callSupport(accountErrorActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setupListeners$lambda-2  reason: not valid java name */
    public static final void m39788setupListeners$lambda2(AccountErrorActivity accountErrorActivity, View view) {
        Log_OC.getArray(accountErrorActivity, "this$0");
        AccountErrorActivity$setupListeners$2$1 $r1 = AccountErrorActivity$setupListeners$2$1.INSTANCE;
        ContextExtKt.launchActivity$default((Context) accountErrorActivity, false, RegisterActivity.class, (InterfaceC11767l) $r1, 1, (Object) null);
        accountErrorActivity.finish();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ActivityAccountErrorBinding getBinding() {
        ActivityAccountErrorBinding $r1 = this.binding;
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
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.BaseListFragment, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LayoutInflater $r2 = getLayoutInflater();
        ActivityAccountErrorBinding $r3 = ActivityAccountErrorBinding.inflate($r2);
        Log_OC.loadImage($r3, "inflate(layoutInflater)");
        setBinding($r3);
        View $r4 = getBinding().getRoot();
        View r12 = $r4;
        setContentView(r12);
        Intent $r5 = getIntent();
        Parcelable $r6 = $r5.getParcelableExtra(BUNDLE_KEY_ACCOUNT_ERROR);
        AccountErrorType $r7 = (AccountErrorType) $r6;
        if ($r7 != null) {
            TextView $r8 = getBinding().titleView;
            Resources $r9 = getResources();
            Log_OC.loadImage($r9, "resources");
            String $r10 = $r7.title($r9);
            $r8.setText($r10);
            TextView $r82 = getBinding().descriptionView;
            Resources $r92 = getResources();
            Log_OC.loadImage($r92, "resources");
            String $r102 = $r7.description($r92);
            $r82.setText($r102);
            TextView $r83 = getBinding().tipView;
            Resources $r93 = getResources();
            Log_OC.loadImage($r93, "resources");
            String $r103 = $r7.getLocalizedName($r93);
            $r83.setText($r103);
            Resources $r94 = getResources();
            Log_OC.loadImage($r94, "resources");
            List $r11 = $r7.reasons($r94);
            renderReasons($r11);
        }
        setupListeners();
    }

    public final void setBinding(ActivityAccountErrorBinding activityAccountErrorBinding) {
        Log_OC.getArray(activityAccountErrorBinding, "<set-?>");
        this.binding = activityAccountErrorBinding;
    }
}
