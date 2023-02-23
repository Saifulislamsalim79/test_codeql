package ai.kudi.agent.settings.p029ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.core.util.ManageDevice;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import ai.kudi.agent.databinding.FragmentAccountAndSettingsOptionsBinding;
import ai.kudi.agent.savings.extension.StringExtKt;
import ai.kudi.agent.settings.mcc.components.SettingsSubComponent;
import ai.kudi.agent.settings.p029ui.adapters.AccountAndSettingsOptionsAdapter;
import ai.kudi.agent.settings.p029ui.viewModels.AccountAndSettingsOptionsViewModel;
import ai.kudi.agent.settings.p029ui.viewModels.data.AccountAndSettingsOptionsViewData;
import ai.kudi.agent.users.domain.package_1.User;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.play.core.tasks.AbstractC5011c;
import com.google.android.play.core.tasks.InterfaceC5010b;
import java.util.List;
import java.util.Locale;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
import p201g.p270x.InterfaceC8209a;
import p272h.p286c.p287a.p343d.p344a.p345a.AbstractC9327a;
import p272h.p286c.p287a.p343d.p344a.p345a.C9329c;
import p272h.p286c.p287a.p343d.p344a.p345a.InterfaceC9328b;
import p590o.p591a.Timber;
/* compiled from: AccountAndSettingsOptionsFragment.kt */
@Metadata(m10422d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 -2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001-B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0003H\u0014J\u001c\u0010\u0012\u001a\u00020\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00100\u0014H\u0002J\b\u0010\u0016\u001a\u00020\u0002H\u0014J\b\u0010\u0017\u001a\u00020\u0010H\u0002J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0019H\u0014J\"\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\"H\u0016J$\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u001a\u0010+\u001a\u00020\u00102\u0006\u0010,\u001a\u00020$2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006."}, m10421d2 = {"Lai/kudi/agent/settings/ui/AccountAndSettingsOptionsFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/settings/ui/viewModels/AccountAndSettingsOptionsViewModel;", "Lai/kudi/agent/settings/ui/viewModels/data/AccountAndSettingsOptionsViewData;", "Lai/kudi/agent/databinding/FragmentAccountAndSettingsOptionsBinding;", "()V", "accountAndSettingsAdapter", "Lai/kudi/agent/settings/ui/adapters/AccountAndSettingsOptionsAdapter;", "accountAndSettingsOptionsViewModel", "getAccountAndSettingsOptionsViewModel", "()Lai/kudi/agent/settings/ui/viewModels/AccountAndSettingsOptionsViewModel;", "setAccountAndSettingsOptionsViewModel", "(Lai/kudi/agent/settings/ui/viewModels/AccountAndSettingsOptionsViewModel;)V", "appUpdateManager", "Lcom/google/android/play/core/appupdate/AppUpdateManager;", "applyViewData", "", "viewData", "checkAppUpdateAvailable", "onUpdateAvailable", "Lkotlin/Function1;", "Lcom/google/android/play/core/appupdate/AppUpdateInfo;", "createViewModel", "getDeviceDetails", "getVMType", "Ljava/lang/Class;", "onActivityResult", "requestCode", "", "resultCode", TransactionBreakDownItemType.DATA, "Landroid/content/Intent;", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.ui.AccountAndSettingsOptionsFragment */
/* loaded from: classes.dex */
public final class AccountAndSettingsOptionsFragment extends BaseMVVMViewBindingFragment<AccountAndSettingsOptionsViewModel, AccountAndSettingsOptionsViewData, FragmentAccountAndSettingsOptionsBinding> {
    public static final Companion Companion;
    public static final int UPDATE_APP_REQUEST_CODE = 219;
    private AccountAndSettingsOptionsAdapter accountAndSettingsAdapter;
    public AccountAndSettingsOptionsViewModel accountAndSettingsOptionsViewModel;

    /* compiled from: AccountAndSettingsOptionsFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/settings/ui/AccountAndSettingsOptionsFragment$Companion;", "", "()V", "UPDATE_APP_REQUEST_CODE", "", "newInstance", "Lai/kudi/agent/settings/ui/AccountAndSettingsOptionsFragment;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.settings.ui.AccountAndSettingsOptionsFragment$Companion */
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
        public final AccountAndSettingsOptionsFragment newInstance() {
            AccountAndSettingsOptionsFragment $r1 = new AccountAndSettingsOptionsFragment();
            Bundle $r2 = new Bundle();
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final InterfaceC9328b appUpdateManager() {
        Context $r1 = requireContext();
        InterfaceC9328b $r2 = C9329c.m15023a($r1);
        Log_OC.loadImage($r2, "create(requireContext())");
        return $r2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void checkAppUpdateAvailable(final InterfaceC11767l interfaceC11767l) {
        InterfaceC9328b $r2 = appUpdateManager();
        AbstractC5011c $r3 = $r2.mo15019a();
        Log_OC.loadImage($r3, "appUpdateManager.appUpdateInfo");
        $r3.mo25853b(new InterfaceC5010b() { // from class: ai.kudi.agent.settings.ui.b
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: e */
            public final void m38351e(Object obj) {
                InterfaceC11767l $r1 = InterfaceC11767l.this;
                AbstractC9327a $r32 = (AbstractC9327a) obj;
                AccountAndSettingsOptionsFragment.m40899checkAppUpdateAvailable$lambda1($r1, $r32);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: checkAppUpdateAvailable$lambda-1  reason: not valid java name */
    public static final void m40899checkAppUpdateAvailable$lambda1(InterfaceC11767l interfaceC11767l, AbstractC9327a abstractC9327a) {
        Log_OC.getArray(interfaceC11767l, "$onUpdateAvailable");
        int $i0 = abstractC9327a.mo14987r();
        if ($i0 == 2) {
            boolean $z0 = abstractC9327a.m15025n(1);
            if ($z0) {
                Log_OC.loadImage(abstractC9327a, "appUpdateInfo");
                interfaceC11767l.invoke(abstractC9327a);
                return;
            }
        }
        Object[] $r2 = new Object[0];
        Timber.wtf("update not available", $r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void getDeviceDetails() {
        Context $r1 = requireContext();
        SharedPreferences $r2 = $r1.getSharedPreferences(ManageDevice.SECURE_DEVICE_PREFERENCE, 0);
        String $r4 = $r2.getString(ManageDevice.GENERATED_NAME, "");
        String $r3 = $r4 != null ? $r4 : "";
        InterfaceC8209a $r5 = requireBinding();
        FragmentAccountAndSettingsOptionsBinding $r6 = (FragmentAccountAndSettingsOptionsBinding) $r5;
        TextView $r7 = $r6.appInfoText;
        Object[] $r8 = {"3.2.163", $r3};
        CharSequence $r32 = getString(C0001R.string.app_info_text, $r8);
        TextView r9 = $r7;
        r9.setText($r32);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final AccountAndSettingsOptionsFragment newInstance() {
        Companion $r1 = Companion;
        AccountAndSettingsOptionsFragment $r0 = $r1.newInstance();
        return $r0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-0  reason: not valid java name */
    public static final void m40900onViewCreated$lambda0(AccountAndSettingsOptionsFragment accountAndSettingsOptionsFragment, View view) {
        Log_OC.getArray(accountAndSettingsOptionsFragment, "this$0");
        FragmentActivity $r1 = accountAndSettingsOptionsFragment.requireActivity();
        SettingsActivity $r4 = (SettingsActivity) $r1;
        SwitchAccountFragment $r0 = new SwitchAccountFragment();
        AppCompatActivityExtKt.startFragment$default($r4, $r0, C0001R.C0003id.frame, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        AccountAndSettingsOptionsViewData $r2 = (AccountAndSettingsOptionsViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(AccountAndSettingsOptionsViewData accountAndSettingsOptionsViewData) {
        String $r9;
        Log_OC.getArray(accountAndSettingsOptionsViewData, "viewData");
        boolean $z0 = accountAndSettingsOptionsViewData instanceof AccountAndSettingsOptionsViewData.Initial;
        if ($z0) {
            return;
        }
        boolean $z02 = accountAndSettingsOptionsViewData instanceof AccountAndSettingsOptionsViewData.Settings;
        if ($z02) {
            AccountAndSettingsOptionsAdapter $r2 = this.accountAndSettingsAdapter;
            if ($r2 != null) {
                AccountAndSettingsOptionsViewData.Settings $r3 = (AccountAndSettingsOptionsViewData.Settings) accountAndSettingsOptionsViewData;
                List $r4 = $r3.getData();
                $r2.setData($r4);
            }
            InterfaceC8209a $r5 = requireBinding();
            FragmentAccountAndSettingsOptionsBinding $r6 = (FragmentAccountAndSettingsOptionsBinding) $r5;
            TextView $r7 = $r6.accountTypeView;
            AccountAndSettingsOptionsViewData.Settings $r32 = (AccountAndSettingsOptionsViewData.Settings) accountAndSettingsOptionsViewData;
            User $r8 = $r32.getUser();
            String $r92 = $r8.customerType;
            if ($r92 == null) {
                $r92 = "";
            }
            if ($r92 == null) {
                NullPointerException $r11 = new NullPointerException("null cannot be cast to non-null type java.lang.String");
                throw $r11;
            }
            Locale $r10 = Locale.ROOT;
            String $r93 = $r92.toLowerCase($r10);
            Log_OC.loadImage($r93, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
            $r9 = C13276s.m5451A(StringExtKt.capFirstLetter($r93), "_", " ", false, 4, null);
            $r7.setText($r9);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        AccountAndSettingsOptionsViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public AccountAndSettingsOptionsViewModel createViewModel() {
        AccountAndSettingsOptionsViewModel $r1 = getAccountAndSettingsOptionsViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AccountAndSettingsOptionsViewModel getAccountAndSettingsOptionsViewModel() {
        AccountAndSettingsOptionsViewModel $r1 = this.accountAndSettingsOptionsViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("accountAndSettingsOptionsViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return AccountAndSettingsOptionsViewModel.class;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
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
        FragmentAccountAndSettingsOptionsBinding $r4 = FragmentAccountAndSettingsOptionsBinding.inflate(layoutInflater, viewGroup, false);
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
        boolean $z0 = getActivity() instanceof SettingsActivity;
        if ($z0) {
            FragmentActivity $r3 = getActivity();
            if ($r3 == null) {
                NullPointerException $r6 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.settings.ui.SettingsActivity");
                throw $r6;
            }
            SettingsActivity $r4 = (SettingsActivity) $r3;
            String $r5 = getString(C0001R.string.account_and_settings);
            Log_OC.loadImage($r5, "getString(R.string.account_and_settings)");
            $r4.setTitle($r5);
            FragmentActivity $r32 = getActivity();
            if ($r32 == null) {
                NullPointerException $r62 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.settings.ui.SettingsActivity");
                throw $r62;
            } else {
                SettingsActivity $r42 = (SettingsActivity) $r32;
                $r42.setToolBarColor(C0001R.color.colorPrimary, C0001R.color.white);
            }
        }
        AccountAndSettingsOptionsViewModel $r7 = getAccountAndSettingsOptionsViewModel();
        $r7.getAccountSettingsOptions();
        AccountAndSettingsOptionsAdapter $r8 = new AccountAndSettingsOptionsAdapter();
        this.accountAndSettingsAdapter = $r8;
        Context $r10 = requireContext();
        LinearLayoutManager $r9 = new LinearLayoutManager($r10);
        InterfaceC8209a $r11 = requireBinding();
        FragmentAccountAndSettingsOptionsBinding $r12 = (FragmentAccountAndSettingsOptionsBinding) $r11;
        $r12.settingsOptionsRv.setLayoutManager($r9);
        InterfaceC8209a $r112 = requireBinding();
        FragmentAccountAndSettingsOptionsBinding $r122 = (FragmentAccountAndSettingsOptionsBinding) $r112;
        RecyclerView $r13 = $r122.settingsOptionsRv;
        Log_OC.loadImage($r13, "requireBinding().settingsOptionsRv");
        int $i0 = $r9.m35389v2();
        ViewExtKt.addDividerItemDecoration($r13, $i0, C0001R.C0002drawable.transactions_divider);
        InterfaceC8209a $r113 = requireBinding();
        FragmentAccountAndSettingsOptionsBinding $r123 = (FragmentAccountAndSettingsOptionsBinding) $r113;
        TextView $r14 = $r123.switchAccountButton;
        $r14.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.settings.ui.FileSelectionFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AccountAndSettingsOptionsFragment $r2 = AccountAndSettingsOptionsFragment.this;
                AccountAndSettingsOptionsFragment.m40900onViewCreated$lambda0($r2, view2);
            }
        });
        InterfaceC8209a $r114 = requireBinding();
        FragmentAccountAndSettingsOptionsBinding $r124 = (FragmentAccountAndSettingsOptionsBinding) $r114;
        RecyclerView $r132 = $r124.settingsOptionsRv;
        AccountAndSettingsOptionsAdapter $r82 = this.accountAndSettingsAdapter;
        $r132.setAdapter($r82);
        AccountAndSettingsOptionsAdapter $r83 = this.accountAndSettingsAdapter;
        if ($r83 != null) {
            AccountAndSettingsOptionsFragment$onViewCreated$2 $r16 = new AccountAndSettingsOptionsFragment$onViewCreated$2(this);
            $r83.setOnItemClickListener($r16);
        }
        AccountAndSettingsOptionsAdapter $r84 = this.accountAndSettingsAdapter;
        if ($r84 != null) {
            AccountAndSettingsOptionsFragment$onViewCreated$3 $r17 = new AccountAndSettingsOptionsFragment$onViewCreated$3(this);
            $r84.setOnUpdateAppClicked($r17);
        }
        getDeviceDetails();
        AccountAndSettingsOptionsFragment$onViewCreated$4 $r18 = new AccountAndSettingsOptionsFragment$onViewCreated$4(this);
        checkAppUpdateAvailable($r18);
    }

    public final void setAccountAndSettingsOptionsViewModel(AccountAndSettingsOptionsViewModel accountAndSettingsOptionsViewModel) {
        Log_OC.getArray(accountAndSettingsOptionsViewModel, "<set-?>");
        this.accountAndSettingsOptionsViewModel = accountAndSettingsOptionsViewModel;
    }
}
