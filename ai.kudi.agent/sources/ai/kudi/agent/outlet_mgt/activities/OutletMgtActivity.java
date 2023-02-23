package ai.kudi.agent.outlet_mgt.activities;

import ai.kudi.agent.BaseApplication;
import ai.kudi.agent.C0001R;
import ai.kudi.agent.common_screens.success_screen.fragment.SuccessScreenDialogFragment;
import ai.kudi.agent.common_screens.success_screen.labs.SuccessScreenCustomOption;
import ai.kudi.agent.core.internal.components.ApplicationComponent;
import ai.kudi.agent.core.mvp.MvpActivity;
import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.databinding.ActivityOutletMgtBinding;
import ai.kudi.agent.databinding.ViewLoaderBinding;
import ai.kudi.agent.outlet_mgt.data.CreateOutletRequest;
import ai.kudi.agent.outlet_mgt.fragments.OutletMgtCreatePinFragment;
import ai.kudi.agent.outlet_mgt.fragments.OutletsListingFragment;
import ai.kudi.agent.outlet_mgt.game.components.OutletMgtSubComponent;
import ai.kudi.agent.outlet_mgt.navigator.OutletMgtNavigator;
import ai.kudi.agent.outlet_mgt.presenters.OutletMgtPresenter;
import ai.kudi.agent.outlet_mgt.views.OutletMgtView;
import ai.kudi.agent.register.data.models.OtpCallBacks;
import ai.kudi.agent.register.data.models.OtpData;
import ai.kudi.agent.register.data.models.OtpFragmentData;
import ai.kudi.agent.register.p022v2.p023ui.OtpFragment;
import ai.kudi.agent.transactionhistory.data.model.TransactionItemUiModel;
import ai.kudi.agent.transactionhistory.data.model.TransactionItemUiModelKt;
import ai.kudi.agent.transactionhistory.navigator.DefaultTransactionsNavigator;
import ai.kudi.agent.transactionhistory.navigator.IncompleteTransactionsNavigator;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.C1335a;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.views.holder.AttributeType;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
import p272h.p364d.p365a.p366c.AbstractC9409a;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: OutletMgtActivity.kt */
@Metadata(m10422d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00022\u00020\u00052\u00020\u0006B\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\u0019\u001a\u00020\u0003H\u0016J\u0010\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0006\u0010\u001d\u001a\u00020\rJ\b\u0010\u001e\u001a\u00020\rH\u0016J\u0012\u0010\u001f\u001a\u00020\r2\b\u0010 \u001a\u0004\u0018\u00010!H\u0014J\u0010\u0010\"\u001a\u00020\r2\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0002J\u0016\u0010)\u001a\u00020\r2\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fJ\u000e\u0010+\u001a\u00020\r2\u0006\u0010,\u001a\u00020\u001cJ\u0010\u0010-\u001a\u00020\r2\u0006\u0010.\u001a\u00020\u001cH\u0016J\u0006\u0010/\u001a\u00020\rJ\u0012\u00100\u001a\u00020\r2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\u0018\u00101\u001a\u00020\r2\u0006\u00102\u001a\u0002032\u0006\u0010'\u001a\u00020(H\u0016J\u0018\u00104\u001a\u00020\r2\u0006\u00105\u001a\u00020\u001c2\u0006\u00106\u001a\u00020\u001cH\u0016J\u0010\u00107\u001a\u00020\r2\u0006\u00108\u001a\u000209H\u0016J\u0010\u0010:\u001a\u00020\r2\b\b\u0002\u0010;\u001a\u000209R\u0014\u0010\b\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006<"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/activities/OutletMgtActivity;", "Lai/kudi/agent/core/mvp/MvpActivity;", "Lai/kudi/agent/outlet_mgt/views/OutletMgtView;", "Lai/kudi/agent/outlet_mgt/presenters/OutletMgtPresenter;", "Lai/kudi/agent/databinding/ActivityOutletMgtBinding;", "Lai/kudi/agent/outlet_mgt/navigator/OutletMgtNavigator;", "Lai/kudi/agent/transactionhistory/navigator/IncompleteTransactionsNavigator;", "()V", "activityBinding", "getActivityBinding", "()Lai/kudi/agent/databinding/ActivityOutletMgtBinding;", "navAction", "Lkotlin/Function0;", "", "outletMgtSubComponent", "Lai/kudi/agent/outlet_mgt/di/components/OutletMgtSubComponent;", "getOutletMgtSubComponent", "()Lai/kudi/agent/outlet_mgt/di/components/OutletMgtSubComponent;", "setOutletMgtSubComponent", "(Lai/kudi/agent/outlet_mgt/di/components/OutletMgtSubComponent;)V", "screenPresenter", "getScreenPresenter", "()Lai/kudi/agent/outlet_mgt/presenters/OutletMgtPresenter;", "setScreenPresenter", "(Lai/kudi/agent/outlet_mgt/presenters/OutletMgtPresenter;)V", "createPresenter", "handleError", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "", "hideLoader", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onIncompleteTransactionDetails", "transaction", "Lai/kudi/agent/transactionhistory/data/model/TransactionItemUiModel$Transaction;", "otpCallBacks", "Lai/kudi/agent/register/data/models/OtpCallBacks;", "createOutletRequest", "Lai/kudi/agent/outlet_mgt/data/CreateOutletRequest;", "setNavigationAction", "action", "setTitle", AttributeType.TEXT, "showFeedBack", MetricTracker.Object.MESSAGE, "showLoader", "toCreatePinView", "toEnterOtpView", "otpFragmentData", "Lai/kudi/agent/register/data/models/OtpFragmentData;", "toOutletRegistrationSuccessful", "firstName", "phoneNumber", "toggleOtpLoading", "isLoading", "", "toggleToolbar", "show", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class OutletMgtActivity extends MvpActivity<OutletMgtView, OutletMgtPresenter, ActivityOutletMgtBinding> implements OutletMgtView, OutletMgtNavigator, IncompleteTransactionsNavigator {
    private InterfaceC11756a<C13666w> navAction;
    public OutletMgtSubComponent outletMgtSubComponent;
    public OutletMgtPresenter screenPresenter;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final OtpCallBacks otpCallBacks(final CreateOutletRequest createOutletRequest) {
        return new OtpCallBacks() { // from class: ai.kudi.agent.outlet_mgt.activities.OutletMgtActivity$otpCallBacks$1
            @Override // ai.kudi.agent.register.data.models.OtpCallBacks
            public void onBottomViewActionClicked() {
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.register.data.models.OtpCallBacks
            public void onOtpEntered(OtpData otpData) {
                if (otpData == null) {
                    return;
                }
                CreateOutletRequest $r1 = CreateOutletRequest.this;
                OutletMgtActivity $r2 = this;
                String $r4 = otpData.getOtp();
                $r1.setPhoneOtp($r4);
                InterfaceC9413d $r5 = ((AbstractC9409a) $r2).presenter;
                OutletMgtPresenter $r6 = (OutletMgtPresenter) $r5;
                $r6.verifyOtpCreateOutlet($r1);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.register.data.models.OtpCallBacks
            public void onResendOtpClicked(OtpData otpData) {
                if (otpData == null) {
                    return;
                }
                OutletMgtActivity $r3 = this;
                CreateOutletRequest $r1 = CreateOutletRequest.this;
                InterfaceC9413d $r4 = ((AbstractC9409a) $r3).presenter;
                OutletMgtPresenter $r5 = (OutletMgtPresenter) $r4;
                String $r6 = otpData.getPhoneNumber();
                $r5.sendOtpForCreateOutlet($r6, $r1);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setNavigationAction$lambda-0  reason: not valid java name */
    public static final void m39859setNavigationAction$lambda0(InterfaceC11756a interfaceC11756a, OutletMgtActivity outletMgtActivity, View view) {
        Log_OC.getArray(outletMgtActivity, "this$0");
        if (interfaceC11756a == null) {
            outletMgtActivity.onBackPressed();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void toggleToolbar$default(OutletMgtActivity outletMgtActivity, boolean $z0, int i, Object obj) {
        int $i0 = i & 1;
        if ($i0 != 0) {
            $z0 = true;
        }
        outletMgtActivity.toggleToolbar($z0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9409a, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public OutletMgtPresenter createPresenter() {
        OutletMgtPresenter $r1 = getScreenPresenter();
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
    public ActivityOutletMgtBinding getActivityBinding() {
        Activity r3 = (Activity) this;
        LayoutInflater $r1 = r3.getLayoutInflater();
        ActivityOutletMgtBinding $r2 = ActivityOutletMgtBinding.inflate($r1);
        Log_OC.loadImage($r2, "inflate(layoutInflater)");
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity
    public /* bridge */ /* synthetic */ InterfaceC8209a getActivityBinding() {
        ActivityOutletMgtBinding $r1 = getActivityBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final OutletMgtSubComponent getOutletMgtSubComponent() {
        OutletMgtSubComponent $r1 = this.outletMgtSubComponent;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("outletMgtSubComponent");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final OutletMgtPresenter getScreenPresenter() {
        OutletMgtPresenter $r1 = this.screenPresenter;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("screenPresenter");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.outlet_mgt.views.OutletMgtView
    public void handleError(String str) {
        Log_OC.getArray(str, IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
        Context r2 = (Context) this;
        ContextExtKt.toast$default(r2, str, 0, 2, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void hideLoader() {
        InterfaceC8209a $r1 = getBinding();
        ActivityOutletMgtBinding $r2 = (ActivityOutletMgtBinding) $r1;
        ViewLoaderBinding $r3 = $r2.outletMgtLoaderView;
        View $r4 = $r3.getRoot();
        Log_OC.loadImage($r4, "binding.outletMgtLoaderView.root");
        View r5 = $r4;
        ViewExtKt.hide$default(r5, false, 1, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onBackPressed() {
        C13666w $r3;
        FragmentActivity r4 = (FragmentActivity) this;
        FragmentManager $r1 = r4.getSupportFragmentManager();
        int $i0 = $r1.m35920m0();
        if ($i0 <= 1) {
            Activity r5 = (Activity) this;
            r5.finish();
            return;
        }
        InterfaceC11756a $r2 = this.navAction;
        if ($r2 == null) {
            $r3 = null;
        } else {
            $r2.invoke();
            $r3 = C13666w.f30112a;
        }
        if ($r3 == null) {
            ComponentActivity r6 = (ComponentActivity) this;
            super/*androidx.activity.ComponentActivity*/.onBackPressed();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity, p272h.p364d.p365a.p366c.AbstractC9409a
    protected void onCreate(Bundle bundle) {
        Activity r18 = (Activity) this;
        Application $r3 = r18.getApplication();
        if ($r3 == null) {
            NullPointerException r17 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.BaseApplication");
            throw r17;
        }
        BaseApplication $r4 = (BaseApplication) $r3;
        ApplicationComponent $r5 = $r4.getApplicationComponent();
        OutletMgtSubComponent.Factory $r6 = $r5.outletMgtSubComponent();
        Activity r182 = (Activity) this;
        DefaultTransactionsNavigator r15 = new DefaultTransactionsNavigator(r182);
        OutletMgtSubComponent $r8 = $r6.create(this, r15, this);
        setOutletMgtSubComponent($r8);
        OutletMgtSubComponent $r82 = getOutletMgtSubComponent();
        $r82.inject(this);
        super.onCreate(bundle);
        InterfaceC8209a $r9 = getBinding();
        Toolbar $r11 = ((ActivityOutletMgtBinding) $r9).toolbar;
        AppCompatActivity r19 = (AppCompatActivity) this;
        r19.setSupportActionBar($r11);
        InterfaceC8209a $r92 = getBinding();
        ActivityOutletMgtBinding $r10 = (ActivityOutletMgtBinding) $r92;
        Toolbar $r112 = $r10.toolbar;
        $r112.setNavigationIcon(C0001R.C0002drawable.ic_arrow_backward);
        setNavigationAction(null);
        InterfaceC8209a $r93 = getBinding();
        ActivityOutletMgtBinding $r102 = (ActivityOutletMgtBinding) $r93;
        Toolbar $r113 = $r102.toolbar;
        Context r20 = (Context) this;
        int $i0 = C1335a.m36324d(r20, C0001R.color.white);
        $r113.setTitleTextColor($i0);
        InterfaceC8209a $r94 = getBinding();
        ActivityOutletMgtBinding $r103 = (ActivityOutletMgtBinding) $r94;
        Toolbar $r114 = $r103.toolbar;
        Drawable $r12 = $r114.getOverflowIcon();
        if ($r12 != null) {
            PorterDuff.Mode $r13 = PorterDuff.Mode.SRC_ATOP;
            $r12.setColorFilter(-1, $r13);
        }
        OutletsListingFragment r16 = new OutletsListingFragment();
        AppCompatActivity r192 = (AppCompatActivity) this;
        AppCompatActivityExtKt.startFragment$default(r192, r16, C0001R.C0003id.contentFrameLayout, true, false, false, 16, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactionhistory.navigator.IncompleteTransactionsNavigator
    public void onIncompleteTransactionDetails(TransactionItemUiModel.Transaction transaction) {
        Log_OC.getArray(transaction, "transaction");
        Context r3 = (Context) this;
        Intent $r1 = TransactionItemUiModelKt.detailsScreenIntent(transaction, r3);
        Activity r4 = (Activity) this;
        r4.startActivity($r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setNavigationAction(final InterfaceC11756a interfaceC11756a) {
        this.navAction = interfaceC11756a;
        InterfaceC8209a $r3 = getBinding();
        ActivityOutletMgtBinding $r4 = (ActivityOutletMgtBinding) $r3;
        Toolbar $r5 = $r4.toolbar;
        $r5.setNavigationOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.outlet_mgt.activities.Item
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InterfaceC11756a $r2 = InterfaceC11756a.this;
                OutletMgtActivity $r32 = this;
                OutletMgtActivity.m39859setNavigationAction$lambda0($r2, $r32, view);
            }
        });
    }

    public final void setOutletMgtSubComponent(OutletMgtSubComponent outletMgtSubComponent) {
        Log_OC.getArray(outletMgtSubComponent, "<set-?>");
        this.outletMgtSubComponent = outletMgtSubComponent;
    }

    public final void setScreenPresenter(OutletMgtPresenter outletMgtPresenter) {
        Log_OC.getArray(outletMgtPresenter, "<set-?>");
        this.screenPresenter = outletMgtPresenter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setTitle(String str) {
        Log_OC.getArray(str, AttributeType.TEXT);
        InterfaceC8209a $r2 = getBinding();
        ActivityOutletMgtBinding $r3 = (ActivityOutletMgtBinding) $r2;
        Toolbar $r4 = $r3.toolbar;
        if ($r4 == null) {
            return;
        }
        $r4.setTitle(str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.outlet_mgt.views.OutletMgtView
    public void showFeedBack(String str) {
        Log_OC.getArray(str, MetricTracker.Object.MESSAGE);
        Context r2 = (Context) this;
        ContextExtKt.toast$default(r2, str, 0, 2, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void showLoader() {
        InterfaceC8209a $r1 = getBinding();
        ActivityOutletMgtBinding $r2 = (ActivityOutletMgtBinding) $r1;
        ViewLoaderBinding $r3 = $r2.outletMgtLoaderView;
        View $r4 = $r3.getRoot();
        Log_OC.loadImage($r4, "binding.outletMgtLoaderView.root");
        View r5 = $r4;
        ViewExtKt.show(r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.outlet_mgt.navigator.OutletMgtNavigator
    public void toCreatePinView(CreateOutletRequest createOutletRequest) {
        OutletMgtCreatePinFragment.Companion $r2 = OutletMgtCreatePinFragment.Companion;
        OutletMgtCreatePinFragment $r3 = $r2.newInstance(createOutletRequest);
        AppCompatActivity r4 = (AppCompatActivity) this;
        AppCompatActivityExtKt.startFragment$default(r4, $r3, C0001R.C0003id.contentFrameLayout, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.outlet_mgt.navigator.OutletMgtNavigator
    public void toEnterOtpView(OtpFragmentData otpFragmentData, CreateOutletRequest createOutletRequest) {
        Log_OC.getArray(otpFragmentData, "otpFragmentData");
        Log_OC.getArray(createOutletRequest, "createOutletRequest");
        OtpFragment.Companion $r3 = OtpFragment.Companion;
        OtpCallBacks $r4 = otpCallBacks(createOutletRequest);
        OtpFragment $r5 = $r3.newInstance(otpFragmentData, $r4);
        AppCompatActivity r6 = (AppCompatActivity) this;
        AppCompatActivityExtKt.startFragment$default(r6, $r5, C0001R.C0003id.contentFrameLayout, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.outlet_mgt.navigator.OutletMgtNavigator
    public void toOutletRegistrationSuccessful(String str, String str2) {
        Log_OC.getArray(str, "firstName");
        Log_OC.getArray(str2, "phoneNumber");
        SuccessScreenDialogFragment.Companion $r3 = SuccessScreenDialogFragment.Companion;
        SuccessScreenCustomOption r7 = new SuccessScreenCustomOption("Outlet Created", "", null, false, false, false, C0001R.color.colorPrimary, 0, 0, 0, C0001R.C0002drawable.ic_outlet_created, 0, false, 7100, null);
        SuccessScreenDialogFragment $r5 = $r3.newInstance(r7);
        boolean $z0 = $r5.isAdded();
        if ($z0) {
            return;
        }
        FragmentActivity r8 = (FragmentActivity) this;
        FragmentManager $r6 = r8.getSupportFragmentManager();
        $r5.show($r6, SuccessScreenDialogFragment.PAGE_KEY);
    }

    @Override // ai.kudi.agent.outlet_mgt.views.OutletMgtView
    public void toggleOtpLoading(boolean z) {
        if (z) {
            showLoader();
        } else {
            hideLoader();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void toggleToolbar(boolean z) {
        if (z) {
            InterfaceC8209a $r1 = getBinding();
            ActivityOutletMgtBinding $r2 = (ActivityOutletMgtBinding) $r1;
            View $r3 = $r2.toolbar;
            Log_OC.loadImage($r3, "binding.toolbar");
            View r4 = $r3;
            ViewExtKt.show(r4);
            return;
        }
        InterfaceC8209a $r12 = getBinding();
        ActivityOutletMgtBinding $r22 = (ActivityOutletMgtBinding) $r12;
        View $r32 = $r22.toolbar;
        Log_OC.loadImage($r32, "binding.toolbar");
        View r42 = $r32;
        ViewExtKt.hide$default(r42, false, 1, null);
    }
}
