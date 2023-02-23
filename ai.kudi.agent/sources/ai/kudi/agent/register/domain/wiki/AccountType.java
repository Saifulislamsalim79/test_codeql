package ai.kudi.agent.register.domain.wiki;

import ai.kudi.agent.home.HomeActivity;
import ai.kudi.agent.outlet_mgt.data.ConstKt;
import ai.kudi.agent.settings.dataSource.KycLevelRemoteDataSource;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RegistrationInfo.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m10421d2 = {"Lai/kudi/agent/register/domain/dto/AccountType;", "", "(Ljava/lang/String;I)V", ConstKt.OUTLET_PERSONAL, "AGENT", KycLevelRemoteDataSource.NONE, HomeActivity.MERCHANT, "MERCHANT_AGENT", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class AccountType {
    private static final /* synthetic */ AccountType[] $VALUES;
    public static final AccountType AGENT;
    public static final AccountType MERCHANT;
    public static final AccountType MERCHANT_AGENT;
    public static final AccountType NONE;
    public static final AccountType PERSONAL;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    private static final /* synthetic */ AccountType[] $values() {
        AccountType $r1 = PERSONAL;
        AccountType $r12 = AGENT;
        AccountType $r13 = NONE;
        AccountType $r14 = MERCHANT;
        AccountType $r15 = MERCHANT_AGENT;
        AccountType[] $r0 = {$r1, $r12, $r13, $r14, $r15};
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    static {
        AccountType $r1 = new AccountType(ConstKt.OUTLET_PERSONAL, 0);
        PERSONAL = $r1;
        AccountType $r12 = new AccountType("AGENT", 1);
        AGENT = $r12;
        AccountType $r13 = new AccountType(KycLevelRemoteDataSource.NONE, 2);
        NONE = $r13;
        AccountType $r14 = new AccountType(HomeActivity.MERCHANT, 3);
        MERCHANT = $r14;
        AccountType $r15 = new AccountType("MERCHANT_AGENT", 4);
        MERCHANT_AGENT = $r15;
        AccountType[] $r0 = $values();
        $VALUES = $r0;
    }

    private AccountType(String str, int i) {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static AccountType valueOf(String str) {
        Enum $r0 = Enum.valueOf(ai.kudi.agent.register.domain.dto.AccountType.class, str);
        AccountType $r2 = (AccountType) $r0;
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static AccountType[] values() {
        AccountType[] $r1 = $VALUES;
        Object $r0 = $r1.clone();
        AccountType[] $r12 = (AccountType[]) $r0;
        return $r12;
    }
}
