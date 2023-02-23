package ai.kudi.agent.p036v2.common.view.activities;

import ai.kudi.agent.MarketplaceComponent;
import ai.kudi.agent.collections.R$anim;
import ai.kudi.agent.collections.R$color;
import ai.kudi.agent.collections.R$drawable;
import ai.kudi.agent.collections.databinding.ActivityMarketPlaceBinding;
import ai.kudi.agent.core.mvvm.BaseMVVMActivity;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.network.mods.MarketplaceNetworkModule;
import ai.kudi.agent.network.mods.MarketplaceServiceModule;
import ai.kudi.agent.p036v2.common.domain.network.client.MarketPlaceApi;
import ai.kudi.agent.p036v2.common.domain.sources.remoteSources.ProductSectorRemoteSource;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.C1335a;
import androidx.fragment.app.AbstractC1449b0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1565i;
import androidx.lifecycle.Priority;
import java.util.List;
import kotlin.C13218k;
import kotlin.C13666w;
import kotlin.InterfaceC11824h;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
import p565l.InterfaceC14233u;
import p565l.p574h0.C14207a;
import retrofit2.C14841m;
/* compiled from: BaseMarketplaceActivity.kt */
@Metadata(m10422d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00030\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\u00060\u0005B\u0005¢\u0006\u0002\u0010\u0007J\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0014\u001a\u00020\u0015J\n\u0010\u0016\u001a\u0004\u0018\u00010\tH\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0004J\b\u0010\u001d\u001a\u00020\u001cH\u0004J\b\u0010\u001e\u001a\u00020\u0012H\u0004J\b\u0010\u001f\u001a\u00020\u0012H\u0016J\u0012\u0010 \u001a\u00020\u00122\b\u0010!\u001a\u0004\u0018\u00010\"H\u0014J\u000e\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020%J\u0006\u0010&\u001a\u00020\u0012J\u0018\u0010'\u001a\u00020\u00122\u0010\b\u0002\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011J\u0010\u0010)\u001a\u00020\u00122\b\b\u0002\u0010*\u001a\u00020+J\u0010\u0010,\u001a\u00020\u00122\b\b\u0002\u0010-\u001a\u00020%J\u0010\u0010.\u001a\u00020\u00122\b\b\u0002\u0010/\u001a\u00020%J\u0010\u00100\u001a\u00020\u00122\b\b\u0003\u0010-\u001a\u00020+J\b\u00101\u001a\u00020\u0012H\u0004J\u0010\u00101\u001a\u00020\u00122\u0006\u00102\u001a\u000203H\u0004J\u001a\u00104\u001a\u00020\u00122\b\u00105\u001a\u0004\u0018\u00010\t2\b\b\u0002\u00106\u001a\u00020\u001cJ*\u00104\u001a\u00020\u00122\b\u00105\u001a\u0004\u0018\u00010\t2\u0006\u00106\u001a\u00020\u001c2\u0006\u00107\u001a\u00020\u001c2\b\b\u0002\u00108\u001a\u00020+J\u0018\u00109\u001a\u00020\u00122\b\u00105\u001a\u0004\u0018\u00010\t2\u0006\u00106\u001a\u00020\u001cJ\u0010\u0010:\u001a\u00020\u00122\b\b\u0002\u0010;\u001a\u00020\u001cJ\u0010\u0010<\u001a\u00020\u00122\b\b\u0002\u0010;\u001a\u00020\u001cR\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006="}, m10421d2 = {"Lai/kudi/agent/v2/common/view/activities/BaseMarketplaceActivity;", "VM", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "State", "Lai/kudi/agent/core/mvvm/ViewData;", "Lai/kudi/agent/core/mvvm/BaseMVVMActivity;", "Lai/kudi/agent/collections/databinding/ActivityMarketPlaceBinding;", "()V", "currentFragment", "Landroidx/fragment/app/Fragment;", "marketplaceComponent", "Lai/kudi/agent/MarketplaceComponent;", "getMarketplaceComponent", "()Lai/kudi/agent/MarketplaceComponent;", "marketplaceComponent$delegate", "Lkotlin/Lazy;", "navigationBehavior", "Lkotlin/Function0;", "", "closeFragment", "getActivityIntent", "Landroid/content/Intent;", "getCurrentFragment", "getSectorRepo", "Lai/kudi/agent/v2/common/domain/sources/remoteSources/ProductSectorRemoteSource;", "context", "Landroid/content/Context;", "isActivityResumed", "", "isActivityStarted", "navigationAction", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "popBackStackTo", "fragName", "", "removeNavigationIcon", "setNavigationBehavior", "action", "setNavigationIcon", "drawable", "", "setToolbarColor", "color", "setToolbarTitle", "titleText", "setToolbarTitleColor", "showKeyboard", "view", "Landroid/view/View;", "startFragment", "fragment", "addToBackStack", "allowStateLoss", "fragmentAnimation", "startFragmentAllowStateLoss", "toggleHelpButton", "show", "toggleToolbar", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.common.view.activities.BaseMarketplaceActivity */
/* loaded from: classes.dex */
public abstract class BaseMarketplaceActivity<VM extends BaseViewModel<State>, State extends ViewData> extends BaseMVVMActivity<VM, State, ActivityMarketPlaceBinding> {
    private Fragment currentFragment;
    private final InterfaceC11824h marketplaceComponent$delegate;
    private InterfaceC11756a<C13666w> navigationBehavior;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public BaseMarketplaceActivity() {
        InterfaceC11824h $r1;
        BaseMarketplaceActivity$marketplaceComponent$2 $r2 = new BaseMarketplaceActivity$marketplaceComponent$2(this);
        $r1 = C13218k.m5625b($r2);
        this.marketplaceComponent$delegate = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final Fragment getCurrentFragment() {
        FragmentManager $r1 = getSupportFragmentManager();
        List $r2 = $r1.m35902s0();
        Log_OC.loadImage($r2, "supportFragmentManager.fragments");
        boolean $z0 = $r2.isEmpty();
        if ($z0) {
            return null;
        }
        int $i0 = $r2.size();
        Object $r3 = $r2.get($i0 - 1);
        Fragment $r4 = (Fragment) $r3;
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final ProductSectorRemoteSource getSectorRepo(Context context) {
        MarketplaceServiceModule $r2 = new MarketplaceServiceModule();
        MarketplaceNetworkModule $r3 = new MarketplaceNetworkModule();
        InterfaceC14233u $r4 = $r2.authInterceptor();
        InterfaceC14233u $r5 = $r2.versionInterceptor();
        C14207a $r6 = $r2.loggingterceptor();
        C14841m $r7 = $r3.provideDashboardRetrofit(context, $r4, $r5, $r6);
        Object $r8 = $r7.m274d(MarketPlaceApi.class);
        MarketPlaceApi $r9 = (MarketPlaceApi) $r8;
        Log_OC.loadImage($r9, "service");
        ProductSectorRemoteSource $r10 = new ProductSectorRemoteSource($r9);
        return $r10;
    }

    /* renamed from: onCreate$lambda-0 */
    public static final void m41541onCreate$lambda0(BaseMarketplaceActivity baseMarketplaceActivity, View view) {
        Log_OC.getArray(baseMarketplaceActivity, "this$0");
        baseMarketplaceActivity.navigationAction();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void setNavigationBehavior$default(BaseMarketplaceActivity baseMarketplaceActivity, InterfaceC11756a $r2, int i, Object obj) {
        if (obj != null) {
            UnsupportedOperationException $r3 = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setNavigationBehavior");
            throw $r3;
        }
        int $i0 = i & 1;
        if ($i0 != 0) {
            $r2 = null;
        }
        baseMarketplaceActivity.setNavigationBehavior($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void setNavigationIcon$default(BaseMarketplaceActivity baseMarketplaceActivity, int $i0, int i, Object obj) {
        if (obj != null) {
            UnsupportedOperationException $r2 = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setNavigationIcon");
            throw $r2;
        }
        int $i1 = i & 1;
        if ($i1 != 0) {
            $i0 = R$drawable.ic_arrow_back;
        }
        baseMarketplaceActivity.setNavigationIcon($i0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void setToolbarColor$default(BaseMarketplaceActivity baseMarketplaceActivity, String $r2, int i, Object obj) {
        if (obj != null) {
            UnsupportedOperationException $r3 = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setToolbarColor");
            throw $r3;
        }
        int $i0 = i & 1;
        if ($i0 != 0) {
            $r2 = "#ffffff";
        }
        baseMarketplaceActivity.setToolbarColor($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void setToolbarTitle$default(BaseMarketplaceActivity baseMarketplaceActivity, String $r2, int i, Object obj) {
        if (obj != null) {
            UnsupportedOperationException $r3 = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setToolbarTitle");
            throw $r3;
        }
        int $i0 = i & 1;
        if ($i0 != 0) {
            $r2 = "Marketplace";
        }
        baseMarketplaceActivity.setToolbarTitle($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void setToolbarTitleColor$default(BaseMarketplaceActivity baseMarketplaceActivity, int $i0, int i, Object obj) {
        if (obj != null) {
            UnsupportedOperationException $r2 = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setToolbarTitleColor");
            throw $r2;
        }
        int $i1 = i & 1;
        if ($i1 != 0) {
            $i0 = R$color.textTitle;
        }
        baseMarketplaceActivity.setToolbarTitleColor($i0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void startFragment$default(BaseMarketplaceActivity baseMarketplaceActivity, Fragment fragment, boolean $z0, int i, Object obj) {
        if (obj != null) {
            UnsupportedOperationException $r3 = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startFragment");
            throw $r3;
        }
        int $i0 = i & 2;
        if ($i0 != 0) {
            $z0 = true;
        }
        baseMarketplaceActivity.startFragment(fragment, $z0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void startFragment$default(BaseMarketplaceActivity baseMarketplaceActivity, Fragment fragment, boolean z, boolean z2, int $i0, int i, Object obj) {
        if (obj != null) {
            UnsupportedOperationException $r3 = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startFragment");
            throw $r3;
        }
        int $i1 = i & 8;
        if ($i1 != 0) {
            $i0 = 0;
        }
        baseMarketplaceActivity.startFragment(fragment, z, z2, $i0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void toggleHelpButton$default(BaseMarketplaceActivity baseMarketplaceActivity, boolean $z0, int i, Object obj) {
        if (obj != null) {
            UnsupportedOperationException $r2 = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toggleHelpButton");
            throw $r2;
        }
        int $i0 = i & 1;
        if ($i0 != 0) {
            $z0 = false;
        }
        baseMarketplaceActivity.toggleHelpButton($z0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void toggleToolbar$default(BaseMarketplaceActivity baseMarketplaceActivity, boolean $z0, int i, Object obj) {
        if (obj != null) {
            UnsupportedOperationException $r2 = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toggleToolbar");
            throw $r2;
        }
        int $i0 = i & 1;
        if ($i0 != 0) {
            $z0 = false;
        }
        baseMarketplaceActivity.toggleToolbar($z0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void closeFragment() {
        FragmentManager $r1 = getSupportFragmentManager();
        Log_OC.loadImage($r1, "supportFragmentManager");
        int $i0 = $r1.m35920m0();
        if ($i0 > 0) {
            boolean $z0 = isActivityStarted();
            if ($z0) {
                ContextExtKt.hideKeyboard(this);
                boolean $z02 = $r1.m35984M0();
                if ($z02) {
                    return;
                }
                $r1.m35966V0();
                return;
            }
        }
        ContextExtKt.hideKeyboard(this);
        finish();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Intent getActivityIntent() {
        Intent $r1 = getIntent();
        Log_OC.loadImage($r1, "intent");
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final MarketplaceComponent getMarketplaceComponent() {
        InterfaceC11824h $r2 = this.marketplaceComponent$delegate;
        Object $r1 = $r2.getValue();
        MarketplaceComponent $r3 = (MarketplaceComponent) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected final boolean isActivityResumed() {
        AbstractC1565i $r2 = getLifecycle();
        Priority $r3 = $r2.mo35505b();
        Priority $r1 = Priority.f4719G;
        boolean $z0 = $r3.m35575c($r1);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected final boolean isActivityStarted() {
        AbstractC1565i $r2 = getLifecycle();
        Priority $r3 = $r2.mo35505b();
        Priority $r1 = Priority.f4718F;
        boolean $z0 = $r3.m35575c($r1);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected final void navigationAction() {
        InterfaceC11756a $r1 = this.navigationBehavior;
        if ($r1 == null) {
            onBackPressed();
            return;
        }
        Log_OC.append($r1);
        $r1.invoke();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onBackPressed() {
        InterfaceC11756a $r1 = this.navigationBehavior;
        if ($r1 != null) {
            Log_OC.append($r1);
            $r1.invoke();
            return;
        }
        FragmentManager $r2 = getSupportFragmentManager();
        int $i0 = $r2.m35920m0();
        if ($i0 <= 1) {
            finish();
            return;
        }
        FragmentManager $r22 = getSupportFragmentManager();
        $r22.m35966V0();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context $r2 = getApplicationContext();
        Log_OC.loadImage($r2, "applicationContext");
        getSectorRepo($r2);
        InterfaceC8209a $r3 = getActivityBinding();
        ActivityMarketPlaceBinding $r4 = (ActivityMarketPlaceBinding) $r3;
        Toolbar $r5 = $r4.marketplaceToolbar;
        setSupportActionBar($r5);
        InterfaceC8209a $r32 = getActivityBinding();
        ActivityMarketPlaceBinding $r42 = (ActivityMarketPlaceBinding) $r32;
        Toolbar $r52 = $r42.marketplaceToolbar;
        $r52.setNavigationOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.v2.common.view.activities.TestActivity$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseMarketplaceActivity $r22 = BaseMarketplaceActivity.this;
                BaseMarketplaceActivity.m41541onCreate$lambda0($r22, view);
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void popBackStackTo(String str) {
        Log_OC.getArray(str, "fragName");
        FragmentManager $r2 = getSupportFragmentManager();
        Fragment $r3 = $r2.m35938g0(str);
        boolean $z0 = $r3 != null;
        if ($z0) {
            FragmentManager $r22 = getSupportFragmentManager();
            $r22.m35958Z0(str, 0);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void removeNavigationIcon() {
        InterfaceC8209a $r1 = getActivityBinding();
        ActivityMarketPlaceBinding $r2 = (ActivityMarketPlaceBinding) $r1;
        Toolbar $r3 = $r2.marketplaceToolbar;
        $r3.setNavigationIcon((Drawable) null);
    }

    public final void setNavigationBehavior(InterfaceC11756a interfaceC11756a) {
        this.navigationBehavior = interfaceC11756a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setNavigationIcon(int i) {
        InterfaceC8209a $r1 = getActivityBinding();
        ActivityMarketPlaceBinding $r2 = (ActivityMarketPlaceBinding) $r1;
        Toolbar $r3 = $r2.marketplaceToolbar;
        $r3.setNavigationIcon(i);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setToolbarColor(String str) {
        Log_OC.getArray(str, "color");
        InterfaceC8209a $r2 = getActivityBinding();
        ActivityMarketPlaceBinding $r3 = (ActivityMarketPlaceBinding) $r2;
        ViewGroup $r4 = $r3.marketplaceToolbar;
        int $i0 = Color.parseColor(str);
        ViewGroup r5 = $r4;
        r5.setBackgroundColor($i0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setToolbarTitle(String str) {
        Log_OC.getArray(str, "titleText");
        InterfaceC8209a $r2 = getActivityBinding();
        ActivityMarketPlaceBinding $r3 = (ActivityMarketPlaceBinding) $r2;
        TextView $r4 = $r3.marketplaceToolbarText;
        $r4.setText(str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setToolbarTitleColor(int i) {
        InterfaceC8209a $r1 = getActivityBinding();
        ActivityMarketPlaceBinding $r2 = (ActivityMarketPlaceBinding) $r1;
        TextView $r3 = $r2.marketplaceToolbarText;
        Context $r4 = getApplicationContext();
        int $i0 = C1335a.m36324d($r4, i);
        $r3.setTextColor($i0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected final void showKeyboard() {
        View $r1 = getCurrentFocus();
        if ($r1 == null) {
            return;
        }
        showKeyboard($r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected final void showKeyboard(View view) {
        Log_OC.getArray(view, "view");
        Object $r2 = getSystemService("input_method");
        if ($r2 == null) {
            NullPointerException $r5 = new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            throw $r5;
        }
        InputMethodManager $r3 = (InputMethodManager) $r2;
        IBinder $r4 = view.getWindowToken();
        $r3.hideSoftInputFromWindow($r4, 2);
        $r3.showSoftInput(view, 2);
    }

    public final void startFragment(Fragment fragment, boolean z) {
        startFragment$default(this, fragment, z, false, 0, 8, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void startFragment(Fragment fragment, boolean z, boolean z2, int i) {
        if (fragment != null) {
            Fragment $r2 = this.currentFragment;
            if ($r2 != null) {
                if ($r2 == null) {
                    Log_OC.LogError("currentFragment");
                    NullPointerException r10 = new NullPointerException("Null throw statement replaced by Soot");
                    throw r10;
                }
                boolean $z2 = Log_OC.append($r2, fragment);
                if ($z2) {
                    return;
                }
            }
            this.currentFragment = fragment;
            Class $r3 = fragment.getClass();
            String $r4 = $r3.getSimpleName();
            FragmentManager $r5 = getSupportFragmentManager();
            Log_OC.loadImage($r5, "supportFragmentManager");
            boolean $z22 = $r5.m35984M0();
            if ($z22) {
                return;
            }
            AbstractC1449b0 $r6 = $r5.m35924l();
            Log_OC.loadImage($r6, "fManager.beginTransaction()");
            if (i == 0) {
                int $i2 = R$anim.enter_from_right;
                int $i3 = R$anim.exit_to_left;
                int $i4 = R$anim.enter_from_left;
                int $i0 = R$anim.exit_to_right;
                $r6.m35819t($i2, $i3, $i4, $i0);
            }
            if (i == 1) {
                int $i1 = R$anim.enter_from_left;
                int $i02 = R$anim.exit_to_right;
                int $i22 = R$anim.enter_from_right;
                int $i32 = R$anim.exit_to_left;
                $r6.m35819t($i1, $i02, $i22, $i32);
            }
            InterfaceC8209a $r7 = getActivityBinding();
            ActivityMarketPlaceBinding $r8 = (ActivityMarketPlaceBinding) $r7;
            FrameLayout $r9 = $r8.flMarketPlaceContainer;
            int $i12 = $r9.getId();
            $r6.m35820s($i12, fragment, $r4);
            if (z) {
                $r6.m35824g($r4);
            }
            if (z2) {
                $r6.mo35804j();
            } else {
                $r6.mo35805i();
            }
        }
    }

    public final void startFragmentAllowStateLoss(Fragment fragment, boolean z) {
        startFragment$default(this, fragment, z, true, 0, 8, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void toggleHelpButton(boolean z) {
        InterfaceC8209a $r1 = getActivityBinding();
        ActivityMarketPlaceBinding $r2 = (ActivityMarketPlaceBinding) $r1;
        View $r3 = $r2.tvNeedHelpButton;
        Log_OC.loadImage($r3, "activityBinding.tvNeedHelpButton");
        View r4 = $r3;
        ViewExtKt.toggleVisibility(r4, z);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void toggleToolbar(boolean z) {
        InterfaceC8209a $r1 = getActivityBinding();
        ActivityMarketPlaceBinding $r2 = (ActivityMarketPlaceBinding) $r1;
        View $r3 = $r2.marketplaceToolbar;
        Log_OC.loadImage($r3, "activityBinding.marketplaceToolbar");
        View r4 = $r3;
        ViewExtKt.toggleVisibility(r4, z);
    }
}
