package ai.kudi.agent.outlet_mgt.activities;

import ai.kudi.agent.BaseApplication;
import ai.kudi.agent.C0001R;
import ai.kudi.agent.common_screens.success_screen.fragment.SuccessScreenDialogFragment;
import ai.kudi.agent.common_screens.success_screen.labs.SuccessScreenCustomOption;
import ai.kudi.agent.core.internal.components.ApplicationComponent;
import ai.kudi.agent.core.mvvm.BaseMVVMActivity;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.databinding.ActivityOutletMgtAcceptDeclineBinding;
import ai.kudi.agent.login.domain.LoginParams;
import ai.kudi.agent.notification.data.model.NotificationModel;
import ai.kudi.agent.notification.data.model.NotificationModelKt;
import ai.kudi.agent.outlet_mgt.data.OutletMgtAcceptDeclineResponse;
import ai.kudi.agent.outlet_mgt.game.components.OutletMgtFeaturesSubcomponents;
import ai.kudi.agent.outlet_mgt.viewmodels.OutletMgtAcceptDeclineVd;
import ai.kudi.agent.outlet_mgt.viewmodels.OutletMgtAcceptDeclineVm;
import ai.kudi.agent.outlet_mgt.viewmodels.STATUS;
import ai.kudi.agent.pin.KudiPin;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.dip.library.button.KudiButton;
import android.app.Application;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Chapter;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.InterfaceC1523w;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: OutletMgtAcceptDeclineActivity.kt */
@Metadata(m10422d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0003H\u0014J\b\u0010$\u001a\u00020\u0002H\u0014J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020&H\u0014J\u0012\u0010'\u001a\u00020\"2\b\u0010(\u001a\u0004\u0018\u00010)H\u0014J\u0010\u0010*\u001a\u00020\"2\u0006\u0010+\u001a\u00020,H\u0002R\u0014\u0010\u0006\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\u001c\u0010\u0005\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006-"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/activities/OutletMgtAcceptDeclineActivity;", "Lai/kudi/agent/core/mvvm/BaseMVVMActivity;", "Lai/kudi/agent/outlet_mgt/viewmodels/OutletMgtAcceptDeclineVm;", "Lai/kudi/agent/outlet_mgt/viewmodels/OutletMgtAcceptDeclineVd;", "Lai/kudi/agent/databinding/ActivityOutletMgtAcceptDeclineBinding;", "()V", "activityBinding", "getActivityBinding", "()Lai/kudi/agent/databinding/ActivityOutletMgtAcceptDeclineBinding;", "outletMgtAcceptDeclineVm", "getOutletMgtAcceptDeclineVm", "()Lai/kudi/agent/outlet_mgt/viewmodels/OutletMgtAcceptDeclineVm;", "setOutletMgtAcceptDeclineVm", "(Lai/kudi/agent/outlet_mgt/viewmodels/OutletMgtAcceptDeclineVm;)V", "outletMgtFeaturesSubcomponent", "Lai/kudi/agent/outlet_mgt/di/components/OutletMgtFeaturesSubcomponents;", "getOutletMgtFeaturesSubcomponent", "()Lai/kudi/agent/outlet_mgt/di/components/OutletMgtFeaturesSubcomponents;", "setOutletMgtFeaturesSubcomponent", "(Lai/kudi/agent/outlet_mgt/di/components/OutletMgtFeaturesSubcomponents;)V", "reference", "", "getReference", "()Ljava/lang/String;", "setReference", "(Ljava/lang/String;)V", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences$annotations", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "setSharedPreferences", "(Landroid/content/SharedPreferences;)V", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showKudiPin", TransactionField.STATUS, "Lai/kudi/agent/outlet_mgt/viewmodels/STATUS;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class OutletMgtAcceptDeclineActivity extends BaseMVVMActivity<OutletMgtAcceptDeclineVm, OutletMgtAcceptDeclineVd, ActivityOutletMgtAcceptDeclineBinding> {
    public OutletMgtAcceptDeclineVm outletMgtAcceptDeclineVm;
    public OutletMgtFeaturesSubcomponents outletMgtFeaturesSubcomponent;
    private String reference = "";
    public SharedPreferences sharedPreferences;

    public static /* synthetic */ void getSharedPreferences$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreate$lambda-0  reason: not valid java name */
    public static final void m39855onCreate$lambda0(OutletMgtAcceptDeclineActivity outletMgtAcceptDeclineActivity, View view) {
        Log_OC.getArray(outletMgtAcceptDeclineActivity, "this$0");
        outletMgtAcceptDeclineActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onCreate$lambda-1  reason: not valid java name */
    public static final void m39856onCreate$lambda1(OutletMgtAcceptDeclineActivity outletMgtAcceptDeclineActivity, View view) {
        Log_OC.getArray(outletMgtAcceptDeclineActivity, "this$0");
        STATUS $r2 = STATUS.APPROVED;
        outletMgtAcceptDeclineActivity.showKudiPin($r2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onCreate$lambda-2  reason: not valid java name */
    public static final void m39857onCreate$lambda2(OutletMgtAcceptDeclineActivity outletMgtAcceptDeclineActivity, View view) {
        Log_OC.getArray(outletMgtAcceptDeclineActivity, "this$0");
        STATUS $r2 = STATUS.DECLINED;
        outletMgtAcceptDeclineActivity.showKudiPin($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void showKudiPin(final STATUS status) {
        FragmentManager $r3 = getSupportFragmentManager();
        $r3.p1(KudiPin.KUDI_PIN_AUTH_SUCCESS_KEY, this, new InterfaceC1523w() { // from class: ai.kudi.agent.outlet_mgt.activities.c
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: b */
            public final void m38720b(String str, Bundle bundle) {
                OutletMgtAcceptDeclineActivity $r32 = OutletMgtAcceptDeclineActivity.this;
                STATUS $r4 = status;
                OutletMgtAcceptDeclineActivity.m39858showKudiPin$lambda4($r32, $r4, str, bundle);
            }
        });
        KudiPin.Companion $r1 = KudiPin.Companion;
        KudiPin $r5 = KudiPin.Companion.newInstance$default($r1, null, null, false, 7, null);
        FragmentManager $r32 = getSupportFragmentManager();
        ((Chapter) $r5).show($r32, ".AuthDialog.Dialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: showKudiPin$lambda-4  reason: not valid java name */
    public static final void m39858showKudiPin$lambda4(OutletMgtAcceptDeclineActivity outletMgtAcceptDeclineActivity, STATUS status, String str, Bundle bundle) {
        Log_OC.getArray(outletMgtAcceptDeclineActivity, "this$0");
        Log_OC.getArray(status, "$status");
        Log_OC.getArray(str, "$noName_0");
        Log_OC.getArray(bundle, "bundle");
        String $r2 = bundle.getString(KudiPin.PASSWORD_KEY);
        if ($r2 == null) {
            return;
        }
        String $r4 = outletMgtAcceptDeclineActivity.getReference();
        String $r5 = status.name();
        OutletMgtAcceptDeclineVm $r6 = outletMgtAcceptDeclineActivity.getOutletMgtAcceptDeclineVm();
        $r6.acceptOrDeclineOutletView($r2, $r5, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        OutletMgtAcceptDeclineVd $r2 = (OutletMgtAcceptDeclineVd) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(OutletMgtAcceptDeclineVd outletMgtAcceptDeclineVd) {
        Log_OC.getArray(outletMgtAcceptDeclineVd, "viewData");
        boolean $z0 = outletMgtAcceptDeclineVd.isLoading();
        if ($z0) {
            InterfaceC8209a $r2 = getBinding();
            KudiButton $r4 = ((ActivityOutletMgtAcceptDeclineBinding) $r2).acceptRequestButton;
            $r4.m38032f();
            InterfaceC8209a $r22 = getBinding();
            TextView $r5 = ((ActivityOutletMgtAcceptDeclineBinding) $r22).cancelRequestButton;
            Log_OC.loadImage($r5, "binding.cancelRequestButton");
            ViewExtKt.hide$default($r5, false, 1, null);
        } else {
            InterfaceC8209a $r23 = getBinding();
            KudiButton $r42 = ((ActivityOutletMgtAcceptDeclineBinding) $r23).acceptRequestButton;
            $r42.m38033e();
            InterfaceC8209a $r24 = getBinding();
            TextView $r52 = ((ActivityOutletMgtAcceptDeclineBinding) $r24).cancelRequestButton;
            Log_OC.loadImage($r52, "binding.cancelRequestButton");
            ViewExtKt.show($r52);
        }
        OutletMgtAcceptDeclineResponse $r6 = outletMgtAcceptDeclineVd.getOutletMgtAcceptDeclineResponse();
        if ($r6 != null) {
            String $r7 = $r6.getOutletApprovalStatus();
            STATUS $r8 = STATUS.APPROVED;
            String $r9 = $r8.name();
            boolean $z02 = Log_OC.append($r7, $r9);
            if ($z02) {
                SharedPreferences $r10 = getSharedPreferences();
                SharedPreferences.Editor $r11 = $r10.edit();
                $r11.putBoolean(LoginParams.EXTRA_IS_OUTLET, true).apply();
                SuccessScreenDialogFragment.Companion $r12 = SuccessScreenDialogFragment.Companion;
                SuccessScreenCustomOption $r13 = new SuccessScreenCustomOption("Success!", "Your outlet has been successfully linked", "Close", false, false, false, 0, 0, 0, 0, C0001R.C0002drawable.ic_request_success, 0, false, 7160, null);
                SuccessScreenDialogFragment $r14 = $r12.newInstance($r13);
                FragmentManager $r15 = getSupportFragmentManager();
                $r14.show($r15, "OUTLET_APPROVAL");
            } else {
                SuccessScreenDialogFragment.Companion $r122 = SuccessScreenDialogFragment.Companion;
                SuccessScreenCustomOption $r132 = new SuccessScreenCustomOption("Request Declined", "You have cancelled the request to link your account. If this request appears strange, please contact support", "Close", false, false, false, 0, 0, 0, 0, C0001R.C0002drawable.ic_request_declined, 0, false, 7160, null);
                SuccessScreenDialogFragment $r142 = $r122.newInstance($r132);
                FragmentManager $r152 = getSupportFragmentManager();
                $r142.show($r152, "OUTLET_APPROVAL");
            }
        }
        String $r72 = outletMgtAcceptDeclineVd.getErrorMessage();
        if ($r72 == null) {
            return;
        }
        ContextExtKt.toast$default(this, $r72, 0, 2, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        OutletMgtAcceptDeclineVm $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public OutletMgtAcceptDeclineVm createViewModel() {
        OutletMgtAcceptDeclineVm $r1 = getOutletMgtAcceptDeclineVm();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public ActivityOutletMgtAcceptDeclineBinding getActivityBinding() {
        LayoutInflater $r1 = getLayoutInflater();
        ActivityOutletMgtAcceptDeclineBinding $r2 = ActivityOutletMgtAcceptDeclineBinding.inflate($r1);
        Log_OC.loadImage($r2, "inflate(layoutInflater)");
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public /* bridge */ /* synthetic */ InterfaceC8209a getActivityBinding() {
        ActivityOutletMgtAcceptDeclineBinding $r1 = getActivityBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final OutletMgtAcceptDeclineVm getOutletMgtAcceptDeclineVm() {
        OutletMgtAcceptDeclineVm $r1 = this.outletMgtAcceptDeclineVm;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("outletMgtAcceptDeclineVm");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final OutletMgtFeaturesSubcomponents getOutletMgtFeaturesSubcomponent() {
        OutletMgtFeaturesSubcomponents $r1 = this.outletMgtFeaturesSubcomponent;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("outletMgtFeaturesSubcomponent");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getReference() {
        String r1 = this.reference;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SharedPreferences getSharedPreferences() {
        SharedPreferences $r1 = this.sharedPreferences;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("sharedPreferences");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    protected Class getVMType() {
        return OutletMgtAcceptDeclineVm.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public void onCreate(Bundle bundle) {
        Application $r2 = getApplication();
        if ($r2 == null) {
            NullPointerException r21 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.BaseApplication");
            throw r21;
        }
        BaseApplication $r3 = (BaseApplication) $r2;
        ApplicationComponent $r4 = $r3.getApplicationComponent();
        OutletMgtFeaturesSubcomponents.Factory $r5 = $r4.outletMgtFeaturesSubComponent();
        OutletMgtFeaturesSubcomponents $r6 = $r5.create();
        setOutletMgtFeaturesSubcomponent($r6);
        OutletMgtFeaturesSubcomponents $r62 = getOutletMgtFeaturesSubcomponent();
        $r62.inject(this);
        super.onCreate(bundle);
        InterfaceC8209a $r7 = getBinding();
        ActivityOutletMgtAcceptDeclineBinding $r8 = (ActivityOutletMgtAcceptDeclineBinding) $r7;
        ImageView $r9 = $r8.backButton;
        $r9.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.outlet_mgt.activities.TestActivity$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OutletMgtAcceptDeclineActivity $r22 = OutletMgtAcceptDeclineActivity.this;
                OutletMgtAcceptDeclineActivity.m39855onCreate$lambda0($r22, view);
            }
        });
        Intent $r11 = getIntent();
        boolean $z0 = $r11.hasExtra(NotificationModelKt.NOTIFICATION_SERIALIZABLE_KEY);
        if ($z0) {
            Intent $r112 = getIntent();
            Serializable $r12 = $r112.getSerializableExtra(NotificationModelKt.NOTIFICATION_SERIALIZABLE_KEY);
            if ($r12 == null) {
                NullPointerException r212 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.notification.data.model.NotificationModel");
                throw r212;
            }
            NotificationModel $r13 = (NotificationModel) $r12;
            String $r14 = $r13.getReference();
            this.reference = $r14;
        }
        InterfaceC8209a $r72 = getBinding();
        ActivityOutletMgtAcceptDeclineBinding $r82 = (ActivityOutletMgtAcceptDeclineBinding) $r72;
        ViewGroup $r16 = $r82.acceptRequestButton;
        ViewGroup r24 = $r16;
        r24.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.outlet_mgt.activities.EditActivity$4
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OutletMgtAcceptDeclineActivity $r22 = OutletMgtAcceptDeclineActivity.this;
                OutletMgtAcceptDeclineActivity.m39856onCreate$lambda1($r22, view);
            }
        });
        InterfaceC8209a $r73 = getBinding();
        ActivityOutletMgtAcceptDeclineBinding $r83 = (ActivityOutletMgtAcceptDeclineBinding) $r73;
        TextView $r18 = $r83.cancelRequestButton;
        $r18.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.outlet_mgt.activities.Main
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OutletMgtAcceptDeclineActivity $r22 = OutletMgtAcceptDeclineActivity.this;
                OutletMgtAcceptDeclineActivity.m39857onCreate$lambda2($r22, view);
            }
        });
    }

    public final void setOutletMgtAcceptDeclineVm(OutletMgtAcceptDeclineVm outletMgtAcceptDeclineVm) {
        Log_OC.getArray(outletMgtAcceptDeclineVm, "<set-?>");
        this.outletMgtAcceptDeclineVm = outletMgtAcceptDeclineVm;
    }

    public final void setOutletMgtFeaturesSubcomponent(OutletMgtFeaturesSubcomponents outletMgtFeaturesSubcomponents) {
        Log_OC.getArray(outletMgtFeaturesSubcomponents, "<set-?>");
        this.outletMgtFeaturesSubcomponent = outletMgtFeaturesSubcomponents;
    }

    public final void setReference(String str) {
        Log_OC.getArray(str, "<set-?>");
        this.reference = str;
    }

    public final void setSharedPreferences(SharedPreferences sharedPreferences) {
        Log_OC.getArray(sharedPreferences, "<set-?>");
        this.sharedPreferences = sharedPreferences;
    }
}
