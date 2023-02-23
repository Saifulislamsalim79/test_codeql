package ai.kudi.agent.core.internal.modules;

import ai.kudi.agent.issues.p008ui.PosTerminalIssuesFragment;
import dagger.android.Registry;
import dagger.android.b;
import dagger.android.b$a;
/* loaded from: classes.dex */
public abstract class IssueActivityModule_InjectPosTerminalIssuesFragment {

    /* loaded from: classes.dex */
    public interface PosTerminalIssuesFragmentSubcomponent extends b<PosTerminalIssuesFragment> {

        /* loaded from: classes.dex */
        public interface Factory extends b$a<PosTerminalIssuesFragment> {
            /* synthetic */ Registry create(Object obj);
        }

        /* synthetic */ void inject(Object obj);
    }

    private IssueActivityModule_InjectPosTerminalIssuesFragment() {
    }

    abstract b$a bindAndroidInjectorFactory(PosTerminalIssuesFragmentSubcomponent.Factory factory);
}
