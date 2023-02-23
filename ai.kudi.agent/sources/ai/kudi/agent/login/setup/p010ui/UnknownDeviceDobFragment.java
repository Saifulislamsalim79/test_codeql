package ai.kudi.agent.login.setup.p010ui;

import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.DateExtKt;
import ai.kudi.agent.core.util.LocationUtil;
import ai.kudi.agent.databinding.FragmentUnknownDeviceDobBinding;
import ai.kudi.agent.dialogs.DatePickerFragment;
import ai.kudi.agent.login.domain.LoginParams;
import ai.kudi.agent.login.game.components.DeviceVerificationSubcomponent;
import ai.kudi.agent.login.p011ui.LoginActivity;
import ai.kudi.agent.login.setup.DashboardData;
import ai.kudi.agent.login.setup.viewModels.UnknownDeviceDobViewModel;
import ai.kudi.agent.login.setup.viewModels.data.UnknownDeviceDobViewData;
import ai.kudi.agent.register.domain.wiki.OtpVerificationModel;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p058os.C1372b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.InterfaceC1523w;
import androidx.lifecycle.PreferenceActivity;
import com.google.android.gms.location.C4107a;
import java.io.Serializable;
import java.util.Date;
import kotlin.C13287o;
import kotlin.C13664u;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: UnknownDeviceDobFragment.kt */
@Metadata(m10422d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\u0018\u0000 ,2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001,B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0003H\u0014J\b\u0010\u0010\u001a\u00020\u0002H\u0014J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0014J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0012\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J$\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J-\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020!2\u000e\u0010\"\u001a\n\u0012\u0006\b\u0001\u0012\u00020$0#2\u0006\u0010%\u001a\u00020&H\u0016¢\u0006\u0002\u0010'J\b\u0010(\u001a\u00020\u000eH\u0002J\u001a\u0010)\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\u001a2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010+\u001a\u00020\u000eH\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006-"}, m10421d2 = {"Lai/kudi/agent/login/setup/ui/UnknownDeviceDobFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/login/setup/viewModels/UnknownDeviceDobViewModel;", "Lai/kudi/agent/login/setup/viewModels/data/UnknownDeviceDobViewData;", "Lai/kudi/agent/databinding/FragmentUnknownDeviceDobBinding;", "()V", "otpVerificationModel", "Lai/kudi/agent/register/domain/dto/OtpVerificationModel;", "unknownDeviceDobViewModel", "getUnknownDeviceDobViewModel", "()Lai/kudi/agent/login/setup/viewModels/UnknownDeviceDobViewModel;", "setUnknownDeviceDobViewModel", "(Lai/kudi/agent/login/setup/viewModels/UnknownDeviceDobViewModel;)V", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onVerifyButtonClicked", "onViewCreated", "view", "showDatePicker", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.login.setup.ui.UnknownDeviceDobFragment */
/* loaded from: classes.dex */
public final class UnknownDeviceDobFragment extends BaseMVVMViewBindingFragment<UnknownDeviceDobViewModel, UnknownDeviceDobViewData, FragmentUnknownDeviceDobBinding> {
    public static final Companion Companion;
    public static final String OTP_MODEL = "OTP MODEL";
    private OtpVerificationModel otpVerificationModel;
    public UnknownDeviceDobViewModel unknownDeviceDobViewModel;

    /* compiled from: UnknownDeviceDobFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/login/setup/ui/UnknownDeviceDobFragment$Companion;", "", "()V", "OTP_MODEL", "", "newInstance", "Lai/kudi/agent/login/setup/ui/UnknownDeviceDobFragment;", "otpVerificationModel", "Lai/kudi/agent/register/domain/dto/OtpVerificationModel;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.login.setup.ui.UnknownDeviceDobFragment$Companion */
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
        public final UnknownDeviceDobFragment newInstance(OtpVerificationModel otpVerificationModel) {
            Log_OC.getArray(otpVerificationModel, "otpVerificationModel");
            UnknownDeviceDobFragment $r2 = new UnknownDeviceDobFragment();
            C13287o $r4 = C13664u.m4227a(UnknownDeviceDobFragment.OTP_MODEL, otpVerificationModel);
            C13287o[] $r3 = {$r4};
            Bundle $r5 = C1372b.m36174a($r3);
            $r2.setArguments($r5);
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
    public static final UnknownDeviceDobFragment newInstance(OtpVerificationModel otpVerificationModel) {
        Companion $r0 = Companion;
        UnknownDeviceDobFragment $r1 = $r0.newInstance(otpVerificationModel);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void onVerifyButtonClicked() {
        FragmentActivity $r3 = requireActivity();
        Log_OC.loadImage($r3, "requireActivity()");
        LocationUtil $r1 = new LocationUtil($r3);
        Context $r5 = requireContext();
        C4107a $r4 = new C4107a($r5);
        UnknownDeviceDobFragment$onVerifyButtonClicked$1 $r2 = new UnknownDeviceDobFragment$onVerifyButtonClicked$1(this);
        LocationUtil.getLastLocation$default($r1, $r4, 0, $r2, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-3$lambda-2  reason: not valid java name */
    public static final void m39777onViewCreated$lambda3$lambda2(UnknownDeviceDobFragment unknownDeviceDobFragment, View view) {
        Log_OC.getArray(unknownDeviceDobFragment, "this$0");
        unknownDeviceDobFragment.onVerifyButtonClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void showDatePicker() {
        ContextExtKt.hideKeyboard(this);
        DatePickerFragment.Companion $r1 = DatePickerFragment.Companion;
        DatePickerFragment $r2 = DatePickerFragment.Companion.newInstance$default($r1, true, null, false, 6, null);
        FragmentManager $r3 = getChildFragmentManager();
        PreferenceActivity $r4 = getViewLifecycleOwner();
        $r3.p1(DatePickerFragment.DATE_SET_KEY, $r4, new InterfaceC1523w() { // from class: ai.kudi.agent.login.setup.ui.b
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: c */
            public final void m38739c(String str, Bundle bundle) {
                UnknownDeviceDobFragment $r32 = UnknownDeviceDobFragment.this;
                UnknownDeviceDobFragment.m39778showDatePicker$lambda1($r32, str, bundle);
            }
        });
        FragmentManager $r32 = getChildFragmentManager();
        $r2.show($r32, DatePickerFragment.year);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: showDatePicker$lambda-1  reason: not valid java name */
    public static final void m39778showDatePicker$lambda1(UnknownDeviceDobFragment unknownDeviceDobFragment, String str, Bundle bundle) {
        Log_OC.getArray(unknownDeviceDobFragment, "this$0");
        Log_OC.getArray(str, "requestKey");
        Log_OC.getArray(bundle, "result");
        boolean $z0 = Log_OC.append(str, DatePickerFragment.DATE_SET_KEY);
        if ($z0) {
            Serializable $r3 = bundle.getSerializable(DatePickerFragment.DATE_KEY);
            if ($r3 == null) {
                NullPointerException $r8 = new NullPointerException("null cannot be cast to non-null type java.util.Date");
                throw $r8;
            }
            Date $r4 = (Date) $r3;
            String $r1 = DateExtKt.convertDateToGivenFormat($r4, "yyyy-MM-dd");
            InterfaceC8209a $r5 = unknownDeviceDobFragment.requireBinding();
            FragmentUnknownDeviceDobBinding $r6 = (FragmentUnknownDeviceDobBinding) $r5;
            KudiInputField $r7 = $r6.dobInputField;
            $r7.setText($r1);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        UnknownDeviceDobViewData $r2 = (UnknownDeviceDobViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(UnknownDeviceDobViewData unknownDeviceDobViewData) {
        Log_OC.getArray(unknownDeviceDobViewData, "viewData");
        boolean $z0 = unknownDeviceDobViewData instanceof UnknownDeviceDobViewData.Error;
        if ($z0) {
            Context $r2 = requireContext();
            Log_OC.loadImage($r2, "requireContext()");
            String $r4 = ((UnknownDeviceDobViewData.Error) unknownDeviceDobViewData).getMessage();
            ContextExtKt.toast$default($r2, $r4, 0, 2, (Object) null);
            return;
        }
        UnknownDeviceDobViewData.HideLoading $r5 = UnknownDeviceDobViewData.HideLoading.INSTANCE;
        boolean $z02 = Log_OC.append(unknownDeviceDobViewData, $r5);
        if ($z02) {
            InterfaceC8209a $r6 = requireBinding();
            KudiButton $r8 = ((FragmentUnknownDeviceDobBinding) $r6).verifyButton;
            $r8.m38033e();
            return;
        }
        UnknownDeviceDobViewData.Initial $r9 = UnknownDeviceDobViewData.Initial.INSTANCE;
        boolean $z03 = Log_OC.append(unknownDeviceDobViewData, $r9);
        if ($z03) {
            return;
        }
        UnknownDeviceDobViewData.Loading $r10 = UnknownDeviceDobViewData.Loading.INSTANCE;
        boolean $z04 = Log_OC.append(unknownDeviceDobViewData, $r10);
        if ($z04) {
            InterfaceC8209a $r62 = requireBinding();
            FragmentUnknownDeviceDobBinding $r7 = (FragmentUnknownDeviceDobBinding) $r62;
            KudiButton $r82 = $r7.verifyButton;
            $r82.m38032f();
            return;
        }
        boolean $z05 = unknownDeviceDobViewData instanceof UnknownDeviceDobViewData.LoginSuccess;
        if ($z05) {
            UnknownDeviceDobViewData.LoginSuccess $r11 = (UnknownDeviceDobViewData.LoginSuccess) unknownDeviceDobViewData;
            DashboardData $r12 = $r11.getDashboardData();
            Context $r22 = requireContext();
            boolean $z06 = $r12.isKCashEnabled();
            boolean $z2 = $r12.isNewUser();
            boolean $z3 = $r12.isC2C();
            boolean $z4 = $r12.isHq();
            boolean $z5 = $r12.isOutlet();
            String $r42 = $r12.getCustomerType();
            int $i0 = $r42.length();
            boolean $z1 = $i0 == 0;
            String $r43 = $z1 ? "AGENT" : $r12.getCustomerType();
            LoginParams $r13 = LoginParams.INSTANCE;
            Log_OC.loadImage($r22, "requireContext()");
            LoginParams.buildLoginIntent$default($r13, $r22, $z2, $z06, $z3, $z4, $z5, $r43, false, 128, null);
            return;
        }
        boolean $z12 = unknownDeviceDobViewData instanceof UnknownDeviceDobViewData.NavigateToBusinessInfo;
        if ($z12) {
            UnknownDeviceDobViewData.NavigateToBusinessInfo $r14 = (UnknownDeviceDobViewData.NavigateToBusinessInfo) unknownDeviceDobViewData;
            Context $r23 = requireContext();
            DashboardData $r122 = $r14.getDashboardData();
            boolean $z13 = $r122.isNewUser();
            DashboardData $r123 = $r14.getDashboardData();
            boolean $z07 = $r123.isKCashEnabled();
            DashboardData $r124 = $r14.getDashboardData();
            boolean $z22 = $r124.isC2C();
            DashboardData $r125 = $r14.getDashboardData();
            boolean $z32 = $r125.isOutlet();
            DashboardData $r126 = $r14.getDashboardData();
            boolean $z42 = $r126.isHq();
            DashboardData $r127 = $r14.getDashboardData();
            String $r44 = $r127.getCustomerType();
            LoginParams $r132 = LoginParams.INSTANCE;
            Log_OC.loadImage($r23, "requireContext()");
            LoginParams.buildLoginIntent$default($r132, $r23, $z13, $z07, $z22, $z42, $z32, $r44, false, 128, null);
            return;
        }
        boolean $z14 = unknownDeviceDobViewData instanceof UnknownDeviceDobViewData.NavigateToLogin;
        if ($z14) {
            ContextExtKt.launchActivity$default((Fragment) this, false, LoginActivity.class, (InterfaceC11767l) null, 5, (Object) null);
            return;
        }
        boolean $z15 = unknownDeviceDobViewData instanceof UnknownDeviceDobViewData.BvnError;
        if ($z15) {
            InterfaceC8209a $r63 = requireBinding();
            FragmentUnknownDeviceDobBinding $r72 = (FragmentUnknownDeviceDobBinding) $r63;
            KudiInputField $r15 = $r72.bvnInputField;
            UnknownDeviceDobViewData.BvnError $r16 = (UnknownDeviceDobViewData.BvnError) unknownDeviceDobViewData;
            int $i02 = $r16.getMessage();
            String $r45 = getString($i02);
            $r15.setError($r45);
            return;
        }
        boolean $z16 = unknownDeviceDobViewData instanceof UnknownDeviceDobViewData.DobError;
        if ($z16) {
            InterfaceC8209a $r64 = requireBinding();
            FragmentUnknownDeviceDobBinding $r73 = (FragmentUnknownDeviceDobBinding) $r64;
            KudiInputField $r152 = $r73.dobInputField;
            UnknownDeviceDobViewData.DobError $r17 = (UnknownDeviceDobViewData.DobError) unknownDeviceDobViewData;
            int $i03 = $r17.getMessage();
            String $r46 = getString($i03);
            $r152.setError($r46);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        UnknownDeviceDobViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public UnknownDeviceDobViewModel createViewModel() {
        UnknownDeviceDobViewModel $r1 = getUnknownDeviceDobViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final UnknownDeviceDobViewModel getUnknownDeviceDobViewModel() {
        UnknownDeviceDobViewModel $r1 = this.unknownDeviceDobViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("unknownDeviceDobViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return UnknownDeviceDobViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        boolean $z0 = context instanceof AccountVerificationHolderActivity;
        if ($z0) {
            AccountVerificationHolderActivity $r3 = (AccountVerificationHolderActivity) context;
            DeviceVerificationSubcomponent $r2 = $r3.getDeviceVerificationSubComponent();
            $r2.inject(this);
        }
        super.onAttach(context);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle $r1 = getArguments();
        if ($r1 == null) {
            return;
        }
        Parcelable $r2 = $r1.getParcelable(OTP_MODEL);
        OtpVerificationModel $r3 = (OtpVerificationModel) $r2;
        this.otpVerificationModel = $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentUnknownDeviceDobBinding $r4 = FragmentUnknownDeviceDobBinding.inflate(layoutInflater, viewGroup, false);
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
        if (i == 1000) {
            int $i0 = iArr.length;
            boolean $z0 = $i0 == 0;
            if (!$z0) {
                int $i02 = iArr[0];
                if ($i02 == 0) {
                    onVerifyButtonClicked();
                    return;
                }
            }
            LocationUtil.Companion $r4 = LocationUtil.Companion;
            Context $r1 = requireContext();
            Log_OC.loadImage($r1, "requireContext()");
            $r4.handleDeniedPermission($r1);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        InterfaceC8209a $r2 = requireBinding();
        FragmentUnknownDeviceDobBinding $r5 = (FragmentUnknownDeviceDobBinding) $r2;
        ViewGroup $r6 = $r5.verifyButton;
        ViewGroup r11 = $r6;
        r11.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.login.setup.ui.k
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                UnknownDeviceDobFragment $r22 = UnknownDeviceDobFragment.this;
                UnknownDeviceDobFragment.m39777onViewCreated$lambda3$lambda2($r22, view2);
            }
        });
        KudiInputField $r7 = $r5.dobInputField;
        $r7.disableEditablity();
        KudiInputField $r72 = $r5.dobInputField;
        UnknownDeviceDobFragment$onViewCreated$1$2 r10 = new UnknownDeviceDobFragment$onViewCreated$1$2(this);
        $r72.setClickedListener(r10);
    }

    public final void setUnknownDeviceDobViewModel(UnknownDeviceDobViewModel unknownDeviceDobViewModel) {
        Log_OC.getArray(unknownDeviceDobViewModel, "<set-?>");
        this.unknownDeviceDobViewModel = unknownDeviceDobViewModel;
    }
}
