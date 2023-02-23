package ai.kudi.agent.outlet_mgt.fragments;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import ai.kudi.agent.databinding.FragmentResetPin2Binding;
import ai.kudi.agent.databinding.FragmentSecurityBinding;
import ai.kudi.agent.databinding.OutletMgtSecurityFragmentBinding;
import ai.kudi.agent.outlet_mgt.activities.OutletMgtActivity;
import ai.kudi.agent.outlet_mgt.data.ConstKt;
import ai.kudi.agent.outlet_mgt.data.Outlet;
import ai.kudi.agent.outlet_mgt.game.components.OutletMgtSubComponent;
import ai.kudi.agent.outlet_mgt.viewmodels.OutletSecurityViewData;
import ai.kudi.agent.outlet_mgt.viewmodels.OutletSecurityViewModel;
import ai.kudi.agent.outlet_mgt.viewmodels.STATUS;
import ai.kudi.agent.settings.p029ui.adapters.SecurityOptionsAdapter;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.button.KudiTextView;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.activity.AbstractC0893b;
import androidx.activity.OnBackPressedDispatcher;
import androidx.appcompat.app.DialogInterfaceC0936d;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.content.C1335a;
import androidx.core.graphics.drawable.C1365a;
import androidx.fragment.app.FragmentActivity;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
import p590o.p591a.Timber;
/* compiled from: OutletMgtSecurityFragment.kt */
@Metadata(m10422d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 )2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001)B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0003H\u0014J\b\u0010\u0016\u001a\u00020\u0002H\u0014J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018H\u0014J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0012\u0010\u001c\u001a\u00020\u00142\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J&\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u001a\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020 2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0010\u0010'\u001a\u00020\u00142\u0006\u0010(\u001a\u00020\u000bH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/fragments/OutletMgtSecurityFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/outlet_mgt/viewmodels/OutletSecurityViewModel;", "Lai/kudi/agent/outlet_mgt/viewmodels/OutletSecurityViewData;", "Lai/kudi/agent/databinding/OutletMgtSecurityFragmentBinding;", "()V", "isOnResetPinFragment", "", "outlet", "Lai/kudi/agent/outlet_mgt/data/Outlet;", "outletApprovalStatus", "", "outletMgtSecurityViewModel", "getOutletMgtSecurityViewModel", "()Lai/kudi/agent/outlet_mgt/viewmodels/OutletSecurityViewModel;", "setOutletMgtSecurityViewModel", "(Lai/kudi/agent/outlet_mgt/viewmodels/OutletSecurityViewModel;)V", "yesButton", "Lai/kudi/dip/library/button/KudiButton;", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "showAlertDialog", "approvalStatus", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class OutletMgtSecurityFragment extends BaseMVVMViewBindingFragment<OutletSecurityViewModel, OutletSecurityViewData, OutletMgtSecurityFragmentBinding> {
    public static final Companion Companion;
    private boolean isOnResetPinFragment;
    private Outlet outlet;
    private String outletApprovalStatus;
    public OutletSecurityViewModel outletMgtSecurityViewModel;
    private KudiButton yesButton;

    /* compiled from: OutletMgtSecurityFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/fragments/OutletMgtSecurityFragment$Companion;", "", "()V", "newInstance", "Lai/kudi/agent/outlet_mgt/fragments/OutletMgtSecurityFragment;", TransactionBreakDownItemType.DATA, "Lai/kudi/agent/outlet_mgt/data/Outlet;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
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
        public final OutletMgtSecurityFragment newInstance(Outlet outlet) {
            Log_OC.getArray(outlet, TransactionBreakDownItemType.DATA);
            OutletMgtSecurityFragment $r3 = new OutletMgtSecurityFragment();
            Bundle $r1 = new Bundle();
            $r1.putParcelable(ConstKt.OUTLET_DATA, outlet);
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
    public static final OutletMgtSecurityFragment newInstance(Outlet outlet) {
        Companion $r0 = Companion;
        OutletMgtSecurityFragment $r1 = $r0.newInstance(outlet);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-0  reason: not valid java name */
    public static final void m39882onViewCreated$lambda0(OutletMgtSecurityFragment outletMgtSecurityFragment, View view) {
        Log_OC.getArray(outletMgtSecurityFragment, "this$0");
        OutletSecurityViewModel $r2 = outletMgtSecurityFragment.getOutletMgtSecurityViewModel();
        Outlet $r3 = outletMgtSecurityFragment.outlet;
        Log_OC.append($r3);
        String $r4 = $r3.getOutletId();
        InterfaceC8209a $r5 = outletMgtSecurityFragment.requireBinding();
        OutletMgtSecurityFragmentBinding $r6 = (OutletMgtSecurityFragmentBinding) $r5;
        FragmentResetPin2Binding $r7 = $r6.resetPinLayout;
        KudiInputField $r8 = $r7.currentPinView;
        String $r9 = $r8.getText();
        InterfaceC8209a $r52 = outletMgtSecurityFragment.requireBinding();
        OutletMgtSecurityFragmentBinding $r62 = (OutletMgtSecurityFragmentBinding) $r52;
        FragmentResetPin2Binding $r72 = $r62.resetPinLayout;
        KudiInputField $r82 = $r72.newPinView;
        String $r10 = $r82.getText();
        InterfaceC8209a $r53 = outletMgtSecurityFragment.requireBinding();
        OutletMgtSecurityFragmentBinding $r63 = (OutletMgtSecurityFragmentBinding) $r53;
        FragmentResetPin2Binding $r73 = $r63.resetPinLayout;
        KudiInputField $r83 = $r73.confirmNewPinView;
        String $r11 = $r83.getText();
        $r2.resetOutletPin($r4, $r9, $r10, $r11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-1  reason: not valid java name */
    public static final void m39883onViewCreated$lambda1(OutletMgtSecurityFragment outletMgtSecurityFragment, View view) {
        Log_OC.getArray(outletMgtSecurityFragment, "this$0");
        String $r2 = outletMgtSecurityFragment.outletApprovalStatus;
        Log_OC.append($r2);
        outletMgtSecurityFragment.showAlertDialog($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void showAlertDialog(String str) {
        Timber.tag("Alert dialog call from security", new Object[0]);
        Context $r4 = requireContext();
        DialogInterfaceC0936d.C0937a r19 = new DialogInterfaceC0936d.C0937a($r4);
        LayoutInflater $r5 = getLayoutInflater();
        View $r6 = $r5.inflate(C0001R.C0004layout.outlet_suspension_confirmation_layout, (ViewGroup) null);
        View $r7 = $r6.findViewById(C0001R.C0003id.yesButton);
        KudiButton $r8 = (KudiButton) $r7;
        this.yesButton = $r8;
        View $r72 = $r6.findViewById(C0001R.C0003id.cancelSuspensionButton);
        ViewGroup $r82 = (KudiButton) $r72;
        View $r73 = $r6.findViewById(C0001R.C0003id.outletSuspensionText);
        TextView $r9 = (TextView) $r73;
        r19.setView($r6);
        final DialogInterfaceC0936d $r10 = r19.create();
        DialogInterfaceC0936d r23 = $r10;
        Window $r11 = r23.getWindow();
        Log_OC.append($r11);
        WindowManager.LayoutParams $r12 = $r11.getAttributes();
        $r12.windowAnimations = C0001R.style.DialogAnimation;
        Log_OC.loadImage($r10, "builder.create().apply {\n            window!!.attributes.windowAnimations = R.style.DialogAnimation\n        }");
        String $r1 = this.outletApprovalStatus;
        STATUS $r13 = STATUS.APPROVED;
        String $r14 = $r13.name();
        boolean $z0 = Log_OC.append($r1, $r14);
        if ($z0) {
            Log_OC.append($r9);
            Object[] $r2 = {"suspend"};
            String $r15 = getString(C0001R.string.outlet_suspension_confirmation, $r2);
            $r9.setText($r15);
        } else {
            Log_OC.append($r9);
            Object[] $r22 = {"unsuspend"};
            String $r16 = getString(C0001R.string.outlet_suspension_confirmation, $r22);
            $r9.setText($r16);
        }
        ViewGroup $r152 = this.yesButton;
        if ($r152 != null) {
            ViewGroup r24 = $r152;
            r24.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.outlet_mgt.fragments.l
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OutletMgtSecurityFragment $r23 = OutletMgtSecurityFragment.this;
                    DialogInterfaceC0936d $r3 = $r10;
                    OutletMgtSecurityFragment.m39884showAlertDialog$lambda3($r23, $r3, view);
                }
            });
        }
        ViewGroup r242 = $r82;
        r242.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.outlet_mgt.fragments.d
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogInterfaceC0936d $r23 = DialogInterfaceC0936d.this;
                OutletMgtSecurityFragment.m39885showAlertDialog$lambda4($r23, view);
            }
        });
        DialogInterfaceC0936d r232 = $r10;
        r232.requestWindowFeature(1);
        DialogInterfaceC0936d r233 = $r10;
        Window $r112 = r233.getWindow();
        if ($r112 != null) {
            ColorDrawable r22 = new ColorDrawable(0);
            $r112.setBackgroundDrawable(r22);
        }
        DialogInterfaceC0936d r234 = $r10;
        r234.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: showAlertDialog$lambda-3  reason: not valid java name */
    public static final void m39884showAlertDialog$lambda3(OutletMgtSecurityFragment outletMgtSecurityFragment, DialogInterfaceC0936d dialogInterfaceC0936d, View view) {
        Log_OC.getArray(outletMgtSecurityFragment, "this$0");
        Log_OC.getArray(dialogInterfaceC0936d, "$alertDialog");
        String $r3 = outletMgtSecurityFragment.outletApprovalStatus;
        STATUS $r4 = STATUS.APPROVED;
        String $r5 = $r4.name();
        boolean $z0 = Log_OC.append($r3, $r5);
        if ($z0) {
            OutletSecurityViewModel $r6 = outletMgtSecurityFragment.getOutletMgtSecurityViewModel();
            Outlet $r7 = outletMgtSecurityFragment.outlet;
            Log_OC.append($r7);
            String $r32 = $r7.getOutletId();
            OutletMgtSecurityFragment$showAlertDialog$1$1 $r8 = new OutletMgtSecurityFragment$showAlertDialog$1$1(outletMgtSecurityFragment, dialogInterfaceC0936d);
            $r6.suspendOutlet($r32, $r8);
            return;
        }
        OutletSecurityViewModel $r62 = outletMgtSecurityFragment.getOutletMgtSecurityViewModel();
        Outlet $r72 = outletMgtSecurityFragment.outlet;
        Log_OC.append($r72);
        String $r33 = $r72.getOutletId();
        OutletMgtSecurityFragment$showAlertDialog$1$2 $r9 = new OutletMgtSecurityFragment$showAlertDialog$1$2(outletMgtSecurityFragment, dialogInterfaceC0936d);
        $r62.unsuspendOutlet($r33, $r9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showAlertDialog$lambda-4  reason: not valid java name */
    public static final void m39885showAlertDialog$lambda4(DialogInterfaceC0936d dialogInterfaceC0936d, View view) {
        Log_OC.getArray(dialogInterfaceC0936d, "$alertDialog");
        dialogInterfaceC0936d.dismiss();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        OutletSecurityViewData $r2 = (OutletSecurityViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void applyViewData(ai.kudi.agent.outlet_mgt.viewmodels.OutletSecurityViewData r33) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.outlet_mgt.fragments.OutletMgtSecurityFragment.applyViewData(ai.kudi.agent.outlet_mgt.viewmodels.OutletSecurityViewData):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        OutletSecurityViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public OutletSecurityViewModel createViewModel() {
        OutletSecurityViewModel $r1 = getOutletMgtSecurityViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final OutletSecurityViewModel getOutletMgtSecurityViewModel() {
        OutletSecurityViewModel $r1 = this.outletMgtSecurityViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("outletMgtSecurityViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return OutletSecurityViewModel.class;
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
        OnBackPressedDispatcher $r4;
        super.onCreate(bundle);
        FragmentActivity $r3 = getActivity();
        if ($r3 == null || ($r4 = $r3.getOnBackPressedDispatcher()) == null) {
            return;
        }
        $r4.a(this, new AbstractC0893b() { // from class: ai.kudi.agent.outlet_mgt.fragments.OutletMgtSecurityFragment$onCreate$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(true);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // androidx.activity.AbstractC0893b
            public void handleOnBackPressed() {
                OutletMgtSecurityFragment $r1 = OutletMgtSecurityFragment.this;
                boolean $z0 = $r1.isOnResetPinFragment;
                if (!$z0) {
                    setEnabled(false);
                    OutletMgtSecurityFragment $r12 = OutletMgtSecurityFragment.this;
                    FragmentActivity $r7 = $r12.getActivity();
                    if ($r7 == null) {
                        return;
                    }
                    $r7.onBackPressed();
                    return;
                }
                OutletMgtSecurityFragment $r13 = OutletMgtSecurityFragment.this;
                InterfaceC8209a $r2 = $r13.requireBinding();
                OutletMgtSecurityFragmentBinding $r32 = (OutletMgtSecurityFragmentBinding) $r2;
                FragmentSecurityBinding $r42 = $r32.securityLayout;
                ScrollView $r5 = $r42.getRoot();
                Log_OC.loadImage($r5, "requireBinding().securityLayout.root");
                ViewExtKt.show($r5);
                OutletMgtSecurityFragment $r14 = OutletMgtSecurityFragment.this;
                InterfaceC8209a $r22 = $r14.requireBinding();
                OutletMgtSecurityFragmentBinding $r33 = (OutletMgtSecurityFragmentBinding) $r22;
                FragmentResetPin2Binding $r6 = $r33.resetPinLayout;
                ScrollView $r52 = $r6.getRoot();
                Log_OC.loadImage($r52, "requireBinding().resetPinLayout.root");
                ViewExtKt.hide$default($r52, false, 1, null);
                OutletMgtSecurityFragment $r15 = OutletMgtSecurityFragment.this;
                $r15.isOnResetPinFragment = false;
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        OutletMgtSecurityFragmentBinding $r4 = OutletMgtSecurityFragmentBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        View $r5 = initBinding($r4, this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Outlet $r3;
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        Bundle $r2 = getArguments();
        if ($r2 == null) {
            $r3 = null;
        } else {
            Parcelable $r4 = $r2.getParcelable(ConstKt.OUTLET_DATA);
            $r3 = (Outlet) $r4;
        }
        this.outlet = $r3;
        Log_OC.append($r3);
        this.outletApprovalStatus = $r3.getOutletApprovalStatus();
        InterfaceC8209a $r6 = requireBinding();
        OutletMgtSecurityFragmentBinding $r7 = (OutletMgtSecurityFragmentBinding) $r6;
        FragmentSecurityBinding $r8 = $r7.securityLayout;
        SwitchCompat $r9 = $r8.bioMetricswitch;
        Log_OC.loadImage($r9, "requireBinding().securityLayout.bioMetricswitch");
        ViewExtKt.hide$default($r9, false, 1, null);
        OutletSecurityViewModel $r10 = getOutletMgtSecurityViewModel();
        String $r5 = this.outletApprovalStatus;
        Log_OC.append($r5);
        $r10.publishOutletSuspensionStatus($r5);
        InterfaceC8209a $r62 = requireBinding();
        OutletMgtSecurityFragmentBinding $r72 = (OutletMgtSecurityFragmentBinding) $r62;
        FragmentSecurityBinding $r82 = $r72.securityLayout;
        TextView $r11 = $r82.turnOffBiometricsView;
        Context $r12 = requireContext();
        int $i0 = C1335a.m36324d($r12, C0001R.color.redTextColor);
        TextView r26 = $r11;
        r26.setTextColor($i0);
        Context $r122 = requireContext();
        Drawable $r13 = C1335a.m36322f($r122, C0001R.C0002drawable.ic_padlock);
        Log_OC.append($r13);
        Drawable $r14 = $r13.mutate();
        Context $r123 = requireContext();
        int $i02 = C1335a.m36324d($r123, C0001R.color.redTextColor);
        C1365a.m36188n($r14, $i02);
        InterfaceC8209a $r63 = requireBinding();
        OutletMgtSecurityFragmentBinding $r73 = (OutletMgtSecurityFragmentBinding) $r63;
        FragmentSecurityBinding $r83 = $r73.securityLayout;
        KudiTextView $r112 = $r83.turnOffBiometricsView;
        $r112.setCompoundDrawablesRelativeWithIntrinsicBounds($r13, (Drawable) null, (Drawable) null, (Drawable) null);
        Context $r124 = requireContext();
        Log_OC.loadImage($r124, "requireContext()");
        SecurityOptionsAdapter r22 = new SecurityOptionsAdapter($r124);
        InterfaceC8209a $r64 = requireBinding();
        OutletMgtSecurityFragmentBinding $r74 = (OutletMgtSecurityFragmentBinding) $r64;
        FragmentSecurityBinding $r84 = $r74.securityLayout;
        $r84.securityOptionsRecyclerView.setAdapter(r22);
        r22.removeSecondaryPhoneNumberAndTrustedDevices();
        OutletMgtSecurityFragment$onViewCreated$1 r23 = new OutletMgtSecurityFragment$onViewCreated$1(this);
        r22.setOnClickListener(r23);
        InterfaceC8209a $r65 = requireBinding();
        OutletMgtSecurityFragmentBinding $r75 = (OutletMgtSecurityFragmentBinding) $r65;
        FragmentResetPin2Binding $r18 = $r75.resetPinLayout;
        ViewGroup $r19 = $r18.resetPinView;
        ViewGroup r27 = $r19;
        r27.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.outlet_mgt.fragments.DownloadFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                OutletMgtSecurityFragment $r22 = OutletMgtSecurityFragment.this;
                OutletMgtSecurityFragment.m39882onViewCreated$lambda0($r22, view2);
            }
        });
        InterfaceC8209a $r66 = requireBinding();
        OutletMgtSecurityFragmentBinding $r76 = (OutletMgtSecurityFragmentBinding) $r66;
        FragmentSecurityBinding $r85 = $r76.securityLayout;
        TextView $r113 = $r85.turnOffBiometricsView;
        TextView r262 = $r113;
        r262.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.outlet_mgt.fragments.BrowseFragment$3
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                OutletMgtSecurityFragment $r22 = OutletMgtSecurityFragment.this;
                OutletMgtSecurityFragment.m39883onViewCreated$lambda1($r22, view2);
            }
        });
    }

    public final void setOutletMgtSecurityViewModel(OutletSecurityViewModel outletSecurityViewModel) {
        Log_OC.getArray(outletSecurityViewModel, "<set-?>");
        this.outletMgtSecurityViewModel = outletSecurityViewModel;
    }
}
