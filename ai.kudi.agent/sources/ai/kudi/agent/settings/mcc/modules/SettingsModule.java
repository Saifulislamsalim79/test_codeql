package ai.kudi.agent.settings.mcc.modules;

import ai.kudi.agent.settings.navigators.SettingsNavigator;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: SettingsModule.kt */
@Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/settings/di/modules/SettingsModule;", "", "settingsNavigator", "Lai/kudi/agent/settings/navigators/SettingsNavigator;", "(Lai/kudi/agent/settings/navigators/SettingsNavigator;)V", "providesSettingsNavigator", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SettingsModule {
    private final SettingsNavigator settingsNavigator;

    public SettingsModule(SettingsNavigator settingsNavigator) {
        Log_OC.getArray(settingsNavigator, "settingsNavigator");
        this.settingsNavigator = settingsNavigator;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final SettingsNavigator providesSettingsNavigator() {
        SettingsNavigator r1 = this.settingsNavigator;
        return r1;
    }
}
