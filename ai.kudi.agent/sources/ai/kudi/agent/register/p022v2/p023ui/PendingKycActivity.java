package ai.kudi.agent.register.p022v2.p023ui;

import ai.kudi.agent.BaseApplication;
import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.internal.components.ApplicationComponent;
import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.databinding.ActivityPendingKycBinding;
import ai.kudi.agent.help.p006ui.HelpActivity;
import ai.kudi.agent.login.domain.LoginParams;
import ai.kudi.agent.login.p011ui.LoginActivity;
import ai.kudi.agent.register.domain.wiki.RegistrationInfo;
import ai.kudi.agent.register.domain.wiki.RegistrationStatus;
import ai.kudi.agent.register.navigators.PendingKycNavigator;
import ai.kudi.agent.register.p022v2.p023ui.PendingKycFormFragment;
import ai.kudi.agent.register.xmpp.components.PendingKycSubComponent;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: PendingKycActivity.kt */
@Metadata(m10422d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J@\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0011H\u0016J\b\u0010\u001d\u001a\u00020\u0011H\u0016J\u0012\u0010\u001e\u001a\u00020\u00112\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0014J\b\u0010!\u001a\u00020\u0011H\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\""}, m10421d2 = {"Lai/kudi/agent/register/v2/ui/PendingKycActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lai/kudi/agent/register/navigators/PendingKycNavigator;", "()V", "binding", "Lai/kudi/agent/databinding/ActivityPendingKycBinding;", "getBinding", "()Lai/kudi/agent/databinding/ActivityPendingKycBinding;", "setBinding", "(Lai/kudi/agent/databinding/ActivityPendingKycBinding;)V", "pendingKycSubComponent", "Lai/kudi/agent/register/di/components/PendingKycSubComponent;", "getPendingKycSubComponent", "()Lai/kudi/agent/register/di/components/PendingKycSubComponent;", "setPendingKycSubComponent", "(Lai/kudi/agent/register/di/components/PendingKycSubComponent;)V", "navigateToDashboard", "", "walletBalance", "", "isNewUser", "", "isKCashEnabled", "isC2C", "isOutlet", "isHq", "customerType", "", "navigateToFeedBack", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "openLoginIfNeeded", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.register.v2.ui.PendingKycActivity */
/* loaded from: classes.dex */
public final class PendingKycActivity extends AppCompatActivity implements PendingKycNavigator {
    public ActivityPendingKycBinding binding;
    public PendingKycSubComponent pendingKycSubComponent;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreate$lambda-0  reason: not valid java name */
    public static final void m40456onCreate$lambda0(PendingKycActivity pendingKycActivity, View view) {
        Log_OC.getArray(pendingKycActivity, "this$0");
        pendingKycActivity.openLoginIfNeeded();
        pendingKycActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreate$lambda-1  reason: not valid java name */
    public static final void m40457onCreate$lambda1(PendingKycActivity pendingKycActivity, View view) {
        Log_OC.getArray(pendingKycActivity, "this$0");
        ContextExtKt.launchActivity$default((Context) pendingKycActivity, false, HelpActivity.class, (InterfaceC11767l) null, 5, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void openLoginIfNeeded() {
        Intent $r1 = getIntent();
        boolean $z0 = $r1.hasExtra("isFrom");
        if ($z0) {
            Intent $r12 = getIntent();
            String $r2 = $r12.getStringExtra("isFrom");
            String $r4 = RegisterActivity.class.getCanonicalName();
            boolean $z02 = Log_OC.append($r2, $r4);
            if ($z02) {
                Intent $r13 = new Intent(this, LoginActivity.class);
                startActivity($r13);
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ActivityPendingKycBinding getBinding() {
        ActivityPendingKycBinding $r1 = this.binding;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("binding");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final PendingKycSubComponent getPendingKycSubComponent() {
        PendingKycSubComponent $r1 = this.pendingKycSubComponent;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("pendingKycSubComponent");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.register.navigators.PendingKycNavigator
    public void navigateToDashboard(double d, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str) {
        Log_OC.getArray(str, "customerType");
        LoginParams $r2 = LoginParams.INSTANCE;
        LoginParams.buildLoginIntent$default($r2, this, z, z2, z3, z5, z4, str, false, 128, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.register.navigators.PendingKycNavigator
    public void navigateToFeedBack() {
        PendingKycFeedbackFragment $r1 = new PendingKycFeedbackFragment();
        AppCompatActivityExtKt.startFragment$default(this, $r1, C0001R.C0003id.pendingKycFrame, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        FragmentManager $r1 = getSupportFragmentManager();
        int $i0 = $r1.m35920m0();
        if ($i0 < 1) {
            openLoginIfNeeded();
        }
        super.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.BaseListFragment, android.app.Activity
    public void onCreate(Bundle bundle) {
        Application $r2 = getApplication();
        if ($r2 == null) {
            NullPointerException r24 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.BaseApplication");
            throw r24;
        }
        BaseApplication $r3 = (BaseApplication) $r2;
        ApplicationComponent $r4 = $r3.getApplicationComponent();
        PendingKycSubComponent.Factory $r5 = $r4.pendingKycSubCpomponent();
        PendingKycSubComponent $r6 = $r5.create(this);
        setPendingKycSubComponent($r6);
        PendingKycSubComponent $r62 = getPendingKycSubComponent();
        $r62.inject(this);
        super.onCreate(bundle);
        LayoutInflater $r7 = getLayoutInflater();
        ActivityPendingKycBinding $r8 = ActivityPendingKycBinding.inflate($r7);
        Log_OC.loadImage($r8, "inflate(layoutInflater)");
        setBinding($r8);
        ConstraintLayout $r9 = getBinding().getRoot();
        setContentView($r9);
        Intent $r10 = getIntent();
        RegistrationStatus $r11 = RegistrationStatus.PENDING_KYC_VERIFICATION;
        String $r12 = $r11.name();
        Parcelable $r13 = $r10.getParcelableExtra($r12);
        if ($r13 == null) {
            NullPointerException r242 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.register.domain.dto.RegistrationInfo");
            throw r242;
        }
        RegistrationInfo $r14 = (RegistrationInfo) $r13;
        PendingKycFormFragment.Companion $r15 = PendingKycFormFragment.Companion;
        PendingKycFormFragment $r16 = $r15.newInstance($r14);
        AppCompatActivityExtKt.startFragment$default(this, $r16, C0001R.C0003id.pendingKycFrame, false, false, false, 8, null);
        ImageView $r17 = getBinding().cancelButton;
        $r17.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.register.v2.ui.AddSerie$SeriesSearchAdapter$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PendingKycActivity $r22 = PendingKycActivity.this;
                PendingKycActivity.m40456onCreate$lambda0($r22, view);
            }
        });
        TextView $r19 = getBinding().callSupportView;
        TextView r26 = $r19;
        r26.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.register.v2.ui.TestActivity$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PendingKycActivity $r22 = PendingKycActivity.this;
                PendingKycActivity.m40457onCreate$lambda1($r22, view);
            }
        });
    }

    public final void setBinding(ActivityPendingKycBinding activityPendingKycBinding) {
        Log_OC.getArray(activityPendingKycBinding, "<set-?>");
        this.binding = activityPendingKycBinding;
    }

    public final void setPendingKycSubComponent(PendingKycSubComponent pendingKycSubComponent) {
        Log_OC.getArray(pendingKycSubComponent, "<set-?>");
        this.pendingKycSubComponent = pendingKycSubComponent;
    }
}
