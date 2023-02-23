package ai.kudi.agent.withdraw_cash.p040ui.activities;

import ai.kudi.agent.BaseApplication;
import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.internal.components.ApplicationComponent;
import ai.kudi.agent.core.mvp.MvpActivity;
import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.core.util.StringExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.databinding.ActivityCashWithdrawalOptionBinding;
import ai.kudi.agent.databinding.ViewLoaderBinding;
import ai.kudi.agent.voucher.cashout.p039ui.VoucherCodeInputFragment;
import ai.kudi.agent.withdraw_cash.game.components.CashWithdrawalOptionComponent;
import ai.kudi.agent.withdraw_cash.p040ui.fragments.withdrawal_option.card_withdrawal.CardWithdrawalAmountFragment;
import ai.kudi.agent.withdraw_cash.p040ui.fragments.withdrawal_option.ussd_withdrawal.UssdWithdrawalVoucherInputFragment;
import ai.kudi.agent.withdraw_cash.utils.Option;
import ai.kudi.agent.withdrawal.p041ui.OthersWithdrawalFragment;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.C1335a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import io.intercom.android.sdk.views.holder.AttributeType;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
/* compiled from: CashWithdrawalOptionActivity.kt */
@Metadata(m10422d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 ,2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001,B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\u0017\u001a\u00020\u0003H\u0016J\b\u0010\u0018\u001a\u00020\u0011H\u0016J\u0012\u0010\u0019\u001a\u00020\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\u0010\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0016\u0010\u001f\u001a\u00020\u00112\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010J\u001c\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u001e2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J\u0010\u0010$\u001a\u00020\u00112\u0006\u0010%\u001a\u00020&H\u0002J\u000e\u0010'\u001a\u00020\u00112\u0006\u0010(\u001a\u00020)J\u0010\u0010*\u001a\u00020\u00112\b\b\u0002\u0010+\u001a\u00020)R\u0014\u0010\u0006\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u00020\u00038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006-"}, m10421d2 = {"Lai/kudi/agent/withdraw_cash/ui/activities/CashWithdrawalOptionActivity;", "Lai/kudi/agent/core/mvp/MvpActivity;", "Lai/kudi/agent/withdraw_cash/ui/activities/CashWithdrawalOptionView;", "Lai/kudi/agent/withdraw_cash/ui/activities/CashWithdrawalOptionPresenter;", "Lai/kudi/agent/databinding/ActivityCashWithdrawalOptionBinding;", "()V", "activityBinding", "getActivityBinding", "()Lai/kudi/agent/databinding/ActivityCashWithdrawalOptionBinding;", "cashWithdrawalOptionComponent", "Lai/kudi/agent/withdraw_cash/di/components/CashWithdrawalOptionComponent;", "getCashWithdrawalOptionComponent", "()Lai/kudi/agent/withdraw_cash/di/components/CashWithdrawalOptionComponent;", "setCashWithdrawalOptionComponent", "(Lai/kudi/agent/withdraw_cash/di/components/CashWithdrawalOptionComponent;)V", "navigationAction", "Lkotlin/Function0;", "", "thisPresenter", "getThisPresenter", "()Lai/kudi/agent/withdraw_cash/ui/activities/CashWithdrawalOptionPresenter;", "setThisPresenter", "(Lai/kudi/agent/withdraw_cash/ui/activities/CashWithdrawalOptionPresenter;)V", "createPresenter", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "openWithdrawalOptionScreen", "optionId", "", "setNavigationAction", "action", "setNavigationIcon", "iconDrawableRes", "navAction", "setToolbarTitle", AttributeType.TEXT, "", "toggleLoader", "show", "", "toggleToolbarVisibility", "visible", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.withdraw_cash.ui.activities.CashWithdrawalOptionActivity */
/* loaded from: classes.dex */
public final class CashWithdrawalOptionActivity extends MvpActivity<CashWithdrawalOptionView, CashWithdrawalOptionPresenter, ActivityCashWithdrawalOptionBinding> {
    public static final Companion Companion;
    public static final String KEY_WITHDRAWAL_OPTION_ID = "key_withdrawal_option_id";
    public CashWithdrawalOptionComponent cashWithdrawalOptionComponent;
    private InterfaceC11756a<C13666w> navigationAction;
    public CashWithdrawalOptionPresenter thisPresenter;

    /* compiled from: CashWithdrawalOptionActivity.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/agent/withdraw_cash/ui/activities/CashWithdrawalOptionActivity$Companion;", "", "()V", "KEY_WITHDRAWAL_OPTION_ID", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.withdraw_cash.ui.activities.CashWithdrawalOptionActivity$Companion */
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

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void openWithdrawalOptionScreen(int i) {
        Option[] $r1 = Option.values();
        Option $r2 = $r1[i];
        String $r3 = $r2.getLabel();
        setToolbarTitle($r3);
        Object $r4 = r12;
        Object r12 = new Fragment();
        Option $r22 = Option.CARD_WITHDRAWAL;
        int $i1 = $r22.ordinal();
        if (i == $i1) {
            CardWithdrawalAmountFragment.Companion $r5 = CardWithdrawalAmountFragment.Companion;
            $r4 = $r5.newInstance();
        } else {
            Option $r23 = Option.USSD_WITHDRAWAL;
            int $i12 = $r23.ordinal();
            if (i == $i12) {
                CashWithdrawalOptionPresenter $r7 = getThisPresenter();
                $r7.onUssdWithdrawalOptionClicked();
                $r4 = r13;
                UssdWithdrawalVoucherInputFragment r13 = new UssdWithdrawalVoucherInputFragment();
            } else {
                Option $r24 = Option.MPOS;
                int $i13 = $r24.ordinal();
                if (i == $i13) {
                    OthersWithdrawalFragment.Companion $r8 = OthersWithdrawalFragment.Companion;
                    $r4 = $r8.newInstance();
                } else {
                    Option $r25 = Option.KUDI_VOUCHER;
                    int $i14 = $r25.ordinal();
                    if (i == $i14) {
                        VoucherCodeInputFragment.Companion $r10 = VoucherCodeInputFragment.Companion;
                        $r4 = $r10.newInstance();
                    }
                }
            }
        }
        Fragment r122 = (Fragment) $r4;
        AppCompatActivityExtKt.startFragment$default((AppCompatActivity) this, r122, C0001R.C0003id.contentFrameLayout, false, false, false, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setNavigationIcon$lambda-0  reason: not valid java name */
    public static final void m41800setNavigationIcon$lambda0(InterfaceC11756a interfaceC11756a, View view) {
        Log_OC.getArray(interfaceC11756a, "$navAction");
        interfaceC11756a.invoke();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setToolbarTitle(String str) {
        boolean $z0 = Log_OC.append(str, "KudiVoucherTM");
        if ($z0) {
            InterfaceC8209a $r2 = getBinding();
            ActivityCashWithdrawalOptionBinding $r3 = (ActivityCashWithdrawalOptionBinding) $r2;
            Toolbar $r4 = $r3.toolbar;
            SpannableStringBuilder $r5 = StringExtKt.superscript(str, "TM");
            $r4.setTitle($r5);
        } else {
            InterfaceC8209a $r22 = getBinding();
            ActivityCashWithdrawalOptionBinding $r32 = (ActivityCashWithdrawalOptionBinding) $r22;
            Toolbar $r42 = $r32.toolbar;
            $r42.setTitle(str);
        }
        InterfaceC8209a $r23 = getBinding();
        ActivityCashWithdrawalOptionBinding $r33 = (ActivityCashWithdrawalOptionBinding) $r23;
        Toolbar $r43 = $r33.toolbar;
        $r43.setNavigationOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.withdraw_cash.ui.activities.TestActivity$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CashWithdrawalOptionActivity $r24 = CashWithdrawalOptionActivity.this;
                CashWithdrawalOptionActivity.m41801setToolbarTitle$lambda1($r24, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setToolbarTitle$lambda-1  reason: not valid java name */
    public static final void m41801setToolbarTitle$lambda1(CashWithdrawalOptionActivity cashWithdrawalOptionActivity, View view) {
        Log_OC.getArray(cashWithdrawalOptionActivity, "this$0");
        cashWithdrawalOptionActivity.onBackPressed();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void toggleToolbarVisibility$default(CashWithdrawalOptionActivity cashWithdrawalOptionActivity, boolean $z0, int i, Object obj) {
        int $i0 = i & 1;
        if ($i0 != 0) {
            $z0 = true;
        }
        cashWithdrawalOptionActivity.toggleToolbarVisibility($z0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9409a, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public CashWithdrawalOptionPresenter createPresenter() {
        CashWithdrawalOptionPresenter $r1 = getThisPresenter();
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
    public ActivityCashWithdrawalOptionBinding getActivityBinding() {
        Activity r3 = (Activity) this;
        LayoutInflater $r1 = r3.getLayoutInflater();
        ActivityCashWithdrawalOptionBinding $r2 = ActivityCashWithdrawalOptionBinding.inflate($r1);
        Log_OC.loadImage($r2, "inflate(layoutInflater)");
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity
    public /* bridge */ /* synthetic */ InterfaceC8209a getActivityBinding() {
        ActivityCashWithdrawalOptionBinding $r1 = getActivityBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final CashWithdrawalOptionComponent getCashWithdrawalOptionComponent() {
        CashWithdrawalOptionComponent $r1 = this.cashWithdrawalOptionComponent;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("cashWithdrawalOptionComponent");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final CashWithdrawalOptionPresenter getThisPresenter() {
        CashWithdrawalOptionPresenter $r1 = this.thisPresenter;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("thisPresenter");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onBackPressed() {
        InterfaceC11756a $r1 = this.navigationAction;
        if ($r1 != null) {
            Log_OC.append($r1);
            $r1.invoke();
            return;
        }
        FragmentActivity r3 = (FragmentActivity) this;
        FragmentManager $r2 = r3.getSupportFragmentManager();
        int $i0 = $r2.m35920m0();
        if ($i0 <= 1) {
            Activity r4 = (Activity) this;
            r4.finish();
            return;
        }
        ComponentActivity r5 = (ComponentActivity) this;
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity, p272h.p364d.p365a.p366c.AbstractC9409a
    public void onCreate(Bundle bundle) {
        Activity r10 = (Activity) this;
        Application $r2 = r10.getApplication();
        if ($r2 == null) {
            NullPointerException r9 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.BaseApplication");
            throw r9;
        }
        BaseApplication $r3 = (BaseApplication) $r2;
        ApplicationComponent $r4 = $r3.getApplicationComponent();
        CashWithdrawalOptionComponent.Factory $r5 = $r4.cashWithdrawalOptionsSubcomponent();
        CashWithdrawalOptionComponent $r6 = $r5.create();
        setCashWithdrawalOptionComponent($r6);
        CashWithdrawalOptionComponent $r62 = getCashWithdrawalOptionComponent();
        $r62.inject(this);
        super.onCreate(bundle);
        Activity r102 = (Activity) this;
        Intent $r7 = r102.getIntent();
        int $i0 = $r7.getIntExtra(KEY_WITHDRAWAL_OPTION_ID, -1);
        if ($i0 >= 0) {
            openWithdrawalOptionScreen($i0);
            return;
        }
        Activity r103 = (Activity) this;
        r103.finish();
    }

    public final void setCashWithdrawalOptionComponent(CashWithdrawalOptionComponent cashWithdrawalOptionComponent) {
        Log_OC.getArray(cashWithdrawalOptionComponent, "<set-?>");
        this.cashWithdrawalOptionComponent = cashWithdrawalOptionComponent;
    }

    public final void setNavigationAction(InterfaceC11756a interfaceC11756a) {
        this.navigationAction = interfaceC11756a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setNavigationIcon(int i, final InterfaceC11756a interfaceC11756a) {
        Log_OC.getArray(interfaceC11756a, "navAction");
        InterfaceC8209a $r2 = getBinding();
        ActivityCashWithdrawalOptionBinding $r3 = (ActivityCashWithdrawalOptionBinding) $r2;
        Toolbar $r4 = $r3.toolbar;
        Context r8 = (Context) this;
        Drawable $r5 = C1335a.m36322f(r8, i);
        $r4.setNavigationIcon($r5);
        InterfaceC8209a $r22 = getBinding();
        ActivityCashWithdrawalOptionBinding $r32 = (ActivityCashWithdrawalOptionBinding) $r22;
        Toolbar $r42 = $r32.toolbar;
        $r42.setNavigationOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.withdraw_cash.ui.activities.b
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InterfaceC11756a $r23 = InterfaceC11756a.this;
                CashWithdrawalOptionActivity.m41800setNavigationIcon$lambda0($r23, view);
            }
        });
    }

    public final void setThisPresenter(CashWithdrawalOptionPresenter cashWithdrawalOptionPresenter) {
        Log_OC.getArray(cashWithdrawalOptionPresenter, "<set-?>");
        this.thisPresenter = cashWithdrawalOptionPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void toggleLoader(boolean z) {
        if (z) {
            InterfaceC8209a $r1 = getBinding();
            ActivityCashWithdrawalOptionBinding $r2 = (ActivityCashWithdrawalOptionBinding) $r1;
            ViewLoaderBinding $r3 = $r2.loader;
            View $r4 = $r3.getRoot();
            Log_OC.loadImage($r4, "binding.loader.root");
            View r5 = $r4;
            ViewExtKt.show(r5);
            return;
        }
        InterfaceC8209a $r12 = getBinding();
        ActivityCashWithdrawalOptionBinding $r22 = (ActivityCashWithdrawalOptionBinding) $r12;
        ViewLoaderBinding $r32 = $r22.loader;
        View $r42 = $r32.getRoot();
        Log_OC.loadImage($r42, "binding.loader.root");
        View r52 = $r42;
        ViewExtKt.hide$default(r52, false, 1, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void toggleToolbarVisibility(boolean z) {
        if (z) {
            InterfaceC8209a $r1 = getBinding();
            ActivityCashWithdrawalOptionBinding $r2 = (ActivityCashWithdrawalOptionBinding) $r1;
            View $r3 = $r2.toolbar;
            Log_OC.loadImage($r3, "binding.toolbar");
            View r4 = $r3;
            ViewExtKt.show(r4);
            return;
        }
        InterfaceC8209a $r12 = getBinding();
        ActivityCashWithdrawalOptionBinding $r22 = (ActivityCashWithdrawalOptionBinding) $r12;
        View $r32 = $r22.toolbar;
        Log_OC.loadImage($r32, "binding.toolbar");
        View r42 = $r32;
        ViewExtKt.hide$default(r42, false, 1, null);
    }
}
