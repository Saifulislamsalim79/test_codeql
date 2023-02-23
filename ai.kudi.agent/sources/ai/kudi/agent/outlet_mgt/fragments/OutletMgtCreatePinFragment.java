package ai.kudi.agent.outlet_mgt.fragments;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.ManageDevice;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.custom.views.pinentryview.PinEntryView;
import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import ai.kudi.agent.databinding.ViewRegisterCreatePinBinding;
import ai.kudi.agent.outlet_mgt.activities.OutletMgtActivity;
import ai.kudi.agent.outlet_mgt.data.CreateOutletRequest;
import ai.kudi.agent.outlet_mgt.game.components.OutletMgtSubComponent;
import ai.kudi.agent.outlet_mgt.viewmodels.OutletMgtCreatePinViewModel;
import ai.kudi.agent.register.p021ui.viewmodels.data.CreatePinViewData;
import ai.kudi.dip.library.button.KudiButton;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.tasks.InterfaceC4454e;
import com.google.android.gms.tasks.Item;
import com.google.firebase.remoteconfig.Frame;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: OutletMgtCreatePinFragment.kt */
@Metadata(m10422d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 /2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001/B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0003H\u0002J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0003H\u0014J\u0012\u0010\u001a\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u0002H\u0014J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001fH\u0014J\u0010\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\u0016H\u0002J\u0012\u0010$\u001a\u00020\u00162\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J&\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u001a\u0010-\u001a\u00020\u00162\u0006\u0010.\u001a\u00020(2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u00060"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/fragments/OutletMgtCreatePinFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/outlet_mgt/viewmodels/OutletMgtCreatePinViewModel;", "Lai/kudi/agent/register/ui/viewmodels/data/CreatePinViewData;", "Lai/kudi/agent/databinding/ViewRegisterCreatePinBinding;", "()V", "createOutletRequest", "Lai/kudi/agent/outlet_mgt/data/CreateOutletRequest;", "isTermsChecked", "", "outletMgtCreatePinViewModel", "getOutletMgtCreatePinViewModel", "()Lai/kudi/agent/outlet_mgt/viewmodels/OutletMgtCreatePinViewModel;", "setOutletMgtCreatePinViewModel", "(Lai/kudi/agent/outlet_mgt/viewmodels/OutletMgtCreatePinViewModel;)V", "remoteConfig", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "getRemoteConfig", "()Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "setRemoteConfig", "(Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;)V", "applyLoading", "", TransactionBreakDownItemType.DATA, "applyViewData", "viewData", "applyViewErrors", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "Lai/kudi/agent/register/ui/viewmodels/data/CreatePinViewData$Error;", "createViewModel", "getVMType", "Ljava/lang/Class;", "onAttach", "context", "Landroid/content/Context;", "onContinueClicked", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class OutletMgtCreatePinFragment extends BaseMVVMViewBindingFragment<OutletMgtCreatePinViewModel, CreatePinViewData, ViewRegisterCreatePinBinding> {
    private static final String CREATE_OUTLET_REQUEST = "CREATE_OUTLET_REQUEST";
    public static final Companion Companion;
    private CreateOutletRequest createOutletRequest;
    private boolean isTermsChecked;
    public OutletMgtCreatePinViewModel outletMgtCreatePinViewModel;
    public Frame remoteConfig;

    /* compiled from: OutletMgtCreatePinFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/fragments/OutletMgtCreatePinFragment$Companion;", "", "()V", "CREATE_OUTLET_REQUEST", "", "newInstance", "Lai/kudi/agent/outlet_mgt/fragments/OutletMgtCreatePinFragment;", "createOutletRequest", "Lai/kudi/agent/outlet_mgt/data/CreateOutletRequest;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
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
        public static /* synthetic */ OutletMgtCreatePinFragment newInstance$default(Companion companion, CreateOutletRequest $r3, int i, Object obj) {
            int $i0 = i & 1;
            if ($i0 != 0) {
                $r3 = null;
            }
            OutletMgtCreatePinFragment $r1 = companion.newInstance($r3);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final OutletMgtCreatePinFragment newInstance(CreateOutletRequest createOutletRequest) {
            OutletMgtCreatePinFragment $r2 = new OutletMgtCreatePinFragment();
            Bundle $r3 = new Bundle();
            $r3.putParcelable("CREATE_OUTLET_REQUEST", createOutletRequest);
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
    private final void applyLoading(CreatePinViewData createPinViewData) {
        boolean $z0 = createPinViewData.getLoading();
        if ($z0) {
            InterfaceC8209a $r2 = requireBinding();
            ViewRegisterCreatePinBinding $r3 = (ViewRegisterCreatePinBinding) $r2;
            KudiButton $r4 = $r3.submitPinButton;
            $r4.m38032f();
            return;
        }
        InterfaceC8209a $r22 = requireBinding();
        ViewRegisterCreatePinBinding $r32 = (ViewRegisterCreatePinBinding) $r22;
        KudiButton $r42 = $r32.submitPinButton;
        $r42.m38033e();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void applyViewErrors(CreatePinViewData.Error error) {
        String $r2;
        if (error == null || ($r2 = error.getMessage()) == null) {
            return;
        }
        FragmentActivity $r3 = requireActivity();
        Log_OC.loadImage($r3, "requireActivity()");
        ContextExtKt.toast$default($r3, $r2, 0, 2, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void onContinueClicked() {
        SharedPreferences $r2 = requireActivity().getSharedPreferences(ManageDevice.SECURE_DEVICE_PREFERENCE, 0);
        String $r3 = $r2.getString(ManageDevice.GENERATED_NAME, "");
        String $r4 = $r2.getString(ManageDevice.GENERATED_ID, "");
        FragmentActivity $r1 = requireActivity();
        Log_OC.loadImage($r1, "requireActivity()");
        ContextExtKt.hideKeyboard($r1);
        CreateOutletRequest $r5 = this.createOutletRequest;
        if ($r5 != null) {
            $r5.setDeviceName($r3);
        }
        CreateOutletRequest $r52 = this.createOutletRequest;
        if ($r52 != null) {
            $r52.setDeviceId($r4);
        }
        CreateOutletRequest $r53 = this.createOutletRequest;
        if ($r53 != null) {
            InterfaceC8209a $r6 = requireBinding();
            ViewRegisterCreatePinBinding $r7 = (ViewRegisterCreatePinBinding) $r6;
            PinEntryView $r8 = $r7.pinEntryView;
            Editable $r9 = $r8.getText();
            String $r32 = $r9.toString();
            $r53.setPin($r32);
        }
        if (this.createOutletRequest != null) {
            OutletMgtCreatePinViewModel $r10 = getOutletMgtCreatePinViewModel();
            CreateOutletRequest $r54 = this.createOutletRequest;
            Log_OC.append($r54);
            boolean $z0 = this.isTermsChecked;
            $r10.createOutlet($r54, $z0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-5$lambda-1  reason: not valid java name */
    public static final void m39877onViewCreated$lambda5$lambda1(OutletMgtCreatePinFragment outletMgtCreatePinFragment, View view) {
        Log_OC.getArray(outletMgtCreatePinFragment, "this$0");
        outletMgtCreatePinFragment.onContinueClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-5$lambda-3  reason: not valid java name */
    public static final void m39878onViewCreated$lambda5$lambda3(final OutletMgtCreatePinFragment outletMgtCreatePinFragment, View view) {
        Log_OC.getArray(outletMgtCreatePinFragment, "this$0");
        Frame $r3 = outletMgtCreatePinFragment.getRemoteConfig();
        Item $r4 = $r3.m20914c();
        $r4.m27799a(new InterfaceC4454e() { // from class: ai.kudi.agent.outlet_mgt.fragments.b
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: c */
            public final void m38709c(Item item) {
                OutletMgtCreatePinFragment $r2 = OutletMgtCreatePinFragment.this;
                OutletMgtCreatePinFragment.m39879onViewCreated$lambda5$lambda3$lambda2($r2, item);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-5$lambda-3$lambda-2  reason: not valid java name */
    public static final void m39879onViewCreated$lambda5$lambda3$lambda2(OutletMgtCreatePinFragment outletMgtCreatePinFragment, Item item) {
        Log_OC.getArray(outletMgtCreatePinFragment, "this$0");
        Log_OC.getArray(item, "it");
        boolean $z0 = item.m27801a();
        if ($z0) {
            Frame $r2 = outletMgtCreatePinFragment.getRemoteConfig();
            String $r3 = $r2.getSetting("terms_and_conditions_url");
            Log_OC.loadImage($r3, "remoteConfig.getString(\"terms_and_conditions_url\")");
            AppCompatActivityExtKt.openTermsAndConditions(outletMgtCreatePinFragment, $r3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-5$lambda-4  reason: not valid java name */
    public static final void m39880onViewCreated$lambda5$lambda4(OutletMgtCreatePinFragment outletMgtCreatePinFragment, CompoundButton compoundButton, boolean z) {
        Log_OC.getArray(outletMgtCreatePinFragment, "this$0");
        outletMgtCreatePinFragment.isTermsChecked = z;
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
        ContextExtKt.toast($r4, $r3, 1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        OutletMgtCreatePinViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public OutletMgtCreatePinViewModel createViewModel() {
        OutletMgtCreatePinViewModel $r1 = getOutletMgtCreatePinViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final OutletMgtCreatePinViewModel getOutletMgtCreatePinViewModel() {
        OutletMgtCreatePinViewModel $r1 = this.outletMgtCreatePinViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("outletMgtCreatePinViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
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

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return OutletMgtCreatePinViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        super.onAttach(context);
        FragmentActivity $r2 = getActivity();
        if ($r2 == null) {
            NullPointerException $r5 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.outlet_mgt.activities.OutletMgtActivity");
            throw $r5;
        }
        OutletMgtActivity $r3 = (OutletMgtActivity) $r2;
        OutletMgtSubComponent $r4 = $r3.getOutletMgtSubComponent();
        $r4.inject(this);
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
        Parcelable $r2 = $r1.getParcelable("CREATE_OUTLET_REQUEST");
        CreateOutletRequest $r3 = (CreateOutletRequest) $r2;
        this.createOutletRequest = $r3;
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
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity $r3 = requireActivity();
        OutletMgtActivity $r4 = (OutletMgtActivity) $r3;
        $r4.setTitle("PIN Setup");
        InterfaceC8209a $r5 = requireBinding();
        ViewRegisterCreatePinBinding $r6 = (ViewRegisterCreatePinBinding) $r5;
        TextView $r7 = $r6.pageTitle;
        Log_OC.loadImage($r7, "pageTitle");
        ViewExtKt.hide$default($r7, false, 1, null);
        LinearLayout $r8 = $r6.termsLinearLayout;
        Context $r9 = requireContext();
        Log_OC.loadImage($r9, "requireContext()");
        int $i0 = ContextExtKt.getKudiColor($r9, C0001R.color.page_background);
        $r8.setBackgroundColor($i0);
        TextView $r72 = $r6.pageSubtitle;
        Context $r92 = requireContext();
        Log_OC.loadImage($r92, "requireContext()");
        int $i02 = ContextExtKt.getKudiColor($r92, C0001R.color.black);
        $r72.setTextColor($i02);
        TextView $r73 = $r6.kudiTermsOfUseTextView;
        Context $r93 = requireContext();
        Log_OC.loadImage($r93, "requireContext()");
        int $i03 = ContextExtKt.getKudiColor($r93, C0001R.color.black);
        $r73.setTextColor($i03);
        CheckBox $r10 = $r6.termsAndConditionCheckbox;
        Context $r94 = requireContext();
        Log_OC.loadImage($r94, "requireContext()");
        int $i04 = ContextExtKt.getKudiColor($r94, C0001R.color.black);
        $r10.setTextColor($i04);
        ViewGroup $r11 = $r6.createPinRootLayout;
        Context $r95 = requireContext();
        Log_OC.loadImage($r95, "requireContext()");
        int $i05 = ContextExtKt.getKudiColor($r95, C0001R.color.page_background);
        ViewGroup r19 = $r11;
        r19.setBackgroundColor($i05);
        ViewGroup $r12 = $r6.submitPinButton;
        ViewGroup r192 = $r12;
        r192.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.outlet_mgt.fragments.FileSelectionFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                OutletMgtCreatePinFragment $r2 = OutletMgtCreatePinFragment.this;
                OutletMgtCreatePinFragment.m39877onViewCreated$lambda5$lambda1($r2, view2);
            }
        });
        $r6.kudiTermsOfUseTextView.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.outlet_mgt.fragments.AboutFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                OutletMgtCreatePinFragment $r2 = OutletMgtCreatePinFragment.this;
                OutletMgtCreatePinFragment.m39878onViewCreated$lambda5$lambda3($r2, view2);
            }
        });
        CheckBox $r102 = $r6.termsAndConditionCheckbox;
        $r102.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ai.kudi.agent.outlet_mgt.fragments.SettingsFragment$9
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                OutletMgtCreatePinFragment $r2 = OutletMgtCreatePinFragment.this;
                OutletMgtCreatePinFragment.m39880onViewCreated$lambda5$lambda4($r2, compoundButton, z);
            }
        });
    }

    public final void setOutletMgtCreatePinViewModel(OutletMgtCreatePinViewModel outletMgtCreatePinViewModel) {
        Log_OC.getArray(outletMgtCreatePinViewModel, "<set-?>");
        this.outletMgtCreatePinViewModel = outletMgtCreatePinViewModel;
    }

    public final void setRemoteConfig(Frame frame) {
        Log_OC.getArray(frame, "<set-?>");
        this.remoteConfig = frame;
    }
}
