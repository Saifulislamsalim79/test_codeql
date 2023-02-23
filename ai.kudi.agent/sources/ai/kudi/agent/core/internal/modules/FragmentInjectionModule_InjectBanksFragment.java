package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.banks.p001ui.BanksFragment;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class FragmentInjectionModule_InjectBanksFragment {

    /* loaded from: classes.dex */
    public interface BanksFragmentSubcomponent extends b<BanksFragment> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<BanksFragment> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private FragmentInjectionModule_InjectBanksFragment() {
    }

    abstract b$a bindAndroidInjectorFactory(BanksFragmentSubcomponent.Factory factory);
}
