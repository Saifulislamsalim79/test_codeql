package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.savings.p024ui.PerformActionBottomSheet;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class SavingsModule_ProvidesPerformActionBottomSheet {

    /* loaded from: classes.dex */
    public interface PerformActionBottomSheetSubcomponent extends b<PerformActionBottomSheet> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<PerformActionBottomSheet> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private SavingsModule_ProvidesPerformActionBottomSheet() {
    }

    abstract b$a bindAndroidInjectorFactory(PerformActionBottomSheetSubcomponent.Factory factory);
}
