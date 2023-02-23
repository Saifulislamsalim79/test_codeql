package ai.kudi.agent.settings.account.p025ui.fragment;

import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.databinding.FragmentPosActivationNotificationReceiverBinding;
import ai.kudi.agent.settings.mcc.components.SettingsSubComponent;
import ai.kudi.agent.settings.navigators.SettingsNavigator;
import ai.kudi.agent.settings.p029ui.SettingsActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: PosActivationNotificationReceiverFragment.kt */
@Metadata(m10422d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \"2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\"B\u0005¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0001H\u0096\u0001J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0012\u0010\u0017\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J$\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\t\u0010!\u001a\u00020\u0003H\u0096\u0001R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, m10421d2 = {"Lai/kudi/agent/settings/account/ui/fragment/PosActivationNotificationReceiverFragment;", "Landroidx/fragment/app/Fragment;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/databinding/FragmentPosActivationNotificationReceiverBinding;", "()V", "binding", "getBinding", "()Lai/kudi/agent/databinding/FragmentPosActivationNotificationReceiverBinding;", "settingsNavigator", "Lai/kudi/agent/settings/navigators/SettingsNavigator;", "getSettingsNavigator", "()Lai/kudi/agent/settings/navigators/SettingsNavigator;", "setSettingsNavigator", "(Lai/kudi/agent/settings/navigators/SettingsNavigator;)V", IjkMediaPlayer.OnNativeInvokeListener.ARG_URL, "", "initBinding", "Landroid/view/View;", "fragment", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "requireBinding", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.account.ui.fragment.PosActivationNotificationReceiverFragment */
/* loaded from: classes.dex */
public final class PosActivationNotificationReceiverFragment extends Fragment implements BaseViewBinder<FragmentPosActivationNotificationReceiverBinding> {
    public static final Companion Companion;
    public static final String EXTRA_URL = "URL";
    private final /* synthetic */ BaseViewBinderImpl<FragmentPosActivationNotificationReceiverBinding> $$delegate_0;
    private String pageId;
    public SettingsNavigator settingsNavigator;

    /* compiled from: PosActivationNotificationReceiverFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m10421d2 = {"Lai/kudi/agent/settings/account/ui/fragment/PosActivationNotificationReceiverFragment$Companion;", "", "()V", PosActivationNotificationReceiverFragment.EXTRA_URL, "", "newInstance", "Lai/kudi/agent/settings/account/ui/fragment/PosActivationNotificationReceiverFragment;", IjkMediaPlayer.OnNativeInvokeListener.ARG_URL, "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.settings.account.ui.fragment.PosActivationNotificationReceiverFragment$Companion */
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
        public final PosActivationNotificationReceiverFragment newInstance(String str) {
            PosActivationNotificationReceiverFragment $r1 = new PosActivationNotificationReceiverFragment();
            Bundle $r2 = new Bundle();
            $r2.putString(PosActivationNotificationReceiverFragment.EXTRA_URL, str);
            C13666w c13666w = C13666w.f30112a;
            $r1.setArguments($r2);
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
    public PosActivationNotificationReceiverFragment() {
        BaseViewBinderImpl $r1 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final PosActivationNotificationReceiverFragment newInstance(String str) {
        Companion $r0 = Companion;
        PosActivationNotificationReceiverFragment $r1 = $r0.newInstance(str);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-5$lambda-2  reason: not valid java name */
    public static final void m40695onViewCreated$lambda5$lambda2(PosActivationNotificationReceiverFragment posActivationNotificationReceiverFragment, View view) {
        Log_OC.getArray(posActivationNotificationReceiverFragment, "this$0");
        String $r3 = posActivationNotificationReceiverFragment.pageId;
        if ($r3 == null) {
            return;
        }
        FragmentActivity $r0 = posActivationNotificationReceiverFragment.requireActivity();
        Log_OC.loadImage($r0, "requireActivity()");
        AppCompatActivityExtKt.openUrlInApp($r0, $r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-5$lambda-3  reason: not valid java name */
    public static final void m40696onViewCreated$lambda5$lambda3(PosActivationNotificationReceiverFragment posActivationNotificationReceiverFragment, View view) {
        Log_OC.getArray(posActivationNotificationReceiverFragment, "this$0");
        SettingsNavigator $r0 = posActivationNotificationReceiverFragment.getSettingsNavigator();
        $r0.toActivatePos();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-5$lambda-4  reason: not valid java name */
    public static final void m40697onViewCreated$lambda5$lambda4(PosActivationNotificationReceiverFragment posActivationNotificationReceiverFragment, View view) {
        Log_OC.getArray(posActivationNotificationReceiverFragment, "this$0");
        FragmentActivity $r0 = posActivationNotificationReceiverFragment.requireActivity();
        $r0.onBackPressed();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentPosActivationNotificationReceiverBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        FragmentPosActivationNotificationReceiverBinding $r3 = (FragmentPosActivationNotificationReceiverBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        FragmentPosActivationNotificationReceiverBinding $r1 = getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SettingsNavigator getSettingsNavigator() {
        SettingsNavigator $r1 = this.settingsNavigator;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("settingsNavigator");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View initBinding(FragmentPosActivationNotificationReceiverBinding fragmentPosActivationNotificationReceiverBinding, Fragment fragment) {
        Log_OC.getArray(fragmentPosActivationNotificationReceiverBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(fragmentPosActivationNotificationReceiverBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        FragmentPosActivationNotificationReceiverBinding $r4 = (FragmentPosActivationNotificationReceiverBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
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
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle $r1 = getArguments();
        if ($r1 == null) {
            return;
        }
        String $r2 = $r1.getString(EXTRA_URL);
        String $r3 = $r2;
        if ($r2 == null) {
            $r3 = "http://bit.ly/kudi-pos-activation";
        }
        this.pageId = $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentPosActivationNotificationReceiverBinding $r4 = FragmentPosActivationNotificationReceiverBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(\n                inflater,\n                container,\n                false\n            )");
        View $r5 = initBinding($r4, (Fragment) this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        boolean $z0 = getActivity() instanceof SettingsActivity;
        if ($z0) {
            FragmentActivity $r3 = getActivity();
            if ($r3 == null) {
                NullPointerException r13 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.settings.ui.SettingsActivity");
                throw r13;
            } else {
                SettingsActivity $r4 = (SettingsActivity) $r3;
                $r4.toggleAppBarLayout(false);
            }
        }
        FragmentPosActivationNotificationReceiverBinding $r6 = requireBinding();
        TextView $r7 = $r6.learnMoreTextView;
        $r7.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.settings.account.ui.fragment.ErrorActivity$3
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PosActivationNotificationReceiverFragment $r2 = PosActivationNotificationReceiverFragment.this;
                PosActivationNotificationReceiverFragment.m40695onViewCreated$lambda5$lambda2($r2, view2);
            }
        });
        ViewGroup $r9 = $r6.getStartedButton;
        ViewGroup r17 = $r9;
        r17.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.settings.account.ui.fragment.EditActivity$4
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PosActivationNotificationReceiverFragment $r2 = PosActivationNotificationReceiverFragment.this;
                PosActivationNotificationReceiverFragment.m40696onViewCreated$lambda5$lambda3($r2, view2);
            }
        });
        ImageView $r11 = $r6.cancelButton;
        $r11.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.settings.account.ui.fragment.TimePicker$4
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PosActivationNotificationReceiverFragment $r2 = PosActivationNotificationReceiverFragment.this;
                PosActivationNotificationReceiverFragment.m40697onViewCreated$lambda5$lambda4($r2, view2);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentPosActivationNotificationReceiverBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        FragmentPosActivationNotificationReceiverBinding $r3 = (FragmentPosActivationNotificationReceiverBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        FragmentPosActivationNotificationReceiverBinding $r1 = requireBinding();
        return $r1;
    }

    public final void setSettingsNavigator(SettingsNavigator settingsNavigator) {
        Log_OC.getArray(settingsNavigator, "<set-?>");
        this.settingsNavigator = settingsNavigator;
    }
}
