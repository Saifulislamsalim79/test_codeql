package ai.kudi.agent.settings.account.p025ui.fragment;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.databinding.FragmentBankAccountBinding;
import ai.kudi.agent.postRegistrationSetUp.PostRegistrationActivity;
import ai.kudi.agent.postRegistrationSetUp.labs.PostRegSetUpSubComponent;
import ai.kudi.agent.settings.account.ConstantsKt;
import ai.kudi.agent.settings.account.p025ui.activity.BankAccountActivity;
import ai.kudi.agent.settings.account.p025ui.data.BankAccountViewData;
import ai.kudi.agent.settings.account.p025ui.fragment.AddBankAccountFragment;
import ai.kudi.agent.settings.account.p025ui.viewModel.BankAccountViewModel;
import ai.kudi.agent.settings.account.xpp3.BankAccountSubcomponent;
import ai.kudi.agent.settings.p029ui.adapters.AccountNumberAdapter;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.content.C1335a;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.C1723k;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.tasks.InterfaceC4454e;
import com.google.android.gms.tasks.Item;
import com.google.firebase.remoteconfig.Frame;
import java.util.List;
import kotlin.C13218k;
import kotlin.InterfaceC11824h;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: BankAccountFragment.kt */
@Metadata(m10422d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0003H\u0014J\b\u0010$\u001a\u00020\u0002H\u0014J(\u0010%\u001a\u00020\"2\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'2\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'H\u0002J\u000e\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00020+H\u0014J\u0010\u0010,\u001a\u00020\"2\u0006\u0010-\u001a\u00020.H\u0016J$\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u0001042\b\u00105\u001a\u0004\u0018\u000106H\u0016J\b\u00107\u001a\u00020\"H\u0016J\u001a\u00108\u001a\u00020\"2\u0006\u00109\u001a\u0002002\b\u00105\u001a\u0004\u0018\u000106H\u0016J\b\u0010:\u001a\u00020\"H\u0002J\b\u0010;\u001a\u00020\"H\u0002J\u0010\u0010<\u001a\u00020\"2\u0006\u0010=\u001a\u00020>H\u0002J\u0010\u0010?\u001a\u00020\"2\u0006\u0010=\u001a\u00020>H\u0002J\u0010\u0010@\u001a\u00020\"2\u0006\u0010=\u001a\u00020>H\u0002J\u0010\u0010A\u001a\u00020\"2\u0006\u0010=\u001a\u00020>H\u0002J\u0010\u0010B\u001a\u00020\"2\u0006\u0010=\u001a\u00020>H\u0002J\u0010\u0010C\u001a\u00020\"2\u0006\u0010=\u001a\u00020>H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.¢\u0006\u0002\n\u0000R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006D"}, m10421d2 = {"Lai/kudi/agent/settings/account/ui/fragment/BankAccountFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/settings/account/ui/viewModel/BankAccountViewModel;", "Lai/kudi/agent/settings/account/ui/data/BankAccountViewData;", "Lai/kudi/agent/databinding/FragmentBankAccountBinding;", "()V", "allowableCashoutAccount", "", "allowableFundingAccount", "bankAccountActivity", "Lai/kudi/agent/settings/account/ui/activity/BankAccountActivity;", "cashoutAcctAdapter", "Lai/kudi/agent/settings/ui/adapters/AccountNumberAdapter;", "fundingAcctAdapter", "itemDecoration", "Landroidx/recyclerview/widget/DividerItemDecoration;", "getItemDecoration", "()Landroidx/recyclerview/widget/DividerItemDecoration;", "itemDecoration$delegate", "Lkotlin/Lazy;", "posRegistrationActivity", "Lai/kudi/agent/postRegistrationSetUp/PostRegistrationActivity;", "remoteConfig", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "getRemoteConfig", "()Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "setRemoteConfig", "(Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;)V", "screenViewModel", "getScreenViewModel", "()Lai/kudi/agent/settings/account/ui/viewModel/BankAccountViewModel;", "setScreenViewModel", "(Lai/kudi/agent/settings/account/ui/viewModel/BankAccountViewModel;)V", "applyViewData", "", "viewData", "createViewModel", "displayBankAccounts", "cashoutAccountList", "", "Lai/kudi/agent/core/domain/room_entities/BankAccount;", "fundingAccountList", "getVMType", "Ljava/lang/Class;", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onViewCreated", "view", "requestApiData", "setToolBarTitle", "toggleAddCashoutAccountBtn", "show", "", "toggleAddFundingAccountBtn", "toggleCashoutAcctCardEmptyState", "toggleFundingAcctCardEmptyState", "toggleLoaders", "toggleRetryButton", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.account.ui.fragment.BankAccountFragment */
/* loaded from: classes.dex */
public final class BankAccountFragment extends BaseMVVMViewBindingFragment<BankAccountViewModel, BankAccountViewData, FragmentBankAccountBinding> {
    private int allowableCashoutAccount;
    private int allowableFundingAccount;
    private BankAccountActivity bankAccountActivity;
    private AccountNumberAdapter cashoutAcctAdapter;
    private AccountNumberAdapter fundingAcctAdapter;
    private final InterfaceC11824h itemDecoration$delegate;
    private PostRegistrationActivity posRegistrationActivity;
    public Frame remoteConfig;
    public BankAccountViewModel screenViewModel;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public BankAccountFragment() {
        InterfaceC11824h $r1;
        BankAccountFragment$itemDecoration$2 $r2 = new BankAccountFragment$itemDecoration$2(this);
        $r1 = C13218k.m5625b($r2);
        this.itemDecoration$delegate = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
        if (r3 < r4) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void displayBankAccounts(java.util.List r9, java.util.List r10) {
        /*
            r8 = this;
            if (r9 == 0) goto L74
            if (r10 != 0) goto L5
            return
        L5:
            r0 = 0
            r1 = 0
            r8.toggleRetryButton(r1)
            r1 = 0
            r8.toggleLoaders(r1)
            boolean r2 = r9.isEmpty()
            r8.toggleCashoutAcctCardEmptyState(r2)
            boolean r2 = r9.isEmpty()
            if (r2 != 0) goto L26
            int r3 = r9.size()
            int r4 = r8.allowableCashoutAccount
            if (r3 >= r4) goto L24
            goto L26
        L24:
            r2 = 0
            goto L27
        L26:
            r2 = 1
        L27:
            r8.toggleAddCashoutAccountBtn(r2)
            ai.kudi.agent.settings.ui.adapters.AccountNumberAdapter r5 = r8.cashoutAcctAdapter
            if (r5 == 0) goto L67
            java.util.List r9 = kotlin.p557z.C13722p.m3970D0(r9)
            r5.updateBankAccounts(r9)
            boolean r2 = r10.isEmpty()
            r8.toggleFundingAcctCardEmptyState(r2)
            boolean r2 = r10.isEmpty()
            if (r2 != 0) goto L4a
            int r3 = r10.size()
            int r4 = r8.allowableFundingAccount
            if (r3 >= r4) goto L4b
        L4a:
            r0 = 1
        L4b:
            r8.toggleAddFundingAccountBtn(r0)
            ai.kudi.agent.settings.ui.adapters.AccountNumberAdapter r5 = r8.fundingAcctAdapter
            if (r5 == 0) goto L5a
            java.util.List r9 = kotlin.p557z.C13722p.m3970D0(r10)
            r5.updateBankAccounts(r9)
            return
        L5a:
            java.lang.String r6 = "fundingAcctAdapter"
            kotlin.p483e0.p485d.Log_OC.LogError(r6)
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r6 = "Null throw statement replaced by Soot"
            r7.<init>(r6)
            throw r7
        L67:
            java.lang.String r6 = "cashoutAcctAdapter"
            kotlin.p483e0.p485d.Log_OC.LogError(r6)
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r6 = "Null throw statement replaced by Soot"
            r7.<init>(r6)
            throw r7
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.settings.account.p025ui.fragment.BankAccountFragment.displayBankAccounts(java.util.List, java.util.List):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final C1723k getItemDecoration() {
        InterfaceC11824h $r2 = this.itemDecoration$delegate;
        Object $r1 = $r2.getValue();
        C1723k $r3 = (C1723k) $r1;
        return $r3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-5$lambda-0  reason: not valid java name */
    public static final void m40682onViewCreated$lambda5$lambda0(BankAccountFragment bankAccountFragment, Item item) {
        Log_OC.getArray(bankAccountFragment, "this$0");
        Log_OC.getArray(item, "it");
        boolean $z0 = item.m27801a();
        if ($z0) {
            Frame $r2 = bankAccountFragment.getRemoteConfig();
            String $r3 = $r2.getSetting("allowable_number_of_cashout_account");
            Log_OC.loadImage($r3, "remoteConfig.getString(\n                        \"allowable_number_of_cashout_account\"\n                    )");
            int $i0 = Integer.parseInt($r3);
            bankAccountFragment.allowableCashoutAccount = $i0;
            Frame $r22 = bankAccountFragment.getRemoteConfig();
            String $r32 = $r22.getSetting("allowable_number_of_funding_account");
            Log_OC.loadImage($r32, "remoteConfig.getString(\n                        \"allowable_number_of_funding_account\"\n                    )");
            int $i02 = Integer.parseInt($r32);
            bankAccountFragment.allowableFundingAccount = $i02;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-5$lambda-1  reason: not valid java name */
    public static final void m40683onViewCreated$lambda5$lambda1(BankAccountFragment bankAccountFragment, View view) {
        Log_OC.getArray(bankAccountFragment, "this$0");
        FragmentActivity $r2 = bankAccountFragment.getActivity();
        boolean $z0 = $r2 instanceof BankAccountActivity;
        if (!$z0) {
            Context $r6 = bankAccountFragment.getContext();
            if ($r6 == null) {
                return;
            }
            BankAccountFragment$onViewCreated$1$3$1 $r7 = BankAccountFragment$onViewCreated$1$3$1.INSTANCE;
            ContextExtKt.launchActivity$default($r6, false, BankAccountActivity.class, (InterfaceC11767l) $r7, 1, (Object) null);
            return;
        }
        AddBankAccountFragment.Companion $r3 = AddBankAccountFragment.Companion;
        AddBankAccountFragment $r4 = $r3.newInstance(ConstantsKt.ACCOUNT_TYPE_WALLET_FUNDING);
        BankAccountActivity $r5 = bankAccountFragment.bankAccountActivity;
        if ($r5 != null) {
            AppCompatActivityExtKt.startFragment$default($r5, $r4, C0001R.C0003id.contentFrameLayout, true, false, false, 24, null);
            return;
        }
        Log_OC.LogError("bankAccountActivity");
        NullPointerException r8 = new NullPointerException("Null throw statement replaced by Soot");
        throw r8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-5$lambda-2  reason: not valid java name */
    public static final void m40684onViewCreated$lambda5$lambda2(BankAccountFragment bankAccountFragment, View view) {
        Log_OC.getArray(bankAccountFragment, "this$0");
        FragmentActivity $r2 = bankAccountFragment.getActivity();
        boolean $z0 = $r2 instanceof BankAccountActivity;
        if (!$z0) {
            Context $r6 = bankAccountFragment.getContext();
            if ($r6 == null) {
                return;
            }
            BankAccountFragment$onViewCreated$1$4$1 $r7 = BankAccountFragment$onViewCreated$1$4$1.INSTANCE;
            ContextExtKt.launchActivity$default($r6, false, BankAccountActivity.class, (InterfaceC11767l) $r7, 1, (Object) null);
            return;
        }
        AddBankAccountFragment.Companion $r3 = AddBankAccountFragment.Companion;
        AddBankAccountFragment $r4 = $r3.newInstance(ConstantsKt.ACCOUNT_TYPE_CASHOUT);
        BankAccountActivity $r5 = bankAccountFragment.bankAccountActivity;
        if ($r5 != null) {
            AppCompatActivityExtKt.startFragment$default($r5, $r4, C0001R.C0003id.contentFrameLayout, true, false, false, 24, null);
            return;
        }
        Log_OC.LogError("bankAccountActivity");
        NullPointerException r8 = new NullPointerException("Null throw statement replaced by Soot");
        throw r8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-5$lambda-3  reason: not valid java name */
    public static final void m40685onViewCreated$lambda5$lambda3(BankAccountFragment bankAccountFragment, View view) {
        Log_OC.getArray(bankAccountFragment, "this$0");
        bankAccountFragment.requestApiData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-5$lambda-4  reason: not valid java name */
    public static final void m40686onViewCreated$lambda5$lambda4(BankAccountFragment bankAccountFragment, View view) {
        Log_OC.getArray(bankAccountFragment, "this$0");
        bankAccountFragment.requestApiData();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void requestApiData() {
        toggleLoaders(true);
        toggleAddCashoutAccountBtn(false);
        toggleAddFundingAccountBtn(false);
        toggleRetryButton(false);
        BankAccountViewModel $r1 = getScreenViewModel();
        $r1.fetchUserBankAccount();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setToolBarTitle() {
        FragmentActivity $r1 = getActivity();
        boolean $z0 = $r1 instanceof BankAccountActivity;
        if (!$z0) {
            InterfaceC8209a $r2 = requireBinding();
            FragmentBankAccountBinding $r3 = (FragmentBankAccountBinding) $r2;
            TextView $r4 = $r3.tvDesc;
            Log_OC.loadImage($r4, "requireBinding().tvDesc");
            ViewExtKt.hide$default($r4, false, 1, null);
            return;
        }
        InterfaceC8209a $r22 = requireBinding();
        FragmentBankAccountBinding $r32 = (FragmentBankAccountBinding) $r22;
        TextView $r42 = $r32.tvDesc;
        Log_OC.loadImage($r42, "requireBinding().tvDesc");
        ViewExtKt.show($r42);
        BankAccountActivity $r5 = this.bankAccountActivity;
        if ($r5 == null) {
            Log_OC.LogError("bankAccountActivity");
            NullPointerException r7 = new NullPointerException("Null throw statement replaced by Soot");
            throw r7;
        }
        String $r6 = getString(C0001R.string.text_bank_accounts);
        Log_OC.loadImage($r6, "getString(R.string.text_bank_accounts)");
        $r5.setToolbarTitle($r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void toggleAddCashoutAccountBtn(boolean z) {
        InterfaceC8209a $r1 = requireBinding();
        FragmentBankAccountBinding $r2 = (FragmentBankAccountBinding) $r1;
        TextView $r3 = $r2.cashoutAddBankAcctView;
        Log_OC.loadImage($r3, "requireBinding().cashoutAddBankAcctView");
        ViewExtKt.toggleVisibility($r3, z);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void toggleAddFundingAccountBtn(boolean z) {
        InterfaceC8209a $r1 = requireBinding();
        FragmentBankAccountBinding $r2 = (FragmentBankAccountBinding) $r1;
        TextView $r3 = $r2.fundingAddBankAcctView;
        Log_OC.loadImage($r3, "requireBinding().fundingAddBankAcctView");
        ViewExtKt.toggleVisibility($r3, z);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void toggleCashoutAcctCardEmptyState(boolean z) {
        InterfaceC8209a $r1 = requireBinding();
        FragmentBankAccountBinding $r2 = (FragmentBankAccountBinding) $r1;
        TextView $r3 = $r2.cashoutEmptyDescView;
        Log_OC.loadImage($r3, "cashoutEmptyDescView");
        ViewExtKt.toggleVisibility($r3, z);
        View $r4 = $r2.cashoutAcctNumberList;
        Log_OC.loadImage($r4, "cashoutAcctNumberList");
        boolean $z0 = !z;
        View r5 = $r4;
        ViewExtKt.toggleVisibility(r5, $z0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void toggleFundingAcctCardEmptyState(boolean z) {
        InterfaceC8209a $r1 = requireBinding();
        FragmentBankAccountBinding $r2 = (FragmentBankAccountBinding) $r1;
        TextView $r3 = $r2.fundingEmptyDescView;
        Log_OC.loadImage($r3, "fundingEmptyDescView");
        ViewExtKt.toggleVisibility($r3, z);
        View $r4 = $r2.fundingAcctNumberList;
        Log_OC.loadImage($r4, "fundingAcctNumberList");
        boolean $z0 = !z;
        View r5 = $r4;
        ViewExtKt.toggleVisibility(r5, $z0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void toggleLoaders(boolean z) {
        InterfaceC8209a $r1 = requireBinding();
        FragmentBankAccountBinding $r2 = (FragmentBankAccountBinding) $r1;
        if (z) {
            ProgressBar $r3 = $r2.cashoutAcctNumbersLoader;
            Log_OC.loadImage($r3, "cashoutAcctNumbersLoader");
            ViewExtKt.show($r3);
            ProgressBar $r32 = $r2.fundingAcctNumbersLoader;
            Log_OC.loadImage($r32, "fundingAcctNumbersLoader");
            ViewExtKt.show($r32);
            return;
        }
        ProgressBar $r33 = $r2.cashoutAcctNumbersLoader;
        Log_OC.loadImage($r33, "cashoutAcctNumbersLoader");
        ViewExtKt.hide$default($r33, false, 1, null);
        ProgressBar $r34 = $r2.fundingAcctNumbersLoader;
        Log_OC.loadImage($r34, "fundingAcctNumbersLoader");
        ViewExtKt.hide$default($r34, false, 1, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void toggleRetryButton(boolean z) {
        InterfaceC8209a $r1 = requireBinding();
        FragmentBankAccountBinding $r2 = (FragmentBankAccountBinding) $r1;
        if (!z) {
            View $r3 = $r2.cashoutCardRetryButton;
            Log_OC.loadImage($r3, "cashoutCardRetryButton");
            View r5 = $r3;
            ViewExtKt.hide$default(r5, false, 1, null);
            View $r32 = $r2.fundingCardRetryButton;
            Log_OC.loadImage($r32, "fundingCardRetryButton");
            View r52 = $r32;
            ViewExtKt.hide$default(r52, false, 1, null);
            return;
        }
        View $r33 = $r2.cashoutCardRetryButton;
        Log_OC.loadImage($r33, "cashoutCardRetryButton");
        View r53 = $r33;
        ViewExtKt.show(r53);
        View $r34 = $r2.fundingCardRetryButton;
        Log_OC.loadImage($r34, "fundingCardRetryButton");
        View r54 = $r34;
        ViewExtKt.show(r54);
        TextView $r4 = $r2.cashoutEmptyDescView;
        Log_OC.loadImage($r4, "cashoutEmptyDescView");
        ViewExtKt.hide$default($r4, false, 1, null);
        TextView $r42 = $r2.fundingEmptyDescView;
        Log_OC.loadImage($r42, "fundingEmptyDescView");
        ViewExtKt.hide$default($r42, false, 1, null);
        toggleAddCashoutAccountBtn(false);
        toggleAddFundingAccountBtn(false);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        BankAccountViewData $r2 = (BankAccountViewData) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(BankAccountViewData bankAccountViewData) {
        Log_OC.getArray(bankAccountViewData, "viewData");
        List $r2 = bankAccountViewData.getCashoutAccountList();
        List $r3 = bankAccountViewData.getFundingAccountList();
        displayBankAccounts($r2, $r3);
        boolean $z0 = bankAccountViewData.getShowLoader();
        toggleLoaders($z0);
        String $r4 = bankAccountViewData.getErrorText();
        if ($r4 == null) {
            return;
        }
        FragmentActivity $r5 = getActivity();
        if ($r5 != null) {
            ContextExtKt.toast$default($r5, $r4, 0, 2, (Object) null);
        }
        toggleRetryButton(true);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        BankAccountViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public BankAccountViewModel createViewModel() {
        BankAccountViewModel $r1 = getScreenViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Frame getRemoteConfig() {
        Frame $r1 = this.remoteConfig;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("remoteConfig");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final BankAccountViewModel getScreenViewModel() {
        BankAccountViewModel $r1 = this.screenViewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("screenViewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return BankAccountViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        super.onAttach(context);
        boolean $z0 = context instanceof BankAccountActivity;
        if ($z0) {
            BankAccountActivity $r2 = (BankAccountActivity) context;
            this.bankAccountActivity = $r2;
            if ($r2 != null) {
                BankAccountSubcomponent $r3 = $r2.getBankAccountSubcomponent();
                $r3.inject(this);
                return;
            }
            Log_OC.LogError("bankAccountActivity");
            NullPointerException r6 = new NullPointerException("Null throw statement replaced by Soot");
            throw r6;
        }
        boolean $z02 = context instanceof PostRegistrationActivity;
        if ($z02) {
            PostRegistrationActivity $r4 = (PostRegistrationActivity) context;
            this.posRegistrationActivity = $r4;
            if ($r4 != null) {
                PostRegSetUpSubComponent $r5 = $r4.getPostRegSetUpSubComponent();
                $r5.inject(this);
                return;
            }
            Log_OC.LogError("posRegistrationActivity");
            NullPointerException r62 = new NullPointerException("Null throw statement replaced by Soot");
            throw r62;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentBankAccountBinding $r4 = FragmentBankAccountBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        View $r5 = initBinding($r4, this);
        return $r5;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        requestApiData();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        InterfaceC8209a $r3 = requireBinding();
        FragmentBankAccountBinding $r4 = (FragmentBankAccountBinding) $r3;
        Frame $r5 = getRemoteConfig();
        Item $r6 = $r5.m20914c();
        $r6.m27799a(new InterfaceC4454e() { // from class: ai.kudi.agent.settings.account.ui.fragment.ClassWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: c */
            public final void m38430c(Item item) {
                BankAccountFragment $r2 = BankAccountFragment.this;
                BankAccountFragment.m40682onViewCreated$lambda5$lambda0($r2, item);
            }
        });
        FragmentActivity $r8 = getActivity();
        boolean $z0 = $r8 instanceof PostRegistrationActivity;
        if ($z0) {
            PostRegistrationActivity $r9 = this.posRegistrationActivity;
            if ($r9 == null) {
                Log_OC.LogError("posRegistrationActivity");
                NullPointerException r24 = new NullPointerException("Null throw statement replaced by Soot");
                throw r24;
            }
            BankAccountFragment$onViewCreated$1$2 r26 = new BankAccountFragment$onViewCreated$1$2(this);
            $r9.setActionButtonClickListener(r26);
            PostRegistrationActivity $r92 = this.posRegistrationActivity;
            if ($r92 == null) {
                Log_OC.LogError("posRegistrationActivity");
                NullPointerException r242 = new NullPointerException("Null throw statement replaced by Soot");
                throw r242;
            }
            $r92.setButtonText("Save");
            PostRegistrationActivity $r93 = this.posRegistrationActivity;
            if ($r93 == null) {
                Log_OC.LogError("posRegistrationActivity");
                NullPointerException r243 = new NullPointerException("Null throw statement replaced by Soot");
                throw r243;
            }
            String $r11 = getString(C0001R.string.set_up_your_bank_accounts);
            Log_OC.loadImage($r11, "getString(R.string.set_up_your_bank_accounts)");
            $r93.setTitle($r11);
            PostRegistrationActivity $r94 = this.posRegistrationActivity;
            if ($r94 == null) {
                Log_OC.LogError("posRegistrationActivity");
                NullPointerException r244 = new NullPointerException("Null throw statement replaced by Soot");
                throw r244;
            }
            String $r112 = getString(C0001R.string.set_up_bank_account_subtite);
            Log_OC.loadImage($r112, "getString(R.string.set_up_bank_account_subtite)");
            $r94.setSubtitle($r112);
        }
        setToolBarTitle();
        C1723k $r12 = getItemDecoration();
        Context $r13 = requireContext();
        Drawable $r14 = C1335a.m36322f($r13, C0001R.C0002drawable.transactions_divider);
        Log_OC.append($r14);
        $r12.m34703f($r14);
        RecyclerView $r15 = $r4.cashoutAcctNumberList;
        C1723k $r122 = getItemDecoration();
        $r15.m35294h($r122);
        RecyclerView $r152 = $r4.cashoutAcctNumberList;
        Context $r132 = getContext();
        LinearLayoutManager r27 = new LinearLayoutManager($r132);
        $r152.setLayoutManager(r27);
        AccountNumberAdapter r28 = new AccountNumberAdapter();
        this.cashoutAcctAdapter = r28;
        RecyclerView $r153 = $r4.cashoutAcctNumberList;
        if (r28 == null) {
            Log_OC.LogError("cashoutAcctAdapter");
            NullPointerException r245 = new NullPointerException("Null throw statement replaced by Soot");
            throw r245;
        }
        $r153.setAdapter(r28);
        RecyclerView $r154 = $r4.fundingAcctNumberList;
        C1723k $r123 = getItemDecoration();
        $r154.m35294h($r123);
        RecyclerView $r155 = $r4.fundingAcctNumberList;
        Context $r133 = getContext();
        LinearLayoutManager r272 = new LinearLayoutManager($r133);
        $r155.setLayoutManager(r272);
        AccountNumberAdapter r282 = new AccountNumberAdapter();
        this.fundingAcctAdapter = r282;
        RecyclerView $r156 = $r4.fundingAcctNumberList;
        if (r282 == null) {
            Log_OC.LogError("fundingAcctAdapter");
            NullPointerException r246 = new NullPointerException("Null throw statement replaced by Soot");
            throw r246;
        }
        $r156.setAdapter(r282);
        TextView $r18 = $r4.fundingAddBankAcctView;
        $r18.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.settings.account.ui.fragment.FileSelectionFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BankAccountFragment $r2 = BankAccountFragment.this;
                BankAccountFragment.m40683onViewCreated$lambda5$lambda1($r2, view2);
            }
        });
        TextView $r182 = $r4.cashoutAddBankAcctView;
        $r182.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.settings.account.ui.fragment.d
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BankAccountFragment $r2 = BankAccountFragment.this;
                BankAccountFragment.m40684onViewCreated$lambda5$lambda2($r2, view2);
            }
        });
        LinearLayout $r21 = $r4.cashoutCardRetryButton;
        LinearLayout r33 = $r21;
        r33.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.settings.account.ui.fragment.EulaActivity$2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BankAccountFragment $r2 = BankAccountFragment.this;
                BankAccountFragment.m40685onViewCreated$lambda5$lambda3($r2, view2);
            }
        });
        LinearLayout $r212 = $r4.fundingCardRetryButton;
        LinearLayout r332 = $r212;
        r332.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.settings.account.ui.fragment.SearchResultsFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BankAccountFragment $r2 = BankAccountFragment.this;
                BankAccountFragment.m40686onViewCreated$lambda5$lambda4($r2, view2);
            }
        });
    }

    public final void setRemoteConfig(Frame frame) {
        Log_OC.getArray(frame, "<set-?>");
        this.remoteConfig = frame;
    }

    public final void setScreenViewModel(BankAccountViewModel bankAccountViewModel) {
        Log_OC.getArray(bankAccountViewModel, "<set-?>");
        this.screenViewModel = bankAccountViewModel;
    }
}
