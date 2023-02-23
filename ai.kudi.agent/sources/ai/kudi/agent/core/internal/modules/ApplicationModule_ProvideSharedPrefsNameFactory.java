package ai.kudi.agent.core.internal.modules;

import android.content.Context;
import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class ApplicationModule_ProvideSharedPrefsNameFactory implements InterfaceC9468d<String> {
    private final InterfaceC11700a<Context> contextProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvideSharedPrefsNameFactory(ApplicationModule applicationModule, InterfaceC11700a interfaceC11700a) {
        this.module = applicationModule;
        this.contextProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ApplicationModule_ProvideSharedPrefsNameFactory create(ApplicationModule applicationModule, InterfaceC11700a interfaceC11700a) {
        ApplicationModule_ProvideSharedPrefsNameFactory $r2 = new ApplicationModule_ProvideSharedPrefsNameFactory(applicationModule, interfaceC11700a);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static String provideSharedPrefsName(ApplicationModule applicationModule, Context context) {
        String $r1 = applicationModule.provideSharedPrefsName(context);
        C9473g.m14647e($r1);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p472k.p473a.InterfaceC11700a
    public /* bridge */ /* synthetic */ Object get() {
        String $r1 = get();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p472k.p473a.InterfaceC11700a
    public String get() {
        ApplicationModule $r1 = this.module;
        InterfaceC11700a $r2 = this.contextProvider;
        Object $r3 = $r2.get();
        Context $r4 = (Context) $r3;
        String $r5 = provideSharedPrefsName($r1, $r4);
        return $r5;
    }
}
