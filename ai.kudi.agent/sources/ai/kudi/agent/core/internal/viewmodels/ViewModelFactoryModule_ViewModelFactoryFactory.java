package ai.kudi.agent.core.internal.viewmodels;

import androidx.lifecycle.C1556g0;
import androidx.lifecycle.d0;
import java.util.Map;
import p382i.p383b.C9473g;
import p382i.p383b.InterfaceC9468d;
import p472k.p473a.InterfaceC11700a;
/* loaded from: classes.dex */
public final class ViewModelFactoryModule_ViewModelFactoryFactory implements InterfaceC9468d<C1556g0.InterfaceC1559b> {
    private final ViewModelFactoryModule module;
    private final InterfaceC11700a<Map<Class<? extends d0>, InterfaceC11700a<d0>>> viewModelCreatorsProvider;

    public ViewModelFactoryModule_ViewModelFactoryFactory(ViewModelFactoryModule viewModelFactoryModule, InterfaceC11700a interfaceC11700a) {
        this.module = viewModelFactoryModule;
        this.viewModelCreatorsProvider = interfaceC11700a;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static ViewModelFactoryModule_ViewModelFactoryFactory create(ViewModelFactoryModule viewModelFactoryModule, InterfaceC11700a interfaceC11700a) {
        ViewModelFactoryModule_ViewModelFactoryFactory $r2 = new ViewModelFactoryModule_ViewModelFactoryFactory(viewModelFactoryModule, interfaceC11700a);
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static C1556g0.InterfaceC1559b viewModelFactory(ViewModelFactoryModule viewModelFactoryModule, Map map) {
        C1556g0.InterfaceC1559b $r1 = viewModelFactoryModule.viewModelFactory(map);
        C9473g.m14647e($r1);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public C1556g0.InterfaceC1559b setValue() {
        ViewModelFactoryModule $r1 = this.module;
        InterfaceC11700a $r2 = this.viewModelCreatorsProvider;
        Object $r3 = $r2.get();
        Map $r4 = (Map) $r3;
        C1556g0.InterfaceC1559b $r5 = viewModelFactory($r1, $r4);
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: setValue  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m39151setValue() {
        C1556g0.InterfaceC1559b $r1 = setValue();
        return $r1;
    }
}
