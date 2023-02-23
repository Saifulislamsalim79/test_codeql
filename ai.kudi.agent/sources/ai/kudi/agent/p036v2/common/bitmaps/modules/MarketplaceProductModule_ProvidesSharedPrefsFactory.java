package ai.kudi.agent.p036v2.common.bitmaps.modules;

import android.content.Context;
import android.content.SharedPreferences;
import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* renamed from: ai.kudi.agent.v2.common.bitmaps.modules.MarketplaceProductModule_ProvidesSharedPrefsFactory */
/* loaded from: classes.dex */
public final class MarketplaceProductModule_ProvidesSharedPrefsFactory implements InterfaceC9468d<SharedPreferences> {
    private final InterfaceC11700a<Context> contextProvider;
    private final MarketplaceProductModule module;
    private final InterfaceC11700a<String> prefsNameProvider;

    public MarketplaceProductModule_ProvidesSharedPrefsFactory(MarketplaceProductModule marketplaceProductModule, InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        this.module = marketplaceProductModule;
        this.prefsNameProvider = interfaceC11700a;
        this.contextProvider = interfaceC11700a2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static MarketplaceProductModule_ProvidesSharedPrefsFactory create(MarketplaceProductModule marketplaceProductModule, InterfaceC11700a interfaceC11700a, InterfaceC11700a interfaceC11700a2) {
        MarketplaceProductModule_ProvidesSharedPrefsFactory $r3 = new MarketplaceProductModule_ProvidesSharedPrefsFactory(marketplaceProductModule, interfaceC11700a, interfaceC11700a2);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static SharedPreferences providesSharedPrefs(MarketplaceProductModule marketplaceProductModule, String str, Context context) {
        SharedPreferences $r2 = marketplaceProductModule.providesSharedPrefs(str, context);
        C9473g.m14647e($r2);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p472k.p473a.InterfaceC11700a
    public SharedPreferences get() {
        MarketplaceProductModule $r1 = this.module;
        InterfaceC11700a $r2 = this.prefsNameProvider;
        Object $r3 = $r2.get();
        String $r4 = (String) $r3;
        InterfaceC11700a $r22 = this.contextProvider;
        Object $r32 = $r22.get();
        Context $r5 = (Context) $r32;
        SharedPreferences $r6 = providesSharedPrefs($r1, $r4, $r5);
        return $r6;
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
