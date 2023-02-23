package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.dashboard.ui.DashboardFragment;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class HomeActivityModule_InjectDashboardFragment {

    /* loaded from: classes.dex */
    public interface DashboardFragmentSubcomponent extends b<DashboardFragment> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<DashboardFragment> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private HomeActivityModule_InjectDashboardFragment() {
    }

    abstract b$a bindAndroidInjectorFactory(DashboardFragmentSubcomponent.Factory factory);
}
