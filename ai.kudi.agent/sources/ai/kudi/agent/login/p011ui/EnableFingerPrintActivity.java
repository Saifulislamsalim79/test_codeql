package ai.kudi.agent.login.p011ui;

import ai.kudi.agent.BaseApplication;
import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.internal.components.ApplicationComponent;
import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.databinding.ActivityEnableFingerPrintBinding;
import ai.kudi.agent.login.game.components.EnableFingerPrintSubComponent;
import ai.kudi.agent.register.p022v2.p023ui.EnableFingerPrintFragment;
import android.app.Application;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: EnableFingerPrintActivity.kt */
@Metadata(m10422d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0012\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0014"}, m10421d2 = {"Lai/kudi/agent/login/ui/EnableFingerPrintActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lai/kudi/agent/databinding/ActivityEnableFingerPrintBinding;", "getBinding", "()Lai/kudi/agent/databinding/ActivityEnableFingerPrintBinding;", "setBinding", "(Lai/kudi/agent/databinding/ActivityEnableFingerPrintBinding;)V", "enableFingerPrintSubComponent", "Lai/kudi/agent/login/di/components/EnableFingerPrintSubComponent;", "getEnableFingerPrintSubComponent", "()Lai/kudi/agent/login/di/components/EnableFingerPrintSubComponent;", "setEnableFingerPrintSubComponent", "(Lai/kudi/agent/login/di/components/EnableFingerPrintSubComponent;)V", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.login.ui.EnableFingerPrintActivity */
/* loaded from: classes.dex */
public final class EnableFingerPrintActivity extends AppCompatActivity {
    public ActivityEnableFingerPrintBinding binding;
    public EnableFingerPrintSubComponent enableFingerPrintSubComponent;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ActivityEnableFingerPrintBinding getBinding() {
        ActivityEnableFingerPrintBinding $r1 = this.binding;
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
    public final EnableFingerPrintSubComponent getEnableFingerPrintSubComponent() {
        EnableFingerPrintSubComponent $r1 = this.enableFingerPrintSubComponent;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("enableFingerPrintSubComponent");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
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
        Application $r3 = getApplication();
        if ($r3 == null) {
            NullPointerException r15 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.BaseApplication");
            throw r15;
        }
        BaseApplication $r4 = (BaseApplication) $r3;
        ApplicationComponent $r5 = $r4.getApplicationComponent();
        EnableFingerPrintSubComponent.Factory $r6 = $r5.enableFingerSubComponent();
        EnableFingerPrintSubComponent $r7 = $r6.create();
        setEnableFingerPrintSubComponent($r7);
        EnableFingerPrintSubComponent $r72 = getEnableFingerPrintSubComponent();
        $r72.inject(this);
        super.onCreate(bundle);
        LayoutInflater $r8 = getLayoutInflater();
        ActivityEnableFingerPrintBinding $r9 = ActivityEnableFingerPrintBinding.inflate($r8);
        Log_OC.loadImage($r9, "inflate(layoutInflater)");
        setBinding($r9);
        ConstraintLayout $r10 = getBinding().getRoot();
        setContentView($r10);
        EnableFingerPrintFragment.Companion $r11 = EnableFingerPrintFragment.Companion;
        EnableFingerPrintActivity$onCreate$1 r14 = new EnableFingerPrintActivity$onCreate$1(this);
        EnableFingerPrintFragment $r12 = $r11.newInstance(null, r14);
        AppCompatActivityExtKt.startFragment$default(this, $r12, C0001R.C0003id.container, false, false, false, 28, null);
    }

    public final void setBinding(ActivityEnableFingerPrintBinding activityEnableFingerPrintBinding) {
        Log_OC.getArray(activityEnableFingerPrintBinding, "<set-?>");
        this.binding = activityEnableFingerPrintBinding;
    }

    public final void setEnableFingerPrintSubComponent(EnableFingerPrintSubComponent enableFingerPrintSubComponent) {
        Log_OC.getArray(enableFingerPrintSubComponent, "<set-?>");
        this.enableFingerPrintSubComponent = enableFingerPrintSubComponent;
    }
}
