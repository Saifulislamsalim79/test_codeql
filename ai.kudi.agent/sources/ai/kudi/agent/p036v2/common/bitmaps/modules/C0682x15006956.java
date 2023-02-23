package ai.kudi.agent.p036v2.common.bitmaps.modules;

import android.content.Context;
import android.content.SharedPreferences;
import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.v2.common.bitmaps.modules.MarketplaceProductModule_ProvidesDeviceSecuritySharedPrefsFactory */
/* loaded from: classes.dex */
public final class C0682x15006956 implements InterfaceC9468d<SharedPreferences> {
    private final InterfaceC11700a<Context> contextProvider;
    private final MarketplaceProductModule module;

    public C0682x15006956(MarketplaceProductModule marketplaceProductModule, InterfaceC11700a interfaceC11700a) {
        this.module = marketplaceProductModule;
        this.contextProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static C0682x15006956 create(MarketplaceProductModule marketplaceProductModule, InterfaceC11700a interfaceC11700a) {
        C0682x15006956 $r2 = new C0682x15006956(marketplaceProductModule, interfaceC11700a);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SharedPreferences providesDeviceSecuritySharedPrefs(MarketplaceProductModule marketplaceProductModule, Context context) {
        SharedPreferences $r1 = marketplaceProductModule.providesDeviceSecuritySharedPrefs(context);
        C9473g.m14647e($r1);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p472k.p473a.InterfaceC11700a
    public SharedPreferences get() {
        MarketplaceProductModule $r1 = this.module;
        InterfaceC11700a $r2 = this.contextProvider;
        Object $r3 = $r2.get();
        Context $r4 = (Context) $r3;
        SharedPreferences $r5 = providesDeviceSecuritySharedPrefs($r1, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p472k.p473a.InterfaceC11700a
    public /* bridge */ /* synthetic */ Object get() {
        SharedPreferences $r1 = get();
        return $r1;
    }
}
