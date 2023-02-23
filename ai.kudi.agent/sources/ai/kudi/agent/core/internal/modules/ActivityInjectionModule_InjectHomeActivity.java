package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.home.HomeActivity;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class ActivityInjectionModule_InjectHomeActivity {

    /* loaded from: classes.dex */
    public interface HomeActivitySubcomponent extends b<HomeActivity> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<HomeActivity> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private ActivityInjectionModule_InjectHomeActivity() {
    }

    abstract b$a bindAndroidInjectorFactory(HomeActivitySubcomponent.Factory factory);
}
