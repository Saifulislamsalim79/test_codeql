package ai.kudi.agent.transfer.views;

import ai.kudi.agent.core.domain.room_entities.BankAccount;
import ai.kudi.agent.wallettopup.data.BanksWithMethods;
import java.util.ArrayList;
import kotlin.Metadata;
import p272h.p364d.p365a.p366c.LoginListener;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: TransferToBankView.kt */
@Metadata(m10422d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0007H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0007H&J\b\u0010\u000f\u001a\u00020\u0003H&J\b\u0010\u0010\u001a\u00020\u0003H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0012\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u0015H&J*\u0010\u0016\u001a\u00020\u00032\u0016\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00190\u0018j\b\u0012\u0004\u0012\u00020\u0019`\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u0015H&J\u0012\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u0015H&¨\u0006\u001d"}, m10421d2 = {"Lai/kudi/agent/transfer/views/TransferToBankView;", "Lcom/hannesdorfmann/mosby3/mvp/MvpView;", "clearTransferSuggestion", "", "hideAccountNameLoading", "onBankAccountUnavailable", "msg", "", "setAccountDetailViews", "account", "Lai/kudi/agent/core/domain/room_entities/BankAccount;", "showAccountName", BanksWithMethods.ACCOUNT_NAME, "showAccountNameError", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "showAccountNameLoading", "showBankOptions", "showInvalidAccountNoError", "showInvalidBankError", "showTransferItemSection", "show", "", "showTransferLookUpResult", "uniqueAccount", "Ljava/util/ArrayList;", "Lai/kudi/agent/transfer/domain/models/TransactionRecipient;", "Lkotlin/collections/ArrayList;", "transferTnxLoaded", "toggleRecentTrfTxnLoader", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface TransferToBankView extends LoginListener {

    /* compiled from: TransferToBankView.kt */
    @Metadata(k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchDebugInfoByOffset(DebugInfoApplyVisitor.java:106)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:83)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
         */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        public static /* synthetic */ void showTransferItemSection$default(TransferToBankView transferToBankView, boolean $z0, int i, Object obj) {
            if (obj != null) {
                UnsupportedOperationException $r2 = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showTransferItemSection");
                throw $r2;
            }
            int $i0 = i & 1;
            if ($i0 != 0) {
                $z0 = false;
            }
            transferToBankView.showTransferItemSection($z0);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchDebugInfoByOffset(DebugInfoApplyVisitor.java:106)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:83)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
         */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        public static /* synthetic */ void showTransferLookUpResult$default(TransferToBankView transferToBankView, ArrayList arrayList, boolean $z0, int i, Object obj) {
            if (obj != null) {
                UnsupportedOperationException $r3 = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showTransferLookUpResult");
                throw $r3;
            }
            int $i0 = i & 2;
            if ($i0 != 0) {
                $z0 = false;
            }
            transferToBankView.showTransferLookUpResult(arrayList, $z0);
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchDebugInfoByOffset(DebugInfoApplyVisitor.java:106)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:83)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
         */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        public static /* synthetic */ void toggleRecentTrfTxnLoader$default(TransferToBankView transferToBankView, boolean $z0, int i, Object obj) {
            if (obj != null) {
                UnsupportedOperationException $r2 = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toggleRecentTrfTxnLoader");
                throw $r2;
            }
            int $i0 = i & 1;
            if ($i0 != 0) {
                $z0 = false;
            }
            transferToBankView.toggleRecentTrfTxnLoader($z0);
        }
    }

    void clearTransferSuggestion();

    void hideAccountNameLoading();

    void onBankAccountUnavailable(String str);

    void setAccountDetailViews(BankAccount bankAccount);

    void showAccountName(String str);

    void showAccountNameError(String str);

    void showAccountNameLoading();

    void showBankOptions();

    void showInvalidAccountNoError(String str);

    void showInvalidBankError(String str);

    void showTransferItemSection(boolean z);

    void showTransferLookUpResult(ArrayList arrayList, boolean z);

    void toggleRecentTrfTxnLoader(boolean z);
}
