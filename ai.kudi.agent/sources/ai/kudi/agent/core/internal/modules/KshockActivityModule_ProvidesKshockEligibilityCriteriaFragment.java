package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.kshock.p009ui.views.KShockEligibilityCriteriaFragment;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class KshockActivityModule_ProvidesKshockEligibilityCriteriaFragment {

    /* loaded from: classes.dex */
    public interface KShockEligibilityCriteriaFragmentSubcomponent extends b<KShockEligibilityCriteriaFragment> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<KShockEligibilityCriteriaFragment> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private KshockActivityModule_ProvidesKshockEligibilityCriteriaFragment() {
    }

    abstract b$a bindAndroidInjectorFactory(KShockEligibilityCriteriaFragmentSubcomponent.Factory factory);
}
