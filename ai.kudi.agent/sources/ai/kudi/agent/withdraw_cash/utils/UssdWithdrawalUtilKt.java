package ai.kudi.agent.withdraw_cash.utils;

import ai.kudi.agent.core.domain.room_entities.UssdWithdrawalProvider;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: UssdWithdrawalUtil.kt */
@Metadata(m10422d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0003*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u0015\u0010\u0007\u001a\u00020\u0003*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006\"\u0015\u0010\t\u001a\u00020\u0003*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006¨\u0006\u000b"}, m10421d2 = {"USSD_PROVIDER_KUDI_SAVE", "", "canShowPromptOnVoucherInput", "", "Lai/kudi/agent/core/domain/room_entities/UssdWithdrawalProvider;", "getCanShowPromptOnVoucherInput", "(Lai/kudi/agent/core/domain/room_entities/UssdWithdrawalProvider;)Z", "requiresVoucherCodeInput", "getRequiresVoucherCodeInput", "showWarningText", "getShowWarningText", "app_release"}, k = 2, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class UssdWithdrawalUtilKt {
    public static final String USSD_PROVIDER_KUDI_SAVE = "000";

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final boolean getCanShowPromptOnVoucherInput(UssdWithdrawalProvider ussdWithdrawalProvider) {
        Log_OC.getArray(ussdWithdrawalProvider, "<this>");
        String $r1 = ussdWithdrawalProvider.getProcessor();
        UssdWithdrawalProcessor $r2 = UssdWithdrawalProcessor.KUDI_SAVE;
        String $r3 = $r2.toString();
        boolean $z0 = Log_OC.append($r1, $r3);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final boolean getRequiresVoucherCodeInput(UssdWithdrawalProvider ussdWithdrawalProvider) {
        Log_OC.getArray(ussdWithdrawalProvider, "<this>");
        String $r1 = ussdWithdrawalProvider.getProcessor();
        UssdWithdrawalProcessor $r2 = UssdWithdrawalProcessor.KUDI_SAVE;
        String $r3 = $r2.toString();
        boolean $z0 = Log_OC.append($r1, $r3);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static final boolean getShowWarningText(UssdWithdrawalProvider ussdWithdrawalProvider) {
        Log_OC.getArray(ussdWithdrawalProvider, "<this>");
        String $r1 = ussdWithdrawalProvider.getBankCode();
        boolean $z0 = Log_OC.append($r1, USSD_PROVIDER_KUDI_SAVE);
        return !$z0;
    }
}
