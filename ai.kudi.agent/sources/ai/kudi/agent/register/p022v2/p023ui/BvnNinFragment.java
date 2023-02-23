package ai.kudi.agent.register.p022v2.p023ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.databinding.FragmentBvnNinBinding;
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
import android.widget.TextView;
import androidx.core.content.C1335a;
import androidx.fragment.app.Chapter;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: BvnNinFragment.kt */
@Metadata(m10422d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 -2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001-B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0003H\u0014J\b\u0010\u001a\u001a\u00020\u0018H\u0003J\b\u0010\u001b\u001a\u00020\u0002H\u0014J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u0018H\u0002J\u0010\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u0018H\u0002J$\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u001a\u0010+\u001a\u00020\u00182\u0006\u0010,\u001a\u00020$2\b\u0010)\u001a\u0004\u0018\u00010*H\u0017R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\r\u0010\u0005\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006."}, m10421d2 = {"Lai/kudi/agent/register/v2/ui/BvnNinFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/register/v2/ui/viewModels/PhoneAndBvnViewModel;", "Lai/kudi/agent/register/v2/ui/viewModels/data/PhoneAndBvnViewData;", "Lai/kudi/agent/databinding/FragmentBvnNinBinding;", "()V", "isNewUser", "", "()Z", "setNewUser", "(Z)V", "sharedPrefs", "Landroid/content/SharedPreferences;", "getSharedPrefs$annotations", "getSharedPrefs", "()Landroid/content/SharedPreferences;", "setSharedPrefs", "(Landroid/content/SharedPreferences;)V", "vm", "getVm", "()Lai/kudi/agent/register/v2/ui/viewModels/PhoneAndBvnViewModel;", "setVm", "(Lai/kudi/agent/register/v2/ui/viewModels/PhoneAndBvnViewModel;)V", "applyViewData", "", "viewData", "cacheImei", "createViewModel", "getVMType", "Ljava/lang/Class;", "handleBvnRegForExistingUser", "onAttach", "context", "Landroid/content/Context;", "onContinueClicked", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.register.v2.ui.BvnNinFragment */
/* loaded from: classes.dex */
public final class BvnNinFragment extends BaseMVVMViewBindingFragment<PhoneAndBvnViewModel, PhoneAndBvnViewData, FragmentBvnNinBinding> {
    public static final Companion Companion;
    private boolean isNewUser;
    public SharedPreferences sharedPrefs;
    public PhoneAndBvnViewModel srv;

    /* compiled from: BvnNinFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/register/v2/ui/BvnNinFragment$Companion;", "", "()V", "newInstance", "Lai/kudi/agent/register/v2/ui/BvnNinFragment;", "phoneNumber", "", PhoneFragment.ARG_BVN, "regId", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.register.v2.ui.BvnNinFragment$Companion */
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
        public final BvnNinFragment newInstance(String str, String str2, String str3) {
            BvnNinFragment $r3 = new BvnNinFragment();
            Bundle $r4 = new Bundle();
            $r4.putString("phoneNo", str);
            $r4.putString(PhoneFragment.ARG_BVN, str2);
            $r4.putString(PhoneFragment.ARG_REG, str3);
            $r3.setArguments($r4);
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
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.register.p022v2.p023ui.BvnNinFragment.cacheImei():void");
    }

    public static /* synthetic */ void getSharedPrefs$annotations() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void handleBvnRegForExistingUser() {
        InterfaceC8209a $r1 = requireBinding();
        FragmentBvnNinBinding $r2 = (FragmentBvnNinBinding) $r1;
        KudiButton $r3 = $r2.continueButton;
        $r3.m38034d();
        View $r4 = $r2.bvnInputField;
        Log_OC.loadImage($r4, "bvnInputField");
        View r8 = $r4;
        ViewExtKt.show(r8);
        TextView $r5 = $r2.learnMore;
        Log_OC.loadImage($r5, "learnMore");
        ViewExtKt.show($r5);
        ViewGroup $r32 = $r2.continueButton;
        ViewGroup r9 = $r32;
        r9.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.register.v2.ui.NumberPicker
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BvnNinFragment $r22 = BvnNinFragment.this;
                BvnNinFragment.m40440handleBvnRegForExistingUser$lambda2$lambda1($r22, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleBvnRegForExistingUser$lambda-2$lambda-1  reason: not valid java name */
    public static final void m40440handleBvnRegForExistingUser$lambda2$lambda1(BvnNinFragment bvnNinFragment, View view) {
        Log_OC.getArray(bvnNinFragment, "this$0");
        bvnNinFragment.onContinueClicked();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void onContinueClicked() {
        InterfaceC8209a $r2 = requireBinding();
        FragmentBvnNinBinding $r3 = (FragmentBvnNinBinding) $r2;
        cacheImei();
        TextView $r4 = $r3.bvnView;
        String $r5 = getString(C0001R.string.provide_bvn_nin_text);
        $r4.setText($r5);
        TextView $r42 = $r3.bvnView;
        Context $r6 = requireContext();
        int $i0 = C1335a.m36324d($r6, C0001R.color.white);
        $r42.setTextColor($i0);
        FragmentActivity $r7 = getActivity();
        boolean $z0 = $r7 instanceof RegisterActivity;
        if ($z0) {
            Bundle $r8 = requireArguments();
            String $r9 = $r8.getString("phoneNo");
            String $r10 = $r9;
            if ($r9 == null) {
                $r10 = "";
            }
            KudiInputField $r11 = $r3.bvnInputField;
            String $r92 = $r11.getText();
            Bundle $r82 = requireArguments();
            String $r12 = $r82.getString(PhoneFragment.ARG_REG);
            String $r52 = $r12 != null ? $r12 : "";
            PhoneAndBvnViewModel.LookUpType.NewAgent $r13 = PhoneAndBvnViewModel.LookUpType.NewAgent.INSTANCE;
            BaseViewModel $r14 = getViewModel();
            PhoneAndBvnViewModel $r15 = (PhoneAndBvnViewModel) $r14;
            $r15.checkBvnExistence($r92, $r10, $r13, $r52);
        } else {
            BaseViewModel $r142 = getViewModel();
            PhoneAndBvnViewModel $r152 = (PhoneAndBvnViewModel) $r142;
            KudiInputField $r112 = $r3.bvnInputField;
            String $r53 = $r112.getText();
            Bundle $r83 = requireArguments();
            String $r102 = $r83.getString("phoneNo");
            if ($r102 == null) {
                $r102 = "";
            }
            PhoneAndBvnViewModel.LookUpType.ExistingAgent $r1 = PhoneAndBvnViewModel.LookUpType.ExistingAgent.INSTANCE;
            PhoneAndBvnViewModel.checkBvnExistence$default($r152, $r53, $r102, $r1, null, 8, null);
        }
        ContextExtKt.hideKeyboard(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-0  reason: not valid java name */
    public static final void m40441onViewCreated$lambda0(BvnNinFragment bvnNinFragment, View view) {
        Log_OC.getArray(bvnNinFragment, "this$0");
        PhoneAndBvnViewModel $r2 = bvnNinFragment.getVm();
        FragmentActivity $r3 = bvnNinFragment.getActivity();
        boolean $z0 = $r3 instanceof RegisterActivity;
        $r2.logLearnMoreClicked($z0);
        WhyWeCollectBvnBottomSheet r8 = new WhyWeCollectBvnBottomSheet();
        FragmentManager $r5 = bvnNinFragment.getChildFragmentManager();
        String $r7 = WhyWeCollectBvnBottomSheet.class.getCanonicalName();
        Chapter r9 = (Chapter) r8;
        r9.show($r5, $r7);
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
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void applyViewData(ai.kudi.agent.register.p022v2.p023ui.viewModels.data.PhoneAndBvnViewData r18) {
        /*
            r17 = this;
            java.lang.String r1 = "viewData"
            r0 = r18
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r1)
            r0 = r17
            g.x.a r2 = r0.requireBinding()
            r4 = r2
            ai.kudi.agent.databinding.FragmentBvnNinBinding r4 = (ai.kudi.agent.databinding.FragmentBvnNinBinding) r4
            r3 = r4
            r0 = r18
            boolean r5 = r0.isOtpSending()
            if (r5 != 0) goto L30
            r0 = r18
            boolean r5 = r0.isLookingUpBvn()
            if (r5 != 0) goto L30
            r0 = r18
            boolean r5 = r0.isLookingUpPhoneNumber()
            if (r5 == 0) goto L2a
            goto L30
        L2a:
            ai.kudi.dip.library.button.KudiButton r6 = r3.continueButton
            r6.m38033e()
            goto L35
        L30:
            ai.kudi.dip.library.button.KudiButton r6 = r3.continueButton
            r6.m38032f()
        L35:
            r0 = r18
            ai.kudi.agent.login.domain.wiki.CreateTempAgentResponse r7 = r0.getCreateTempAgentResponse()
            if (r7 != 0) goto L3e
            goto L56
        L3e:
            ai.kudi.dip.library.edittext.KudiInputField r8 = r3.bvnInputField
            java.lang.String r1 = "binding.bvnInputField"
            kotlin.p483e0.p485d.Log_OC.loadImage(r8, r1)
            r10 = r8
            android.view.View r10 = (android.view.View) r10
            r9 = r10
            ai.kudi.agent.core.util.ViewExtKt.show(r9)
            android.widget.TextView r11 = r3.learnMore
            java.lang.String r1 = "binding.learnMore"
            kotlin.p483e0.p485d.Log_OC.loadImage(r11, r1)
            ai.kudi.agent.core.util.ViewExtKt.show(r11)
        L56:
            r0 = r18
            ai.kudi.agent.register.v2.ui.viewModels.data.PhoneAndBvnViewData$Error r12 = r0.getError()
            if (r12 != 0) goto L5f
            return
        L5f:
            ai.kudi.dip.library.edittext.KudiInputField r8 = r3.bvnInputField
            java.lang.String r13 = r12.getBvn()
            r8.setError(r13)
            java.lang.String r13 = r12.getMessage()
            if (r13 != 0) goto L6f
            return
        L6f:
            android.widget.TextView r11 = r3.bvnView
            r11.setText(r13)
            android.widget.TextView r11 = r3.bvnView
            r0 = r17
            android.content.Context r14 = r0.requireContext()
            r16 = 2131099659(0x7f06000b, float:1.7811677E38)
            r0 = r16
            int r15 = androidx.core.content.C1335a.m36324d(r14, r0)
            r11.setTextColor(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.register.p022v2.p023ui.BvnNinFragment.applyViewData(ai.kudi.agent.register.v2.ui.viewModels.data.PhoneAndBvnViewData):void");
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
        FragmentBvnNinBinding $r4 = FragmentBvnNinBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        View $r5 = initBinding($r4, this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        handleBvnRegForExistingUser();
        InterfaceC8209a $r1 = requireBinding();
        FragmentBvnNinBinding $r4 = (FragmentBvnNinBinding) $r1;
        TextView $r5 = $r4.learnMore;
        $r5.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.register.v2.ui.g
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BvnNinFragment $r2 = BvnNinFragment.this;
                BvnNinFragment.m40441onViewCreated$lambda0($r2, view2);
            }
        });
    }

    public final void setNewUser(boolean z) {
        this.isNewUser = z;
    }

    public final void setSharedPrefs(SharedPreferences sharedPreferences) {
        Log_OC.getArray(sharedPreferences, "<set-?>");
        this.sharedPrefs = sharedPreferences;
    }

    public final void setVm(PhoneAndBvnViewModel phoneAndBvnViewModel) {
        Log_OC.getArray(phoneAndBvnViewModel, "<set-?>");
        this.srv = phoneAndBvnViewModel;
    }
}
