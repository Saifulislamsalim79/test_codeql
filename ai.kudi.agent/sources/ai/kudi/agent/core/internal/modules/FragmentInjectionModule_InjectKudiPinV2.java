package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.pin.KudiPin;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class FragmentInjectionModule_InjectKudiPinV2 {

    /* loaded from: classes.dex */
    public interface KudiPinSubcomponent extends b<KudiPin> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<KudiPin> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private FragmentInjectionModule_InjectKudiPinV2() {
    }

    abstract b$a bindAndroidInjectorFactory(KudiPinSubcomponent.Factory factory);
}
