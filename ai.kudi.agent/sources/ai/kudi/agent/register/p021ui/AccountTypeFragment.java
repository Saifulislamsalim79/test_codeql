package ai.kudi.agent.register.p021ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import ai.kudi.agent.databinding.AccountTypeFragmentBinding;
import ai.kudi.agent.login.domain.LoginParams;
import ai.kudi.agent.login.setup.DashboardData;
import ai.kudi.agent.register.domain.dto.AccountType;
import ai.kudi.agent.register.domain.wiki.RegistrationInfo;
import ai.kudi.agent.register.p022v2.p023ui.RegisterActivity;
import ai.kudi.agent.register.verifybvn.VerifyBvnPictureViewModel;
import ai.kudi.agent.register.xmpp.components.RegistrationSubComponent;
import ai.kudi.agent.settings.mcc.components.BvnVerificationSubcomponent;
import ai.kudi.agent.settings.p029ui.BvnExistingAgentActivity;
import ai.kudi.dip.library.button.KudiButton;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C1583u;
import androidx.lifecycle.InterfaceC1584v;
import androidx.lifecycle.PreferenceActivity;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: AccountTypeFragment.kt */
@Metadata(m10422d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 +2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001+B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0003H\u0014J\b\u0010\u0013\u001a\u00020\u0002H\u0014J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u0011H\u0002J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J$\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010\"\u001a\u00020\u0011H\u0016J\u001a\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010%\u001a\u00020\u0011H\u0002J\u0016\u0010&\u001a\u00020\u0011*\u00020'2\b\u0010$\u001a\u0004\u0018\u00010(H\u0002J\u0014\u0010)\u001a\u00020\u0011*\u00020*2\u0006\u0010\u0007\u001a\u00020\tH\u0002R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006,"}, m10421d2 = {"Lai/kudi/agent/register/ui/AccountTypeFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/register/verifybvn/VerifyBvnPictureViewModel;", "Lai/kudi/agent/core/mvvm/ViewData;", "Lai/kudi/agent/databinding/AccountTypeFragmentBinding;", "()V", "_binding", "accountType", "Landroidx/lifecycle/MutableLiveData;", "Lai/kudi/agent/register/domain/dto/AccountType;", "kotlin.jvm.PlatformType", "vm", "getVm", "()Lai/kudi/agent/register/verifybvn/VerifyBvnPictureViewModel;", "setVm", "(Lai/kudi/agent/register/verifybvn/VerifyBvnPictureViewModel;)V", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "observeView", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onViewCreated", "view", "setupView", "updateButton", "Landroid/widget/RadioGroup;", "Landroid/widget/TextView;", "updateContinueButton", "Lai/kudi/dip/library/button/KudiButton;", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.register.ui.AccountTypeFragment */
/* loaded from: classes.dex */
public final class AccountTypeFragment extends BaseMVVMViewBindingFragment<VerifyBvnPictureViewModel, ViewData, AccountTypeFragmentBinding> {
    private static final String ARGS_REG_INFO;
    public static final Companion Companion;
    private AccountTypeFragmentBinding _binding;
    private C1583u<AccountType> accountType;
    public VerifyBvnPictureViewModel srv;

    /* compiled from: AccountTypeFragment.kt */
    @Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rR\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, m10421d2 = {"Lai/kudi/agent/register/ui/AccountTypeFragment$Companion;", "", "()V", "ARGS_REG_INFO", "", "getARGS_REG_INFO", "()Ljava/lang/String;", "newInstance", "Lai/kudi/agent/register/ui/AccountTypeFragment;", TransactionBreakDownItemType.DATA, "Lai/kudi/agent/register/domain/dto/RegistrationInfo;", "isFrom", "dashboardData", "Lai/kudi/agent/login/setup/DashboardData;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.register.ui.AccountTypeFragment$Companion */
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
        public static /* synthetic */ AccountTypeFragment newInstance$default(Companion companion, RegistrationInfo registrationInfo, String $r3, DashboardData $r4, int i, Object obj) {
            int $i1 = i & 2;
            if ($i1 != 0) {
                $r3 = "";
            }
            int $i0 = i & 4;
            if ($i0 != 0) {
                $r4 = null;
            }
            AccountTypeFragment $r1 = companion.newInstance(registrationInfo, $r3, $r4);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final String getARGS_REG_INFO() {
            String $r1 = AccountTypeFragment.ARGS_REG_INFO;
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final AccountTypeFragment newInstance(RegistrationInfo registrationInfo, String str, DashboardData dashboardData) {
            Log_OC.getArray(str, "isFrom");
            AccountTypeFragment $r3 = new AccountTypeFragment();
            Bundle $r4 = new Bundle();
            String $r5 = getARGS_REG_INFO();
            $r4.putParcelable($r5, registrationInfo);
            $r4.putString("isFrom", str);
            $r4.putParcelable(LoginParams.DASHBOARD_DATA, dashboardData);
            $r3.setArguments($r4);
            return $r3;
        }
    }

    /* compiled from: AccountTypeFragment.kt */
    @Metadata(k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.register.ui.AccountTypeFragment$WhenMappings */
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        static {
            ai.kudi.agent.register.domain.wiki.AccountType[] $r0 = ai.kudi.agent.register.domain.wiki.AccountType.values();
            int $i0 = $r0.length;
            int[] $r1 = new int[$i0];
            ai.kudi.agent.register.domain.wiki.AccountType $r2 = ai.kudi.agent.register.domain.wiki.AccountType.AGENT;
            int $i02 = $r2.ordinal();
            $r1[$i02] = 1;
            ai.kudi.agent.register.domain.wiki.AccountType $r22 = ai.kudi.agent.register.domain.wiki.AccountType.PERSONAL;
            int $i03 = $r22.ordinal();
            $r1[$i03] = 2;
            ai.kudi.agent.register.domain.wiki.AccountType $r23 = ai.kudi.agent.register.domain.wiki.AccountType.NONE;
            int $i04 = $r23.ordinal();
            $r1[$i04] = 3;
            $EnumSwitchMapping$0 = $r1;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
        ARGS_REG_INFO = "ARGS_REG_INFO";
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AccountTypeFragment() {
        ai.kudi.agent.register.domain.wiki.AccountType $r2 = ai.kudi.agent.register.domain.wiki.AccountType.NONE;
        C1583u $r1 = new C1583u($r2);
        this.accountType = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void observeView() {
        final AccountTypeFragmentBinding $r4 = this._binding;
        if ($r4 == null) {
            Log_OC.LogError("_binding");
            NullPointerException r5 = new NullPointerException("Null throw statement replaced by Soot");
            throw r5;
        }
        C1583u $r1 = this.accountType;
        PreferenceActivity $r3 = getViewLifecycleOwner();
        $r1.observe($r3, new InterfaceC1584v() { // from class: ai.kudi.agent.register.ui.ClassWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // androidx.lifecycle.InterfaceC1584v
            /* renamed from: a */
            public final void mo35481a(Object obj) {
                AccountTypeFragment $r12 = AccountTypeFragment.this;
                AccountTypeFragmentBinding $r2 = $r4;
                ai.kudi.agent.register.domain.wiki.AccountType $r42 = (ai.kudi.agent.register.domain.wiki.AccountType) obj;
                AccountTypeFragment.m40366observeView$lambda1$lambda0($r12, $r2, $r42);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: observeView$lambda-1$lambda-0 */
    public static final void m40366observeView$lambda1$lambda0(AccountTypeFragment accountTypeFragment, AccountTypeFragmentBinding accountTypeFragmentBinding, ai.kudi.agent.register.domain.wiki.AccountType accountType) {
        Log_OC.getArray(accountTypeFragment, "this$0");
        Log_OC.getArray(accountTypeFragmentBinding, "$this_apply");
        KudiButton $r3 = accountTypeFragmentBinding.continueToNextPage;
        Log_OC.loadImage($r3, "continueToNextPage");
        Log_OC.loadImage(accountType, "it");
        accountTypeFragment.updateContinueButton($r3, accountType);
        RadioGroup $r4 = accountTypeFragmentBinding.radioGroup2;
        Log_OC.loadImage($r4, "radioGroup2");
        int[] $r5 = WhenMappings.$EnumSwitchMapping$0;
        int $i0 = $r5[accountType.ordinal()];
        TextView $r6 = null;
        if ($i0 == 1) {
            $r6 = accountTypeFragmentBinding.agentRadioButton;
        } else if ($i0 == 2) {
            $r6 = accountTypeFragmentBinding.personalRadioButton;
        }
        accountTypeFragment.updateButton($r4, $r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setupView() {
        AccountTypeFragmentBinding $r1 = this._binding;
        if ($r1 == null) {
            Log_OC.LogError("_binding");
            NullPointerException r7 = new NullPointerException("Null throw statement replaced by Soot");
            throw r7;
        }
        TextView $r2 = $r1.personalRadioButton;
        $r2.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.register.ui.NumberPicker
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AccountTypeFragment $r22 = AccountTypeFragment.this;
                AccountTypeFragment.m40367setupView$lambda6$lambda3($r22, view);
            }
        });
        TextView $r22 = $r1.agentRadioButton;
        $r22.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.register.ui.a
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AccountTypeFragment $r23 = AccountTypeFragment.this;
                AccountTypeFragment.m40368setupView$lambda6$lambda4($r23, view);
            }
        });
        ViewGroup $r5 = $r1.continueToNextPage;
        ViewGroup r11 = $r5;
        r11.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.register.ui.g
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AccountTypeFragment $r23 = AccountTypeFragment.this;
                AccountTypeFragment.m40369setupView$lambda6$lambda5($r23, view);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setupView$lambda-6$lambda-3 */
    public static final void m40367setupView$lambda6$lambda3(AccountTypeFragment accountTypeFragment, View view) {
        Log_OC.getArray(accountTypeFragment, "this$0");
        C1583u $r2 = accountTypeFragment.accountType;
        ai.kudi.agent.register.domain.wiki.AccountType $r3 = ai.kudi.agent.register.domain.wiki.AccountType.PERSONAL;
        $r2.setValue($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setupView$lambda-6$lambda-4 */
    public static final void m40368setupView$lambda6$lambda4(AccountTypeFragment accountTypeFragment, View view) {
        Log_OC.getArray(accountTypeFragment, "this$0");
        C1583u $r2 = accountTypeFragment.accountType;
        ai.kudi.agent.register.domain.wiki.AccountType $r3 = ai.kudi.agent.register.domain.wiki.AccountType.AGENT;
        $r2.setValue($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setupView$lambda-6$lambda-5 */
    public static final void m40369setupView$lambda6$lambda5(AccountTypeFragment accountTypeFragment, View view) {
        Log_OC.getArray(accountTypeFragment, "this$0");
        Bundle $r2 = accountTypeFragment.requireArguments();
        String $r3 = ARGS_REG_INFO;
        Parcelable $r4 = $r2.getParcelable($r3);
        RegistrationInfo $r5 = (RegistrationInfo) $r4;
        if ($r5 != null) {
            C1583u $r6 = accountTypeFragment.accountType;
            Object $r7 = $r6.getValue();
            ai.kudi.agent.register.domain.wiki.AccountType $r8 = (ai.kudi.agent.register.domain.wiki.AccountType) $r7;
            if ($r8 == null) {
                $r8 = ai.kudi.agent.register.domain.wiki.AccountType.NONE;
            }
            $r5.setAccountType($r8);
        }
        VerifyBvnPictureViewModel $r9 = accountTypeFragment.getVm();
        if ($r5 != null) {
            $r9.onAccountTypeSelected($r5);
            return;
        }
        String $r32 = "Required value was null.".toString();
        IllegalArgumentException $r10 = new IllegalArgumentException($r32);
        throw $r10;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:20:0x000e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void updateButton(android.widget.RadioGroup r22, android.widget.TextView r23) {
        /*
            r21 = this;
            r0 = r22
            kotlin.k0.h r2 = p201g.p227h.p238l.C7678a0.m17853b(r0)
            java.util.Iterator r3 = r2.iterator()
        La:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L7e
            java.lang.Object r5 = r3.next()
            r7 = r5
            android.view.View r7 = (android.view.View) r7
            r6 = r7
            r9 = r6
            androidx.constraintlayout.widget.ConstraintLayout r9 = (androidx.constraintlayout.widget.ConstraintLayout) r9
            r8 = r9
            r11 = r8
            android.view.ViewGroup r11 = (android.view.ViewGroup) r11
            r10 = r11
            r12 = 1
            android.view.View r6 = p201g.p227h.p238l.C7678a0.m17854a(r10, r12)
            r0 = r23
            boolean r4 = kotlin.p483e0.p485d.Log_OC.append(r6, r0)
            if (r4 == 0) goto L50
            r13 = r8
            android.view.ViewGroup r13 = (android.view.ViewGroup) r13
            r10 = r13
            r12 = 0
            android.view.View r6 = p201g.p227h.p238l.C7678a0.m17854a(r10, r12)
            ai.kudi.agent.core.util.ViewExtKt.show(r6)
            r0 = r21
            android.content.Context r14 = r0.requireContext()
            r12 = 2131231637(0x7f080395, float:1.807936E38)
            android.graphics.drawable.Drawable r15 = androidx.core.content.C1335a.m36322f(r14, r12)
            r16 = r8
            android.view.ViewGroup r16 = (android.view.ViewGroup) r16
            r10 = r16
            r10.setBackground(r15)
            goto La
        L50:
            r17 = r8
            android.view.ViewGroup r17 = (android.view.ViewGroup) r17
            r10 = r17
            r12 = 0
            android.view.View r6 = p201g.p227h.p238l.C7678a0.m17854a(r10, r12)
            r12 = 0
            r18 = 1
            r19 = 0
            r0 = r18
            r1 = r19
            ai.kudi.agent.core.util.ViewExtKt.hide$default(r6, r12, r0, r1)
            r0 = r21
            android.content.Context r14 = r0.requireContext()
            r12 = 2131100134(0x7f0601e6, float:1.781264E38)
            android.graphics.drawable.Drawable r15 = androidx.core.content.C1335a.m36322f(r14, r12)
            r20 = r8
            android.view.ViewGroup r20 = (android.view.ViewGroup) r20
            r10 = r20
            r10.setBackground(r15)
            goto La
        L7e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.register.p021ui.AccountTypeFragment.updateButton(android.widget.RadioGroup, android.widget.TextView):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void updateContinueButton(KudiButton kudiButton, ai.kudi.agent.register.domain.wiki.AccountType accountType) {
        ai.kudi.agent.register.domain.wiki.AccountType $r3 = ai.kudi.agent.register.domain.wiki.AccountType.NONE;
        if (accountType == $r3) {
            kudiButton.m38035c();
        } else {
            kudiButton.m38034d();
        }
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected void applyViewData(ViewData viewData) {
        Log_OC.getArray(viewData, "viewData");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        VerifyBvnPictureViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public VerifyBvnPictureViewModel createViewModel() {
        VerifyBvnPictureViewModel $r1 = getVm();
        return $r1;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return VerifyBvnPictureViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final VerifyBvnPictureViewModel getVm() {
        VerifyBvnPictureViewModel $r1 = this.srv;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("vm");
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
        FragmentActivity $r2 = getActivity();
        boolean $z0 = $r2 instanceof RegisterActivity;
        if ($z0) {
            FragmentActivity $r22 = getActivity();
            if ($r22 == null) {
                NullPointerException $r5 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.register.v2.ui.RegisterActivity");
                throw $r5;
            }
            RegisterActivity $r3 = (RegisterActivity) $r22;
            RegistrationSubComponent $r4 = $r3.getRegistrationV2SubComponent();
            $r4.inject(this);
            return;
        }
        boolean $z02 = $r2 instanceof BvnExistingAgentActivity;
        if ($z02) {
            FragmentActivity $r23 = getActivity();
            if ($r23 == null) {
                NullPointerException $r52 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.settings.ui.BvnExistingAgentActivity");
                throw $r52;
            }
            BvnExistingAgentActivity $r6 = (BvnExistingAgentActivity) $r23;
            BvnVerificationSubcomponent $r7 = $r6.getBvnVerificationSubComponent();
            $r7.inject(this);
        }
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
        AccountTypeFragmentBinding $r6 = AccountTypeFragmentBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r6, "inflate(inflater, container, false)");
        View $r7 = initBinding($r6, this);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        FragmentActivity $r1 = getActivity();
        if ($r1 == null) {
            return;
        }
        $r1.setTitle(C0001R.string.business_information);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        InterfaceC8209a $r2 = requireBinding();
        AccountTypeFragmentBinding $r4 = (AccountTypeFragmentBinding) $r2;
        this._binding = $r4;
        setupView();
        observeView();
    }

    public final void setVm(VerifyBvnPictureViewModel verifyBvnPictureViewModel) {
        Log_OC.getArray(verifyBvnPictureViewModel, "<set-?>");
        this.srv = verifyBvnPictureViewModel;
    }
}
