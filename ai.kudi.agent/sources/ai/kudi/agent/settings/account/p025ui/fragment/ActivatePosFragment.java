package ai.kudi.agent.settings.account.p025ui.fragment;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.databinding.FragmentActivatePosBinding;
import ai.kudi.agent.pos.game.components.PosSubComponent;
import ai.kudi.agent.pos.p016ui.PosActivity;
import ai.kudi.agent.settings.account.p025ui.data.ActivatePosViewData;
import ai.kudi.agent.settings.account.p025ui.viewModel.ActivatePosViewModel;
import ai.kudi.agent.settings.mcc.components.SettingsSubComponent;
import ai.kudi.agent.settings.p029ui.SettingsActivity;
import ai.kudi.agent.settings.tablet.SettingsActivityExtKt;
import ai.kudi.dip.library.button.KudiButton;
import ai.kudi.dip.library.edittext.KudiInputField;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: ActivatePosFragment.kt */
@Metadata(m10422d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0014J\b\u0010\u000e\u001a\u00020\u0002H\u0014J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0014J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J$\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u001a\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016R\u001e\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u001e"}, m10421d2 = {"Lai/kudi/agent/settings/account/ui/fragment/ActivatePosFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/settings/account/ui/viewModel/ActivatePosViewModel;", "Lai/kudi/agent/settings/account/ui/data/ActivatePosViewData;", "Lai/kudi/agent/databinding/FragmentActivatePosBinding;", "()V", "activatePosVm", "getActivatePosVm", "()Lai/kudi/agent/settings/account/ui/viewModel/ActivatePosViewModel;", "setActivatePosVm", "(Lai/kudi/agent/settings/account/ui/viewModel/ActivatePosViewModel;)V", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.account.ui.fragment.ActivatePosFragment */
/* loaded from: classes.dex */
public final class ActivatePosFragment extends BaseMVVMViewBindingFragment<ActivatePosViewModel, ActivatePosViewData, FragmentActivatePosBinding> {
    public ActivatePosViewModel activatePosVm;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-0  reason: not valid java name */
    public static final void m40677onViewCreated$lambda0(ActivatePosFragment activatePosFragment, View view) {
        Log_OC.getArray(activatePosFragment, "this$0");
        ContextExtKt.hideKeyboard(activatePosFragment);
        ActivatePosViewModel $r2 = activatePosFragment.getActivatePosVm();
        InterfaceC8209a $r3 = activatePosFragment.requireBinding();
        FragmentActivatePosBinding $r4 = (FragmentActivatePosBinding) $r3;
        KudiInputField $r5 = $r4.terminalIdInputField;
        String $r6 = $r5.getText();
        $r2.activatePos($r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        ActivatePosViewData $r2 = (ActivatePosViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(ActivatePosViewData activatePosViewData) {
        FragmentActivity $r6;
        Log_OC.getArray(activatePosViewData, "viewData");
        InterfaceC8209a $r2 = requireBinding();
        FragmentActivatePosBinding $r3 = (FragmentActivatePosBinding) $r2;
        boolean $z0 = activatePosViewData.isActivating();
        if ($z0) {
            KudiButton $r4 = $r3.activateTerminalButton;
            $r4.m38032f();
        } else {
            KudiButton $r42 = $r3.activateTerminalButton;
            $r42.m38033e();
        }
        String $r5 = activatePosViewData.getFeedback();
        if ($r5 != null) {
            FragmentActivity $r62 = getActivity();
            if ($r62 != null) {
                ContextExtKt.toast$default($r62, $r5, 0, 2, (Object) null);
            }
            FragmentActivity $r63 = getActivity();
            if ($r63 != null) {
                $r63.finish();
            }
        }
        ActivatePosViewData.Error $r7 = activatePosViewData.getError();
        if ($r7 == null) {
            return;
        }
        String $r52 = $r7.getGenericError();
        if ($r52 != null && ($r6 = getActivity()) != null) {
            ContextExtKt.toast$default($r6, $r52, 0, 2, (Object) null);
        }
        String $r53 = $r7.getTerminalId();
        if ($r53 == null) {
            return;
        }
        KudiInputField $r8 = $r3.terminalIdInputField;
        $r8.setError($r53);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        ActivatePosViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public ActivatePosViewModel createViewModel() {
        ActivatePosViewModel $r1 = getActivatePosVm();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ActivatePosViewModel getActivatePosVm() {
        ActivatePosViewModel $r1 = this.activatePosVm;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("activatePosVm");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return ActivatePosViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        super.onAttach(context);
        boolean $z0 = getActivity() instanceof SettingsActivity;
        if ($z0) {
            FragmentActivity $r2 = getActivity();
            if ($r2 == null) {
                NullPointerException $r5 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.settings.ui.SettingsActivity");
                throw $r5;
            }
            SettingsActivity $r3 = (SettingsActivity) $r2;
            SettingsSubComponent $r4 = $r3.getSettingsSubComponent();
            $r4.inject(this);
            return;
        }
        FragmentActivity $r22 = getActivity();
        if ($r22 == null) {
            NullPointerException $r52 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.pos.ui.PosActivity");
            throw $r52;
        }
        PosActivity $r6 = (PosActivity) $r22;
        PosSubComponent $r7 = $r6.getPos2SubComponent();
        $r7.inject(this);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentActivatePosBinding $r4 = FragmentActivatePosBinding.inflate(layoutInflater, viewGroup, false);
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
        String $r3 = getString(C0001R.string.activate_pos_terminal);
        Log_OC.loadImage($r3, "getString(R.string.activate_pos_terminal)");
        SettingsActivityExtKt.setSettingsTitle(this, $r3);
        SettingsActivityExtKt.setSettingsTitleBarColor(this, C0001R.color.colorPrimary, C0001R.color.white);
        InterfaceC8209a $r4 = requireBinding();
        FragmentActivatePosBinding $r5 = (FragmentActivatePosBinding) $r4;
        ViewGroup $r6 = $r5.activateTerminalButton;
        ViewGroup r9 = $r6;
        r9.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.settings.account.ui.fragment.Main.4
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ActivatePosFragment $r2 = ActivatePosFragment.this;
                ActivatePosFragment.m40677onViewCreated$lambda0($r2, view2);
            }
        });
    }

    public final void setActivatePosVm(ActivatePosViewModel activatePosViewModel) {
        Log_OC.getArray(activatePosViewModel, "<set-?>");
        this.activatePosVm = activatePosViewModel;
    }
}
