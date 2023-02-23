package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.savings.p024ui.GetStartedFragment;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class SavingsModule_ProvideGetStartedFragment {

    /* loaded from: classes.dex */
    public interface GetStartedFragmentSubcomponent extends b<GetStartedFragment> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<GetStartedFragment> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private SavingsModule_ProvideGetStartedFragment() {
    }

    abstract b$a bindAndroidInjectorFactory(GetStartedFragmentSubcomponent.Factory factory);
}
