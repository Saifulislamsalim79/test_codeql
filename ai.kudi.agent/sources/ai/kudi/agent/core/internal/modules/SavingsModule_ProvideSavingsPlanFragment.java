package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.savings.p024ui.SavingsPlanFragment;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class SavingsModule_ProvideSavingsPlanFragment {

    /* loaded from: classes.dex */
    public interface SavingsPlanFragmentSubcomponent extends b<SavingsPlanFragment> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<SavingsPlanFragment> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private SavingsModule_ProvideSavingsPlanFragment() {
    }

    abstract b$a bindAndroidInjectorFactory(SavingsPlanFragmentSubcomponent.Factory factory);
}
