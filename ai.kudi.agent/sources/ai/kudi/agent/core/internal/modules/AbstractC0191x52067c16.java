package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.kshock.p009ui.views.KShockNotAvailableInLocationFragment;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* renamed from: ai.kudi.agent.core.internal.modules.KshockActivityModule_ProvidesKshockNotAvailableInLocationFragment */
/* loaded from: classes.dex */
public abstract class AbstractC0191x52067c16 {

    /* renamed from: ai.kudi.agent.core.internal.modules.KshockActivityModule_ProvidesKshockNotAvailableInLocationFragment$KShockNotAvailableInLocationFragmentSubcomponent */
    /* loaded from: classes.dex */
    public interface KShockNotAvailableInLocationFragmentSubcomponent extends b<KShockNotAvailableInLocationFragment> {

        /* renamed from: ai.kudi.agent.core.internal.modules.KshockActivityModule_ProvidesKshockNotAvailableInLocationFragment$KShockNotAvailableInLocationFragmentSubcomponent$Factory */
        /* loaded from: classes.dex */
        public interface Factory extends b$a<KShockNotAvailableInLocationFragment> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private AbstractC0191x52067c16() {
    }

    abstract b$a bindAndroidInjectorFactory(KShockNotAvailableInLocationFragmentSubcomponent.Factory factory);
}
