package ai.kudi.agent.login.setup.p010ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.databinding.FragmentNewDeviceVerificationOptionBinding;
import ai.kudi.agent.faceverification.FaceVerificationFragment;
import ai.kudi.agent.login.game.components.DeviceVerificationSubcomponent;
import ai.kudi.agent.login.setup.p010ui.AccountVerificationHolderActivity;
import ai.kudi.agent.login.setup.p010ui.UnknownDeviceFaceVerificationFragment;
import ai.kudi.agent.login.setup.viewModels.NewDeviceVerificationViewModel;
import ai.kudi.agent.login.setup.viewModels.data.NewDeviceVerificationViewData;
import ai.kudi.agent.register.domain.wiki.OtpVerificationModel;
import ai.kudi.agent.register.domain.wiki.RegistrationStatus;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: NewDeviceVerificationOptionFragment.kt */
@Metadata(m10422d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 '2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001'B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0003H\u0014J\b\u0010\u0016\u001a\u00020\u0002H\u0014J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018H\u0014J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0012\u0010\u001c\u001a\u00020\u00142\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J$\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u001a\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020 2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, m10421d2 = {"Lai/kudi/agent/login/setup/ui/NewDeviceVerificationOptionFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/login/setup/viewModels/NewDeviceVerificationViewModel;", "Lai/kudi/agent/login/setup/viewModels/data/NewDeviceVerificationViewData;", "Lai/kudi/agent/databinding/FragmentNewDeviceVerificationOptionBinding;", "()V", "accountVerificationHolderActivity", "Lai/kudi/agent/login/setup/ui/AccountVerificationHolderActivity;", "newDeviceVerificationViewModel", "getNewDeviceVerificationViewModel", "()Lai/kudi/agent/login/setup/viewModels/NewDeviceVerificationViewModel;", "setNewDeviceVerificationViewModel", "(Lai/kudi/agent/login/setup/viewModels/NewDeviceVerificationViewModel;)V", "otpVerificationModel", "Lai/kudi/agent/register/domain/dto/OtpVerificationModel;", "sendToSecondaryPhoneNo", "", "type", "", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.login.setup.ui.NewDeviceVerificationOptionFragment */
/* loaded from: classes.dex */
public final class NewDeviceVerificationOptionFragment extends BaseMVVMViewBindingFragment<NewDeviceVerificationViewModel, NewDeviceVerificationViewData, FragmentNewDeviceVerificationOptionBinding> {
    public static final Companion Companion;
    private AccountVerificationHolderActivity accountVerificationHolderActivity;
    public NewDeviceVerificationViewModel newDeviceVerificationViewModel;
    private OtpVerificationModel otpVerificationModel;
    private boolean sendToSecondaryPhoneNo;
    private String type = "";

    /* compiled from: NewDeviceVerificationOptionFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/login/setup/ui/NewDeviceVerificationOptionFragment$Companion;", "", "()V", "newInstance", "Lai/kudi/agent/login/setup/ui/NewDeviceVerificationOptionFragment;", "type", "", "otpVerificationModel", "Lai/kudi/agent/register/domain/dto/OtpVerificationModel;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.login.setup.ui.NewDeviceVerificationOptionFragment$Companion */
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
        public final NewDeviceVerificationOptionFragment newInstance(String str, OtpVerificationModel otpVerificationModel) {
            Log_OC.getArray(str, "type");
            Log_OC.getArray(otpVerificationModel, "otpVerificationModel");
            NewDeviceVerificationOptionFragment $r4 = new NewDeviceVerificationOptionFragment();
            Bundle $r2 = new Bundle();
            $r2.putString(AccountVerificationHolderActivity.ACCOUNT_VERIFICATION_TYPE, str);
            AccountVerificationHolderActivity.Companion $r5 = AccountVerificationHolderActivity.Companion;
            String $r3 = $r5.getACCOUNT_HOLDER_EXTRA();
            $r2.putParcelable($r3, otpVerificationModel);
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
    public static final NewDeviceVerificationOptionFragment newInstance(String str, OtpVerificationModel otpVerificationModel) {
        Companion $r1 = Companion;
        NewDeviceVerificationOptionFragment $r2 = $r1.newInstance(str, otpVerificationModel);
        return $r2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-7$lambda-2  reason: not valid java name */
    public static final void m39773onViewCreated$lambda7$lambda2(NewDeviceVerificationOptionFragment newDeviceVerificationOptionFragment, View view) {
        Log_OC.getArray(newDeviceVerificationOptionFragment, "this$0");
        OtpVerificationModel $r3 = newDeviceVerificationOptionFragment.otpVerificationModel;
        if ($r3 == null) {
            return;
        }
        NewDeviceVerificationViewModel $r4 = newDeviceVerificationOptionFragment.getNewDeviceVerificationViewModel();
        String $r5 = $r3.getPhoneNumber();
        $r4.logVerifyFaceVerification($r5);
        AccountVerificationHolderActivity $r0 = newDeviceVerificationOptionFragment.accountVerificationHolderActivity;
        if ($r0 == null) {
            return;
        }
        UnknownDeviceFaceVerificationFragment.Companion $r6 = UnknownDeviceFaceVerificationFragment.Companion;
        FaceVerificationFragment.TYPES $r7 = FaceVerificationFragment.TYPES.LOGIN;
        String $r52 = $r7.name();
        UnknownDeviceFaceVerificationFragment $r8 = $r6.newInstance($r3, $r52);
        AppCompatActivityExtKt.startFragment$default((AppCompatActivity) $r0, $r8, C0001R.C0003id.container, false, false, false, 28, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-7$lambda-4  reason: not valid java name */
    public static final void m39774onViewCreated$lambda7$lambda4(NewDeviceVerificationOptionFragment newDeviceVerificationOptionFragment, View view) {
        Log_OC.getArray(newDeviceVerificationOptionFragment, "this$0");
        newDeviceVerificationOptionFragment.sendToSecondaryPhoneNo = true;
        OtpVerificationModel $r0 = newDeviceVerificationOptionFragment.otpVerificationModel;
        if ($r0 == null) {
            return;
        }
        $r0.setSendToSecondaryNumber(true);
        NewDeviceVerificationViewModel $r1 = newDeviceVerificationOptionFragment.getNewDeviceVerificationViewModel();
        $r1.sendOtp($r0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-7$lambda-6  reason: not valid java name */
    public static final void m39775onViewCreated$lambda7$lambda6(NewDeviceVerificationOptionFragment newDeviceVerificationOptionFragment, View view) {
        Log_OC.getArray(newDeviceVerificationOptionFragment, "this$0");
        newDeviceVerificationOptionFragment.sendToSecondaryPhoneNo = false;
        OtpVerificationModel $r0 = newDeviceVerificationOptionFragment.otpVerificationModel;
        if ($r0 == null) {
            return;
        }
        $r0.setSendToSecondaryNumber(false);
        NewDeviceVerificationViewModel $r1 = newDeviceVerificationOptionFragment.getNewDeviceVerificationViewModel();
        $r1.sendOtp($r0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        NewDeviceVerificationViewData $r2 = (NewDeviceVerificationViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(NewDeviceVerificationViewData newDeviceVerificationViewData) {
        Log_OC.getArray(newDeviceVerificationViewData, "viewData");
        InterfaceC8209a $r2 = requireBinding();
        FragmentNewDeviceVerificationOptionBinding $r3 = (FragmentNewDeviceVerificationOptionBinding) $r2;
        boolean $z0 = newDeviceVerificationViewData.isLoading();
        if ($z0) {
            View $r4 = $r3.loaderView;
            Log_OC.loadImage($r4, "loaderView");
            View r10 = $r4;
            ViewExtKt.show(r10);
            $r3.loaderView.m32588f();
            TextView $r5 = $r3.primaryPhoneVerificationButton;
            Log_OC.loadImage($r5, "primaryPhoneVerificationButton");
            ViewExtKt.hide$default($r5, false, 1, null);
            TextView $r52 = $r3.secondaryPhoneNumberVerificationButton;
            Log_OC.loadImage($r52, "secondaryPhoneNumberVerificationButton");
            ViewExtKt.hide$default($r52, false, 1, null);
            TextView $r53 = $r3.verifyWithFaceButton;
            Log_OC.loadImage($r53, "verifyWithFaceButton");
            ViewExtKt.hide$default($r53, false, 1, null);
        } else {
            $r3.loaderView.m32587g();
            View $r42 = $r3.loaderView;
            Log_OC.loadImage($r42, "loaderView");
            View r102 = $r42;
            ViewExtKt.hide$default(r102, false, 1, null);
            String $r6 = this.type;
            RegistrationStatus $r7 = RegistrationStatus.FACE_VERIFICATION_NEEDED;
            String $r8 = $r7.name();
            boolean $z02 = Log_OC.append($r6, $r8);
            if ($z02) {
                TextView $r54 = $r3.verifyWithFaceButton;
                Log_OC.loadImage($r54, "verifyWithFaceButton");
                ViewExtKt.show($r54);
            } else {
                TextView $r55 = $r3.primaryPhoneVerificationButton;
                Log_OC.loadImage($r55, "primaryPhoneVerificationButton");
                ViewExtKt.show($r55);
                TextView $r56 = $r3.secondaryPhoneNumberVerificationButton;
                Log_OC.loadImage($r56, "secondaryPhoneNumberVerificationButton");
                ViewExtKt.show($r56);
            }
        }
        String $r62 = newDeviceVerificationViewData.getError();
        if ($r62 == null) {
            return;
        }
        FragmentActivity $r9 = requireActivity();
        Log_OC.loadImage($r9, "requireActivity()");
        ContextExtKt.toast$default($r9, $r62, 0, 2, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        NewDeviceVerificationViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public NewDeviceVerificationViewModel createViewModel() {
        NewDeviceVerificationViewModel $r1 = getNewDeviceVerificationViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final NewDeviceVerificationViewModel getNewDeviceVerificationViewModel() {
        NewDeviceVerificationViewModel $r1 = this.newDeviceVerificationViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("newDeviceVerificationViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return NewDeviceVerificationViewModel.class;
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
            this.accountVerificationHolderActivity = $r3;
            DeviceVerificationSubcomponent $r1 = $r3.getDeviceVerificationSubComponent();
            $r1.inject(this);
        }
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
        String $r2 = $r1.getString(AccountVerificationHolderActivity.ACCOUNT_VERIFICATION_TYPE);
        this.type = $r2;
        AccountVerificationHolderActivity.Companion $r3 = AccountVerificationHolderActivity.Companion;
        String $r22 = $r3.getACCOUNT_HOLDER_EXTRA();
        Parcelable $r4 = $r1.getParcelable($r22);
        OtpVerificationModel $r5 = (OtpVerificationModel) $r4;
        this.otpVerificationModel = $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentNewDeviceVerificationOptionBinding $r4 = FragmentNewDeviceVerificationOptionBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(\n                inflater,\n                container,\n                false\n            )");
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
        InterfaceC8209a $r3 = requireBinding();
        FragmentNewDeviceVerificationOptionBinding $r4 = (FragmentNewDeviceVerificationOptionBinding) $r3;
        String $r5 = this.type;
        RegistrationStatus $r6 = RegistrationStatus.FACE_VERIFICATION_NEEDED;
        String $r7 = $r6.name();
        boolean $z0 = Log_OC.append($r5, $r7);
        if ($z0) {
            TextView $r8 = $r4.deviceTrustText;
            String $r52 = getString(C0001R.string.face_verification_text_new_device);
            $r8.setText($r52);
            TextView $r82 = $r4.secondaryPhoneNumberVerificationButton;
            Log_OC.loadImage($r82, "secondaryPhoneNumberVerificationButton");
            ViewExtKt.hide$default($r82, false, 1, null);
            TextView $r83 = $r4.primaryPhoneVerificationButton;
            Log_OC.loadImage($r83, "primaryPhoneVerificationButton");
            ViewExtKt.hide$default($r83, false, 1, null);
            TextView $r84 = $r4.verifyWithFaceButton;
            Log_OC.loadImage($r84, "verifyWithFaceButton");
            ViewExtKt.show($r84);
        } else {
            TextView $r85 = $r4.secondaryPhoneNumberVerificationButton;
            Log_OC.loadImage($r85, "secondaryPhoneNumberVerificationButton");
            ViewExtKt.show($r85);
            TextView $r86 = $r4.primaryPhoneVerificationButton;
            Log_OC.loadImage($r86, "primaryPhoneVerificationButton");
            ViewExtKt.show($r86);
            TextView $r87 = $r4.verifyWithFaceButton;
            Log_OC.loadImage($r87, "verifyWithFaceButton");
            ViewExtKt.hide$default($r87, false, 1, null);
        }
        $r4.verifyWithFaceButton.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.login.setup.ui.e
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                NewDeviceVerificationOptionFragment $r2 = NewDeviceVerificationOptionFragment.this;
                NewDeviceVerificationOptionFragment.m39773onViewCreated$lambda7$lambda2($r2, view2);
            }
        });
        $r4.secondaryPhoneNumberVerificationButton.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.login.setup.ui.FileSelectionFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                NewDeviceVerificationOptionFragment $r2 = NewDeviceVerificationOptionFragment.this;
                NewDeviceVerificationOptionFragment.m39774onViewCreated$lambda7$lambda4($r2, view2);
            }
        });
        $r4.primaryPhoneVerificationButton.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.login.setup.ui.d
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                NewDeviceVerificationOptionFragment $r2 = NewDeviceVerificationOptionFragment.this;
                NewDeviceVerificationOptionFragment.m39775onViewCreated$lambda7$lambda6($r2, view2);
            }
        });
    }

    public final void setNewDeviceVerificationViewModel(NewDeviceVerificationViewModel newDeviceVerificationViewModel) {
        Log_OC.getArray(newDeviceVerificationViewModel, "<set-?>");
        this.newDeviceVerificationViewModel = newDeviceVerificationViewModel;
    }
}
