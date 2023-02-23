package ai.kudi.agent.settings.insurance.p026ui;

import ai.kudi.agent.BaseApplication;
import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.internal.components.ApplicationComponent;
import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.settings.insurance.navigator.CashInsuranceFragmentNavigator;
import ai.kudi.agent.settings.insurance.p026ui.CashInsuranceFragment;
import ai.kudi.agent.settings.insurance.p026ui.InsuranceDeactivationReasonsFragment;
import ai.kudi.agent.settings.insurance.xpp3.CashInsuranceActivitySubComponent;
import android.app.Application;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: CashInsuranceActivity.kt */
@Metadata(m10422d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\b\u0010\u000e\u001a\u00020\u000bH\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000f"}, m10421d2 = {"Lai/kudi/agent/settings/insurance/ui/CashInsuranceActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lai/kudi/agent/settings/insurance/navigator/CashInsuranceFragmentNavigator;", "()V", "subComponent", "Lai/kudi/agent/settings/insurance/di/CashInsuranceActivitySubComponent;", "getSubComponent", "()Lai/kudi/agent/settings/insurance/di/CashInsuranceActivitySubComponent;", "setSubComponent", "(Lai/kudi/agent/settings/insurance/di/CashInsuranceActivitySubComponent;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "openDeactivationReasonsFragment", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.insurance.ui.CashInsuranceActivity */
/* loaded from: classes.dex */
public final class CashInsuranceActivity extends AppCompatActivity implements CashInsuranceFragmentNavigator {
    public CashInsuranceActivitySubComponent subComponent;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final CashInsuranceActivitySubComponent getSubComponent() {
        CashInsuranceActivitySubComponent $r1 = this.subComponent;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("subComponent");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.BaseListFragment, android.app.Activity
    public void onCreate(Bundle bundle) {
        Application $r2 = getApplication();
        if ($r2 == null) {
            NullPointerException $r9 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.BaseApplication");
            throw $r9;
        }
        BaseApplication $r3 = (BaseApplication) $r2;
        ApplicationComponent $r4 = $r3.getApplicationComponent();
        CashInsuranceActivitySubComponent.Factory $r5 = $r4.cashInsuranceActivitySubComponent();
        CashInsuranceActivitySubComponent $r6 = $r5.create(this);
        setSubComponent($r6);
        super.onCreate(bundle);
        setContentView(C0001R.C0004layout.activity_cash_insurance);
        if (bundle == null) {
            CashInsuranceFragment.Companion $r7 = CashInsuranceFragment.Companion;
            CashInsuranceFragment $r8 = $r7.newInstance();
            AppCompatActivityExtKt.startFragment$default(this, $r8, C0001R.C0003id.cash_insurance_content, false, false, false, 8, null);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.settings.insurance.navigator.CashInsuranceFragmentNavigator
    public void openDeactivationReasonsFragment() {
        InsuranceDeactivationReasonsFragment.Companion $r1 = InsuranceDeactivationReasonsFragment.Companion;
        InsuranceDeactivationReasonsFragment $r2 = $r1.newInstance();
        AppCompatActivityExtKt.startFragment$default(this, $r2, C0001R.C0003id.cash_insurance_content, true, false, false, 8, null);
    }

    public final void setSubComponent(CashInsuranceActivitySubComponent cashInsuranceActivitySubComponent) {
        Log_OC.getArray(cashInsuranceActivitySubComponent, "<set-?>");
        this.subComponent = cashInsuranceActivitySubComponent;
    }
}
