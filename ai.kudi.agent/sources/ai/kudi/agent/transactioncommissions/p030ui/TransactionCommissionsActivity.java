package ai.kudi.agent.transactioncommissions.p030ui;

import ai.kudi.agent.BaseApplication;
import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.crashreport.CrashlyticsReport;
import ai.kudi.agent.core.internal.components.ApplicationComponent;
import ai.kudi.agent.core.mvvm.BaseMVVMActivity;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.core.util.AppCompatActivityExtKt;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.CustomDialog;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.databinding.ActivityTransactionCommissionsBinding;
import ai.kudi.agent.transactioncommissions.labs.TransactionCommissionsSubComponent;
import ai.kudi.agent.transactioncommissions.navigator.TransactionCommissionsNavigator;
import ai.kudi.agent.transactioncommissions.p030ui.CommissionsCashoutStatusFragment;
import ai.kudi.agent.transactioncommissions.p030ui.FilterCommissionsFragment;
import ai.kudi.agent.transactioncommissions.p030ui.TransactionCommissionsFragment;
import ai.kudi.agent.transactioncommissions.p030ui.bottomsheet.CommissionsOptionMenuBottomSheet;
import ai.kudi.agent.transactioncommissions.presentation.TransactionCommissionsActivityViewModel;
import ai.kudi.agent.transactioncommissions.presentation.TransactionCommissionsActivityViewState;
import ai.kudi.agent.transactionhistory.data.model.TransactionItemUiModel;
import ai.kudi.agent.transactions.domain.dto.CommissionWallet;
import ai.kudi.agent.transactions.p032ui.TransactionDetailsActivity;
import ai.kudi.dip.library.SafeViewPager;
import android.app.Application;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.PersistableBundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.AbstractC0925a;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.AbstractC1529z;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.trello.rxlifecycle2.FileStorage;
import com.trello.rxlifecycle2.p194g.C7392a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13722p;
import kotlin.p557z.C13726r;
import p201g.p270x.InterfaceC8209a;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p450e0.Object;
import p425j.p444e.p471k0.C11680b;
/* compiled from: TransactionCommissionsActivity.kt */
@Metadata(m10422d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 =2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0002=>B\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0003H\u0014J\b\u0010!\u001a\u00020\u0002H\u0014J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020#H\u0014J\b\u0010$\u001a\u00020\u001fH\u0003J\b\u0010%\u001a\u00020\u001fH\u0016J\u0012\u0010&\u001a\u00020\u001f2\b\u0010'\u001a\u0004\u0018\u00010(H\u0014J\u0012\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u0010\u0010-\u001a\u00020*2\u0006\u0010.\u001a\u00020/H\u0016J\u0010\u00100\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020(H\u0014J\u0018\u00101\u001a\u00020\u001f2\u0006\u00102\u001a\u00020(2\u0006\u00103\u001a\u000204H\u0016J\u0010\u00105\u001a\u00020\u001f2\u0006\u00106\u001a\u000207H\u0016J\b\u00108\u001a\u00020\u001fH\u0002J\u000e\u00109\u001a\u00020\u001f2\u0006\u0010:\u001a\u00020*J\u0016\u0010;\u001a\u00020\u001f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002J\b\u0010<\u001a\u00020\u001fH\u0002R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006?"}, m10421d2 = {"Lai/kudi/agent/transactioncommissions/ui/TransactionCommissionsActivity;", "Lai/kudi/agent/core/mvvm/BaseMVVMActivity;", "Lai/kudi/agent/transactioncommissions/presentation/TransactionCommissionsActivityViewModel;", "Lai/kudi/agent/transactioncommissions/presentation/TransactionCommissionsActivityViewState;", "Lai/kudi/agent/databinding/ActivityTransactionCommissionsBinding;", "Lai/kudi/agent/transactioncommissions/navigator/TransactionCommissionsNavigator;", "()V", "activityBinding", "getActivityBinding", "()Lai/kudi/agent/databinding/ActivityTransactionCommissionsBinding;", "activitySubComponent", "Lai/kudi/agent/transactioncommissions/di/TransactionCommissionsSubComponent;", "getActivitySubComponent", "()Lai/kudi/agent/transactioncommissions/di/TransactionCommissionsSubComponent;", "setActivitySubComponent", "(Lai/kudi/agent/transactioncommissions/di/TransactionCommissionsSubComponent;)V", "preferences", "Landroid/content/SharedPreferences;", "getPreferences", "()Landroid/content/SharedPreferences;", "setPreferences", "(Landroid/content/SharedPreferences;)V", "viewModel", "getViewModel", "()Lai/kudi/agent/transactioncommissions/presentation/TransactionCommissionsActivityViewModel;", "setViewModel", "(Lai/kudi/agent/transactioncommissions/presentation/TransactionCommissionsActivityViewModel;)V", "wallets", "", "Lai/kudi/agent/transactions/domain/dto/CommissionWallet;", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "observeViewModel", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onRestoreInstanceState", "onSaveInstanceState", "outState", "outPersistentState", "Landroid/os/PersistableBundle;", "onTransactionCommissionDetails", "transaction", "Lai/kudi/agent/transactionhistory/data/model/TransactionItemUiModel$Transaction;", "renderOptionsBottomSheet", "setMenuVisibility", "visible", "setUpPager", "setupCommissionHistories", "Companion", "TransactionPagerAdapter", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.transactioncommissions.ui.TransactionCommissionsActivity */
/* loaded from: classes.dex */
public final class TransactionCommissionsActivity extends BaseMVVMActivity<TransactionCommissionsActivityViewModel, TransactionCommissionsActivityViewState, ActivityTransactionCommissionsBinding> implements TransactionCommissionsNavigator {
    public static final String BUNDLE_KEY_COMMISSION_WALLETS = "BUNDLE_KEY_COMMISSION_WALLETS";
    public static final Companion Companion;
    public TransactionCommissionsSubComponent activitySubComponent;
    public SharedPreferences preferences;
    public TransactionCommissionsActivityViewModel viewModel;
    private List<CommissionWallet> wallets;

    /* compiled from: TransactionCommissionsActivity.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/agent/transactioncommissions/ui/TransactionCommissionsActivity$Companion;", "", "()V", TransactionCommissionsActivity.BUNDLE_KEY_COMMISSION_WALLETS, "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.transactioncommissions.ui.TransactionCommissionsActivity$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }
    }

    /* compiled from: TransactionCommissionsActivity.kt */
    @Metadata(m10422d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m10421d2 = {"Lai/kudi/agent/transactioncommissions/ui/TransactionCommissionsActivity$TransactionPagerAdapter;", "Landroidx/fragment/app/FragmentStatePagerAdapter;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "wallets", "", "Lai/kudi/agent/transactions/domain/dto/CommissionWallet;", "(Landroidx/fragment/app/FragmentManager;Ljava/util/List;)V", "getCount", "", "getItem", "Lai/kudi/agent/transactioncommissions/ui/TransactionCommissionsFragment;", "position", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.transactioncommissions.ui.TransactionCommissionsActivity$TransactionPagerAdapter */
    /* loaded from: classes.dex */
    public static final class TransactionPagerAdapter extends AbstractC1529z {
        private final List<CommissionWallet> wallets;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransactionPagerAdapter(FragmentManager fragmentManager, List list) {
            super(fragmentManager, 1);
            Log_OC.getArray(fragmentManager, "fragmentManager");
            Log_OC.getArray(list, "wallets");
            this.wallets = list;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // androidx.viewpager.widget.AbstractC1904a
        public int getCount() {
            List $r1 = this.wallets;
            int $i0 = $r1.size();
            return $i0;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // androidx.fragment.app.AbstractC1529z
        public TransactionCommissionsFragment getItem(int i) {
            TransactionCommissionsFragment.Companion $r1 = TransactionCommissionsFragment.Companion;
            List $r2 = this.wallets;
            Object $r3 = $r2.get(i);
            CommissionWallet $r4 = (CommissionWallet) $r3;
            TransactionCommissionsFragment $r5 = $r1.newInstance($r4);
            return $r5;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // androidx.fragment.app.AbstractC1529z
        public /* bridge */ /* synthetic */ Fragment getItem(int i) {
            TransactionCommissionsFragment $r1 = getItem(i);
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

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public TransactionCommissionsActivity() {
        List $r1;
        $r1 = C13726r.m3891e();
        this.wallets = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void observeViewModel() {
        TransactionCommissionsActivityViewModel $r1 = getViewModel();
        C11680b $r2 = $r1.getCommissionWallets();
        FileStorage $r3 = getLifecycleProvider();
        AbstractC11688p $r4 = C7392a.a($r2, $r3);
        Object object = new Object() { // from class: ai.kudi.agent.transactioncommissions.ui.Label
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                TransactionCommissionsActivity $r12 = TransactionCommissionsActivity.this;
                List $r32 = (List) obj;
                TransactionCommissionsActivity.m40985observeViewModel$lambda0($r12, $r32);
            }
        };
        Function $r6 = Function.MONTH;
        $r4.e0(object, $r6);
        TransactionCommissionsActivityViewModel $r12 = getViewModel();
        C11680b $r22 = $r12.getToastMessage();
        FileStorage $r32 = getLifecycleProvider();
        AbstractC11688p $r42 = C7392a.a($r22, $r32);
        Object object2 = new Object() { // from class: ai.kudi.agent.transactioncommissions.ui.FromMatchesFilter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                TransactionCommissionsActivity $r13 = TransactionCommissionsActivity.this;
                String $r33 = (String) obj;
                TransactionCommissionsActivity.m40987observeViewModel$lambda2($r13, $r33);
            }
        };
        Token $r8 = Token.PERCENT;
        $r42.e0(object2, $r8);
        TransactionCommissionsActivityViewModel $r13 = getViewModel();
        C11680b $r23 = $r13.getOnCashOutComplete();
        FileStorage $r33 = getLifecycleProvider();
        AbstractC11688p $r43 = C7392a.a($r23, $r33);
        Object object3 = new Object() { // from class: ai.kudi.agent.transactioncommissions.ui.MultiDexExtractor$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                TransactionCommissionsActivity $r14 = TransactionCommissionsActivity.this;
                Boolean $r34 = (Boolean) obj;
                TransactionCommissionsActivity.m40989observeViewModel$lambda4($r14, $r34);
            }
        };
        Chunk $r10 = Chunk.NEWLINE;
        $r43.e0(object3, $r10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: observeViewModel$lambda-0  reason: not valid java name */
    public static final void m40985observeViewModel$lambda0(TransactionCommissionsActivity transactionCommissionsActivity, List list) {
        Log_OC.getArray(transactionCommissionsActivity, "this$0");
        Log_OC.loadImage(list, "it");
        transactionCommissionsActivity.wallets = list;
        transactionCommissionsActivity.setupCommissionHistories();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: observeViewModel$lambda-1  reason: not valid java name */
    public static final void m40986observeViewModel$lambda1(Throwable th) {
        Log_OC.loadImage(th, "it");
        CrashlyticsReport.logException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: observeViewModel$lambda-2  reason: not valid java name */
    public static final void m40987observeViewModel$lambda2(TransactionCommissionsActivity transactionCommissionsActivity, String str) {
        Log_OC.getArray(transactionCommissionsActivity, "this$0");
        ContextExtKt.toast$default(transactionCommissionsActivity, str, 0, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: observeViewModel$lambda-3  reason: not valid java name */
    public static final void m40988observeViewModel$lambda3(Throwable th) {
        Log_OC.loadImage(th, "it");
        CrashlyticsReport.logException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: observeViewModel$lambda-4  reason: not valid java name */
    public static final void m40989observeViewModel$lambda4(TransactionCommissionsActivity transactionCommissionsActivity, Boolean bool) {
        Log_OC.getArray(transactionCommissionsActivity, "this$0");
        CommissionsCashoutStatusFragment.Companion $r2 = CommissionsCashoutStatusFragment.Companion;
        CommissionsCashoutStatusFragment $r3 = $r2.newInstance();
        FragmentManager $r4 = transactionCommissionsActivity.getSupportFragmentManager();
        $r3.show($r4, CommissionsCashoutStatusFragment.PAGE_KEY);
        transactionCommissionsActivity.setupCommissionHistories();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: observeViewModel$lambda-5  reason: not valid java name */
    public static final void m40990observeViewModel$lambda5(Throwable th) {
        Log_OC.loadImage(th, "it");
        CrashlyticsReport.logException(th);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void renderOptionsBottomSheet() {
        Dialog r4 = new CommissionsOptionMenuBottomSheet(this, new CommissionsOptionMenuBottomSheet.OnActionListener() { // from class: ai.kudi.agent.transactioncommissions.ui.TransactionCommissionsActivity$renderOptionsBottomSheet$bottomSheetListener$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.transactioncommissions.p030ui.bottomsheet.CommissionsOptionMenuBottomSheet.OnActionListener
            public void onCashout() {
                TransactionCommissionsActivityViewModel $r5 = TransactionCommissionsActivity.this.getViewModel();
                $r5.onCashoutAction();
                CustomDialog.Companion $r1 = CustomDialog.Companion;
                TransactionCommissionsActivity $r2 = TransactionCommissionsActivity.this;
                String $r6 = $r2.getString(C0001R.string.confirm_cashout_commissions_title);
                Log_OC.loadImage($r6, "getString(R.string.confirm_cashout_commissions_title)");
                TransactionCommissionsActivity $r7 = TransactionCommissionsActivity.this;
                String $r8 = $r7.getString(C0001R.string.confirm_cashout_commissions_text);
                Log_OC.loadImage($r8, "getString(R.string.confirm_cashout_commissions_text)");
                TransactionCommissionsActivity $r72 = TransactionCommissionsActivity.this;
                String $r9 = $r72.getString(C0001R.string.proceed);
                Log_OC.loadImage($r9, "getString(R.string.proceed)");
                TransactionCommissionsActivity $r73 = TransactionCommissionsActivity.this;
                C0572x4ed5b22d $r3 = new C0572x4ed5b22d($r73);
                TransactionCommissionsActivity $r74 = TransactionCommissionsActivity.this;
                C0573x4ed5b22e $r4 = new C0573x4ed5b22e($r74);
                CustomDialog.Companion.showConfirmDialog$default($r1, $r2, $r6, $r8, $r9, false, $r3, $r4, 16, null);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.transactioncommissions.p030ui.bottomsheet.CommissionsOptionMenuBottomSheet.OnActionListener
            public void onFilter() {
                String $r10;
                TransactionCommissionsActivity.this.setMenuVisibility(false);
                TransactionCommissionsActivity $r1 = TransactionCommissionsActivity.this;
                FilterCommissionsFragment.Companion $r2 = FilterCommissionsFragment.Companion;
                List $r3 = $r1.wallets;
                boolean $z0 = $r3.isEmpty();
                if (!$z0) {
                    TransactionCommissionsActivity $r4 = TransactionCommissionsActivity.this;
                    List $r32 = $r4.wallets;
                    TransactionCommissionsActivity $r42 = TransactionCommissionsActivity.this;
                    InterfaceC8209a $r5 = $r42.getBinding();
                    SafeViewPager $r7 = ((ActivityTransactionCommissionsBinding) $r5).viewPager;
                    int $i0 = $r7.getCurrentItem();
                    Object $r8 = $r32.get($i0);
                    $r10 = ((CommissionWallet) $r8).getId();
                } else {
                    $r10 = "";
                }
                FilterCommissionsFragment $r11 = $r2.newInstance($r10);
                AppCompatActivityExtKt.startFragment$default($r1, $r11, C0001R.C0003id.screen_content, true, false, false, 8, null);
            }
        });
        Dialog r5 = r4;
        r5.show();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0047 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setUpPager(java.util.List r25) {
        /*
            r24 = this;
            r0 = r24
            g.x.a r2 = r0.getBinding()
            r4 = r2
            ai.kudi.agent.databinding.ActivityTransactionCommissionsBinding r4 = (ai.kudi.agent.databinding.ActivityTransactionCommissionsBinding) r4
            r3 = r4
            ai.kudi.dip.library.SafeViewPager r5 = r3.viewPager
            ai.kudi.agent.transactioncommissions.ui.TransactionCommissionsActivity$TransactionPagerAdapter r6 = new ai.kudi.agent.transactioncommissions.ui.TransactionCommissionsActivity$TransactionPagerAdapter
            r0 = r24
            androidx.fragment.app.FragmentManager r7 = r0.getSupportFragmentManager()
            java.lang.String r8 = "supportFragmentManager"
            kotlin.p483e0.p485d.Log_OC.loadImage(r7, r8)
            r0 = r25
            r6.<init>(r7, r0)
            r5.setAdapter(r6)
            r0 = r24
            g.x.a r2 = r0.getBinding()
            r9 = r2
            ai.kudi.agent.databinding.ActivityTransactionCommissionsBinding r9 = (ai.kudi.agent.databinding.ActivityTransactionCommissionsBinding) r9
            r3 = r9
            com.google.android.material.tabs.TabLayout r10 = r3.tabLayout
            r0 = r24
            g.x.a r2 = r0.getBinding()
            r11 = r2
            ai.kudi.agent.databinding.ActivityTransactionCommissionsBinding r11 = (ai.kudi.agent.databinding.ActivityTransactionCommissionsBinding) r11
            r3 = r11
            ai.kudi.dip.library.SafeViewPager r5 = r3.viewPager
            r10.setupWithViewPager(r5)
            r0 = r25
            java.util.Iterator r12 = r0.iterator()
            r13 = 0
        L43:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L90
            java.lang.Object r15 = r12.next()
            int r16 = r13 + 1
            if (r13 < 0) goto L83
            r18 = r15
            ai.kudi.agent.transactions.domain.dto.CommissionWallet r18 = (ai.kudi.agent.transactions.domain.dto.CommissionWallet) r18
            r17 = r18
            r0 = r24
            g.x.a r2 = r0.getBinding()
            r19 = r2
            ai.kudi.agent.databinding.ActivityTransactionCommissionsBinding r19 = (ai.kudi.agent.databinding.ActivityTransactionCommissionsBinding) r19
            r3 = r19
            com.google.android.material.tabs.TabLayout r10 = r3.tabLayout
            com.google.android.material.tabs.TabLayout$g r20 = r10.m26538x(r13)
            if (r20 != 0) goto L6c
            goto L80
        L6c:
            r0 = r17
            java.lang.String r21 = r0.getLabel()
            r22 = r21
            if (r21 == 0) goto L77
            goto L79
        L77:
            java.lang.String r22 = ""
        L79:
            r0 = r20
            r1 = r22
            r0.m26505u(r1)
        L80:
            r13 = r16
            goto L43
        L83:
            kotlin.p557z.C13722p.m3923n()
            java.lang.NullPointerException r23 = new java.lang.NullPointerException
            java.lang.String r8 = "Null throw statement replaced by Soot"
            r0 = r23
            r0.<init>(r8)
            throw r23
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.transactioncommissions.p030ui.TransactionCommissionsActivity.setUpPager(java.util.List):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setupCommissionHistories() {
        List $r1 = this.wallets;
        int $i0 = $r1.size();
        if ($i0 >= 2) {
            List $r12 = this.wallets;
            setUpPager($r12);
            return;
        }
        List $r13 = this.wallets;
        boolean $z0 = $r13.isEmpty();
        if (!$z0) {
            TransactionCommissionsFragment.Companion $r2 = TransactionCommissionsFragment.Companion;
            List $r14 = this.wallets;
            Object $r3 = C13722p.m3954R($r14);
            CommissionWallet $r4 = (CommissionWallet) $r3;
            TransactionCommissionsFragment $r5 = $r2.newInstance($r4);
            AppCompatActivityExtKt.startFragment$default(this, $r5, C0001R.C0003id.screen_content, false, false, false, 8, null);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        TransactionCommissionsActivityViewState $r2 = (TransactionCommissionsActivityViewState) viewData;
        applyViewData($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void applyViewData(TransactionCommissionsActivityViewState transactionCommissionsActivityViewState) {
        Log_OC.getArray(transactionCommissionsActivityViewState, "viewData");
        boolean $z0 = transactionCommissionsActivityViewState.isLoading();
        if ($z0) {
            InterfaceC8209a $r2 = getBinding();
            ActivityTransactionCommissionsBinding $r3 = (ActivityTransactionCommissionsBinding) $r2;
            View $r4 = $r3.fullScreenLoader;
            Log_OC.loadImage($r4, "binding.fullScreenLoader");
            View r5 = $r4;
            ViewExtKt.show(r5);
            return;
        }
        InterfaceC8209a $r22 = getBinding();
        ActivityTransactionCommissionsBinding $r32 = (ActivityTransactionCommissionsBinding) $r22;
        View $r42 = $r32.fullScreenLoader;
        Log_OC.loadImage($r42, "binding.fullScreenLoader");
        View r52 = $r42;
        ViewExtKt.hide$default(r52, false, 1, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        TransactionCommissionsActivityViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public TransactionCommissionsActivityViewModel createViewModel() {
        TransactionCommissionsActivityViewModel $r1 = getViewModel();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public ActivityTransactionCommissionsBinding getActivityBinding() {
        LayoutInflater $r1 = getLayoutInflater();
        ActivityTransactionCommissionsBinding $r2 = ActivityTransactionCommissionsBinding.inflate($r1);
        Log_OC.loadImage($r2, "inflate(layoutInflater)");
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public /* bridge */ /* synthetic */ InterfaceC8209a getActivityBinding() {
        ActivityTransactionCommissionsBinding $r1 = getActivityBinding();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final TransactionCommissionsSubComponent getActivitySubComponent() {
        TransactionCommissionsSubComponent $r1 = this.activitySubComponent;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("activitySubComponent");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SharedPreferences getPreferences() {
        SharedPreferences $r1 = this.preferences;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("preferences");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    protected Class getVMType() {
        return TransactionCommissionsActivityViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public final TransactionCommissionsActivityViewModel getViewModel() {
        TransactionCommissionsActivityViewModel $r1 = this.viewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("viewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    public void onBackPressed() {
        setMenuVisibility(true);
        super.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public void onCreate(Bundle bundle) {
        Application $r2 = getApplication();
        if ($r2 == null) {
            NullPointerException $r12 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.BaseApplication");
            throw $r12;
        }
        BaseApplication $r3 = (BaseApplication) $r2;
        ApplicationComponent $r4 = $r3.getApplicationComponent();
        TransactionCommissionsSubComponent.Factory $r5 = $r4.transactionCommissionsSubComponent();
        TransactionCommissionsSubComponent $r6 = $r5.create(this);
        setActivitySubComponent($r6);
        TransactionCommissionsSubComponent $r62 = getActivitySubComponent();
        $r62.inject(this);
        super.onCreate(bundle);
        InterfaceC8209a $r7 = getBinding();
        ActivityTransactionCommissionsBinding $r8 = (ActivityTransactionCommissionsBinding) $r7;
        Toolbar $r9 = $r8.toolbar;
        setSupportActionBar($r9);
        AbstractC0925a $r10 = getSupportActionBar();
        if ($r10 != null) {
            $r10.mo37602u(true);
        }
        observeViewModel();
        TransactionCommissionsActivityViewModel $r11 = getViewModel();
        $r11.onViewCreate();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater $r2 = getMenuInflater();
        $r2.inflate(C0001R.C0005menu.menu_transaction_commissions, menu);
        boolean $z0 = super.onCreateOptionsMenu(menu);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMActivity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Log_OC.getArray(menuItem, "item");
        int $i0 = menuItem.getItemId();
        if ($i0 == 16908332) {
            onBackPressed();
            return true;
        }
        int $i02 = menuItem.getItemId();
        if ($i02 == C0001R.C0003id.action_transaction_menu_options) {
            renderOptionsBottomSheet();
            TransactionCommissionsActivityViewModel $r2 = getViewModel();
            $r2.onMoreOptionsAction();
        }
        boolean $z0 = super.onOptionsItemSelected(menuItem);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    protected void onRestoreInstanceState(Bundle bundle) {
        Object $r3;
        Log_OC.getArray(bundle, "savedInstanceState");
        super.onRestoreInstanceState(bundle);
        Parcelable[] $r2 = bundle.getParcelableArray(BUNDLE_KEY_COMMISSION_WALLETS);
        if ($r2 == null) {
            $r3 = null;
        } else {
            int $i0 = $r2.length;
            List r9 = new ArrayList($i0);
            for (Parcelable $r5 : $r2) {
                if ($r5 == null) {
                    NullPointerException r10 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.transactions.domain.dto.CommissionWallet");
                    throw r10;
                }
                CommissionWallet $r6 = (CommissionWallet) $r5;
                r9.add($r6);
            }
            $r3 = r9;
        }
        if ($r3 == null) {
            $r3 = C13726r.m3891e();
        }
        List $r8 = (List) $r3;
        this.wallets = $r8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void onSaveInstanceState(Bundle bundle, PersistableBundle persistableBundle) {
        Log_OC.getArray(bundle, "outState");
        Log_OC.getArray(persistableBundle, "outPersistentState");
        List $r4 = this.wallets;
        CommissionWallet[] $r5 = new CommissionWallet[0];
        Object[] $r1 = $r4.toArray($r5);
        if ($r1 == null) {
            NullPointerException $r7 = new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            throw $r7;
        }
        Parcelable[] $r6 = (Parcelable[]) $r1;
        bundle.putParcelableArray(BUNDLE_KEY_COMMISSION_WALLETS, $r6);
        super.onSaveInstanceState(bundle, persistableBundle);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.transactioncommissions.navigator.TransactionCommissionsNavigator
    public void onTransactionCommissionDetails(TransactionItemUiModel.Transaction transaction) {
        Log_OC.getArray(transaction, "transaction");
        Intent $r3 = new Intent(this, TransactionDetailsActivity.class);
        String $r1 = transaction.getId();
        $r3.putExtra("transaction_details_extra_reference", $r1);
        startActivity($r3);
    }

    public final void setActivitySubComponent(TransactionCommissionsSubComponent transactionCommissionsSubComponent) {
        Log_OC.getArray(transactionCommissionsSubComponent, "<set-?>");
        this.activitySubComponent = transactionCommissionsSubComponent;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void setMenuVisibility(boolean z) {
        InterfaceC8209a $r1 = getBinding();
        ActivityTransactionCommissionsBinding $r2 = (ActivityTransactionCommissionsBinding) $r1;
        Toolbar $r3 = $r2.toolbar;
        Menu $r4 = $r3.getMenu();
        MenuItem $r5 = $r4 == null ? null : $r4.findItem(C0001R.C0003id.action_transaction_menu_options);
        if ($r5 == null) {
            return;
        }
        $r5.setVisible(z);
    }

    public final void setPreferences(SharedPreferences sharedPreferences) {
        Log_OC.getArray(sharedPreferences, "<set-?>");
        this.preferences = sharedPreferences;
    }

    public final void setViewModel(TransactionCommissionsActivityViewModel transactionCommissionsActivityViewModel) {
        Log_OC.getArray(transactionCommissionsActivityViewModel, "<set-?>");
        this.viewModel = transactionCommissionsActivityViewModel;
    }
}
