package ai.kudi.agent.transactionhistory.p031ui.view;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment;
import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.databinding.FragmentTransactionContainerBinding;
import ai.kudi.agent.home.HomeActivity;
import ai.kudi.agent.login.domain.LoginParams;
import ai.kudi.agent.outlet_mgt.activities.OutletMgtActivity;
import ai.kudi.agent.outlet_mgt.data.Outlet;
import ai.kudi.agent.outlet_mgt.game.components.OutletMgtSubComponent;
import ai.kudi.agent.transactionhistory.data.model.TransactionHistoryScope;
import ai.kudi.agent.transactionhistory.p031ui.adapter.TransactionsViewPagerAdapter;
import ai.kudi.agent.transactionhistory.p031ui.bottomsheet.TransactionsOptionMenuBottomSheet;
import ai.kudi.agent.transactionhistory.presentation.TransactionsViewModel;
import ai.kudi.agent.transactionhistory.presentation.viewstate.TransactionsViewState;
import ai.kudi.agent.transfer.p034ui.TransferActivity;
import ai.kudi.agent.transfer.p034ui.TransferToBankFragment;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.DialogC0964i;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1565i;
import androidx.lifecycle.PreferenceActivity;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.C4752c;
import com.google.android.material.tabs.TabLayout;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.Registry;
import dagger.android.d;
import dagger.android.p197e.C7429a;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: TransactionsContainerFragment.kt */
@Metadata(m10422d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 :2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001:B\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0003H\u0014J\b\u0010\"\u001a\u00020\u0002H\u0014J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020$H\u0014J\u0010\u0010%\u001a\u00020 2\u0006\u0010&\u001a\u00020'H\u0016J\u0012\u0010(\u001a\u00020 2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0018\u0010+\u001a\u00020 2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0016J$\u00100\u001a\u0002012\u0006\u0010.\u001a\u0002022\b\u00103\u001a\u0004\u0018\u0001042\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u00105\u001a\u00020 H\u0016J\u001a\u00106\u001a\u00020 2\u0006\u00107\u001a\u0002012\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u00108\u001a\u00020 H\u0002J\b\u00109\u001a\u00020 H\u0002R$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006;"}, m10421d2 = {"Lai/kudi/agent/transactionhistory/ui/view/TransactionsContainerFragment;", "Lai/kudi/agent/core/mvvm/BaseMVVMViewBindingFragment;", "Lai/kudi/agent/transactionhistory/presentation/TransactionsViewModel;", "Lai/kudi/agent/transactionhistory/presentation/viewstate/TransactionsViewState;", "Lai/kudi/agent/databinding/FragmentTransactionContainerBinding;", "Ldagger/android/HasAndroidInjector;", "()V", "androidInjector", "Ldagger/android/DispatchingAndroidInjector;", "", "getAndroidInjector", "()Ldagger/android/DispatchingAndroidInjector;", "setAndroidInjector", "(Ldagger/android/DispatchingAndroidInjector;)V", "bottomSheet", "Lai/kudi/agent/transactionhistory/ui/bottomsheet/TransactionsOptionMenuBottomSheet;", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences$annotations", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "setSharedPreferences", "(Landroid/content/SharedPreferences;)V", "transactionHistoryScope", "Lai/kudi/agent/transactionhistory/data/model/TransactionHistoryScope;", "viewModel", "getViewModel", "()Lai/kudi/agent/transactionhistory/presentation/TransactionsViewModel;", "setViewModel", "(Lai/kudi/agent/transactionhistory/presentation/TransactionsViewModel;)V", "Ldagger/android/AndroidInjector;", "applyViewData", "", "viewData", "createViewModel", "getVMType", "Ljava/lang/Class;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onViewCreated", "view", "setTitleIfScopeIsOutletScope", "showOptionsBottomSheet", "Companion", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.transactionhistory.ui.view.TransactionsContainerFragment */
/* loaded from: classes.dex */
public final class TransactionsContainerFragment extends BaseMVVMViewBindingFragment<TransactionsViewModel, TransactionsViewState, FragmentTransactionContainerBinding> implements d {
    public static final String BUNDLE_KEY_HISTORY_SCOPE = "BUNDLE_KEY_REQUEST_TYPE";
    public static final Companion Companion;
    public DispatchingAndroidInjector<Object> androidInjector;
    private TransactionsOptionMenuBottomSheet bottomSheet;
    public SharedPreferences sharedPreferences;
    private TransactionHistoryScope transactionHistoryScope;
    public TransactionsViewModel viewModel;

    /* compiled from: TransactionsContainerFragment.kt */
    @Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/transactionhistory/ui/view/TransactionsContainerFragment$Companion;", "", "()V", "BUNDLE_KEY_HISTORY_SCOPE", "", "newInstance", "Lai/kudi/agent/transactionhistory/ui/view/TransactionsContainerFragment;", "transactionHistoryScope", "Lai/kudi/agent/transactionhistory/data/model/TransactionHistoryScope;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.transactionhistory.ui.view.TransactionsContainerFragment$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public static /* synthetic */ TransactionsContainerFragment newInstance$default(Companion companion, TransactionHistoryScope $r3, int i, Object obj) {
            int $i0 = i & 1;
            if ($i0 != 0) {
                $r3 = TransactionHistoryScope.AllTransactions.INSTANCE;
            }
            TransactionsContainerFragment $r1 = companion.newInstance($r3);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        public final TransactionsContainerFragment newInstance(TransactionHistoryScope transactionHistoryScope) {
            Log_OC.getArray(transactionHistoryScope, "transactionHistoryScope");
            Bundle $r3 = new Bundle();
            TransactionsContainerFragment $r2 = new TransactionsContainerFragment();
            $r3.putParcelable(TransactionsContainerFragment.BUNDLE_KEY_HISTORY_SCOPE, transactionHistoryScope);
            $r2.setArguments($r3);
            return $r2;
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
    public TransactionsContainerFragment() {
        TransactionHistoryScope.AllTransactions $r1 = TransactionHistoryScope.AllTransactions.INSTANCE;
        this.transactionHistoryScope = $r1;
    }

    public static /* synthetic */ void getSharedPreferences$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreateOptionsMenu$lambda-3  reason: not valid java name */
    public static final void m41080onCreateOptionsMenu$lambda3(TransactionsContainerFragment transactionsContainerFragment, View view) {
        Log_OC.getArray(transactionsContainerFragment, "this$0");
        transactionsContainerFragment.showOptionsBottomSheet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: onViewCreated$lambda-2$lambda-1  reason: not valid java name */
    public static final void m41081onViewCreated$lambda2$lambda1(String[] strArr, TabLayout.C4745g c4745g, int i) {
        Log_OC.getArray(strArr, "$titles");
        Log_OC.getArray(c4745g, "tab");
        String $r2 = strArr[i];
        c4745g.m26505u($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setTitleIfScopeIsOutletScope() {
        TransactionHistoryScope $r1 = this.transactionHistoryScope;
        boolean $z0 = $r1 instanceof TransactionHistoryScope.OutletTransactions;
        if ($z0) {
            TransactionHistoryScope.OutletTransactions $r2 = (TransactionHistoryScope.OutletTransactions) $r1;
            FragmentActivity $r3 = getActivity();
            boolean $z02 = $r3 instanceof OutletMgtActivity;
            OutletMgtActivity $r4 = $z02 ? (OutletMgtActivity) $r3 : null;
            if ($r4 == null) {
                return;
            }
            Outlet $r5 = $r2.getOutlet();
            String $r6 = $r5.getName();
            $r4.setTitle($r6);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void showOptionsBottomSheet() {
        TransactionsOptionMenuBottomSheet.OnActionListener onActionListener = new TransactionsOptionMenuBottomSheet.OnActionListener() { // from class: ai.kudi.agent.transactionhistory.ui.view.TransactionsContainerFragment$showOptionsBottomSheet$bottomSheetListener$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.transactionhistory.p031ui.bottomsheet.TransactionsOptionMenuBottomSheet.OnActionListener
            public void onEmailTransactionReport() {
                TransactionsContainerFragment $r2 = TransactionsContainerFragment.this;
                TransactionsViewModel $r1 = $r2.getViewModel();
                $r1.onOpenEmailTransactionReport();
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.transactionhistory.p031ui.bottomsheet.TransactionsOptionMenuBottomSheet.OnActionListener
            public void onManageOutlet() {
                TransactionsContainerFragment $r1 = TransactionsContainerFragment.this;
                TransactionHistoryScope $r2 = $r1.transactionHistoryScope;
                boolean $z0 = $r2 instanceof TransactionHistoryScope.OutletTransactions;
                if ($z0) {
                    TransactionsContainerFragment $r12 = TransactionsContainerFragment.this;
                    TransactionsViewModel $r3 = $r12.getViewModel();
                    TransactionsContainerFragment $r13 = TransactionsContainerFragment.this;
                    TransactionHistoryScope $r22 = $r13.transactionHistoryScope;
                    TransactionHistoryScope.OutletTransactions $r4 = (TransactionHistoryScope.OutletTransactions) $r22;
                    Outlet $r5 = $r4.getOutlet();
                    $r3.openOutletManagement($r5);
                }
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.transactionhistory.p031ui.bottomsheet.TransactionsOptionMenuBottomSheet.OnActionListener
            public void onPendingTransactions() {
                TransactionsContainerFragment $r1 = TransactionsContainerFragment.this;
                TransactionsViewModel $r2 = $r1.getViewModel();
                TransactionsContainerFragment $r12 = TransactionsContainerFragment.this;
                TransactionHistoryScope $r3 = $r12.transactionHistoryScope;
                $r2.onOpenIncompleteTransactions($r3);
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.transactionhistory.p031ui.bottomsheet.TransactionsOptionMenuBottomSheet.OnActionListener
            public void onRequestAccountStatement() {
                TransactionsContainerFragment $r2 = TransactionsContainerFragment.this;
                TransactionsViewModel $r1 = $r2.getViewModel();
                $r1.onOpenRequestStatement();
            }

            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // ai.kudi.agent.transactionhistory.p031ui.bottomsheet.TransactionsOptionMenuBottomSheet.OnActionListener
            public void onWalletCashout() {
                TransactionsContainerFragment $r2 = TransactionsContainerFragment.this;
                Context $r3 = $r2.getContext();
                Intent $r1 = new Intent($r3, TransferActivity.class);
                $r1.putExtra(TransferToBankFragment.KEY_IS_CASH_OUT, true);
                TransactionsContainerFragment $r22 = TransactionsContainerFragment.this;
                Context $r32 = $r22.requireContext();
                $r32.startActivity($r1);
            }
        };
        Context $r3 = requireContext();
        Log_OC.loadImage($r3, "requireContext()");
        TransactionHistoryScope $r4 = this.transactionHistoryScope;
        boolean $z0 = $r4 instanceof TransactionHistoryScope.OutletTransactions;
        SharedPreferences $r5 = getSharedPreferences();
        String $r6 = $r5.getString(LoginParams.EXTRA_CUSTOMER_TYPE, "AGENT");
        boolean $z1 = Log_OC.append($r6, "USER");
        TransactionsOptionMenuBottomSheet r9 = new TransactionsOptionMenuBottomSheet($r3, onActionListener, $z0, !$z1);
        TransactionsOptionMenuBottomSheet r10 = r9;
        r10.show();
        C13666w c13666w = C13666w.f30112a;
        this.bottomSheet = r9;
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
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ void applyViewData(ViewData viewData) {
        TransactionsViewState $r2 = (TransactionsViewState) viewData;
        applyViewData($r2);
    }

    protected void applyViewData(TransactionsViewState transactionsViewState) {
        Log_OC.getArray(transactionsViewState, "viewData");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public /* bridge */ /* synthetic */ BaseViewModel createViewModel() {
        TransactionsViewModel $r1 = createViewModel();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public TransactionsViewModel createViewModel() {
        TransactionsViewModel $r1 = getViewModel();
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
    public final SharedPreferences getSharedPreferences() {
        SharedPreferences $r1 = this.sharedPreferences;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("sharedPreferences");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    protected Class getVMType() {
        return TransactionsViewModel.class;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseMVVMViewBindingFragment
    public final TransactionsViewModel getViewModel() {
        TransactionsViewModel $r1 = this.viewModel;
        if ($r1 != null) {
            return $r1;
        }
        Log_OC.LogError("viewModel");
        NullPointerException r2 = new NullPointerException("Null throw statement replaced by Soot");
        throw r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Log_OC.getArray(context, "context");
        FragmentActivity $r2 = getActivity();
        boolean $z0 = $r2 instanceof HomeActivity;
        if ($z0) {
            C7429a.m18752b(this);
        }
        super.onAttach(context);
        FragmentActivity $r22 = getActivity();
        boolean $z02 = $r22 instanceof OutletMgtActivity;
        if ($z02) {
            FragmentActivity $r23 = getActivity();
            if ($r23 == null) {
                NullPointerException $r5 = new NullPointerException("null cannot be cast to non-null type ai.kudi.agent.outlet_mgt.activities.OutletMgtActivity");
                throw $r5;
            }
            OutletMgtActivity $r3 = (OutletMgtActivity) $r23;
            OutletMgtSubComponent $r4 = $r3.getOutletMgtSubComponent();
            $r4.inject(this);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        Bundle $r1 = getArguments();
        if ($r1 == null) {
            return;
        }
        Parcelable $r2 = $r1.getParcelable(BUNDLE_KEY_HISTORY_SCOPE);
        TransactionHistoryScope $r3 = (TransactionHistoryScope) $r2;
        if ($r3 == null) {
            $r3 = TransactionHistoryScope.AllTransactions.INSTANCE;
        }
        this.transactionHistoryScope = $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        View $r4;
        Log_OC.getArray(menu, "menu");
        Log_OC.getArray(menuInflater, "inflater");
        menuInflater.inflate(C0001R.C0005menu.transaction_filter, menu);
        MenuItem $r3 = menu.findItem(C0001R.C0003id.action_notification);
        if ($r3 != null) {
            $r3.setVisible(false);
        }
        MenuItem $r32 = menu.findItem(C0001R.C0003id.action_transaction_menu_options);
        if ($r32 != null && ($r4 = $r32.getActionView()) != null) {
            $r4.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.agent.transactionhistory.ui.view.MainActivity$16
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TransactionsContainerFragment $r2 = TransactionsContainerFragment.this;
                    TransactionsContainerFragment.m41080onCreateOptionsMenu$lambda3($r2, view);
                }
            });
        }
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log_OC.getArray(layoutInflater, "inflater");
        FragmentTransactionContainerBinding $r4 = FragmentTransactionContainerBinding.inflate(layoutInflater, viewGroup, false);
        Log_OC.loadImage($r4, "inflate(inflater, container, false)");
        View $r5 = initBinding($r4, this);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        DialogC0964i $r1 = this.bottomSheet;
        if ($r1 != null) {
            DialogC0964i r2 = $r1;
            r2.dismiss();
        }
        super.onDestroy();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Log_OC.getArray(view, "view");
        super.onViewCreated(view, bundle);
        setTitleIfScopeIsOutletScope();
        InterfaceC8209a $r3 = requireBinding();
        FragmentTransactionContainerBinding $r4 = (FragmentTransactionContainerBinding) $r3;
        String $r6 = getString(C0001R.string.successful_transactions);
        String $r62 = getString(C0001R.string.unsuccessfull_transactions);
        final String[] $r5 = {$r6, $r62};
        FragmentManager $r8 = getChildFragmentManager();
        Log_OC.loadImage($r8, "childFragmentManager");
        PreferenceActivity $r9 = getViewLifecycleOwner();
        AbstractC1565i $r10 = $r9.getLifecycle();
        Log_OC.loadImage($r10, "viewLifecycleOwner.lifecycle");
        TransactionHistoryScope $r11 = this.transactionHistoryScope;
        TransactionsViewPagerAdapter $r7 = new TransactionsViewPagerAdapter($r8, $r10, $r11, $r5);
        ViewPager2 $r12 = $r4.transactionsViewPager;
        $r12.setAdapter($r7);
        TabLayout $r14 = $r4.transactionTabLayout;
        ViewPager2 $r122 = $r4.transactionsViewPager;
        C4752c $r13 = new C4752c($r14, $r122, new C4752c.InterfaceC4754b() { // from class: ai.kudi.agent.transactionhistory.ui.view.SearchResultsFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void onItemClick(TabLayout.C4745g c4745g, int i) {
                String[] $r2 = $r5;
                TransactionsContainerFragment.m41081onViewCreated$lambda2$lambda1($r2, c4745g, i);
            }
        });
        $r13.m26473a();
        ViewPager2 $r123 = $r4.transactionsViewPager;
        $r123.setUserInputEnabled(false);
    }

    public final void setAndroidInjector(DispatchingAndroidInjector dispatchingAndroidInjector) {
        Log_OC.getArray(dispatchingAndroidInjector, "<set-?>");
        this.androidInjector = dispatchingAndroidInjector;
    }

    public final void setSharedPreferences(SharedPreferences sharedPreferences) {
        Log_OC.getArray(sharedPreferences, "<set-?>");
        this.sharedPreferences = sharedPreferences;
    }

    public final void setViewModel(TransactionsViewModel transactionsViewModel) {
        Log_OC.getArray(transactionsViewModel, "<set-?>");
        this.viewModel = transactionsViewModel;
    }
}
