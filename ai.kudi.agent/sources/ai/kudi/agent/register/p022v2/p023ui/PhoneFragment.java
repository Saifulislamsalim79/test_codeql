package ai.kudi.agent.register.p022v2.p023ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.analytics.SmartLookAnalytics;
import ai.kudi.agent.core.databinding.BottomLoginViewBinding;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.EditTextExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.databinding.FragmentPhoneBinding;
import ai.kudi.agent.register.p022v2.p023ui.viewModels.PhoneAndBvnViewModel;
import ai.kudi.agent.register.p022v2.p023ui.viewModels.data.PhoneAndBvnViewData;
import ai.kudi.agent.register.xmpp.components.RegistrationSubComponent;
import ai.kudi.agent.settings.mcc.components.BvnVerificationSubcomponent;
import ai.kudi.agent.settings.p029ui.BvnExistingAgentActivity;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.app.C1291a;
import androidx.core.content.C1335a;
import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p450e0.Object;
/* compiled from: PhoneFragment.kt */
@Metadata(m10422d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\u0018\u0000 B2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001BB\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0003H\u0014J\b\u0010\"\u001a\u00020 H\u0003J\b\u0010#\u001a\u00020\u0002H\u0014J\u000e\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020%H\u0014J\b\u0010&\u001a\u00020 H\u0002J\b\u0010'\u001a\u00020 H\u0003J\b\u0010(\u001a\u00020\u0007H\u0002J\u0010\u0010)\u001a\u00020 2\u0006\u0010*\u001a\u00020+H\u0016J\u0010\u0010,\u001a\u00020 2\u0006\u0010-\u001a\u00020\u0007H\u0002J$\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u0001032\b\u00104\u001a\u0004\u0018\u000105H\u0016J\b\u00106\u001a\u00020 H\u0002J-\u00107\u001a\u00020 2\u0006\u00108\u001a\u00020\f2\u000e\u00109\u001a\n\u0012\u0006\b\u0001\u0012\u00020;0:2\u0006\u0010<\u001a\u00020=H\u0016¢\u0006\u0002\u0010>J\u001a\u0010?\u001a\u00020 2\u0006\u0010@\u001a\u00020/2\b\u00104\u001a\u0004\u0018\u000105H\u0017J\b\u0010A\u001a\u00020 H\u0002R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\u000f\u0010\u0005\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006C"}, m10421d2 = {"Lai/kudi/agent/register/v2/ui/PhoneFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/register/v2/ui/viewModels/PhoneAndBvnViewModel;", "Lai/kudi/agent/register/v2/ui/viewModels/data/PhoneAndBvnViewData;", "Lai/kudi/agent/databinding/FragmentPhoneBinding;", "()V", "isNewUser", "", "()Z", "setNewUser", "(Z)V", "permissionActionFlag", "", "sharedPrefs", "Landroid/content/SharedPreferences;", "getSharedPrefs$annotations", "getSharedPrefs", "()Landroid/content/SharedPreferences;", "setSharedPrefs", "(Landroid/content/SharedPreferences;)V", "smartLookAnalytics", "Lai/kudi/agent/analytics/SmartLookAnalytics;", "getSmartLookAnalytics", "()Lai/kudi/agent/analytics/SmartLookAnalytics;", "setSmartLookAnalytics", "(Lai/kudi/agent/analytics/SmartLookAnalytics;)V", "vm", "getVm", "()Lai/kudi/agent/register/v2/ui/viewModels/PhoneAndBvnViewModel;", "setVm", "(Lai/kudi/agent/register/v2/ui/viewModels/PhoneAndBvnViewModel;)V", "applyViewData", "", "viewData", "cacheImei", "createViewModel", "getVMType", "Ljava/lang/Class;", "handleBvnRegForExistingUser", "handleRegisterActivity", "hasReadPhoneStatePermission", "onAttach", "context", "Landroid/content/Context;", "onContinueClicked", "isPhoneNumberLookUp", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onLoginClicked", "onRequestPermissionsResult", "requestCode", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onViewCreated", "view", "requestPermission", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.register.v2.ui.PhoneFragment */
/* loaded from: classes.dex */
public final class PhoneFragment extends BaseMVVMViewBindingFragment<PhoneAndBvnViewModel, PhoneAndBvnViewData, FragmentPhoneBinding> {
    public static final String ARG_BVN = "bvn";
    public static final String ARG_PHONE_NUMBER = "phoneNo";
    public static final String ARG_REG = "reg";
    public static final Companion Companion;
    private static final int PERMISSION_ACTION_FLAG_SIGNIN = 2;
    private static final int PERMISSION_ACTION_FLAG_SIGNUP = 1;
    private boolean isNewUser;
    private int permissionActionFlag = 1;
    public SharedPreferences sharedPrefs;
    public SmartLookAnalytics smartLookAnalytics;
    public PhoneAndBvnViewModel srv;

    /* compiled from: PhoneFragment.kt */
    @Metadata(m10422d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m10421d2 = {"Lai/kudi/agent/register/v2/ui/PhoneFragment$Companion;", "", "()V", "ARG_BVN", "", "ARG_PHONE_NUMBER", "ARG_REG", "PERMISSION_ACTION_FLAG_SIGNIN", "", "PERMISSION_ACTION_FLAG_SIGNUP", "newInstance", "Lai/kudi/agent/register/v2/ui/PhoneFragment;", "phoneNumber", PhoneFragment.ARG_BVN, "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.register.v2.ui.PhoneFragment$Companion */
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
        public final PhoneFragment newInstance(String str, String str2) {
            PhoneFragment $r2 = new PhoneFragment();
            Bundle $r3 = new Bundle();
            $r3.putString("phoneNo", str);
            $r3.putString(PhoneFragment.ARG_BVN, str2);
            $r2.setArguments($r3);
            return $r2;
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
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
        if (r9 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
        r6 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
        if (r9 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void cacheImei() {
        /*
            r13 = this;
            androidx.fragment.app.FragmentActivity r0 = r13.requireActivity()
            java.lang.String r2 = "phone"
            java.lang.Object r1 = r0.getSystemService(r2)
            if (r1 == 0) goto L48
            r4 = r1
            android.telephony.TelephonyManager r4 = (android.telephony.TelephonyManager) r4
            r3 = r4
            int r5 = android.os.Build.VERSION.SDK_INT
            java.lang.String r6 = "Not available"
            r7 = 29
            if (r5 < r7) goto L19
            goto L36
        L19:
            r7 = 26
            if (r5 < r7) goto L2f
            java.lang.String r8 = r3.getImei()
            if (r8 != 0) goto L2d
            java.lang.String r9 = r3.getMeid()
            r8 = r9
            if (r9 != 0) goto L2b
            goto L36
        L2b:
            r6 = r8
            goto L36
        L2d:
            r6 = r8
            goto L36
        L2f:
            java.lang.String r9 = r3.getDeviceId()
            r8 = r9
            if (r9 != 0) goto L2b
        L36:
            android.content.SharedPreferences r10 = r13.getSharedPrefs()
            android.content.SharedPreferences$Editor r11 = r10.edit()
            java.lang.String r2 = "SECURE_IMEID"
            android.content.SharedPreferences$Editor r11 = r11.putString(r2, r6)
            r11.apply()
            return
        L48:
            java.lang.NullPointerException r12 = new java.lang.NullPointerException
            java.lang.String r2 = "null cannot be cast to non-null type android.telephony.TelephonyManager"
            r12.<init>(r2)
            goto L50
        L50:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.register.p022v2.p023ui.PhoneFragment.cacheImei():void");
    }

    public static /* synthetic */ void getSharedPrefs$annotations() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void handleBvnRegForExistingUser() {
        InterfaceC8209a $r2 = requireBinding();
        FragmentPhoneBinding $r3 = (FragmentPhoneBinding) $r2;
        KudiButton $r4 = $r3.continueButton;
        $r4.m38034d();
        KudiButton r6 = $r4;
        r6.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.register.v2.ui.Main
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhoneFragment $r22 = PhoneFragment.this;
                PhoneFragment.m40461handleBvnRegForExistingUser$lambda4$lambda3($r22, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleBvnRegForExistingUser$lambda-4$lambda-3  reason: not valid java name */
    public static final void m40461handleBvnRegForExistingUser$lambda4$lambda3(PhoneFragment phoneFragment, View view) {
        Log_OC.getArray(phoneFragment, "this$0");
        phoneFragment.onContinueClicked(false);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void handleRegisterActivity() {
        InterfaceC8209a $r2 = requireBinding();
        final FragmentPhoneBinding $r3 = (FragmentPhoneBinding) $r2;
        KudiInputField $r4 = $r3.phoneNumberInputField;
        EditText $r5 = $r4.getEditText();
        AbstractC11688p $r6 = EditTextExtKt.getTextChanges($r5);
        Object object = new Object() { // from class: ai.kudi.agent.register.v2.ui.FromMatchesFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                FragmentPhoneBinding $r1 = FragmentPhoneBinding.this;
                CharSequence $r32 = (CharSequence) obj;
                PhoneFragment.m40462handleRegisterActivity$lambda5($r1, $r32);
            }
        };
        Function $r1 = Function.LEN;
        $r6.e0(object, $r1);
        ViewGroup $r8 = $r3.continueButton;
        ViewGroup r12 = $r8;
        r12.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.register.v2.ui.Switch
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FragmentPhoneBinding $r22 = FragmentPhoneBinding.this;
                PhoneFragment $r32 = this;
                PhoneFragment.m40464handleRegisterActivity$lambda7($r22, $r32, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: handleRegisterActivity$lambda-5  reason: not valid java name */
    public static final void m40462handleRegisterActivity$lambda5(FragmentPhoneBinding fragmentPhoneBinding, CharSequence charSequence) {
        Log_OC.getArray(fragmentPhoneBinding, "$binding");
        KudiInputField $r2 = fragmentPhoneBinding.phoneNumberInputField;
        String $r3 = $r2.getText();
        int $i0 = $r3.length();
        if ($i0 == 11) {
            KudiButton $r4 = fragmentPhoneBinding.continueButton;
            $r4.m38034d();
            return;
        }
        KudiButton $r42 = fragmentPhoneBinding.continueButton;
        $r42.m38035c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: handleRegisterActivity$lambda-7  reason: not valid java name */
    public static final void m40464handleRegisterActivity$lambda7(FragmentPhoneBinding fragmentPhoneBinding, PhoneFragment phoneFragment, View view) {
        Log_OC.getArray(fragmentPhoneBinding, "$binding");
        Log_OC.getArray(phoneFragment, "this$0");
        KudiInputField $r3 = fragmentPhoneBinding.phoneNumberInputField;
        String $r4 = $r3.getText();
        SmartLookAnalytics $r5 = phoneFragment.getSmartLookAnalytics();
        $r5.setUserId($r4);
        PhoneAndBvnViewModel $r6 = phoneFragment.getVm();
        $r6.logOnPhoneNoEntered($r4);
        phoneFragment.onContinueClicked(true);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean hasReadPhoneStatePermission() {
        Context $r1 = requireContext();
        int $i0 = C1335a.m36327a($r1, "android.permission.READ_PHONE_STATE");
        return $i0 == 0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void onContinueClicked(boolean z) {
        InterfaceC8209a $r1 = requireBinding();
        FragmentPhoneBinding $r2 = (FragmentPhoneBinding) $r1;
        boolean $z1 = hasReadPhoneStatePermission();
        if (!$z1 && z) {
            requestPermission();
            this.permissionActionFlag = 1;
            return;
        }
        cacheImei();
        TextView $r3 = $r2.nameView;
        String $r4 = getString(C0001R.string.phone_no_question);
        $r3.setText($r4);
        TextView $r32 = $r2.nameView;
        Context $r5 = requireContext();
        int $i0 = C1335a.m36324d($r5, C0001R.color.white);
        $r32.setTextColor($i0);
        boolean $z12 = getActivity() instanceof RegisterActivity;
        if (!$z12) {
            FragmentActivity $r6 = getActivity();
            if ($r6 == null) {
                NullPointerException $r11 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.settings.ui.BvnExistingAgentActivity");
                throw $r11;
            }
            BvnExistingAgentActivity $r10 = (BvnExistingAgentActivity) $r6;
            KudiInputField $r9 = $r2.phoneNumberInputField;
            String $r42 = $r9.getText();
            $r10.navigateToBvnNinView($r42, "", "");
        } else if (z) {
            BaseViewModel $r7 = getViewModel();
            PhoneAndBvnViewModel $r8 = (PhoneAndBvnViewModel) $r7;
            KudiInputField $r92 = $r2.phoneNumberInputField;
            String $r43 = $r92.getText();
            $r8.performPhoneNumberLookUp($r43);
        }
        ContextExtKt.hideKeyboard(this);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void onLoginClicked() {
        boolean $z0 = hasReadPhoneStatePermission();
        if (!$z0) {
            this.permissionActionFlag = 1;
            requestPermission();
            return;
        }
        cacheImei();
        BaseViewModel $r1 = getViewModel();
        PhoneAndBvnViewModel $r2 = (PhoneAndBvnViewModel) $r1;
        InterfaceC8209a $r3 = requireBinding();
        FragmentPhoneBinding $r4 = (FragmentPhoneBinding) $r3;
        KudiInputField $r5 = $r4.phoneNumberInputField;
        String $r6 = $r5.getText();
        $r2.toLoginView($r6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-0  reason: not valid java name */
    public static final void m40465onViewCreated$lambda0(PhoneFragment phoneFragment, View view) {
        Log_OC.getArray(phoneFragment, "this$0");
        phoneFragment.onLoginClicked();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void requestPermission() {
        FragmentActivity $r1 = requireActivity();
        String[] $r2 = {"android.permission.READ_PHONE_STATE"};
        C1291a.m36466q($r1, $r2, 1000);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        PhoneAndBvnViewData $r2 = (PhoneAndBvnViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void applyViewData(ai.kudi.agent.register.p022v2.p023ui.viewModels.data.PhoneAndBvnViewData r25) {
        /*
            r24 = this;
            java.lang.String r2 = "viewData"
            r0 = r25
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r2)
            r0 = r24
            g.x.a r3 = r0.requireBinding()
            r5 = r3
            ai.kudi.agent.databinding.FragmentPhoneBinding r5 = (ai.kudi.agent.databinding.FragmentPhoneBinding) r5
            r4 = r5
            r0 = r25
            boolean r6 = r0.isOtpSending()
            if (r6 != 0) goto L30
            r0 = r25
            boolean r6 = r0.isLookingUpBvn()
            if (r6 != 0) goto L30
            r0 = r25
            boolean r6 = r0.isLookingUpPhoneNumber()
            if (r6 == 0) goto L2a
            goto L30
        L2a:
            ai.kudi.dip.library.button.KudiButton r7 = r4.continueButton
            r7.m38033e()
            goto L35
        L30:
            ai.kudi.dip.library.button.KudiButton r7 = r4.continueButton
            r7.m38032f()
        L35:
            r0 = r25
            ai.kudi.agent.login.domain.wiki.CreateTempAgentResponse r8 = r0.getCreateTempAgentResponse()
            if (r8 != 0) goto L3e
            goto La1
        L3e:
            r0 = r24
            androidx.fragment.app.FragmentActivity r9 = r0.getActivity()
            boolean r6 = r9 instanceof ai.kudi.agent.register.p022v2.p023ui.RegisterActivity
            if (r6 == 0) goto L6c
            r0 = r24
            androidx.fragment.app.FragmentActivity r9 = r0.getActivity()
            if (r9 == 0) goto L64
            r11 = r9
            ai.kudi.agent.register.v2.ui.RegisterActivity r11 = (ai.kudi.agent.register.p022v2.p023ui.RegisterActivity) r11
            r10 = r11
            ai.kudi.dip.library.edittext.KudiInputField r12 = r4.phoneNumberInputField
            java.lang.String r13 = r12.getText()
            java.lang.String r14 = r8.getRegisterationId()
            java.lang.String r2 = ""
            r10.navigateToBvnNinView(r13, r2, r14)
            goto L98
        L64:
            java.lang.NullPointerException r15 = new java.lang.NullPointerException
            java.lang.String r2 = "null cannot be cast to non-null type ai.kudi.agent.register.v2.ui.RegisterActivity"
            r15.<init>(r2)
            throw r15
        L6c:
            boolean r6 = r9 instanceof ai.kudi.agent.settings.p029ui.BvnExistingAgentActivity
            if (r6 == 0) goto L98
            r0 = r24
            androidx.fragment.app.FragmentActivity r9 = r0.getActivity()
            if (r9 == 0) goto L90
            r17 = r9
            ai.kudi.agent.settings.ui.BvnExistingAgentActivity r17 = (ai.kudi.agent.settings.p029ui.BvnExistingAgentActivity) r17
            r16 = r17
            ai.kudi.dip.library.edittext.KudiInputField r12 = r4.phoneNumberInputField
            java.lang.String r13 = r12.getText()
            java.lang.String r14 = r8.getRegisterationId()
            java.lang.String r2 = ""
            r0 = r16
            r0.navigateToBvnNinView(r13, r2, r14)
            goto L98
        L90:
            java.lang.NullPointerException r15 = new java.lang.NullPointerException
            java.lang.String r2 = "null cannot be cast to non-null type ai.kudi.agent.settings.ui.BvnExistingAgentActivity"
            r15.<init>(r2)
            throw r15
        L98:
            r18 = 0
            r0 = r25
            r1 = r18
            r0.setCreateTempAgentResponse(r1)
        La1:
            r0 = r25
            ai.kudi.agent.register.v2.ui.viewModels.data.PhoneAndBvnViewData$Error r19 = r0.getError()
            if (r19 != 0) goto Laa
            return
        Laa:
            ai.kudi.dip.library.edittext.KudiInputField r12 = r4.phoneNumberInputField
            r0 = r19
            java.lang.String r13 = r0.getPhoneNumber()
            r12.setError(r13)
            r0 = r19
            java.lang.String r13 = r0.getMessage()
            if (r13 != 0) goto Lbe
            return
        Lbe:
            android.widget.TextView r0 = r4.nameView
            r20 = r0
            r0.setText(r13)
            android.widget.TextView r0 = r4.nameView
            r20 = r0
            r0 = r24
            android.content.Context r21 = r0.requireContext()
            r23 = 2131099659(0x7f06000b, float:1.7811677E38)
            r0 = r21
            r1 = r23
            int r22 = androidx.core.content.C1335a.m36324d(r0, r1)
            r0 = r20
            r1 = r22
            r0.setTextColor(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.register.p022v2.p023ui.PhoneFragment.applyViewData(ai.kudi.agent.register.v2.ui.viewModels.data.PhoneAndBvnViewData):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        PhoneAndBvnViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public PhoneAndBvnViewModel createViewModel() {
        PhoneAndBvnViewModel $r1 = getVm();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SharedPreferences getSharedPrefs() {
        SharedPreferences $r1 = this.sharedPrefs;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("sharedPrefs");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SmartLookAnalytics getSmartLookAnalytics() {
        SmartLookAnalytics $r1 = this.smartLookAnalytics;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("smartLookAnalytics");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return PhoneAndBvnViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final PhoneAndBvnViewModel getVm() {
        PhoneAndBvnViewModel $r1 = this.srv;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("vm");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isNewUser() {
        boolean z0 = this.isNewUser;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        super.onAttach(context);
        FragmentActivity $r2 = getActivity();
        boolean $z0 = $r2 instanceof RegisterActivity;
        if ($z0) {
            FragmentActivity $r22 = getActivity();
            if ($r22 == null) {
                NullPointerException $r5 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.register.v2.ui.RegisterActivity");
                throw $r5;
            }
            RegisterActivity $r3 = (RegisterActivity) $r22;
            RegistrationSubComponent $r4 = $r3.getRegistrationV2SubComponent();
            $r4.inject(this);
            return;
        }
        boolean $z02 = $r2 instanceof BvnExistingAgentActivity;
        if ($z02) {
            FragmentActivity $r23 = getActivity();
            if ($r23 == null) {
                NullPointerException $r52 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.settings.ui.BvnExistingAgentActivity");
                throw $r52;
            }
            BvnExistingAgentActivity $r6 = (BvnExistingAgentActivity) $r23;
            BvnVerificationSubcomponent $r7 = $r6.getBvnVerificationSubComponent();
            $r7.inject(this);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentPhoneBinding $r4 = FragmentPhoneBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        View $r5 = initBinding($r4, this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Log_OC.getArray(strArr, "permissions");
        Log_OC.getArray(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 1000) {
            int $i0 = iArr.length;
            boolean $z0 = $i0 == 0;
            if (!$z0) {
                int $i02 = iArr[0];
                if ($i02 == 0) {
                    int $i03 = this.permissionActionFlag;
                    if ($i03 == 1) {
                        onContinueClicked(true);
                        return;
                    } else if ($i03 != 2) {
                        return;
                    } else {
                        onLoginClicked();
                        return;
                    }
                }
            }
            FragmentActivity $r2 = requireActivity();
            $r2.onBackPressed();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        InterfaceC8209a $r3 = requireBinding();
        FragmentPhoneBinding $r4 = (FragmentPhoneBinding) $r3;
        FragmentActivity $r5 = getActivity();
        boolean $z0 = $r5 instanceof RegisterActivity;
        if ($z0) {
            handleRegisterActivity();
        } else {
            handleBvnRegForExistingUser();
        }
        BottomLoginViewBinding $r6 = $r4.loginView;
        TextView $r7 = $r6.loginButton;
        $r7.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.register.v2.ui.EulaActivity$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PhoneFragment $r2 = PhoneFragment.this;
                PhoneFragment.m40465onViewCreated$lambda0($r2, view2);
            }
        });
        Bundle $r2 = getArguments();
        if ($r2 != null) {
            Bundle $r9 = requireArguments();
            boolean $z02 = $r9.containsKey("phoneNo");
            if ($z02) {
                KudiInputField $r10 = $r4.phoneNumberInputField;
                String $r11 = $r2.getString("phoneNo");
                String $r12 = $r11;
                if ($r11 == null) {
                    $r12 = "";
                }
                $r10.setText($r12);
            }
        }
        FragmentActivity $r52 = getActivity();
        boolean $z03 = $r52 instanceof BvnExistingAgentActivity;
        if ($z03) {
            BottomLoginViewBinding $r62 = $r4.loginView;
            View $r13 = $r62.getRoot();
            Log_OC.loadImage($r13, "binding.loginView.root");
            View $r1 = $r13;
            ViewExtKt.hide$default($r1, false, 1, null);
            KudiInputField $r102 = $r4.phoneNumberInputField;
            EditText $r14 = $r102.getEditText();
            $r14.setFocusable(false);
            $r14.setClickable(false);
            $r14.setLongClickable(false);
        }
    }

    public final void setNewUser(boolean z) {
        this.isNewUser = z;
    }

    public final void setSharedPrefs(SharedPreferences sharedPreferences) {
        Log_OC.getArray(sharedPreferences, "<set-?>");
        this.sharedPrefs = sharedPreferences;
    }

    public final void setSmartLookAnalytics(SmartLookAnalytics smartLookAnalytics) {
        Log_OC.getArray(smartLookAnalytics, "<set-?>");
        this.smartLookAnalytics = smartLookAnalytics;
    }

    public final void setVm(PhoneAndBvnViewModel phoneAndBvnViewModel) {
        Log_OC.getArray(phoneAndBvnViewModel, "<set-?>");
        this.srv = phoneAndBvnViewModel;
    }
}
