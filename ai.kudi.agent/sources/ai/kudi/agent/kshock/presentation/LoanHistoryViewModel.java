package ai.kudi.agent.kshock.presentation;

import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.feature_kshock.C0220R;
import ai.kudi.agent.kshock.data.model.Loan;
import ai.kudi.agent.kshock.navigator.KShockNavigator;
import ai.kudi.agent.kshock.p009ui.views.KshockOverdueLoansDetailFragment;
import ai.kudi.agent.kshock.presentation.viewdata.LoanHistoryViewData;
import ai.kudi.agent.kshock.usecases.FetchPaginatedLoanHistory;
import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import android.app.Application;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C13218k;
import kotlin.InterfaceC11824h;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
import p201g.p259r.C8013r0;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.InterfaceC11692s;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.Object;
/* compiled from: LoanHistoryViewModel.kt */
@Metadata(m10422d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ*\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u00142\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000eJ\b\u0010\u0018\u001a\u00020\u0019H\u0016J.\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u0015\u001a\u00020\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u0016\u001a\u00020\u000e2\b\b\u0002\u0010\u0017\u001a\u00020\u000eJ\u000e\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R'\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010¨\u0006!"}, m10421d2 = {"Lai/kudi/agent/kshock/presentation/LoanHistoryViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/kshock/presentation/viewdata/LoanHistoryViewData;", "app", "Landroid/app/Application;", "fetchPaginatedLoanHistory", "Lai/kudi/agent/kshock/usecases/FetchPaginatedLoanHistory;", "fetchCurrentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "kShockNavigator", "Lai/kudi/agent/kshock/navigator/KShockNavigator;", "(Landroid/app/Application;Lai/kudi/agent/kshock/usecases/FetchPaginatedLoanHistory;Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/kshock/navigator/KShockNavigator;)V", "loanStatusFilterMap", "", "", "getLoanStatusFilterMap", "()Ljava/util/Map;", "loanStatusFilterMap$delegate", "Lkotlin/Lazy;", "getQueryParams", "", TransactionField.STATUS, "from", "to", "initialData", "Lai/kudi/agent/kshock/presentation/viewdata/LoanHistoryViewData$InitialState;", "loadLoanHistory", "", "page", "", "navigateToLoanStatus", KshockOverdueLoansDetailFragment.KEY_LOAN, "Lai/kudi/agent/kshock/data/model/Loan;", "feature-kshock_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class LoanHistoryViewModel extends BaseViewModel<LoanHistoryViewData> {
    private final FetchCurrentUser fetchCurrentUser;
    private final FetchPaginatedLoanHistory fetchPaginatedLoanHistory;
    private final KShockNavigator kShockNavigator;
    private final InterfaceC11824h loanStatusFilterMap$delegate;
    private final Application mContext;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public LoanHistoryViewModel(Application application, FetchPaginatedLoanHistory fetchPaginatedLoanHistory, FetchCurrentUser fetchCurrentUser, KShockNavigator kShockNavigator) {
        InterfaceC11824h $r4;
        Log_OC.getArray(application, "app");
        Log_OC.getArray(fetchPaginatedLoanHistory, "fetchPaginatedLoanHistory");
        Log_OC.getArray(fetchCurrentUser, "fetchCurrentUser");
        Log_OC.getArray(kShockNavigator, "kShockNavigator");
        this.mContext = application;
        this.fetchPaginatedLoanHistory = fetchPaginatedLoanHistory;
        this.fetchCurrentUser = fetchCurrentUser;
        this.kShockNavigator = kShockNavigator;
        LoanHistoryViewModel$loanStatusFilterMap$2 $r6 = new LoanHistoryViewModel$loanStatusFilterMap$2(this);
        $r4 = C13218k.m5625b($r6);
        this.loanStatusFilterMap$delegate = $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void loadLoanHistory$default(LoanHistoryViewModel loanHistoryViewModel, String $r1, int $i0, String $r2, String $r3, int i, Object obj) {
        int $i2 = i & 1;
        if ($i2 != 0) {
            $r1 = "";
        }
        int $i22 = i & 2;
        if ($i22 != 0) {
            $i0 = 0;
        }
        int $i23 = i & 4;
        if ($i23 != 0) {
            $r2 = "";
        }
        int $i1 = i & 8;
        if ($i1 != 0) {
            $r3 = "";
        }
        loanHistoryViewModel.loadLoanHistory($r1, $i0, $r2, $r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: loadLoanHistory$lambda-0  reason: not valid java name */
    public static final InterfaceC11692s m39613loadLoanHistory$lambda0(LoanHistoryViewModel loanHistoryViewModel, Map map, User user) {
        Log_OC.getArray(loanHistoryViewModel, "this$0");
        Log_OC.getArray(map, "$query");
        Log_OC.getArray(user, "it");
        FetchPaginatedLoanHistory $r3 = loanHistoryViewModel.fetchPaginatedLoanHistory;
        String $r4 = user.getSessionId();
        Log_OC.loadImage($r4, "it.sessionId");
        AbstractC11688p $r5 = $r3.execute($r4, map);
        return $r5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: loadLoanHistory$lambda-2  reason: not valid java name */
    public static final void m39614loadLoanHistory$lambda2(LoanHistoryViewModel loanHistoryViewModel, int i, C8013r0 c8013r0) {
        Log_OC.getArray(loanHistoryViewModel, "this$0");
        if (c8013r0 == null) {
            return;
        }
        LoanHistoryViewData.Data $r2 = new LoanHistoryViewData.Data(c8013r0, i);
        loanHistoryViewModel.publish($r2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: loadLoanHistory$lambda-3  reason: not valid java name */
    public static final void m39615loadLoanHistory$lambda3(LoanHistoryViewModel loanHistoryViewModel, Throwable th) {
        Log_OC.getArray(loanHistoryViewModel, "this$0");
        InterfaceC11767l $r3 = KudiErrorParserKt.parseHttpError2$default("Couldn't load loan history", null, 2, null);
        Log_OC.loadImage(th, "it");
        Object $r4 = $r3.invoke(th);
        String $r5 = (String) $r4;
        LoanHistoryViewData.Error $r2 = new LoanHistoryViewData.Error($r5);
        loanHistoryViewModel.publish($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Map getLoanStatusFilterMap() {
        InterfaceC11824h $r2 = this.loanStatusFilterMap$delegate;
        Object $r1 = $r2.getValue();
        Map $r3 = (Map) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Map getQueryParams(String str, String str2, String str3) {
        boolean $z0;
        boolean $z02;
        boolean $z03;
        Log_OC.getArray(str, TransactionField.STATUS);
        Log_OC.getArray(str2, "from");
        Log_OC.getArray(str3, "to");
        LinkedHashMap $r4 = new LinkedHashMap();
        $z0 = C13276s.m5440u(str);
        if (!$z0) {
            Application $r5 = this.mContext;
            int $i0 = C0220R.string.statuses;
            String $r6 = $r5.getString($i0);
            Log_OC.loadImage($r6, "app.getString(R.string.statuses)");
            $r4.put($r6, str);
        }
        $z02 = C13276s.m5440u(str2);
        if (!$z02) {
            Application $r52 = this.mContext;
            int $i02 = C0220R.string.from;
            String $r2 = $r52.getString($i02);
            Log_OC.loadImage($r2, "app.getString(R.string.from)");
            $r4.put($r2, str2);
        }
        $z03 = C13276s.m5440u(str3);
        if (!$z03) {
            Application $r53 = this.mContext;
            int $i03 = C0220R.string.enable_protection;
            String $r22 = $r53.getString($i03);
            Log_OC.loadImage($r22, "app.getString(R.string.to)");
            $r4.put($r22, str3);
        }
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        LoanHistoryViewData.InitialState $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public LoanHistoryViewData.InitialState initialData() {
        LoanHistoryViewData.InitialState r1 = LoanHistoryViewData.InitialState.INSTANCE;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void loadLoanHistory(String str, final int i, String str2, String str3) {
        Log_OC.getArray(str, TransactionField.STATUS);
        Log_OC.getArray(str2, "from");
        Log_OC.getArray(str3, "to");
        LoanHistoryViewData.Loading $r4 = LoanHistoryViewData.Loading.INSTANCE;
        publish($r4);
        final Map $r5 = getQueryParams(str, str2, str3);
        FetchCurrentUser $r6 = this.fetchCurrentUser;
        AbstractC11696w $r7 = FetchCurrentUser.execute$default($r6, null, null, 3, null);
        AbstractC11688p $r9 = $r7.m10440j(new InterfaceC11291f() { // from class: ai.kudi.agent.kshock.presentation.AnnotationWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.InterfaceC11291f
            /* renamed from: a */
            public final Object mo10663a(Object obj) {
                LoanHistoryViewModel $r1 = LoanHistoryViewModel.this;
                Map $r2 = $r5;
                User $r52 = (User) obj;
                InterfaceC11692s $r3 = LoanHistoryViewModel.m39613loadLoanHistory$lambda0($r1, $r2, $r52);
                return $r3;
            }
        });
        FavoritesArrayAdapter $r12 = $r9.e0(new Object() { // from class: ai.kudi.agent.kshock.presentation.ClassWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                LoanHistoryViewModel $r1 = LoanHistoryViewModel.this;
                int $i0 = i;
                C8013r0 $r3 = (C8013r0) obj;
                LoanHistoryViewModel.m39614loadLoanHistory$lambda2($r1, $i0, $r3);
            }
        }, new Object() { // from class: ai.kudi.agent.kshock.presentation.OfflineMessageManager$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                LoanHistoryViewModel $r1 = LoanHistoryViewModel.this;
                Throwable $r3 = (Throwable) obj;
                LoanHistoryViewModel.m39615loadLoanHistory$lambda3($r1, $r3);
            }
        });
        C11280b $r13 = getCompositeDisposable();
        $r13.b($r12);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void navigateToLoanStatus(Loan loan) {
        Log_OC.getArray(loan, KshockOverdueLoansDetailFragment.KEY_LOAN);
        KShockNavigator $r2 = this.kShockNavigator;
        $r2.toLoanStatusFragment(loan);
    }
}
