package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.savings.p024ui.CreateSavingPinFragment;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class SavingsModule_ProvidesCreateSavingPinFragment {

    /* loaded from: classes.dex */
    public interface CreateSavingPinFragmentSubcomponent extends b<CreateSavingPinFragment> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<CreateSavingPinFragment> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private SavingsModule_ProvidesCreateSavingPinFragment() {
    }

    abstract b$a bindAndroidInjectorFactory(CreateSavingPinFragmentSubcomponent.Factory factory);
}
