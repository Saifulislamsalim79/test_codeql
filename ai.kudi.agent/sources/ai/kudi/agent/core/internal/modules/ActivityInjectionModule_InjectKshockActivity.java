package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.kshock.p009ui.KShockActivity;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class ActivityInjectionModule_InjectKshockActivity {

    /* loaded from: classes.dex */
    public interface KShockActivitySubcomponent extends b<KShockActivity> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<KShockActivity> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private ActivityInjectionModule_InjectKshockActivity() {
    }

    abstract b$a bindAndroidInjectorFactory(KShockActivitySubcomponent.Factory factory);
}
