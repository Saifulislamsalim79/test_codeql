package ai.kudi.agent.outlet_mgt.fragments;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.LocationUtil;
import ai.kudi.agent.databinding.FragmentCreateOutletBinding;
import ai.kudi.agent.outlet_mgt.activities.OutletMgtActivity;
import ai.kudi.agent.outlet_mgt.game.components.OutletMgtSubComponent;
import ai.kudi.agent.outlet_mgt.viewdata.CreateOutletViewData;
import ai.kudi.agent.outlet_mgt.viewmodels.CreateOutletViewModel;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.location.C4107a;
import com.google.android.gms.location.C4109b;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: CreateOutletFragment.kt */
@Metadata(m10422d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\b\u0018\u0000 -2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001-B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0003H\u0014J\b\u0010\u0010\u001a\u00020\u0002H\u0014J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0014J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u000eH\u0002J$\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J-\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020!2\u000e\u0010\"\u001a\n\u0012\u0006\b\u0001\u0012\u00020$0#2\u0006\u0010%\u001a\u00020&H\u0016¢\u0006\u0002\u0010'J\u001a\u0010(\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u001a\u0010*\u001a\u00020\u000e2\b\b\u0001\u0010+\u001a\u00020!2\u0006\u0010,\u001a\u00020$H\u0002R\u001e\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006."}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/fragments/CreateOutletFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/outlet_mgt/viewmodels/CreateOutletViewModel;", "Lai/kudi/agent/outlet_mgt/viewdata/CreateOutletViewData;", "Lai/kudi/agent/databinding/FragmentCreateOutletBinding;", "()V", "createOutletViewModel", "getCreateOutletViewModel", "()Lai/kudi/agent/outlet_mgt/viewmodels/CreateOutletViewModel;", "setCreateOutletViewModel", "(Lai/kudi/agent/outlet_mgt/viewmodels/CreateOutletViewModel;)V", "outletMgtActivity", "Lai/kudi/agent/outlet_mgt/activities/OutletMgtActivity;", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "onAttach", "context", "Landroid/content/Context;", "onCreateOutletClicked", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onViewCreated", "view", "setViewError", "errorViewId", "errorText", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class CreateOutletFragment extends BaseMVVMViewBindingFragment<CreateOutletViewModel, CreateOutletViewData, FragmentCreateOutletBinding> {
    public static final Companion Companion;
    public CreateOutletViewModel createOutletViewModel;
    private OutletMgtActivity outletMgtActivity;

    /* compiled from: CreateOutletFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/fragments/CreateOutletFragment$Companion;", "", "()V", "newInstance", "Lai/kudi/agent/outlet_mgt/fragments/CreateOutletFragment;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
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
        public final CreateOutletFragment newInstance() {
            CreateOutletFragment $r1 = new CreateOutletFragment();
            return $r1;
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
    public static final CreateOutletFragment newInstance() {
        Companion $r1 = Companion;
        CreateOutletFragment $r0 = $r1.newInstance();
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void onCreateOutletClicked() {
        InterfaceC8209a $r3 = requireBinding();
        FragmentCreateOutletBinding $r4 = (FragmentCreateOutletBinding) $r3;
        if ($r4 == null) {
            return;
        }
        KudiInputField $r5 = $r4.createOutletPhoneNoInputField;
        String $r6 = $r5.getText();
        FragmentActivity $r7 = requireActivity();
        Log_OC.loadImage($r7, "requireActivity()");
        LocationUtil $r1 = new LocationUtil($r7);
        Context $r8 = requireActivity().getApplicationContext();
        C4107a $r9 = C4109b.m28502b($r8);
        Log_OC.loadImage($r9, "getFusedLocationProviderClient(requireActivity().applicationContext)");
        CreateOutletFragment$onCreateOutletClicked$1$1 $r2 = new CreateOutletFragment$onCreateOutletClicked$1$1(this, $r4, $r6);
        LocationUtil.getLastLocation$default($r1, $r9, 0, $r2, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-1$lambda-0  reason: not valid java name */
    public static final void m39871onViewCreated$lambda1$lambda0(CreateOutletFragment createOutletFragment, View view) {
        Log_OC.getArray(createOutletFragment, "this$0");
        createOutletFragment.onCreateOutletClicked();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setViewError(int i, String str) {
        InterfaceC8209a $r2 = requireBinding();
        FragmentCreateOutletBinding $r3 = (FragmentCreateOutletBinding) $r2;
        if ($r3 == null) {
            return;
        }
        if (i == C0001R.C0003id.createOutletLgaInputField) {
            KudiInputField $r4 = $r3.createOutletLgaInputField;
            $r4.setError(str);
        } else if (i != C0001R.C0003id.createOutletStateInputField) {
        } else {
            KudiInputField $r42 = $r3.createOutletStateInputField;
            $r42.setError(str);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        CreateOutletViewData $r2 = (CreateOutletViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void applyViewData(ai.kudi.agent.outlet_mgt.viewdata.CreateOutletViewData r27) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.outlet_mgt.fragments.CreateOutletFragment.applyViewData(ai.kudi.agent.outlet_mgt.viewdata.CreateOutletViewData):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        CreateOutletViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public CreateOutletViewModel createViewModel() {
        CreateOutletViewModel $r1 = getCreateOutletViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final CreateOutletViewModel getCreateOutletViewModel() {
        CreateOutletViewModel $r1 = this.createOutletViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("createOutletViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return CreateOutletViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        super.onAttach(context);
        boolean $z0 = context instanceof OutletMgtActivity;
        if ($z0) {
            OutletMgtActivity $r3 = (OutletMgtActivity) context;
            this.outletMgtActivity = $r3;
            Log_OC.append($r3);
            OutletMgtSubComponent $r1 = $r3.getOutletMgtSubComponent();
            $r1.inject(this);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentCreateOutletBinding $r4 = FragmentCreateOutletBinding.inflate(layoutInflater, viewGroup, false);
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
                    onCreateOutletClicked();
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
        super.onViewCreated(view, bundle);
        InterfaceC8209a $r1 = requireBinding();
        FragmentCreateOutletBinding $r4 = (FragmentCreateOutletBinding) $r1;
        OutletMgtActivity $r5 = this.outletMgtActivity;
        if ($r5 != null) {
            $r5.setTitle("Create Outlet");
        }
        KudiInputField $r6 = $r4.createOutletStateInputField;
        $r6.disableEditablity();
        KudiInputField $r62 = $r4.createOutletLgaInputField;
        $r62.disableEditablity();
        KudiInputField $r63 = $r4.createOutletStateInputField;
        CreateOutletFragment$onViewCreated$1$1 r11 = new CreateOutletFragment$onViewCreated$1$1(this);
        $r63.setClickedListener(r11);
        KudiInputField $r64 = $r4.createOutletLgaInputField;
        CreateOutletFragment$onViewCreated$1$2 r12 = new CreateOutletFragment$onViewCreated$1$2(this);
        $r64.setClickedListener(r12);
        ViewGroup $r9 = $r4.createOutletContinueButton;
        ViewGroup r14 = $r9;
        r14.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.outlet_mgt.fragments.EditEventView$5
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CreateOutletFragment $r2 = CreateOutletFragment.this;
                CreateOutletFragment.m39871onViewCreated$lambda1$lambda0($r2, view2);
            }
        });
    }

    public final void setCreateOutletViewModel(CreateOutletViewModel createOutletViewModel) {
        Log_OC.getArray(createOutletViewModel, "<set-?>");
        this.createOutletViewModel = createOutletViewModel;
    }
}
