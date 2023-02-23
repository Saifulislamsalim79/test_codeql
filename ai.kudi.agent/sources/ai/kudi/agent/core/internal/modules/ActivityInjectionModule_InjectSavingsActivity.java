package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.savings.p024ui.SavingsActivity;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class ActivityInjectionModule_InjectSavingsActivity {

    /* loaded from: classes.dex */
    public interface SavingsActivitySubcomponent extends b<SavingsActivity> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<SavingsActivity> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private ActivityInjectionModule_InjectSavingsActivity() {
    }

    abstract b$a bindAndroidInjectorFactory(SavingsActivitySubcomponent.Factory factory);
}
