package ai.kudi.agent.outlet_mgt.activities;

import ai.kudi.agent.BaseApplication;
import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.internal.components.ApplicationComponent;
import ai.kudi.agent.core.mvp.MvpActivity;
import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.databinding.ActivityOutletMgtBinding;
import ai.kudi.agent.outlet_mgt.data.ConstKt;
import ai.kudi.agent.outlet_mgt.data.Outlet;
import ai.kudi.agent.outlet_mgt.fragments.OutletTopUpAmountFragment;
import ai.kudi.agent.outlet_mgt.game.components.OutletMgtFeaturesSubcomponents;
import ai.kudi.agent.outlet_mgt.presenters.OutletTopUpPresenter;
import ai.kudi.agent.outlet_mgt.views.OutletMgtView;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.C1335a;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
/* compiled from: OutletTopUpActivity.kt */
@Metadata(m10422d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\u0014\u001a\u00020\u0003H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0012\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014R\u0014\u0010\u0006\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001a"}, m10421d2 = {"Lai/kudi/agent/outlet_mgt/activities/OutletTopUpActivity;", "Lai/kudi/agent/core/mvp/MvpActivity;", "Lai/kudi/agent/outlet_mgt/views/OutletMgtView;", "Lai/kudi/agent/outlet_mgt/presenters/OutletTopUpPresenter;", "Lai/kudi/agent/databinding/ActivityOutletMgtBinding;", "()V", "activityBinding", "getActivityBinding", "()Lai/kudi/agent/databinding/ActivityOutletMgtBinding;", "outletMgtFeaturesSubcomponent", "Lai/kudi/agent/outlet_mgt/di/components/OutletMgtFeaturesSubcomponents;", "getOutletMgtFeaturesSubcomponent", "()Lai/kudi/agent/outlet_mgt/di/components/OutletMgtFeaturesSubcomponents;", "setOutletMgtFeaturesSubcomponent", "(Lai/kudi/agent/outlet_mgt/di/components/OutletMgtFeaturesSubcomponents;)V", "screenPresenter", "getScreenPresenter", "()Lai/kudi/agent/outlet_mgt/presenters/OutletTopUpPresenter;", "setScreenPresenter", "(Lai/kudi/agent/outlet_mgt/presenters/OutletTopUpPresenter;)V", "createPresenter", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class OutletTopUpActivity extends MvpActivity<OutletMgtView, OutletTopUpPresenter, ActivityOutletMgtBinding> {
    public OutletMgtFeaturesSubcomponents outletMgtFeaturesSubcomponent;
    public OutletTopUpPresenter screenPresenter;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreate$lambda-0  reason: not valid java name */
    public static final void m39860onCreate$lambda0(OutletTopUpActivity outletTopUpActivity, View view) {
        Log_OC.getArray(outletTopUpActivity, "this$0");
        outletTopUpActivity.onBackPressed();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9409a, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public OutletTopUpPresenter createPresenter() {
        OutletTopUpPresenter $r1 = getScreenPresenter();
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
    public final OutletMgtFeaturesSubcomponents getOutletMgtFeaturesSubcomponent() {
        OutletMgtFeaturesSubcomponents $r1 = this.outletMgtFeaturesSubcomponent;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("outletMgtFeaturesSubcomponent");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final OutletTopUpPresenter getScreenPresenter() {
        OutletTopUpPresenter $r1 = this.screenPresenter;
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
    public void onBackPressed() {
        FragmentActivity r2 = (FragmentActivity) this;
        FragmentManager $r1 = r2.getSupportFragmentManager();
        int $i0 = $r1.m35920m0();
        if ($i0 <= 1) {
            Activity r3 = (Activity) this;
            r3.finish();
            return;
        }
        ComponentActivity r4 = (ComponentActivity) this;
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity, p272h.p364d.p365a.p366c.AbstractC9409a
    public void onCreate(Bundle bundle) {
        Activity r21 = (Activity) this;
        Application $r2 = r21.getApplication();
        if ($r2 == null) {
            NullPointerException r20 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.BaseApplication");
            throw r20;
        }
        BaseApplication $r3 = (BaseApplication) $r2;
        ApplicationComponent $r4 = $r3.getApplicationComponent();
        OutletMgtFeaturesSubcomponents.Factory $r5 = $r4.outletMgtFeaturesSubComponent();
        OutletMgtFeaturesSubcomponents $r6 = $r5.create();
        setOutletMgtFeaturesSubcomponent($r6);
        OutletMgtFeaturesSubcomponents $r62 = getOutletMgtFeaturesSubcomponent();
        $r62.inject(this);
        super.onCreate(bundle);
        InterfaceC8209a $r7 = getBinding();
        Toolbar $r9 = ((ActivityOutletMgtBinding) $r7).toolbar;
        $r9.setNavigationIcon(C0001R.C0002drawable.ic_arrow_backward);
        InterfaceC8209a $r72 = getBinding();
        Toolbar $r92 = ((ActivityOutletMgtBinding) $r72).toolbar;
        $r92.setNavigationOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.outlet_mgt.activities.ErrorActivity$3
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OutletTopUpActivity $r22 = OutletTopUpActivity.this;
                OutletTopUpActivity.m39860onCreate$lambda0($r22, view);
            }
        });
        InterfaceC8209a $r73 = getBinding();
        ActivityOutletMgtBinding $r8 = (ActivityOutletMgtBinding) $r73;
        Toolbar $r93 = $r8.toolbar;
        Context r22 = (Context) this;
        int $i0 = C1335a.m36324d(r22, C0001R.color.white);
        $r93.setTitleTextColor($i0);
        InterfaceC8209a $r74 = getBinding();
        ActivityOutletMgtBinding $r82 = (ActivityOutletMgtBinding) $r74;
        Toolbar $r94 = $r82.toolbar;
        Drawable $r11 = $r94.getOverflowIcon();
        if ($r11 != null) {
            PorterDuff.Mode $r12 = PorterDuff.Mode.SRC_ATOP;
            $r11.setColorFilter(-1, $r12);
        }
        InterfaceC8209a $r75 = getBinding();
        ActivityOutletMgtBinding $r83 = (ActivityOutletMgtBinding) $r75;
        Toolbar $r95 = $r83.toolbar;
        $r95.setTitle("Fund Transfer");
        OutletTopUpAmountFragment.Companion $r13 = OutletTopUpAmountFragment.Companion;
        Activity r212 = (Activity) this;
        Intent $r14 = r212.getIntent();
        Parcelable $r15 = $r14.getParcelableExtra(ConstKt.OUTLET_DATA);
        if ($r15 == null) {
            NullPointerException r202 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.outlet_mgt.data.Outlet");
            throw r202;
        }
        Outlet $r16 = (Outlet) $r15;
        OutletTopUpAmountFragment $r17 = $r13.newInstance($r16);
        AppCompatActivity r23 = (AppCompatActivity) this;
        AppCompatActivityExtKt.startFragment$default(r23, $r17, C0001R.C0003id.contentFrameLayout, true, false, false, 16, null);
    }

    public final void setOutletMgtFeaturesSubcomponent(OutletMgtFeaturesSubcomponents outletMgtFeaturesSubcomponents) {
        Log_OC.getArray(outletMgtFeaturesSubcomponents, "<set-?>");
        this.outletMgtFeaturesSubcomponent = outletMgtFeaturesSubcomponents;
    }

    public final void setScreenPresenter(OutletTopUpPresenter outletTopUpPresenter) {
        Log_OC.getArray(outletTopUpPresenter, "<set-?>");
        this.screenPresenter = outletTopUpPresenter;
    }
}
