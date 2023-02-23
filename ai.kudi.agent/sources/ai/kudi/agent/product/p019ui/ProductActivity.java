package ai.kudi.agent.product.p019ui;

import ai.kudi.agent.bills.data.Biller;
import ai.kudi.agent.bills.data.BillerParams;
import ai.kudi.agent.bills.data.BillsData;
import ai.kudi.agent.collections.R$drawable;
import ai.kudi.agent.collections.R$id;
import ai.kudi.agent.collections.R$string;
import ai.kudi.agent.collections.databinding.ActivityProductBinding;
import ai.kudi.agent.core.mvp.MvpActivity;
import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.core.util.CustomDialog;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.product.airtime_data.data.AirtimePurchase;
import ai.kudi.agent.product.airtime_data.data.ProductPurchase;
import ai.kudi.agent.product.airtime_data.p017ui.AirtimeAmountFragment;
import ai.kudi.agent.product.airtime_data.p017ui.AirtimeTopUpFragment;
import ai.kudi.agent.product.navigators.ProductNavigator;
import ai.kudi.agent.product.other_bills.navigators.BillPaymentNavigator;
import ai.kudi.agent.product.other_bills.p018ui.AmountFragment;
import ai.kudi.agent.product.other_bills.p018ui.BillPaymentCustomerDetailsFragment;
import ai.kudi.agent.product.other_bills.p018ui.BillPaymentStepOneFragment;
import ai.kudi.agent.product.other_bills.p018ui.PayBillsFragment;
import ai.kudi.agent.product.p019ui.ProductSummaryFragment;
import ai.kudi.agent.product.presenter.ProductsActivityPresenter;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AbstractC0925a;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.tabs.TabLayout;
import dagger.android.C7427a;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.Registry;
import dagger.android.d;
import h.d.a.c.e;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.C11812w;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
import p272h.p364d.p365a.p366c.InterfaceC9413d;
/* compiled from: ProductActivity.kt */
@Metadata(m10422d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 >2\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u00020\u00062\u00020\u00072\u00020\u0003:\u0001>B\u0005¢\u0006\u0002\u0010\bJ\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0004H\u0016J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020%H\u0002J\b\u0010'\u001a\u00020%H\u0002J\u0006\u0010(\u001a\u00020%J\u0010\u0010)\u001a\u00020%2\u0006\u0010*\u001a\u00020+H\u0016J\u0010\u0010,\u001a\u00020%2\u0006\u0010-\u001a\u00020.H\u0016J\u0010\u0010/\u001a\u00020%2\u0006\u0010*\u001a\u00020.H\u0016J\b\u00100\u001a\u00020%H\u0016J\u0012\u00101\u001a\u00020%2\b\u00102\u001a\u0004\u0018\u000103H\u0014J\u0010\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0016J\b\u00108\u001a\u00020%H\u0002J\u0006\u00109\u001a\u00020%J\u0010\u0010:\u001a\u00020%2\u0006\u0010\"\u001a\u00020#H\u0016J\u0010\u0010;\u001a\u00020%2\u0006\u0010\"\u001a\u00020#H\u0016J\u0010\u0010<\u001a\u00020%2\u0006\u0010\"\u001a\u00020#H\u0016J\u0010\u0010=\u001a\u00020%2\u0006\u0010\"\u001a\u00020#H\u0016R\u0014\u0010\t\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR$\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u00048\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006?"}, m10421d2 = {"Lai/kudi/agent/product/ui/ProductActivity;", "Ldagger/android/HasAndroidInjector;", "Lai/kudi/agent/core/mvp/MvpActivity;", "Lcom/hannesdorfmann/mosby3/mvp/MvpView;", "Lai/kudi/agent/product/presenter/ProductsActivityPresenter;", "Lai/kudi/agent/collections/databinding/ActivityProductBinding;", "Lai/kudi/agent/product/navigators/ProductNavigator;", "Lai/kudi/agent/product/other_bills/navigators/BillPaymentNavigator;", "()V", "activityBinding", "getActivityBinding", "()Lai/kudi/agent/collections/databinding/ActivityProductBinding;", "androidInjector", "Ldagger/android/DispatchingAndroidInjector;", "", "getAndroidInjector", "()Ldagger/android/DispatchingAndroidInjector;", "setAndroidInjector", "(Ldagger/android/DispatchingAndroidInjector;)V", BillPaymentStepOneFragment.BILLER_PARAM, "Lai/kudi/agent/bills/data/Biller;", "getBiller$feature_collections_release", "()Lai/kudi/agent/bills/data/Biller;", "setBiller$feature_collections_release", "(Lai/kudi/agent/bills/data/Biller;)V", "thisPresenter", "getThisPresenter", "()Lai/kudi/agent/product/presenter/ProductsActivityPresenter;", "setThisPresenter", "(Lai/kudi/agent/product/presenter/ProductsActivityPresenter;)V", "Ldagger/android/AndroidInjector;", "createPresenter", "getCableStepOneFragment", "Landroidx/fragment/app/Fragment;", BillPaymentCustomerDetailsFragment.BILLER_PARAM, "Lai/kudi/agent/bills/data/BillsData;", "goToBillsList", "", "handleAirtimeAndData", "handleOtherBills", "hideLoader", "navigateToAirtimeAmountFragment", "airtimePurchase", "Lai/kudi/agent/product/airtime_data/data/AirtimePurchase;", "navigateToAirtimeAndDataFragment", "payload", "Lai/kudi/agent/product/airtime_data/data/ProductPurchase;", "navigateToAirtimePurchaseSummaryFragment", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "setTabLayout", "showLoader", "toAmountView", "toStepOneView", "toStepThreeView", "toStepTwoView", "Companion", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.product.ui.ProductActivity */
/* loaded from: classes.dex */
public final class ProductActivity extends MvpActivity<e, ProductsActivityPresenter, ActivityProductBinding> implements d, ProductNavigator, BillPaymentNavigator, e {
    public static final Companion Companion;
    public static final String EXTRA_MODE = "extra_mode";
    public static final String EXTRA_MODE_AIRTIME_DATA = "airtime_data";
    public static final String EXTRA_MODE_MERCHANT_COLLECTION = "merch_collection";
    public static final String EXTRA_MODE_OTHER_BILLS = "other_bills";
    public DispatchingAndroidInjector<Object> androidInjector;
    private Biller biller;
    public ProductsActivityPresenter thisPresenter;

    /* compiled from: ProductActivity.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m10421d2 = {"Lai/kudi/agent/product/ui/ProductActivity$Companion;", "", "()V", "EXTRA_MODE", "", "EXTRA_MODE_AIRTIME_DATA", "EXTRA_MODE_MERCHANT_COLLECTION", "EXTRA_MODE_OTHER_BILLS", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.product.ui.ProductActivity$Companion */
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
    private final Fragment getCableStepOneFragment(BillsData billsData) {
        FragmentActivity r8 = (FragmentActivity) this;
        FragmentManager $r2 = r8.getSupportFragmentManager();
        String $r4 = BillPaymentStepOneFragment.class.getCanonicalName();
        Fragment $r5 = $r2.m35938g0($r4);
        if ($r5 == null) {
            BillPaymentStepOneFragment.Companion $r6 = BillPaymentStepOneFragment.Companion;
            Fragment $r7 = $r6.newInstance(billsData);
            return $r7;
        }
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void goToBillsList() {
        Fragment r2 = new PayBillsFragment();
        int $i0 = R$id.fl_container;
        AppCompatActivity r3 = (AppCompatActivity) this;
        Fragment r4 = r2;
        AppCompatActivityExtKt.startFragment$default(r3, r4, $i0, false, false, false, 12, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void handleAirtimeAndData() {
        AppCompatActivity r3 = (AppCompatActivity) this;
        AbstractC0925a $r1 = r3.getSupportActionBar();
        if ($r1 != null) {
            int $i0 = R$drawable.ic_close;
            $r1.mo37597z($i0);
        }
        int $i02 = R$string.airtime_slash_data;
        Activity r4 = (Activity) this;
        String $r2 = r4.getString($i02);
        Log_OC.loadImage($r2, "getString(R.string.airtime_slash_data)");
        setTitle($r2);
        setTabLayout();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void handleOtherBills() {
        InterfaceC8209a $r1 = getBinding();
        TabLayout $r3 = ((ActivityProductBinding) $r1).tabLayout;
        Log_OC.loadImage($r3, "binding.tabLayout");
        ViewExtKt.hide$default($r3, false, 1, null);
        AbstractC0925a $r4 = ((AppCompatActivity) this).getSupportActionBar();
        if ($r4 != null) {
            int $i0 = R$drawable.ic_arrow_backward;
            $r4.mo37597z($i0);
        }
        Activity r15 = (Activity) this;
        Intent $r5 = r15.getIntent();
        Parcelable $r6 = $r5.getParcelableExtra(BillerParams.PARCEL_NAME);
        Biller $r7 = (Biller) $r6;
        if ($r7 == null) {
            AppCompatActivity r14 = (AppCompatActivity) this;
            AbstractC0925a $r42 = r14.getSupportActionBar();
            if ($r42 != null) {
                int $i02 = R$string.pay_bills;
                Activity r152 = (Activity) this;
                String $r8 = r152.getString($i02);
                $r42.mo37631C($r8);
            }
            goToBillsList();
            return;
        }
        InterfaceC8209a $r12 = getBinding();
        ActivityProductBinding $r2 = (ActivityProductBinding) $r12;
        View $r32 = $r2.tabLayout;
        Log_OC.loadImage($r32, "binding.tabLayout");
        View r13 = $r32;
        ViewExtKt.hide$default(r13, false, 1, null);
        AppCompatActivity r142 = (AppCompatActivity) this;
        AbstractC0925a $r43 = r142.getSupportActionBar();
        if ($r43 != null) {
            String $r82 = $r7.getName();
            $r43.mo37631C($r82);
        }
        BillsData r12 = new BillsData(null, null, null, null, null, $r7, 0, null, null, null, null, null, 4063, null);
        toStepOneView(r12);
        InterfaceC9413d $r10 = this.presenter;
        ProductsActivityPresenter $r11 = (ProductsActivityPresenter) $r10;
        $r11.onViewCreated($r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setTabLayout() {
        InterfaceC8209a $r1 = getBinding();
        ActivityProductBinding $r2 = (ActivityProductBinding) $r1;
        TabLayout $r3 = $r2.tabLayout;
        Log_OC.loadImage($r3, "binding.tabLayout");
        TabLayout r10 = $r3;
        ViewExtKt.show(r10);
        TabLayout.C4745g $r4 = $r3.m26536z();
        int $i0 = R$string.tab_title_airtime;
        String $r5 = ((Activity) this).getString($i0);
        $r4.m26505u($r5);
        $r3.m26557e($r4);
        TabLayout.C4745g $r42 = $r3.m26536z();
        int $i02 = R$string.tab_title_data;
        String $r52 = ((Activity) this).getString($i02);
        $r42.m26505u($r52);
        $r3.m26557e($r42);
        AirtimeTopUpFragment.Companion $r6 = AirtimeTopUpFragment.Companion;
        Fragment $r7 = AirtimeTopUpFragment.Companion.getInstance$default($r6, null, null, 1, null);
        int $i03 = R$id.fl_container;
        AppCompatActivity r12 = (AppCompatActivity) this;
        Fragment r13 = $r7;
        AppCompatActivityExtKt.startFragment$default(r12, r13, $i03, false, false, false, 28, null);
        $r3.m26558d(new TabLayout.InterfaceC4740d() { // from class: ai.kudi.agent.product.ui.ProductActivity$setTabLayout$1
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
                    int $i04 = c4745g.m26518h();
                    $r22 = Integer.valueOf($i04);
                }
                if ($r22 != null) {
                    int $i05 = $r22.intValue();
                    if ($i05 == 0) {
                        ProductActivity $r32 = ProductActivity.this;
                        AirtimeTopUpFragment.Companion $r43 = AirtimeTopUpFragment.Companion;
                        AirtimeTopUpFragment $r53 = $r43.getInstance(AirtimeTopUpFragment.ARGS_MODE_AIRTIME, null);
                        int $i06 = R$id.fl_container;
                        AppCompatActivityExtKt.startFragment$default((AppCompatActivity) $r32, $r53, $i06, false, false, false, 12, null);
                        return;
                    }
                }
                if ($r22 == null) {
                    return;
                }
                int $i07 = $r22.intValue();
                if ($i07 == 1) {
                    ProductActivity $r33 = ProductActivity.this;
                    AirtimeTopUpFragment.Companion $r44 = AirtimeTopUpFragment.Companion;
                    Fragment $r54 = $r44.getInstance(AirtimeTopUpFragment.ARGS_MODE_DATA, null);
                    int $i08 = R$id.fl_container;
                    AppCompatActivity r6 = (AppCompatActivity) $r33;
                    Fragment r7 = $r54;
                    AppCompatActivityExtKt.startFragment$default(r6, r7, $i08, false, false, false, 12, null);
                }
            }

            @Override // com.google.android.material.tabs.TabLayout.InterfaceC4739c
            public void onTabUnselected(TabLayout.C4745g c4745g) {
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public Registry androidInjector() {
        DispatchingAndroidInjector $r1 = getAndroidInjector();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9409a, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public ProductsActivityPresenter createPresenter() {
        ProductsActivityPresenter $r1 = getThisPresenter();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p272h.p364d.p365a.p366c.AbstractC9409a, p272h.p364d.p365a.p366c.p367f.InterfaceC9418e
    public /* bridge */ /* synthetic */ InterfaceC9413d createPresenter() {
        ProductsActivityPresenter $r1 = createPresenter();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity
    public ActivityProductBinding getActivityBinding() {
        Activity r3 = (Activity) this;
        LayoutInflater $r1 = r3.getLayoutInflater();
        ActivityProductBinding $r2 = ActivityProductBinding.inflate($r1);
        Log_OC.loadImage($r2, "inflate(layoutInflater)");
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvp.MvpActivity
    public /* bridge */ /* synthetic */ InterfaceC8209a getActivityBinding() {
        ActivityProductBinding $r1 = getActivityBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final DispatchingAndroidInjector getAndroidInjector() {
        DispatchingAndroidInjector $r1 = this.androidInjector;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("androidInjector");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Biller getBiller$feature_collections_release() {
        Biller r1 = this.biller;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ProductsActivityPresenter getThisPresenter() {
        ProductsActivityPresenter $r1 = this.thisPresenter;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("thisPresenter");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    public final void hideLoader() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.product.navigators.ProductNavigator
    public void navigateToAirtimeAmountFragment(AirtimePurchase airtimePurchase) {
        Log_OC.getArray(airtimePurchase, "airtimePurchase");
        AirtimeAmountFragment.Companion $r3 = AirtimeAmountFragment.Companion;
        Fragment $r2 = $r3.getInstance(airtimePurchase);
        int $i0 = R$id.fl_container;
        AppCompatActivity r4 = (AppCompatActivity) this;
        Fragment r5 = $r2;
        AppCompatActivityExtKt.startFragment$default(r4, r5, $i0, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.product.navigators.ProductNavigator
    public void navigateToAirtimeAndDataFragment(ProductPurchase productPurchase) {
        Log_OC.getArray(productPurchase, "payload");
        AirtimeTopUpFragment.Companion $r3 = AirtimeTopUpFragment.Companion;
        AirtimeTopUpFragment $r2 = AirtimeTopUpFragment.Companion.getInstance$default($r3, null, productPurchase, 1, null);
        int $i0 = R$id.fl_container;
        AppCompatActivityExtKt.startFragment$default((AppCompatActivity) this, $r2, $i0, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.product.navigators.ProductNavigator
    public void navigateToAirtimePurchaseSummaryFragment(ProductPurchase productPurchase) {
        Log_OC.getArray(productPurchase, "airtimePurchase");
        ProductSummaryFragment.Companion $r3 = ProductSummaryFragment.Companion;
        Fragment $r2 = $r3.newInstance(productPurchase);
        int $i0 = R$id.fl_container;
        AppCompatActivity r4 = (AppCompatActivity) this;
        Fragment r5 = $r2;
        AppCompatActivityExtKt.startFragment$default(r4, r5, $i0, false, false, false, 28, null);
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
        Activity r8 = (Activity) this;
        C7427a.m18756a(r8);
        super.onCreate(bundle);
        InterfaceC8209a $r2 = getBinding();
        ActivityProductBinding $r3 = (ActivityProductBinding) $r2;
        Toolbar $r4 = $r3.toolbar;
        AppCompatActivity r9 = (AppCompatActivity) this;
        r9.setSupportActionBar($r4);
        AppCompatActivity r92 = (AppCompatActivity) this;
        AbstractC0925a $r5 = r92.getSupportActionBar();
        if ($r5 != null) {
            $r5.mo37602u(true);
        }
        Activity r82 = (Activity) this;
        Intent $r6 = r82.getIntent();
        Bundle $r1 = $r6.getExtras();
        String $r7 = $r1 == null ? null : $r1.getString(EXTRA_MODE);
        boolean $z0 = Log_OC.append($r7, EXTRA_MODE_AIRTIME_DATA);
        if ($z0) {
            handleAirtimeAndData();
            return;
        }
        boolean $z02 = Log_OC.append($r7, EXTRA_MODE_OTHER_BILLS);
        if ($z02) {
            handleOtherBills();
        } else {
            handleOtherBills();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Type inference failed for: r24v0, types: [T, android.app.Dialog] */
    @Override // ai.kudi.agent.core.mvp.MvpActivity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Log_OC.getArray(menuItem, "item");
        int $i0 = menuItem.getItemId();
        if ($i0 != 16908332) {
            boolean $z0 = super.onOptionsItemSelected(menuItem);
            return $z0;
        }
        C11812w r8 = new C11812w();
        CustomDialog.Companion $r4 = CustomDialog.Companion;
        int $i02 = R$string.transaction_dialog_msg;
        String $r5 = ((Activity) this).getString($i02);
        Log_OC.loadImage($r5, "getString(R.string.transaction_dialog_msg)");
        int $i03 = R$string.text_close;
        String $r6 = ((Activity) this).getString($i03);
        Log_OC.loadImage($r6, "getString(R.string.text_close)");
        ProductActivity$onOptionsItemSelected$1 r9 = new ProductActivity$onOptionsItemSelected$1(r8, this);
        r8.f26499c = CustomDialog.Companion.show$default($r4, (Context) this, $r5, $r6, false, true, false, (InterfaceC11756a) r9, 32, (Object) null);
        return true;
    }

    public final void setAndroidInjector(DispatchingAndroidInjector dispatchingAndroidInjector) {
        Log_OC.getArray(dispatchingAndroidInjector, "<set-?>");
        this.androidInjector = dispatchingAndroidInjector;
    }

    public final void setBiller$feature_collections_release(Biller biller) {
        this.biller = biller;
    }

    public final void setThisPresenter(ProductsActivityPresenter productsActivityPresenter) {
        Log_OC.getArray(productsActivityPresenter, "<set-?>");
        this.thisPresenter = productsActivityPresenter;
    }

    public final void showLoader() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.product.other_bills.navigators.BillPaymentNavigator
    public void toAmountView(BillsData billsData) {
        Log_OC.getArray(billsData, BillPaymentCustomerDetailsFragment.BILLER_PARAM);
        InterfaceC8209a $r2 = getBinding();
        ActivityProductBinding $r3 = (ActivityProductBinding) $r2;
        View $r4 = $r3.appBarLayout;
        Log_OC.loadImage($r4, "binding.appBarLayout");
        View r7 = $r4;
        ViewExtKt.show(r7);
        AmountFragment.Companion $r5 = AmountFragment.Companion;
        AmountFragment $r6 = $r5.newInstance(billsData);
        int $i0 = R$id.fl_container;
        AppCompatActivityExtKt.startFragment$default((AppCompatActivity) this, $r6, $i0, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.product.other_bills.navigators.BillPaymentNavigator
    public void toStepOneView(BillsData billsData) {
        Log_OC.getArray(billsData, BillPaymentCustomerDetailsFragment.BILLER_PARAM);
        Fragment $r2 = getCableStepOneFragment(billsData);
        int $i0 = R$id.fl_container;
        AppCompatActivity r3 = (AppCompatActivity) this;
        AppCompatActivityExtKt.startFragment$default(r3, $r2, $i0, false, false, false, 12, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.product.other_bills.navigators.BillPaymentNavigator
    public void toStepThreeView(BillsData billsData) {
        Log_OC.getArray(billsData, BillPaymentCustomerDetailsFragment.BILLER_PARAM);
        InterfaceC8209a $r2 = getBinding();
        ActivityProductBinding $r3 = (ActivityProductBinding) $r2;
        View $r4 = $r3.appBarLayout;
        Log_OC.loadImage($r4, "binding.appBarLayout");
        View r7 = $r4;
        ViewExtKt.show(r7);
        ProductSummaryFragment.Companion $r5 = ProductSummaryFragment.Companion;
        ProductSummaryFragment $r6 = $r5.newInstance(billsData);
        int $i0 = R$id.fl_container;
        AppCompatActivityExtKt.startFragment$default((AppCompatActivity) this, $r6, $i0, false, false, false, 28, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.product.other_bills.navigators.BillPaymentNavigator
    public void toStepTwoView(BillsData billsData) {
        Log_OC.getArray(billsData, BillPaymentCustomerDetailsFragment.BILLER_PARAM);
        InterfaceC8209a $r2 = getBinding();
        ActivityProductBinding $r3 = (ActivityProductBinding) $r2;
        View $r4 = $r3.appBarLayout;
        Log_OC.loadImage($r4, "binding.appBarLayout");
        View r7 = $r4;
        ViewExtKt.show(r7);
        BillPaymentCustomerDetailsFragment.Companion $r5 = BillPaymentCustomerDetailsFragment.Companion;
        BillPaymentCustomerDetailsFragment $r6 = $r5.newInstance(billsData);
        int $i0 = R$id.fl_container;
        AppCompatActivityExtKt.startFragment$default((AppCompatActivity) this, $r6, $i0, false, false, false, 28, null);
    }
}
