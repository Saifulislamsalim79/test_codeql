package ai.kudi.agent.pos.p016ui;

import ai.kudi.agent.BaseApplication;
import ai.kudi.agent.C0001R;
import ai.kudi.agent.analytics.SmartLookAnalytics;
import ai.kudi.agent.common_screens.success_screen.fragment.SuccessScreenDialogFragment;
import ai.kudi.agent.common_screens.success_screen.labs.SuccessScreenCustomOption;
import ai.kudi.agent.core.internal.components.ApplicationComponent;
import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.databinding.ActivityPosBinding;
import ai.kudi.agent.databinding.WalletLoaderViewBinding;
import ai.kudi.agent.pin.KudiPin;
import ai.kudi.agent.pos.data.PosPurchaseInfo;
import ai.kudi.agent.pos.data.PosRequestTypesKt;
import ai.kudi.agent.pos.game.components.PosSubComponent;
import ai.kudi.agent.pos.navigators.TerminalRequestNavigator;
import ai.kudi.agent.pos.p016ui.LeasePosTermsOfAgreementFragment;
import ai.kudi.agent.pos.p016ui.OrderDetailsFragment;
import ai.kudi.agent.pos.p016ui.PosDeliveryAddressFragment;
import ai.kudi.agent.pos.p016ui.PosEligibilityFragment;
import ai.kudi.agent.pos.p016ui.PosOrderDetailFragment;
import ai.kudi.agent.pos.p016ui.PosOrderHistoryFragment;
import ai.kudi.agent.pos.p016ui.SelectPosFragment;
import ai.kudi.agent.pos.p016ui.model.PosFilterType;
import ai.kudi.agent.settings.account.p025ui.fragment.ActivatePosFragment;
import ai.kudi.agent.wallettopup.WalletTopUpActivity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.app.AbstractC0925a;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: PosActivity.kt */
@Metadata(m10422d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 72\u00020\u00012\u00020\u0002:\u00017B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0006\u0010\u001a\u001a\u00020\u0017J\b\u0010\u001b\u001a\u00020\u0017H\u0016J\b\u0010\u001c\u001a\u00020\u0017H\u0016J\u0010\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0017H\u0016J\u0018\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u001fH\u0016J\u0010\u0010&\u001a\u00020\u00172\u0006\u0010'\u001a\u00020(H\u0016J\u0016\u0010)\u001a\u00020\u00172\f\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+H\u0016J\b\u0010-\u001a\u00020\u0017H\u0016J\u0012\u0010.\u001a\u00020\u00172\b\u0010/\u001a\u0004\u0018\u000100H\u0014J\b\u00101\u001a\u00020\u0017H\u0002J\u000e\u00102\u001a\u00020\u00172\u0006\u00103\u001a\u00020\u001fJ\u0006\u00104\u001a\u00020\u0017J\u0016\u00105\u001a\u00020\u00172\f\u00106\u001a\b\u0012\u0004\u0012\u00020,0+H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u00068"}, m10421d2 = {"Lai/kudi/agent/pos/ui/PosActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lai/kudi/agent/pos/navigators/TerminalRequestNavigator;", "()V", "binding", "Lai/kudi/agent/databinding/ActivityPosBinding;", "getBinding", "()Lai/kudi/agent/databinding/ActivityPosBinding;", "setBinding", "(Lai/kudi/agent/databinding/ActivityPosBinding;)V", "pos2SubComponent", "Lai/kudi/agent/pos/di/components/PosSubComponent;", "getPos2SubComponent", "()Lai/kudi/agent/pos/di/components/PosSubComponent;", "setPos2SubComponent", "(Lai/kudi/agent/pos/di/components/PosSubComponent;)V", "smartLookAnalytics", "Lai/kudi/agent/analytics/SmartLookAnalytics;", "getSmartLookAnalytics", "()Lai/kudi/agent/analytics/SmartLookAnalytics;", "setSmartLookAnalytics", "(Lai/kudi/agent/analytics/SmartLookAnalytics;)V", "goToPosDeliveryAddressFragment", "", "posPurchaseInfo", "Lai/kudi/agent/pos/data/PosPurchaseInfo;", "hideLoader", "navigateToActivatePos", "navigateToChangeAddress", "navigateToCongrats", "type", "", "navigateToFundWalletView", "navigateToMakePayment", "pop", "", "navigateToOrderDetailsFragment", "orderId", "navigateToPosOrderHistoryFragment", "posFilterType", "Lai/kudi/agent/pos/ui/model/PosFilterType;", "navigateToPosSelection", "posTypeDataList", "", "Lai/kudi/agent/pos/data/PosTypeData;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setInitialFragment", "setTitle", KudiPin.KUDI_PIN_TITLE, "showLoader", "toTermsAndConditions", "leasePosData", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.pos.ui.PosActivity */
/* loaded from: classes.dex */
public final class PosActivity extends AppCompatActivity implements TerminalRequestNavigator {
    public static final Companion Companion;
    public static final String IS_POS_NEW_FEATURE = "POS_NEW_FEATURE";
    public ActivityPosBinding binding;
    public PosSubComponent pos2SubComponent;
    public SmartLookAnalytics smartLookAnalytics;

    /* compiled from: PosActivity.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/agent/pos/ui/PosActivity$Companion;", "", "()V", "IS_POS_NEW_FEATURE", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.pos.ui.PosActivity$Companion */
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

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreate$lambda-0  reason: not valid java name */
    public static final void m40052onCreate$lambda0(PosActivity posActivity, View view) {
        Log_OC.getArray(posActivity, "this$0");
        posActivity.onBackPressed();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setInitialFragment() {
        PosEligibilityFragment.Companion $r1 = PosEligibilityFragment.Companion;
        PosEligibilityFragment $r2 = PosEligibilityFragment.Companion.newInstance$default($r1, null, 1, null);
        AppCompatActivityExtKt.startFragment$default(this, $r2, C0001R.C0003id.posContainer, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ActivityPosBinding getBinding() {
        ActivityPosBinding $r1 = this.binding;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("binding");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final PosSubComponent getPos2SubComponent() {
        PosSubComponent $r1 = this.pos2SubComponent;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("pos2SubComponent");
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
    @Override // ai.kudi.agent.pos.navigators.TerminalRequestNavigator
    public void goToPosDeliveryAddressFragment(PosPurchaseInfo posPurchaseInfo) {
        Log_OC.getArray(posPurchaseInfo, "posPurchaseInfo");
        PosDeliveryAddressFragment.Companion $r3 = PosDeliveryAddressFragment.Companion;
        PosDeliveryAddressFragment $r2 = $r3.newInstance(posPurchaseInfo);
        AppCompatActivityExtKt.startFragment$default(this, $r2, C0001R.C0003id.posContainer, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void hideLoader() {
        ActivityPosBinding $r1 = getBinding();
        WalletLoaderViewBinding $r2 = $r1.loaderView;
        View $r3 = $r2.getRoot();
        Log_OC.loadImage($r3, "binding.loaderView.root");
        View r4 = $r3;
        ViewExtKt.hide$default(r4, false, 1, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.pos.navigators.TerminalRequestNavigator
    public void navigateToActivatePos() {
        ActivatePosFragment $r1 = new ActivatePosFragment();
        AppCompatActivityExtKt.startFragment$default(this, $r1, C0001R.C0003id.posContainer, false, false, false, 28, null);
    }

    @Override // ai.kudi.agent.pos.navigators.TerminalRequestNavigator
    public void navigateToChangeAddress() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.pos.navigators.TerminalRequestNavigator
    public void navigateToCongrats(String str) {
        Log_OC.getArray(str, "type");
        SuccessScreenDialogFragment.Companion $r2 = SuccessScreenDialogFragment.Companion;
        String $r4 = getString(C0001R.string.congratulations);
        Log_OC.loadImage($r4, "getString(R.string.congratulations)");
        boolean $z0 = Log_OC.append(str, PosRequestTypesKt.POS_REQUEST_TYPE_LEASE);
        int $i0 = $z0 ? C0001R.string.order_placed : C0001R.string.order_for_pos_placed_success_message;
        String $r1 = getString($i0);
        Log_OC.loadImage($r1, "if (type == POS_REQUEST_TYPE_LEASE) getString(R.string.order_placed) else getString(R.string.order_for_pos_placed_success_message)");
        String $r5 = getString(C0001R.string.close);
        Log_OC.loadImage($r5, "getString(R.string.close)");
        SuccessScreenCustomOption $r3 = new SuccessScreenCustomOption($r4, $r1, $r5, false, false, false, 0, 0, 0, 0, C0001R.C0002drawable.ic_pos_machine, 0, false, 7160, null);
        PosActivity$navigateToCongrats$1 $r6 = new PosActivity$navigateToCongrats$1(this);
        SuccessScreenDialogFragment $r7 = $r2.newInstance($r3, $r6);
        FragmentManager $r8 = getSupportFragmentManager();
        $r7.show($r8, SuccessScreenDialogFragment.PAGE_KEY);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.pos.navigators.TerminalRequestNavigator
    public void navigateToFundWalletView() {
        PosActivity$navigateToFundWalletView$1 $r1 = PosActivity$navigateToFundWalletView$1.INSTANCE;
        ContextExtKt.launchActivity$default((Context) this, false, WalletTopUpActivity.class, (InterfaceC11767l) $r1, 1, (Object) null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.pos.navigators.TerminalRequestNavigator
    public void navigateToMakePayment(boolean z, PosPurchaseInfo posPurchaseInfo) {
        Log_OC.getArray(posPurchaseInfo, "posPurchaseInfo");
        if (z) {
            AppCompatActivityExtKt.pop$default(this, null, 1, null);
        }
        OrderDetailsFragment.Companion $r3 = OrderDetailsFragment.Companion;
        OrderDetailsFragment $r2 = $r3.newInstance(posPurchaseInfo);
        AppCompatActivityExtKt.startFragment$default(this, $r2, C0001R.C0003id.posContainer, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.pos.navigators.TerminalRequestNavigator
    public void navigateToOrderDetailsFragment(String str) {
        Log_OC.getArray(str, "orderId");
        PosOrderDetailFragment.Companion $r3 = PosOrderDetailFragment.Companion;
        PosOrderDetailFragment $r2 = $r3.newInstance(str);
        AppCompatActivityExtKt.startFragment$default(this, $r2, C0001R.C0003id.posContainer, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.pos.navigators.TerminalRequestNavigator
    public void navigateToPosOrderHistoryFragment(PosFilterType posFilterType) {
        Log_OC.getArray(posFilterType, "posFilterType");
        PosOrderHistoryFragment.Companion $r3 = PosOrderHistoryFragment.Companion;
        PosOrderHistoryFragment $r2 = $r3.newInstance(posFilterType);
        AppCompatActivityExtKt.startFragment$default(this, $r2, C0001R.C0003id.posContainer, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.pos.navigators.TerminalRequestNavigator
    public void navigateToPosSelection(List list) {
        Log_OC.getArray(list, "posTypeDataList");
        SelectPosFragment.Companion $r3 = SelectPosFragment.Companion;
        SelectPosFragment $r2 = $r3.newInstance(list);
        AppCompatActivityExtKt.startFragment$default(this, $r2, C0001R.C0003id.posContainer, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        FragmentManager $r1 = getSupportFragmentManager();
        int $i0 = $r1.m35920m0();
        if ($i0 <= 1) {
            finish();
        } else {
            super.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.BaseListFragment, android.app.Activity
    public void onCreate(Bundle bundle) {
        Application $r2 = getApplication();
        if ($r2 == null) {
            NullPointerException r16 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.BaseApplication");
            throw r16;
        }
        BaseApplication $r3 = (BaseApplication) $r2;
        ApplicationComponent $r4 = $r3.getApplicationComponent();
        PosSubComponent.Factory $r5 = $r4.pos2SubComponent();
        PosSubComponent $r6 = $r5.create(this);
        setPos2SubComponent($r6);
        PosSubComponent $r62 = getPos2SubComponent();
        $r62.inject(this);
        super.onCreate(bundle);
        LayoutInflater $r7 = getLayoutInflater();
        ActivityPosBinding $r8 = ActivityPosBinding.inflate($r7);
        Log_OC.loadImage($r8, "inflate(layoutInflater)");
        setBinding($r8);
        View $r9 = getBinding().getRoot();
        View r17 = $r9;
        setContentView(r17);
        Toolbar $r10 = getBinding().toolbar;
        setSupportActionBar($r10);
        AbstractC0925a $r11 = getSupportActionBar();
        if ($r11 != null) {
            $r11.mo37602u(true);
        }
        if (bundle == null) {
            setInitialFragment();
        }
        Toolbar $r102 = getBinding().toolbar;
        $r102.setNavigationOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.pos.ui.g
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PosActivity $r22 = PosActivity.this;
                PosActivity.m40052onCreate$lambda0($r22, view);
            }
        });
        SmartLookAnalytics $r13 = getSmartLookAnalytics();
        $r13.logPosTerminal();
    }

    public final void setBinding(ActivityPosBinding activityPosBinding) {
        Log_OC.getArray(activityPosBinding, "<set-?>");
        this.binding = activityPosBinding;
    }

    public final void setPos2SubComponent(PosSubComponent posSubComponent) {
        Log_OC.getArray(posSubComponent, "<set-?>");
        this.pos2SubComponent = posSubComponent;
    }

    public final void setSmartLookAnalytics(SmartLookAnalytics smartLookAnalytics) {
        Log_OC.getArray(smartLookAnalytics, "<set-?>");
        this.smartLookAnalytics = smartLookAnalytics;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setTitle(String str) {
        Log_OC.getArray(str, KudiPin.KUDI_PIN_TITLE);
        ActivityPosBinding $r2 = getBinding();
        Toolbar $r3 = $r2.toolbar;
        $r3.setTitle(str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void showLoader() {
        ActivityPosBinding $r1 = getBinding();
        WalletLoaderViewBinding $r2 = $r1.loaderView;
        View $r3 = $r2.getRoot();
        Log_OC.loadImage($r3, "binding.loaderView.root");
        View r4 = $r3;
        ViewExtKt.show(r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.pos.navigators.TerminalRequestNavigator
    public void toTermsAndConditions(List list) {
        Log_OC.getArray(list, "leasePosData");
        LeasePosTermsOfAgreementFragment.Companion $r3 = LeasePosTermsOfAgreementFragment.Companion;
        LeasePosTermsOfAgreementFragment $r2 = $r3.newInstance(list);
        AppCompatActivityExtKt.startFragment$default(this, $r2, C0001R.C0003id.posContainer, false, false, false, 28, null);
    }
}
