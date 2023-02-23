package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.home.BvnHomeUpdateFragment;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class HomeActivityModule_InjectBvnVerificationFragment {

    /* loaded from: classes.dex */
    public interface BvnHomeUpdateFragmentSubcomponent extends b<BvnHomeUpdateFragment> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<BvnHomeUpdateFragment> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private HomeActivityModule_InjectBvnVerificationFragment() {
    }

    abstract b$a bindAndroidInjectorFactory(BvnHomeUpdateFragmentSubcomponent.Factory factory);
}
