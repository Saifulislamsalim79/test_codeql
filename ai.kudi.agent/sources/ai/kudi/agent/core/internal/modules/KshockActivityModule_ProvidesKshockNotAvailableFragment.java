package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.kshock.p009ui.views.KShockNotAvailableFragment;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class KshockActivityModule_ProvidesKshockNotAvailableFragment {

    /* loaded from: classes.dex */
    public interface KShockNotAvailableFragmentSubcomponent extends b<KShockNotAvailableFragment> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<KShockNotAvailableFragment> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private KshockActivityModule_ProvidesKshockNotAvailableFragment() {
    }

    abstract b$a bindAndroidInjectorFactory(KShockNotAvailableFragmentSubcomponent.Factory factory);
}
