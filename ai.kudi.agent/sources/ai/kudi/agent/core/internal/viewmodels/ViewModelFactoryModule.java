package ai.kudi.agent.core.internal.viewmodels;

import androidx.lifecycle.C1556g0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: ViewModelFactoryModule.kt */
@Metadata(m10422d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J3\u0010\u0003\u001a\u00020\u00042)\u0010\u0005\u001a%\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\b0\t¢\u0006\u0002\b\n0\u0006j\u0002`\u000bH\u0007¨\u0006\f"}, m10421d2 = {"Lai/kudi/agent/core/di/viewmodels/ViewModelFactoryModule;", "", "()V", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "viewModelCreators", "", "Ljava/lang/Class;", "Landroidx/lifecycle/ViewModel;", "Ljavax/inject/Provider;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lai/kudi/agent/core/di/viewmodels/ViewModelCreators;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ViewModelFactoryModule {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C1556g0.InterfaceC1559b viewModelFactory(Map map) {
        Log_OC.getArray(map, "viewModelCreators");
        DaggerViewModelFactory $r2 = new DaggerViewModelFactory(map);
        return $r2;
    }
}
