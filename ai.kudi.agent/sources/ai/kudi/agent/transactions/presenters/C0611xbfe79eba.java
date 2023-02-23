package ai.kudi.agent.transactions.presenters;

import ai.kudi.agent.transactions.views.TransactionDetailsView;
import ai.kudi.agent.users.domain.package_1.User;
import com.google.firebase.database.C5611c;
import com.google.firebase.database.InterfaceC5627o;
import java.util.Date;
import kotlin.Metadata;
import kotlin.p483e0.p485d.C11810u;
import kotlin.p483e0.p485d.Log_OC;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: TransactionDetailsPresenter.kt */
@Metadata(m10422d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m10421d2 = {"ai/kudi/agent/transactions/presenters/TransactionDetailsPresenter$isUserAllowedToAccessFeature$disposable$1$1", "Lcom/google/firebase/database/ValueEventListener;", "onCancelled", "", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "Lcom/google/firebase/database/DatabaseError;", "onDataChange", "dataSnapshot", "Lcom/google/firebase/database/DataSnapshot;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.transactions.presenters.TransactionDetailsPresenter$isUserAllowedToAccessFeature$disposable$1$1 */
/* loaded from: classes.dex */
public final class C0611xbfe79eba implements InterfaceC5627o {
    final /* synthetic */ C11810u $allow;
    final /* synthetic */ String $allowAll;
    final /* synthetic */ String $customer;
    final /* synthetic */ C11810u $isDateAllowed;
    final /* synthetic */ Date $transactionTime;
    final /* synthetic */ String $transactionType;
    final /* synthetic */ String $trxStatus;
    final /* synthetic */ User $user;
    final /* synthetic */ TransactionDetailsPresenter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0611xbfe79eba(TransactionDetailsPresenter transactionDetailsPresenter, C11810u c11810u, Date date, C11810u c11810u2, String str, User user, String str2, String str3, String str4) {
        this.this$0 = transactionDetailsPresenter;
        this.$isDateAllowed = c11810u;
        this.$transactionTime = date;
        this.$allow = c11810u2;
        this.$allowAll = str;
        this.$user = user;
        this.$customer = str2;
        this.$trxStatus = str3;
        this.$transactionType = str4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCancelled$lambda-0  reason: not valid java name */
    public static final void m41202onCancelled$lambda0(TransactionDetailsView transactionDetailsView) {
        Log_OC.getArray(transactionDetailsView, "it");
        transactionDetailsView.hideAddCustomerButton();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onDataChange$lambda-1  reason: not valid java name */
    public static final void m41203onDataChange$lambda1(TransactionDetailsView transactionDetailsView) {
        Log_OC.getArray(transactionDetailsView, "it");
        transactionDetailsView.showAddCustomerButton();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onDataChange$lambda-2  reason: not valid java name */
    public static final void m41204onDataChange$lambda2(TransactionDetailsView transactionDetailsView) {
        Log_OC.getArray(transactionDetailsView, "it");
        transactionDetailsView.hideAddCustomerButton();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onDataChange$lambda-3  reason: not valid java name */
    public static final void m41205onDataChange$lambda3(TransactionDetailsView transactionDetailsView) {
        Log_OC.getArray(transactionDetailsView, "it");
        transactionDetailsView.hideAddCustomerButton();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.google.firebase.database.InterfaceC5627o
    public void onCancelled(C5611c c5611c) {
        Log_OC.getArray(c5611c, IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
        TransactionDetailsPresenter $r2 = this.this$0;
        Connection $r3 = Connection.sInstance;
        $r2.ifViewAttached($r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007c A[Catch: Exception -> 0x019d, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x019d, blocks: (B:3:0x0007, B:6:0x0013, B:9:0x001d, B:18:0x0039, B:20:0x0047, B:13:0x002b, B:25:0x0052, B:28:0x005e, B:38:0x007c, B:53:0x00c7, B:56:0x00d3, B:66:0x00f1, B:71:0x0107, B:61:0x00e7, B:43:0x0094, B:33:0x0072, B:86:0x0131, B:92:0x013f, B:97:0x0154, B:99:0x0166, B:100:0x016b, B:103:0x017b, B:106:0x018b, B:109:0x0195), top: B:114:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c7 A[Catch: Exception -> 0x019d, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x019d, blocks: (B:3:0x0007, B:6:0x0013, B:9:0x001d, B:18:0x0039, B:20:0x0047, B:13:0x002b, B:25:0x0052, B:28:0x005e, B:38:0x007c, B:53:0x00c7, B:56:0x00d3, B:66:0x00f1, B:71:0x0107, B:61:0x00e7, B:43:0x0094, B:33:0x0072, B:86:0x0131, B:92:0x013f, B:97:0x0154, B:99:0x0166, B:100:0x016b, B:103:0x017b, B:106:0x018b, B:109:0x0195), top: B:114:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f1 A[Catch: Exception -> 0x019d, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x019d, blocks: (B:3:0x0007, B:6:0x0013, B:9:0x001d, B:18:0x0039, B:20:0x0047, B:13:0x002b, B:25:0x0052, B:28:0x005e, B:38:0x007c, B:53:0x00c7, B:56:0x00d3, B:66:0x00f1, B:71:0x0107, B:61:0x00e7, B:43:0x0094, B:33:0x0072, B:86:0x0131, B:92:0x013f, B:97:0x0154, B:99:0x0166, B:100:0x016b, B:103:0x017b, B:106:0x018b, B:109:0x0195), top: B:114:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0116  */
    @Override // com.google.firebase.database.InterfaceC5627o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDataChange(com.google.firebase.database.C5608b r32) {
        /*
            Method dump skipped, instructions count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.transactions.presenters.C0611xbfe79eba.onDataChange(com.google.firebase.database.b):void");
    }
}
