package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.kshock.p009ui.views.KshockExistingLoanerFragment;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class KshockActivityModule_ProvidesExistingLoanerFragment {

    /* loaded from: classes.dex */
    public interface KshockExistingLoanerFragmentSubcomponent extends b<KshockExistingLoanerFragment> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<KshockExistingLoanerFragment> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private KshockActivityModule_ProvidesExistingLoanerFragment() {
    }

    abstract b$a bindAndroidInjectorFactory(KshockExistingLoanerFragmentSubcomponent.Factory factory);
}
