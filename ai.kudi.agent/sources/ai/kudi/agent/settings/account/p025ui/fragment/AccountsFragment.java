package ai.kudi.agent.settings.account.p025ui.fragment;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.core.viewBinding.BaseViewBinder;
import ai.kudi.agent.core.viewBinding.BaseViewBinderImpl;
import ai.kudi.agent.databinding.FragmentAccountsBinding;
import ai.kudi.agent.databinding.ViewAccountsInsuranceBinding;
import ai.kudi.agent.postRegistrationSetUp.PostRegistrationActivity;
import ai.kudi.agent.settings.account.presenters.AccountPresenter;
import ai.kudi.agent.settings.account.presenters.AccountView;
import ai.kudi.agent.settings.data.Constants;
import ai.kudi.agent.settings.insurance.p026ui.CashInsuranceActivity;
import ai.kudi.agent.settings.mcc.components.SettingsSubComponent;
import ai.kudi.agent.settings.p029ui.BvnExistingAgentActivity;
import ai.kudi.agent.settings.p029ui.SettingsActivity;
import ai.kudi.agent.settings.tablet.SettingsActivityExtKt;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13252b;
import kotlin.p549l0.C13276s;
import p201g.p270x.InterfaceC8209a;
import p272h.p364d.p365a.p366c.AbstractC9412c;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: AccountsFragment.kt */
@Metadata(m10422d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00050\u0004B\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0018\u001a\u00020\u0003H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001fH\u0096\u0001J\u0010\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\"H\u0016J$\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u0010*\u001a\u00020\u001aH\u0016J\u001a\u0010+\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020\u001d2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\t\u0010-\u001a\u00020\u0005H\u0096\u0001J\b\u0010.\u001a\u00020\u001aH\u0016J\u0010\u0010/\u001a\u00020\u001a2\u0006\u00100\u001a\u00020\u000bH\u0016J\u0010\u00101\u001a\u00020\u001a2\u0006\u00102\u001a\u00020\u000bH\u0016J\b\u00103\u001a\u00020\u001aH\u0002J\u0010\u00104\u001a\u00020\u001a2\u0006\u00102\u001a\u00020\u000bH\u0016J\u0010\u00105\u001a\u00020\u001a2\u0006\u00106\u001a\u00020\u000bH\u0016J\u0010\u00107\u001a\u00020\u001a2\u0006\u00108\u001a\u00020\u000bH\u0016J\b\u00109\u001a\u00020\u001aH\u0016J\b\u0010:\u001a\u00020\u001aH\u0016J\b\u0010;\u001a\u00020\u001aH\u0016J\b\u0010<\u001a\u00020\u001aH\u0002R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001e\u0010\u0013\u001a\u00020\u00038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006="}, m10421d2 = {"Lai/kudi/agent/settings/account/ui/fragment/AccountsFragment;", "Lcom/hannesdorfmann/mosby3/mvp/MvpFragment;", "Lai/kudi/agent/settings/account/presenters/AccountView;", "Lai/kudi/agent/settings/account/presenters/AccountPresenter;", "Lai/kudi/agent/core/viewBinding/BaseViewBinder;", "Lai/kudi/agent/databinding/FragmentAccountsBinding;", "()V", "binding", "getBinding", "()Lai/kudi/agent/databinding/FragmentAccountsBinding;", "firstName", "", "getFirstName", "()Ljava/lang/String;", "setFirstName", "(Ljava/lang/String;)V", "terminalId", "getTerminalId", "setTerminalId", "thisPresenter", "getThisPresenter", "()Lai/kudi/agent/settings/account/presenters/AccountPresenter;", "setThisPresenter", "(Lai/kudi/agent/settings/account/presenters/AccountPresenter;)V", "createPresenter", "dismissBottomSheet", "", "hideTrackingStatusLoading", "initBinding", "Landroid/view/View;", "fragment", "Landroidx/fragment/app/Fragment;", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onViewCreated", "view", "requireBinding", "showActiveStatus", "showBvnUnVerified", "phoneNum", "showInsuranceFetchError", "errorMessage", "showInsuranceFragment", "showInsuranceSignUpError", "showKycLevel", "kycLevel", "showKycLevelError", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "showNoInsurancePlan", "showSuspendedStatus", "showTrackingStatusLoading", "startActivatePos", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.account.ui.fragment.AccountsFragment */
/* loaded from: classes.dex */
public final class AccountsFragment extends AbstractC9412c<AccountView, AccountPresenter> implements AccountView, BaseViewBinder<FragmentAccountsBinding> {
    private final /* synthetic */ BaseViewBinderImpl<FragmentAccountsBinding> $$delegate_0;
    private String firstName;
    private String terminalId;
    public AccountPresenter thisPresenter;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AccountsFragment() {
        BaseViewBinderImpl $r1 = new BaseViewBinderImpl();
        this.$$delegate_0 = $r1;
        this.firstName = "";
    }

    /* renamed from: a */
    public static /* synthetic */ void m38438a(AccountsFragment accountsFragment, String str, View view) {
        m40674showBvnUnVerified$lambda9$lambda8(accountsFragment, str, view);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-1$lambda-0 */
    public static final void m40673onViewCreated$lambda1$lambda0(AccountsFragment accountsFragment, View view) {
        Log_OC.getArray(accountsFragment, "this$0");
        AccountsFragment r5 = accountsFragment;
        Context $r1 = r5.requireContext();
        Intent r4 = new Intent($r1, CashInsuranceActivity.class);
        AccountsFragment r52 = accountsFragment;
        r52.startActivity(r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: showBvnUnVerified$lambda-9$lambda-8 */
    public static final void m40674showBvnUnVerified$lambda9$lambda8(AccountsFragment accountsFragment, String str, View view) {
        Log_OC.getArray(accountsFragment, "this$0");
        Log_OC.getArray(str, "$phoneNum");
        AccountsFragment$showBvnUnVerified$1$1$1 r4 = new AccountsFragment$showBvnUnVerified$1$1$1(str);
        AccountsFragment r5 = accountsFragment;
        ContextExtKt.launchActivity$default((Fragment) r5, false, BvnExistingAgentActivity.class, (InterfaceC11767l) r4, 1, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void showInsuranceFragment() {
        AccountPresenter $r1 = getThisPresenter();
        $r1.logSignUpClicked();
        AccountPresenter $r12 = getThisPresenter();
        $r12.navigateToCashInsurance();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: showKycLevel$lambda-7$lambda-6 */
    public static final void m40675showKycLevel$lambda7$lambda6(AccountsFragment accountsFragment, View view) {
        Log_OC.getArray(accountsFragment, "this$0");
        AccountsFragment$showKycLevel$1$2$1 $r1 = AccountsFragment$showKycLevel$1$2$1.INSTANCE;
        AccountsFragment r3 = accountsFragment;
        ContextExtKt.launchActivity$default((Fragment) r3, false, PostRegistrationActivity.class, (InterfaceC11767l) $r1, 1, (Object) null);
    }

    /* renamed from: showNoInsurancePlan$lambda-4$lambda-3 */
    public static final void m40676showNoInsurancePlan$lambda4$lambda3(AccountsFragment accountsFragment, View view) {
        Log_OC.getArray(accountsFragment, "this$0");
        accountsFragment.showInsuranceFragment();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void startActivatePos() {
        AccountPresenter $r1 = getThisPresenter();
        $r1.toActivatePosTerminal();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public AccountPresenter createPresenter() {
        AccountPresenter $r1 = getThisPresenter();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public /* bridge */ /* synthetic */ InterfaceC9413d createPresenter() {
        InterfaceC9413d $r1 = createPresenter();
        InterfaceC9413d r2 = $r1;
        return r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.settings.account.presenters.AccountView
    public void dismissBottomSheet() {
        AccountsFragment r2 = this;
        FragmentActivity $r1 = r2.requireActivity();
        $r1.onBackPressed();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentAccountsBinding getBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.getBinding();
        FragmentAccountsBinding $r3 = (FragmentAccountsBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a getBinding() {
        FragmentAccountsBinding $r1 = getBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getFirstName() {
        String r1 = this.firstName;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getTerminalId() {
        String r1 = this.terminalId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AccountPresenter getThisPresenter() {
        AccountPresenter $r1 = this.thisPresenter;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("thisPresenter");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.settings.account.presenters.AccountView
    public void hideTrackingStatusLoading() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public View initBinding(FragmentAccountsBinding fragmentAccountsBinding, Fragment fragment) {
        Log_OC.getArray(fragmentAccountsBinding, "binding");
        Log_OC.getArray(fragment, "fragment");
        BaseViewBinderImpl $r4 = this.$$delegate_0;
        View $r2 = $r4.initBinding(fragmentAccountsBinding, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ View initBinding(InterfaceC8209a interfaceC8209a, Fragment fragment) {
        FragmentAccountsBinding $r4 = (FragmentAccountsBinding) interfaceC8209a;
        View $r2 = initBinding($r4, fragment);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        AccountsFragment r7 = this;
        super.onAttach(context);
        AccountsFragment r72 = this;
        FragmentActivity $r2 = r72.getActivity();
        if ($r2 == null) {
            NullPointerException r6 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.settings.ui.SettingsActivity");
            throw r6;
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
        FragmentAccountsBinding $r4 = FragmentAccountsBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        AccountsFragment r6 = this;
        View $r5 = initBinding($r4, (Fragment) r6);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        AccountPresenter $r1 = getThisPresenter();
        $r1.logAccountPageOpenEvent();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9412c, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        AccountsFragment r11 = this;
        String $r3 = r11.getString(C0001R.string.account_information);
        Log_OC.loadImage($r3, "getString(R.string.account_information)");
        AccountsFragment r112 = this;
        SettingsActivityExtKt.setSettingsTitle(r112, $r3);
        AccountsFragment r113 = this;
        SettingsActivityExtKt.setSettingsTitleBarColor(r113, C0001R.color.colorPrimary, C0001R.color.white);
        AccountPresenter $r4 = getThisPresenter();
        $r4.fetchInsuranceStatus();
        FragmentAccountsBinding $r5 = requireBinding();
        ConstraintLayout $r6 = $r5.accountNumbersContainer;
        Log_OC.loadImage($r6, "accountNumbersContainer");
        ViewExtKt.hide$default($r6, false, 1, null);
        ViewAccountsInsuranceBinding $r7 = $r5.insuranceContainer;
        View $r8 = $r7.getRoot();
        Log_OC.loadImage($r8, "insuranceContainer.root");
        View $r1 = $r8;
        ViewExtKt.show($r1);
        AccountPresenter $r42 = getThisPresenter();
        $r42.fetchKycLevel();
        ViewAccountsInsuranceBinding $r72 = $r5.insuranceContainer;
        ViewGroup r12 = $r72.cashInsuranceContainer;
        r12.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.settings.account.ui.fragment.g
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AccountsFragment $r2 = AccountsFragment.this;
                AccountsFragment.m40673onViewCreated$lambda1$lambda0($r2, view2);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public FragmentAccountsBinding requireBinding() {
        BaseViewBinderImpl $r2 = this.$$delegate_0;
        InterfaceC8209a $r1 = $r2.requireBinding();
        FragmentAccountsBinding $r3 = (FragmentAccountsBinding) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.viewBinding.BaseViewBinder
    public /* bridge */ /* synthetic */ InterfaceC8209a requireBinding() {
        FragmentAccountsBinding $r1 = requireBinding();
        return $r1;
    }

    public final void setFirstName(String str) {
        Log_OC.getArray(str, "<set-?>");
        this.firstName = str;
    }

    public final void setTerminalId(String str) {
        this.terminalId = str;
    }

    public final void setThisPresenter(AccountPresenter accountPresenter) {
        Log_OC.getArray(accountPresenter, "<set-?>");
        this.thisPresenter = accountPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.settings.account.presenters.AccountView
    public void showActiveStatus() {
        FragmentAccountsBinding $r1 = requireBinding();
        ViewAccountsInsuranceBinding $r2 = $r1.insuranceContainer;
        View $r3 = $r2.cashInsuranceContainer;
        Log_OC.loadImage($r3, "cashInsuranceContainer");
        ViewExtKt.show($r3);
        ImageView $r4 = $r2.insuranceeContainerImage;
        $r4.setImageResource(C0001R.C0002drawable.ic_verified_green);
        TextView $r5 = $r2.insuranceContaineerText;
        AccountsFragment r8 = this;
        String $r6 = r8.getString(C0001R.string.insurance_is_enabled);
        $r5.setText($r6);
        View $r7 = $r2.viewTop;
        Log_OC.loadImage($r7, "viewTop");
        ViewExtKt.show($r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.settings.account.presenters.AccountView
    public void showBvnUnVerified(final String str) {
        Log_OC.getArray(str, "phoneNum");
        FragmentAccountsBinding $r2 = requireBinding();
        ViewAccountsInsuranceBinding $r3 = $r2.insuranceContainer;
        TextView $r4 = $r3.kycLevelValueView;
        AccountsFragment r9 = this;
        String $r5 = r9.getString(C0001R.string.unverified);
        $r4.setText($r5);
        TextView $r42 = $r3.kycLevelValueView;
        AccountsFragment r92 = this;
        Context $r6 = r92.requireContext();
        Log_OC.loadImage($r6, "requireContext()");
        int $i0 = ContextExtKt.getKudiColor($r6, C0001R.color.kudiBadgeLightRed);
        $r42.setBackgroundColor($i0);
        TextView $r43 = $r3.kycLevelValueView;
        AccountsFragment r93 = this;
        Context $r62 = r93.requireContext();
        Log_OC.loadImage($r62, "requireContext()");
        int $i02 = ContextExtKt.getKudiColor($r62, C0001R.color.kudiBadgeDarkRed);
        $r43.setTextColor($i02);
        TextView $r44 = $r3.upgradeAccountTextView;
        AccountsFragment r94 = this;
        String $r52 = r94.getString(C0001R.string.verify_account);
        $r44.setText($r52);
        TextView $r45 = $r3.upgradeAccountTextView;
        $r45.setCompoundDrawablesRelativeWithIntrinsicBounds(C0001R.C0002drawable.ic_verify_person, 0, 0, 0);
        TextView $r46 = $r3.upgradeAccountTextView;
        $r46.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.settings.account.ui.fragment.Main
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AccountsFragment $r22 = AccountsFragment.this;
                String $r32 = str;
                AccountsFragment.m38438a($r22, $r32, view);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.settings.account.presenters.AccountView
    public void showInsuranceFetchError(String str) {
        Log_OC.getArray(str, "errorMessage");
        FragmentAccountsBinding $r1 = requireBinding();
        ViewAccountsInsuranceBinding $r3 = $r1.insuranceContainer;
        View $r4 = $r3.cashInsuranceContainer;
        Log_OC.loadImage($r4, "requireBinding().insuranceContainer.cashInsuranceContainer");
        View r5 = $r4;
        ViewExtKt.hide$default(r5, false, 1, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.settings.account.presenters.AccountView
    public void showInsuranceSignUpError(String str) {
        Log_OC.getArray(str, "errorMessage");
        AccountsFragment r3 = this;
        FragmentActivity $r2 = r3.getActivity();
        if ($r2 == null) {
            return;
        }
        ContextExtKt.toast$default($r2, str, 0, 2, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.settings.account.presenters.AccountView
    public void showKycLevel(String str) {
        String $r1;
        String $r8;
        Log_OC.getArray(str, "kycLevel");
        FragmentAccountsBinding $r2 = requireBinding();
        ViewAccountsInsuranceBinding $r3 = $r2.insuranceContainer;
        Constants $r4 = Constants.INSTANCE;
        List $r5 = $r4.getKYC_LEVELS();
        Object $r6 = $r5.get(2);
        boolean $z0 = Log_OC.append(str, $r6);
        if ($z0) {
            TextView $r7 = $r3.upgradeAccountTextView;
            Log_OC.loadImage($r7, "upgradeAccountTextView");
            ViewExtKt.hide$default($r7, false, 1, null);
        }
        Constants $r42 = Constants.INSTANCE;
        List $r52 = $r42.getKYC_LEVELS();
        Object $r62 = $r52.get(1);
        boolean $z02 = Log_OC.append(str, $r62);
        if ($z02) {
            TextView $r72 = $r3.upgradeAccountTextView;
            String $r82 = getString(C0001R.string.text_view_info);
            $r72.setText($r82);
        } else {
            TextView $r73 = $r3.upgradeAccountTextView;
            AccountsFragment r17 = this;
            String $r83 = r17.getString(C0001R.string.upgrade_account);
            $r73.setText($r83);
        }
        TextView $r74 = $r3.kycLevelValueView;
        Locale $r9 = Locale.getDefault();
        Log_OC.loadImage($r9, "getDefault()");
        String $r12 = str.toLowerCase($r9);
        String $r84 = $r12;
        Log_OC.loadImage($r12, "(this as java.lang.String).toLowerCase(locale)");
        int $i0 = $r12.length();
        boolean $z03 = $i0 > 0;
        if ($z03) {
            StringBuilder r14 = new StringBuilder();
            char $c1 = $r12.charAt(0);
            boolean $z04 = Character.isLowerCase($c1);
            if ($z04) {
                Locale $r92 = Locale.getDefault();
                Log_OC.loadImage($r92, "getDefault()");
                $r8 = C13252b.m5546d($c1, $r92);
            } else {
                $r8 = String.valueOf($c1);
            }
            r14.append($r8.toString());
            if ($r12 == null) {
                NullPointerException r15 = new NullPointerException("null cannot be cast to non-null type java.lang.String");
                throw r15;
            }
            String $r13 = $r12.substring(1);
            Log_OC.loadImage($r13, "(this as java.lang.String).substring(startIndex)");
            r14.append($r13);
            $r84 = r14.toString();
        }
        $r1 = C13276s.m5451A($r84, "_", " ", false, 4, null);
        $r74.setText($r1);
        TextView $r75 = $r3.kycLevelValueView;
        AccountsFragment r172 = this;
        Context $r122 = r172.requireContext();
        Log_OC.loadImage($r122, "requireContext()");
        int $i02 = ContextExtKt.getKudiColor($r122, C0001R.color.kudiBadgeLightYellow);
        $r75.setBackgroundColor($i02);
        TextView $r76 = $r3.kycLevelValueView;
        AccountsFragment r173 = this;
        Context $r123 = r173.requireContext();
        Log_OC.loadImage($r123, "requireContext()");
        int $i03 = ContextExtKt.getKudiColor($r123, C0001R.color.black);
        $r76.setTextColor($i03);
        TextView $r77 = $r3.upgradeAccountTextView;
        $r77.setCompoundDrawablesRelativeWithIntrinsicBounds(C0001R.C0002drawable.ic_upgrade_account, 0, 0, 0);
        TextView $r78 = $r3.upgradeAccountTextView;
        $r78.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.settings.account.ui.fragment.c
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AccountsFragment $r22 = AccountsFragment.this;
                AccountsFragment.m40675showKycLevel$lambda7$lambda6($r22, view);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.settings.account.presenters.AccountView
    public void showKycLevelError(String str) {
        Log_OC.getArray(str, IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
        AccountsFragment r3 = this;
        FragmentActivity $r2 = r3.requireActivity();
        Log_OC.loadImage($r2, "requireActivity()");
        ContextExtKt.toast$default($r2, str, 0, 2, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.settings.account.presenters.AccountView
    public void showNoInsurancePlan() {
        FragmentAccountsBinding $r1 = requireBinding();
        ViewAccountsInsuranceBinding $r2 = $r1.insuranceContainer;
        View $r3 = $r2.cashInsuranceContainer;
        Log_OC.loadImage($r3, "cashInsuranceContainer");
        ViewExtKt.show($r3);
        ImageView $r4 = $r2.insuranceeContainerImage;
        $r4.setImageResource(C0001R.C0002drawable.ic_arrow_right);
        ImageView $r42 = $r2.insuranceeContainerImage;
        AccountsFragment r14 = this;
        Context $r6 = r14.requireContext();
        Log_OC.loadImage($r6, "requireContext()");
        int $i0 = ContextExtKt.getKudiColor($r6, C0001R.color.yellow);
        PorterDuff.Mode $r7 = PorterDuff.Mode.SRC_IN;
        PorterDuffColorFilter r12 = new PorterDuffColorFilter($i0, $r7);
        $r42.setColorFilter(r12);
        TextView $r8 = $r2.insuranceContaineerText;
        AccountsFragment r142 = this;
        String $r9 = r142.getString(C0001R.string.get_insured_text);
        $r8.setText($r9);
        View $r10 = $r2.viewTop;
        Log_OC.loadImage($r10, "viewTop");
        ViewExtKt.hide$default($r10, false, 1, null);
        ViewGroup r15 = $r2.cashInsuranceContainer;
        r15.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.settings.account.ui.fragment.b
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AccountsFragment $r22 = AccountsFragment.this;
                AccountsFragment.m40676showNoInsurancePlan$lambda4$lambda3($r22, view);
            }
        });
    }

    @Override // ai.kudi.agent.settings.account.presenters.AccountView
    public void showSuspendedStatus() {
        showNoInsurancePlan();
    }

    @Override // ai.kudi.agent.settings.account.presenters.AccountView
    public void showTrackingStatusLoading() {
    }
}
