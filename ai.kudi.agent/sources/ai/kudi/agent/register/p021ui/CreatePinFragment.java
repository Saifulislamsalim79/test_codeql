package ai.kudi.agent.register.p021ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.LocationUtil;
import ai.kudi.agent.core.util.ManageDevice;
import ai.kudi.agent.custom.views.pinentryview.PinEntryView;
import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import ai.kudi.agent.databinding.ViewRegisterCreatePinBinding;
import ai.kudi.agent.login.domain.wiki.ResetPinResponse;
import ai.kudi.agent.login.p011ui.LoginActivity;
import ai.kudi.agent.outlet_mgt.data.CreateOutletRequest;
import ai.kudi.agent.register.domain.wiki.RegistrationInfo;
import ai.kudi.agent.register.p021ui.viewmodels.CreatePinViewModel;
import ai.kudi.agent.register.p021ui.viewmodels.data.CreatePinViewData;
import ai.kudi.agent.register.p022v2.p023ui.RegisterActivity;
import ai.kudi.agent.register.xmpp.components.RegistrationSubComponent;
import ai.kudi.agent.settings.mcc.components.BvnVerificationSubcomponent;
import ai.kudi.agent.settings.p029ui.BvnExistingAgentActivity;
import ai.kudi.dip.library.button.KudiButton;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.core.content.C1335a;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.location.C4107a;
import com.google.android.gms.location.C4109b;
import com.google.android.gms.tasks.InterfaceC4454e;
import com.google.android.gms.tasks.Item;
import com.google.firebase.remoteconfig.Frame;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p215c.p216b.C7513a;
import p201g.p270x.InterfaceC8209a;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: CreatePinFragment.kt */
@Metadata(m10422d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\t\u0018\u0000 E2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001EB\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0003H\u0002J\u0010\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020\u0003H\u0014J\u0012\u0010$\u001a\u00020 2\b\u0010%\u001a\u0004\u0018\u00010&H\u0002J\b\u0010'\u001a\u00020\u0002H\u0014J\u000e\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020)H\u0014J\u0010\u0010*\u001a\u00020 2\u0006\u0010+\u001a\u00020,H\u0016J\u0012\u0010-\u001a\u00020 2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\b\u00100\u001a\u00020 H\u0002J$\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u0001062\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J-\u00107\u001a\u00020 2\u0006\u00108\u001a\u0002092\u000e\u0010:\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0;2\u0006\u0010<\u001a\u00020=H\u0016¢\u0006\u0002\u0010>J\b\u0010?\u001a\u00020 H\u0016J\u001a\u0010@\u001a\u00020 2\u0006\u0010A\u001a\u0002022\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u0010\u0010B\u001a\u00020 2\u0006\u0010C\u001a\u00020\tH\u0002J\b\u0010D\u001a\u00020 H\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006F"}, m10421d2 = {"Lai/kudi/agent/register/ui/CreatePinFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/register/ui/viewmodels/CreatePinViewModel;", "Lai/kudi/agent/register/ui/viewmodels/data/CreatePinViewData;", "Lai/kudi/agent/databinding/ViewRegisterCreatePinBinding;", "()V", "createOutletRequest", "Lai/kudi/agent/outlet_mgt/data/CreateOutletRequest;", "fromFrag", "", "isTermsChecked", "", "registrationInfo", "Lai/kudi/agent/register/domain/dto/RegistrationInfo;", "remoteConfig", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "getRemoteConfig", "()Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "setRemoteConfig", "(Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;)V", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "setSharedPreferences", "(Landroid/content/SharedPreferences;)V", "vm", "getVm", "()Lai/kudi/agent/register/ui/viewmodels/CreatePinViewModel;", "setVm", "(Lai/kudi/agent/register/ui/viewmodels/CreatePinViewModel;)V", "applyLoading", "", TransactionBreakDownItemType.DATA, "applyViewData", "viewData", "applyViewErrors", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "Lai/kudi/agent/register/ui/viewmodels/data/CreatePinViewData$Error;", "createViewModel", "getVMType", "Ljava/lang/Class;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateAccountClicked", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onViewCreated", "view", "openTermsAndConditions", IjkMediaPlayer.OnNativeInvokeListener.ARG_URL, "setupView", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.register.ui.CreatePinFragment */
/* loaded from: classes.dex */
public final class CreatePinFragment extends BaseMVVMViewBindingFragment<CreatePinViewModel, CreatePinViewData, ViewRegisterCreatePinBinding> {
    public static final String ARGS_FROM_FRAG = "FROM_FRAG";
    public static final String ARGS_PERSONAL_INFO = "ARGS_PERSONAL_INFO";
    public static final String ARGS_RESET_RESPONSE = "ARGS_RESET_RESPONSE";
    public static final String CREATE_OUTLET_REQUEST = "CREATE_OUTLET_REQUEST";
    public static final Companion Companion;
    public static final String TERMS_AND_CONDITION_URL = "https://kudi.co/terms/?header=disable";
    private CreateOutletRequest createOutletRequest;
    private String fromFrag = "";
    private boolean isTermsChecked;
    private RegistrationInfo registrationInfo;
    public Frame remoteConfig;
    public SharedPreferences sharedPreferences;
    public CreatePinViewModel srv;

    /* compiled from: CreatePinFragment.kt */
    @Metadata(m10422d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fJ*\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m10421d2 = {"Lai/kudi/agent/register/ui/CreatePinFragment$Companion;", "", "()V", "ARGS_FROM_FRAG", "", CreatePinFragment.ARGS_PERSONAL_INFO, CreatePinFragment.ARGS_RESET_RESPONSE, CreatePinFragment.CREATE_OUTLET_REQUEST, "TERMS_AND_CONDITION_URL", "newInstance", "Lai/kudi/agent/register/ui/CreatePinFragment;", "resetPinResponse", "Lai/kudi/agent/login/domain/dto/ResetPinResponse;", "registrationInfo", "Lai/kudi/agent/register/domain/dto/RegistrationInfo;", "fromFrag", "createOutletRequest", "Lai/kudi/agent/outlet_mgt/data/CreateOutletRequest;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.register.ui.CreatePinFragment$Companion */
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
        public static /* synthetic */ CreatePinFragment newInstance$default(Companion companion, ResetPinResponse $r3, int i, Object obj) {
            int $i0 = i & 1;
            if ($i0 != 0) {
                $r3 = null;
            }
            CreatePinFragment $r1 = companion.newInstance($r3);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ CreatePinFragment newInstance$default(Companion companion, RegistrationInfo $r2, String $r3, CreateOutletRequest $r4, int i, Object obj) {
            int $i1 = i & 1;
            if ($i1 != 0) {
                $r2 = null;
            }
            int $i12 = i & 2;
            if ($i12 != 0) {
                $r3 = null;
            }
            int $i0 = i & 4;
            if ($i0 != 0) {
                $r4 = null;
            }
            CreatePinFragment $r0 = companion.newInstance($r2, $r3, $r4);
            return $r0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final CreatePinFragment newInstance(ResetPinResponse resetPinResponse) {
            CreatePinFragment $r2 = new CreatePinFragment();
            Bundle $r3 = new Bundle();
            $r3.putParcelable(CreatePinFragment.ARGS_RESET_RESPONSE, resetPinResponse);
            $r2.setArguments($r3);
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final CreatePinFragment newInstance(RegistrationInfo registrationInfo, String str, CreateOutletRequest createOutletRequest) {
            CreatePinFragment $r3 = new CreatePinFragment();
            Bundle $r4 = new Bundle();
            $r4.putParcelable(CreatePinFragment.ARGS_PERSONAL_INFO, registrationInfo);
            $r4.putString(CreatePinFragment.ARGS_FROM_FRAG, str);
            $r4.putParcelable(CreatePinFragment.CREATE_OUTLET_REQUEST, createOutletRequest);
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
    public static final /* synthetic */ CreatePinViewModel access$getViewModel(CreatePinFragment createPinFragment) {
        BaseViewModel $r0 = createPinFragment.getViewModel();
        CreatePinViewModel $r2 = (CreatePinViewModel) $r0;
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void applyLoading(CreatePinViewData createPinViewData) {
        InterfaceC8209a $r2 = requireBinding();
        ViewRegisterCreatePinBinding $r3 = (ViewRegisterCreatePinBinding) $r2;
        boolean $z0 = createPinViewData.getLoading();
        if ($z0) {
            KudiButton $r4 = $r3.submitPinButton;
            $r4.m38032f();
            return;
        }
        KudiButton $r42 = $r3.submitPinButton;
        $r42.m38033e();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void applyViewErrors(CreatePinViewData.Error error) {
        String $r4;
        InterfaceC8209a $r2 = requireBinding();
        ViewRegisterCreatePinBinding viewRegisterCreatePinBinding = (ViewRegisterCreatePinBinding) $r2;
        if (error == null || ($r4 = error.getMessage()) == null) {
            return;
        }
        FragmentActivity $r5 = requireActivity();
        Log_OC.loadImage($r5, "requireActivity()");
        ContextExtKt.toast$default($r5, $r4, 0, 2, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void onCreateAccountClicked() {
        SharedPreferences $r3 = requireActivity().getSharedPreferences(ManageDevice.SECURE_DEVICE_PREFERENCE, 0);
        String $r5 = $r3.getString(ManageDevice.GENERATED_NAME, "");
        String $r6 = $r3.getString(ManageDevice.GENERATED_ID, "");
        FragmentActivity $r2 = requireActivity();
        Log_OC.loadImage($r2, "requireActivity()");
        ContextExtKt.hideKeyboard($r2);
        InterfaceC8209a $r7 = requireBinding();
        PinEntryView $r9 = ((ViewRegisterCreatePinBinding) $r7).pinEntryView;
        Editable $r10 = $r9.getText();
        String $r11 = $r10.toString();
        InterfaceC8209a $r72 = requireBinding();
        PinEntryView $r92 = ((ViewRegisterCreatePinBinding) $r72).pinEntryView;
        Editable $r102 = $r92.getText();
        String $r12 = $r102.toString();
        Bundle $r13 = requireArguments();
        Parcelable $r14 = $r13.getParcelable(ARGS_RESET_RESPONSE);
        ResetPinResponse $r15 = (ResetPinResponse) $r14;
        if ($r15 != null) {
            BaseViewModel $r16 = getViewModel();
            CreatePinViewModel $r17 = (CreatePinViewModel) $r16;
            String $r52 = $r15.getPhoneNumber();
            String $r4 = $r52 != null ? $r52 : "";
            boolean $z0 = this.isTermsChecked;
            $r17.resetPin($r4, $r11, $z0);
            return;
        }
        FragmentActivity $r22 = requireActivity();
        Log_OC.loadImage($r22, "requireActivity()");
        LocationUtil $r18 = new LocationUtil($r22);
        Context $r19 = requireContext();
        C4107a $r20 = C4109b.m28502b($r19);
        Log_OC.loadImage($r20, "getFusedLocationProviderClient(\n                    requireContext()\n                )");
        CreatePinFragment$onCreateAccountClicked$1 $r1 = new CreatePinFragment$onCreateAccountClicked$1(this, $r11, $r12, $r6, $r5);
        LocationUtil.getLastLocation$default($r18, $r20, 0, $r1, 2, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void openTermsAndConditions(String str) {
        Uri $r3 = Uri.parse(str);
        C7513a.C7514a $r4 = new C7513a.C7514a();
        FragmentActivity $r5 = requireActivity();
        int $i0 = C1335a.m36324d($r5, C0001R.color.colorPrimary);
        $r4.m18523c($i0);
        FragmentActivity $r52 = requireActivity();
        int $i02 = C1335a.m36324d($r52, C0001R.color.colorPrimaryDark);
        $r4.m18524b($i02);
        try {
            C7513a $r6 = $r4.m18525a();
            FragmentActivity $r53 = requireActivity();
            $r6.m18526a($r53, $r3);
        } catch (ActivityNotFoundException e) {
            FragmentActivity $r54 = getActivity();
            if ($r54 == null) {
                return;
            }
            ContextExtKt.toast$default($r54, "You do not have any browser installed.", 0, 2, (Object) null);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setupView() {
        InterfaceC8209a $r1 = requireBinding();
        ViewRegisterCreatePinBinding $r2 = (ViewRegisterCreatePinBinding) $r1;
        ViewGroup $r3 = $r2.submitPinButton;
        ViewGroup r12 = $r3;
        r12.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.register.ui.SettingsActivity$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreatePinFragment $r22 = CreatePinFragment.this;
                CreatePinFragment.m40376setupView$lambda4$lambda0($r22, view);
            }
        });
        TextView $r5 = $r2.kudiTermsOfUseTextView;
        $r5.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.register.ui.e
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CreatePinFragment $r22 = CreatePinFragment.this;
                CreatePinFragment.m40377setupView$lambda4$lambda2($r22, view);
            }
        });
        CheckBox $r7 = $r2.termsAndConditionCheckbox;
        $r7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ai.kudi.agent.register.ui.ProjectListAdapter$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                CreatePinFragment $r22 = CreatePinFragment.this;
                CreatePinFragment.m40379setupView$lambda4$lambda3($r22, compoundButton, z);
            }
        });
    }

    /* renamed from: setupView$lambda-4$lambda-0 */
    public static final void m40376setupView$lambda4$lambda0(CreatePinFragment createPinFragment, View view) {
        Log_OC.getArray(createPinFragment, "this$0");
        createPinFragment.onCreateAccountClicked();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setupView$lambda-4$lambda-2 */
    public static final void m40377setupView$lambda4$lambda2(CreatePinFragment createPinFragment, View view) {
        Log_OC.getArray(createPinFragment, "this$0");
        Frame $r3 = createPinFragment.getRemoteConfig();
        Item $r4 = $r3.m20914c();
        $r4.m27799a(new InterfaceC4454e() { // from class: ai.kudi.agent.register.ui.Label
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: b */
            public final void m38558b(Item item) {
                CreatePinFragment $r2 = CreatePinFragment.this;
                CreatePinFragment.m40378setupView$lambda4$lambda2$lambda1($r2, item);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setupView$lambda-4$lambda-2$lambda-1 */
    public static final void m40378setupView$lambda4$lambda2$lambda1(CreatePinFragment createPinFragment, Item item) {
        Log_OC.getArray(createPinFragment, "this$0");
        Log_OC.getArray(item, "it");
        boolean $z0 = item.m27801a();
        if ($z0) {
            Frame $r2 = createPinFragment.getRemoteConfig();
            String $r3 = $r2.getSetting("terms_and_conditions_url");
            Log_OC.loadImage($r3, "remoteConfig.getString(\"terms_and_conditions_url\")");
            createPinFragment.openTermsAndConditions($r3);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setupView$lambda-4$lambda-3 */
    public static final void m40379setupView$lambda4$lambda3(CreatePinFragment createPinFragment, CompoundButton compoundButton, boolean z) {
        Log_OC.getArray(createPinFragment, "this$0");
        SharedPreferences $r2 = createPinFragment.getSharedPreferences();
        SharedPreferences.Editor $r3 = $r2.edit();
        $r3.putBoolean(LoginActivity.IS_NOMBA_TERMS_CHECKED, z).apply();
        createPinFragment.isTermsChecked = z;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        CreatePinViewData $r2 = (CreatePinViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(CreatePinViewData createPinViewData) {
        Log_OC.getArray(createPinViewData, "viewData");
        CreatePinViewData.Error $r2 = createPinViewData.getError();
        applyViewErrors($r2);
        applyLoading(createPinViewData);
        String $r3 = createPinViewData.getMessage();
        if ($r3 == null) {
            return;
        }
        FragmentActivity $r4 = requireActivity();
        Log_OC.loadImage($r4, "requireActivity()");
        ContextExtKt.toast$default($r4, $r3, 0, 2, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        CreatePinViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public CreatePinViewModel createViewModel() {
        CreatePinViewModel $r1 = getVm();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Frame getRemoteConfig() {
        Frame $r1 = this.remoteConfig;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("remoteConfig");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
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

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return CreatePinViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final CreatePinViewModel getVm() {
        CreatePinViewModel $r1 = this.srv;
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
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle $r1 = getArguments();
        if ($r1 == null) {
            return;
        }
        Parcelable $r2 = $r1.getParcelable(ARGS_PERSONAL_INFO);
        RegistrationInfo $r3 = (RegistrationInfo) $r2;
        this.registrationInfo = $r3;
        String $r4 = $r1.getString(ARGS_FROM_FRAG);
        this.fromFrag = $r4;
        Parcelable $r22 = $r1.getParcelable(CREATE_OUTLET_REQUEST);
        CreateOutletRequest $r5 = (CreateOutletRequest) $r22;
        this.createOutletRequest = $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentActivity $r4 = requireActivity();
        Window $r5 = $r4.getWindow();
        $r5.setSoftInputMode(16);
        ViewRegisterCreatePinBinding $r6 = ViewRegisterCreatePinBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r6, "inflate(inflater, container, false)");
        View $r7 = initBinding($r6, this);
        return $r7;
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
                    onCreateAccountClicked();
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
    public void onResume() {
        super.onResume();
        FragmentActivity $r1 = getActivity();
        if ($r1 == null) {
            return;
        }
        $r1.setTitle(C0001R.string.secure_account);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        setupView();
    }

    public final void setRemoteConfig(Frame frame) {
        Log_OC.getArray(frame, "<set-?>");
        this.remoteConfig = frame;
    }

    public final void setSharedPreferences(SharedPreferences sharedPreferences) {
        Log_OC.getArray(sharedPreferences, "<set-?>");
        this.sharedPreferences = sharedPreferences;
    }

    public final void setVm(CreatePinViewModel createPinViewModel) {
        Log_OC.getArray(createPinViewModel, "<set-?>");
        this.srv = createPinViewModel;
    }
}
