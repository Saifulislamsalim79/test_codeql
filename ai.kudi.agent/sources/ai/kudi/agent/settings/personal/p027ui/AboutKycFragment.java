package ai.kudi.agent.settings.personal.p027ui;

import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.databinding.FragmentAboutKycBinding;
import ai.kudi.agent.settings.mcc.components.SettingsSubComponent;
import ai.kudi.agent.settings.p029ui.SettingsActivity;
import ai.kudi.agent.settings.p029ui.adapters.AboutKycAdapter;
import ai.kudi.agent.settings.personal.p027ui.viewModels.AboutKycViewModel;
import ai.kudi.agent.settings.personal.p027ui.viewModels.data.AboutKycViewData;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: AboutKycFragment.kt */
@Metadata(m10422d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001e2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0014J\b\u0010\u000e\u001a\u00020\u0002H\u0014J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0014J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J$\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u001a\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016R\u001e\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u001f"}, m10421d2 = {"Lai/kudi/agent/settings/personal/ui/AboutKycFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/settings/personal/ui/viewModels/AboutKycViewModel;", "Lai/kudi/agent/settings/personal/ui/viewModels/data/AboutKycViewData;", "Lai/kudi/agent/databinding/FragmentAboutKycBinding;", "()V", "aboutKycViewModel", "getAboutKycViewModel", "()Lai/kudi/agent/settings/personal/ui/viewModels/AboutKycViewModel;", "setAboutKycViewModel", "(Lai/kudi/agent/settings/personal/ui/viewModels/AboutKycViewModel;)V", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.personal.ui.AboutKycFragment */
/* loaded from: classes.dex */
public final class AboutKycFragment extends BaseMVVMViewBindingFragment<AboutKycViewModel, AboutKycViewData, FragmentAboutKycBinding> {
    public static final Companion Companion;
    public AboutKycViewModel aboutKycViewModel;

    /* compiled from: AboutKycFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/agent/settings/personal/ui/AboutKycFragment$Companion;", "", "()V", "newInstance", "Lai/kudi/agent/settings/personal/ui/AboutKycFragment;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.settings.personal.ui.AboutKycFragment$Companion */
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
        public final AboutKycFragment newInstance() {
            AboutKycFragment $r1 = new AboutKycFragment();
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
    public static final AboutKycFragment newInstance() {
        Companion $r1 = Companion;
        AboutKycFragment $r0 = $r1.newInstance();
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        AboutKycViewData $r2 = (AboutKycViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(AboutKycViewData aboutKycViewData) {
        String $r9;
        FragmentActivity $r10;
        Log_OC.getArray(aboutKycViewData, "viewData");
        InterfaceC8209a $r2 = requireBinding();
        FragmentAboutKycBinding $r3 = (FragmentAboutKycBinding) $r2;
        boolean $z0 = aboutKycViewData.isFetching();
        if ($z0) {
            ProgressBar $r4 = $r3.loadingIndicator;
            Log_OC.loadImage($r4, "loadingIndicator");
            ViewExtKt.show($r4);
        } else {
            ProgressBar $r42 = $r3.loadingIndicator;
            Log_OC.loadImage($r42, "loadingIndicator");
            ViewExtKt.hide($r42, true);
        }
        List $r5 = aboutKycViewData.getKycLevels();
        if ($r5 != null) {
            RecyclerView $r6 = $r3.mRecyclerView;
            AboutKycAdapter $r7 = new AboutKycAdapter($r5);
            $r6.setAdapter($r7);
        }
        AboutKycViewData.Error $r8 = aboutKycViewData.getError();
        if ($r8 == null || ($r9 = $r8.getMessage()) == null || ($r10 = getActivity()) == null) {
            return;
        }
        ContextExtKt.toast$default($r10, $r9, 0, 2, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        AboutKycViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public AboutKycViewModel createViewModel() {
        AboutKycViewModel $r1 = getAboutKycViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AboutKycViewModel getAboutKycViewModel() {
        AboutKycViewModel $r1 = this.aboutKycViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("aboutKycViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return AboutKycViewModel.class;
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
        FragmentAboutKycBinding $r4 = FragmentAboutKycBinding.inflate(layoutInflater, viewGroup, false);
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
        InterfaceC8209a $r3 = requireBinding();
        FragmentAboutKycBinding $r4 = (FragmentAboutKycBinding) $r3;
        RecyclerView $r5 = $r4.mRecyclerView;
        FragmentActivity $r6 = getActivity();
        LinearLayoutManager $r7 = new LinearLayoutManager($r6);
        $r5.setLayoutManager($r7);
        $r5.setHasFixedSize(true);
        AboutKycViewModel $r8 = getAboutKycViewModel();
        $r8.getMonthlyKycLevels();
    }

    public final void setAboutKycViewModel(AboutKycViewModel aboutKycViewModel) {
        Log_OC.getArray(aboutKycViewModel, "<set-?>");
        this.aboutKycViewModel = aboutKycViewModel;
    }
}
