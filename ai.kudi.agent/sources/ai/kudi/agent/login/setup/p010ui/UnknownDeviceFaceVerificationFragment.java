package ai.kudi.agent.login.setup.p010ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.crashreport.CrashlyticsReport;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.CustomDialog;
import ai.kudi.agent.databinding.FragmentUnknownDeviceFaceVerificationBinding;
import ai.kudi.agent.faceverification.FaceVerificationFragment;
import ai.kudi.agent.login.domain.wiki.FaceLoginVerificationRequest;
import ai.kudi.agent.login.game.components.DeviceVerificationSubcomponent;
import ai.kudi.agent.login.setup.presenters.UnknownDeviceFaceVerificationViewModel;
import ai.kudi.agent.register.domain.wiki.OtpVerificationModel;
import ai.kudi.agent.register.domain.wiki.RegistrationInfo;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC1449b0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.PreferenceActivity;
import com.trello.rxlifecycle2.p190e.p191a.p192a.C7390a;
import kotlin.C13218k;
import kotlin.C13666w;
import kotlin.InterfaceC11824h;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p450e0.Object;
import p425j.p444e.p471k0.C11680b;
/* compiled from: UnknownDeviceFaceVerificationFragment.kt */
@Metadata(m10422d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 72\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u00017B\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0003H\u0014J\b\u0010\u001a\u001a\u00020\u0002H\u0014J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001cH\u0014J\b\u0010\u001d\u001a\u00020\u0018H\u0003J\u0010\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u0018H\u0016J\u0012\u0010\"\u001a\u00020\u00182\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J$\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u0010\u0010-\u001a\u00020\u00182\u0006\u0010.\u001a\u00020\u000eH\u0002J\u0010\u0010/\u001a\u00020\u00182\u0006\u00100\u001a\u00020\u000eH\u0002J\u0010\u00101\u001a\u00020\u00182\u0006\u00102\u001a\u00020\u000eH\u0016J\u001a\u00103\u001a\u00020\u00182\u0006\u00104\u001a\u00020&2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u00105\u001a\u00020\u0018H\u0002J\u0010\u00106\u001a\u00020\u00182\u0006\u00102\u001a\u00020\u000eH\u0002R\u001d\u0010\u0007\u001a\u0004\u0018\u00010\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001d\u0010\r\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u00068"}, m10421d2 = {"Lai/kudi/agent/login/setup/ui/UnknownDeviceFaceVerificationFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/login/setup/presenters/UnknownDeviceFaceVerificationViewModel;", "Lai/kudi/agent/core/mvvm/ViewData;", "Lai/kudi/agent/databinding/FragmentUnknownDeviceFaceVerificationBinding;", "Lai/kudi/agent/faceverification/FaceVerificationFragment$OnFragmentInteractionListener;", "()V", "otpVerificationModel", "Lai/kudi/agent/register/domain/dto/OtpVerificationModel;", "getOtpVerificationModel", "()Lai/kudi/agent/register/domain/dto/OtpVerificationModel;", "otpVerificationModel$delegate", "Lkotlin/Lazy;", "type", "", "getType", "()Ljava/lang/String;", "type$delegate", "viewModel", "getViewModel", "()Lai/kudi/agent/login/setup/presenters/UnknownDeviceFaceVerificationViewModel;", "setViewModel", "(Lai/kudi/agent/login/setup/presenters/UnknownDeviceFaceVerificationViewModel;)V", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "observeViewModel", "onAttach", "context", "Landroid/content/Context;", "onCancelButtonAction", "onContinueButtonAction", "registrationInfo", "Lai/kudi/agent/register/domain/dto/RegistrationInfo;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onFaceVerificationFailed", "imageId", "onFaceVerified", "phoneNumber", "onPictureUploadSuccessful", "pictureId", "onViewCreated", "view", "startFaceVerification", "verifyPhoto", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.login.setup.ui.UnknownDeviceFaceVerificationFragment */
/* loaded from: classes.dex */
public final class UnknownDeviceFaceVerificationFragment extends BaseMVVMViewBindingFragment<UnknownDeviceFaceVerificationViewModel, ViewData, FragmentUnknownDeviceFaceVerificationBinding> implements FaceVerificationFragment.OnFragmentInteractionListener {
    public static final Companion Companion;
    private static final String OTP_MODEL = "OTP_MODEL";
    private static final String TYPE = "TYPE";
    private final InterfaceC11824h otpVerificationModel$delegate;
    private final InterfaceC11824h type$delegate;
    public UnknownDeviceFaceVerificationViewModel viewModel;

    /* compiled from: UnknownDeviceFaceVerificationFragment.kt */
    @Metadata(m10422d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/login/setup/ui/UnknownDeviceFaceVerificationFragment$Companion;", "", "()V", UnknownDeviceFaceVerificationFragment.OTP_MODEL, "", "TYPE", "newInstance", "Lai/kudi/agent/login/setup/ui/UnknownDeviceFaceVerificationFragment;", "otpVerificationModel", "Lai/kudi/agent/register/domain/dto/OtpVerificationModel;", "type", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.login.setup.ui.UnknownDeviceFaceVerificationFragment$Companion */
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
        public static /* synthetic */ UnknownDeviceFaceVerificationFragment newInstance$default(Companion companion, OtpVerificationModel otpVerificationModel, String $r3, int i, Object obj) {
            int $i0 = i & 2;
            if ($i0 != 0) {
                FaceVerificationFragment.TYPES $r4 = FaceVerificationFragment.TYPES.SIGN_UP;
                $r3 = $r4.name();
            }
            UnknownDeviceFaceVerificationFragment $r5 = companion.newInstance(otpVerificationModel, $r3);
            return $r5;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final UnknownDeviceFaceVerificationFragment newInstance(OtpVerificationModel otpVerificationModel, String str) {
            Log_OC.getArray(otpVerificationModel, "otpVerificationModel");
            Log_OC.getArray(str, "type");
            UnknownDeviceFaceVerificationFragment $r4 = new UnknownDeviceFaceVerificationFragment();
            Bundle $r2 = new Bundle();
            $r2.putParcelable(UnknownDeviceFaceVerificationFragment.OTP_MODEL, otpVerificationModel);
            $r2.putString("TYPE", str);
            C13666w c13666w = C13666w.f30112a;
            $r4.setArguments($r2);
            return $r4;
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
    public UnknownDeviceFaceVerificationFragment() {
        InterfaceC11824h $r2;
        InterfaceC11824h $r22;
        UnknownDeviceFaceVerificationFragment$otpVerificationModel$2 $r1 = new UnknownDeviceFaceVerificationFragment$otpVerificationModel$2(this);
        $r2 = C13218k.m5625b($r1);
        this.otpVerificationModel$delegate = $r2;
        UnknownDeviceFaceVerificationFragment$type$2 $r3 = new UnknownDeviceFaceVerificationFragment$type$2(this);
        $r22 = C13218k.m5625b($r3);
        this.type$delegate = $r22;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final OtpVerificationModel getOtpVerificationModel() {
        InterfaceC11824h $r2 = this.otpVerificationModel$delegate;
        Object $r1 = $r2.getValue();
        OtpVerificationModel $r3 = (OtpVerificationModel) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final String getType() {
        InterfaceC11824h $r2 = this.type$delegate;
        Object $r1 = $r2.getValue();
        String $r3 = (String) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void observeViewModel() {
        UnknownDeviceFaceVerificationViewModel $r2 = getViewModel();
        C11680b $r3 = $r2.getOnFaceVerified();
        PreferenceActivity $r4 = getViewLifecycleOwner();
        Log_OC.loadImage($r4, "viewLifecycleOwner");
        AbstractC11688p $r5 = C7390a.a($r3, $r4);
        Object object = new Object() { // from class: ai.kudi.agent.login.setup.ui.FromMatchesFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                UnknownDeviceFaceVerificationFragment $r1 = UnknownDeviceFaceVerificationFragment.this;
                String $r32 = (String) obj;
                $r1.onFaceVerified($r32);
            }
        };
        Direction $r1 = Direction.f655N;
        $r5.e0(object, $r1);
        UnknownDeviceFaceVerificationViewModel $r22 = getViewModel();
        C11680b $r32 = $r22.getOnFaceVerificationFailed();
        PreferenceActivity $r42 = getViewLifecycleOwner();
        Log_OC.loadImage($r42, "viewLifecycleOwner");
        AbstractC11688p $r52 = C7390a.a($r32, $r42);
        Object object2 = new Object() { // from class: ai.kudi.agent.login.setup.ui.RxRingBuffer
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                UnknownDeviceFaceVerificationFragment $r12 = UnknownDeviceFaceVerificationFragment.this;
                String $r33 = (String) obj;
                $r12.onFaceVerificationFailed($r33);
            }
        };
        Chunk $r8 = Chunk.NEXTPAGE;
        $r52.e0(object2, $r8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: observeViewModel$lambda-0  reason: not valid java name */
    public static final void m39779observeViewModel$lambda0(Throwable th) {
        Log_OC.loadImage(th, "it");
        CrashlyticsReport.logException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: observeViewModel$lambda-1  reason: not valid java name */
    public static final void m39780observeViewModel$lambda1(Throwable th) {
        Log_OC.loadImage(th, "it");
        CrashlyticsReport.logException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onFaceVerificationFailed(String str) {
        String $r3 = getType();
        FaceVerificationFragment.TYPES $r4 = FaceVerificationFragment.TYPES.LOGIN;
        boolean $z0 = Log_OC.append($r3, $r4.name());
        if ($z0) {
            FragmentManager $r6 = getChildFragmentManager();
            Fragment $r7 = $r6.m35938g0(FaceVerificationFragment.PAGE_KEY);
            boolean $z02 = $r7 instanceof FaceVerificationFragment;
            FaceVerificationFragment faceVerificationFragment = $z02 ? (FaceVerificationFragment) $r7 : null;
            OtpVerificationModel $r9 = getOtpVerificationModel();
            if ($r9 == null || faceVerificationFragment == null) {
                return;
            }
            faceVerificationFragment.showVerifyWithBvn($r9, C0001R.C0003id.container);
            return;
        }
        CustomDialog.Companion $r1 = CustomDialog.Companion;
        Context $r10 = requireContext();
        Log_OC.loadImage($r10, "requireContext()");
        String $r32 = getString(C0001R.string.face_verification_failed_message);
        Log_OC.loadImage($r32, "getString(R.string.face_verification_failed_message)");
        String $r5 = getString(C0001R.string.retry);
        Log_OC.loadImage($r5, "getString(R.string.retry)");
        UnknownDeviceFaceVerificationFragment$onFaceVerificationFailed$2 $r2 = new UnknownDeviceFaceVerificationFragment$onFaceVerificationFailed$2(this);
        CustomDialog.Companion.show$default($r1, $r10, $r32, $r5, false, true, true, (InterfaceC11756a) $r2, 8, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onFaceVerified(String str) {
        FragmentManager $r2 = getChildFragmentManager();
        Fragment $r3 = $r2.m35938g0(FaceVerificationFragment.PAGE_KEY);
        boolean $z0 = $r3 instanceof FaceVerificationFragment;
        FaceVerificationFragment $r4 = $z0 ? (FaceVerificationFragment) $r3 : null;
        if ($r4 == null) {
            return;
        }
        $r4.onVerificationSuccessful(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void startFaceVerification() {
        FragmentManager $r1 = getChildFragmentManager();
        Fragment $r2 = $r1.m35938g0(FaceVerificationFragment.PAGE_KEY);
        if ($r2 != null) {
            FragmentManager $r12 = getChildFragmentManager();
            AbstractC1449b0 $r3 = $r12.m35924l();
            $r3.mo35798q($r2);
            $r3.mo35805i();
        }
        FragmentManager $r13 = getChildFragmentManager();
        AbstractC1449b0 $r32 = $r13.m35924l();
        FaceVerificationFragment.Companion $r4 = FaceVerificationFragment.Companion;
        FaceVerificationFragment.TYPES $r5 = FaceVerificationFragment.TYPES.LOGIN;
        String $r6 = $r5.name();
        FaceVerificationFragment $r7 = $r4.newInstance($r6);
        $r32.m35820s(C0001R.C0003id.verify_unknown_device_container, $r7, FaceVerificationFragment.PAGE_KEY);
        $r32.mo35805i();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void verifyPhoto(String str) {
        OtpVerificationModel $r4 = getOtpVerificationModel();
        if ($r4 == null) {
            return;
        }
        UnknownDeviceFaceVerificationViewModel $r5 = getViewModel();
        String $r6 = $r4.getDeviceId();
        String $r7 = $r4.getDeviceName();
        String $r8 = $r4.getLoginAttemptId();
        String $r9 = $r4.getImeiId();
        String $r1 = Build.VERSION.RELEASE;
        Log_OC.loadImage($r1, "RELEASE");
        FaceLoginVerificationRequest $r2 = new FaceLoginVerificationRequest($r6, $r7, $r1, str, $r9, $r8);
        String $r3 = $r4.getPhoneNumber();
        $r5.performFaceVerification($r2, $r3);
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected void applyViewData(ViewData viewData) {
        Log_OC.getArray(viewData, "viewData");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        UnknownDeviceFaceVerificationViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public UnknownDeviceFaceVerificationViewModel createViewModel() {
        UnknownDeviceFaceVerificationViewModel $r1 = getViewModel();
        return $r1;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return UnknownDeviceFaceVerificationViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public final UnknownDeviceFaceVerificationViewModel getViewModel() {
        UnknownDeviceFaceVerificationViewModel $r1 = this.viewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("viewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        super.onAttach(context);
        boolean $z0 = context instanceof AccountVerificationHolderActivity;
        if ($z0) {
            AccountVerificationHolderActivity $r3 = (AccountVerificationHolderActivity) context;
            DeviceVerificationSubcomponent $r1 = $r3.getDeviceVerificationSubComponent();
            $r1.inject(this);
        }
    }

    @Override // ai.kudi.agent.faceverification.FaceVerificationFragment.OnFragmentInteractionListener
    public void onCancelButtonAction() {
        startFaceVerification();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.faceverification.FaceVerificationFragment.OnFragmentInteractionListener
    public void onContinueButtonAction(RegistrationInfo registrationInfo) {
        OtpVerificationModel $r2 = getOtpVerificationModel();
        if ($r2 == null) {
            return;
        }
        UnknownDeviceFaceVerificationViewModel $r3 = getViewModel();
        String $r4 = $r2.getPhoneNumber();
        $r3.onContinueButtonAction($r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentUnknownDeviceFaceVerificationBinding $r4 = FragmentUnknownDeviceFaceVerificationBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(\n                inflater,\n                container,\n                false\n            )");
        View $r5 = initBinding($r4, this);
        return $r5;
    }

    @Override // ai.kudi.agent.faceverification.FaceVerificationFragment.OnFragmentInteractionListener
    public void onPictureUploadSuccessful(String str) {
        Log_OC.getArray(str, "pictureId");
        verifyPhoto(str);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        observeViewModel();
        startFaceVerification();
    }

    public final void setViewModel(UnknownDeviceFaceVerificationViewModel unknownDeviceFaceVerificationViewModel) {
        Log_OC.getArray(unknownDeviceFaceVerificationViewModel, "<set-?>");
        this.viewModel = unknownDeviceFaceVerificationViewModel;
    }
}
