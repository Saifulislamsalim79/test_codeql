package ai.kudi.agent.wallettopup;

import ai.kudi.agent.BaseApplication;
import ai.kudi.agent.C0001R;
import ai.kudi.agent.analytics.SmartLookAnalytics;
import ai.kudi.agent.core.internal.components.ApplicationComponent;
import ai.kudi.agent.core.mvp.MvpActivity;
import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.databinding.ActivityWalletTopUpBinding;
import ai.kudi.agent.databinding.WalletLoaderViewBinding;
import ai.kudi.agent.login.domain.LoginParams;
import ai.kudi.agent.payments.domain.wiki.PaymentMethod;
import ai.kudi.agent.transactions.p032ui.PaymentWebViewActivity;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.users.navigators.WebViewNavigator;
import ai.kudi.agent.users.viewmodels.data.WalletTopupViewData;
import ai.kudi.agent.wallettopup.fragments.BankTransferFragment;
import ai.kudi.agent.wallettopup.fragments.CardTopUpAmountFragment;
import ai.kudi.agent.wallettopup.fragments.CashDepositFragment;
import ai.kudi.agent.wallettopup.labs.WalletTopupSubcomponent;
import ai.kudi.agent.wallettopup.navigators.WalletTopupNavigator;
import ai.kudi.agent.wallettopup.presenters.WalletTopupPresenter;
import ai.kudi.agent.wallettopup.views.WalletTopupView;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AbstractC0925a;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.tasks.InterfaceC4454e;
import com.google.android.gms.tasks.Item;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.remoteconfig.Frame;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: WalletTopUpActivity.kt */
@Metadata(m10422d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 M2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00022\u00020\u00052\u00020\u0006:\u0001MB\u0005¢\u0006\u0002\u0010\u0007J\u000e\u0010/\u001a\u0002002\u0006\u0010\u000b\u001a\u000201J\b\u00102\u001a\u00020\u0003H\u0016J\b\u00103\u001a\u000200H\u0016J\u0012\u00104\u001a\u0002002\b\u00105\u001a\u0004\u0018\u000101H\u0016J\u0010\u00106\u001a\u0002002\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u00107\u001a\u000200H\u0016J\u0012\u00108\u001a\u0002002\b\u00109\u001a\u0004\u0018\u00010:H\u0014J\u0010\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>H\u0016J-\u0010?\u001a\u0002002\u0006\u0010@\u001a\u00020A2\u000e\u0010B\u001a\n\u0012\u0006\b\u0001\u0012\u0002010C2\u0006\u0010D\u001a\u00020EH\u0016¢\u0006\u0002\u0010FJ\u0012\u0010G\u001a\u0002002\b\u0010H\u001a\u0004\u0018\u000101H\u0002J\u0010\u0010I\u001a\u0002002\u0006\u0010J\u001a\u00020KH\u0016J\b\u0010L\u001a\u000200H\u0016R\u0014\u0010\b\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\u0019\u0010\u0007\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010$\u001a\u00020\u00038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010)\u001a\u00020*X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u0006N"}, m10421d2 = {"Lai/kudi/agent/wallettopup/WalletTopUpActivity;", "Lai/kudi/agent/core/mvp/MvpActivity;", "Lai/kudi/agent/wallettopup/views/WalletTopupView;", "Lai/kudi/agent/wallettopup/presenters/WalletTopupPresenter;", "Lai/kudi/agent/databinding/ActivityWalletTopUpBinding;", "Lai/kudi/agent/wallettopup/navigators/WalletTopupNavigator;", "Lai/kudi/agent/users/navigators/WebViewNavigator;", "()V", "activityBinding", "getActivityBinding", "()Lai/kudi/agent/databinding/ActivityWalletTopUpBinding;", TransactionField.AMOUNT, "", "getAmount", "()D", "setAmount", "(D)V", "selectedCard", "Lai/kudi/agent/payments/domain/dto/PaymentMethod;", "getSelectedCard", "()Lai/kudi/agent/payments/domain/dto/PaymentMethod;", "setSelectedCard", "(Lai/kudi/agent/payments/domain/dto/PaymentMethod;)V", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences$annotations", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "setSharedPreferences", "(Landroid/content/SharedPreferences;)V", "smartLookAnalytics", "Lai/kudi/agent/analytics/SmartLookAnalytics;", "getSmartLookAnalytics", "()Lai/kudi/agent/analytics/SmartLookAnalytics;", "setSmartLookAnalytics", "(Lai/kudi/agent/analytics/SmartLookAnalytics;)V", "walletTopupPresenter", "getWalletTopupPresenter", "()Lai/kudi/agent/wallettopup/presenters/WalletTopupPresenter;", "setWalletTopupPresenter", "(Lai/kudi/agent/wallettopup/presenters/WalletTopupPresenter;)V", "walletTopupSubcomponent", "Lai/kudi/agent/wallettopup/di/WalletTopupSubcomponent;", "getWalletTopupSubcomponent", "()Lai/kudi/agent/wallettopup/di/WalletTopupSubcomponent;", "setWalletTopupSubcomponent", "(Lai/kudi/agent/wallettopup/di/WalletTopupSubcomponent;)V", "addNewCard", "", "", "createPresenter", "hideLoading", "navigate", IjkMediaPlayer.OnNativeInvokeListener.ARG_URL, "navigateToPaymentMethods", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "setUpFragmentTabs", WalletTopUpActivity.EXTRA_MODE, "showError", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "Lai/kudi/agent/users/viewmodels/data/WalletTopupViewData$Error;", "showLoading", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class WalletTopUpActivity extends MvpActivity<WalletTopupView, WalletTopupPresenter, ActivityWalletTopUpBinding> implements WalletTopupView, WalletTopupNavigator, WebViewNavigator {
    public static final int BANK_TRANSFER_ID = 0;
    public static final int CASH_DEPOSIT_ID = 2;
    public static final Companion Companion;
    public static final String EXTRA_MODE = "mode";
    public static final String MODE_KYC_LEVEL_0 = "mode_kyc_level";
    public static final String MODE_WALLET_TOPUP = "mode_wallet_topup";
    public static final int PERMISSION_REQUEST_CODE = 1001;
    public static final int WALLET_TOPUP_ID = 1;
    private double amount;
    private PaymentMethod selectedCard;
    public SharedPreferences sharedPreferences;
    public SmartLookAnalytics smartLookAnalytics;
    public WalletTopupPresenter walletTopupPresenter;
    public WalletTopupSubcomponent walletTopupSubcomponent;

    /* compiled from: WalletTopUpActivity.kt */
    @Metadata(m10422d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, m10421d2 = {"Lai/kudi/agent/wallettopup/WalletTopUpActivity$Companion;", "", "()V", "BANK_TRANSFER_ID", "", "CASH_DEPOSIT_ID", "EXTRA_MODE", "", "MODE_KYC_LEVEL_0", "MODE_WALLET_TOPUP", "PERMISSION_REQUEST_CODE", "WALLET_TOPUP_ID", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
    }

    public static /* synthetic */ void getSharedPreferences$annotations() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setUpFragmentTabs(final String str) {
        InterfaceC8209a $r2 = getBinding();
        ActivityWalletTopUpBinding $r3 = (ActivityWalletTopUpBinding) $r2;
        final TabLayout $r4 = $r3.tabLayout;
        Log_OC.loadImage($r4, "binding.tabLayout");
        TabLayout.C4745g $r5 = $r4.m26536z();
        Activity r17 = (Activity) this;
        String $r6 = r17.getString(C0001R.string.bank_transfer);
        $r5.m26505u($r6);
        $r5.m26507s(0);
        C13666w c13666w = C13666w.f30112a;
        $r4.m26557e($r5);
        SharedPreferences $r8 = getSharedPreferences();
        String $r62 = $r8.getString(LoginParams.EXTRA_CUSTOMER_TYPE, "USER");
        boolean $z0 = Log_OC.append($r62, "USER");
        if ($z0) {
            TabLayout.C4745g $r52 = $r4.m26536z();
            Activity r172 = (Activity) this;
            String $r63 = r172.getString(C0001R.string.cash_deposit);
            $r52.m26505u($r63);
            $r52.m26507s(2);
            C13666w $r7 = C13666w.f30112a;
            $r4.m26557e($r52);
        }
        final Frame $r9 = Frame.onCreateViewHolder();
        Log_OC.loadImage($r9, "getInstance()");
        Item $r10 = $r9.m20914c();
        $r10.m27799a(new InterfaceC4454e() { // from class: ai.kudi.agent.wallettopup.ClassWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* renamed from: c */
            public final void m38096c(Item item) {
                Frame $r22 = Frame.this;
                TabLayout $r32 = $r4;
                WalletTopUpActivity $r42 = this;
                WalletTopUpActivity.m41744setUpFragmentTabs$lambda3($r22, $r32, $r42, item);
            }
        });
        $r4.m26558d(new TabLayout.InterfaceC4740d() { // from class: ai.kudi.agent.wallettopup.WalletTopUpActivity$setUpFragmentTabs$4
            @Override // com.google.android.material.tabs.TabLayout.InterfaceC4739c
            public void onTabReselected(TabLayout.C4745g c4745g) {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // com.google.android.material.tabs.TabLayout.InterfaceC4739c
            public void onTabSelected(TabLayout.C4745g c4745g) {
                Integer $r22;
                if (c4745g == null) {
                    $r22 = null;
                } else {
                    int $i0 = c4745g.m26519g();
                    $r22 = Integer.valueOf($i0);
                }
                if ($r22 != null) {
                    int $i02 = $r22.intValue();
                    if ($i02 == 0) {
                        BankTransferFragment.Companion $r32 = BankTransferFragment.Companion;
                        String $r42 = str;
                        BankTransferFragment $r53 = $r32.newInstance($r42);
                        WalletTopUpActivity $r64 = this;
                        AppCompatActivity r11 = (AppCompatActivity) $r64;
                        AppCompatActivityExtKt.startFragment$default(r11, $r53, C0001R.C0003id.container, false, false, false, 8, null);
                        return;
                    }
                }
                if ($r22 != null) {
                    int $i03 = $r22.intValue();
                    if ($i03 == 2) {
                        CashDepositFragment.Companion $r72 = CashDepositFragment.Companion;
                        CashDepositFragment $r82 = $r72.newInstance();
                        WalletTopUpActivity $r65 = this;
                        AppCompatActivity r112 = (AppCompatActivity) $r65;
                        AppCompatActivityExtKt.startFragment$default(r112, $r82, C0001R.C0003id.container, false, false, false, 8, null);
                        return;
                    }
                }
                if ($r22 == null) {
                    return;
                }
                int $i04 = $r22.intValue();
                if ($i04 == 1) {
                    CardTopUpAmountFragment r10 = new CardTopUpAmountFragment();
                    WalletTopUpActivity $r66 = this;
                    AppCompatActivity r113 = (AppCompatActivity) $r66;
                    AppCompatActivityExtKt.startFragment$default(r113, r10, C0001R.C0003id.container, false, false, false, 8, null);
                }
            }

            @Override // com.google.android.material.tabs.TabLayout.InterfaceC4739c
            public void onTabUnselected(TabLayout.C4745g c4745g) {
            }
        });
        BankTransferFragment.Companion $r13 = BankTransferFragment.Companion;
        BankTransferFragment $r14 = $r13.newInstance(str);
        AppCompatActivity r18 = (AppCompatActivity) this;
        AppCompatActivityExtKt.startFragment$default(r18, $r14, C0001R.C0003id.container, false, false, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setUpFragmentTabs$lambda-3  reason: not valid java name */
    public static final void m41744setUpFragmentTabs$lambda3(Frame frame, TabLayout tabLayout, WalletTopUpActivity walletTopUpActivity, Item item) {
        Log_OC.getArray(frame, "$remoteConfig");
        Log_OC.getArray(tabLayout, "$tabLayout");
        Log_OC.getArray(walletTopUpActivity, "this$0");
        Log_OC.getArray(item, "it");
        boolean $z0 = item.m27801a();
        if ($z0) {
            boolean $z02 = frame.m20912d("allow_wallet_topup_via_card");
            if ($z02) {
                TabLayout.C4745g $r4 = tabLayout.m26536z();
                Activity r7 = (Activity) walletTopUpActivity;
                String $r5 = r7.getString(C0001R.string.card_payment);
                $r4.m26505u($r5);
                $r4.m26507s(1);
                C13666w c13666w = C13666w.f30112a;
                tabLayout.m26557e($r4);
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void addNewCard(String str) {
        Log_OC.getArray(str, TransactionField.AMOUNT);
        P presenter = getPresenter();
        Log_OC.loadImage(presenter, "getPresenter()");
        WalletTopupPresenter $r3 = (WalletTopupPresenter) presenter;
        WalletTopupPresenter.performTopup$default($r3, str, null, null, this, 6, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9409a, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public WalletTopupPresenter createPresenter() {
        WalletTopupPresenter $r1 = getWalletTopupPresenter();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9409a, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public /* bridge */ /* synthetic */ InterfaceC9413d createPresenter() {
        InterfaceC9413d $r1 = createPresenter();
        InterfaceC9413d r2 = $r1;
        return r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity
    public ActivityWalletTopUpBinding getActivityBinding() {
        Activity r3 = (Activity) this;
        LayoutInflater $r1 = r3.getLayoutInflater();
        ActivityWalletTopUpBinding $r2 = ActivityWalletTopUpBinding.inflate($r1);
        Log_OC.loadImage($r2, "inflate(layoutInflater)");
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity
    public /* bridge */ /* synthetic */ InterfaceC8209a getActivityBinding() {
        ActivityWalletTopUpBinding $r1 = getActivityBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final double getAmount() {
        double d0 = this.amount;
        return d0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final PaymentMethod getSelectedCard() {
        PaymentMethod r1 = this.selectedCard;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SharedPreferences getSharedPreferences() {
        SharedPreferences $r1 = this.sharedPreferences;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("sharedPreferences");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SmartLookAnalytics getSmartLookAnalytics() {
        SmartLookAnalytics $r1 = this.smartLookAnalytics;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("smartLookAnalytics");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final WalletTopupPresenter getWalletTopupPresenter() {
        WalletTopupPresenter $r1 = this.walletTopupPresenter;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("walletTopupPresenter");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final WalletTopupSubcomponent getWalletTopupSubcomponent() {
        WalletTopupSubcomponent $r1 = this.walletTopupSubcomponent;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("walletTopupSubcomponent");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.wallettopup.views.WalletTopupView
    public void hideLoading() {
        InterfaceC8209a $r1 = getBinding();
        ActivityWalletTopUpBinding $r2 = (ActivityWalletTopUpBinding) $r1;
        WalletLoaderViewBinding $r3 = $r2.loaderView;
        View $r4 = $r3.getRoot();
        Log_OC.loadImage($r4, "binding.loaderView.root");
        View r5 = $r4;
        ViewExtKt.hide$default(r5, false, 1, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.users.navigators.WebViewNavigator
    public void navigate(String str) {
        Context r4 = (Context) this;
        Intent r3 = new Intent(r4, PaymentWebViewActivity.class);
        r3.putExtra(PaymentWebViewActivity.URL_EXTRA, str);
        Activity r5 = (Activity) this;
        r5.startActivity(r3);
    }

    @Override // ai.kudi.agent.wallettopup.navigators.WalletTopupNavigator
    public void navigateToPaymentMethods(double d) {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onBackPressed() {
        ComponentActivity r1 = (ComponentActivity) this;
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity, p272h.p364d.p365a.p366c.AbstractC9409a
    public void onCreate(Bundle bundle) {
        Bundle $r1;
        Activity r13 = (Activity) this;
        Application $r2 = r13.getApplication();
        if ($r2 == null) {
            NullPointerException r12 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.BaseApplication");
            throw r12;
        }
        BaseApplication $r3 = (BaseApplication) $r2;
        ApplicationComponent $r4 = $r3.getApplicationComponent();
        WalletTopupSubcomponent.Factory $r5 = $r4.walletTopUpSubComponent();
        WalletTopupSubcomponent $r6 = $r5.create(this);
        setWalletTopupSubcomponent($r6);
        WalletTopupSubcomponent $r62 = getWalletTopupSubcomponent();
        $r62.inject(this);
        SmartLookAnalytics $r7 = getSmartLookAnalytics();
        $r7.logFundWallet();
        super.onCreate(bundle);
        AppCompatActivity r14 = (AppCompatActivity) this;
        AbstractC0925a $r8 = r14.getSupportActionBar();
        if ($r8 != null) {
            $r8.mo37599x(0.0f);
        }
        AppCompatActivity r142 = (AppCompatActivity) this;
        AbstractC0925a $r82 = r142.getSupportActionBar();
        if ($r82 != null) {
            $r82.mo37602u(true);
        }
        AppCompatActivity r143 = (AppCompatActivity) this;
        AbstractC0925a $r83 = r143.getSupportActionBar();
        if ($r83 != null) {
            $r83.mo37597z(C0001R.C0002drawable.ic_arrow_backward);
        }
        setTitle("Fund Wallet");
        AppCompatActivity r144 = (AppCompatActivity) this;
        AbstractC0925a $r84 = r144.getSupportActionBar();
        if ($r84 != null) {
            $r84.mo37602u(true);
        }
        Activity r132 = (Activity) this;
        Intent $r9 = r132.getIntent();
        String $r10 = null;
        if ($r9 != null && ($r1 = $r9.getExtras()) != null) {
            $r10 = $r1.getString(EXTRA_MODE);
        }
        setUpFragmentTabs($r10);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Log_OC.getArray(menuItem, "item");
        int $i0 = menuItem.getItemId();
        if ($i0 == 16908332) {
            onBackPressed();
            return true;
        }
        boolean $z0 = super.onOptionsItemSelected(menuItem);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Log_OC.getArray(strArr, "permissions");
        Log_OC.getArray(iArr, "grantResults");
        if (i == 1001) {
            int $i0 = iArr.length;
            boolean $z0 = $i0 == 0;
            if (!$z0) {
                int $i02 = iArr[0];
                if ($i02 == 0) {
                    return;
                }
            }
            Context r3 = (Context) this;
            ContextExtKt.toast$default(r3, "Call Permission is required for Kudi to dial the code.", 0, 2, (Object) null);
        }
    }

    public final void setAmount(double d) {
        this.amount = d;
    }

    public final void setSelectedCard(PaymentMethod paymentMethod) {
        this.selectedCard = paymentMethod;
    }

    public final void setSharedPreferences(SharedPreferences sharedPreferences) {
        Log_OC.getArray(sharedPreferences, "<set-?>");
        this.sharedPreferences = sharedPreferences;
    }

    public final void setSmartLookAnalytics(SmartLookAnalytics smartLookAnalytics) {
        Log_OC.getArray(smartLookAnalytics, "<set-?>");
        this.smartLookAnalytics = smartLookAnalytics;
    }

    public final void setWalletTopupPresenter(WalletTopupPresenter walletTopupPresenter) {
        Log_OC.getArray(walletTopupPresenter, "<set-?>");
        this.walletTopupPresenter = walletTopupPresenter;
    }

    public final void setWalletTopupSubcomponent(WalletTopupSubcomponent walletTopupSubcomponent) {
        Log_OC.getArray(walletTopupSubcomponent, "<set-?>");
        this.walletTopupSubcomponent = walletTopupSubcomponent;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.wallettopup.views.WalletTopupView
    public void showError(WalletTopupViewData.Error error) {
        Log_OC.getArray(error, IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
        String $r1 = error.getGeneralError();
        Context r3 = (Context) this;
        ContextExtKt.toast$default(r3, $r1, 0, 2, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.wallettopup.views.WalletTopupView
    public void showLoading() {
        InterfaceC8209a $r1 = getBinding();
        ActivityWalletTopUpBinding $r2 = (ActivityWalletTopUpBinding) $r1;
        WalletLoaderViewBinding $r3 = $r2.loaderView;
        View $r4 = $r3.getRoot();
        Log_OC.loadImage($r4, "binding.loaderView.root");
        View r5 = $r4;
        ViewExtKt.show(r5);
    }
}
