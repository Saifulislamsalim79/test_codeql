package ai.kudi.agent.settings.p029ui.viewModels;

import ai.kudi.agent.core.analytics.Analytics;
import ai.kudi.agent.register.domain.usecases.BaseOtpUtil;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.settings.ui.viewModels.SettingsDetailsViewModel_Factory */
/* loaded from: classes.dex */
public final class SettingsDetailsViewModel_Factory implements InterfaceC9468d<SettingsDetailsViewModel> {
    private final InterfaceC11700a<Analytics> analyticsProvider;
    private final InterfaceC11700a<BaseOtpUtil> baseOtpUtilProvider;

    public SettingsDetailsViewModel_Factory(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.analyticsProvider = interfaceC11700a;
        this.baseOtpUtilProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SettingsDetailsViewModel_Factory create(InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        SettingsDetailsViewModel_Factory $r2 = new SettingsDetailsViewModel_Factory(interfaceC11700a, interfaceC11700a2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SettingsDetailsViewModel newInstance(Analytics analytics, BaseOtpUtil baseOtpUtil) {
        SettingsDetailsViewModel $r2 = new SettingsDetailsViewModel(analytics, baseOtpUtil);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public SettingsDetailsViewModel multiply() {
        InterfaceC11700a $r1 = this.analyticsProvider;
        Object $r2 = $r1.get();
        Analytics $r3 = (Analytics) $r2;
        InterfaceC11700a $r12 = this.baseOtpUtilProvider;
        Object $r22 = $r12.get();
        BaseOtpUtil $r4 = (BaseOtpUtil) $r22;
        SettingsDetailsViewModel $r5 = newInstance($r3, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: multiply  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m40921multiply() {
        SettingsDetailsViewModel $r1 = multiply();
        return $r1;
    }
}
