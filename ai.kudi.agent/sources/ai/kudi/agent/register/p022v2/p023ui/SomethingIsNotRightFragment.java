package ai.kudi.agent.register.p022v2.p023ui;

import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.databinding.FragmentSomethingIsNotRightBinding;
import ai.kudi.agent.help.p006ui.HelpActivity;
import ai.kudi.agent.settings.p029ui.BvnExistingAgentActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: SomethingIsNotRightFragment.kt */
@Metadata(m10422d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00162\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0004J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0001H\u0096\u0001J&\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\t\u0010\u0015\u001a\u00020\u0003H\u0096\u0001R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m10421d2 = {"Lai/kudi/agent/register/v2/ui/SomethingIsNotRightFragment;", "Landroidx/fragment/app/Fragment;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/databinding/FragmentSomethingIsNotRightBinding;", "()V", "binding", "getBinding", "()Lai/kudi/agent/databinding/FragmentSomethingIsNotRightBinding;", "initBinding", "Landroid/view/View;", "fragment", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "requireBinding", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.register.v2.ui.SomethingIsNotRightFragment */
/* loaded from: classes.dex */
public final class SomethingIsNotRightFragment extends Fragment implements BaseViewBinder<FragmentSomethingIsNotRightBinding> {
    public static final String BVN_NO = "BvnNo";
    public static final Companion Companion;
    public static final String PHONE_NO = "PhoneNo";
    private final /* synthetic */ BaseViewBinderImpl<FragmentSomethingIsNotRightBinding> $$delegate_0;

    /* compiled from: SomethingIsNotRightFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/register/v2/ui/SomethingIsNotRightFragment$Companion;", "", "()V", "BVN_NO", "", "PHONE_NO", "newInstance", "Lai/kudi/agent/register/v2/ui/SomethingIsNotRightFragment;", "phoneNo", PhoneFragment.ARG_BVN, "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.register.v2.ui.SomethingIsNotRightFragment$Companion */
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
        public final SomethingIsNotRightFragment newInstance(String str, String str2) {
            Log_OC.getArray(str, "phoneNo");
            Log_OC.getArray(str2, PhoneFragment.ARG_BVN);
            SomethingIsNotRightFragment $r4 = new SomethingIsNotRightFragment();
            Bundle $r2 = new Bundle();
            $r2.putString(SomethingIsNotRightFragment.PHONE_NO, str);
            $r2.putString(SomethingIsNotRightFragment.BVN_NO, str2);
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
    public SomethingIsNotRightFragment() {
        BaseViewBinderImpl $r1 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-0  reason: not valid java name */
    public static final void m40467onViewCreated$lambda0(SomethingIsNotRightFragment somethingIsNotRightFragment, View view) {
        Log_OC.getArray(somethingIsNotRightFragment, "this$0");
        FragmentActivity $r1 = somethingIsNotRightFragment.getActivity();
        Intent $r3 = new Intent($r1, HelpActivity.class);
        somethingIsNotRightFragment.startActivity($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-1  reason: not valid java name */
    public static final void m40468onViewCreated$lambda1(SomethingIsNotRightFragment somethingIsNotRightFragment, View view) {
        Log_OC.getArray(somethingIsNotRightFragment, "this$0");
        Bundle $r2 = somethingIsNotRightFragment.getArguments();
        String $r4 = $r2 == null ? null : $r2.getString(PHONE_NO);
        Bundle $r22 = somethingIsNotRightFragment.getArguments();
        String $r3 = $r22 != null ? $r22.getString(BVN_NO) : null;
        boolean $z0 = somethingIsNotRightFragment.getActivity() instanceof RegisterActivity;
        if ($z0) {
            FragmentActivity $r5 = somethingIsNotRightFragment.getActivity();
            if ($r5 == null) {
                NullPointerException $r7 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.register.v2.ui.RegisterActivity");
                throw $r7;
            }
            RegisterActivity $r6 = (RegisterActivity) $r5;
            $r6.navigateToPhoneView($r4, $r3);
            return;
        }
        FragmentActivity $r52 = somethingIsNotRightFragment.getActivity();
        if ($r52 == null) {
            NullPointerException $r72 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.settings.ui.BvnExistingAgentActivity");
            throw $r72;
        }
        BvnExistingAgentActivity $r8 = (BvnExistingAgentActivity) $r52;
        $r8.navigateToPhoneView($r4, $r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentSomethingIsNotRightBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        FragmentSomethingIsNotRightBinding $r3 = (FragmentSomethingIsNotRightBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        FragmentSomethingIsNotRightBinding $r1 = getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View initBinding(FragmentSomethingIsNotRightBinding fragmentSomethingIsNotRightBinding, Fragment fragment) {
        Log_OC.getArray(fragmentSomethingIsNotRightBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(fragmentSomethingIsNotRightBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        FragmentSomethingIsNotRightBinding $r4 = (FragmentSomethingIsNotRightBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentSomethingIsNotRightBinding $r4 = FragmentSomethingIsNotRightBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
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
        FragmentSomethingIsNotRightBinding $r3 = requireBinding();
        TextView $r4 = $r3.callSupportView;
        TextView r10 = $r4;
        r10.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.register.v2.ui.AboutFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SomethingIsNotRightFragment $r2 = SomethingIsNotRightFragment.this;
                SomethingIsNotRightFragment.m40467onViewCreated$lambda0($r2, view2);
            }
        });
        FragmentSomethingIsNotRightBinding $r32 = requireBinding();
        ViewGroup $r6 = $r32.tryAgain;
        ViewGroup r11 = $r6;
        r11.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.register.v2.ui.ActivityMain$17
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SomethingIsNotRightFragment $r2 = SomethingIsNotRightFragment.this;
                SomethingIsNotRightFragment.m40468onViewCreated$lambda1($r2, view2);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentSomethingIsNotRightBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        FragmentSomethingIsNotRightBinding $r3 = (FragmentSomethingIsNotRightBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        FragmentSomethingIsNotRightBinding $r1 = requireBinding();
        return $r1;
    }
}
