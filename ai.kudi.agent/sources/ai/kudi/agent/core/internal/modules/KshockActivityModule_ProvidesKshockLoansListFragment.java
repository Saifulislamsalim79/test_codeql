package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.kshock.p009ui.views.KshockLoansListFragment;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class KshockActivityModule_ProvidesKshockLoansListFragment {

    /* loaded from: classes.dex */
    public interface KshockLoansListFragmentSubcomponent extends b<KshockLoansListFragment> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<KshockLoansListFragment> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private KshockActivityModule_ProvidesKshockLoansListFragment() {
    }

    abstract b$a bindAndroidInjectorFactory(KshockLoansListFragmentSubcomponent.Factory factory);
}
