package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.issues.p008ui.PosIssueFragment;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class IssueActivityModule_InjectPosIssueFragment {

    /* loaded from: classes.dex */
    public interface PosIssueFragmentSubcomponent extends b<PosIssueFragment> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<PosIssueFragment> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private IssueActivityModule_InjectPosIssueFragment() {
    }

    abstract b$a bindAndroidInjectorFactory(PosIssueFragmentSubcomponent.Factory factory);
}
