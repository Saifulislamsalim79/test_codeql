package ai.kudi.agent.login.setup.p010ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import ai.kudi.agent.databinding.FragmentEnforceBvnVerificationBinding;
import ai.kudi.agent.login.game.components.DeviceVerificationSubcomponent;
import ai.kudi.agent.login.setup.p010ui.BvnUpdateFragment;
import ai.kudi.agent.login.setup.presenters.EnforceBvnVerificationViewModel;
import ai.kudi.agent.login.setup.viewModels.data.BvnUpdateViewData;
import ai.kudi.agent.login.setup.viewModels.data.EnforceBvnVerificationData;
import ai.kudi.dip.library.button.KudiButton;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.AbstractC0893b;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.content.C1335a;
import androidx.fragment.app.AbstractC1449b0;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.PreferenceActivity;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: EnforceBvnVerificationFragment.kt */
@Metadata(m10422d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \"2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\"B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0003H\u0014J\b\u0010\u0010\u001a\u00020\u0002H\u0014J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u000eH\u0002J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J&\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u001a\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010!\u001a\u00020\u000eH\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006#"}, m10421d2 = {"Lai/kudi/agent/login/setup/ui/EnforceBvnVerificationFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/login/setup/presenters/EnforceBvnVerificationViewModel;", "Lai/kudi/agent/login/setup/viewModels/data/BvnUpdateViewData;", "Lai/kudi/agent/databinding/FragmentEnforceBvnVerificationBinding;", "()V", "enforceData", "Lai/kudi/agent/login/setup/viewModels/data/EnforceBvnVerificationData;", "viewModel", "getViewModel", "()Lai/kudi/agent/login/setup/presenters/EnforceBvnVerificationViewModel;", "setViewModel", "(Lai/kudi/agent/login/setup/presenters/EnforceBvnVerificationViewModel;)V", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "navigateToBvnUpdateFragment", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "updateView", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.login.setup.ui.EnforceBvnVerificationFragment */
/* loaded from: classes.dex */
public final class EnforceBvnVerificationFragment extends BaseMVVMViewBindingFragment<EnforceBvnVerificationViewModel, BvnUpdateViewData, FragmentEnforceBvnVerificationBinding> {
    private static final String ARG_ENFORCE_BVN_DATA = "ARG_ENFORCE_BVN_DATA";
    public static final String BUTTON_ERROR_VALUE = "BUTTON_ERROR_VALUE";
    public static final String BUTTON_SUCCESS_VALUE = "BUTTON_SUCCESS_VALUE";
    public static final String BUTTON_UNVERIFIED_VALUE = "BUTTON_UNVERIFIED_VALUE";
    public static final Companion Companion;
    private EnforceBvnVerificationData enforceData;
    public EnforceBvnVerificationViewModel viewModel;

    /* compiled from: EnforceBvnVerificationFragment.kt */
    @Metadata(m10422d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, m10421d2 = {"Lai/kudi/agent/login/setup/ui/EnforceBvnVerificationFragment$Companion;", "", "()V", EnforceBvnVerificationFragment.ARG_ENFORCE_BVN_DATA, "", EnforceBvnVerificationFragment.BUTTON_ERROR_VALUE, EnforceBvnVerificationFragment.BUTTON_SUCCESS_VALUE, EnforceBvnVerificationFragment.BUTTON_UNVERIFIED_VALUE, "newInstance", "Lai/kudi/agent/login/setup/ui/EnforceBvnVerificationFragment;", TransactionBreakDownItemType.DATA, "Lai/kudi/agent/login/setup/viewModels/data/EnforceBvnVerificationData;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.login.setup.ui.EnforceBvnVerificationFragment$Companion */
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
        public final EnforceBvnVerificationFragment newInstance(EnforceBvnVerificationData enforceBvnVerificationData) {
            Log_OC.getArray(enforceBvnVerificationData, TransactionBreakDownItemType.DATA);
            EnforceBvnVerificationFragment $r3 = new EnforceBvnVerificationFragment();
            Bundle $r2 = new Bundle();
            $r2.putParcelable(EnforceBvnVerificationFragment.ARG_ENFORCE_BVN_DATA, enforceBvnVerificationData);
            $r3.setArguments($r2);
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
    private final void navigateToBvnUpdateFragment() {
        FragmentManager $r1 = getParentFragmentManager();
        AbstractC1449b0 $r2 = $r1.m35924l();
        BvnUpdateFragment.Companion $r3 = BvnUpdateFragment.Companion;
        EnforceBvnVerificationData $r4 = this.enforceData;
        String $r5 = $r4 == null ? null : $r4.getLoginAttemptId();
        if ($r5 == null) {
            $r5 = "";
        }
        BvnUpdateFragment $r6 = $r3.newInstance($r5);
        BvnUpdateFragment.Companion $r32 = BvnUpdateFragment.Companion;
        $r2.m35820s(C0001R.C0003id.container, $r6, $r32.getTAG());
        BvnUpdateFragment.Companion $r33 = BvnUpdateFragment.Companion;
        $r2.m35824g($r33.getTAG());
        $r2.mo35805i();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void updateView() {
        Integer $r6;
        InterfaceC8209a $r1 = requireBinding();
        FragmentEnforceBvnVerificationBinding $r2 = (FragmentEnforceBvnVerificationBinding) $r1;
        ImageView $r3 = $r2.icon;
        Context $r4 = requireContext();
        EnforceBvnVerificationData $r5 = this.enforceData;
        int $i0 = ($r5 == null || ($r6 = $r5.getImageRef()) == null) ? 0 : $r6.intValue();
        Drawable $r7 = C1335a.m36322f($r4, $i0);
        $r3.setImageDrawable($r7);
        TextView $r8 = $r2.title;
        EnforceBvnVerificationData $r52 = this.enforceData;
        String $r10 = $r52 == null ? null : $r52.getTitle();
        $r8.setText($r10);
        EnforceBvnVerificationData $r53 = this.enforceData;
        String $r11 = $r53 == null ? null : $r53.getTitle();
        if ($r11 == null) {
            Log_OC.loadImage($r8, "");
            ViewExtKt.hide$default($r8, false, 1, null);
        }
        TextView $r82 = $r2.message;
        EnforceBvnVerificationData $r54 = this.enforceData;
        String $r112 = $r54 == null ? null : $r54.getMessage();
        $r82.setText($r112);
        EnforceBvnVerificationData $r55 = this.enforceData;
        String $r113 = $r55 == null ? null : $r55.getMessage();
        if ($r113 == null) {
            Log_OC.loadImage($r82, "");
            ViewExtKt.hide$default($r82, false, 1, null);
        }
        KudiButton $r12 = $r2.button;
        EnforceBvnVerificationData $r56 = this.enforceData;
        String $r9 = $r56 != null ? $r56.getButtonText() : null;
        String $r102 = $r9 != null ? $r9 : "";
        $r12.setText($r102);
        ViewGroup $r122 = $r2.button;
        ViewGroup r15 = $r122;
        r15.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.login.setup.ui.c
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EnforceBvnVerificationFragment $r22 = EnforceBvnVerificationFragment.this;
                EnforceBvnVerificationFragment.m39771updateView$lambda3$lambda2($r22, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: updateView$lambda-3$lambda-2  reason: not valid java name */
    public static final void m39771updateView$lambda3$lambda2(EnforceBvnVerificationFragment enforceBvnVerificationFragment, View view) {
        Log_OC.getArray(enforceBvnVerificationFragment, "this$0");
        EnforceBvnVerificationData $r2 = enforceBvnVerificationFragment.enforceData;
        String $r3 = $r2 == null ? null : $r2.getResult();
        if ($r3 != null) {
            int $i0 = $r3.hashCode();
            if ($i0 == -1234106707) {
                boolean $z0 = $r3.equals(BUTTON_ERROR_VALUE);
                if ($z0) {
                    enforceBvnVerificationFragment.navigateToBvnUpdateFragment();
                }
            } else if ($i0 == 44859304) {
                boolean $z02 = $r3.equals(BUTTON_SUCCESS_VALUE);
                if ($z02) {
                    FragmentActivity $r4 = enforceBvnVerificationFragment.requireActivity();
                    $r4.finish();
                }
            } else if ($i0 != 1563275616) {
            } else {
                boolean $z03 = $r3.equals(BUTTON_UNVERIFIED_VALUE);
                if ($z03) {
                    enforceBvnVerificationFragment.navigateToBvnUpdateFragment();
                }
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        BvnUpdateViewData $r2 = (BvnUpdateViewData) viewData;
        applyViewData($r2);
    }

    protected void applyViewData(BvnUpdateViewData bvnUpdateViewData) {
        Log_OC.getArray(bvnUpdateViewData, "viewData");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        EnforceBvnVerificationViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public EnforceBvnVerificationViewModel createViewModel() {
        EnforceBvnVerificationViewModel $r1 = getViewModel();
        return $r1;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return EnforceBvnVerificationViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public final EnforceBvnVerificationViewModel getViewModel() {
        EnforceBvnVerificationViewModel $r1 = this.viewModel;
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

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentEnforceBvnVerificationBinding $r4 = FragmentEnforceBvnVerificationBinding.inflate(layoutInflater, viewGroup, false);
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
        Bundle $r2 = requireArguments();
        Parcelable $r3 = $r2.getParcelable(ARG_ENFORCE_BVN_DATA);
        EnforceBvnVerificationData $r4 = (EnforceBvnVerificationData) $r3;
        this.enforceData = $r4;
        updateView();
        requireBinding();
        AbstractC0893b abstractC0893b = new AbstractC0893b() { // from class: ai.kudi.agent.login.setup.ui.EnforceBvnVerificationFragment$onViewCreated$callback$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(true);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // androidx.activity.AbstractC0893b
            public void handleOnBackPressed() {
                EnforceBvnVerificationFragment $r22 = EnforceBvnVerificationFragment.this;
                FragmentActivity $r1 = $r22.requireActivity();
                $r1.finish();
            }
        };
        FragmentActivity $r6 = requireActivity();
        OnBackPressedDispatcher $r7 = $r6.getOnBackPressedDispatcher();
        PreferenceActivity $r8 = getViewLifecycleOwner();
        $r7.a($r8, abstractC0893b);
    }

    public final void setViewModel(EnforceBvnVerificationViewModel enforceBvnVerificationViewModel) {
        Log_OC.getArray(enforceBvnVerificationViewModel, "<set-?>");
        this.viewModel = enforceBvnVerificationViewModel;
    }
}
