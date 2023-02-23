package ai.kudi.agent.register.p021ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import ai.kudi.agent.databinding.FragmentSelectBusinessTypeBinding;
import ai.kudi.agent.register.domain.wiki.AccountType;
import ai.kudi.agent.register.domain.wiki.PersonalInfo;
import ai.kudi.agent.register.domain.wiki.RegistrationInfo;
import ai.kudi.agent.register.p022v2.p023ui.RegisterActivity;
import ai.kudi.dip.library.button.KudiButton;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: SelectBusinessTypeFragment.kt */
@Metadata(m10422d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00192\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0004J\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0001H\u0096\u0001J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J$\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u001a\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\t\u0010\u0018\u001a\u00020\u0003H\u0096\u0001R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m10421d2 = {"Lai/kudi/agent/register/ui/SelectBusinessTypeFragment;", "Landroidx/fragment/app/Fragment;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/databinding/FragmentSelectBusinessTypeBinding;", "()V", "binding", "getBinding", "()Lai/kudi/agent/databinding/FragmentSelectBusinessTypeBinding;", "registrationInfo", "Lai/kudi/agent/register/domain/dto/RegistrationInfo;", "initBinding", "Landroid/view/View;", "fragment", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "requireBinding", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.register.ui.SelectBusinessTypeFragment */
/* loaded from: classes.dex */
public final class SelectBusinessTypeFragment extends Fragment implements BaseViewBinder<FragmentSelectBusinessTypeBinding> {
    public static final Companion Companion;
    public static final String REG_INFO = "REG_INFO";
    private final /* synthetic */ BaseViewBinderImpl<FragmentSelectBusinessTypeBinding> $$delegate_0;
    private RegistrationInfo registrationInfo;

    /* compiled from: SelectBusinessTypeFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/register/ui/SelectBusinessTypeFragment$Companion;", "", "()V", "REG_INFO", "", "newInstance", "Lai/kudi/agent/register/ui/SelectBusinessTypeFragment;", TransactionBreakDownItemType.DATA, "Lai/kudi/agent/register/domain/dto/RegistrationInfo;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.register.ui.SelectBusinessTypeFragment$Companion */
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
        public final SelectBusinessTypeFragment newInstance(RegistrationInfo registrationInfo) {
            SelectBusinessTypeFragment $r1 = new SelectBusinessTypeFragment();
            Bundle $r2 = new Bundle();
            $r2.putParcelable("REG_INFO", registrationInfo);
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
    public SelectBusinessTypeFragment() {
        BaseViewBinderImpl $r1 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final SelectBusinessTypeFragment newInstance(RegistrationInfo registrationInfo) {
        Companion $r0 = Companion;
        SelectBusinessTypeFragment $r1 = $r0.newInstance(registrationInfo);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-5$lambda-1  reason: not valid java name */
    public static final void m40387onViewCreated$lambda5$lambda1(SelectBusinessTypeFragment selectBusinessTypeFragment, FragmentSelectBusinessTypeBinding fragmentSelectBusinessTypeBinding, View view) {
        Log_OC.getArray(selectBusinessTypeFragment, "this$0");
        Log_OC.getArray(fragmentSelectBusinessTypeBinding, "$this_apply");
        RegistrationInfo $r4 = selectBusinessTypeFragment.registrationInfo;
        if ($r4 != null) {
            AccountType $r1 = AccountType.MERCHANT;
            $r4.setAccountType($r1);
        }
        RegistrationInfo $r42 = selectBusinessTypeFragment.registrationInfo;
        PersonalInfo $r5 = $r42 == null ? null : $r42.getPersonalInfo();
        if ($r5 != null) {
            AccountType $r12 = AccountType.MERCHANT;
            String $r6 = $r12.name();
            $r5.setCustomerType($r6);
        }
        KudiButton $r7 = fragmentSelectBusinessTypeBinding.continueButton;
        $r7.m38034d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-5$lambda-2  reason: not valid java name */
    public static final void m40388onViewCreated$lambda5$lambda2(SelectBusinessTypeFragment selectBusinessTypeFragment, FragmentSelectBusinessTypeBinding fragmentSelectBusinessTypeBinding, View view) {
        Log_OC.getArray(selectBusinessTypeFragment, "this$0");
        Log_OC.getArray(fragmentSelectBusinessTypeBinding, "$this_apply");
        RegistrationInfo $r4 = selectBusinessTypeFragment.registrationInfo;
        if ($r4 != null) {
            AccountType $r1 = AccountType.MERCHANT_AGENT;
            $r4.setAccountType($r1);
        }
        RegistrationInfo $r42 = selectBusinessTypeFragment.registrationInfo;
        PersonalInfo $r5 = $r42 == null ? null : $r42.getPersonalInfo();
        if ($r5 != null) {
            AccountType $r12 = AccountType.MERCHANT_AGENT;
            String $r6 = $r12.name();
            $r5.setCustomerType($r6);
        }
        KudiButton $r7 = fragmentSelectBusinessTypeBinding.continueButton;
        $r7.m38034d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-5$lambda-3  reason: not valid java name */
    public static final void m40389onViewCreated$lambda5$lambda3(SelectBusinessTypeFragment selectBusinessTypeFragment, FragmentSelectBusinessTypeBinding fragmentSelectBusinessTypeBinding, View view) {
        Log_OC.getArray(selectBusinessTypeFragment, "this$0");
        Log_OC.getArray(fragmentSelectBusinessTypeBinding, "$this_apply");
        RegistrationInfo $r4 = selectBusinessTypeFragment.registrationInfo;
        if ($r4 != null) {
            AccountType $r1 = AccountType.AGENT;
            $r4.setAccountType($r1);
        }
        RegistrationInfo $r42 = selectBusinessTypeFragment.registrationInfo;
        PersonalInfo $r5 = $r42 == null ? null : $r42.getPersonalInfo();
        if ($r5 != null) {
            AccountType $r12 = AccountType.AGENT;
            String $r6 = $r12.name();
            $r5.setCustomerType($r6);
        }
        KudiButton $r7 = fragmentSelectBusinessTypeBinding.continueButton;
        $r7.m38034d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-5$lambda-4  reason: not valid java name */
    public static final void m40390onViewCreated$lambda5$lambda4(SelectBusinessTypeFragment selectBusinessTypeFragment, View view) {
        Log_OC.getArray(selectBusinessTypeFragment, "this$0");
        FragmentActivity $r0 = selectBusinessTypeFragment.requireActivity();
        boolean $z0 = $r0 instanceof RegisterActivity;
        RegisterActivity $r3 = $z0 ? (RegisterActivity) $r0 : null;
        if ($r3 == null) {
            return;
        }
        RegistrationInfo $r4 = selectBusinessTypeFragment.registrationInfo;
        $r3.toSelectBusinessTypeDescriptionView($r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentSelectBusinessTypeBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        FragmentSelectBusinessTypeBinding $r3 = (FragmentSelectBusinessTypeBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        FragmentSelectBusinessTypeBinding $r1 = getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View initBinding(FragmentSelectBusinessTypeBinding fragmentSelectBusinessTypeBinding, Fragment fragment) {
        Log_OC.getArray(fragmentSelectBusinessTypeBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(fragmentSelectBusinessTypeBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        FragmentSelectBusinessTypeBinding $r4 = (FragmentSelectBusinessTypeBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
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
        Parcelable $r2 = $r1.getParcelable("REG_INFO");
        RegistrationInfo $r3 = (RegistrationInfo) $r2;
        this.registrationInfo = $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentSelectBusinessTypeBinding $r4 = FragmentSelectBusinessTypeBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        View $r5 = initBinding($r4, (Fragment) this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        PersonalInfo $r8;
        Log_OC.getArray(view, "view");
        final FragmentSelectBusinessTypeBinding $r3 = requireBinding();
        TextView $r4 = $r3.welcomeText;
        Object[] $r5 = new Object[1];
        RegistrationInfo $r6 = this.registrationInfo;
        String $r7 = null;
        if ($r6 != null && ($r8 = $r6.getPersonalInfo()) != null) {
            $r7 = $r8.getFirstName();
        }
        if ($r7 == null) {
            $r7 = "";
        }
        $r5[0] = $r7;
        $r4.setText(getString(C0001R.string.welcome_text, $r5));
        KudiButton $r9 = $r3.continueButton;
        $r9.m38035c();
        RadioButton $r10 = $r3.merchantRadioButton;
        RadioButton r19 = $r10;
        r19.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.register.ui.SearchResultsFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SelectBusinessTypeFragment $r2 = SelectBusinessTypeFragment.this;
                FragmentSelectBusinessTypeBinding $r32 = $r3;
                SelectBusinessTypeFragment.m40387onViewCreated$lambda5$lambda1($r2, $r32, view2);
            }
        });
        RadioButton $r102 = $r3.merchantAgentRadioButton;
        RadioButton r192 = $r102;
        r192.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.register.ui.FileSelectionFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SelectBusinessTypeFragment $r2 = SelectBusinessTypeFragment.this;
                FragmentSelectBusinessTypeBinding $r32 = $r3;
                SelectBusinessTypeFragment.m40388onViewCreated$lambda5$lambda2($r2, $r32, view2);
            }
        });
        RadioButton $r103 = $r3.agentRadioButton;
        RadioButton r193 = $r103;
        r193.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.register.ui.BaseActivity$3
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SelectBusinessTypeFragment $r2 = SelectBusinessTypeFragment.this;
                FragmentSelectBusinessTypeBinding $r32 = $r3;
                SelectBusinessTypeFragment.m40389onViewCreated$lambda5$lambda3($r2, $r32, view2);
            }
        });
        ViewGroup $r92 = $r3.continueButton;
        ViewGroup r20 = $r92;
        r20.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.register.ui.AboutFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SelectBusinessTypeFragment $r2 = SelectBusinessTypeFragment.this;
                SelectBusinessTypeFragment.m40390onViewCreated$lambda5$lambda4($r2, view2);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentSelectBusinessTypeBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        FragmentSelectBusinessTypeBinding $r3 = (FragmentSelectBusinessTypeBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        FragmentSelectBusinessTypeBinding $r1 = requireBinding();
        return $r1;
    }
}
