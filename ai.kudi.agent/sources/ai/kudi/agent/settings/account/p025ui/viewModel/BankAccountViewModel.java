package ai.kudi.agent.settings.account.p025ui.viewModel;

import ai.kudi.agent.core.mvvm.BaseViewModel;
import ai.kudi.agent.core.mvvm.RxExtKt;
import ai.kudi.agent.core.mvvm.ViewData;
import ai.kudi.agent.settings.account.p025ui.data.BankAccountViewData;
import ai.kudi.agent.settings.domain.repositories.AccountRepository;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.users.domain.usecases.FetchCurrentUser;
import io.intercom.android.sdk.views.holder.AttributeType;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
import p425j.p444e.AbstractC11696w;
import p425j.p444e.p448c0.C11280b;
import p425j.p444e.p448c0.FavoritesArrayAdapter;
import p425j.p444e.p450e0.Object;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: BankAccountViewModel.kt */
@Metadata(m10422d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0006\u0010\b\u001a\u00020\tJ\b\u0010\n\u001a\u00020\u0002H\u0016J\u0016\u0010\u000b\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002J\u0010\u0010\u000f\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0012\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m10421d2 = {"Lai/kudi/agent/settings/account/ui/viewModel/BankAccountViewModel;", "Lai/kudi/agent/core/mvvm/BaseViewModel;", "Lai/kudi/agent/settings/account/ui/data/BankAccountViewData;", "currentUser", "Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;", "accountRepository", "Lai/kudi/agent/settings/domain/repositories/AccountRepository;", "(Lai/kudi/agent/users/domain/usecases/FetchCurrentUser;Lai/kudi/agent/settings/domain/repositories/AccountRepository;)V", "fetchUserBankAccount", "", "initialData", "showBankAccounts", AttributeType.LIST, "", "Lai/kudi/agent/core/domain/room_entities/BankAccount;", "showError", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "", "toggleLoader", "show", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.account.ui.viewModel.BankAccountViewModel */
/* loaded from: classes.dex */
public final class BankAccountViewModel extends BaseViewModel<BankAccountViewData> {
    private final AccountRepository accountRepository;
    private final FetchCurrentUser currentUser;

    public BankAccountViewModel(FetchCurrentUser fetchCurrentUser, AccountRepository accountRepository) {
        Log_OC.getArray(fetchCurrentUser, "currentUser");
        Log_OC.getArray(accountRepository, "accountRepository");
        this.currentUser = fetchCurrentUser;
        this.accountRepository = accountRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: fetchUserBankAccount$lambda-2  reason: not valid java name */
    public static final void m40710fetchUserBankAccount$lambda2(BankAccountViewModel bankAccountViewModel, User user) {
        Log_OC.getArray(bankAccountViewModel, "this$0");
        AccountRepository $r3 = bankAccountViewModel.accountRepository;
        String $r1 = user.getSessionId();
        Log_OC.loadImage($r1, "it.sessionId");
        BankAccountViewModel$fetchUserBankAccount$1$1 $r4 = new BankAccountViewModel$fetchUserBankAccount$1$1(bankAccountViewModel);
        $r3.fetchAccounts($r1, $r4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fetchUserBankAccount$lambda-3  reason: not valid java name */
    public static final void m40711fetchUserBankAccount$lambda3(BankAccountViewModel bankAccountViewModel, Throwable th) {
        Log_OC.getArray(bankAccountViewModel, "this$0");
        bankAccountViewModel.showError("Failed to fetch bank account. Please try again");
        th.printStackTrace();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:10:0x0042 */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0019 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void showBankAccounts(java.util.List r17) {
        /*
            r16 = this;
            r0 = r16
            ai.kudi.agent.core.mvvm.ViewData r1 = r0.getState()
            r3 = r1
            ai.kudi.agent.settings.account.ui.data.BankAccountViewData r3 = (ai.kudi.agent.settings.account.p025ui.data.BankAccountViewData) r3
            r2 = r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0 = r17
            java.util.Iterator r5 = r0.iterator()
        L15:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L33
            java.lang.Object r7 = r5.next()
            r9 = r7
            ai.kudi.agent.core.domain.room_entities.BankAccount r9 = (ai.kudi.agent.core.domain.room_entities.BankAccount) r9
            r8 = r9
            java.lang.String r10 = r8.getAccountPurpose()
            java.lang.String r11 = "CASH_OUT"
            boolean r6 = kotlin.p483e0.p485d.Log_OC.append(r10, r11)
            if (r6 == 0) goto L15
            r4.add(r7)
            goto L15
        L33:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r0 = r17
            java.util.Iterator r5 = r0.iterator()
        L3e:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L5c
            java.lang.Object r7 = r5.next()
            r13 = r7
            ai.kudi.agent.core.domain.room_entities.BankAccount r13 = (ai.kudi.agent.core.domain.room_entities.BankAccount) r13
            r8 = r13
            java.lang.String r10 = r8.getAccountPurpose()
            java.lang.String r11 = "WALLET_FUNDING"
            boolean r6 = kotlin.p483e0.p485d.Log_OC.append(r10, r11)
            if (r6 == 0) goto L3e
            r12.add(r7)
            goto L3e
        L5c:
            r14 = 0
            r15 = 0
            ai.kudi.agent.settings.account.ui.data.BankAccountViewData r2 = r2.copy(r14, r15, r4, r12)
            r0 = r16
            r0.publish(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.settings.account.p025ui.viewModel.BankAccountViewModel.showBankAccounts(java.util.List):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void toggleLoader(boolean z) {
        ViewData $r1 = getState();
        BankAccountViewData $r2 = (BankAccountViewData) $r1;
        publish(BankAccountViewData.copy$default($r2, z, null, null, null, 12, null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void toggleLoader$default(BankAccountViewModel bankAccountViewModel, boolean $z0, int i, Object obj) {
        int $i0 = i & 1;
        if ($i0 != 0) {
            $z0 = false;
        }
        bankAccountViewModel.toggleLoader($z0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void fetchUserBankAccount() {
        toggleLoader(true);
        FetchCurrentUser $r1 = this.currentUser;
        AbstractC11696w $r2 = FetchCurrentUser.execute$default($r1, null, null, 3, null);
        FavoritesArrayAdapter $r5 = $r2.s(new Object() { // from class: ai.kudi.agent.settings.account.ui.viewModel.MultiDexExtractor$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                BankAccountViewModel $r12 = BankAccountViewModel.this;
                User $r3 = (User) obj;
                BankAccountViewModel.m40710fetchUserBankAccount$lambda2($r12, $r3);
            }
        }, new Object() { // from class: ai.kudi.agent.settings.account.ui.viewModel.RxRingBuffer
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p425j.p444e.p450e0.Object
            public final void accept(Object obj) {
                BankAccountViewModel $r12 = BankAccountViewModel.this;
                Throwable $r3 = (Throwable) obj;
                BankAccountViewModel.m40711fetchUserBankAccount$lambda3($r12, $r3);
            }
        });
        Log_OC.loadImage($r5, "currentUser.execute().subscribe({\n\n            accountRepository.fetchAccounts(it.sessionId) { result ->\n\n                toggleLoader()\n\n                when (result) {\n\n                    is Throwable -> {\n                        showError(\"Failed to fetch bank account. Please try again\")\n                    }\n\n                    is List<*> -> {\n                        showBankAccounts(result as List<BankAccount>)\n                    }\n\n                }\n            }\n        },\n            {\n                showError(\"Failed to fetch bank account. Please try again\")\n                it.printStackTrace()\n            }\n        )");
        C11280b $r6 = getCompositeDisposable();
        RxExtKt.addTo($r5, $r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public /* bridge */ /* synthetic */ ViewData initialData() {
        BankAccountViewData $r1 = initialData();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.mvvm.BaseViewModel
    public BankAccountViewData initialData() {
        BankAccountViewData $r1 = new BankAccountViewData(false, null, null, null, 15, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void showError(String str) {
        List $r4;
        List $r5;
        ViewData $r2 = getState();
        BankAccountViewData $r3 = (BankAccountViewData) $r2;
        $r4 = C13726r.m3891e();
        $r5 = C13726r.m3891e();
        publish($r3.copy(false, str, $r4, $r5));
    }
}
