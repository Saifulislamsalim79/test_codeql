package ai.kudi.agent.pos.usecases;

import ai.kudi.agent.login.domain.LoginParams;
import ai.kudi.agent.settings.dataSource.KycLevelRemoteDataSource;
import ai.kudi.agent.transactions.utils.ReferrerTypes;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: GetIsSuperAgentOrAggregator.kt */
@Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m10421d2 = {"Lai/kudi/agent/pos/usecases/GetIsSuperAgentOrAggregator;", "", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "execute", "", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class GetIsSuperAgentOrAggregator {
    private final SharedPreferences sharedPreferences;

    public GetIsSuperAgentOrAggregator(SharedPreferences sharedPreferences) {
        Log_OC.getArray(sharedPreferences, "sharedPreferences");
        this.sharedPreferences = sharedPreferences;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final boolean execute() {
        SharedPreferences $r1 = this.sharedPreferences;
        String $r2 = $r1.getString(LoginParams.REFERRER_TYPE, KycLevelRemoteDataSource.NONE);
        ReferrerTypes $r3 = ReferrerTypes.SUPER_AGENT;
        String $r4 = $r3.name();
        boolean $z0 = Log_OC.append($r2, $r4);
        if ($z0) {
            return true;
        }
        ReferrerTypes $r32 = ReferrerTypes.AGGREGATOR;
        String $r42 = $r32.name();
        boolean $z02 = Log_OC.append($r2, $r42);
        if ($z02) {
            return true;
        }
        ReferrerTypes $r33 = ReferrerTypes.SUPER_AGGREGATOR;
        String $r43 = $r33.name();
        boolean $z03 = Log_OC.append($r2, $r43);
        if ($z03) {
            return true;
        }
        ReferrerTypes $r34 = ReferrerTypes.CHIEF_AGGREGATOR_OFFICER;
        String $r44 = $r34.name();
        boolean $z04 = Log_OC.append($r2, $r44);
        return $z04;
    }
}
