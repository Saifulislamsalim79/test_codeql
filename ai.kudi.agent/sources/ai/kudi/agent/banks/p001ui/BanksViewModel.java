package ai.kudi.agent.banks.p001ui;

import ai.kudi.agent.banks.p001ui.BanksViewData;
import ai.kudi.agent.banks.useCases.FetchBanks;
import ai.kudi.agent.core.domain.room_entities.Bank;
import androidx.lifecycle.Extension;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
import p425j.p444e.p471k0.C11680b;
/* compiled from: BanksViewModel.kt */
@Metadata(m10422d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0002\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0014R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m10421d2 = {"Lai/kudi/agent/banks/ui/BanksViewModel;", "Landroidx/lifecycle/ViewModel;", "fetchBanks", "Lai/kudi/agent/banks/useCases/FetchBanks;", "(Lai/kudi/agent/banks/useCases/FetchBanks;)V", "banksViewData", "Lio/reactivex/subjects/PublishSubject;", "Lai/kudi/agent/banks/ui/BanksViewData;", "getBanksViewData", "()Lio/reactivex/subjects/PublishSubject;", "setBanksViewData", "(Lio/reactivex/subjects/PublishSubject;)V", "disposable", "Lio/reactivex/disposables/Disposable;", "", "onCleared", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.banks.ui.BanksViewModel */
/* loaded from: classes.dex */
public final class BanksViewModel extends Extension {
    private C11680b<BanksViewData> banksViewData;
    private FavoritesArrayAdapter disposable;
    private final FetchBanks fetchBanks;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public BanksViewModel(FetchBanks fetchBanks) {
        Log_OC.getArray(fetchBanks, "fetchBanks");
        this.fetchBanks = fetchBanks;
        C11680b $r1 = C11680b.m10564v0();
        this.banksViewData = $r1;
        fetchBanks();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void fetchBanks() {
        C11680b $r2 = this.banksViewData;
        if ($r2 != null) {
            BanksViewData.IsLoading $r3 = BanksViewData.IsLoading.INSTANCE;
            $r2.mo331f($r3);
        }
        FetchBanks $r4 = this.fetchBanks;
        AbstractC11688p $r5 = $r4.execute();
        FavoritesArrayAdapter $r7 = $r5.e0(new Object() { // from class: ai.kudi.agent.banks.ui.Label
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                BanksViewModel $r1 = BanksViewModel.this;
                List $r32 = (List) obj;
                BanksViewModel.m39011fetchBanks$lambda0($r1, $r32);
            }
        }, new Object() { // from class: ai.kudi.agent.banks.ui.MultiDexExtractor$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                BanksViewModel $r1 = BanksViewModel.this;
                Throwable $r32 = (Throwable) obj;
                BanksViewModel.m39012fetchBanks$lambda1($r1, $r32);
            }
        });
        this.disposable = $r7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchBanks$lambda-0  reason: not valid java name */
    public static final void m39011fetchBanks$lambda0(BanksViewModel banksViewModel, List list) {
        Log_OC.getArray(banksViewModel, "this$0");
        C11680b $r1 = banksViewModel.getBanksViewData();
        if ($r1 == null) {
            return;
        }
        Log_OC.loadImage(list, "it");
        BanksViewData.Banks $r3 = new BanksViewData.Banks(list);
        $r1.mo331f($r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchBanks$lambda-1  reason: not valid java name */
    public static final void m39012fetchBanks$lambda1(BanksViewModel banksViewModel, Throwable th) {
        Log_OC.getArray(banksViewModel, "this$0");
        C11680b $r2 = banksViewModel.getBanksViewData();
        if ($r2 != null) {
            Bank.BanksList $r4 = new Bank.BanksList();
            List $r5 = $r4.getListOfBanks();
            BanksViewData.Banks $r3 = new BanksViewData.Banks($r5);
            $r2.mo331f($r3);
        }
        th.printStackTrace();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C11680b getBanksViewData() {
        C11680b r1 = this.banksViewData;
        return r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // androidx.lifecycle.Extension
    public void onCleared() {
        super.onCleared();
        FavoritesArrayAdapter $r1 = this.disposable;
        if ($r1 == null) {
            return;
        }
        $r1.backup();
    }

    public final void setBanksViewData(C11680b c11680b) {
        this.banksViewData = c11680b;
    }
}
