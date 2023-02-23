package ai.kudi.agent.settings.p029ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.databinding.FragmentOpenSourceBinding;
import ai.kudi.agent.register.p021ui.viewmodels.data.OpenSourceViewData;
import ai.kudi.agent.settings.mcc.components.SettingsSubComponent;
import ai.kudi.agent.settings.p029ui.viewModels.OpenSourceViewModel;
import ai.kudi.agent.settings.tablet.SettingsActivityExtKt;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
import p425j.p434c.p435a.AbstractC11178e;
/* compiled from: OpenSourceFragment.kt */
@Metadata(m10422d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0014J\b\u0010\u000e\u001a\u00020\u0002H\u0014J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0014J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J$\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u001a\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016R\u001e\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u001e"}, m10421d2 = {"Lai/kudi/agent/settings/ui/OpenSourceFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/settings/ui/viewModels/OpenSourceViewModel;", "Lai/kudi/agent/register/ui/viewmodels/data/OpenSourceViewData;", "Lai/kudi/agent/databinding/FragmentOpenSourceBinding;", "()V", "openSourceViewModel", "getOpenSourceViewModel", "()Lai/kudi/agent/settings/ui/viewModels/OpenSourceViewModel;", "setOpenSourceViewModel", "(Lai/kudi/agent/settings/ui/viewModels/OpenSourceViewModel;)V", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.ui.OpenSourceFragment */
/* loaded from: classes.dex */
public final class OpenSourceFragment extends BaseMVVMViewBindingFragment<OpenSourceViewModel, OpenSourceViewData, FragmentOpenSourceBinding> {
    public OpenSourceViewModel openSourceViewModel;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        OpenSourceViewData $r2 = (OpenSourceViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(OpenSourceViewData openSourceViewData) {
        Log_OC.getArray(openSourceViewData, "viewData");
        Context $r2 = requireContext();
        AbstractC11178e $r3 = AbstractC11178e.m11446b($r2);
        Log_OC.loadImage($r3, "create(requireContext())");
        InterfaceC8209a $r4 = requireBinding();
        FragmentOpenSourceBinding $r5 = (FragmentOpenSourceBinding) $r4;
        TextView $r6 = $r5.content;
        String $r7 = openSourceViewData.getData();
        Log_OC.append($r7);
        TextView r8 = $r6;
        $r3.mo11429c(r8, $r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        OpenSourceViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public OpenSourceViewModel createViewModel() {
        OpenSourceViewModel $r1 = getOpenSourceViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final OpenSourceViewModel getOpenSourceViewModel() {
        OpenSourceViewModel $r1 = this.openSourceViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("openSourceViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return OpenSourceViewModel.class;
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
            NullPointerException $r5 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.settings.ui.SettingsActivity");
            throw $r5;
        }
        SettingsActivity $r3 = (SettingsActivity) $r2;
        SettingsSubComponent $r4 = $r3.getSettingsSubComponent();
        $r4.inject(this);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentOpenSourceBinding $r4 = FragmentOpenSourceBinding.inflate(layoutInflater, viewGroup, false);
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
        Object[] $r3 = {"3.2.163"};
        String $r4 = getString(C0001R.string.app_version_text, $r3);
        Log_OC.loadImage($r4, "getString(\n                R.string.app_version_text,\n                BuildConfig.VERSION_NAME\n            )");
        SettingsActivityExtKt.setSettingsTitle(this, $r4);
        OpenSourceViewModel $r5 = getOpenSourceViewModel();
        $r5.start();
    }

    public final void setOpenSourceViewModel(OpenSourceViewModel openSourceViewModel) {
        Log_OC.getArray(openSourceViewModel, "<set-?>");
        this.openSourceViewModel = openSourceViewModel;
    }
}
