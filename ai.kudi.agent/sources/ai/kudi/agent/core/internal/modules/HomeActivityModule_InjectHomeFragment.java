package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.bills.p002ui.HomeFragment;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class HomeActivityModule_InjectHomeFragment {

    /* loaded from: classes.dex */
    public interface HomeFragmentSubcomponent extends b<HomeFragment> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<HomeFragment> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private HomeActivityModule_InjectHomeFragment() {
    }

    abstract b$a bindAndroidInjectorFactory(HomeFragmentSubcomponent.Factory factory);
}
