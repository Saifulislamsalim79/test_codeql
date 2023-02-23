package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.core.data.DeviceInformation;
import android.content.SharedPreferences;
import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class ApplicationModule_ProvidesDeviceInfoFactory implements InterfaceC9468d<DeviceInformation> {
    private final ApplicationModule module;
    private final InterfaceC11700a<SharedPreferences> sharedPreferencesProvider;

    public ApplicationModule_ProvidesDeviceInfoFactory(ApplicationModule applicationModule, InterfaceC11700a interfaceC11700a) {
        this.module = applicationModule;
        this.sharedPreferencesProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ApplicationModule_ProvidesDeviceInfoFactory create(ApplicationModule applicationModule, InterfaceC11700a interfaceC11700a) {
        ApplicationModule_ProvidesDeviceInfoFactory $r2 = new ApplicationModule_ProvidesDeviceInfoFactory(applicationModule, interfaceC11700a);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static DeviceInformation providesDeviceInfo(ApplicationModule applicationModule, SharedPreferences sharedPreferences) {
        DeviceInformation $r1 = applicationModule.providesDeviceInfo(sharedPreferences);
        C9473g.m14647e($r1);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public DeviceInformation getStringArray() {
        ApplicationModule $r1 = this.module;
        InterfaceC11700a $r2 = this.sharedPreferencesProvider;
        Object $r3 = $r2.get();
        SharedPreferences $r4 = (SharedPreferences) $r3;
        DeviceInformation $r5 = providesDeviceInfo($r1, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: getStringArray  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39142getStringArray() {
        DeviceInformation $r1 = getStringArray();
        return $r1;
    }
}
