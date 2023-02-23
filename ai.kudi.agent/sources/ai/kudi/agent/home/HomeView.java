package ai.kudi.agent.home;

import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import p272h.p364d.p365a.p366c.LoginListener;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: HomeView.kt */
@Metadata(m10422d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u0003H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0005H&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0005H&J\u0016\u0010\u0014\u001a\u00020\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H&J\u0016\u0010\u0018\u001a\u00020\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0016H&J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001dH&J \u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020 2\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\"H&J\u0010\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u001dH&¨\u0006%"}, m10421d2 = {"Lai/kudi/agent/home/HomeView;", "Lcom/hannesdorfmann/mosby3/mvp/MvpView;", "checkTerminalID", "", "terminalId", "", "displayNotificationCount", "count", "", "displayWalletBalance", "balance", "", "fundWalletView", "openPageByType", "type", "setCashInsuranceState", "cashInsuranceState", "Lai/kudi/agent/home/CashInsuranceState;", "showError", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "showMonnifyDetails", "miniMonnifyDetails", "", "Lai/kudi/agent/wallettopup/data/MiniMonnifyDetails;", "showTodoList", "todoList", "Lai/kudi/agent/postRegistrationSetUp/adapter/TodoItem;", "showTodoLoading", "isLoading", "", "showVerifyPrompt", "result", "Lai/kudi/agent/home/VerifyStateResult;", "buttonClickListener", "Lkotlin/Function0;", "toggleKCashFeature", "isVisible", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface HomeView extends LoginListener {

    /* compiled from: HomeView.kt */
    @Metadata(k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        public static /* synthetic */ void showVerifyPrompt$default(HomeView homeView, VerifyStateResult verifyStateResult, InterfaceC11756a interfaceC11756a, int i, Object obj) {
            if (obj != null) {
                UnsupportedOperationException r5 = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showVerifyPrompt");
                throw r5;
            }
            int $i0 = i & 2;
            if ($i0 != 0) {
                interfaceC11756a = HomeView$showVerifyPrompt$1.INSTANCE;
            }
            InterfaceC11756a r6 = interfaceC11756a;
            homeView.showVerifyPrompt(verifyStateResult, r6);
        }
    }

    void checkTerminalID(String str);

    void displayNotificationCount(int i);

    void displayWalletBalance(double d);

    void fundWalletView();

    void openPageByType(String str);

    void setCashInsuranceState(CashInsuranceState cashInsuranceState);

    void showError(String str);

    void showMonnifyDetails(List list);

    void showTodoList(List list);

    void showTodoLoading(boolean z);

    void showVerifyPrompt(VerifyStateResult verifyStateResult, InterfaceC11756a interfaceC11756a);

    void toggleKCashFeature(boolean z);
}
