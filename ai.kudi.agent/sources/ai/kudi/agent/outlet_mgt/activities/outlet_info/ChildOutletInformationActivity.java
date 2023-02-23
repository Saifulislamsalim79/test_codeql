package ai.kudi.agent.outlet_mgt.activities.outlet_info;

import ai.kudi.agent.BaseApplication;
import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.internal.components.ApplicationComponent;
import ai.kudi.agent.core.mvvm.BaseMVVMActivity;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.databinding.ActivityChildOutletInformationBinding;
import ai.kudi.agent.notification.data.model.NotificationModel;
import ai.kudi.agent.notification.data.model.NotificationModelKt;
import ai.kudi.agent.outlet_mgt.data.Outlet;
import ai.kudi.agent.outlet_mgt.game.components.OutletMgtFeaturesSubcomponents;
import ai.kudi.agent.outlet_mgt.viewdata.ChildOutletInformationViewData;
import ai.kudi.agent.outlet_mgt.viewmodels.outlet_info.ChildOutletInformationViewModel;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.C1335a;
import io.intercom.android.sdk.views.holder.AttributeType;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13277t;
import p201g.p270x.InterfaceC8209a;
/* compiled from: ChildOutletInformationActivity.kt */
@Metadata(m10422d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 )2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001)B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0003H\u0014J\b\u0010\u001b\u001a\u00020\u0002H\u0014J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001dH\u0014J\u0012\u0010\u001e\u001a\u00020\u00192\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0014J\u001a\u0010!\u001a\u00020\u00192\b\b\u0001\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0012H\u0002J\u0010\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020'H\u0002J\f\u0010(\u001a\u00020\u0019*\u00020\nH\u0002R\u0014\u0010\u0006\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006*"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/activities/outlet_info/ChildOutletInformationActivity;", "Lai/kudi/agent/core/mvvm/BaseMVVMActivity;", "Lai/kudi/agent/outlet_mgt/viewmodels/outlet_info/ChildOutletInformationViewModel;", "Lai/kudi/agent/outlet_mgt/viewdata/ChildOutletInformationViewData;", "Lai/kudi/agent/databinding/ActivityChildOutletInformationBinding;", "()V", "activityBinding", "getActivityBinding", "()Lai/kudi/agent/databinding/ActivityChildOutletInformationBinding;", "outlet", "Lai/kudi/agent/outlet_mgt/data/Outlet;", "outletMgtFeaturesSubcomponent", "Lai/kudi/agent/outlet_mgt/di/components/OutletMgtFeaturesSubcomponents;", "getOutletMgtFeaturesSubcomponent", "()Lai/kudi/agent/outlet_mgt/di/components/OutletMgtFeaturesSubcomponents;", "setOutletMgtFeaturesSubcomponent", "(Lai/kudi/agent/outlet_mgt/di/components/OutletMgtFeaturesSubcomponents;)V", "reference", "", "screenViewModel", "getScreenViewModel", "()Lai/kudi/agent/outlet_mgt/viewmodels/outlet_info/ChildOutletInformationViewModel;", "setScreenViewModel", "(Lai/kudi/agent/outlet_mgt/viewmodels/outlet_info/ChildOutletInformationViewModel;)V", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setViewError", "viewId", "", AttributeType.TEXT, "toggleLoader", "showLoader", "", "applyOutletToViews", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ChildOutletInformationActivity extends BaseMVVMActivity<ChildOutletInformationViewModel, ChildOutletInformationViewData, ActivityChildOutletInformationBinding> {
    public static final Companion Companion;
    public static final String EXTRA_KEY_OUTLET_DETAIL = "extra_key_outlet_detail";
    private Outlet outlet;
    public OutletMgtFeaturesSubcomponents outletMgtFeaturesSubcomponent;
    private String reference = "";
    public ChildOutletInformationViewModel screenViewModel;

    /* compiled from: ChildOutletInformationActivity.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/activities/outlet_info/ChildOutletInformationActivity$Companion;", "", "()V", "EXTRA_KEY_OUTLET_DETAIL", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
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
    /* JADX WARN: Code restructure failed: missing block: B:48:0x013f, code lost:
        if (r25 == null) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void applyOutletToViews(ai.kudi.agent.outlet_mgt.data.Outlet r31) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.outlet_mgt.activities.outlet_info.ChildOutletInformationActivity.applyOutletToViews(ai.kudi.agent.outlet_mgt.data.Outlet):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: applyOutletToViews$lambda-3  reason: not valid java name */
    public static final void m39861applyOutletToViews$lambda3(ChildOutletInformationActivity childOutletInformationActivity, View view) {
        Log_OC.getArray(childOutletInformationActivity, "this$0");
        ChildOutletInformationViewModel $r0 = childOutletInformationActivity.getScreenViewModel();
        $r0.onLgaFieldClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreate$lambda-0  reason: not valid java name */
    public static final void m39862onCreate$lambda0(ChildOutletInformationActivity childOutletInformationActivity, View view) {
        Log_OC.getArray(childOutletInformationActivity, "this$0");
        childOutletInformationActivity.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onCreate$lambda-2  reason: not valid java name */
    public static final void m39863onCreate$lambda2(ChildOutletInformationActivity childOutletInformationActivity, View view) {
        CharSequence $r9;
        CharSequence $r92;
        CharSequence $r93;
        CharSequence $r94;
        CharSequence $r95;
        CharSequence $r96;
        Log_OC.getArray(childOutletInformationActivity, "this$0");
        ChildOutletInformationViewModel $r2 = childOutletInformationActivity.getScreenViewModel();
        Outlet $r3 = childOutletInformationActivity.outlet;
        String $r4 = $r3 == null ? null : $r3.getOutletId();
        if ($r4 == null) {
            $r4 = childOutletInformationActivity.reference;
        }
        InterfaceC8209a $r5 = childOutletInformationActivity.getBinding();
        ActivityChildOutletInformationBinding $r6 = (ActivityChildOutletInformationBinding) $r5;
        KudiInputField $r7 = $r6.etFirstName;
        String $r8 = $r7.getText();
        if ($r8 == null) {
            NullPointerException $r15 = new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            throw $r15;
        }
        $r9 = C13277t.m5414M0($r8);
        String $r82 = $r9.toString();
        InterfaceC8209a $r52 = childOutletInformationActivity.getBinding();
        ActivityChildOutletInformationBinding $r62 = (ActivityChildOutletInformationBinding) $r52;
        KudiInputField $r72 = $r62.etLastName;
        String $r10 = $r72.getText();
        if ($r10 == null) {
            NullPointerException $r152 = new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            throw $r152;
        }
        $r92 = C13277t.m5414M0($r10);
        String $r102 = $r92.toString();
        InterfaceC8209a $r53 = childOutletInformationActivity.getBinding();
        ActivityChildOutletInformationBinding $r63 = (ActivityChildOutletInformationBinding) $r53;
        KudiInputField $r73 = $r63.etName;
        String $r11 = $r73.getText();
        if ($r11 == null) {
            NullPointerException $r153 = new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            throw $r153;
        }
        $r93 = C13277t.m5414M0($r11);
        String $r112 = $r93.toString();
        InterfaceC8209a $r54 = childOutletInformationActivity.getBinding();
        ActivityChildOutletInformationBinding $r64 = (ActivityChildOutletInformationBinding) $r54;
        KudiInputField $r74 = $r64.etAddress;
        String $r12 = $r74.getText();
        if ($r12 == null) {
            NullPointerException $r154 = new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            throw $r154;
        }
        $r94 = C13277t.m5414M0($r12);
        String $r122 = $r94.toString();
        InterfaceC8209a $r55 = childOutletInformationActivity.getBinding();
        ActivityChildOutletInformationBinding $r65 = (ActivityChildOutletInformationBinding) $r55;
        KudiInputField $r75 = $r65.etState;
        String $r13 = $r75.getText();
        if ($r13 == null) {
            NullPointerException $r155 = new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            throw $r155;
        }
        $r95 = C13277t.m5414M0($r13);
        String $r132 = $r95.toString();
        InterfaceC8209a $r56 = childOutletInformationActivity.getBinding();
        ActivityChildOutletInformationBinding $r66 = (ActivityChildOutletInformationBinding) $r56;
        KudiInputField $r76 = $r66.etLga;
        String $r14 = $r76.getText();
        if ($r14 == null) {
            NullPointerException $r156 = new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            throw $r156;
        }
        $r96 = C13277t.m5414M0($r14);
        $r2.onSubmitBtnClicked($r4, $r82, $r102, $r112, $r122, $r132, $r96.toString());
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setViewError(int i, String str) {
        InterfaceC8209a $r2 = getBinding();
        ActivityChildOutletInformationBinding $r3 = (ActivityChildOutletInformationBinding) $r2;
        KudiInputField $r4 = $r3.etPhoneNum;
        Log_OC.loadImage($r4, "binding.etPhoneNum");
        switch (i) {
            case C0001R.C0003id.et_address /* 2131362499 */:
                InterfaceC8209a $r22 = getBinding();
                ActivityChildOutletInformationBinding $r32 = (ActivityChildOutletInformationBinding) $r22;
                $r32.etAddress.setError(str);
                InterfaceC8209a $r23 = getBinding();
                ActivityChildOutletInformationBinding $r33 = (ActivityChildOutletInformationBinding) $r23;
                EditText $r5 = $r33.etAddress.getEditText();
                $r5.requestFocus();
                return;
            case C0001R.C0003id.et_first_name /* 2131362502 */:
                InterfaceC8209a $r24 = getBinding();
                ActivityChildOutletInformationBinding $r34 = (ActivityChildOutletInformationBinding) $r24;
                $r34.etFirstName.setError(str);
                InterfaceC8209a $r25 = getBinding();
                ActivityChildOutletInformationBinding $r35 = (ActivityChildOutletInformationBinding) $r25;
                EditText $r52 = $r35.etFirstName.getEditText();
                $r52.requestFocus();
                return;
            case C0001R.C0003id.et_last_name /* 2131362504 */:
                InterfaceC8209a $r26 = getBinding();
                ActivityChildOutletInformationBinding $r36 = (ActivityChildOutletInformationBinding) $r26;
                $r36.etLastName.setError(str);
                InterfaceC8209a $r27 = getBinding();
                ActivityChildOutletInformationBinding $r37 = (ActivityChildOutletInformationBinding) $r27;
                EditText $r53 = $r37.etLastName.getEditText();
                $r53.requestFocus();
                return;
            case C0001R.C0003id.et_lga /* 2131362505 */:
                InterfaceC8209a $r28 = getBinding();
                ActivityChildOutletInformationBinding $r38 = (ActivityChildOutletInformationBinding) $r28;
                $r38.etLga.setError(str);
                InterfaceC8209a $r29 = getBinding();
                ActivityChildOutletInformationBinding $r39 = (ActivityChildOutletInformationBinding) $r29;
                EditText $r54 = $r39.etLga.getEditText();
                $r54.requestFocus();
                return;
            case C0001R.C0003id.et_name /* 2131362506 */:
                InterfaceC8209a $r210 = getBinding();
                ActivityChildOutletInformationBinding $r310 = (ActivityChildOutletInformationBinding) $r210;
                $r310.etName.setError(str);
                InterfaceC8209a $r211 = getBinding();
                ActivityChildOutletInformationBinding $r311 = (ActivityChildOutletInformationBinding) $r211;
                EditText $r55 = $r311.etName.getEditText();
                $r55.requestFocus();
                return;
            case C0001R.C0003id.et_phone_num /* 2131362510 */:
                $r4.setError(str);
                EditText $r56 = $r4.getEditText();
                $r56.requestFocus();
                return;
            case C0001R.C0003id.et_state /* 2131362512 */:
                InterfaceC8209a $r212 = getBinding();
                ActivityChildOutletInformationBinding $r312 = (ActivityChildOutletInformationBinding) $r212;
                $r312.etState.setError(str);
                InterfaceC8209a $r213 = getBinding();
                ActivityChildOutletInformationBinding $r313 = (ActivityChildOutletInformationBinding) $r213;
                EditText $r57 = $r313.etState.getEditText();
                $r57.requestFocus();
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void toggleLoader(boolean z) {
        if (z) {
            InterfaceC8209a $r1 = getBinding();
            ActivityChildOutletInformationBinding $r2 = (ActivityChildOutletInformationBinding) $r1;
            KudiButton $r3 = $r2.btnSubmit;
            $r3.m38032f();
        } else {
            InterfaceC8209a $r12 = getBinding();
            ActivityChildOutletInformationBinding $r22 = (ActivityChildOutletInformationBinding) $r12;
            KudiButton $r32 = $r22.btnSubmit;
            $r32.m38033e();
        }
        InterfaceC8209a $r13 = getBinding();
        ActivityChildOutletInformationBinding $r23 = (ActivityChildOutletInformationBinding) $r13;
        ViewGroup $r33 = $r23.btnSubmit;
        boolean $z0 = !z;
        ViewGroup r4 = $r33;
        r4.setEnabled($z0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        ChildOutletInformationViewData $r2 = (ChildOutletInformationViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void applyViewData(ai.kudi.agent.outlet_mgt.viewdata.ChildOutletInformationViewData r36) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.outlet_mgt.activities.outlet_info.ChildOutletInformationActivity.applyViewData(ai.kudi.agent.outlet_mgt.viewdata.ChildOutletInformationViewData):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        ChildOutletInformationViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public ChildOutletInformationViewModel createViewModel() {
        ChildOutletInformationViewModel $r1 = getScreenViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public ActivityChildOutletInformationBinding getActivityBinding() {
        LayoutInflater $r1 = getLayoutInflater();
        ActivityChildOutletInformationBinding $r2 = ActivityChildOutletInformationBinding.inflate($r1);
        Log_OC.loadImage($r2, "inflate(layoutInflater)");
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public /* bridge */ /* synthetic */ InterfaceC8209a getActivityBinding() {
        ActivityChildOutletInformationBinding $r1 = getActivityBinding();
        return $r1;
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
    public final ChildOutletInformationViewModel getScreenViewModel() {
        ChildOutletInformationViewModel $r1 = this.screenViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("screenViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    protected Class getVMType() {
        return ChildOutletInformationViewModel.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public void onCreate(Bundle bundle) {
        Application $r2 = getApplication();
        if ($r2 == null) {
            NullPointerException r23 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.BaseApplication");
            throw r23;
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
        ActivityChildOutletInformationBinding $r8 = (ActivityChildOutletInformationBinding) $r7;
        Toolbar $r9 = $r8.toolbar;
        Log_OC.loadImage($r9, "binding.toolbar");
        setSupportActionBar($r9);
        String $r10 = getString(C0001R.string.outlet_information);
        $r9.setTitle($r10);
        int $i0 = C1335a.m36324d(this, C0001R.color.white);
        $r9.setTitleTextColor($i0);
        $r9.setNavigationIcon(C0001R.C0002drawable.ic_arrow_backward);
        $r9.setNavigationOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.outlet_mgt.activities.outlet_info.EditActivity$4
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChildOutletInformationActivity $r22 = ChildOutletInformationActivity.this;
                ChildOutletInformationActivity.m39862onCreate$lambda0($r22, view);
            }
        });
        InterfaceC8209a $r72 = getBinding();
        ActivityChildOutletInformationBinding $r82 = (ActivityChildOutletInformationBinding) $r72;
        KudiInputField $r12 = $r82.etState;
        $r12.disableEditablity();
        InterfaceC8209a $r73 = getBinding();
        ActivityChildOutletInformationBinding $r83 = (ActivityChildOutletInformationBinding) $r73;
        KudiInputField $r122 = $r83.etLga;
        $r122.disableEditablity();
        Intent $r13 = getIntent();
        boolean $z0 = $r13.hasExtra(NotificationModelKt.NOTIFICATION_SERIALIZABLE_KEY);
        if ($z0) {
            Intent $r132 = getIntent();
            Serializable $r14 = $r132.getSerializableExtra(NotificationModelKt.NOTIFICATION_SERIALIZABLE_KEY);
            if ($r14 == null) {
                NullPointerException r232 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.notification.data.model.NotificationModel");
                throw r232;
            }
            NotificationModel $r15 = (NotificationModel) $r14;
            String $r102 = $r15.getReference();
            this.reference = $r102;
            ChildOutletInformationViewModel $r16 = getScreenViewModel();
            String $r103 = this.reference;
            $r16.loadOutletFromNotification($r103);
        } else {
            Intent $r133 = getIntent();
            boolean $z02 = $r133.hasExtra(EXTRA_KEY_OUTLET_DETAIL);
            if ($z02) {
                Intent $r134 = getIntent();
                Parcelable $r18 = $r134.getParcelableExtra(EXTRA_KEY_OUTLET_DETAIL);
                Log_OC.append($r18);
                Outlet $r19 = (Outlet) $r18;
                this.outlet = $r19;
                Log_OC.loadImage($r19, "");
                applyOutletToViews($r19);
            }
        }
        InterfaceC8209a $r74 = getBinding();
        ActivityChildOutletInformationBinding $r84 = (ActivityChildOutletInformationBinding) $r74;
        ViewGroup $r20 = $r84.btnSubmit;
        ViewGroup r25 = $r20;
        r25.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.outlet_mgt.activities.outlet_info.ActivityMain$18
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChildOutletInformationActivity $r22 = ChildOutletInformationActivity.this;
                ChildOutletInformationActivity.m39863onCreate$lambda2($r22, view);
            }
        });
    }

    public final void setOutletMgtFeaturesSubcomponent(OutletMgtFeaturesSubcomponents outletMgtFeaturesSubcomponents) {
        Log_OC.getArray(outletMgtFeaturesSubcomponents, "<set-?>");
        this.outletMgtFeaturesSubcomponent = outletMgtFeaturesSubcomponents;
    }

    public final void setScreenViewModel(ChildOutletInformationViewModel childOutletInformationViewModel) {
        Log_OC.getArray(childOutletInformationViewModel, "<set-?>");
        this.screenViewModel = childOutletInformationViewModel;
    }
}
