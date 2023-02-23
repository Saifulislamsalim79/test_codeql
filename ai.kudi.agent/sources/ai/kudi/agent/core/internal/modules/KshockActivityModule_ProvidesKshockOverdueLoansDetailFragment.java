package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.kshock.p009ui.views.KshockOverdueLoansDetailFragment;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class KshockActivityModule_ProvidesKshockOverdueLoansDetailFragment {

    /* loaded from: classes.dex */
    public interface KshockOverdueLoansDetailFragmentSubcomponent extends b<KshockOverdueLoansDetailFragment> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<KshockOverdueLoansDetailFragment> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private KshockActivityModule_ProvidesKshockOverdueLoansDetailFragment() {
    }

    abstract b$a bindAndroidInjectorFactory(KshockOverdueLoansDetailFragmentSubcomponent.Factory factory);
}
