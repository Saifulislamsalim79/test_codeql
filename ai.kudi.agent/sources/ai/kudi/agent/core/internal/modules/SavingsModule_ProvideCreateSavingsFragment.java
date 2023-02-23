package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.savings.p024ui.CreateSavingsFragment;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class SavingsModule_ProvideCreateSavingsFragment {

    /* loaded from: classes.dex */
    public interface CreateSavingsFragmentSubcomponent extends b<CreateSavingsFragment> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<CreateSavingsFragment> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private SavingsModule_ProvideCreateSavingsFragment() {
    }

    abstract b$a bindAndroidInjectorFactory(CreateSavingsFragmentSubcomponent.Factory factory);
}
