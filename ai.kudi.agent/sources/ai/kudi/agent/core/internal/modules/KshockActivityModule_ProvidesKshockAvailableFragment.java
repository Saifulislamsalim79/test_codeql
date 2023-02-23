package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.kshock.p009ui.views.KShockAvailableFragment;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class KshockActivityModule_ProvidesKshockAvailableFragment {

    /* loaded from: classes.dex */
    public interface KShockAvailableFragmentSubcomponent extends b<KShockAvailableFragment> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<KShockAvailableFragment> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private KshockActivityModule_ProvidesKshockAvailableFragment() {
    }

    abstract b$a bindAndroidInjectorFactory(KShockAvailableFragmentSubcomponent.Factory factory);
}
