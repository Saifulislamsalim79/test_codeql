package ai.kudi.agent.register.verifybvn;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.crashreport.CrashlyticsReport;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.CustomDialog;
import ai.kudi.agent.databinding.FragmentVerifyBvnPictureBinding;
import ai.kudi.agent.faceverification.FaceVerificationFragment;
import ai.kudi.agent.register.domain.wiki.RegistrationInfo;
import ai.kudi.agent.register.p022v2.p023ui.RegisterActivity;
import ai.kudi.agent.register.xmpp.components.RegistrationSubComponent;
import ai.kudi.agent.settings.mcc.components.BvnVerificationSubcomponent;
import ai.kudi.agent.settings.p029ui.BvnExistingAgentActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC1449b0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
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
import p590o.p591a.Timber;
/* compiled from: VerifyBvnPictureFragment.kt */
@Metadata(m10422d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 /2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001/B\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0003H\u0014J\b\u0010\u0015\u001a\u00020\u0002H\u0014J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0014J\b\u0010\u0018\u001a\u00020\u0013H\u0003J\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0013H\u0016J\u0012\u0010\u001d\u001a\u00020\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J$\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0010\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020(H\u0002J\u0010\u0010)\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010*\u001a\u00020\u00132\u0006\u0010+\u001a\u00020(H\u0016J\u001a\u0010,\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010.\u001a\u00020\u0013H\u0002R\u001d\u0010\u0007\u001a\u0004\u0018\u00010\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001e\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u00060"}, m10421d2 = {"Lai/kudi/agent/register/verifybvn/VerifyBvnPictureFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/register/verifybvn/VerifyBvnPictureViewModel;", "Lai/kudi/agent/core/mvvm/ViewData;", "Lai/kudi/agent/databinding/FragmentVerifyBvnPictureBinding;", "Lai/kudi/agent/faceverification/FaceVerificationFragment$OnFragmentInteractionListener;", "()V", "registrationInfo", "Lai/kudi/agent/register/domain/dto/RegistrationInfo;", "getRegistrationInfo", "()Lai/kudi/agent/register/domain/dto/RegistrationInfo;", "registrationInfo$delegate", "Lkotlin/Lazy;", "viewModel", "getViewModel", "()Lai/kudi/agent/register/verifybvn/VerifyBvnPictureViewModel;", "setViewModel", "(Lai/kudi/agent/register/verifybvn/VerifyBvnPictureViewModel;)V", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "observeViewModel", "onAttach", "context", "Landroid/content/Context;", "onCancelButtonAction", "onContinueButtonAction", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onFaceVerificationFailed", "imageId", "", "onFaceVerified", "onPictureUploadSuccessful", "pictureId", "onViewCreated", "view", "startFaceVerification", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class VerifyBvnPictureFragment extends BaseMVVMViewBindingFragment<VerifyBvnPictureViewModel, ViewData, FragmentVerifyBvnPictureBinding> implements FaceVerificationFragment.OnFragmentInteractionListener {
    private static final String ARGS_REG_INFO = "ARGS_REG_INFO";
    public static final Companion Companion;
    private final InterfaceC11824h registrationInfo$delegate;
    public VerifyBvnPictureViewModel viewModel;

    /* compiled from: VerifyBvnPictureFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/register/verifybvn/VerifyBvnPictureFragment$Companion;", "", "()V", VerifyBvnPictureFragment.ARGS_REG_INFO, "", "newInstance", "Lai/kudi/agent/register/verifybvn/VerifyBvnPictureFragment;", "registrationInfo", "Lai/kudi/agent/register/domain/dto/RegistrationInfo;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
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
        public final VerifyBvnPictureFragment newInstance(RegistrationInfo registrationInfo) {
            Log_OC.getArray(registrationInfo, "registrationInfo");
            VerifyBvnPictureFragment $r3 = new VerifyBvnPictureFragment();
            Bundle $r1 = new Bundle();
            $r1.putParcelable(VerifyBvnPictureFragment.ARGS_REG_INFO, registrationInfo);
            C13666w c13666w = C13666w.f30112a;
            $r3.setArguments($r1);
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
    public VerifyBvnPictureFragment() {
        InterfaceC11824h $r1;
        VerifyBvnPictureFragment$registrationInfo$2 $r2 = new VerifyBvnPictureFragment$registrationInfo$2(this);
        $r1 = C13218k.m5625b($r2);
        this.registrationInfo$delegate = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final RegistrationInfo getRegistrationInfo() {
        InterfaceC11824h $r2 = this.registrationInfo$delegate;
        Object $r1 = $r2.getValue();
        RegistrationInfo $r3 = (RegistrationInfo) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void observeViewModel() {
        VerifyBvnPictureViewModel $r2 = getViewModel();
        C11680b $r3 = $r2.getOnFaceVerified();
        PreferenceActivity $r4 = getViewLifecycleOwner();
        Log_OC.loadImage($r4, "viewLifecycleOwner");
        AbstractC11688p $r5 = C7390a.a($r3, $r4);
        Object object = new Object() { // from class: ai.kudi.agent.register.verifybvn.Property
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                VerifyBvnPictureFragment $r1 = VerifyBvnPictureFragment.this;
                RegistrationInfo $r32 = (RegistrationInfo) obj;
                $r1.onFaceVerified($r32);
            }
        };
        Chunk $r1 = Chunk.NEWLINE;
        $r5.e0(object, $r1);
        VerifyBvnPictureViewModel $r22 = getViewModel();
        C11680b $r32 = $r22.getOnFaceVerificationFailed();
        PreferenceActivity $r42 = getViewLifecycleOwner();
        Log_OC.loadImage($r42, "viewLifecycleOwner");
        AbstractC11688p $r52 = C7390a.a($r32, $r42);
        Object object2 = new Object() { // from class: ai.kudi.agent.register.verifybvn.FromMatchesFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                VerifyBvnPictureFragment $r12 = VerifyBvnPictureFragment.this;
                String $r33 = (String) obj;
                $r12.onFaceVerificationFailed($r33);
            }
        };
        Token $r8 = Token.GREATER_THAN;
        $r52.e0(object2, $r8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: observeViewModel$lambda-0  reason: not valid java name */
    public static final void m40496observeViewModel$lambda0(Throwable th) {
        Log_OC.loadImage(th, "it");
        CrashlyticsReport.logException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: observeViewModel$lambda-1  reason: not valid java name */
    public static final void m40497observeViewModel$lambda1(Throwable th) {
        Log_OC.loadImage(th, "it");
        CrashlyticsReport.logException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onFaceVerificationFailed(String str) {
        CustomDialog.Companion $r1 = CustomDialog.Companion;
        Context $r4 = requireContext();
        Log_OC.loadImage($r4, "requireContext()");
        String $r3 = getString(C0001R.string.face_verification_failed_message);
        Log_OC.loadImage($r3, "getString(R.string.face_verification_failed_message)");
        String $r5 = getString(C0001R.string.retry);
        Log_OC.loadImage($r5, "getString(R.string.retry)");
        VerifyBvnPictureFragment$onFaceVerificationFailed$1 $r2 = new VerifyBvnPictureFragment$onFaceVerificationFailed$1(this);
        CustomDialog.Companion.show$default($r1, $r4, $r3, $r5, false, true, true, (InterfaceC11756a) $r2, 8, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onFaceVerified(RegistrationInfo registrationInfo) {
        FragmentManager $r2 = getChildFragmentManager();
        Fragment $r3 = $r2.m35938g0(FaceVerificationFragment.PAGE_KEY);
        boolean $z0 = $r3 instanceof FaceVerificationFragment;
        FaceVerificationFragment $r4 = $z0 ? (FaceVerificationFragment) $r3 : null;
        String $r5 = Log_OC.m10359a("verificationFragment: ", $r4);
        Object[] $r6 = new Object[0];
        Timber.wtf($r5, $r6);
        if ($r4 == null) {
            return;
        }
        $r4.onVerificationSuccessful(registrationInfo);
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
        FaceVerificationFragment $r5 = FaceVerificationFragment.Companion.newInstance$default($r4, null, 1, null);
        $r32.m35820s(C0001R.C0003id.verify_bvn_picture_container, $r5, FaceVerificationFragment.PAGE_KEY);
        $r32.mo35805i();
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
        VerifyBvnPictureViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public VerifyBvnPictureViewModel createViewModel() {
        VerifyBvnPictureViewModel $r1 = getViewModel();
        return $r1;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return VerifyBvnPictureViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public final VerifyBvnPictureViewModel getViewModel() {
        VerifyBvnPictureViewModel $r1 = this.viewModel;
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

    @Override // ai.kudi.agent.faceverification.FaceVerificationFragment.OnFragmentInteractionListener
    public void onCancelButtonAction() {
        startFaceVerification();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.faceverification.FaceVerificationFragment.OnFragmentInteractionListener
    public void onContinueButtonAction(RegistrationInfo registrationInfo) {
        VerifyBvnPictureViewModel $r2 = getViewModel();
        $r2.onContinueButtonAction(registrationInfo);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentVerifyBvnPictureBinding $r4 = FragmentVerifyBvnPictureBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        View $r5 = initBinding($r4, this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.faceverification.FaceVerificationFragment.OnFragmentInteractionListener
    public void onPictureUploadSuccessful(String str) {
        Log_OC.getArray(str, "pictureId");
        VerifyBvnPictureViewModel $r2 = getViewModel();
        FragmentActivity $r3 = requireActivity();
        boolean $z0 = $r3 instanceof RegisterActivity;
        RegistrationInfo $r4 = getRegistrationInfo();
        if ($r4 != null) {
            $r2.verifyImage(str, $z0, $r4);
            return;
        }
        String $r1 = "Required value was null.".toString();
        IllegalArgumentException $r5 = new IllegalArgumentException($r1);
        throw $r5;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        observeViewModel();
        startFaceVerification();
    }

    public final void setViewModel(VerifyBvnPictureViewModel verifyBvnPictureViewModel) {
        Log_OC.getArray(verifyBvnPictureViewModel, "<set-?>");
        this.viewModel = verifyBvnPictureViewModel;
    }
}
