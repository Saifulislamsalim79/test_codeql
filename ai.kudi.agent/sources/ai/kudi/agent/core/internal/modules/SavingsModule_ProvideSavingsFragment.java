package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.savings.p024ui.SavingsFragment;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class SavingsModule_ProvideSavingsFragment {

    /* loaded from: classes.dex */
    public interface SavingsFragmentSubcomponent extends b<SavingsFragment> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<SavingsFragment> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private SavingsModule_ProvideSavingsFragment() {
    }

    abstract b$a bindAndroidInjectorFactory(SavingsFragmentSubcomponent.Factory factory);
}
